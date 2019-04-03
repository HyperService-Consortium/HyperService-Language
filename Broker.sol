pragma solidity 0.4.22;

contract Broker {
    uint constant public MAX_OWNER_COUNT = 50;
    uint constant public MAX_VALUE_PROPOSAL_COUNT = 5;

    // The authorative ouput provided by this Broker contracts.
    uint public genuineValue;

    // The Broker contract is owned by multple entities to ensure security.
    mapping (address => bool) public isOwner;
    address[] public owners;
    uint public requiredOwnerCount;

    // Votes by the owners for a specific price value.
    mapping (uint => mapping (address => bool)) public valueVotes;
    uint[] public valueProposals;

    // Maps used for adding and removing owners.
    mapping (address => mapping (address => bool)) public addingOwnerProposal;
    mapping (address => mapping (address => bool)) public removingOwnerProposal;

    modifier ownerDoesNotExist(address owner) {
        require(!isOwner[owner]);
        _;
    }

    modifier ownerExists(address owner) {
        require(isOwner[owner]);
        _;
    }

    modifier validRequirement(uint ownerCount, uint _requiredOwner) {
        require(ownerCount < MAX_OWNER_COUNT);
        require(_requiredOwner <= ownerCount);
        require(_requiredOwner != 0);
        require(ownerCount != 0);
        _;
    }

    // Remember to specify at least one address and set the _required as one.
    constructor(address[] _owners, uint _required)
        public
        validRequirement(_owners.length, _required)
    {
        for (uint i = 0; i<_owners.length; i++) {
            require(!isOwner[_owners[i]] && _owners[i] != 0);
            isOwner[_owners[i]] = true;
        }
        owners = _owners;
        requiredOwnerCount = _required;
    }

    function addOwner(address _newOwner) public ownerExists(msg.sender) validRequirement(owners.length + 1, requiredOwnerCount){
        require(_newOwner != 0);
        addingOwnerProposal[_newOwner][msg.sender] = true;
        uint vote_count = 0;
        for (uint i = 0; i < owners.length; i++) {
            address owner = owners[i];
            if (addingOwnerProposal[_newOwner][owner] == true) {
                vote_count += 1;
            }
        }

        // Adding owner proposal is approved.
        if (vote_count >= requiredOwnerCount) {
            owners.push(_newOwner);
            isOwner[_newOwner] = true;
            clearStaleOwnerAddingProposal(_newOwner);
        }
    }

    function removeOwner(address _removeOwner)
        public
        ownerExists(msg.sender)
        ownerExists(_removeOwner)
        validRequirement(owners.length - 1, requiredOwnerCount)
    {
        removingOwnerProposal[_removeOwner][msg.sender] = true;

        //use a integer to count it?
        uint vote_count = 0;
        for (uint i = 0; i < owners.length; i++) {
            address owner = owners[i];
            if (removingOwnerProposal[_removeOwner][owner] == true) {
                vote_count ++;
            }
        }

        // Removing owner proposal is approved.
        if (vote_count >= requiredOwnerCount) {
            isOwner[_removeOwner] = false;
            for (uint j = 0; j < owners.length; j++) {
                if (owners[j] == _removeOwner) {
                    owners[j] = owners[owners.length - 1];
                    break;
                }
            }
            owners.length -= 1;
        }
    }

    function getGenuineValue() public returns (uint){
        uint max_vote = 0;
        uint voted_value = 0;
        for (uint i = 0; i < valueProposals.length; i++) {
            uint cur_vote = 0;
            uint cur_value = valueProposals[i];
            mapping (address => bool) proposal = valueVotes[cur_value];
            for (uint j = 0; j < owners.length; j++) {
                address owner = owners[j];
                if (proposal[owner]) {
                    cur_vote += 1;
                }
            }
            // The "=" is to make sure the most recent value proposal has higher priority.
            if (cur_vote >= max_vote) {
                max_vote = cur_vote;
                voted_value = cur_value;
            }
        }
        genuineValue = voted_value;
        return genuineValue;
    }

    function setValueProposal(uint _value) public ownerExists(msg.sender){
        updateValueProposalsIfNecessary(_value);
        valueVotes[_value][msg.sender] = true;
    }

    function getOwnerCount()
        public
        view
        returns (uint)
    {
        return owners.length;
    }

    function isSenderAOwner()
        public
        view
        returns (bool)
    {
        return isOwner[msg.sender];
    }

    function updateValueProposalsIfNecessary(uint _value)
        private
    {
        for (uint i = 0; i < valueProposals.length; i++) {
            if (valueProposals[i] == _value) {
                return;
            }
        }
        if (valueProposals.length < MAX_VALUE_PROPOSAL_COUNT) {
            valueProposals.push(_value);
            return;
        }
        // Remove the oldest value proposal.
        uint oldest_value = valueProposals[0];
        for (i = 1; i < valueProposals.length; i++) {
            valueProposals[i-1] = valueProposals[i];
        }
        clearStaleValueVotes(oldest_value);
        valueProposals.push(_value);
    }

    function clearStaleValueVotes(uint _value)
        private
    {
        for (uint i = 0; i < owners.length; i++) {
            address owner = owners[i];
            delete valueVotes[_value][owner];
        }
    }

    function clearStaleOwnerAddingProposal(address _owner)
        private
    {
        for (uint i = 0; i < owners.length; i++) {
            address owner = owners[i];
            delete addingOwnerProposal[_owner][owner];
        }
    }
}
