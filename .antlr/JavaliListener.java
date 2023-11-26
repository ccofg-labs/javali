// Generated from c:/Users/diego/Desktop/Javali/Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaliParser}.
 */
public interface JavaliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaliParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(JavaliParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(JavaliParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(JavaliParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(JavaliParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#declaracaoTipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoTipoPrimitivo(JavaliParser.DeclaracaoTipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#declaracaoTipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoTipoPrimitivo(JavaliParser.DeclaracaoTipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#declaracaoInteiro}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoInteiro(JavaliParser.DeclaracaoInteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#declaracaoInteiro}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoInteiro(JavaliParser.DeclaracaoInteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#expressaoAritmetricaInteiro}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetricaInteiro(JavaliParser.ExpressaoAritmetricaInteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#expressaoAritmetricaInteiro}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetricaInteiro(JavaliParser.ExpressaoAritmetricaInteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#realDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterRealDeclaracao(JavaliParser.RealDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#realDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitRealDeclaracao(JavaliParser.RealDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#cadeiaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterCadeiaDeclaracao(JavaliParser.CadeiaDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#cadeiaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitCadeiaDeclaracao(JavaliParser.CadeiaDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracao(JavaliParser.ListaDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracao(JavaliParser.ListaDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#matrizDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterMatrizDeclaracao(JavaliParser.MatrizDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#matrizDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitMatrizDeclaracao(JavaliParser.MatrizDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#boleanaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterBoleanaDeclaracao(JavaliParser.BoleanaDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#boleanaDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitBoleanaDeclaracao(JavaliParser.BoleanaDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#matrizExpressao}.
	 * @param ctx the parse tree
	 */
	void enterMatrizExpressao(JavaliParser.MatrizExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#matrizExpressao}.
	 * @param ctx the parse tree
	 */
	void exitMatrizExpressao(JavaliParser.MatrizExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#matrizEstrutura}.
	 * @param ctx the parse tree
	 */
	void enterMatrizEstrutura(JavaliParser.MatrizEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#matrizEstrutura}.
	 * @param ctx the parse tree
	 */
	void exitMatrizEstrutura(JavaliParser.MatrizEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(JavaliParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(JavaliParser.ListaContext ctx);
}