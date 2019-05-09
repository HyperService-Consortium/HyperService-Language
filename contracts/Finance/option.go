package option

import (
	"encoding/hex"
	"encoding/json"
	"fmt"
	cmn "github.com/Myriad-Dreamin/NSB/common"
	. "github.com/Myriad-Dreamin/NSB/common/contract_response"
	"github.com/Myriad-Dreamin/NSB/math"
)

type validBuyer struct {
	Valid    bool `json:"valid"`
	Executed bool `json:"executed"`
}

const INIT_STAKE string = "10"
const MIN_STAKE string = "1"

type Option struct {
	env 			*cmn.ContractEnvironment
	remainingFund 		*math.Uint256
	strikePrice		*math.Uint256
	owner			[]byte
	optionBuyers     	map[string]validBuyer
}

func (option *Option) NewContract(owner []byte, strikePrice *math.Uint256) (*cmn.ContractCallBackInfo) {
	var init_stake = math.NewUint256FromString(INIT_STAKE,10)
	AssertTrue(strikePrice.Comp(init_stake)>=0, "strikePrice should bigger than 10")

	option.env.Storage.SetBytes("remainingFund", option.env.Value.Bytes())
	option.env.Storage.SetBytes("strikePrice", strikePrice.Bytes())

	if len(owner) == 0 {
		option.env.Storage.SetBytes("owner", option.env.From)
	} else {
		option.env.Storage.SetBytes("owner", owner)
	}

	return &cmn.ContractCallBackInfo{
		CodeResponse: uint32(codeOK),
		Info: fmt.Sprintf(
			"create success , this contract is deploy at %v",
			hex.EncodeToString(option.env.ContractAddress),
		),
	}
}


func (option *Option) UpdateStake(value *math.Uint256) (*cmn.ContractCallBackInfo) {
	var add = math.NewUint256FromBytes(option.env.Storage.GetBytes("owner"))
	var ownadd = math.NewUint256FromBytes(option.env.From)
	AssertTrue(add.Comp(ownadd)==0, "only owner allow to call")

	option.env.Storage.SetBytes("strikePrice", value.Bytes())

	return ExecOK(nil)
}

func (option *Option) StakeFund() (*cmn.ContractCallBackInfo) {
	var add = math.NewUint256FromBytes(option.env.Storage.GetBytes("owner"))
	var ownadd = math.NewUint256FromBytes(option.env.From)
	AssertTrue(add.Comp(ownadd)==0, "only owner allow to call")

	remainingFund := math.NewUint256FromBytes(option.env.Storage.GetBytes("remainingFund"))
	checkErr := remainingFund.Add(option.env.Value)
	option.env.Storage.SetBytes("remainingFund", remainingFund.Bytes())
	if checkErr {
		return OverFlowError("remainingFund overflow")
	} else {
		return ExecOK(option.env.Value)
	}
}

func (option *Option) BuyOption(proposal *math.Uint256) (*cmn.ContractCallBackInfo) {
	var add = math.NewUint256FromBytes(option.env.Storage.GetBytes("owner"))
	var ownadd = math.NewUint256FromBytes(option.env.From)
	AssertTrue(add.Comp(ownadd)!=0, "owner is not allow to call")

	var price = option.optionPrice(proposal)

	AssertTrue(option.env.Value.Comp(price) >= 0, "sending value must bigger than price")
	stu := ValidBuyer{true, false}
	bt, err := json.Marshal(stu)
	if err != nil {
		panic(err)
	}
	_=option.env.Storage.NewBytesMap("optionBuyers").Set(option.env.From, bt)

	return ExecOK(nil)
}

func (option *Option) optionPrice(proposal *math.Uint256) *math.Uint256 {
	var factor = math.NewUint256FromString("5", 10)
	var price = math.NewUint256FromBytes(option.env.Storage.GetBytes("strikePrice"))
	if proposal.Comp(price) >= 0 {
		absValue, checkErr := math.SubUint256(proposal, price)
		checkErr = (checkErr || factor.Mul(absValue))
		AssertFalse(checkErr, ArithmeticError("when calculating option price"))
	} else {
		absValue, checkErr := math.SubUint256(price, proposal)
		checkErr = (checkErr || factor.Mul(absValue))
		AssertFalse(checkErr, ArithmeticError("when calculating option price"))
	}
	return factor
}

func (option *Option) CashSettle(genuinePrice *math.Uint256) (*cmn.ContractCallBackInfo){
	var min_stake = math.NewUint256FromString(MIN_STAKE,10)
	var remainingFund = math.NewUint256FromBytes(option.env.Storage.GetBytes("remainingFund"))
	AssertTrue(remainingFund.Comp(min_stake)>=0, "Remaining fund is more than min stake")

	vaildBuyer,_ := option.env.Storage.NewBytesMap("optionBuyers").Get(option.env.From)
	stu := ValidBuyer{}
	_=json.Unmarshal(vaildBuyer,&stu)
	AssertTrue(stu.Valid, "Valid is True")
	AssertFalse(stu.Executed, "Executed is False")

	var price = math.NewUint256FromBytes(option.env.Storage.GetBytes("strikePrice"))
	if genuinePrice.Comp(price)>0{
		profit, checkErr := math.SubUint256(genuinePrice, price)
		AssertFalse(checkErr, ArithmeticError("when calculating option price"))

		stu= ValidBuyer{stu.Valid, true}
		bt, err := json.Marshal(stu)
		if err != nil {
			panic(err)
		}
		_=option.env.Storage.NewBytesMap("optionBuyers").Set(option.env.From, bt)
		return ExecOK(math.NewUint256FromUint256(profit))
	}
	return ExecOK(nil)
}
