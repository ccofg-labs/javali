// Generated from c:/Users/diego/Desktop/Javali/Javali.g4 by ANTLR 4.13.1
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
		WS=1, COMENTARIO=2, LINHA_COMENTARIO=3, DIGITO_LITERAL=4, REAL_LITERAL=5, 
		BOLEANA_LITERAL=6, CADEIA_LITERAL=7, INT=8, REAL=9, CADEIA=10, LISTA_UNIFORME=11, 
		LISTA_DIVERSA=12, BOLEANA=13, SOMA=14, SUBTRACAO=15, DIVISAO=16, MULTIPLICACAO=17, 
		IGUAL=18, DIFERENTE=19, MENOR_IGUAL=20, MAIOR_IGUAL=21, E_LOGICO=22, OU_LOGICO=23, 
		NEGACAO_LOGICA=24, ABRE_CHAVE=25, FECHA_CHAVE=26, ABRE_COLCHETE=27, FECHA_COLCHETE=28, 
		ABRE_PARENTESE=29, FECHA_PARENTESE=30, PONTO_E_VIRGULA=31, ASPAS_DUPLAS=32, 
		DOIS_PONTOS=33, PONTO=34, VIRGULA=35, IDENTIFICADOR=36;
	public static final int
		RULE_programa = 0, RULE_estrutura = 1, RULE_declaracaoTipoPrimitivo = 2, 
		RULE_declaracaoInteiro = 3, RULE_expressaoAritmetricaInteiro = 4, RULE_realDeclaracao = 5, 
		RULE_cadeiaDeclaracao = 6, RULE_listaDeclaracao = 7, RULE_matrizDeclaracao = 8, 
		RULE_boleanaDeclaracao = 9, RULE_matrizExpressao = 10, RULE_matrizEstrutura = 11, 
		RULE_lista = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "estrutura", "declaracaoTipoPrimitivo", "declaracaoInteiro", 
			"expressaoAritmetricaInteiro", "realDeclaracao", "cadeiaDeclaracao", 
			"listaDeclaracao", "matrizDeclaracao", "boleanaDeclaracao", "matrizExpressao", 
			"matrizEstrutura", "lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'inteiro'", "'real'", 
			"'cadeia'", "'lista'", "'matriz'", "'boleana'", "'+'", "'-'", "'/'", 
			"'*'", "'='", "'!='", "'<='", "'>='", "'and'", "'or'", "'not'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", "':'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "LINHA_COMENTARIO", "DIGITO_LITERAL", "REAL_LITERAL", 
			"BOLEANA_LITERAL", "CADEIA_LITERAL", "INT", "REAL", "CADEIA", "LISTA_UNIFORME", 
			"LISTA_DIVERSA", "BOLEANA", "SOMA", "SUBTRACAO", "DIVISAO", "MULTIPLICACAO", 
			"IGUAL", "DIFERENTE", "MENOR_IGUAL", "MAIOR_IGUAL", "E_LOGICO", "OU_LOGICO", 
			"NEGACAO_LOGICA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
			"ABRE_PARENTESE", "FECHA_PARENTESE", "PONTO_E_VIRGULA", "ASPAS_DUPLAS", 
			"DOIS_PONTOS", "PONTO", "VIRGULA", "IDENTIFICADOR"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68753047308L) != 0)) {
				{
				{
				setState(26);
				estrutura();
				}
				}
				setState(31);
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
		public DeclaracaoTipoPrimitivoContext declaracaoTipoPrimitivo() {
			return getRuleContext(DeclaracaoTipoPrimitivoContext.class,0);
		}
		public TerminalNode COMENTARIO() { return getToken(JavaliParser.COMENTARIO, 0); }
		public TerminalNode LINHA_COMENTARIO() { return getToken(JavaliParser.LINHA_COMENTARIO, 0); }
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
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estrutura);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(ABRE_CHAVE);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68753047308L) != 0)) {
					{
					{
					setState(33);
					estrutura();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(FECHA_CHAVE);
				}
				break;
			case INT:
			case REAL:
			case CADEIA:
			case LISTA_UNIFORME:
			case LISTA_DIVERSA:
			case BOLEANA:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				declaracaoTipoPrimitivo();
				}
				break;
			case COMENTARIO:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(COMENTARIO);
				}
				break;
			case LINHA_COMENTARIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(LINHA_COMENTARIO);
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
	public static class DeclaracaoTipoPrimitivoContext extends ParserRuleContext {
		public DeclaracaoInteiroContext declaracaoInteiro() {
			return getRuleContext(DeclaracaoInteiroContext.class,0);
		}
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
		public DeclaracaoTipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoTipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterDeclaracaoTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitDeclaracaoTipoPrimitivo(this);
		}
	}

	public final DeclaracaoTipoPrimitivoContext declaracaoTipoPrimitivo() throws RecognitionException {
		DeclaracaoTipoPrimitivoContext _localctx = new DeclaracaoTipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoTipoPrimitivo);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaracaoInteiro();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				realDeclaracao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				cadeiaDeclaracao();
				}
				break;
			case LISTA_UNIFORME:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				listaDeclaracao();
				}
				break;
			case LISTA_DIVERSA:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				matrizDeclaracao();
				}
				break;
			case BOLEANA:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
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
	public static class DeclaracaoInteiroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaliParser.INT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public ExpressaoAritmetricaInteiroContext expressaoAritmetricaInteiro() {
			return getRuleContext(ExpressaoAritmetricaInteiroContext.class,0);
		}
		public DeclaracaoInteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoInteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterDeclaracaoInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitDeclaracaoInteiro(this);
		}
	}

	public final DeclaracaoInteiroContext declaracaoInteiro() throws RecognitionException {
		DeclaracaoInteiroContext _localctx = new DeclaracaoInteiroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoInteiro);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(INT);
				setState(54);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(IDENTIFICADOR);
				setState(56);
				match(IGUAL);
				setState(57);
				expressaoAritmetricaInteiro(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(INT);
				setState(59);
				match(IDENTIFICADOR);
				setState(60);
				match(IGUAL);
				setState(61);
				expressaoAritmetricaInteiro(0);
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
	public static class ExpressaoAritmetricaInteiroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(JavaliParser.IDENTIFICADOR, 0); }
		public TerminalNode DIGITO_LITERAL() { return getToken(JavaliParser.DIGITO_LITERAL, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(JavaliParser.ABRE_PARENTESE, 0); }
		public List<ExpressaoAritmetricaInteiroContext> expressaoAritmetricaInteiro() {
			return getRuleContexts(ExpressaoAritmetricaInteiroContext.class);
		}
		public ExpressaoAritmetricaInteiroContext expressaoAritmetricaInteiro(int i) {
			return getRuleContext(ExpressaoAritmetricaInteiroContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(JavaliParser.FECHA_PARENTESE, 0); }
		public TerminalNode SOMA() { return getToken(JavaliParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(JavaliParser.SUBTRACAO, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(JavaliParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(JavaliParser.DIVISAO, 0); }
		public ExpressaoAritmetricaInteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetricaInteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).enterExpressaoAritmetricaInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaliListener ) ((JavaliListener)listener).exitExpressaoAritmetricaInteiro(this);
		}
	}

	public final ExpressaoAritmetricaInteiroContext expressaoAritmetricaInteiro() throws RecognitionException {
		return expressaoAritmetricaInteiro(0);
	}

	private ExpressaoAritmetricaInteiroContext expressaoAritmetricaInteiro(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmetricaInteiroContext _localctx = new ExpressaoAritmetricaInteiroContext(_ctx, _parentState);
		ExpressaoAritmetricaInteiroContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressaoAritmetricaInteiro, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(65);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				{
				setState(66);
				match(DIGITO_LITERAL);
				}
				break;
			case 4:
				{
				setState(67);
				match(ABRE_PARENTESE);
				setState(68);
				expressaoAritmetricaInteiro(0);
				setState(69);
				match(FECHA_PARENTESE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritmetricaInteiroContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetricaInteiro);
						setState(73);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(74);
						match(SOMA);
						setState(75);
						expressaoAritmetricaInteiro(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritmetricaInteiroContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetricaInteiro);
						setState(76);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(77);
						match(SUBTRACAO);
						setState(78);
						expressaoAritmetricaInteiro(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritmetricaInteiroContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetricaInteiro);
						setState(79);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(80);
						match(MULTIPLICACAO);
						setState(81);
						expressaoAritmetricaInteiro(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoAritmetricaInteiroContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetricaInteiro);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83);
						match(DIVISAO);
						setState(84);
						expressaoAritmetricaInteiro(3);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public List<TerminalNode> REAL_LITERAL() { return getTokens(JavaliParser.REAL_LITERAL); }
		public TerminalNode REAL_LITERAL(int i) {
			return getToken(JavaliParser.REAL_LITERAL, i);
		}
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
	}

	public final RealDeclaracaoContext realDeclaracao() throws RecognitionException {
		RealDeclaracaoContext _localctx = new RealDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_realDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(REAL);
			setState(91);
			match(IDENTIFICADOR);
			setState(92);
			match(IGUAL);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REAL_LITERAL || _la==IDENTIFICADOR) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==REAL_LITERAL || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
	public static class CadeiaDeclaracaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(JavaliParser.CADEIA, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public List<TerminalNode> CADEIA_LITERAL() { return getTokens(JavaliParser.CADEIA_LITERAL); }
		public TerminalNode CADEIA_LITERAL(int i) {
			return getToken(JavaliParser.CADEIA_LITERAL, i);
		}
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
	}

	public final CadeiaDeclaracaoContext cadeiaDeclaracao() throws RecognitionException {
		CadeiaDeclaracaoContext _localctx = new CadeiaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cadeiaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CADEIA);
			setState(102);
			match(IDENTIFICADOR);
			setState(103);
			match(IGUAL);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CADEIA_LITERAL || _la==IDENTIFICADOR) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==CADEIA_LITERAL || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
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
	}

	public final ListaDeclaracaoContext listaDeclaracao() throws RecognitionException {
		ListaDeclaracaoContext _localctx = new ListaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LISTA_UNIFORME);
			setState(113);
			match(IDENTIFICADOR);
			setState(114);
			match(IGUAL);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68887248896L) != 0)) {
				{
				{
				setState(115);
				lista();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
		public List<MatrizExpressaoContext> matrizExpressao() {
			return getRuleContexts(MatrizExpressaoContext.class);
		}
		public MatrizExpressaoContext matrizExpressao(int i) {
			return getRuleContext(MatrizExpressaoContext.class,i);
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
	}

	public final MatrizDeclaracaoContext matrizDeclaracao() throws RecognitionException {
		MatrizDeclaracaoContext _localctx = new MatrizDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matrizDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LISTA_DIVERSA);
			setState(124);
			match(IDENTIFICADOR);
			setState(125);
			match(IGUAL);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_CHAVE) {
				{
				{
				setState(126);
				matrizExpressao();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
		public TerminalNode PONTO_E_VIRGULA() { return getToken(JavaliParser.PONTO_E_VIRGULA, 0); }
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
	}

	public final BoleanaDeclaracaoContext boleanaDeclaracao() throws RecognitionException {
		BoleanaDeclaracaoContext _localctx = new BoleanaDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boleanaDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(BOLEANA);
			setState(135);
			match(IDENTIFICADOR);
			setState(136);
			match(IGUAL);
			setState(137);
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
	}

	public final MatrizExpressaoContext matrizExpressao() throws RecognitionException {
		MatrizExpressaoContext _localctx = new MatrizExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrizExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ABRE_CHAVE);
			setState(140);
			matrizEstrutura();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(141);
				match(VIRGULA);
				setState(142);
				matrizEstrutura();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
	}

	public final MatrizEstruturaContext matrizEstrutura() throws RecognitionException {
		MatrizEstruturaContext _localctx = new MatrizEstruturaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrizEstrutura);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				matrizExpressao();
				}
				break;
			case DIGITO_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(DIGITO_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(REAL_LITERAL);
				}
				break;
			case BOLEANA_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(BOLEANA_LITERAL);
				}
				break;
			case CADEIA_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(CADEIA_LITERAL);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
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
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lista);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ABRE_COLCHETE);
				setState(159);
				match(DIGITO_LITERAL);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(160);
					match(VIRGULA);
					setState(161);
					match(DIGITO_LITERAL);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(FECHA_COLCHETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(ABRE_COLCHETE);
				setState(169);
				match(REAL_LITERAL);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(170);
					match(VIRGULA);
					setState(171);
					match(REAL_LITERAL);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(FECHA_COLCHETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ABRE_COLCHETE);
				setState(179);
				match(BOLEANA_LITERAL);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(180);
					match(VIRGULA);
					setState(181);
					match(BOLEANA_LITERAL);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(FECHA_COLCHETE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(ABRE_COLCHETE);
				setState(189);
				match(CADEIA_LITERAL);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(190);
					match(VIRGULA);
					setState(191);
					match(CADEIA_LITERAL);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(FECHA_COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				matrizExpressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expressaoAritmetricaInteiro_sempred((ExpressaoAritmetricaInteiroContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoAritmetricaInteiro_sempred(ExpressaoAritmetricaInteiroContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001#\b\u0001\n\u0001\f\u0001"+
		"&\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003?\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"V\b\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007"+
		"x\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0080\b\b\n\b\f\b\u0083\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n"+
		"\f\n\u0093\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009d\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00a3\b\f\n\f\f\f\u00a6\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00ad\b\f\n\f\f\f\u00b0\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b7\b\f\n\f\f\f\u00ba\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c1\b\f\n\f\f\f\u00c4\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001\f\u0000\u0001\b\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0002"+
		"\u0000\u0005\u0005$$\u0002\u0000\u0007\u0007$$\u00e3\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000"+
		"\u0000\u0006>\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nZ\u0001"+
		"\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"+
		"\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000"+
		"\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000"+
		"\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" $\u0005\u0019\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\',\u0005"+
		"\u001a\u0000\u0000(,\u0003\u0004\u0002\u0000),\u0005\u0002\u0000\u0000"+
		"*,\u0005\u0003\u0000\u0000+ \u0001\u0000\u0000\u0000+(\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-4\u0003\u0006\u0003\u0000.4\u0003\n\u0005\u0000/4\u0003"+
		"\f\u0006\u000004\u0003\u000e\u0007\u000014\u0003\u0010\b\u000024\u0003"+
		"\u0012\t\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000\u0000\u00003/\u0001"+
		"\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u000056\u0005\b\u0000"+
		"\u00006?\u0005$\u0000\u000078\u0005$\u0000\u000089\u0005\u0012\u0000\u0000"+
		"9?\u0003\b\u0004\u0000:;\u0005\b\u0000\u0000;<\u0005$\u0000\u0000<=\u0005"+
		"\u0012\u0000\u0000=?\u0003\b\u0004\u0000>5\u0001\u0000\u0000\u0000>7\u0001"+
		"\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?\u0007\u0001\u0000\u0000"+
		"\u0000@H\u0006\u0004\uffff\uffff\u0000AH\u0005$\u0000\u0000BH\u0005\u0004"+
		"\u0000\u0000CD\u0005\u001d\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\u001e"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GA\u0001"+
		"\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000"+
		"HW\u0001\u0000\u0000\u0000IJ\n\u0005\u0000\u0000JK\u0005\u000e\u0000\u0000"+
		"KV\u0003\b\u0004\u0006LM\n\u0004\u0000\u0000MN\u0005\u000f\u0000\u0000"+
		"NV\u0003\b\u0004\u0005OP\n\u0003\u0000\u0000PQ\u0005\u0011\u0000\u0000"+
		"QV\u0003\b\u0004\u0004RS\n\u0002\u0000\u0000ST\u0005\u0010\u0000\u0000"+
		"TV\u0003\b\u0004\u0003UI\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\t\u0000\u0000[\\\u0005"+
		"$\u0000\u0000\\`\u0005\u0012\u0000\u0000]_\u0007\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0005\u001f\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005"+
		"\n\u0000\u0000fg\u0005$\u0000\u0000gk\u0005\u0012\u0000\u0000hj\u0007"+
		"\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\u001f\u0000\u0000o\r\u0001\u0000"+
		"\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005$\u0000\u0000rv\u0005\u0012"+
		"\u0000\u0000su\u0003\u0018\f\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u001f\u0000\u0000"+
		"z\u000f\u0001\u0000\u0000\u0000{|\u0005\f\u0000\u0000|}\u0005$\u0000\u0000"+
		"}\u0081\u0005\u0012\u0000\u0000~\u0080\u0003\u0014\n\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u001f\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\r\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088\u0089\u0005\u0012"+
		"\u0000\u0000\u0089\u008a\u0005\u001f\u0000\u0000\u008a\u0013\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0019\u0000\u0000\u008c\u0091\u0003\u0016"+
		"\u000b\u0000\u008d\u008e\u0005#\u0000\u0000\u008e\u0090\u0003\u0016\u000b"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u001a\u0000\u0000\u0095\u0015\u0001\u0000\u0000"+
		"\u0000\u0096\u009d\u0003\u0014\n\u0000\u0097\u009d\u0005\u0004\u0000\u0000"+
		"\u0098\u009d\u0005\u0005\u0000\u0000\u0099\u009d\u0005\u0006\u0000\u0000"+
		"\u009a\u009d\u0005\u0007\u0000\u0000\u009b\u009d\u0005$\u0000\u0000\u009c"+
		"\u0096\u0001\u0000\u0000\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009c"+
		"\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001b\u0000\u0000\u009f"+
		"\u00a4\u0005\u0004\u0000\u0000\u00a0\u00a1\u0005#\u0000\u0000\u00a1\u00a3"+
		"\u0005\u0004\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00c9\u0005\u001c\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001b\u0000\u0000\u00a9\u00ae\u0005\u0005\u0000\u0000\u00aa\u00ab"+
		"\u0005#\u0000\u0000\u00ab\u00ad\u0005\u0005\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00c9\u0005"+
		"\u001c\u0000\u0000\u00b2\u00b3\u0005\u001b\u0000\u0000\u00b3\u00b8\u0005"+
		"\u0006\u0000\u0000\u00b4\u00b5\u0005#\u0000\u0000\u00b5\u00b7\u0005\u0006"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00c9\u0005\u001c\u0000\u0000\u00bc\u00bd\u0005\u001b"+
		"\u0000\u0000\u00bd\u00c2\u0005\u0007\u0000\u0000\u00be\u00bf\u0005#\u0000"+
		"\u0000\u00bf\u00c1\u0005\u0007\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c9\u0005\u001c\u0000"+
		"\u0000\u00c6\u00c9\u0003\u0014\n\u0000\u00c7\u00c9\u0005$\u0000\u0000"+
		"\u00c8\u009e\u0001\u0000\u0000\u0000\u00c8\u00a8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b2\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u0019\u0001\u0000\u0000\u0000\u0013\u001d$+3>GUW`kv\u0081\u0091"+
		"\u009c\u00a4\u00ae\u00b8\u00c2\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}