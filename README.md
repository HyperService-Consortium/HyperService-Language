# HyperService-Language (HSL)
A blockchain, as well as smart contracts (or dApps) executed on the blockchain, is often perceived as a state machine. We desire to preserve similar abstraction for developers when writing cross-chain dApps. Towards this end, HyperService proposes Unified State Model (USM), a blockchain-neutral and extensible model or language for describing state transitions across different blockchains.  

The USM is defined with three-dimension, M = {E, P, C}, where E is a set of entities extracted from underlying blockchains, P is a set of operations performed over those entities, and C is a set of constraints defining the dependencies of those operations. Based on that we propose the HyperService-Language, a high-level programming language to write cross-chain dApps.

## Getting Started
This tutorial will demonstrate how to run and write HSL. Make sure you don't skip it if this is your first visit, as there might be important details in there for you.

### Antlr
The [Antlr section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/antlr) demonstrate how we translates different programming language to a parser/lexer in java, which will helps us get the contracts' information to using in the HyperService.
 
More recourse of Antlr and tutorial you can find in [here](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)

### Struct of HSL 
An HSL program contains four parts: contract import, variables, operations, dependencies.  

The developer needs to import source codes of smart contracts, which will be used to define contract entities. Then the developer defines variables, and operations to interact with these variables. Dependencies will be constraints for operations.
![image](https://github.com/HyperService-Consortium/HyperService-Language/blob/master/dApp_op_Intent/HSL.png)

For operation, we support the conditional and iteration control construct. 

A conditional expression specifies the conditional execution of a sequence of operations, depending on the evaluation of the conditional expression. HSL supports both direct evaluations of a simple boolean variable or a comparison of variables in a conditional expression. Further, it also supports using the operators and and or to combine multiple conditional expressions and the operator ! to negate a conditional expression. Moreover, a conditional construct may specify another sequence of operations (i.e., “else block”) that will be executed if the conditional expression is evaluated to false. 

For iteration construct, HSL supports for and loop. A for construct specifies a sequence of operations to be repeated for each element in a collection. The elements contained by a collection can be either account entities or contract entities. A loop construct provides another simple way to specify a sequence of operations to be repeated a fixed number of times.

### Example HSL Program
```php
//Operation definition
import ("contracts/DelegateAdmin/federal.sol")
import ("contracts/DelegateAdmin/delegate.vy")

//Entity definition.
//Attributes of a contract entity are implicit from its source code.
account a1 = ChainX::Account("0x7019fa779024c0a0eac1d8475733eefe10a49f3b")
account a2 = ChainY::Account("0x8e215d06ea7ec1fdb4fc5fd21768f4b34ee92ef4")

contract c1 = ChainX::federal("0xafc7d2959e72081770304f6474151293be1fbba7")
contract c2 = ChainY::delegate("0x3723261b2a5a62b778b5c74318534d7fdf8db38c")

//Operation definition
op op1 call c2.vote() using a2
op op2 call c1.submitVotes(c2.district, c2.totalVotes) using a1

op op3 if(c2.totalVotes > 50){
   op op4 for acc in [a1, a2]{
        op op5 call c2.vote() using acc
        op op6 payment 10 "ether" from acc to a2 with 1 "ether" as 1 "XYZ"
   }
   op op7 payment 10 "ether" from a1 to a2 with 1 "ether" as 1 "XYZ"
}

op op8 loop(3){
    op op9 call c2.vote() using a2
}

//Dependency definition
op1 before op2
```

In order to test the HSL program, you can import the HSL file to the [OpIntentParser](https://github.com/xxiao007/Hyper-Service-Language/blob/master/src/main/java/edu/cwru/rise/hslang/OpIntentParser.java). The result of example is a json operation-intent.
```php
[
    {
        "name": "op1",
        "type": "ContractInvocation",
        "invoker": "a2",
        "func": "vote",
        "contract": {
            "domain": "ChainY",
            "address": "0x3723261b2a5a62b778b5c74318534d7fdf8db38c"
        },
        "parameters": []
    },
    {
        "name": "op2",
        "type": "ContractInvocation",
        "invoker": "a1",
        "func": "submitVotes",
        "contract": {
            "domain": "ChainX",
            "address": "0xafc7d2959e72081770304f6474151293be1fbba7"
        },
        "parameters": [
            {
                "Type": "string",
                "Value": {
                    "contract": "c2",
                    "field": "district",
                    "pos": "2"
                }
            },
            {
                "Type": "uint",
                "Value": {
                    "contract": "c2",
                    "field": "totalVotes",
                    "pos": "1"
                }
            }
        ]
    },
    {
        "name": "if-op",
        "type": "IfStatement",
        "if": [
            {
                "name": "op5.1",
                "type": "ContractInvocation",
                "invoker": "a1",
                "func": "vote",
                "contract": {
                    "domain": "ChainY",
                    "address": "0x3723261b2a5a62b778b5c74318534d7fdf8db38c"
                },
                "parameters": []
            },
            {
                "name": "op6.1",
                "type": "Payment",
                "src": {
                    "domain": "ChainX",
                    "user_name": "a1"
                },
                "dst": {
                    "domain": "ChainY",
                    "user_name": "a2"
                },
                "amount": "10",
                "unit": "ether",
                "ratio": "1 ether as 1 XYZ"
            },
            {
                "name": "op5.2",
                "type": "ContractInvocation",
                "invoker": "a1",
                "func": "vote",
                "contract": {
                    "domain": "ChainY",
                    "address": "0x3723261b2a5a62b778b5c74318534d7fdf8db38c"
                },
                "parameters": []
            },
            {
                "name": "op6.2",
                "type": "Payment",
                "src": {
                    "domain": "ChainX",
                    "user_name": "a1"
                },
                "dst": {
                    "domain": "ChainY",
                    "user_name": "a2"
                },
                "amount": "10",
                "unit": "ether",
                "ratio": "1 ether as 1 XYZ"
            },
            {
                "name": "op7",
                "type": "Payment",
                "src": {
                    "domain": "ChainX",
                    "user_name": "a1"
                },
                "dst": {
                    "domain": "ChainY",
                    "user_name": "a2"
                },
                "amount": "10",
                "unit": "ether",
                "ratio": "1 ether as 1 XYZ"
            }
        ],
        "condition": [
            {
                "left": {
                    "Type": "uint",
                    "Value": {
                        "contract": "c2",
                        "field": "totalVotes",
                        "pos": "1"
                    }
                },
                "right": {
                    "Type": "uint",
                    "Value": {
                        "constant": "50"
                    }
                },
                "sign": " Greater "
            }
        ]
    },
    {
        "name": "loop",
        "type": "loopFunction",
        "loop": [
            {
                "name": "op9",
                "type": "ContractInvocation",
                "invoker": "a2",
                "func": "vote",
                "contract": {
                    "domain": "ChainY",
                    "address": "0x3723261b2a5a62b778b5c74318534d7fdf8db38c"
                },
                "parameters": []
            }
        ],
        "loopTime": "3"
    },
    {
        "dependencies": [
            {
                "left": "op1",
                "right": "op2",
                "dep": "before"
            }
        ]
    },
    {
        "contracts": [
            {
                "contractName": "c1",
                "domain": "ChainX",
                "address": "0xafc7d2959e72081770304f6474151293be1fbba7"
            },
            {
                "contractName": "c2",
                "domain": "ChainY",
                "address": "0x3723261b2a5a62b778b5c74318534d7fdf8db38c"
            }
        ]
    },
    {
        "accounts": [
            {
                "userName": "a1",
                "domain": "ChainX",
                "address": "0x7019fa779024c0a0eac1d8475733eefe10a49f3b"
            },
            {
                "userName": "a2",
                "domain": "ChainY",
                "address": "0x8e215d06ea7ec1fdb4fc5fd21768f4b34ee92ef4"
            }
        ]
    }
]
```
You can find more HSL examples in [contracts section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/contracts), and results in [dApp_op_Intent section](https://github.com/xxiao007/Hyper-Service-Language/tree/master/dApp_op_Intent).

