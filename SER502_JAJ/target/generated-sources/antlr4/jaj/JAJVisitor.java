// Generated from JAJ.g4 by ANTLR 4.4
package jaj;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JAJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JAJVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JAJParser#block_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_scope(@NotNull JAJParser.Block_scopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull JAJParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull JAJParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#stack_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_operations(@NotNull JAJParser.Stack_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(@NotNull JAJParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull JAJParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull JAJParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull JAJParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull JAJParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#paramDefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDefs(@NotNull JAJParser.ParamDefsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull JAJParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(@NotNull JAJParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JAJParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull JAJParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#stack_top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_top(@NotNull JAJParser.Stack_topContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull JAJParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull JAJParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull JAJParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull JAJParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(@NotNull JAJParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#global_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_scope(@NotNull JAJParser.Global_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(@NotNull JAJParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull JAJParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull JAJParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull JAJParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull JAJParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull JAJParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link JAJParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull JAJParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull JAJParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull JAJParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#stack_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_init(@NotNull JAJParser.Stack_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link JAJParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull JAJParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(@NotNull JAJParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull JAJParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JAJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull JAJParser.AndExprContext ctx);
}