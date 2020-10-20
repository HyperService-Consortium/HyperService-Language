pragma solidity 0.4.22;

contract federal {
    
    address public manager;
    uint public collectedVotes;
    
    mapping (string => uint) collectedVotesPerDistrict;

    
    modifier managerOnly(address _sender) {
        require(_sender == manager);
        _;
    }
    
    constructor() public
    {
        manager = msg.sender;
    }
    
    function submitVotes(string _district, uint _votes)
        public
        managerOnly(msg.sender)
    {
        assert(_votes > 0);
        collectedVotesPerDistrict[_district] = safeAdd(collectedVotesPerDistrict[_district], _votes);
        collectedVotes = safeAdd(collectedVotes, _votes);
    }

}


//function safeAdd(uint a, uint b)
//internal
//pure
//returns (uint )
//{
//uint c = a + b;
//assert(c >= a);
//return c;
//}*/