// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Vyper.g4 by ANTLR 4.7

package edu.cwru.rise.vyper.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VyperParser}.
 */
public interface VyperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VyperParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(VyperParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(VyperParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(VyperParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(VyperParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#customUnitDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterCustomUnitDeclarations(VyperParser.CustomUnitDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#customUnitDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitCustomUnitDeclarations(VyperParser.CustomUnitDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#customUnitDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCustomUnitDeclaration(VyperParser.CustomUnitDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#customUnitDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCustomUnitDeclaration(VyperParser.CustomUnitDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(VyperParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(VyperParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclarations(VyperParser.ImportDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclarations(VyperParser.ImportDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(VyperParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(VyperParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#extracting_Interfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtracting_Interfaces(VyperParser.Extracting_InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#extracting_Interfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtracting_Interfaces(VyperParser.Extracting_InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#contract_Interfaces}.
	 * @param ctx the parse tree
	 */
	void enterContract_Interfaces(VyperParser.Contract_InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#contract_Interfaces}.
	 * @param ctx the parse tree
	 */
	void exitContract_Interfaces(VyperParser.Contract_InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#contract_def}.
	 * @param ctx the parse tree
	 */
	void enterContract_def(VyperParser.Contract_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#contract_def}.
	 * @param ctx the parse tree
	 */
	void exitContract_def(VyperParser.Contract_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(VyperParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(VyperParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VyperParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VyperParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(VyperParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(VyperParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void enterIntegerValue(VyperParser.IntegerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void exitIntegerValue(VyperParser.IntegerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#unitType}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(VyperParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#unitType}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(VyperParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#customUnitType}.
	 * @param ctx the parse tree
	 */
	void enterCustomUnitType(VyperParser.CustomUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#customUnitType}.
	 * @param ctx the parse tree
	 */
	void exitCustomUnitType(VyperParser.CustomUnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#definedType}.
	 * @param ctx the parse tree
	 */
	void enterDefinedType(VyperParser.DefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#definedType}.
	 * @param ctx the parse tree
	 */
	void exitDefinedType(VyperParser.DefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(VyperParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(VyperParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(VyperParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(VyperParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#structVar}.
	 * @param ctx the parse tree
	 */
	void enterStructVar(VyperParser.StructVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#structVar}.
	 * @param ctx the parse tree
	 */
	void exitStructVar(VyperParser.StructVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#mappingType}.
	 * @param ctx the parse tree
	 */
	void enterMappingType(VyperParser.MappingTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#mappingType}.
	 * @param ctx the parse tree
	 */
	void exitMappingType(VyperParser.MappingTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(VyperParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(VyperParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(VyperParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(VyperParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(VyperParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(VyperParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(VyperParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(VyperParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(VyperParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(VyperParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(VyperParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(VyperParser.FunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(VyperParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(VyperParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VyperParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VyperParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(VyperParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(VyperParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#localVar}.
	 * @param ctx the parse tree
	 */
	void enterLocalVar(VyperParser.LocalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#localVar}.
	 * @param ctx the parse tree
	 */
	void exitLocalVar(VyperParser.LocalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(VyperParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(VyperParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(VyperParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(VyperParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(VyperParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(VyperParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(VyperParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(VyperParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(VyperParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(VyperParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VyperParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VyperParser.IdentifierContext ctx);
}