// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Soma=1, Subtracao=2, Multiplicacao=3, Divisao=4, EoF=5, Space=6, Bool=7, 
		TAtribuicao=8, Tipos=9, Impressao=10, Variavel=11, Numero=12;
	public static final int
		RULE_tLinha = 0, RULE_linha = 1, RULE_operacao = 2, RULE_atribuicao = 3, 
		RULE_declaracao = 4, RULE_operadores = 5, RULE_impressao = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"tLinha", "linha", "operacao", "atribuicao", "declaracao", "operadores", 
			"impressao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "';'", null, null, "'='", null, "'imprima'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Soma", "Subtracao", "Multiplicacao", "Divisao", "EoF", "Space", 
			"Bool", "TAtribuicao", "Tipos", "Impressao", "Variavel", "Numero"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TLinhaContext extends ParserRuleContext {
		public TLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tLinha; }
	 
		public TLinhaContext() { }
		public void copyFrom(TLinhaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FimLinhaContext extends TLinhaContext {
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
		}
		public FimLinhaContext(TLinhaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFimLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFimLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFimLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TLinhaContext tLinha() throws RecognitionException {
		TLinhaContext _localctx = new TLinhaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tLinha);
		try {
			_localctx = new FimLinhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			linha();
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

	public static class LinhaContext extends ParserRuleContext {
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
	 
		public LinhaContext() { }
		public void copyFrom(LinhaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NLinhaContext extends LinhaContext {
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public NLinhaContext(LinhaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		int _la;
		try {
			_localctx = new NLinhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tipos) | (1L << Variavel) | (1L << Numero))) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16);
					atribuicao();
					}
					break;
				case 2:
					{
					setState(17);
					operacao();
					}
					break;
				case 3:
					{
					setState(18);
					declaracao();
					}
					break;
				}
				}
				setState(23);
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

	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacaoContext extends OperacaoContext {
		public OperadoresContext operadores() {
			return getRuleContext(OperadoresContext.class,0);
		}
		public TerminalNode EoF() { return getToken(GramaticaParser.EoF, 0); }
		public List<TerminalNode> Numero() { return getTokens(GramaticaParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(GramaticaParser.Numero, i);
		}
		public List<TerminalNode> Variavel() { return getTokens(GramaticaParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(GramaticaParser.Variavel, i);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacao);
		int _la;
		try {
			_localctx = new NOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==Variavel || _la==Numero) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25);
			operadores();
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==Variavel || _la==Numero) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(27);
			match(EoF);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public List<TerminalNode> Variavel() { return getTokens(GramaticaParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(GramaticaParser.Variavel, i);
		}
		public TerminalNode TAtribuicao() { return getToken(GramaticaParser.TAtribuicao, 0); }
		public TerminalNode EoF() { return getToken(GramaticaParser.EoF, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode Numero() { return getToken(GramaticaParser.Numero, 0); }
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		int _la;
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(Variavel);
			setState(30);
			match(TAtribuicao);
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==Variavel || _la==Numero) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				match(EoF);
				}
				break;
			case 2:
				{
				setState(33);
				operacao();
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoContext extends DeclaracaoContext {
		public TerminalNode Tipos() { return getToken(GramaticaParser.Tipos, 0); }
		public TerminalNode Variavel() { return getToken(GramaticaParser.Variavel, 0); }
		public TerminalNode EoF() { return getToken(GramaticaParser.EoF, 0); }
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Tipos);
			setState(37);
			match(Variavel);
			setState(38);
			match(EoF);
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

	public static class OperadoresContext extends ParserRuleContext {
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
	 
		public OperadoresContext() { }
		public void copyFrom(OperadoresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperadoresContext extends OperadoresContext {
		public TerminalNode Soma() { return getToken(GramaticaParser.Soma, 0); }
		public TerminalNode Subtracao() { return getToken(GramaticaParser.Subtracao, 0); }
		public TerminalNode Multiplicacao() { return getToken(GramaticaParser.Multiplicacao, 0); }
		public TerminalNode Divisao() { return getToken(GramaticaParser.Divisao, 0); }
		public NOperadoresContext(OperadoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operadores);
		int _la;
		try {
			_localctx = new NOperadoresContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Soma) | (1L << Subtracao) | (1L << Multiplicacao) | (1L << Divisao))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ImpressaoContext extends ParserRuleContext {
		public ImpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impressao; }
	 
		public ImpressaoContext() { }
		public void copyFrom(ImpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NImpressaoContext extends ImpressaoContext {
		public TerminalNode Impressao() { return getToken(GramaticaParser.Impressao, 0); }
		public TerminalNode Variavel() { return getToken(GramaticaParser.Variavel, 0); }
		public NImpressaoContext(ImpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNImpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNImpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impressao);
		try {
			_localctx = new NImpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			match(Impressao);
			setState(43);
			match(Variavel);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5%\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2"+
		"\r\16\3\2\3\6\2,\2\20\3\2\2\2\4\27\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n"+
		"&\3\2\2\2\f*\3\2\2\2\16,\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\26\5\b"+
		"\5\2\23\26\5\6\4\2\24\26\5\n\6\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2"+
		"\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2"+
		"\2\2\32\33\t\2\2\2\33\34\5\f\7\2\34\35\t\2\2\2\35\36\7\7\2\2\36\7\3\2"+
		"\2\2\37 \7\r\2\2 $\7\n\2\2!\"\t\2\2\2\"%\7\7\2\2#%\5\6\4\2$!\3\2\2\2$"+
		"#\3\2\2\2%\t\3\2\2\2&\'\7\13\2\2\'(\7\r\2\2()\7\7\2\2)\13\3\2\2\2*+\t"+
		"\3\2\2+\r\3\2\2\2,-\7\f\2\2-.\7\r\2\2.\17\3\2\2\2\5\25\27$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}