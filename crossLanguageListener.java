// Generated from ./crossLanguage.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link crossLanguageParser}.
 */
public interface crossLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#vai}.
	 * @param ctx the parse tree
	 */
	void enterVai(crossLanguageParser.VaiContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#vai}.
	 * @param ctx the parse tree
	 */
	void exitVai(crossLanguageParser.VaiContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(crossLanguageParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(crossLanguageParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(crossLanguageParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(crossLanguageParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(crossLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(crossLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(crossLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(crossLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(crossLanguageParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(crossLanguageParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(crossLanguageParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(crossLanguageParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(crossLanguageParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(crossLanguageParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(crossLanguageParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(crossLanguageParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#scanf}.
	 * @param ctx the parse tree
	 */
	void enterScanf(crossLanguageParser.ScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#scanf}.
	 * @param ctx the parse tree
	 */
	void exitScanf(crossLanguageParser.ScanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(crossLanguageParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(crossLanguageParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(crossLanguageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(crossLanguageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#printTypes}.
	 * @param ctx the parse tree
	 */
	void enterPrintTypes(crossLanguageParser.PrintTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#printTypes}.
	 * @param ctx the parse tree
	 */
	void exitPrintTypes(crossLanguageParser.PrintTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link crossLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(crossLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link crossLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(crossLanguageParser.PrimaryContext ctx);
}