// Generated from C:/Users/diego/Desktop/Javali/Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaliParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaliVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaliParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(JavaliParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(JavaliParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(JavaliParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(JavaliParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#seEstrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeEstrutura(JavaliParser.SeEstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#inteiroDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiroDeclaracao(JavaliParser.InteiroDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#realDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealDeclaracao(JavaliParser.RealDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#cadeiaDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadeiaDeclaracao(JavaliParser.CadeiaDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#listaDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracao(JavaliParser.ListaDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#matrizDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrizDeclaracao(JavaliParser.MatrizDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#boleanaDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoleanaDeclaracao(JavaliParser.BoleanaDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#condicaoBoleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicaoBoleana(JavaliParser.CondicaoBoleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#matrizExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrizExpressao(JavaliParser.MatrizExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#matrizEstrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrizEstrutura(JavaliParser.MatrizEstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(JavaliParser.ListaContext ctx);
}