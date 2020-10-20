NIN_PROPOSAL_COUNT: constant(uint256) = 5

num_count: public(int128)

totalVotes: public(uint256)
district: public(string[100])

isDelegateVoted: public(map(address, bool))

isDelegate: public(map(address, bool))
delegates: public(address[100])

addingDelegateProposal: public(map(address, map(address,bool)))
removingDelegateProposal: public(map(address, map(address,bool)))

@public
def __init__(_delegates: address[100], _district: string[100]):
    for i in range(10):
        assert not self.isDelegate[_delegates[i]]
        assert _delegates[i] != 0x0000000000000000000000000000000000000000
        self.isDelegate[_delegates[i]] = True
        self.delegates[i] = _delegates[i]

    self.district = _district
    self.num_count = 10

@public
@payable
def vote():
    assert self.isDelegate[msg.sender]
    if self.isDelegate[msg.sender] == False:
        self.isDelegate[msg.sender] = True
        self.totalVotes += 1


@public
def addDelegate(_newDelegate: address):
    assert self.isDelegate[msg.sender]
    assert _newDelegate != 0x0000000000000000000000000000000000000000
    self.addingDelegateProposal[_newDelegate][msg.sender] = True
    vote_count: uint256 = 0
    for i in range(100):
        delegate: address = self.delegates[i]
        if self.addingDelegateProposal[_newDelegate][delegate] == True:
            vote_count += 1

    if vote_count >= NIN_PROPOSAL_COUNT:
        self.delegates[self.num_count] = _newDelegate
        self.isDelegate[_newDelegate] = True
        self.num_count += 1


@public
@payable
def removeDelegate(_removedDelegate: address):
	assert self.isDelegate[msg.sender]
	assert self.isDelegate[_removedDelegate]
	self.removingDelegateProposal[_removedDelegate][msg.sender] = True
	vote_count: uint256 = 0
	for i in range(100):
		delegate: address = self.delegates[i]
		if self.removingDelegateProposal[_removedDelegate][delegate] == True:
			vote_count += 1
	if vote_count >= NIN_PROPOSAL_COUNT:
		self.isDelegate[_removedDelegate] = False
		for j in range(99):
			if self.delegates[j] == _removedDelegate:
				self.delegates[j] = 0x0000000000000000000000000000000000000000
				break
		self.num_count -= 1
