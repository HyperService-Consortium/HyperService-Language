# HyperService-Language (HSL)
A blockchain, as well as smart contracts (or dApps) executed on the blockchain, is often perceived as a state machine. We desire to preserve similar abstraction for developers when writing cross-chain dApps. Towards this end, HyperService proposes Unified State Model(USM), a blockchain-neutral and extensible model or language for describing state transitions across different blockchains.

The Hyper-Service-Language is the high-level programming language to write cross-chain dApps under the modeling of USM.

## Getting Started
This tutorial will demonstrate how to run and write HSL. Make sure you don't skip it if this is your first visit, as there might be important details in there for you.

### Antlr
The [Antlr section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/antlr) demonstrate how we translates different programming language to a parser/lexer in java, which will helps us get the contracts' information to using in the HyperService.
 
More recourse of Antlr and tutorial you can find in [here](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)

### Example HSL Program
```php
// import the source code of contracts
import ("contracts/CrypotAsset/asset.sol")

//Entity definition.
//Attributes of a contract entity are implicit from its source code.
account a1 = chain1::"0x7019fa779024c0a0eac1d8475733eefe10a49f3b" 
account a2 = chain2::"0x47a1cdb6594d6efed3a6b917f2fbaa2bbcf61a2e"

contract c1 = chain1::CryptoAsset("0xafc7d2959e72081770304f6474151293be1fbba7")

//Operation definition
op op1 payment 20 "ether" from a2 to a1  with 1 "ether" as 2 "XYZ"
op op2 call c1.deposit(10) using a1

//Dependency definition
op1 before op2
```

The HSL requires to import the source code of the deployed smart contracts from blockchains first. In the example, we use key word "import" to import the source code, [asset.sol](https://github.com/xxiao007/Hyper-Service-Language/blob/master/contracts/CrypotAsset/asset.sol).   

After import, we need to define entities and operations. We have two entities, account and contract. And two operations, payment and call.

HSL also requires define dependencies among operations. Based on the relation of operations, we set op1 before op2. This will facilitates the specification of accounts/deployed smart contracts and their relationships in each operation, ensuring the expected execution order of operations.

In order to test the HSL program, you can import the HSL file to the [OpIntentParser](https://github.com/xxiao007/Hyper-Service-Language/blob/master/src/main/java/edu/cwru/rise/hslang/OpIntentParser.java). The result of example is a json operation-intent.
```php
[
{
  "name": "op1",
  "type": "Payment",
  "src": {
    "domain": "chain2",
    "user_name": "a2"
  },
  "dst": {
    "domain": "chain1",
    "user_name": "a1"
  },
  "amount": "20",
  "unit": "ether",
  "ratio": "1 ether as XYZ"
},
{
  "name": "op2",
  "type": "ContractInvocation",
  "invoker": "a1",
  "func": "deposit",
  "contract": {
    "domain": "chain1",
    "address": "0xafc7d2959e72081770304f6474151293be1fbba7"
  },
  "parameters": [
    {
      "Type": "uint",
      "Value": {
        "constant": "10"
      }
    }
  ]
}
]
"dependencies":[{
  "left": "op1",
  "right": "op2",
  "dep": "before"
}
]
```
You can find more HSL examples in [contracts section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/contracts), and results in [dApp_op_Intent section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/dApp_op_Intent).

