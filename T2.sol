pragma solidity ^0.5.1;

contract T2{
    address payable owner;

    constructor () payable public{
        owner = msg.sender;
        emit Print_address(owner, owner.balance);
    }

    function deposit() payable public{
        emit Print_address(address(this), address(this).balance);
    }

    event Print_address(address payable, uint);

    function getBalance() public view returns (uint) {
        return address(this).balance;
    }
    
    function() payable external{}

}
