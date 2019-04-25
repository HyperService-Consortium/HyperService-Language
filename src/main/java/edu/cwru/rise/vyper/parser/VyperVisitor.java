// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Vyper.g4 by ANTLR 4.7

package edu.cwru.rise.vyper.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VyperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VyperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VyperParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(VyperParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(VyperParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#customUnitDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomUnitDeclarations(VyperParser.CustomUnitDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#customUnitDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomUnitDeclaration(VyperParser.CustomUnitDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(VyperParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#importDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclarations(VyperParser.ImportDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(VyperParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#extracting_Interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtracting_Interfaces(VyperParser.Extracting_InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#contract_Interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_Interfaces(VyperParser.Contract_InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#contract_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_def(VyperParser.Contract_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(VyperParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#custom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom(VyperParser.CustomContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(VyperParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(VyperParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#unitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitType(VyperParser.UnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#customUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomUnitType(VyperParser.CustomUnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#definedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedType(VyperParser.DefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(VyperParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(VyperParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#structVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVar(VyperParser.StructVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#mappingType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingType(VyperParser.MappingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(VyperParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(VyperParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#eventParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameterList(VyperParser.EventParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#eventParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameter(VyperParser.EventParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(VyperParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(VyperParser.FunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(VyperParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(VyperParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(VyperParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VyperParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(VyperParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#localVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVar(VyperParser.LocalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(VyperParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(VyperParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(VyperParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(VyperParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(VyperParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VyperParser.IdentifierContext ctx);
}