// Generated from C:/Users/diego/Desktop/Javali/Javali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaliParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINAL=1, WS=2, COMENTARIO=3, LINHA_COMENTARIO=4, DIGITO_LITERAL=5, REAL_LITERAL=6, 
		BOLEANA_LITERAL=7, CADEIA_LITERAL=8, INT=9, REAL=10, CADEIA=11, LISTA_UNIFORME=12, 
		LISTA_DIVERSA=13, BOLEANA=14, SOMA=15, SUBTRACAO=16, DIVISAO=17, MULTIPLICACAO=18, 
		IGUAL=19, IGUALDADE=20, DIFERENTE=21, MENOR_IGUAL=22, MAIOR_IGUAL=23, 
		E_LOGICO=24, OU_LOGICO=25, NEGACAO_LOGICA=26, ABRE_CHAVE=27, FECHA_CHAVE=28, 
		ABRE_COLCHETE=29, FECHA_COLCHETE=30, ABRE_PARENTESE=31, FECHA_PARENTESE=32, 
		PONTO_E_VIRGULA=33, ASPAS_DUPLAS=34, DOIS_PONTOS=35, PONTO=36, VIRGULA=37, 
		IDENTIFICADOR=38, SE=39, SENAO=40, ENTAO=41;
	public static final int
		RULE_programa = 0, RULE_estrutura = 1, RULE_tipoPrimitivo = 2, RULE_atribuicao = 3, 
		RULE_seEstrutura = 4, RULE_inteiroDeclaracao = 5, RULE_realDeclaracao = 6, 
		RULE_cadeiaDeclaracao = 7, RULE_listaDeclaracao = 8, RULE_matrizDeclaracao = 9, 
		RULE_boleanaDeclaracao = 10, RULE_condicaoBoleana = 11, RULE_matrizExpressao = 12, 
		RULE_matrizEstrutura = 13, RULE_lista = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "estrutura", "tipoPrimitivo", "atribuicao", "seEstrutura", 
			"inteiroDeclaracao", "realDeclaracao", "cadeiaDeclaracao", "listaDeclaracao", 
			"matrizDeclaracao", "boleanaDeclaracao", "condicaoBoleana", "matrizExpressao", 
			"matrizEstrutura", "lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'inteiro'", "'real'", 
			"'cadeia'", "'lista'", "'matriz'", "'boleana'", "'+'", "'-'", "'/'", 
			"'*'", "'='", "'=='", "'!='", "'<='", "'>='", "'and'", "'or'", "'not'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", "':'", "'.'", 
			"','", null, "'se'", "'senao'", "'entao'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINAL", "WS", "COMENTARIO", "LINHA_COMENTARIO", "DIGITO_LITERAL", 
			"REAL_LITERAL", "BOLEANA_LITERAL", "CADEIA_LITERAL", "INT", "REAL", "CADEIA", 
			"LISTA_UNIFORME", "LISTA_DIVERSA", "BOLEANA", "SOMA", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "IGUAL", "IGUALDADE", "DIFERENTE", "MENOR_IGUAL", "MAIOR_IGUAL", 
			"E_LOGICO", "OU_LOGICO", "NEGACAO_LOGICA", "ABRE_CHAVE", "FECHA_CHAVE", 
			"ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_PARENTESE", "FECHA_PARENTESE", 
			"PONTO_E_VIRGULA", "ASPAS_DUPLAS", "DOIS_PONTOS", "PONTO", "VIRGULA", 
			"IDENTIFICADOR", "SE", "SENAO", "ENTAO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Javali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaliParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824767970832L) != 0)) {
				{
				{
				setState(30);
				estrutura();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstruturaContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(JavaliParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(JavaliParser.FECHA_CHAVE, 0); }
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public SeEstruturaContext seEstrutura() {
			return getRuleContext(SeEstruturaContext.class,0);
		}
		public TerminalNode LINHA_COMENTARIO() { return getToken(JavaliParser.LINHA_COMENTARIO, 0); }
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estrutura);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ABRE_CHAVE);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824767970832L) != 0)) {
					{
					{
					setState(37);
					estrutura();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(FECHA_CHAVE);
				}
				break;
			case INT:
			case REAL:
			case CADEIA:
			case LISTA_UNIFORME:
			case LISTA_DIVERSA:
			case BOLEANA:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				tipoPrimitivo();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				seEstrutura();
				}
				break;
			case LINHA_COMENTARIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(LINHA_COMENTARIO);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				atribuicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoPrimitivoContext extends ParserRuleContext {
		public InteiroDeclaracaoContext inteiroDeclaracao() {
			return getRuleContext(InteiroDeclaracaoContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public RealDeclaracaoContext realDeclaracao() {
			return getRuleContext(RealDeclaracaoContext.class,0);
		}
		public CadeiaDeclaracaoContext cadeiaDeclaracao() {
			return getRuleContext(CadeiaDeclaracaoContext.class,0);
		}
		public ListaDeclaracaoContext listaDeclaracao() {
			return getRuleContext(ListaDeclaracaoContext.class,0);
		}
		public MatrizDeclaracaoContext matrizDeclaracao() {
			return getRuleContext(MatrizDeclaracaoContext.class,0);
		}
		public BoleanaDeclaracaoContext boleanaDeclaracao() {
			return getRuleContext(BoleanaDeclaracaoContext.class,0);
		}
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitTipoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipoPrimitivo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				inteiroDeclaracao();
				setState(51);
				match(PONTO_E_VIRGULA);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				realDeclaracao();
				setState(54);
				match(PONTO_E_VIRGULA);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				cadeiaDeclaracao();
				}
				break;
			case LISTA_UNIFORME:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				listaDeclaracao();
				}
				break;
			case LISTA_DIVERSA:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				matrizDeclaracao();
				}
				break;
			case BOLEANA:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				boleanaDeclaracao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode DIGITO_LITERAL() { return getToken(JavaliParser.DIGITO_LITERAL, 0); }
		public TerminalNode SINAL() { return getToken(JavaliParser.SINAL, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFICADOR);
			setState(63);
			match(IGUAL);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINAL:
			case DIGITO_LITERAL:
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINAL) {
					{
					setState(64);
					match(SINAL);
					}
				}

				setState(67);
				match(DIGITO_LITERAL);
				}
				break;
			case IDENTIFICADOR:
				{
				setState(68);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			match(PONTO_E_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeEstruturaContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(JavaliParser.SE, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(JavaliParser.ABRE_PARENTESE, 0); }
		public CondicaoBoleanaContext condicaoBoleana() {
			return getRuleContext(CondicaoBoleanaContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(JavaliParser.FECHA_PARENTESE, 0); }
		public TerminalNode ENTAO() { return getToken(JavaliParser.ENTAO, 0); }
		public List<TerminalNode> ABRE_CHAVE() { return getTokens(JavaliParser.ABRE_CHAVE); }
		public TerminalNode ABRE_CHAVE(int i) {
			return getToken(JavaliParser.ABRE_CHAVE, i);
		}
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public List<TerminalNode> FECHA_CHAVE() { return getTokens(JavaliParser.FECHA_CHAVE); }
		public TerminalNode FECHA_CHAVE(int i) {
			return getToken(JavaliParser.FECHA_CHAVE, i);
		}
		public TerminalNode SENAO() { return getToken(JavaliParser.SENAO, 0); }
		public SeEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seEstrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterSeEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitSeEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitSeEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeEstruturaContext seEstrutura() throws RecognitionException {
		SeEstruturaContext _localctx = new SeEstruturaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(SE);
			setState(74);
			match(ABRE_PARENTESE);
			setState(75);
			condicaoBoleana();
			setState(76);
			match(FECHA_PARENTESE);
			setState(77);
			match(ENTAO);
			setState(78);
			match(ABRE_CHAVE);
			setState(79);
			estrutura();
			setState(80);
			match(FECHA_CHAVE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(81);
				match(SENAO);
				setState(82);
				match(ABRE_CHAVE);
				setState(83);
				estrutura();
				setState(84);
				match(FECHA_CHAVE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InteiroDeclaracaoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaliParser.INT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode DIGITO_LITERAL() { return getToken(JavaliParser.DIGITO_LITERAL, 0); }
		public TerminalNode SINAL() { return getToken(JavaliParser.SINAL, 0); }
		public InteiroDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiroDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterInteiroDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitInteiroDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitInteiroDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroDeclaracaoContext inteiroDeclaracao() throws RecognitionException {
		InteiroDeclaracaoContext _localctx = new InteiroDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inteiroDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(INT);
			setState(89);
			match(IDENTIFICADOR);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(90);
				match(IGUAL);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINAL) {
					{
					setState(91);
					match(SINAL);
					}
				}

				setState(94);
				match(DIGITO_LITERAL);
				}
				}
			}

			setState(97);
			match(PONTO_E_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealDeclaracaoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(JavaliParser.REAL, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(JavaliParser.REAL_LITERAL, 0); }
		public RealDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterRealDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitRealDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitRealDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealDeclaracaoContext realDeclaracao() throws RecognitionException {
		RealDeclaracaoContext _localctx = new RealDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_realDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(REAL);
			setState(100);
			match(IDENTIFICADOR);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(101);
				match(IGUAL);
				setState(102);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				{
				setState(103);
				match(IGUAL);
				setState(104);
				match(REAL_LITERAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadeiaDeclaracaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(JavaliParser.CADEIA, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode CADEIA_LITERAL() { return getToken(JavaliParser.CADEIA_LITERAL, 0); }
		public CadeiaDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadeiaDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterCadeiaDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitCadeiaDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitCadeiaDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadeiaDeclaracaoContext cadeiaDeclaracao() throws RecognitionException {
		CadeiaDeclaracaoContext _localctx = new CadeiaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cadeiaDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CADEIA);
			setState(108);
			match(IDENTIFICADOR);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(109);
				match(IGUAL);
				setState(110);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				{
				setState(111);
				match(IGUAL);
				setState(112);
				match(CADEIA_LITERAL);
				}
				break;
			}
			setState(115);
			match(PONTO_E_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDeclaracaoContext extends ParserRuleContext {
		public TerminalNode LISTA_UNIFORME() { return getToken(JavaliParser.LISTA_UNIFORME, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ListaDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterListaDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitListaDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitListaDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracaoContext listaDeclaracao() throws RecognitionException {
		ListaDeclaracaoContext _localctx = new ListaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LISTA_UNIFORME);
			setState(118);
			match(IDENTIFICADOR);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(119);
				match(IGUAL);
				setState(120);
				lista();
				}
			}

			setState(123);
			match(PONTO_E_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrizDeclaracaoContext extends ParserRuleContext {
		public TerminalNode LISTA_DIVERSA() { return getToken(JavaliParser.LISTA_DIVERSA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public MatrizExpressaoContext matrizExpressao() {
			return getRuleContext(MatrizExpressaoContext.class,0);
		}
		public MatrizDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMatrizDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMatrizDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitMatrizDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizDeclaracaoContext matrizDeclaracao() throws RecognitionException {
		MatrizDeclaracaoContext _localctx = new MatrizDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matrizDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LISTA_DIVERSA);
			setState(126);
			match(IDENTIFICADOR);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(127);
				match(IGUAL);
				setState(128);
				matrizExpressao();
				}
			}

			setState(131);
			match(PONTO_E_VIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoleanaDeclaracaoContext extends ParserRuleContext {
		public TerminalNode BOLEANA() { return getToken(JavaliParser.BOLEANA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public CondicaoBoleanaContext condicaoBoleana() {
			return getRuleContext(CondicaoBoleanaContext.class,0);
		}
		public BoleanaDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boleanaDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterBoleanaDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitBoleanaDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitBoleanaDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoleanaDeclaracaoContext boleanaDeclaracao() throws RecognitionException {
		BoleanaDeclaracaoContext _localctx = new BoleanaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boleanaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(BOLEANA);
			setState(134);
			match(IDENTIFICADOR);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(135);
				match(IGUAL);
				setState(136);
				condicaoBoleana();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoBoleanaContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESE() { return getToken(JavaliParser.ABRE_PARENTESE, 0); }
		public CondicaoBoleanaContext condicaoBoleana() {
			return getRuleContext(CondicaoBoleanaContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(JavaliParser.FECHA_PARENTESE, 0); }
		public TerminalNode BOLEANA_LITERAL() { return getToken(JavaliParser.BOLEANA_LITERAL, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode E_LOGICO() { return getToken(JavaliParser.E_LOGICO, 0); }
		public TerminalNode OU_LOGICO() { return getToken(JavaliParser.OU_LOGICO, 0); }
		public TerminalNode NEGACAO_LOGICA() { return getToken(JavaliParser.NEGACAO_LOGICA, 0); }
		public List<TerminalNode> REAL_LITERAL() { return getTokens(JavaliParser.REAL_LITERAL); }
		public TerminalNode REAL_LITERAL(int i) {
			return getToken(JavaliParser.REAL_LITERAL, i);
		}
		public List<TerminalNode> DIGITO_LITERAL() { return getTokens(JavaliParser.DIGITO_LITERAL); }
		public TerminalNode DIGITO_LITERAL(int i) {
			return getToken(JavaliParser.DIGITO_LITERAL, i);
		}
		public TerminalNode IGUALDADE() { return getToken(JavaliParser.IGUALDADE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(JavaliParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(JavaliParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(JavaliParser.DIFERENTE, 0); }
		public CondicaoBoleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoBoleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterCondicaoBoleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitCondicaoBoleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitCondicaoBoleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoBoleanaContext condicaoBoleana() throws RecognitionException {
		CondicaoBoleanaContext _localctx = new CondicaoBoleanaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicaoBoleana);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ABRE_PARENTESE);
				setState(140);
				condicaoBoleana();
				setState(141);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(BOLEANA_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGACAO_LOGICA) {
					{
					setState(144);
					match(NEGACAO_LOGICA);
					}
				}

				setState(147);
				match(IDENTIFICADOR);
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877907040L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877907040L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrizExpressaoContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(JavaliParser.ABRE_CHAVE, 0); }
		public List<MatrizEstruturaContext> matrizEstrutura() {
			return getRuleContexts(MatrizEstruturaContext.class);
		}
		public MatrizEstruturaContext matrizEstrutura(int i) {
			return getRuleContext(MatrizEstruturaContext.class,i);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(JavaliParser.FECHA_CHAVE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(JavaliParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaliParser.VIRGULA, i);
		}
		public MatrizExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMatrizExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMatrizExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitMatrizExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizExpressaoContext matrizExpressao() throws RecognitionException {
		MatrizExpressaoContext _localctx = new MatrizExpressaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrizExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ABRE_CHAVE);
			setState(156);
			matrizEstrutura();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(157);
				match(VIRGULA);
				setState(158);
				matrizEstrutura();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrizEstruturaContext extends ParserRuleContext {
		public MatrizExpressaoContext matrizExpressao() {
			return getRuleContext(MatrizExpressaoContext.class,0);
		}
		public TerminalNode DIGITO_LITERAL() { return getToken(JavaliParser.DIGITO_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(JavaliParser.REAL_LITERAL, 0); }
		public TerminalNode BOLEANA_LITERAL() { return getToken(JavaliParser.BOLEANA_LITERAL, 0); }
		public TerminalNode CADEIA_LITERAL() { return getToken(JavaliParser.CADEIA_LITERAL, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public MatrizEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrizEstrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterMatrizEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitMatrizEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitMatrizEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizEstruturaContext matrizEstrutura() throws RecognitionException {
		MatrizEstruturaContext _localctx = new MatrizEstruturaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matrizEstrutura);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				matrizExpressao();
				}
				break;
			case DIGITO_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(DIGITO_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(REAL_LITERAL);
				}
				break;
			case BOLEANA_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(BOLEANA_LITERAL);
				}
				break;
			case CADEIA_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(CADEIA_LITERAL);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETE() { return getToken(JavaliParser.ABRE_COLCHETE, 0); }
		public List<TerminalNode> DIGITO_LITERAL() { return getTokens(JavaliParser.DIGITO_LITERAL); }
		public TerminalNode DIGITO_LITERAL(int i) {
			return getToken(JavaliParser.DIGITO_LITERAL, i);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(JavaliParser.FECHA_COLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(JavaliParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaliParser.VIRGULA, i);
		}
		public List<TerminalNode> REAL_LITERAL() { return getTokens(JavaliParser.REAL_LITERAL); }
		public TerminalNode REAL_LITERAL(int i) {
			return getToken(JavaliParser.REAL_LITERAL, i);
		}
		public List<TerminalNode> BOLEANA_LITERAL() { return getTokens(JavaliParser.BOLEANA_LITERAL); }
		public TerminalNode BOLEANA_LITERAL(int i) {
			return getToken(JavaliParser.BOLEANA_LITERAL, i);
		}
		public List<TerminalNode> CADEIA_LITERAL() { return getTokens(JavaliParser.CADEIA_LITERAL); }
		public TerminalNode CADEIA_LITERAL(int i) {
			return getToken(JavaliParser.CADEIA_LITERAL, i);
		}
		public MatrizExpressaoContext matrizExpressao() {
			return getRuleContext(MatrizExpressaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaliVisitor ) return ((JavaliVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ABRE_COLCHETE);
				setState(175);
				match(DIGITO_LITERAL);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(176);
					match(VIRGULA);
					setState(177);
					match(DIGITO_LITERAL);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(FECHA_COLCHETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ABRE_COLCHETE);
				setState(185);
				match(REAL_LITERAL);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(186);
					match(VIRGULA);
					setState(187);
					match(REAL_LITERAL);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(FECHA_COLCHETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(ABRE_COLCHETE);
				setState(195);
				match(BOLEANA_LITERAL);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(196);
					match(VIRGULA);
					setState(197);
					match(BOLEANA_LITERAL);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(FECHA_COLCHETE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(ABRE_COLCHETE);
				setState(205);
				match(CADEIA_LITERAL);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(206);
					match(VIRGULA);
					setState(207);
					match(CADEIA_LITERAL);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(FECHA_COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				matrizExpressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(IDENTIFICADOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004W\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005"+
		"\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"j\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0082\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009a\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a0\b\f\n\f\f\f\u00a3\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ad"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b3"+
		"\b\u000e\n\u000e\f\u000e\u00b6\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00bd\b\u000e\n\u000e\f\u000e\u00c0"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00c7\b\u000e\n\u000e\f\u000e\u00ca\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d1\b\u000e\n\u000e"+
		"\f\u000e\u00d4\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d9\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001"+
		"\u0000\u0018\u0019\u0002\u0000\u0005\u0006&&\u0001\u0000\u0014\u0017\u00f5"+
		"\u0000!\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004<"+
		"\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\nX\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000e"+
		"k\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012}\u0001"+
		"\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0099\u0001"+
		"\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u00ac\u0001"+
		"\u0000\u0000\u0000\u001c\u00d8\u0001\u0000\u0000\u0000\u001e \u0003\u0002"+
		"\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0001\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$(\u0005\u001b\u0000\u0000"+
		"%\'\u0003\u0002\u0001\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+1\u0005\u001c\u0000\u0000,1\u0003"+
		"\u0004\u0002\u0000-1\u0003\b\u0004\u0000.1\u0005\u0004\u0000\u0000/1\u0003"+
		"\u0006\u0003\u00000$\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u0000"+
		"0-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000"+
		"\u00001\u0003\u0001\u0000\u0000\u000023\u0003\n\u0005\u000034\u0005!\u0000"+
		"\u00004=\u0001\u0000\u0000\u000056\u0003\f\u0006\u000067\u0005!\u0000"+
		"\u00007=\u0001\u0000\u0000\u00008=\u0003\u000e\u0007\u00009=\u0003\u0010"+
		"\b\u0000:=\u0003\u0012\t\u0000;=\u0003\u0014\n\u0000<2\u0001\u0000\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005"+
		"\u0001\u0000\u0000\u0000>?\u0005&\u0000\u0000?E\u0005\u0013\u0000\u0000"+
		"@B\u0005\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CF\u0005\u0005\u0000\u0000DF\u0005&\u0000"+
		"\u0000EA\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0005!\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005"+
		"\'\u0000\u0000JK\u0005\u001f\u0000\u0000KL\u0003\u0016\u000b\u0000LM\u0005"+
		" \u0000\u0000MN\u0005)\u0000\u0000NO\u0005\u001b\u0000\u0000OP\u0003\u0002"+
		"\u0001\u0000PV\u0005\u001c\u0000\u0000QR\u0005(\u0000\u0000RS\u0005\u001b"+
		"\u0000\u0000ST\u0003\u0002\u0001\u0000TU\u0005\u001c\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\t\u0001\u0000\u0000\u0000XY\u0005\t\u0000\u0000Y_\u0005&\u0000\u0000"+
		"Z\\\u0005\u0013\u0000\u0000[]\u0005\u0001\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0005\u0005"+
		"\u0000\u0000_Z\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0005!\u0000\u0000b\u000b\u0001\u0000\u0000\u0000"+
		"cd\u0005\n\u0000\u0000di\u0005&\u0000\u0000ef\u0005\u0013\u0000\u0000"+
		"fj\u0005&\u0000\u0000gh\u0005\u0013\u0000\u0000hj\u0005\u0006\u0000\u0000"+
		"ie\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u000b\u0000\u0000lq\u0005&\u0000"+
		"\u0000mn\u0005\u0013\u0000\u0000nr\u0005&\u0000\u0000op\u0005\u0013\u0000"+
		"\u0000pr\u0005\b\u0000\u0000qm\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005!\u0000"+
		"\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\f\u0000\u0000vy\u0005&\u0000"+
		"\u0000wx\u0005\u0013\u0000\u0000xz\u0003\u001c\u000e\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005"+
		"!\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}~\u0005\r\u0000\u0000~\u0081"+
		"\u0005&\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u0082\u0003"+
		"\u0018\f\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005!\u0000"+
		"\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000e\u0000"+
		"\u0000\u0086\u0089\u0005&\u0000\u0000\u0087\u0088\u0005\u0013\u0000\u0000"+
		"\u0088\u008a\u0003\u0016\u000b\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u001f\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000"+
		"\u008d\u008e\u0005 \u0000\u0000\u008e\u009a\u0001\u0000\u0000\u0000\u008f"+
		"\u009a\u0005\u0007\u0000\u0000\u0090\u0092\u0005\u001a\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005&\u0000\u0000\u0094\u0095"+
		"\u0007\u0000\u0000\u0000\u0095\u009a\u0005&\u0000\u0000\u0096\u0097\u0007"+
		"\u0001\u0000\u0000\u0097\u0098\u0007\u0002\u0000\u0000\u0098\u009a\u0007"+
		"\u0001\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u0099\u008f\u0001"+
		"\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0096\u0001"+
		"\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001b\u0000\u0000\u009c\u00a1\u0003\u001a\r\u0000\u009d\u009e\u0005%"+
		"\u0000\u0000\u009e\u00a0\u0003\u001a\r\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u001c\u0000"+
		"\u0000\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00ad\u0003\u0018\f\u0000"+
		"\u00a7\u00ad\u0005\u0005\u0000\u0000\u00a8\u00ad\u0005\u0006\u0000\u0000"+
		"\u00a9\u00ad\u0005\u0007\u0000\u0000\u00aa\u00ad\u0005\b\u0000\u0000\u00ab"+
		"\u00ad\u0005&\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u001d\u0000\u0000\u00af\u00b4\u0005\u0005\u0000\u0000\u00b0\u00b1"+
		"\u0005%\u0000\u0000\u00b1\u00b3\u0005\u0005\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00d9\u0005"+
		"\u001e\u0000\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00be\u0005"+
		"\u0006\u0000\u0000\u00ba\u00bb\u0005%\u0000\u0000\u00bb\u00bd\u0005\u0006"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00d9\u0005\u001e\u0000\u0000\u00c2\u00c3\u0005\u001d"+
		"\u0000\u0000\u00c3\u00c8\u0005\u0007\u0000\u0000\u00c4\u00c5\u0005%\u0000"+
		"\u0000\u00c5\u00c7\u0005\u0007\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d9\u0005\u001e\u0000"+
		"\u0000\u00cc\u00cd\u0005\u001d\u0000\u0000\u00cd\u00d2\u0005\b\u0000\u0000"+
		"\u00ce\u00cf\u0005%\u0000\u0000\u00cf\u00d1\u0005\b\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d9\u0005\u001e\u0000\u0000\u00d6\u00d9\u0003\u0018\f\u0000\u00d7\u00d9"+
		"\u0005&\u0000\u0000\u00d8\u00ae\u0001\u0000\u0000\u0000\u00d8\u00b8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00c2\u0001\u0000\u0000\u0000\u00d8\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u0017!(0<AEV\\"+
		"_iqy\u0081\u0089\u0091\u0099\u00a1\u00ac\u00b4\u00be\u00c8\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}