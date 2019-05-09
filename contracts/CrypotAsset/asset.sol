pragma solidity 0.4.22;

contract CryptoAsset {
    /*
     *  Data structures
     */
    mapping (address => uint) balances;
    mapping (address => bool) ownerAppended;
    address[] public owners;

    function deposit(uint _value)
        public 
        payable 
    {
        require(_value > 0);
        
        balances[msg.sender] = safeAdd(balances[msg.sender], _value);
            if (!ownerAppended[msg.sender]) {
                ownerAppended[msg.sender] = true;
                owners.push(msg.sender);
            }
        msg.sender.transfer(_value);
    }
    
    function withdrawn(uint _value, address _to)
        public
        payable
    {
        require(_to != 0x0);
        require(_value > 0);
        
        if (balances[msg.sender] > _value) {
            balances[msg.sender] = safeSub(balances[msg.sender], _value);
            _to.transfer(_value);
        }
        
    }
    
    function safeSub(uint a, uint b)
        internal 
        pure 
        returns (uint )
    {
        assert(b <= a);
        return a - b;
    }

    function safeAdd(uint a, uint b)
        internal 
        pure 
        returns (uint)
    {
        uint c = a + b;
        assert(c >= a);
        return c;
    }
}
