// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Soma=1, Subtracao=2, Multiplicacao=3, Divisao=4, EoF=5, Space=6, Bool=7, 
		TAtribuicao=8, Tipos=9, Impressao=10, Variavel=11, Numero=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Soma", "Subtracao", "Multiplicacao", "Divisao", "EoF", "Space", "Bool", 
			"TAtribuicao", "Tipos", "Impressao", "Variavel", "Numero"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\63\n\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nD\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\5\fO\n\f\3\f\6\fR\n\f\r\f\16\fS\3\r\6\rW\n"+
		"\r\r\r\16\rX\3\r\3\r\5\r]\n\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\3\2\6\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2\62;\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2"+
		"\2\2\13#\3\2\2\2\r%\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23C\3\2\2\2\25"+
		"E\3\2\2\2\27N\3\2\2\2\31V\3\2\2\2\33\34\7-\2\2\34\4\3\2\2\2\35\36\7/\2"+
		"\2\36\6\3\2\2\2\37 \7,\2\2 \b\3\2\2\2!\"\7\61\2\2\"\n\3\2\2\2#$\7=\2\2"+
		"$\f\3\2\2\2%&\t\2\2\2&\'\3\2\2\2\'(\b\7\2\2(\16\3\2\2\2)*\7h\2\2*+\7c"+
		"\2\2+,\7n\2\2,-\7u\2\2-\63\7g\2\2./\7v\2\2/\60\7t\2\2\60\61\7w\2\2\61"+
		"\63\7g\2\2\62)\3\2\2\2\62.\3\2\2\2\63\20\3\2\2\2\64\65\7?\2\2\65\22\3"+
		"\2\2\2\66\67\7k\2\2\678\7p\2\28D\7v\2\29:\7u\2\2:;\7v\2\2;<\7t\2\2<=\7"+
		"k\2\2=>\7p\2\2>D\7i\2\2?@\7d\2\2@A\7q\2\2AB\7q\2\2BD\7n\2\2C\66\3\2\2"+
		"\2C9\3\2\2\2C?\3\2\2\2D\24\3\2\2\2EF\7k\2\2FG\7o\2\2GH\7r\2\2HI\7t\2\2"+
		"IJ\7k\2\2JK\7o\2\2KL\7c\2\2L\26\3\2\2\2MO\t\3\2\2NM\3\2\2\2OQ\3\2\2\2"+
		"PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\30\3\2\2\2UW\t\5\2"+
		"\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2Z[\7\60\2\2[]\t\5"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2\n\2\62CNQSX\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}