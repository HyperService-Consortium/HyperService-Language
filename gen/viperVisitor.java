// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/viper.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link viperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface viperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link viperParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(viperParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(viperParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(viperParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(viperParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(viperParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(viperParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(viperParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(viperParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(viperParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(viperParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(viperParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(viperParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(viperParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(viperParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(viperParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(viperParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(viperParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(viperParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(viperParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(viperParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(viperParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(viperParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(viperParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(viperParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(viperParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(viperParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(viperParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(viperParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(viperParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(viperParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(viperParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(viperParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(viperParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(viperParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(viperParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#contract_global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_global_stmt(viperParser.Contract_global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(viperParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(viperParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(viperParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(viperParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(viperParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(viperParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(viperParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(viperParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(viperParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(viperParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(viperParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(viperParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(viperParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(viperParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(viperParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(viperParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(viperParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(viperParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(viperParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(viperParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(viperParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(viperParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(viperParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(viperParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(viperParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(viperParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(viperParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(viperParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(viperParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(viperParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(viperParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(viperParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(viperParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(viperParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(viperParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(viperParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(viperParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(viperParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(viperParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(viperParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(viperParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(viperParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(viperParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(viperParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(viperParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(viperParser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#strr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrr(viperParser.StrrContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(viperParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link viperParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(viperParser.IntegerContext ctx);
}