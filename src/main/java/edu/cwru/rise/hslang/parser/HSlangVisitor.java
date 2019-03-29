// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/HSlang.g4 by ANTLR 4.7

package edu.cwru.rise.hslang.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HSlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HSlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HSlangParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(HSlangParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(HSlangParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(HSlangParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(HSlangParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#accountSpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccountSpc(HSlangParser.AccountSpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#contractSpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractSpc(HSlangParser.ContractSpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#contractAddr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractAddr(HSlangParser.ContractAddrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#opSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSpec(HSlangParser.OpSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#numericallit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericallit(HSlangParser.NumericallitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#paymentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaymentSpec(HSlangParser.PaymentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#contractInvocationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(HSlangParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(HSlangParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#depSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepSection(HSlangParser.DepSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#depSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepSpec(HSlangParser.DepSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(HSlangParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandName(HSlangParser.OperandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(HSlangParser.QualifiedIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HSlangParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(HSlangParser.EosContext ctx);
}