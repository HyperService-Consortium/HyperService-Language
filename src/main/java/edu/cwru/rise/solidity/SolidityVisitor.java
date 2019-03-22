package edu.cwru.rise.solidity;

import edu.cwru.rise.solidity.parser.SolidityBaseVisitor;

import java.util.ArrayList;
import java.util.List;


class Type {
    String name;
}

class Mapping extends Type {
    Type keytype;
    Type valuetype;
}

class Array extends Type {
    Type elemType;
    int length;
}


class Field {
    Type type;
    String name;
}

class Parameter{
    Type type;
    String name;
}

enum Modifier{

}

class Function{
    List<Parameter> args = new ArrayList<>();
    List<Parameter> returns = new ArrayList<>();
    String name;

}

class Contract {

}

public class SolidityVisitor extends SolidityBaseVisitor {

}
