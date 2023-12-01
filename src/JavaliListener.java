// Generated from C:/Users/diego/Desktop/n2/Javali/src/Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaliParser}.
 */
public interface JavaliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaliParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JavaliParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JavaliParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavaliParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavaliParser.ExprContext ctx);
}