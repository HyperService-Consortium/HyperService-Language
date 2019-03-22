pragma solidity ^0.5.1;

contract TransOther{
    address payable owner;

    struct acct {
        string name;
        uint id;
    }

    acct test;

    constructor () payable public{
        owner = msg.sender;

    }

    function trans(address payable _receiver, uint amount) payable public view returns (int b){

        _receiver.transfer(amount);

    }
    
    function getBalance() public view returns (uint) {
        return address(this).balance;
    }


}
