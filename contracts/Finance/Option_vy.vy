struct ValidBuyer:
    valid: bool
    executed: bool

INIT_STAKE: constant(uint256) = 10
MIN_STAKE: constant(uint256) = 1
DUMMYADDRESS: constant(address) = 0x0000000000000000000000000000000000000000


remainingFund: public(wei_value) 
strikePrice: public(wei_value) 
owner: address

optionBuyers: public(map(address,ValidBuyer))


@public
@payable
def CashSettle(genuinePrice: wei_value):
    assert self.remainingFund > MIN_STAKE
    assert self.optionBuyers[msg.sender].valid
    assert not self.optionBuyers[msg.sender].executed

    if genuinePrice > self.strikePrice:
        profit: wei_value = self.safeSub(genuinePrice, self.strikePrice)
        send(msg.sender,profit)
        self.optionBuyers[msg.sender].executed = True



@public
@payable
def __init__(_owner: address, _strikePrice: wei_value):
    assert msg.value >= INIT_STAKE 
    self.remainingFund = msg.value
    self.strikePrice = _strikePrice

    if(_owner == DUMMYADDRESS):
        self.owner = msg.sender
    else:
        self.owner = _owner

@private
def safeAdd(a: wei_value, b: wei_value) -> wei_value:
    c: wei_value = a + b
    assert c >= a
    return c

@private 
def safeSub(a: wei_value, b: wei_value) -> wei_value:
    assert b <= a
    return a - b

@private 
def safeDiv(a: wei_value, b: wei_value) -> wei_value:
    assert b <= a
    assert b > 0
    c: wei_value = as_wei_value((a / b),"wei")
        if a == as_wei_value((b * c),"wei") + a % b:
            return c
    return 0

@private 
def safeMul(a: wei_value, b: wei_value) -> wei_value:
    c: wei_value = as_wei_value((a * b),"wei")
    assert a == 0 or as_wei_value((c / a),"wei") == b
    return c


@public
def updateStake(_value: wei_value):
    assert msg.sender == self.owner
    self.strikePrice = _value



@public
@payable
def stakeFund():
    assert msg.sender == self.owner
    self.remainingFund = self.safeAdd(self.remainingFund, msg.value)

@private
def optionPrice(_proposal: wei_value) -> wei_value:
    factor: wei_value = as_wei_value(5,"wei")
    assert _proposal >= self.strikePrice
    return self.safeMul(factor, self.safeSub(self.strikePrice,_proposal))

@public
@payable
def buyOption(_proposal: wei_value):
    assert msg.sender != self.owner
    price: wei_value = self.optionPrice(_proposal)
    assert msg.value >= price
    self.optionBuyers[msg.sender] = ValidBuyer({
        valid: True,
        executed: False
        })



