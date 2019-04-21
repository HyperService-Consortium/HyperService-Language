// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/viper.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link viperParser}.
 */
public interface viperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link viperParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(viperParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(viperParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(viperParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(viperParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(viperParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(viperParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(viperParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(viperParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(viperParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(viperParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(viperParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(viperParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(viperParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(viperParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(viperParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(viperParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(viperParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(viperParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(viperParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(viperParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(viperParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(viperParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(viperParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(viperParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(viperParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(viperParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(viperParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(viperParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(viperParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(viperParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(viperParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(viperParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(viperParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(viperParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(viperParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(viperParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(viperParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(viperParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(viperParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(viperParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(viperParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(viperParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(viperParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(viperParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(viperParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(viperParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(viperParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(viperParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(viperParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(viperParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(viperParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(viperParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(viperParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(viperParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(viperParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(viperParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(viperParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(viperParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(viperParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(viperParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(viperParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(viperParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(viperParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(viperParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(viperParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(viperParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(viperParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(viperParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(viperParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(viperParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#contract_global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContract_global_stmt(viperParser.Contract_global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#contract_global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContract_global_stmt(viperParser.Contract_global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(viperParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(viperParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(viperParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(viperParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(viperParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(viperParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(viperParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(viperParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(viperParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(viperParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(viperParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(viperParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(viperParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(viperParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(viperParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(viperParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(viperParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(viperParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(viperParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(viperParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(viperParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(viperParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(viperParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(viperParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(viperParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(viperParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(viperParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(viperParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(viperParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(viperParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(viperParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(viperParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(viperParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(viperParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(viperParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(viperParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(viperParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(viperParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(viperParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(viperParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(viperParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(viperParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(viperParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(viperParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(viperParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(viperParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(viperParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(viperParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(viperParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(viperParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(viperParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(viperParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(viperParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(viperParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(viperParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(viperParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(viperParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(viperParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(viperParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(viperParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(viperParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(viperParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(viperParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(viperParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(viperParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(viperParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(viperParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(viperParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(viperParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(viperParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(viperParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(viperParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(viperParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(viperParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(viperParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(viperParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(viperParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(viperParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(viperParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(viperParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(viperParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(viperParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(viperParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(viperParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(viperParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(viperParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(viperParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(viperParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(viperParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(viperParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(viperParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(viperParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#strr}.
	 * @param ctx the parse tree
	 */
	void enterStrr(viperParser.StrrContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#strr}.
	 * @param ctx the parse tree
	 */
	void exitStrr(viperParser.StrrContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(viperParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(viperParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link viperParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(viperParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link viperParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(viperParser.IntegerContext ctx);
}