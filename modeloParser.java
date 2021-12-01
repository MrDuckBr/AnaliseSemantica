// Generated from modelo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class modeloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Soma=1, Subtracao=2, Multiplicacao=3, Divisao=4, EoF=5, Space=6, Bool=7, 
		TAtribuicao=8, InteiroTipo=9, StringTipo=10, BoolTipo=11, Impressao=12, 
		Variavel=13, Numero=14;
	public static final int
		RULE_tLinha = 0, RULE_linha = 1, RULE_operacao = 2, RULE_atribuicao = 3, 
		RULE_tipos = 4, RULE_declaracao = 5, RULE_operadores = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"tLinha", "linha", "operacao", "atribuicao", "tipos", "declaracao", "operadores"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "';'", null, null, "'='", "'int'", 
			"'string'", "'bool'", "'imprima'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Soma", "Subtracao", "Multiplicacao", "Divisao", "EoF", "Space", 
			"Bool", "TAtribuicao", "InteiroTipo", "StringTipo", "BoolTipo", "Impressao", 
			"Variavel", "Numero"
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
	public String getGrammarFileName() { return "modelo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public modeloParser(TokenStream input) {
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
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public FimLinhaContext(TLinhaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterFimLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitFimLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitFimLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TLinhaContext tLinha() throws RecognitionException {
		TLinhaContext _localctx = new TLinhaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tLinha);
		int _la;
		try {
			_localctx = new FimLinhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				linha();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InteiroTipo) | (1L << StringTipo) | (1L << BoolTipo) | (1L << Variavel) | (1L << Numero))) != 0) );
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
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public NLinhaContext(LinhaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		try {
			_localctx = new NLinhaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(19);
				declaracao();
				}
				break;
			case 2:
				{
				setState(20);
				atribuicao();
				}
				break;
			case 3:
				{
				setState(21);
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
		public List<TerminalNode> Numero() { return getTokens(modeloParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(modeloParser.Numero, i);
		}
		public List<TerminalNode> Variavel() { return getTokens(modeloParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(modeloParser.Variavel, i);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacao);
		int _la;
		try {
			int _alt;
			_localctx = new NOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
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
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Variavel || _la==Numero );
			setState(29);
			operadores();
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(30);
					_la = _input.LA(1);
					if ( !(_la==Variavel || _la==Numero) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<TerminalNode> Variavel() { return getTokens(modeloParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(modeloParser.Variavel, i);
		}
		public TerminalNode TAtribuicao() { return getToken(modeloParser.TAtribuicao, 0); }
		public List<TerminalNode> Numero() { return getTokens(modeloParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(modeloParser.Numero, i);
		}
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		try {
			int _alt;
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(Variavel);
			setState(36);
			match(TAtribuicao);
			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(37);
						match(Variavel);
						}
						break;
					case 2:
						{
						setState(38);
						match(Numero);
						}
						break;
					case 3:
						{
						setState(39);
						operacao();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TiposContext extends ParserRuleContext {
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
	 
		public TiposContext() { }
		public void copyFrom(TiposContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NTiposContext extends TiposContext {
		public List<TerminalNode> InteiroTipo() { return getTokens(modeloParser.InteiroTipo); }
		public TerminalNode InteiroTipo(int i) {
			return getToken(modeloParser.InteiroTipo, i);
		}
		public List<TerminalNode> StringTipo() { return getTokens(modeloParser.StringTipo); }
		public TerminalNode StringTipo(int i) {
			return getToken(modeloParser.StringTipo, i);
		}
		public List<TerminalNode> BoolTipo() { return getTokens(modeloParser.BoolTipo); }
		public TerminalNode BoolTipo(int i) {
			return getToken(modeloParser.BoolTipo, i);
		}
		public NTiposContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipos);
		int _la;
		try {
			_localctx = new NTiposContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InteiroTipo) | (1L << StringTipo) | (1L << BoolTipo))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InteiroTipo) | (1L << StringTipo) | (1L << BoolTipo))) != 0) );
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
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode Variavel() { return getToken(modeloParser.Variavel, 0); }
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao);
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			tipos();
			{
			setState(50);
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
		public TerminalNode Soma() { return getToken(modeloParser.Soma, 0); }
		public TerminalNode Subtracao() { return getToken(modeloParser.Subtracao, 0); }
		public TerminalNode Multiplicacao() { return getToken(modeloParser.Multiplicacao, 0); }
		public TerminalNode Divisao() { return getToken(modeloParser.Divisao, 0); }
		public NOperadoresContext(OperadoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).enterNOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof modeloListener ) ((modeloListener)listener).exitNOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof modeloVisitor ) return ((modeloVisitor<? extends T>)visitor).visitNOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operadores);
		int _la;
		try {
			_localctx = new NOperadoresContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\209\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\6\4\"\n\4\r"+
		"\4\16\4#\3\5\3\5\3\5\3\5\3\5\6\5+\n\5\r\5\16\5,\3\6\6\6\60\n\6\r\6\16"+
		"\6\61\3\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\3\2\17\20\3\2\13"+
		"\r\3\2\3\6\2:\2\21\3\2\2\2\4\30\3\2\2\2\6\33\3\2\2\2\b%\3\2\2\2\n/\3\2"+
		"\2\2\f\63\3\2\2\2\16\66\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\31\5\f\7\2\26\31\5\b"+
		"\5\2\27\31\5\6\4\2\30\25\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2"+
		"\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36\37\3\2\2\2\37!\5\16\b\2 \"\t\2\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$\7\3\2\2\2%&\7\17\2\2&*\7\n\2\2\'+\7\17\2\2(+\7\20\2\2"+
		")+\5\6\4\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-\t\3\2\2\2.\60\t\3\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\13\3\2\2\2\63\64\5\n\6\2\64\65\7\17\2\2\65\r\3\2\2\2\66\67\t"+
		"\4\2\2\67\17\3\2\2\2\t\23\30\35#*,\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}