// Generated from modelo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class modeloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Soma=1, Subtracao=2, Multiplicacao=3, Divisao=4, EoF=5, Space=6, Bool=7, 
		TAtribuicao=8, InteiroTipo=9, StringTipo=10, BoolTipo=11, Impressao=12, 
		Variavel=13, Numero=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Soma", "Subtracao", "Multiplicacao", "Divisao", "EoF", "Space", "Bool", 
			"TAtribuicao", "InteiroTipo", "StringTipo", "BoolTipo", "Impressao", 
			"Variavel", "Numero"
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


	public modeloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "modelo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\67"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\6\16U\n\16\r"+
		"\16\16\16V\3\17\6\17Z\n\17\r\17\16\17[\3\17\3\17\5\17`\n\17\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\6\5\2\13\f\17\17\"\"\3\2c|\5\2\62;C\\c|\3\2\62;\2d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'"+
		"\3\2\2\2\r)\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25>\3\2\2\2"+
		"\27E\3\2\2\2\31J\3\2\2\2\33R\3\2\2\2\35Y\3\2\2\2\37 \7-\2\2 \4\3\2\2\2"+
		"!\"\7/\2\2\"\6\3\2\2\2#$\7,\2\2$\b\3\2\2\2%&\7\61\2\2&\n\3\2\2\2\'(\7"+
		"=\2\2(\f\3\2\2\2)*\t\2\2\2*+\3\2\2\2+,\b\7\2\2,\16\3\2\2\2-.\7h\2\2./"+
		"\7c\2\2/\60\7n\2\2\60\61\7u\2\2\61\67\7g\2\2\62\63\7v\2\2\63\64\7t\2\2"+
		"\64\65\7w\2\2\65\67\7g\2\2\66-\3\2\2\2\66\62\3\2\2\2\67\20\3\2\2\289\7"+
		"?\2\29\22\3\2\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\24\3\2\2\2>?\7u\2\2?@\7"+
		"v\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7i\2\2D\26\3\2\2\2EF\7d\2\2FG\7q\2"+
		"\2GH\7q\2\2HI\7n\2\2I\30\3\2\2\2JK\7k\2\2KL\7o\2\2LM\7r\2\2MN\7t\2\2N"+
		"O\7k\2\2OP\7o\2\2PQ\7c\2\2Q\32\3\2\2\2RT\t\3\2\2SU\t\4\2\2TS\3\2\2\2U"+
		"V\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\34\3\2\2\2XZ\t\5\2\2YX\3\2\2\2Z[\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]^\7\60\2\2^`\t\5\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`\36\3\2\2\2\b\2\66TV[_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}