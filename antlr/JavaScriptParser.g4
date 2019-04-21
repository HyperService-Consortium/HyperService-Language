parser grammar JavaScriptParser;

@header{
package edu.cwru.rise.javascript.parser;
}

options {
    tokenVocab=JavaScriptLexer;
    superClass=JavaScriptBaseParser;
}

program
    : sourceElements? (varFunDefinition | varFunPrototype)* (contractDefinition)? EOF
    ;

varFunDefinition
    : varModifier funName=Identifier '=' Function Identifier? '(' formalParameterList? ')' '{' functionBody '}' SemiColon
    ;

varFunPrototype
    : Identifier '.' Prototype '=' prototypeBody SemiColon
    ;

prototypeBody
    : '{'functionList'}'
    ;

functionList
    : function (',' function)*
    ;

function
    : Identifier ':' Function'(' formalParameterList? ')' '{' functionBody '}'
    ;

localStorage
    : LocalStorage '.' Identifier '(' expressionStatement ')' SemiColon
    ;

contractDefinition
    : Module '.' Exports '=' Identifier eos
    ;

sourceElement
    : Export? statement
    ;

statement
    : block
    |variableDefinition
    | emptyStatement
    | classDeclaration
    | expressionStatement
    | ifStatement
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | withStatement
    | labelledStatement
    | switchStatement
    | throwStatement
    | tryStatement
    | debuggerStatement
    | functionDeclaration
    ;

block
    : '{' statementList? '}'
    ;

statementList
    : statement+
    ;

variableDefinition
    : varModifier variableDeclarationList eos
    ;

variableDeclarationList
    : variableDeclaration (',' variableDeclaration)*
    ;

variableDeclaration
    : (Identifier | arrayLiteral | objectLiteral) ('=' singleExpression)? // ECMAScript 6: Array & Object Matching
    ;

emptyStatement
    : SemiColon
    ;

expressionStatement
    : {this.notOpenBraceAndNotFunction()}? expressionSequence eos
    ;

ifStatement
    : If '(' expressionSequence ')' statement  (Else statement)?
    ;


iterationStatement
    : Do statement While '(' expressionSequence ')' eos                                                         # DoStatement
    | While '(' expressionSequence ')' statement                                                                # WhileStatement
    | For '(' expressionSequence? ';' expressionSequence? ';' expressionSequence? ')' statement                 # ForStatement
    | For '(' varModifier variableDeclarationList ';' expressionSequence? ';' expressionSequence? ')'
          statement                                                                                             # ForVarStatement
    | For '(' singleExpression (In | Identifier{this.p("of")}?) expressionSequence ')' statement                # ForInStatement
    | For '(' varModifier variableDeclaration (In | Identifier{this.p("of")}?) expressionSequence ')' statement # ForVarInStatement
    ;

varModifier  // let, const - ECMAScript 6
    : Var
    | Let
    | Const
    ;

continueStatement
    : Continue ({this.notLineTerminator()}? Identifier)? eos
    ;

breakStatement
    : Break ({this.notLineTerminator()}? Identifier)? eos
    ;

returnStatement
    : Return ({this.notLineTerminator()}? expressionSequence)? eos
    ;

withStatement
    : With '(' expressionSequence ')' statement
    ;

switchStatement
    : Switch '(' expressionSequence ')' caseBlock
    ;

caseBlock
    : '{' caseClauses? (defaultClause caseClauses?)? '}'
    ;

caseClauses
    : caseClause+
    ;

caseClause
    : Case expressionSequence ':' statementList?
    ;

defaultClause
    : Default ':' statementList?
    ;

labelledStatement
    : Identifier ':' statement
    ;

throwStatement
    : Throw {this.notLineTerminator()}? expressionSequence eos
    ;

tryStatement
    : Try block (catchProduction finallyProduction? | finallyProduction)
    ;

catchProduction
    : Catch '(' Identifier ')' block
    ;

finallyProduction
    : Finally block
    ;

debuggerStatement
    : Debugger eos
    ;

functionDeclaration
    : Function Identifier '(' formalParameterList? ')' '{' functionBody '}'
    ;

classDeclaration
    : Class Identifier classTail
    ;

classTail
    : (Extends singleExpression)? '{' classElement* '}'
    ;

classElement
    : (Static | {n("static")}? Identifier)? methodDefinition
    | emptyStatement
    ;

methodDefinition
    : propertyName '(' formalParameterList? ')' '{' functionBody '}'
    | getter '(' ')' '{' functionBody '}'
    | setter '(' formalParameterList? ')' '{' functionBody '}'
    | generatorMethod
    ;

generatorMethod
    : '*'? Identifier '(' formalParameterList? ')' '{' functionBody '}'
    ;

formalParameterList
    : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
    | lastFormalParameterArg
    | arrayLiteral                            // ECMAScript 6: Parameter Context Matching
    | objectLiteral                           // ECMAScript 6: Parameter Context Matching
    ;

formalParameterArg
    : Identifier ('=' singleExpression)?      // ECMAScript 6: Initialization
    ;

lastFormalParameterArg                        // ECMAScript 6: Rest Parameter
    : Ellipsis Identifier
    ;

functionBody
    : sourceElements?
    | localStorage
    ;

sourceElements
    : sourceElement+
    ;

arrayLiteral
    : '[' ','* elementList? ','* ']'
    ;

elementList
    : singleExpression (','+ singleExpression)* (','+ lastElement)?
    | lastElement
    ;

lastElement                      // ECMAScript 6: Spread Operator
    : Ellipsis Identifier
    ;

objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)*)? ','? '}'
    ;

propertyAssignment
    : propertyName (':' |'=') singleExpression       # PropertyExpressionAssignment
    | '[' singleExpression ']' ':' singleExpression  # ComputedPropertyExpressionAssignment
    | getter '(' ')' '{' functionBody '}'            # PropertyGetter
    | setter '(' Identifier ')' '{' functionBody '}' # PropertySetter
    | generatorMethod                                # MethodProperty
    | Identifier                                     # PropertyShorthand
    ;

propertyName
    : identifierName
    | StringLiteral
    | numericLiteral
    ;



arguments
    : '('(
          singleExpression (',' singleExpression)* (',' lastArgument)? |
          lastArgument
       )?')'
    ;

lastArgument                                  // ECMAScript 6: Spread Operator
    : Ellipsis Identifier
    ;

expressionSequence
    : singleExpression (',' singleExpression)*
    ;

singleExpression
    : prototypeBody                                                          # PrototypeExpression
    |Class Identifier? classTail                                             # ClassExpression
    | singleExpression '[' expressionSequence ']'                            # MemberIndexExpression
    | singleExpression '.' identifierName                                    # MemberDotExpression
    | singleExpression arguments                                             # ArgumentsExpression
    | New singleExpression arguments?                                        # NewExpression
    | singleExpression {this.notLineTerminator()}? '++'                      # PostIncrementExpression
    | singleExpression {this.notLineTerminator()}? '--'                      # PostDecreaseExpression
    | Delete singleExpression                                                # DeleteExpression
    | Void singleExpression                                                  # VoidExpression
    | Typeof singleExpression                                                # TypeofExpression
    | '++' singleExpression                                                  # PreIncrementExpression
    | '--' singleExpression                                                  # PreDecreaseExpression
    | '+' singleExpression                                                   # UnaryPlusExpression
    | '-' singleExpression                                                   # UnaryMinusExpression
    | '~' singleExpression                                                   # BitNotExpression
    | '!' singleExpression                                                   # NotExpression
    | singleExpression ('*' | '/' | '%') singleExpression                    # MultiplicativeExpression
    | singleExpression ('+' | '-') singleExpression                          # AdditiveExpression
    | singleExpression ('<<' | '>>' | '>>>') singleExpression                # BitShiftExpression
    | singleExpression ('<' | '>' | '<=' | '>=') singleExpression            # RelationalExpression
    | singleExpression Instanceof singleExpression                           # InstanceofExpression
    | singleExpression In singleExpression                                   # InExpression
    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression        # EqualityExpression
    | singleExpression '&' singleExpression                                  # BitAndExpression
    | singleExpression '^' singleExpression                                  # BitXOrExpression
    | singleExpression '|' singleExpression                                  # BitOrExpression
    | singleExpression '&&' singleExpression                                 # LogicalAndExpression
    | singleExpression '||' singleExpression                                 # LogicalOrExpression
    | singleExpression '?' singleExpression ':' singleExpression             # TernaryExpression
    | singleExpression '=' singleExpression                                  # AssignmentExpression
    | singleExpression assignmentOperator singleExpression                   # AssignmentOperatorExpression
    | singleExpression TemplateStringLiteral                                 # TemplateStringExpression  // ECMAScript 6
    | This                                                                   # ThisExpression
    | Identifier                                                             # IdentifierExpression
    | Super                                                                  # SuperExpression
    | literal                                                                # LiteralExpression
    | arrayLiteral                                                           # ArrayLiteralExpression
    | objectLiteral                                                          # ObjectLiteralExpression
    | '(' expressionSequence ')'                                             # ParenthesizedExpression
    | arrowFunctionParameters '=>' arrowFunctionBody                         # ArrowFunctionExpression   // ECMAScript 6
    ;

arrowFunctionParameters
    : Identifier
    | '(' formalParameterList? ')'
    ;

arrowFunctionBody
    : singleExpression
    | '{' functionBody '}'
    ;

assignmentOperator
    : '*='
    | '/='
    | '%='
    | '+='
    | '-='
    | '<<='
    | '>>='
    | '>>>='
    | '&='
    | '^='
    | '|='
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | TemplateStringLiteral
    | RegularExpressionLiteral
    | numericLiteral
    ;

numericLiteral
    : DecimalLiteral
    | HexIntegerLiteral
    | OctalIntegerLiteral
    | OctalIntegerLiteral2
    | BinaryIntegerLiteral
    ;

identifierName
    : Identifier
    | reservedWord
    ;

reservedWord
    : keyword
    | NullLiteral
    | BooleanLiteral
    ;

keyword
    : Break
    | Do
    | Instanceof
    | Typeof
    | Case
    | Else
    | New
    | Var
    | Catch
    | Finally
    | Return
    | Void
    | Continue
    | For
    | Switch
    | While
    | Debugger
    | Function
    | This
    | With
    | Default
    | If
    | Throw
    | Delete
    | In
    | Try

    | Class
    | Enum
    | Extends
    | Super
    | Const
    | Export
    | Import
    | Implements
    | Let
    | Private
    | Public
    | Interface
    | Package
    | Protected
    | Static
    | Yield
    ;



getter
    : Identifier{this.p("get")}? propertyName
    ;

setter
    : Identifier{this.p("set")}? propertyName
    ;

eos
    : SemiColon
    | EOF
    | {this.lineTerminatorAhead()}?
    | {this.closeBrace()}?
    ;