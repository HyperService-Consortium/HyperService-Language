// Code generated - DO NOT EDIT.
// This file is a generated binding and any manual changes will be lost.

package main

import (
	"math/big"
	"strings"

	ethereum "github.com/ethereum/go-ethereum"
	"github.com/ethereum/go-ethereum/accounts/abi"
	"github.com/ethereum/go-ethereum/accounts/abi/bind"
	"github.com/ethereum/go-ethereum/common"
	"github.com/ethereum/go-ethereum/core/types"
	"github.com/ethereum/go-ethereum/event"
)

// Reference imports to suppress errors if they are not otherwise used.
var (
	_ = big.NewInt
	_ = strings.NewReader
	_ = ethereum.NotFound
	_ = abi.U256
	_ = bind.Bind
	_ = common.Big1
	_ = types.BloomLookup
	_ = event.NewSubscription
)

// BrokerABI is the input ABI used to generate the binding from.
const BrokerABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"owners\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_removeOwner\",\"type\":\"address\"}],\"name\":\"removeOwner\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"genuineValue\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"address\"}],\"name\":\"isOwner\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"address\"},{\"name\":\"\",\"type\":\"address\"}],\"name\":\"addingOwnerProposal\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"MAX_VALUE_PROPOSAL_COUNT\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"valueProposals\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"requiredOwnerCount\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"address\"},{\"name\":\"\",\"type\":\"address\"}],\"name\":\"removingOwnerProposal\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"getGenuineValue\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_value\",\"type\":\"uint256\"}],\"name\":\"setValueProposal\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_newOwner\",\"type\":\"address\"}],\"name\":\"addOwner\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"uint256\"},{\"name\":\"\",\"type\":\"address\"}],\"name\":\"valueVotes\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"MAX_OWNER_COUNT\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"isSenderAOwner\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"getOwnerCount\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"name\":\"_owners\",\"type\":\"address[]\"},{\"name\":\"_required\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"}]"

// BrokerBin is the compiled bytecode used for deploying new contracts.
const BrokerBin = `0x60806040523480156200001157600080fd5b5060405162000d0c38038062000d0c833981018060405260408110156200003757600080fd5b8101908080516401000000008111156200005057600080fd5b820160208101848111156200006457600080fd5b81518560208202830111640100000000821117156200008257600080fd5b5050602090910151815191935091508160328210620000a057600080fd5b81811115620000ae57600080fd5b80620000b957600080fd5b81620000c457600080fd5b60005b8451811015620001955760016000868381518110620000e257fe5b6020908102919091018101516001600160a01b031682528101919091526040016000205460ff161580156200013e575060006001600160a01b03168582815181106200012a57fe5b60200260200101516001600160a01b031614155b6200014857600080fd5b60018060008784815181106200015a57fe5b6020908102919091018101516001600160a01b03168252810191909152604001600020805460ff1916911515919091179055600101620000c7565b508351620001ab906002906020870190620001b8565b505050600355506200024c565b82805482825590600052602060002090810192821562000210579160200282015b828111156200021057825182546001600160a01b0319166001600160a01b03909116178255602090920191600190910190620001d9565b506200021e92915062000222565b5090565b6200024991905b808211156200021e5780546001600160a01b031916815560010162000229565b90565b610ab0806200025c6000396000f3fe608060405234801561001057600080fd5b50600436106101005760003560e01c806360e2bdbe116100975780639356bce0116100665780639356bce01461028e578063d74f8edd146102ba578063e1568640146102c2578063ef18374a146102ca57610100565b806360e2bdbe14610215578063657106951461024357806367eb4a3c1461024b5780637065cb481461026857610100565b806346aa4f4c116100d357806346aa4f4c146101ba5780634a74db80146101e85780634c305f42146101f0578063560f28ac1461020d57610100565b8063025e7c2714610105578063173825d91461013e5780631ded1471146101665780632f54bf6e14610180575b600080fd5b6101226004803603602081101561011b57600080fd5b50356102d2565b604080516001600160a01b039092168252519081900360200190f35b6101646004803603602081101561015457600080fd5b50356001600160a01b03166102f9565b005b61016e610508565b60408051918252519081900360200190f35b6101a66004803603602081101561019657600080fd5b50356001600160a01b031661050e565b604080519115158252519081900360200190f35b6101a6600480360360408110156101d057600080fd5b506001600160a01b0381358116916020013516610523565b61016e610543565b61016e6004803603602081101561020657600080fd5b5035610548565b61016e610566565b6101a66004803603604081101561022b57600080fd5b506001600160a01b038135811691602001351661056c565b61016e61058c565b6101646004803603602081101561026157600080fd5b503561064e565b6101646004803603602081101561027e57600080fd5b50356001600160a01b031661069a565b6101a6600480360360408110156102a457600080fd5b50803590602001356001600160a01b031661081a565b61016e61083a565b6101a661083f565b61016e610855565b600281815481106102df57fe5b6000918252602090912001546001600160a01b0316905081565b3360008181526001602052604090205460ff1661031557600080fd5b6001600160a01b038216600090815260016020526040902054829060ff1661033c57600080fd5b6001600280549050036003546032821061035557600080fd5b8181111561036257600080fd5b8061036c57600080fd5b8161037657600080fd5b6001600160a01b03851660009081526007602090815260408083203384529091528120805460ff19166001179055805b600254811015610410576000600282815481106103bf57fe5b60009182526020808320909101546001600160a01b038b811684526007835260408085209190921680855292529091205490915060ff16151560011415610407576001909201915b506001016103a6565b506003548110610500576001600160a01b0386166000908152600160205260408120805460ff191690555b6002548110156104ea57866001600160a01b03166002828154811061045c57fe5b6000918252602090912001546001600160a01b031614156104e25760028054600019810190811061048957fe5b600091825260209091200154600280546001600160a01b0390921691839081106104af57fe5b9060005260206000200160006101000a8154816001600160a01b0302191690836001600160a01b031602179055506104ea565b60010161043b565b506002805460001901906104fe9082610a3d565b505b505050505050565b60005481565b60016020526000908152604090205460ff1681565b600660209081526000928352604080842090915290825290205460ff1681565b600581565b6005818154811061055557fe5b600091825260209091200154905081565b60035481565b600760209081526000928352604080842090915290825290205460ff1681565b60008080805b6005548110156106415760008090506000600583815481106105b057fe5b6000918252602080832090910154808352600490915260408220909250905b600254811015610627576000600282815481106105e857fe5b60009182526020808320909101546001600160a01b03168083529085905260409091205490915060ff161561061e576001850194505b506001016105cf565b50858310610636578295508194505b505050600101610592565b5060008190559150505b90565b3360008181526001602052604090205460ff1661066a57600080fd5b6106738261085b565b5060009081526004602090815260408083203384529091529020805460ff19166001179055565b3360008181526001602052604090205460ff166106b657600080fd5b600280549050600101600354603282106106cf57600080fd5b818111156106dc57600080fd5b806106e657600080fd5b816106f057600080fd5b6001600160a01b03841661070357600080fd5b6001600160a01b03841660009081526006602090815260408083203384529091528120805460ff19166001179055805b60025481101561079d5760006002828154811061074c57fe5b60009182526020808320909101546001600160a01b038a811684526006835260408085209190921680855292529091205490915060ff16151560011415610794576001830192505b50600101610733565b506003548110610813576002805460018082019092557f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace0180546001600160a01b0319166001600160a01b0388169081179091556000908152602082905260409020805460ff1916909117905561081385610985565b5050505050565b600460209081526000928352604080842090915290825290205460ff1681565b603281565b3360009081526001602052604090205460ff1690565b60025490565b60005b60055481101561089557816005828154811061087657fe5b9060005260206000200154141561088d5750610982565b60010161085e565b506005805410156108da57600580546001810182556000919091527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db001819055610982565b600060056000815481106108ea57fe5b600091825260209091200154905060015b600554811015610941576005818154811061091257fe5b90600052602060002001546005600183038154811061092d57fe5b6000918252602090912001556001016108fb565b5061094b816109e5565b50600580546001810182556000919091527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db0018190555b50565b60005b6002548110156109e1576000600282815481106109a157fe5b60009182526020808320909101546001600160a01b0386811684526006835260408085209190921684529091529020805460ff1916905550600101610988565b5050565b60005b6002548110156109e157600060028281548110610a0157fe5b60009182526020808320909101548583526004825260408084206001600160a01b03909216845291529020805460ff19169055506001016109e8565b815481835581811115610a6157600083815260209020610a61918101908301610a66565b505050565b61064b91905b80821115610a805760008155600101610a6c565b509056fea165627a7a72305820befce7630402e7164adfb538d9b2dc69ef773986afa729656cffc524ad470fd30029`

// DeployBroker deploys a new Ethereum contract, binding an instance of Broker to it.
func DeployBroker(auth *bind.TransactOpts, backend bind.ContractBackend, _owners []common.Address, _required *big.Int) (common.Address, *types.Transaction, *Broker, error) {
	parsed, err := abi.JSON(strings.NewReader(BrokerABI))
	if err != nil {
		return common.Address{}, nil, nil, err
	}
	address, tx, contract, err := bind.DeployContract(auth, parsed, common.FromHex(BrokerBin), backend, _owners, _required)
	if err != nil {
		return common.Address{}, nil, nil, err
	}
	return address, tx, &Broker{BrokerCaller: BrokerCaller{contract: contract}, BrokerTransactor: BrokerTransactor{contract: contract}, BrokerFilterer: BrokerFilterer{contract: contract}}, nil
}

// Broker is an auto generated Go binding around an Ethereum contract.
type Broker struct {
	BrokerCaller     // Read-only binding to the contract
	BrokerTransactor // Write-only binding to the contract
	BrokerFilterer   // Log filterer for contract events
}

// BrokerCaller is an auto generated read-only Go binding around an Ethereum contract.
type BrokerCaller struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// BrokerTransactor is an auto generated write-only Go binding around an Ethereum contract.
type BrokerTransactor struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// BrokerFilterer is an auto generated log filtering Go binding around an Ethereum contract events.
type BrokerFilterer struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// BrokerSession is an auto generated Go binding around an Ethereum contract,
// with pre-set call and transact options.
type BrokerSession struct {
	Contract     *Broker           // Generic contract binding to set the session for
	CallOpts     bind.CallOpts     // Call options to use throughout this session
	TransactOpts bind.TransactOpts // Transaction auth options to use throughout this session
}

// BrokerCallerSession is an auto generated read-only Go binding around an Ethereum contract,
// with pre-set call options.
type BrokerCallerSession struct {
	Contract *BrokerCaller // Generic contract caller binding to set the session for
	CallOpts bind.CallOpts // Call options to use throughout this session
}

// BrokerTransactorSession is an auto generated write-only Go binding around an Ethereum contract,
// with pre-set transact options.
type BrokerTransactorSession struct {
	Contract     *BrokerTransactor // Generic contract transactor binding to set the session for
	TransactOpts bind.TransactOpts // Transaction auth options to use throughout this session
}

// BrokerRaw is an auto generated low-level Go binding around an Ethereum contract.
type BrokerRaw struct {
	Contract *Broker // Generic contract binding to access the raw methods on
}

// BrokerCallerRaw is an auto generated low-level read-only Go binding around an Ethereum contract.
type BrokerCallerRaw struct {
	Contract *BrokerCaller // Generic read-only contract binding to access the raw methods on
}

// BrokerTransactorRaw is an auto generated low-level write-only Go binding around an Ethereum contract.
type BrokerTransactorRaw struct {
	Contract *BrokerTransactor // Generic write-only contract binding to access the raw methods on
}

// NewBroker creates a new instance of Broker, bound to a specific deployed contract.
func NewBroker(address common.Address, backend bind.ContractBackend) (*Broker, error) {
	contract, err := bindBroker(address, backend, backend, backend)
	if err != nil {
		return nil, err
	}
	return &Broker{BrokerCaller: BrokerCaller{contract: contract}, BrokerTransactor: BrokerTransactor{contract: contract}, BrokerFilterer: BrokerFilterer{contract: contract}}, nil
}

// NewBrokerCaller creates a new read-only instance of Broker, bound to a specific deployed contract.
func NewBrokerCaller(address common.Address, caller bind.ContractCaller) (*BrokerCaller, error) {
	contract, err := bindBroker(address, caller, nil, nil)
	if err != nil {
		return nil, err
	}
	return &BrokerCaller{contract: contract}, nil
}

// NewBrokerTransactor creates a new write-only instance of Broker, bound to a specific deployed contract.
func NewBrokerTransactor(address common.Address, transactor bind.ContractTransactor) (*BrokerTransactor, error) {
	contract, err := bindBroker(address, nil, transactor, nil)
	if err != nil {
		return nil, err
	}
	return &BrokerTransactor{contract: contract}, nil
}

// NewBrokerFilterer creates a new log filterer instance of Broker, bound to a specific deployed contract.
func NewBrokerFilterer(address common.Address, filterer bind.ContractFilterer) (*BrokerFilterer, error) {
	contract, err := bindBroker(address, nil, nil, filterer)
	if err != nil {
		return nil, err
	}
	return &BrokerFilterer{contract: contract}, nil
}

// bindBroker binds a generic wrapper to an already deployed contract.
func bindBroker(address common.Address, caller bind.ContractCaller, transactor bind.ContractTransactor, filterer bind.ContractFilterer) (*bind.BoundContract, error) {
	parsed, err := abi.JSON(strings.NewReader(BrokerABI))
	if err != nil {
		return nil, err
	}
	return bind.NewBoundContract(address, parsed, caller, transactor, filterer), nil
}

// Call invokes the (constant) contract method with params as input values and
// sets the output to result. The result type might be a single field for simple
// returns, a slice of interfaces for anonymous returns and a struct for named
// returns.
func (_Broker *BrokerRaw) Call(opts *bind.CallOpts, result interface{}, method string, params ...interface{}) error {
	return _Broker.Contract.BrokerCaller.contract.Call(opts, result, method, params...)
}

// Transfer initiates a plain transaction to move funds to the contract, calling
// its default method if one is available.
func (_Broker *BrokerRaw) Transfer(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Broker.Contract.BrokerTransactor.contract.Transfer(opts)
}

// Transact invokes the (paid) contract method with params as input values.
func (_Broker *BrokerRaw) Transact(opts *bind.TransactOpts, method string, params ...interface{}) (*types.Transaction, error) {
	return _Broker.Contract.BrokerTransactor.contract.Transact(opts, method, params...)
}

// Call invokes the (constant) contract method with params as input values and
// sets the output to result. The result type might be a single field for simple
// returns, a slice of interfaces for anonymous returns and a struct for named
// returns.
func (_Broker *BrokerCallerRaw) Call(opts *bind.CallOpts, result interface{}, method string, params ...interface{}) error {
	return _Broker.Contract.contract.Call(opts, result, method, params...)
}

// Transfer initiates a plain transaction to move funds to the contract, calling
// its default method if one is available.
func (_Broker *BrokerTransactorRaw) Transfer(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Broker.Contract.contract.Transfer(opts)
}

// Transact invokes the (paid) contract method with params as input values.
func (_Broker *BrokerTransactorRaw) Transact(opts *bind.TransactOpts, method string, params ...interface{}) (*types.Transaction, error) {
	return _Broker.Contract.contract.Transact(opts, method, params...)
}

// MAXOWNERCOUNT is a free data retrieval call binding the contract method 0xd74f8edd.
//
// Solidity: function MAX_OWNER_COUNT() constant returns(uint256)
func (_Broker *BrokerCaller) MAXOWNERCOUNT(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "MAX_OWNER_COUNT")
	return *ret0, err
}

// MAXOWNERCOUNT is a free data retrieval call binding the contract method 0xd74f8edd.
//
// Solidity: function MAX_OWNER_COUNT() constant returns(uint256)
func (_Broker *BrokerSession) MAXOWNERCOUNT() (*big.Int, error) {
	return _Broker.Contract.MAXOWNERCOUNT(&_Broker.CallOpts)
}

// MAXOWNERCOUNT is a free data retrieval call binding the contract method 0xd74f8edd.
//
// Solidity: function MAX_OWNER_COUNT() constant returns(uint256)
func (_Broker *BrokerCallerSession) MAXOWNERCOUNT() (*big.Int, error) {
	return _Broker.Contract.MAXOWNERCOUNT(&_Broker.CallOpts)
}

// MAXVALUEPROPOSALCOUNT is a free data retrieval call binding the contract method 0x4a74db80.
//
// Solidity: function MAX_VALUE_PROPOSAL_COUNT() constant returns(uint256)
func (_Broker *BrokerCaller) MAXVALUEPROPOSALCOUNT(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "MAX_VALUE_PROPOSAL_COUNT")
	return *ret0, err
}

// MAXVALUEPROPOSALCOUNT is a free data retrieval call binding the contract method 0x4a74db80.
//
// Solidity: function MAX_VALUE_PROPOSAL_COUNT() constant returns(uint256)
func (_Broker *BrokerSession) MAXVALUEPROPOSALCOUNT() (*big.Int, error) {
	return _Broker.Contract.MAXVALUEPROPOSALCOUNT(&_Broker.CallOpts)
}

// MAXVALUEPROPOSALCOUNT is a free data retrieval call binding the contract method 0x4a74db80.
//
// Solidity: function MAX_VALUE_PROPOSAL_COUNT() constant returns(uint256)
func (_Broker *BrokerCallerSession) MAXVALUEPROPOSALCOUNT() (*big.Int, error) {
	return _Broker.Contract.MAXVALUEPROPOSALCOUNT(&_Broker.CallOpts)
}

// AddingOwnerProposal is a free data retrieval call binding the contract method 0x46aa4f4c.
//
// Solidity: function addingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerCaller) AddingOwnerProposal(opts *bind.CallOpts, arg0 common.Address, arg1 common.Address) (bool, error) {
	var (
		ret0 = new(bool)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "addingOwnerProposal", arg0, arg1)
	return *ret0, err
}

// AddingOwnerProposal is a free data retrieval call binding the contract method 0x46aa4f4c.
//
// Solidity: function addingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerSession) AddingOwnerProposal(arg0 common.Address, arg1 common.Address) (bool, error) {
	return _Broker.Contract.AddingOwnerProposal(&_Broker.CallOpts, arg0, arg1)
}

// AddingOwnerProposal is a free data retrieval call binding the contract method 0x46aa4f4c.
//
// Solidity: function addingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerCallerSession) AddingOwnerProposal(arg0 common.Address, arg1 common.Address) (bool, error) {
	return _Broker.Contract.AddingOwnerProposal(&_Broker.CallOpts, arg0, arg1)
}

// GenuineValue is a free data retrieval call binding the contract method 0x1ded1471.
//
// Solidity: function genuineValue() constant returns(uint256)
func (_Broker *BrokerCaller) GenuineValue(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "genuineValue")
	return *ret0, err
}

// GenuineValue is a free data retrieval call binding the contract method 0x1ded1471.
//
// Solidity: function genuineValue() constant returns(uint256)
func (_Broker *BrokerSession) GenuineValue() (*big.Int, error) {
	return _Broker.Contract.GenuineValue(&_Broker.CallOpts)
}

// GenuineValue is a free data retrieval call binding the contract method 0x1ded1471.
//
// Solidity: function genuineValue() constant returns(uint256)
func (_Broker *BrokerCallerSession) GenuineValue() (*big.Int, error) {
	return _Broker.Contract.GenuineValue(&_Broker.CallOpts)
}

// GetOwnerCount is a free data retrieval call binding the contract method 0xef18374a.
//
// Solidity: function getOwnerCount() constant returns(uint256)
func (_Broker *BrokerCaller) GetOwnerCount(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "getOwnerCount")
	return *ret0, err
}

// GetOwnerCount is a free data retrieval call binding the contract method 0xef18374a.
//
// Solidity: function getOwnerCount() constant returns(uint256)
func (_Broker *BrokerSession) GetOwnerCount() (*big.Int, error) {
	return _Broker.Contract.GetOwnerCount(&_Broker.CallOpts)
}

// GetOwnerCount is a free data retrieval call binding the contract method 0xef18374a.
//
// Solidity: function getOwnerCount() constant returns(uint256)
func (_Broker *BrokerCallerSession) GetOwnerCount() (*big.Int, error) {
	return _Broker.Contract.GetOwnerCount(&_Broker.CallOpts)
}

// IsOwner is a free data retrieval call binding the contract method 0x2f54bf6e.
//
// Solidity: function isOwner(address ) constant returns(bool)
func (_Broker *BrokerCaller) IsOwner(opts *bind.CallOpts, arg0 common.Address) (bool, error) {
	var (
		ret0 = new(bool)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "isOwner", arg0)
	return *ret0, err
}

// IsOwner is a free data retrieval call binding the contract method 0x2f54bf6e.
//
// Solidity: function isOwner(address ) constant returns(bool)
func (_Broker *BrokerSession) IsOwner(arg0 common.Address) (bool, error) {
	return _Broker.Contract.IsOwner(&_Broker.CallOpts, arg0)
}

// IsOwner is a free data retrieval call binding the contract method 0x2f54bf6e.
//
// Solidity: function isOwner(address ) constant returns(bool)
func (_Broker *BrokerCallerSession) IsOwner(arg0 common.Address) (bool, error) {
	return _Broker.Contract.IsOwner(&_Broker.CallOpts, arg0)
}

// IsSenderAOwner is a free data retrieval call binding the contract method 0xe1568640.
//
// Solidity: function isSenderAOwner() constant returns(bool)
func (_Broker *BrokerCaller) IsSenderAOwner(opts *bind.CallOpts) (bool, error) {
	var (
		ret0 = new(bool)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "isSenderAOwner")
	return *ret0, err
}

// IsSenderAOwner is a free data retrieval call binding the contract method 0xe1568640.
//
// Solidity: function isSenderAOwner() constant returns(bool)
func (_Broker *BrokerSession) IsSenderAOwner() (bool, error) {
	return _Broker.Contract.IsSenderAOwner(&_Broker.CallOpts)
}

// IsSenderAOwner is a free data retrieval call binding the contract method 0xe1568640.
//
// Solidity: function isSenderAOwner() constant returns(bool)
func (_Broker *BrokerCallerSession) IsSenderAOwner() (bool, error) {
	return _Broker.Contract.IsSenderAOwner(&_Broker.CallOpts)
}

// Owners is a free data retrieval call binding the contract method 0x025e7c27.
//
// Solidity: function owners(uint256 ) constant returns(address)
func (_Broker *BrokerCaller) Owners(opts *bind.CallOpts, arg0 *big.Int) (common.Address, error) {
	var (
		ret0 = new(common.Address)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "owners", arg0)
	return *ret0, err
}

// Owners is a free data retrieval call binding the contract method 0x025e7c27.
//
// Solidity: function owners(uint256 ) constant returns(address)
func (_Broker *BrokerSession) Owners(arg0 *big.Int) (common.Address, error) {
	return _Broker.Contract.Owners(&_Broker.CallOpts, arg0)
}

// Owners is a free data retrieval call binding the contract method 0x025e7c27.
//
// Solidity: function owners(uint256 ) constant returns(address)
func (_Broker *BrokerCallerSession) Owners(arg0 *big.Int) (common.Address, error) {
	return _Broker.Contract.Owners(&_Broker.CallOpts, arg0)
}

// RemovingOwnerProposal is a free data retrieval call binding the contract method 0x60e2bdbe.
//
// Solidity: function removingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerCaller) RemovingOwnerProposal(opts *bind.CallOpts, arg0 common.Address, arg1 common.Address) (bool, error) {
	var (
		ret0 = new(bool)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "removingOwnerProposal", arg0, arg1)
	return *ret0, err
}

// RemovingOwnerProposal is a free data retrieval call binding the contract method 0x60e2bdbe.
//
// Solidity: function removingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerSession) RemovingOwnerProposal(arg0 common.Address, arg1 common.Address) (bool, error) {
	return _Broker.Contract.RemovingOwnerProposal(&_Broker.CallOpts, arg0, arg1)
}

// RemovingOwnerProposal is a free data retrieval call binding the contract method 0x60e2bdbe.
//
// Solidity: function removingOwnerProposal(address , address ) constant returns(bool)
func (_Broker *BrokerCallerSession) RemovingOwnerProposal(arg0 common.Address, arg1 common.Address) (bool, error) {
	return _Broker.Contract.RemovingOwnerProposal(&_Broker.CallOpts, arg0, arg1)
}

// RequiredOwnerCount is a free data retrieval call binding the contract method 0x560f28ac.
//
// Solidity: function requiredOwnerCount() constant returns(uint256)
func (_Broker *BrokerCaller) RequiredOwnerCount(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "requiredOwnerCount")
	return *ret0, err
}

// RequiredOwnerCount is a free data retrieval call binding the contract method 0x560f28ac.
//
// Solidity: function requiredOwnerCount() constant returns(uint256)
func (_Broker *BrokerSession) RequiredOwnerCount() (*big.Int, error) {
	return _Broker.Contract.RequiredOwnerCount(&_Broker.CallOpts)
}

// RequiredOwnerCount is a free data retrieval call binding the contract method 0x560f28ac.
//
// Solidity: function requiredOwnerCount() constant returns(uint256)
func (_Broker *BrokerCallerSession) RequiredOwnerCount() (*big.Int, error) {
	return _Broker.Contract.RequiredOwnerCount(&_Broker.CallOpts)
}

// ValueProposals is a free data retrieval call binding the contract method 0x4c305f42.
//
// Solidity: function valueProposals(uint256 ) constant returns(uint256)
func (_Broker *BrokerCaller) ValueProposals(opts *bind.CallOpts, arg0 *big.Int) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "valueProposals", arg0)
	return *ret0, err
}

// ValueProposals is a free data retrieval call binding the contract method 0x4c305f42.
//
// Solidity: function valueProposals(uint256 ) constant returns(uint256)
func (_Broker *BrokerSession) ValueProposals(arg0 *big.Int) (*big.Int, error) {
	return _Broker.Contract.ValueProposals(&_Broker.CallOpts, arg0)
}

// ValueProposals is a free data retrieval call binding the contract method 0x4c305f42.
//
// Solidity: function valueProposals(uint256 ) constant returns(uint256)
func (_Broker *BrokerCallerSession) ValueProposals(arg0 *big.Int) (*big.Int, error) {
	return _Broker.Contract.ValueProposals(&_Broker.CallOpts, arg0)
}

// ValueVotes is a free data retrieval call binding the contract method 0x9356bce0.
//
// Solidity: function valueVotes(uint256 , address ) constant returns(bool)
func (_Broker *BrokerCaller) ValueVotes(opts *bind.CallOpts, arg0 *big.Int, arg1 common.Address) (bool, error) {
	var (
		ret0 = new(bool)
	)
	out := ret0
	err := _Broker.contract.Call(opts, out, "valueVotes", arg0, arg1)
	return *ret0, err
}

// ValueVotes is a free data retrieval call binding the contract method 0x9356bce0.
//
// Solidity: function valueVotes(uint256 , address ) constant returns(bool)
func (_Broker *BrokerSession) ValueVotes(arg0 *big.Int, arg1 common.Address) (bool, error) {
	return _Broker.Contract.ValueVotes(&_Broker.CallOpts, arg0, arg1)
}

// ValueVotes is a free data retrieval call binding the contract method 0x9356bce0.
//
// Solidity: function valueVotes(uint256 , address ) constant returns(bool)
func (_Broker *BrokerCallerSession) ValueVotes(arg0 *big.Int, arg1 common.Address) (bool, error) {
	return _Broker.Contract.ValueVotes(&_Broker.CallOpts, arg0, arg1)
}

// AddOwner is a paid mutator transaction binding the contract method 0x7065cb48.
//
// Solidity: function addOwner(address _newOwner) returns()
func (_Broker *BrokerTransactor) AddOwner(opts *bind.TransactOpts, _newOwner common.Address) (*types.Transaction, error) {
	return _Broker.contract.Transact(opts, "addOwner", _newOwner)
}

// AddOwner is a paid mutator transaction binding the contract method 0x7065cb48.
//
// Solidity: function addOwner(address _newOwner) returns()
func (_Broker *BrokerSession) AddOwner(_newOwner common.Address) (*types.Transaction, error) {
	return _Broker.Contract.AddOwner(&_Broker.TransactOpts, _newOwner)
}

// AddOwner is a paid mutator transaction binding the contract method 0x7065cb48.
//
// Solidity: function addOwner(address _newOwner) returns()
func (_Broker *BrokerTransactorSession) AddOwner(_newOwner common.Address) (*types.Transaction, error) {
	return _Broker.Contract.AddOwner(&_Broker.TransactOpts, _newOwner)
}

// GetGenuineValue is a paid mutator transaction binding the contract method 0x65710695.
//
// Solidity: function getGenuineValue() returns(uint256)
func (_Broker *BrokerTransactor) GetGenuineValue(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Broker.contract.Transact(opts, "getGenuineValue")
}

// GetGenuineValue is a paid mutator transaction binding the contract method 0x65710695.
//
// Solidity: function getGenuineValue() returns(uint256)
func (_Broker *BrokerSession) GetGenuineValue() (*types.Transaction, error) {
	return _Broker.Contract.GetGenuineValue(&_Broker.TransactOpts)
}

// GetGenuineValue is a paid mutator transaction binding the contract method 0x65710695.
//
// Solidity: function getGenuineValue() returns(uint256)
func (_Broker *BrokerTransactorSession) GetGenuineValue() (*types.Transaction, error) {
	return _Broker.Contract.GetGenuineValue(&_Broker.TransactOpts)
}

// RemoveOwner is a paid mutator transaction binding the contract method 0x173825d9.
//
// Solidity: function removeOwner(address _removeOwner) returns()
func (_Broker *BrokerTransactor) RemoveOwner(opts *bind.TransactOpts, _removeOwner common.Address) (*types.Transaction, error) {
	return _Broker.contract.Transact(opts, "removeOwner", _removeOwner)
}

// RemoveOwner is a paid mutator transaction binding the contract method 0x173825d9.
//
// Solidity: function removeOwner(address _removeOwner) returns()
func (_Broker *BrokerSession) RemoveOwner(_removeOwner common.Address) (*types.Transaction, error) {
	return _Broker.Contract.RemoveOwner(&_Broker.TransactOpts, _removeOwner)
}

// RemoveOwner is a paid mutator transaction binding the contract method 0x173825d9.
//
// Solidity: function removeOwner(address _removeOwner) returns()
func (_Broker *BrokerTransactorSession) RemoveOwner(_removeOwner common.Address) (*types.Transaction, error) {
	return _Broker.Contract.RemoveOwner(&_Broker.TransactOpts, _removeOwner)
}

// SetValueProposal is a paid mutator transaction binding the contract method 0x67eb4a3c.
//
// Solidity: function setValueProposal(uint256 _value) returns()
func (_Broker *BrokerTransactor) SetValueProposal(opts *bind.TransactOpts, _value *big.Int) (*types.Transaction, error) {
	return _Broker.contract.Transact(opts, "setValueProposal", _value)
}

// SetValueProposal is a paid mutator transaction binding the contract method 0x67eb4a3c.
//
// Solidity: function setValueProposal(uint256 _value) returns()
func (_Broker *BrokerSession) SetValueProposal(_value *big.Int) (*types.Transaction, error) {
	return _Broker.Contract.SetValueProposal(&_Broker.TransactOpts, _value)
}

// SetValueProposal is a paid mutator transaction binding the contract method 0x67eb4a3c.
//
// Solidity: function setValueProposal(uint256 _value) returns()
func (_Broker *BrokerTransactorSession) SetValueProposal(_value *big.Int) (*types.Transaction, error) {
	return _Broker.Contract.SetValueProposal(&_Broker.TransactOpts, _value)
}
