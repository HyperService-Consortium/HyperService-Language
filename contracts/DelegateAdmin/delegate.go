package delegate

import (
	"bytes"
	"encoding/hex"
	"encoding/json"
	"fmt"
	cmn "github.com/Myriad-Dreamin/NSB/common"
	. "github.com/Myriad-Dreamin/NSB/common/contract_response"
	"github.com/Myriad-Dreamin/NSB/localstorage"
	"github.com/Myriad-Dreamin/NSB/math"
)

var count int = 0

const NIN_PROPOSAL_COUNT = 5;

type Delegate struct {
	env 						*cmn.ContractEnvironment
	totalVotes 					*math.Uint256
	district    				string
	isDelegateVoted 			*localstorage.BytesMap
	isDelegate					*localstorage.BytesMap
	delegate					*localstorage.Int64Map
	addingDelegateProposal		map[string]*localstorage.BytesMap
	removingDelegateProposal 	map[string]*localstorage.BytesMap

}

func (delegate *Delegate) NewContract(_delegates [][]byte, district string, totalVotes *math.Uint256)(*cmn.ContractCallBackInfo){

	delegate.env.Storage.NewBytesMap("isDelegate")
	delegate.env.Storage.NewInt64Map("delegates")
	for i,x:= range _delegates{
		AssertFalse(len(x)==0,"delegate is not null" )
		_=delegate.env.Storage.NewBytesMap("isDelegate").Set(x,[]byte("true"))
		_=delegate.env.Storage.NewInt64Map("delegates").Set(int64(i),x)
		count += 1
	}

	delegate.env.Storage.SetBytes("totalVotes", totalVotes.Bytes())
	delegate.env.Storage.SetString("district", district)

	return &cmn.ContractCallBackInfo{
		CodeResponse: uint32(codeOK),
		Info: fmt.Sprintf(
			"create success , this contract is deploy at %v",
			hex.EncodeToString(delegate.env.ContractAddress),
		),
	}
}

func (delegate *Delegate) Vote() (*cmn.ContractCallBackInfo){
	cher,_:= delegate.env.Storage.NewBytesMap("isDelegate").Get(delegate.env.From)
	AssertTrue(string(cher)=="true", "delegate Only")

	str,_:= delegate.env.Storage.NewBytesMap("isDelegateVoted").Get(delegate.env.From)
	if string(str)== "false"{
		_= delegate.env.Storage.NewBytesMap("isDelegateVoted").Set(delegate.env.From,[]byte("true"))
		totalVotes := math.NewUint256FromBytes(delegate.env.Storage.GetBytes("totalVotes"))
		totalVotes.Add(math.NewUint256FromString("1", 10))
		delegate.env.Storage.SetBytes("totalVotes", totalVotes.Bytes())
	}

	return ExecOK(nil)
}

func (delegate *Delegate) AddDelegate(newDelegate []byte)(*cmn.ContractCallBackInfo){
	cher,_:= delegate.env.Storage.NewBytesMap("isDelegate").Get(delegate.env.From)
	AssertTrue(string(cher)=="true", "delegate Only")

	AssertFalse(len(newDelegate) == 0, "valid new delegate")
	_=delegate.env.Storage.NewBytesMap("addPro").Set(delegate.env.From,[]byte("true"))
	delegate.env.Storage.NewJsonBytesMap("addingDelegateProposal").Set(newDelegate,
		delegate.env.Storage.NewBytesMap("addPro"))
	var vote_count int = 0

	for i:=0; i < count; i++{
		adddelegate,_ := delegate.env.Storage.NewInt64Map("delegates").Get(int64(i))
		addPro,_:=delegate.env.Storage.NewBytesMap("addingDelegateProposal").Get(newDelegate)
		stu := delegate.env.Storage.NewBytesMap("addPro")
		_=json.Unmarshal(addPro,&stu)
		isadd,_:= stu.Get(adddelegate)
		if string(isadd)=="true"{
			vote_count += 1
		}
	}

	if vote_count >= NIN_PROPOSAL_COUNT{
		_=delegate.env.Storage.NewInt64Map("delegates").Set(int64(count), newDelegate)
		count += 1
		_=delegate.env.Storage.NewBytesMap("isDelegate").Set(newDelegate,[]byte("true"))
	}

	return ExecOK(nil)
}

func (delegate *Delegate) RemoveDelegate(removedDelegate []byte)(*cmn.ContractCallBackInfo){
	cher,_:= delegate.env.Storage.NewBytesMap("isDelegate").Get(delegate.env.From)
	AssertTrue(string(cher)=="true", "delegate Only")

	remo,_:= delegate.env.Storage.NewBytesMap("isDelegate").Get(removedDelegate)
	AssertTrue(string(remo)=="true", "removeddelegate Only")

	_=delegate.env.Storage.NewBytesMap("remoPro").Set(delegate.env.From,[]byte("true"))
	delegate.env.Storage.NewJsonBytesMap("addingDelegateProposal").Set(removedDelegate,
		delegate.env.Storage.NewBytesMap("remoPro"))

	var vote_count = 0
	for i:=0; i < count; i++{
		adddelegate,_ := delegate.env.Storage.NewInt64Map("delegates").Get(int64(i))
		remoPro,_:=delegate.env.Storage.NewBytesMap("addingDelegateProposal").Get(removedDelegate)

		stu := delegate.env.Storage.NewBytesMap("remoPrp")
		_=json.Unmarshal(remoPro,&stu)
		isadd,_:= stu.Get(adddelegate)
		if string(isadd)=="true"{
			vote_count += 1
		}
	}
	if vote_count>=NIN_PROPOSAL_COUNT{
		_=delegate.env.Storage.NewBytesMap("isDelegate").Set(removedDelegate,[]byte("false"))
		for i:=0; i < count; i++{
			delegateadd,_:=delegate.env.Storage.NewInt64Map("delegates").Get(int64(i))
			if bytes.Compare(removedDelegate,delegateadd)==0{
				_=delegate.env.Storage.NewInt64Map("delegates").Delete(int64(i))
			}
		}
	}
	count -= 1
	return ExecOK(nil)
}


