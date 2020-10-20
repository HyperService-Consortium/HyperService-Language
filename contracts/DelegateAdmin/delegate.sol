pragma solidity 0.4.22;

contract Delegate {
    uint constant public NIN_PROPOSAL_COUNT = 5;
    
    // The total votes by delegates
    uint256 public totalVotes = 0;
    // The district in-charged by these delegate
    string public district;
    
    // Voting proposals for each delegate
    mapping (address => bool) public isDelegateVoted;
    
    // The Broker contract is owned by multple entities to ensure security. 
    mapping (address => bool) public isDelegate;
    address[] public delegates;
    
    // Maps used for adding and removing delegates. 
    mapping (address => mapping (address => bool)) public addingDelegateProposal;
    mapping (address => mapping (address => bool)) public removingDelegateProposal;
    
    modifier nonDelegate(address _delegate) {
        require(!isDelegate[_delegate]);
        _;
    }

    modifier delegateOnly(address _delegate) {
        require(isDelegate[_delegate]);
        _;
    }
    
    constructor(address[] _delegates, string _district) 
        public
    {
        for (uint i = 0; i<_delegates.length; i++) {
            require(!isDelegate[_delegates[i]] && _delegates[i] != 0);
            isDelegate[_delegates[i]] = true;
            delegates.push(_delegates[i]);
        }
        district = _district;
    }
    
    function vote()
        public
        delegateOnly(msg.sender)
    {
        if (isDelegateVoted[msg.sender] = false) {
            isDelegateVoted[msg.sender] = true;
            totalVotes += 1;
        }
    }
    
    function addDelegate(address _newDelegate)
        public
        delegateOnly(msg.sender)
    {
        require(_newDelegate != 0x0);
        addingDelegateProposal[_newDelegate][msg.sender] = true;
        uint vote_count = 0;
        for (uint i = 0; i < delegates.length; i++) {
            address delegate = delegates[i];
            if (addingDelegateProposal[_newDelegate][delegate] == true) {
                vote_count += 1;
            }
        }
        
        // Adding owner proposal is approved.
        if (vote_count >= NIN_PROPOSAL_COUNT) {
            delegates.push(_newDelegate);
            isDelegate[_newDelegate] = true;
        }
    }

    function removeDelegate(address _removedDelegate)
        public
        delegateOnly(msg.sender)
        delegateOnly(_removedDelegate)
    {
        removingDelegateProposal[_removedDelegate][msg.sender] = true;
        uint vote_count = 0;
        for (uint i = 0; i < delegates.length; i++) {
            address delegate = delegates[i];
            if (removingDelegateProposal[_removedDelegate][delegate] == true) {
                vote_count += 1;
            }
        }
        
        // Removing owner proposal is approved.
        if (vote_count >= NIN_PROPOSAL_COUNT) {
            isDelegate[_removedDelegate] = false;
            for (uint j = 0; j < delegates.length - 1; j++) {
                if (delegates[i] == _removedDelegate) {
                    delegates[i] = delegates[delegates.length - 1];
                    break;
                }
            }
        }
        delegates.length -= 1;
    }

}
