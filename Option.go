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

// OptionABI is the input ABI used to generate the binding from.
const OptionABI = "[{\"constant\":true,\"inputs\":[],\"name\":\"remainingFund\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"genuinePrice\",\"type\":\"uint256\"}],\"name\":\"CashSettle\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"stakeFund\",\"outputs\":[],\"payable\":true,\"stateMutability\":\"payable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_value\",\"type\":\"uint256\"}],\"name\":\"updateStake\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"address\"}],\"name\":\"optionBuyers\",\"outputs\":[{\"name\":\"valid\",\"type\":\"bool\"},{\"name\":\"executed\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"INIT_STAKE\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"strikePrice\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"MIN_STAKE\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_proposal\",\"type\":\"uint256\"}],\"name\":\"buyOption\",\"outputs\":[],\"payable\":true,\"stateMutability\":\"payable\",\"type\":\"function\"},{\"inputs\":[{\"name\":\"_owner\",\"type\":\"address\"},{\"name\":\"_strikePrice\",\"type\":\"uint256\"}],\"payable\":true,\"stateMutability\":\"payable\",\"type\":\"constructor\"}]"

// OptionBin is the compiled bytecode used for deploying new contracts.
const OptionBin = `0x608060408181526064600055806104b38339810180604052604081101561002557600080fd5b50805160209091015134600a81101561003d57600080fd5b3460005560018290556001600160a01b03831661006b57600280546001600160a01b03191633179055610087565b600280546001600160a01b0319166001600160a01b0385161790555b50505061041a806100996000396000f3fe6080604052600436106100865760003560e01c8063946cb4d411610059578063946cb4d414610110578063c40d29c91461015e578063c52987cf14610173578063cb1c2b5c14610188578063fba225b91461019d57610086565b80633994a2681461008b5780636db62d65146100b257806376004082146100de5780637c1f751f146100e6575b600080fd5b34801561009757600080fd5b506100a06101ba565b60408051918252519081900360200190f35b3480156100be57600080fd5b506100dc600480360360208110156100d557600080fd5b50356101c0565b005b6100dc610276565b3480156100f257600080fd5b506100dc6004803603602081101561010957600080fd5b503561029e565b34801561011c57600080fd5b506101436004803603602081101561013357600080fd5b50356001600160a01b03166102ba565b60408051921515835290151560208301528051918290030190f35b34801561016a57600080fd5b506100a06102d8565b34801561017f57600080fd5b506100a06102dd565b34801561019457600080fd5b506100a06102e3565b6100dc600480360360208110156101b357600080fd5b50356102e8565b60005481565b6001600054116101cf57600080fd5b3360009081526003602052604090205460ff168015610203575033600090815260036020526040902054610100900460ff16155b61020c57600080fd5b60015481111561027357600061022482600154610361565b604051909150339082156108fc029083906000818181858888f19350505050158015610254573d6000803e3d6000fd5b5050336000908152600360205260409020805461ff0019166101001790555b50565b6002546001600160a01b0316331461028d57600080fd5b61029960005434610373565b600055565b6002546001600160a01b031633146102b557600080fd5b600155565b60036020526000908152604090205460ff8082169161010090041682565b600a81565b60015481565b600181565b6002546001600160a01b031633141561030057600080fd5b600061030b82610389565b90508034101561031757fe5b50506040805180820182526001815260006020808301828152338352600390915292902090518154925115156101000261ff001991151560ff199094169390931716919091179055565b60008282111561036d57fe5b50900390565b60008282018381101561038257fe5b9392505050565b60015460009060059083106103b5576103ad816103a885600154610361565b6103ce565b9150506103c9565b6103c5816103a860015486610361565b9150505b919050565b60008282028315806103e85750828482816103e557fe5b04145b61038257fefea165627a7a723058200f7bc62238af9a867556f7ac388ea327e0ca74ba506887c3e9b37208d776c16c0029`

// DeployOption deploys a new Ethereum contract, binding an instance of Option to it.
func DeployOption(auth *bind.TransactOpts, backend bind.ContractBackend, _owner common.Address, _strikePrice *big.Int) (common.Address, *types.Transaction, *Option, error) {
	parsed, err := abi.JSON(strings.NewReader(OptionABI))
	if err != nil {
		return common.Address{}, nil, nil, err
	}
	address, tx, contract, err := bind.DeployContract(auth, parsed, common.FromHex(OptionBin), backend, _owner, _strikePrice)
	if err != nil {
		return common.Address{}, nil, nil, err
	}
	return address, tx, &Option{OptionCaller: OptionCaller{contract: contract}, OptionTransactor: OptionTransactor{contract: contract}, OptionFilterer: OptionFilterer{contract: contract}}, nil
}

// Option is an auto generated Go binding around an Ethereum contract.
type Option struct {
	OptionCaller     // Read-only binding to the contract
	OptionTransactor // Write-only binding to the contract
	OptionFilterer   // Log filterer for contract events
}

// OptionCaller is an auto generated read-only Go binding around an Ethereum contract.
type OptionCaller struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// OptionTransactor is an auto generated write-only Go binding around an Ethereum contract.
type OptionTransactor struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// OptionFilterer is an auto generated log filtering Go binding around an Ethereum contract events.
type OptionFilterer struct {
	contract *bind.BoundContract // Generic contract wrapper for the low level calls
}

// OptionSession is an auto generated Go binding around an Ethereum contract,
// with pre-set call and transact options.
type OptionSession struct {
	Contract     *Option           // Generic contract binding to set the session for
	CallOpts     bind.CallOpts     // Call options to use throughout this session
	TransactOpts bind.TransactOpts // Transaction auth options to use throughout this session
}

// OptionCallerSession is an auto generated read-only Go binding around an Ethereum contract,
// with pre-set call options.
type OptionCallerSession struct {
	Contract *OptionCaller // Generic contract caller binding to set the session for
	CallOpts bind.CallOpts // Call options to use throughout this session
}

// OptionTransactorSession is an auto generated write-only Go binding around an Ethereum contract,
// with pre-set transact options.
type OptionTransactorSession struct {
	Contract     *OptionTransactor // Generic contract transactor binding to set the session for
	TransactOpts bind.TransactOpts // Transaction auth options to use throughout this session
}

// OptionRaw is an auto generated low-level Go binding around an Ethereum contract.
type OptionRaw struct {
	Contract *Option // Generic contract binding to access the raw methods on
}

// OptionCallerRaw is an auto generated low-level read-only Go binding around an Ethereum contract.
type OptionCallerRaw struct {
	Contract *OptionCaller // Generic read-only contract binding to access the raw methods on
}

// OptionTransactorRaw is an auto generated low-level write-only Go binding around an Ethereum contract.
type OptionTransactorRaw struct {
	Contract *OptionTransactor // Generic write-only contract binding to access the raw methods on
}

// NewOption creates a new instance of Option, bound to a specific deployed contract.
func NewOption(address common.Address, backend bind.ContractBackend) (*Option, error) {
	contract, err := bindOption(address, backend, backend, backend)
	if err != nil {
		return nil, err
	}
	return &Option{OptionCaller: OptionCaller{contract: contract}, OptionTransactor: OptionTransactor{contract: contract}, OptionFilterer: OptionFilterer{contract: contract}}, nil
}

// NewOptionCaller creates a new read-only instance of Option, bound to a specific deployed contract.
func NewOptionCaller(address common.Address, caller bind.ContractCaller) (*OptionCaller, error) {
	contract, err := bindOption(address, caller, nil, nil)
	if err != nil {
		return nil, err
	}
	return &OptionCaller{contract: contract}, nil
}

// NewOptionTransactor creates a new write-only instance of Option, bound to a specific deployed contract.
func NewOptionTransactor(address common.Address, transactor bind.ContractTransactor) (*OptionTransactor, error) {
	contract, err := bindOption(address, nil, transactor, nil)
	if err != nil {
		return nil, err
	}
	return &OptionTransactor{contract: contract}, nil
}

// NewOptionFilterer creates a new log filterer instance of Option, bound to a specific deployed contract.
func NewOptionFilterer(address common.Address, filterer bind.ContractFilterer) (*OptionFilterer, error) {
	contract, err := bindOption(address, nil, nil, filterer)
	if err != nil {
		return nil, err
	}
	return &OptionFilterer{contract: contract}, nil
}

// bindOption binds a generic wrapper to an already deployed contract.
func bindOption(address common.Address, caller bind.ContractCaller, transactor bind.ContractTransactor, filterer bind.ContractFilterer) (*bind.BoundContract, error) {
	parsed, err := abi.JSON(strings.NewReader(OptionABI))
	if err != nil {
		return nil, err
	}
	return bind.NewBoundContract(address, parsed, caller, transactor, filterer), nil
}

// Call invokes the (constant) contract method with params as input values and
// sets the output to result. The result type might be a single field for simple
// returns, a slice of interfaces for anonymous returns and a struct for named
// returns.
func (_Option *OptionRaw) Call(opts *bind.CallOpts, result interface{}, method string, params ...interface{}) error {
	return _Option.Contract.OptionCaller.contract.Call(opts, result, method, params...)
}

// Transfer initiates a plain transaction to move funds to the contract, calling
// its default method if one is available.
func (_Option *OptionRaw) Transfer(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Option.Contract.OptionTransactor.contract.Transfer(opts)
}

// Transact invokes the (paid) contract method with params as input values.
func (_Option *OptionRaw) Transact(opts *bind.TransactOpts, method string, params ...interface{}) (*types.Transaction, error) {
	return _Option.Contract.OptionTransactor.contract.Transact(opts, method, params...)
}

// Call invokes the (constant) contract method with params as input values and
// sets the output to result. The result type might be a single field for simple
// returns, a slice of interfaces for anonymous returns and a struct for named
// returns.
func (_Option *OptionCallerRaw) Call(opts *bind.CallOpts, result interface{}, method string, params ...interface{}) error {
	return _Option.Contract.contract.Call(opts, result, method, params...)
}

// Transfer initiates a plain transaction to move funds to the contract, calling
// its default method if one is available.
func (_Option *OptionTransactorRaw) Transfer(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Option.Contract.contract.Transfer(opts)
}

// Transact invokes the (paid) contract method with params as input values.
func (_Option *OptionTransactorRaw) Transact(opts *bind.TransactOpts, method string, params ...interface{}) (*types.Transaction, error) {
	return _Option.Contract.contract.Transact(opts, method, params...)
}

// INITSTAKE is a free data retrieval call binding the contract method 0xc40d29c9.
//
// Solidity: function INIT_STAKE() constant returns(uint256)
func (_Option *OptionCaller) INITSTAKE(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Option.contract.Call(opts, out, "INIT_STAKE")
	return *ret0, err
}

// INITSTAKE is a free data retrieval call binding the contract method 0xc40d29c9.
//
// Solidity: function INIT_STAKE() constant returns(uint256)
func (_Option *OptionSession) INITSTAKE() (*big.Int, error) {
	return _Option.Contract.INITSTAKE(&_Option.CallOpts)
}

// INITSTAKE is a free data retrieval call binding the contract method 0xc40d29c9.
//
// Solidity: function INIT_STAKE() constant returns(uint256)
func (_Option *OptionCallerSession) INITSTAKE() (*big.Int, error) {
	return _Option.Contract.INITSTAKE(&_Option.CallOpts)
}

// MINSTAKE is a free data retrieval call binding the contract method 0xcb1c2b5c.
//
// Solidity: function MIN_STAKE() constant returns(uint256)
func (_Option *OptionCaller) MINSTAKE(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Option.contract.Call(opts, out, "MIN_STAKE")
	return *ret0, err
}

// MINSTAKE is a free data retrieval call binding the contract method 0xcb1c2b5c.
//
// Solidity: function MIN_STAKE() constant returns(uint256)
func (_Option *OptionSession) MINSTAKE() (*big.Int, error) {
	return _Option.Contract.MINSTAKE(&_Option.CallOpts)
}

// MINSTAKE is a free data retrieval call binding the contract method 0xcb1c2b5c.
//
// Solidity: function MIN_STAKE() constant returns(uint256)
func (_Option *OptionCallerSession) MINSTAKE() (*big.Int, error) {
	return _Option.Contract.MINSTAKE(&_Option.CallOpts)
}

// OptionBuyers is a free data retrieval call binding the contract method 0x946cb4d4.
//
// Solidity: function optionBuyers(address ) constant returns(bool valid, bool executed)
func (_Option *OptionCaller) OptionBuyers(opts *bind.CallOpts, arg0 common.Address) (struct {
	Valid    bool
	Executed bool
}, error) {
	ret := new(struct {
		Valid    bool
		Executed bool
	})
	out := ret
	err := _Option.contract.Call(opts, out, "optionBuyers", arg0)
	return *ret, err
}

// OptionBuyers is a free data retrieval call binding the contract method 0x946cb4d4.
//
// Solidity: function optionBuyers(address ) constant returns(bool valid, bool executed)
func (_Option *OptionSession) OptionBuyers(arg0 common.Address) (struct {
	Valid    bool
	Executed bool
}, error) {
	return _Option.Contract.OptionBuyers(&_Option.CallOpts, arg0)
}

// OptionBuyers is a free data retrieval call binding the contract method 0x946cb4d4.
//
// Solidity: function optionBuyers(address ) constant returns(bool valid, bool executed)
func (_Option *OptionCallerSession) OptionBuyers(arg0 common.Address) (struct {
	Valid    bool
	Executed bool
}, error) {
	return _Option.Contract.OptionBuyers(&_Option.CallOpts, arg0)
}

// RemainingFund is a free data retrieval call binding the contract method 0x3994a268.
//
// Solidity: function remainingFund() constant returns(uint256)
func (_Option *OptionCaller) RemainingFund(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Option.contract.Call(opts, out, "remainingFund")
	return *ret0, err
}

// RemainingFund is a free data retrieval call binding the contract method 0x3994a268.
//
// Solidity: function remainingFund() constant returns(uint256)
func (_Option *OptionSession) RemainingFund() (*big.Int, error) {
	return _Option.Contract.RemainingFund(&_Option.CallOpts)
}

// RemainingFund is a free data retrieval call binding the contract method 0x3994a268.
//
// Solidity: function remainingFund() constant returns(uint256)
func (_Option *OptionCallerSession) RemainingFund() (*big.Int, error) {
	return _Option.Contract.RemainingFund(&_Option.CallOpts)
}

// StrikePrice is a free data retrieval call binding the contract method 0xc52987cf.
//
// Solidity: function strikePrice() constant returns(uint256)
func (_Option *OptionCaller) StrikePrice(opts *bind.CallOpts) (*big.Int, error) {
	var (
		ret0 = new(*big.Int)
	)
	out := ret0
	err := _Option.contract.Call(opts, out, "strikePrice")
	return *ret0, err
}

// StrikePrice is a free data retrieval call binding the contract method 0xc52987cf.
//
// Solidity: function strikePrice() constant returns(uint256)
func (_Option *OptionSession) StrikePrice() (*big.Int, error) {
	return _Option.Contract.StrikePrice(&_Option.CallOpts)
}

// StrikePrice is a free data retrieval call binding the contract method 0xc52987cf.
//
// Solidity: function strikePrice() constant returns(uint256)
func (_Option *OptionCallerSession) StrikePrice() (*big.Int, error) {
	return _Option.Contract.StrikePrice(&_Option.CallOpts)
}

// CashSettle is a paid mutator transaction binding the contract method 0x6db62d65.
//
// Solidity: function CashSettle(uint256 genuinePrice) returns()
func (_Option *OptionTransactor) CashSettle(opts *bind.TransactOpts, genuinePrice *big.Int) (*types.Transaction, error) {
	return _Option.contract.Transact(opts, "CashSettle", genuinePrice)
}

// CashSettle is a paid mutator transaction binding the contract method 0x6db62d65.
//
// Solidity: function CashSettle(uint256 genuinePrice) returns()
func (_Option *OptionSession) CashSettle(genuinePrice *big.Int) (*types.Transaction, error) {
	return _Option.Contract.CashSettle(&_Option.TransactOpts, genuinePrice)
}

// CashSettle is a paid mutator transaction binding the contract method 0x6db62d65.
//
// Solidity: function CashSettle(uint256 genuinePrice) returns()
func (_Option *OptionTransactorSession) CashSettle(genuinePrice *big.Int) (*types.Transaction, error) {
	return _Option.Contract.CashSettle(&_Option.TransactOpts, genuinePrice)
}

// BuyOption is a paid mutator transaction binding the contract method 0xfba225b9.
//
// Solidity: function buyOption(uint256 _proposal) returns()
func (_Option *OptionTransactor) BuyOption(opts *bind.TransactOpts, _proposal *big.Int) (*types.Transaction, error) {
	return _Option.contract.Transact(opts, "buyOption", _proposal)
}

// BuyOption is a paid mutator transaction binding the contract method 0xfba225b9.
//
// Solidity: function buyOption(uint256 _proposal) returns()
func (_Option *OptionSession) BuyOption(_proposal *big.Int) (*types.Transaction, error) {
	return _Option.Contract.BuyOption(&_Option.TransactOpts, _proposal)
}

// BuyOption is a paid mutator transaction binding the contract method 0xfba225b9.
//
// Solidity: function buyOption(uint256 _proposal) returns()
func (_Option *OptionTransactorSession) BuyOption(_proposal *big.Int) (*types.Transaction, error) {
	return _Option.Contract.BuyOption(&_Option.TransactOpts, _proposal)
}

// StakeFund is a paid mutator transaction binding the contract method 0x76004082.
//
// Solidity: function stakeFund() returns()
func (_Option *OptionTransactor) StakeFund(opts *bind.TransactOpts) (*types.Transaction, error) {
	return _Option.contract.Transact(opts, "stakeFund")
}

// StakeFund is a paid mutator transaction binding the contract method 0x76004082.
//
// Solidity: function stakeFund() returns()
func (_Option *OptionSession) StakeFund() (*types.Transaction, error) {
	return _Option.Contract.StakeFund(&_Option.TransactOpts)
}

// StakeFund is a paid mutator transaction binding the contract method 0x76004082.
//
// Solidity: function stakeFund() returns()
func (_Option *OptionTransactorSession) StakeFund() (*types.Transaction, error) {
	return _Option.Contract.StakeFund(&_Option.TransactOpts)
}

// UpdateStake is a paid mutator transaction binding the contract method 0x7c1f751f.
//
// Solidity: function updateStake(uint256 _value) returns()
func (_Option *OptionTransactor) UpdateStake(opts *bind.TransactOpts, _value *big.Int) (*types.Transaction, error) {
	return _Option.contract.Transact(opts, "updateStake", _value)
}

// UpdateStake is a paid mutator transaction binding the contract method 0x7c1f751f.
//
// Solidity: function updateStake(uint256 _value) returns()
func (_Option *OptionSession) UpdateStake(_value *big.Int) (*types.Transaction, error) {
	return _Option.Contract.UpdateStake(&_Option.TransactOpts, _value)
}

// UpdateStake is a paid mutator transaction binding the contract method 0x7c1f751f.
//
// Solidity: function updateStake(uint256 _value) returns()
func (_Option *OptionTransactorSession) UpdateStake(_value *big.Int) (*types.Transaction, error) {
	return _Option.Contract.UpdateStake(&_Option.TransactOpts, _value)
}
