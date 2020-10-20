pragma solidity ^0.5.1;

contract Option {
    uint constant public INIT_STAKE = 10 wei;
    uint constant public MIN_STAKE = 1 wei;
    
    uint public remainingFund = 100;
    uint public strikePrice;
    address owner;
    
    struct ValidBuyer {
        bool valid;
        bool executed;
    }

    mapping (address => ValidBuyer) public optionBuyers;
    
    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }
    
    modifier onlyNonOwner() {
        require(msg.sender != owner);
        _;
    }

    modifier enoughStake(uint _value) {
        require(_value >= INIT_STAKE);
        _;
    }
    
    modifier optionAvaiable() {
        require(remainingFund > MIN_STAKE);
        _;
    }
    
    constructor(address _owner, uint _strikePrice) 
        public
        payable
        enoughStake(msg.value)
    {
        remainingFund = msg.value;
        strikePrice = _strikePrice;
        if (_owner == address(0)) {
            owner = msg.sender;
        } else {
            owner = _owner;
        }
    }
    
    function updateStake(uint _value)
        public
        onlyOwner
    {
        strikePrice = _value;
    }
    
    function stakeFund()
        public
        payable
        onlyOwner
    {
        remainingFund = safeAdd(remainingFund, msg.value);
    }
    
    function buyOption(uint _proposal)
        public
        payable
        onlyNonOwner
    {
        uint price = optionPrice(_proposal);
        assert(msg.value >= price);
        optionBuyers[msg.sender] = ValidBuyer(true, false);
    }
    
    function optionPrice(uint _proposal)
        private
        view
        returns(uint)
    {
        uint factor = 5 wei;
        if (_proposal >= strikePrice) {
            return safeMul(factor, safeSub(_proposal, strikePrice));
        }
        return safeMul(factor, safeSub(strikePrice, _proposal));
    }
    
    function CashSettle(uint genuinePrice) 
        public
        optionAvaiable
    {
        require(optionBuyers[msg.sender].valid && !optionBuyers[msg.sender].executed);
        // Only execute the option if it is profitable. 
        if (genuinePrice > strikePrice) {
            uint profit = safeSub(genuinePrice, strikePrice);
            msg.sender.transfer(profit);
            optionBuyers[msg.sender].executed = true;
        }
    }
    
    function safeMul(uint256 a, uint256 b) 
        internal 
        pure 
        returns (uint256 ) 
    {
        uint256 c = a * b;
        assert(a == 0 || c / a == b);
        return c;
    }

    function safeDiv(uint256 a, uint256 b) 
        internal 
        pure 
        returns (uint256 ) 
    {
        assert(b > 0);
        uint256 c = a / b;
        assert(a == b * c + a % b);
        return c;
    }

    function safeSub(uint256 a, uint256 b) 
        internal 
        pure 
        returns (uint256 ) 
    {
        assert(b <= a);
        return a - b;
    }

    function safeAdd(uint256 a, uint256 b) 
        internal 
        pure 
        returns (uint256 ) 
    {
        uint256 c = a + b;
        assert(c >= a);
        return c;
    }
}
