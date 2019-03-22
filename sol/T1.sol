pragma solidity ^0.5.1;

contract TransOther{
    address payable owner;

    constructor () payable public{
        owner = msg.sender;

    }

    function trans(address payable _receiver, uint amount) payable public{

        _receiver.transfer(amount);

    }
    
    function getBalance() public view returns (uint) {
        return address(this).balance;
    }


}
