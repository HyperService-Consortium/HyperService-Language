// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/HSlang.g4 by ANTLR 4.7

package edu.cwru.rise.hslang.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HSlangParser}.
 */
public interface HSlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HSlangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(HSlangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(HSlangParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(HSlangParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(HSlangParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(HSlangParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(HSlangParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(HSlangParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(HSlangParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#accountSpc}.
	 * @param ctx the parse tree
	 */
	void enterAccountSpc(HSlangParser.AccountSpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#accountSpc}.
	 * @param ctx the parse tree
	 */
	void exitAccountSpc(HSlangParser.AccountSpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#contractSpc}.
	 * @param ctx the parse tree
	 */
	void enterContractSpc(HSlangParser.ContractSpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#contractSpc}.
	 * @param ctx the parse tree
	 */
	void exitContractSpc(HSlangParser.ContractSpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#contractAddr}.
	 * @param ctx the parse tree
	 */
	void enterContractAddr(HSlangParser.ContractAddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#contractAddr}.
	 * @param ctx the parse tree
	 */
	void exitContractAddr(HSlangParser.ContractAddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#opSpec}.
	 * @param ctx the parse tree
	 */
	void enterOpSpec(HSlangParser.OpSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#opSpec}.
	 * @param ctx the parse tree
	 */
	void exitOpSpec(HSlangParser.OpSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#numericallit}.
	 * @param ctx the parse tree
	 */
	void enterNumericallit(HSlangParser.NumericallitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#numericallit}.
	 * @param ctx the parse tree
	 */
	void exitNumericallit(HSlangParser.NumericallitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#paymentSpec}.
	 * @param ctx the parse tree
	 */
	void enterPaymentSpec(HSlangParser.PaymentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#paymentSpec}.
	 * @param ctx the parse tree
	 */
	void exitPaymentSpec(HSlangParser.PaymentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#contractInvocationSpec}.
	 * @param ctx the parse tree
	 */
	void enterContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#contractInvocationSpec}.
	 * @param ctx the parse tree
	 */
	void exitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(HSlangParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(HSlangParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(HSlangParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(HSlangParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#depSection}.
	 * @param ctx the parse tree
	 */
	void enterDepSection(HSlangParser.DepSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#depSection}.
	 * @param ctx the parse tree
	 */
	void exitDepSection(HSlangParser.DepSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#depSpec}.
	 * @param ctx the parse tree
	 */
	void enterDepSpec(HSlangParser.DepSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#depSpec}.
	 * @param ctx the parse tree
	 */
	void exitDepSpec(HSlangParser.DepSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(HSlangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(HSlangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(HSlangParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(HSlangParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(HSlangParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(HSlangParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HSlangParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(HSlangParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link HSlangParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(HSlangParser.EosContext ctx);
}