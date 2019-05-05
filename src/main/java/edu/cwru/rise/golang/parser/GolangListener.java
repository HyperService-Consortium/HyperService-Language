// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Golang.g4 by ANTLR 4.7

package edu.cwru.rise.golang.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GolangParser}.
 */
public interface GolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(GolangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(GolangParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void enterPackageClause(GolangParser.PackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void exitPackageClause(GolangParser.PackageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(GolangParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(GolangParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(GolangParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(GolangParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(GolangParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(GolangParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(GolangParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(GolangParser.TopLevelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GolangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GolangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(GolangParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(GolangParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(GolangParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(GolangParser.ConstSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(GolangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(GolangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GolangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GolangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(GolangParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(GolangParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(GolangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(GolangParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(GolangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(GolangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GolangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GolangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(GolangParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(GolangParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(GolangParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(GolangParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GolangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GolangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(GolangParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(GolangParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GolangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GolangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(GolangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(GolangParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GolangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GolangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(GolangParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(GolangParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(GolangParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(GolangParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendStmt(GolangParser.SendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sendStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendStmt(GolangParser.SendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(GolangParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(GolangParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GolangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GolangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(GolangParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(GolangParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDecl(GolangParser.ShortVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDecl(GolangParser.ShortVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(GolangParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(GolangParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStmt(GolangParser.LabeledStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStmt(GolangParser.LabeledStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(GolangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(GolangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(GolangParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(GolangParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(GolangParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(GolangParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(GolangParser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(GolangParser.GotoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStmt(GolangParser.FallthroughStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStmt(GolangParser.FallthroughStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(GolangParser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(GolangParser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GolangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GolangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(GolangParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(GolangParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchStmt(GolangParser.ExprSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchStmt(GolangParser.ExprSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseClause(GolangParser.ExprCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseClause(GolangParser.ExprCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchCase(GolangParser.ExprSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchCase(GolangParser.ExprSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchStmt(GolangParser.TypeSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchStmt(GolangParser.TypeSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchGuard(GolangParser.TypeSwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchGuard(GolangParser.TypeSwitchGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(GolangParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(GolangParser.TypeCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCase(GolangParser.TypeSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCase(GolangParser.TypeSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(GolangParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(GolangParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(GolangParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(GolangParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 */
	void enterCommClause(GolangParser.CommClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#commClause}.
	 * @param ctx the parse tree
	 */
	void exitCommClause(GolangParser.CommClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 */
	void enterCommCase(GolangParser.CommCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#commCase}.
	 * @param ctx the parse tree
	 */
	void exitCommCase(GolangParser.CommCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void enterRecvStmt(GolangParser.RecvStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void exitRecvStmt(GolangParser.RecvStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GolangParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GolangParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(GolangParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(GolangParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(GolangParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(GolangParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoStmt(GolangParser.GoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#goStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoStmt(GolangParser.GoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GolangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GolangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GolangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GolangParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(GolangParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(GolangParser.TypeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(GolangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(GolangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(GolangParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(GolangParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(GolangParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(GolangParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(GolangParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(GolangParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(GolangParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(GolangParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(GolangParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(GolangParser.SliceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(GolangParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(GolangParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 */
	void enterChannelType(GolangParser.ChannelTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#channelType}.
	 * @param ctx the parse tree
	 */
	void exitChannelType(GolangParser.ChannelTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(GolangParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(GolangParser.MethodSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(GolangParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(GolangParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(GolangParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(GolangParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(GolangParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(GolangParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GolangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GolangParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GolangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GolangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(GolangParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(GolangParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GolangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GolangParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GolangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GolangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(GolangParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(GolangParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(GolangParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(GolangParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLit(GolangParser.CompositeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLit(GolangParser.CompositeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(GolangParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(GolangParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(GolangParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(GolangParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(GolangParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(GolangParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyedElement(GolangParser.KeyedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyedElement(GolangParser.KeyedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(GolangParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(GolangParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GolangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GolangParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(GolangParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(GolangParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(GolangParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(GolangParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousField(GolangParser.AnonymousFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#anonymousField}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousField(GolangParser.AnonymousFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLit(GolangParser.FunctionLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLit(GolangParser.FunctionLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(GolangParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(GolangParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(GolangParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(GolangParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(GolangParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(GolangParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(GolangParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(GolangParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(GolangParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(GolangParser.TypeAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GolangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GolangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(GolangParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(GolangParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(GolangParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(GolangParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GolangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GolangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(GolangParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(GolangParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(GolangParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(GolangParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(GolangParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GolangParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(GolangParser.EosContext ctx);
}