// Generated from JAJ.g4 by ANTLR 4.4
package jaj;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JAJParser}.
 */
public interface JAJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JAJParser#block_scope}.
	 * @param ctx the parse tree
	 */
	void enterBlock_scope(@NotNull JAJParser.Block_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#block_scope}.
	 * @param ctx the parse tree
	 */
	void exitBlock_scope(@NotNull JAJParser.Block_scopeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull JAJParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull JAJParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull JAJParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull JAJParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#stack_operations}.
	 * @param ctx the parse tree
	 */
	void enterStack_operations(@NotNull JAJParser.Stack_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#stack_operations}.
	 * @param ctx the parse tree
	 */
	void exitStack_operations(@NotNull JAJParser.Stack_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull JAJParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull JAJParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull JAJParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull JAJParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull JAJParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull JAJParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull JAJParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull JAJParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull JAJParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull JAJParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#paramDefs}.
	 * @param ctx the parse tree
	 */
	void enterParamDefs(@NotNull JAJParser.ParamDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#paramDefs}.
	 * @param ctx the parse tree
	 */
	void exitParamDefs(@NotNull JAJParser.ParamDefsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull JAJParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull JAJParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull JAJParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull JAJParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JAJParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JAJParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull JAJParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull JAJParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#stack_top}.
	 * @param ctx the parse tree
	 */
	void enterStack_top(@NotNull JAJParser.Stack_topContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#stack_top}.
	 * @param ctx the parse tree
	 */
	void exitStack_top(@NotNull JAJParser.Stack_topContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull JAJParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull JAJParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull JAJParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull JAJParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull JAJParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull JAJParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull JAJParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull JAJParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull JAJParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull JAJParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#global_scope}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_scope(@NotNull JAJParser.Global_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#global_scope}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_scope(@NotNull JAJParser.Global_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(@NotNull JAJParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(@NotNull JAJParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull JAJParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull JAJParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull JAJParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull JAJParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull JAJParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull JAJParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull JAJParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull JAJParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull JAJParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull JAJParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull JAJParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull JAJParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull JAJParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull JAJParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull JAJParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull JAJParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#stack_init}.
	 * @param ctx the parse tree
	 */
	void enterStack_init(@NotNull JAJParser.Stack_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#stack_init}.
	 * @param ctx the parse tree
	 */
	void exitStack_init(@NotNull JAJParser.Stack_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link JAJParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull JAJParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JAJParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull JAJParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull JAJParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull JAJParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull JAJParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull JAJParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull JAJParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull JAJParser.AndExprContext ctx);
}