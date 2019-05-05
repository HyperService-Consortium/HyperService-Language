// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Golang.g4 by ANTLR 4.7

package edu.cwru.rise.golang.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GolangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GolangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(GolangParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageClause(GolangParser.PackageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(GolangParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(GolangParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(GolangParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDecl(GolangParser.TopLevelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GolangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(GolangParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(GolangParser.ConstSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(GolangParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GolangParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(GolangParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(GolangParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(GolangParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GolangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(GolangParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(GolangParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GolangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(GolangParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GolangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(GolangParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GolangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(GolangParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(GolangParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStmt(GolangParser.SendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(GolangParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GolangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(GolangParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVarDecl(GolangParser.ShortVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(GolangParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(GolangParser.LabeledStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(GolangParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(GolangParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(GolangParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(GolangParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthroughStmt(GolangParser.FallthroughStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStmt(GolangParser.DeferStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GolangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(GolangParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchStmt(GolangParser.ExprSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseClause(GolangParser.ExprCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchCase(GolangParser.ExprSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchStmt(GolangParser.TypeSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchGuard(GolangParser.TypeSwitchGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClause(GolangParser.TypeCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchCase(GolangParser.TypeSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(GolangParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(GolangParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommClause(GolangParser.CommClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommCase(GolangParser.CommCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecvStmt(GolangParser.RecvStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GolangParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(GolangParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(GolangParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoStmt(GolangParser.GoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GolangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GolangParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(GolangParser.TypeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(GolangParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(GolangParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(GolangParser.ElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(GolangParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(GolangParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(GolangParser.SliceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(GolangParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelType(GolangParser.ChannelTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(GolangParser.MethodSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(GolangParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(GolangParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(GolangParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GolangParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GolangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(GolangParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GolangParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GolangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(GolangParser.BasicLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandName(GolangParser.OperandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLit(GolangParser.CompositeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralType(GolangParser.LiteralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(GolangParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(GolangParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedElement(GolangParser.KeyedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(GolangParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GolangParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(GolangParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(GolangParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousField(GolangParser.AnonymousFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLit(GolangParser.FunctionLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(GolangParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(GolangParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(GolangParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(GolangParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertion(GolangParser.TypeAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GolangParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpr(GolangParser.MethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(GolangParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GolangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(GolangParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(GolangParser.ConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(GolangParser.EosContext ctx);
}