// Generated from Teste.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TesteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variavel=1, Numero=2, Soma=3, Subtracao=4, Multiplicacao=5, Divisao=6, 
		EoF=7, Space=8, Bool=9, TAtribuicao=10, InteiroTipo=11, StringTipo=12, 
		BoolTipo=13, Impressao=14;
	public static final int
		RULE_tLinha = 0, RULE_linha = 1, RULE_operacao = 2, RULE_atribuicao = 3, 
		RULE_tipos = 4, RULE_declaracao = 5, RULE_operadores = 6, RULE_impressao = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"tLinha", "linha", "operacao", "atribuicao", "tipos", "declaracao", "operadores", 
			"impressao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "';'", null, null, "'='", 
			"'int'", "'string'", "'bool'", "'imprima'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variavel", "Numero", "Soma", "Subtracao", "Multiplicacao", "Divisao", 
			"EoF", "Space", "Bool", "TAtribuicao", "InteiroTipo", "StringTipo", "BoolTipo", 
			"Impressao"
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
	public String getGrammarFileName() { return "Teste.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TesteParser(TokenStream input) {
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
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterFimLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitFimLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitFimLinha(this);
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				linha();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Variavel) | (1L << Numero) | (1L << InteiroTipo) | (1L << StringTipo) | (1L << BoolTipo) | (1L << Impressao))) != 0) );
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
		public TerminalNode EoF() { return getToken(TesteParser.EoF, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ImpressaoContext impressao() {
			return getRuleContext(ImpressaoContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public NLinhaContext(LinhaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNLinha(this);
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
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(21);
				declaracao();
				}
				break;
			case 2:
				{
				setState(22);
				atribuicao();
				}
				break;
			case 3:
				{
				setState(23);
				impressao();
				}
				break;
			case 4:
				{
				setState(24);
				operacao();
				}
				break;
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
		public List<TerminalNode> Numero() { return getTokens(TesteParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(TesteParser.Numero, i);
		}
		public List<TerminalNode> Variavel() { return getTokens(TesteParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(TesteParser.Variavel, i);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNOperacao(this);
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
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
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
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Variavel || _la==Numero );
			setState(34);
			operadores();
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
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
				setState(38); 
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
		public List<TerminalNode> Variavel() { return getTokens(TesteParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(TesteParser.Variavel, i);
		}
		public TerminalNode TAtribuicao() { return getToken(TesteParser.TAtribuicao, 0); }
		public List<TerminalNode> Numero() { return getTokens(TesteParser.Numero); }
		public TerminalNode Numero(int i) {
			return getToken(TesteParser.Numero, i);
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
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNAtribuicao(this);
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
			setState(40);
			match(Variavel);
			setState(41);
			match(TAtribuicao);
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(42);
						match(Variavel);
						}
						break;
					case 2:
						{
						setState(43);
						match(Numero);
						}
						break;
					case 3:
						{
						setState(44);
						operacao();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47); 
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
		public List<TerminalNode> InteiroTipo() { return getTokens(TesteParser.InteiroTipo); }
		public TerminalNode InteiroTipo(int i) {
			return getToken(TesteParser.InteiroTipo, i);
		}
		public List<TerminalNode> StringTipo() { return getTokens(TesteParser.StringTipo); }
		public TerminalNode StringTipo(int i) {
			return getToken(TesteParser.StringTipo, i);
		}
		public List<TerminalNode> BoolTipo() { return getTokens(TesteParser.BoolTipo); }
		public TerminalNode BoolTipo(int i) {
			return getToken(TesteParser.BoolTipo, i);
		}
		public NTiposContext(TiposContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNTipos(this);
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
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
				setState(52); 
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
		public List<TerminalNode> Variavel() { return getTokens(TesteParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(TesteParser.Variavel, i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao);
		int _la;
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			tipos();
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(55);
					match(Variavel);
					}
					break;
				case 2:
					{
					setState(56);
					atribuicao();
					}
					break;
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Variavel );
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
		public List<TerminalNode> Soma() { return getTokens(TesteParser.Soma); }
		public TerminalNode Soma(int i) {
			return getToken(TesteParser.Soma, i);
		}
		public List<TerminalNode> Subtracao() { return getTokens(TesteParser.Subtracao); }
		public TerminalNode Subtracao(int i) {
			return getToken(TesteParser.Subtracao, i);
		}
		public List<TerminalNode> Multiplicacao() { return getTokens(TesteParser.Multiplicacao); }
		public TerminalNode Multiplicacao(int i) {
			return getToken(TesteParser.Multiplicacao, i);
		}
		public List<TerminalNode> Divisao() { return getTokens(TesteParser.Divisao); }
		public TerminalNode Divisao(int i) {
			return getToken(TesteParser.Divisao, i);
		}
		public NOperadoresContext(OperadoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNOperadores(this);
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
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
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
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Soma) | (1L << Subtracao) | (1L << Multiplicacao) | (1L << Divisao))) != 0) );
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
		public TerminalNode Impressao() { return getToken(TesteParser.Impressao, 0); }
		public TerminalNode Variavel() { return getToken(TesteParser.Variavel, 0); }
		public NImpressaoContext(ImpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).enterNImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TesteListener ) ((TesteListener)listener).exitNImpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TesteVisitor ) return ((TesteVisitor<? extends T>)visitor).visitNImpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_impressao);
		try {
			_localctx = new NImpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66);
			match(Impressao);
			setState(67);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\4\6\4!\n\4\r\4\16\4\"\3"+
		"\4\3\4\6\4\'\n\4\r\4\16\4(\3\5\3\5\3\5\3\5\3\5\6\5\60\n\5\r\5\16\5\61"+
		"\3\6\6\6\65\n\6\r\6\16\6\66\3\7\3\7\3\7\6\7<\n\7\r\7\16\7=\3\b\6\bA\n"+
		"\b\r\b\16\bB\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\5\3\2\3\4\3\2\r"+
		"\17\3\2\5\b\2L\2\23\3\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b*\3\2\2\2\n\64\3"+
		"\2\2\2\f8\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2"+
		"\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\34\5\f\7\2"+
		"\30\34\5\b\5\2\31\34\5\20\t\2\32\34\5\6\4\2\33\27\3\2\2\2\33\30\3\2\2"+
		"\2\33\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\7\t\2\2\36\5\3\2\2"+
		"\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2"+
		"$&\5\16\b\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2"+
		"\2\2*+\7\3\2\2+/\7\f\2\2,\60\7\3\2\2-\60\7\4\2\2.\60\5\6\4\2/,\3\2\2\2"+
		"/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2"+
		"\2\2\63\65\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\13\3\2\2\28;\5\n\6\29<\7\3\2\2:<\5\b\5\2;9\3\2\2\2;:\3\2\2\2<"+
		"=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?A\t\4\2\2@?\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\17\3\2\2\2DE\7\20\2\2EF\7\3\2\2F\21\3\2\2\2\f\25"+
		"\33\"(/\61\66;=B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}