// Generated from .//crossLanguage.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class crossLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, STRING=11, NUM=12, DEC=13, OPMAT=14, OPREL=15, PV=16, AC=17, FC=18, 
		AP=19, FP=20, OP_ATRIB=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "STRING", "NUM", "DEC", "OPMAT", "OPREL", "PV", "AC", "FC", "AP", 
			"FP", "OP_ATRIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'X+'", "'X-'", "','", "'integer'", "'text'", "'decimal'", "'se'", 
			"'senao'", "'print'", null, null, null, null, null, null, "';'", "'{'", 
			"'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "STRING", 
			"NUM", "DEC", "OPMAT", "OPREL", "PV", "AC", "FC", "AP", "FP", "OP_ATRIB", 
			"WS"
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


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String codigoJava = "";
	    String ifText, atribText, printText = "";
	    String nome;
		int escopo, tipo;


	public crossLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "crossLanguage.g4"; }

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
		"\u0004\u0000\u0016\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\t[\b\t\u000b\t\f\t\\\u0001\n"+
		"\u0001\n\u0005\na\b\n\n\n\f\nd\t\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b"+
		"i\b\u000b\u000b\u000b\f\u000bj\u0001\f\u0004\fn\b\f\u000b\f\f\fo\u0001"+
		"\f\u0001\f\u0004\ft\b\f\u000b\f\f\fu\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0083\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0092"+
		"\b\u0015\u000b\u0015\f\u0015\u0093\u0001\u0015\u0001\u0015\u0001b\u0000"+
		"\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\u0005\u0002\u0000AZaz\u0001\u000009\u0004\u0000%%*+--//\u0002\u0000"+
		"<<>>\u0003\u0000\t\n\r\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-"+
		"\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u00053\u0001\u0000"+
		"\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000"+
		"\u000bB\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000fM\u0001"+
		"\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000"+
		"\u0000\u0015^\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019"+
		"m\u0001\u0000\u0000\u0000\u001bw\u0001\u0000\u0000\u0000\u001d\u0082\u0001"+
		"\u0000\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000!\u0086\u0001\u0000"+
		"\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%\u008a\u0001\u0000\u0000\u0000"+
		"\'\u008c\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0091"+
		"\u0001\u0000\u0000\u0000-.\u0005X\u0000\u0000./\u0005+\u0000\u0000/\u0002"+
		"\u0001\u0000\u0000\u000001\u0005X\u0000\u000012\u0005-\u0000\u00002\u0004"+
		"\u0001\u0000\u0000\u000034\u0005,\u0000\u00004\u0006\u0001\u0000\u0000"+
		"\u000056\u0005i\u0000\u000067\u0005n\u0000\u000078\u0005t\u0000\u0000"+
		"89\u0005e\u0000\u00009:\u0005g\u0000\u0000:;\u0005e\u0000\u0000;<\u0005"+
		"r\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005t\u0000\u0000>?\u0005"+
		"e\u0000\u0000?@\u0005x\u0000\u0000@A\u0005t\u0000\u0000A\n\u0001\u0000"+
		"\u0000\u0000BC\u0005d\u0000\u0000CD\u0005e\u0000\u0000DE\u0005c\u0000"+
		"\u0000EF\u0005i\u0000\u0000FG\u0005m\u0000\u0000GH\u0005a\u0000\u0000"+
		"HI\u0005l\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005s\u0000\u0000"+
		"KL\u0005e\u0000\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005s\u0000\u0000"+
		"NO\u0005e\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005"+
		"o\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005p\u0000\u0000TU\u0005"+
		"r\u0000\u0000UV\u0005i\u0000\u0000VW\u0005n\u0000\u0000WX\u0005t\u0000"+
		"\u0000X\u0012\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u0014\u0001\u0000\u0000\u0000^b\u0005\"\u0000"+
		"\u0000_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\"\u0000\u0000f\u0016\u0001"+
		"\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u0018\u0001\u0000\u0000\u0000ln\u0007\u0001\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000"+
		"rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u001a\u0001"+
		"\u0000\u0000\u0000wx\u0007\u0002\u0000\u0000x\u001c\u0001\u0000\u0000"+
		"\u0000y\u0083\u0007\u0003\u0000\u0000z{\u0005>\u0000\u0000{\u0083\u0005"+
		"=\u0000\u0000|}\u0005<\u0000\u0000}\u0083\u0005=\u0000\u0000~\u007f\u0005"+
		"=\u0000\u0000\u007f\u0083\u0005=\u0000\u0000\u0080\u0081\u0005!\u0000"+
		"\u0000\u0081\u0083\u0005=\u0000\u0000\u0082y\u0001\u0000\u0000\u0000\u0082"+
		"z\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082~\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u001e\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005;\u0000\u0000\u0085 \u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005{\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005}\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005(\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005)"+
		"\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0005=\u0000\u0000"+
		"\u008f*\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0004\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0015\u0000\u0000\u0096"+
		",\u0001\u0000\u0000\u0000\b\u0000\\bjou\u0082\u0093\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}