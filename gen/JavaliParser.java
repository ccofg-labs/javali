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
		WS=1, COMENTARIO=2, LINHA_COMENTARIO=3, DIGITO_LITERAL=4, REAL_LITERAL=5, 
		BOLEANA_LITERAL=6, CADEIA_LITERAL=7, INT=8, REAL=9, CADEIA=10, LISTA_UNIFORME=11, 
		LISTA_DIVERSA=12, BOLEANA=13, SOMA=14, SUBTRACAO=15, DIVISAO=16, MULTIPLICACAO=17, 
		IGUAL=18, IGUALDADE=19, DIFERENTE=20, MENOR_IGUAL=21, MAIOR_IGUAL=22, 
		E_LOGICO=23, OU_LOGICO=24, NEGACAO_LOGICA=25, ABRE_CHAVE=26, FECHA_CHAVE=27, 
		ABRE_COLCHETE=28, FECHA_COLCHETE=29, ABRE_PARENTESE=30, FECHA_PARENTESE=31, 
		PONTO_E_VIRGULA=32, ASPAS_DUPLAS=33, DOIS_PONTOS=34, PONTO=35, VIRGULA=36, 
		IDENTIFICADOR=37, SE=38, SENAO=39, ENTAO=40;
	public static final int
		RULE_programa = 0, RULE_estrutura = 1, RULE_seEstrutura = 2, RULE_tipoPrimitivo = 3, 
		RULE_inteiroDeclaracao = 4, RULE_realDeclaracao = 5, RULE_cadeiaDeclaracao = 6, 
		RULE_listaDeclaracao = 7, RULE_matrizDeclaracao = 8, RULE_boleanaDeclaracao = 9, 
		RULE_condicaoBoleana = 10, RULE_matrizExpressao = 11, RULE_matrizEstrutura = 12, 
		RULE_lista = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "estrutura", "seEstrutura", "tipoPrimitivo", "inteiroDeclaracao", 
			"realDeclaracao", "cadeiaDeclaracao", "listaDeclaracao", "matrizDeclaracao", 
			"boleanaDeclaracao", "condicaoBoleana", "matrizExpressao", "matrizEstrutura", 
			"lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'inteiro'", "'real'", 
			"'cadeia'", "'lista'", "'matriz'", "'boleana'", "'+'", "'-'", "'/'", 
			"'*'", "'='", "'=='", "'!='", "'<='", "'>='", "'and'", "'or'", "'not'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'\"'", "':'", "'.'", 
			"','", null, "'se'", "'senao'", "'entao'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "LINHA_COMENTARIO", "DIGITO_LITERAL", "REAL_LITERAL", 
			"BOLEANA_LITERAL", "CADEIA_LITERAL", "INT", "REAL", "CADEIA", "LISTA_UNIFORME", 
			"LISTA_DIVERSA", "BOLEANA", "SOMA", "SUBTRACAO", "DIVISAO", "MULTIPLICACAO", 
			"IGUAL", "IGUALDADE", "DIFERENTE", "MENOR_IGUAL", "MAIOR_IGUAL", "E_LOGICO", 
			"OU_LOGICO", "NEGACAO_LOGICA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_COLCHETE", 
			"FECHA_COLCHETE", "ABRE_PARENTESE", "FECHA_PARENTESE", "PONTO_E_VIRGULA", 
			"ASPAS_DUPLAS", "DOIS_PONTOS", "PONTO", "VIRGULA", "IDENTIFICADOR", "SE", 
			"SENAO", "ENTAO"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274945031944L) != 0)) {
				{
				{
				setState(28);
				estrutura();
				}
				}
				setState(33);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ABRE_CHAVE);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274945031944L) != 0)) {
					{
					{
					setState(35);
					estrutura();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
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
				setState(42);
				tipoPrimitivo();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				seEstrutura();
				}
				break;
			case LINHA_COMENTARIO:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
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
		enterRule(_localctx, 4, RULE_seEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SE);
			setState(48);
			match(ABRE_PARENTESE);
			setState(49);
			condicaoBoleana();
			setState(50);
			match(FECHA_PARENTESE);
			setState(51);
			match(ENTAO);
			setState(52);
			match(ABRE_CHAVE);
			setState(53);
			estrutura();
			setState(54);
			match(FECHA_CHAVE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(55);
				match(SENAO);
				setState(56);
				match(ABRE_CHAVE);
				setState(57);
				estrutura();
				setState(58);
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
		enterRule(_localctx, 6, RULE_tipoPrimitivo);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				inteiroDeclaracao();
				setState(63);
				match(PONTO_E_VIRGULA);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				realDeclaracao();
				setState(66);
				match(PONTO_E_VIRGULA);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				cadeiaDeclaracao();
				}
				break;
			case LISTA_UNIFORME:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				listaDeclaracao();
				}
				break;
			case LISTA_DIVERSA:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				matrizDeclaracao();
				}
				break;
			case BOLEANA:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
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
	public static class InteiroDeclaracaoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaliParser.INT, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(JavaliParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(JavaliParser.IDENTIFICADOR, i);
		}
		public TerminalNode IGUAL() { return getToken(JavaliParser.IGUAL, 0); }
		public TerminalNode DIGITO_LITERAL() { return getToken(JavaliParser.DIGITO_LITERAL, 0); }
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
		enterRule(_localctx, 8, RULE_inteiroDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(INT);
			setState(75);
			match(IDENTIFICADOR);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(76);
				match(IGUAL);
				setState(77);
				_la = _input.LA(1);
				if ( !(_la==DIGITO_LITERAL || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 10, RULE_realDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(REAL);
			setState(81);
			match(IDENTIFICADOR);
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(82);
				match(IGUAL);
				setState(83);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				{
				setState(84);
				match(IGUAL);
				setState(85);
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
		enterRule(_localctx, 12, RULE_cadeiaDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CADEIA);
			setState(89);
			match(IDENTIFICADOR);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
				match(IGUAL);
				setState(91);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				{
				setState(92);
				match(IGUAL);
				setState(93);
				match(CADEIA_LITERAL);
				}
				break;
			}
			setState(96);
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
		enterRule(_localctx, 14, RULE_listaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LISTA_UNIFORME);
			setState(99);
			match(IDENTIFICADOR);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(100);
				match(IGUAL);
				setState(101);
				lista();
				}
			}

			setState(104);
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
		enterRule(_localctx, 16, RULE_matrizDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LISTA_DIVERSA);
			setState(107);
			match(IDENTIFICADOR);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(108);
				match(IGUAL);
				setState(109);
				matrizExpressao();
				}
			}

			setState(112);
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
		enterRule(_localctx, 18, RULE_boleanaDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(BOLEANA);
			setState(115);
			match(IDENTIFICADOR);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(116);
				match(IGUAL);
				setState(117);
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
		enterRule(_localctx, 20, RULE_condicaoBoleana);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ABRE_PARENTESE);
				setState(121);
				condicaoBoleana();
				setState(122);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(BOLEANA_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGACAO_LOGICA) {
					{
					setState(125);
					match(NEGACAO_LOGICA);
					}
				}

				setState(128);
				match(IDENTIFICADOR);
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953520L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953520L) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_matrizExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ABRE_CHAVE);
			setState(137);
			matrizEstrutura();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(138);
				match(VIRGULA);
				setState(139);
				matrizEstrutura();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
		enterRule(_localctx, 24, RULE_matrizEstrutura);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				matrizExpressao();
				}
				break;
			case DIGITO_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(DIGITO_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(REAL_LITERAL);
				}
				break;
			case BOLEANA_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(BOLEANA_LITERAL);
				}
				break;
			case CADEIA_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(CADEIA_LITERAL);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
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
		enterRule(_localctx, 26, RULE_lista);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ABRE_COLCHETE);
				setState(156);
				match(DIGITO_LITERAL);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(157);
					match(VIRGULA);
					setState(158);
					match(DIGITO_LITERAL);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(FECHA_COLCHETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ABRE_COLCHETE);
				setState(166);
				match(REAL_LITERAL);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(167);
					match(VIRGULA);
					setState(168);
					match(REAL_LITERAL);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(FECHA_COLCHETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(ABRE_COLCHETE);
				setState(176);
				match(BOLEANA_LITERAL);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(177);
					match(VIRGULA);
					setState(178);
					match(BOLEANA_LITERAL);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(FECHA_COLCHETE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(ABRE_COLCHETE);
				setState(186);
				match(CADEIA_LITERAL);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(187);
					match(VIRGULA);
					setState(188);
					match(CADEIA_LITERAL);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(FECHA_COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				matrizExpressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
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
		"\u0004\u0001(\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001%\b\u0001\n\u0001"+
		"\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006_\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bo\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0087\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u008d\b\u000b\n\u000b\f\u000b\u0090\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a0\b\r\n\r\f\r\u00a3\t"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00aa\b\r\n\r\f\r\u00ad"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b4\b\r\n\r\f\r"+
		"\u00b7\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00be\b\r\n"+
		"\r\f\r\u00c1\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c6\b\r\u0001\r\u0000"+
		"\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0004\u0002\u0000\u0004\u0004%%\u0001\u0000\u0017\u0018"+
		"\u0002\u0000\u0004\u0005%%\u0001\u0000\u0013\u0016\u00df\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000"+
		"\u0000\u0006H\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nP\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000"+
		"\u0000\u0010j\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014"+
		"\u0086\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018"+
		"\u0099\u0001\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000\"&\u0005\u001a\u0000\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		").\u0005\u001b\u0000\u0000*.\u0003\u0006\u0003\u0000+.\u0003\u0004\u0002"+
		"\u0000,.\u0005\u0003\u0000\u0000-\"\u0001\u0000\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0003"+
		"\u0001\u0000\u0000\u0000/0\u0005&\u0000\u000001\u0005\u001e\u0000\u0000"+
		"12\u0003\u0014\n\u000023\u0005\u001f\u0000\u000034\u0005(\u0000\u0000"+
		"45\u0005\u001a\u0000\u000056\u0003\u0002\u0001\u00006<\u0005\u001b\u0000"+
		"\u000078\u0005\'\u0000\u000089\u0005\u001a\u0000\u00009:\u0003\u0002\u0001"+
		"\u0000:;\u0005\u001b\u0000\u0000;=\u0001\u0000\u0000\u0000<7\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000"+
		">?\u0003\b\u0004\u0000?@\u0005 \u0000\u0000@I\u0001\u0000\u0000\u0000"+
		"AB\u0003\n\u0005\u0000BC\u0005 \u0000\u0000CI\u0001\u0000\u0000\u0000"+
		"DI\u0003\f\u0006\u0000EI\u0003\u000e\u0007\u0000FI\u0003\u0010\b\u0000"+
		"GI\u0003\u0012\t\u0000H>\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000"+
		"HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005"+
		"\b\u0000\u0000KN\u0005%\u0000\u0000LM\u0005\u0012\u0000\u0000MO\u0007"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PQ\u0005\t\u0000\u0000QV\u0005%\u0000\u0000"+
		"RS\u0005\u0012\u0000\u0000SW\u0005%\u0000\u0000TU\u0005\u0012\u0000\u0000"+
		"UW\u0005\u0005\u0000\u0000VR\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005"+
		"\n\u0000\u0000Y^\u0005%\u0000\u0000Z[\u0005\u0012\u0000\u0000[_\u0005"+
		"%\u0000\u0000\\]\u0005\u0012\u0000\u0000]_\u0005\u0007\u0000\u0000^Z\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0005 \u0000\u0000a\r\u0001\u0000\u0000\u0000"+
		"bc\u0005\u000b\u0000\u0000cf\u0005%\u0000\u0000de\u0005\u0012\u0000\u0000"+
		"eg\u0003\u001a\r\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0005 \u0000\u0000i\u000f\u0001\u0000\u0000"+
		"\u0000jk\u0005\f\u0000\u0000kn\u0005%\u0000\u0000lm\u0005\u0012\u0000"+
		"\u0000mo\u0003\u0016\u000b\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005 \u0000\u0000q\u0011\u0001"+
		"\u0000\u0000\u0000rs\u0005\r\u0000\u0000sv\u0005%\u0000\u0000tu\u0005"+
		"\u0012\u0000\u0000uw\u0003\u0014\n\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\u001e\u0000"+
		"\u0000yz\u0003\u0014\n\u0000z{\u0005\u001f\u0000\u0000{\u0087\u0001\u0000"+
		"\u0000\u0000|\u0087\u0005\u0006\u0000\u0000}\u007f\u0005\u0019\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005%\u0000\u0000\u0081\u0082\u0007"+
		"\u0001\u0000\u0000\u0082\u0087\u0005%\u0000\u0000\u0083\u0084\u0007\u0002"+
		"\u0000\u0000\u0084\u0085\u0007\u0003\u0000\u0000\u0085\u0087\u0007\u0002"+
		"\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000"+
		"\u0086~\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087"+
		"\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001a\u0000\u0000\u0089"+
		"\u008e\u0003\u0018\f\u0000\u008a\u008b\u0005$\u0000\u0000\u008b\u008d"+
		"\u0003\u0018\f\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0017\u0001"+
		"\u0000\u0000\u0000\u0093\u009a\u0003\u0016\u000b\u0000\u0094\u009a\u0005"+
		"\u0004\u0000\u0000\u0095\u009a\u0005\u0005\u0000\u0000\u0096\u009a\u0005"+
		"\u0006\u0000\u0000\u0097\u009a\u0005\u0007\u0000\u0000\u0098\u009a\u0005"+
		"%\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000"+
		"\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001c"+
		"\u0000\u0000\u009c\u00a1\u0005\u0004\u0000\u0000\u009d\u009e\u0005$\u0000"+
		"\u0000\u009e\u00a0\u0005\u0004\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00c6\u0005\u001d\u0000"+
		"\u0000\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6\u00ab\u0005\u0005\u0000"+
		"\u0000\u00a7\u00a8\u0005$\u0000\u0000\u00a8\u00aa\u0005\u0005\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00c6\u0005\u001d\u0000\u0000\u00af\u00b0\u0005\u001c\u0000\u0000"+
		"\u00b0\u00b5\u0005\u0006\u0000\u0000\u00b1\u00b2\u0005$\u0000\u0000\u00b2"+
		"\u00b4\u0005\u0006\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00c6\u0005\u001d\u0000\u0000\u00b9"+
		"\u00ba\u0005\u001c\u0000\u0000\u00ba\u00bf\u0005\u0007\u0000\u0000\u00bb"+
		"\u00bc\u0005$\u0000\u0000\u00bc\u00be\u0005\u0007\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c6"+
		"\u0005\u001d\u0000\u0000\u00c3\u00c6\u0003\u0016\u000b\u0000\u00c4\u00c6"+
		"\u0005%\u0000\u0000\u00c5\u009b\u0001\u0000\u0000\u0000\u00c5\u00a5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00af\u0001\u0000\u0000\u0000\u00c5\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u001b\u0001\u0000\u0000\u0000\u0014\u001f&-<"+
		"HNV^fnv~\u0086\u008e\u0099\u00a1\u00ab\u00b5\u00bf\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}