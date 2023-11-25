// Generated from ./crossLanguage.g4 by ANTLR 4.13.1

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, STRING=16, NUM=17, 
		DEC=18, OPMAT=19, OPREL=20, LOOP=21, AC=22, FC=23, AP=24, FP=25, OP_ATRIB=26, 
		OP_INPUT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "STRING", "NUM", "DEC", 
			"OPMAT", "OPREL", "LOOP", "AC", "FC", "AP", "FP", "OP_ATRIB", "OP_INPUT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'X+'", "'START'", "'END'", "'X-'", "','", "'nat'", "'text'", "'dec'", 
			"'when'", "'do'", "'else'", "'outX'", "'inX'", "'iterate'", null, null, 
			null, null, null, null, "'->'", "'{'", "'}'", "'('", "')'", "'>>'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "STRING", "NUM", "DEC", "OPMAT", "OPREL", "LOOP", 
			"AC", "FC", "AP", "FP", "OP_ATRIB", "OP_INPUT", "WS"
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
	    String ifText, forText, atribText, printText = "";
	    String nome;
		int escopo, tipo;
	    boolean hasScan, insideFor = false;


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
		"\u0004\u0000\u001c\u00b9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0004\u000ex\b\u000e\u000b\u000e\f\u000ey\u0001"+
		"\u000f\u0001\u000f\u0005\u000f~\b\u000f\n\u000f\f\u000f\u0081\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0086\b\u0010\u000b\u0010"+
		"\f\u0010\u0087\u0001\u0011\u0004\u0011\u008b\b\u0011\u000b\u0011\f\u0011"+
		"\u008c\u0001\u0011\u0001\u0011\u0004\u0011\u0091\b\u0011\u000b\u0011\f"+
		"\u0011\u0092\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00a0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0004\u001b\u00b4\b\u001b\u000b\u001b\f\u001b"+
		"\u00b5\u0001\u001b\u0001\u001b\u0001\u007f\u0000\u001c\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000009\u0004\u0000"+
		"%%*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u00c2\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00019\u0001\u0000"+
		"\u0000\u0000\u0003<\u0001\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000"+
		"\u0007F\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001"+
		"\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000"+
		"\u0000\u0011X\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015"+
		"`\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019j\u0001"+
		"\u0000\u0000\u0000\u001bn\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000"+
		"\u0000\u001f{\u0001\u0000\u0000\u0000!\u0085\u0001\u0000\u0000\u0000#"+
		"\u008a\u0001\u0000\u0000\u0000%\u0094\u0001\u0000\u0000\u0000\'\u009f"+
		"\u0001\u0000\u0000\u0000)\u00a1\u0001\u0000\u0000\u0000+\u00a4\u0001\u0000"+
		"\u0000\u0000-\u00a6\u0001\u0000\u0000\u0000/\u00a8\u0001\u0000\u0000\u0000"+
		"1\u00aa\u0001\u0000\u0000\u00003\u00ac\u0001\u0000\u0000\u00005\u00af"+
		"\u0001\u0000\u0000\u00007\u00b3\u0001\u0000\u0000\u00009:\u0005X\u0000"+
		"\u0000:;\u0005+\u0000\u0000;\u0002\u0001\u0000\u0000\u0000<=\u0005S\u0000"+
		"\u0000=>\u0005T\u0000\u0000>?\u0005A\u0000\u0000?@\u0005R\u0000\u0000"+
		"@A\u0005T\u0000\u0000A\u0004\u0001\u0000\u0000\u0000BC\u0005E\u0000\u0000"+
		"CD\u0005N\u0000\u0000DE\u0005D\u0000\u0000E\u0006\u0001\u0000\u0000\u0000"+
		"FG\u0005X\u0000\u0000GH\u0005-\u0000\u0000H\b\u0001\u0000\u0000\u0000"+
		"IJ\u0005,\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005n\u0000\u0000"+
		"LM\u0005a\u0000\u0000MN\u0005t\u0000\u0000N\f\u0001\u0000\u0000\u0000"+
		"OP\u0005t\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005x\u0000\u0000RS\u0005"+
		"t\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005d\u0000\u0000UV\u0005"+
		"e\u0000\u0000VW\u0005c\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005"+
		"w\u0000\u0000YZ\u0005h\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005n\u0000"+
		"\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005d\u0000\u0000^_\u0005o\u0000"+
		"\u0000_\u0014\u0001\u0000\u0000\u0000`a\u0005e\u0000\u0000ab\u0005l\u0000"+
		"\u0000bc\u0005s\u0000\u0000cd\u0005e\u0000\u0000d\u0016\u0001\u0000\u0000"+
		"\u0000ef\u0005o\u0000\u0000fg\u0005u\u0000\u0000gh\u0005t\u0000\u0000"+
		"hi\u0005X\u0000\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0005i\u0000\u0000"+
		"kl\u0005n\u0000\u0000lm\u0005X\u0000\u0000m\u001a\u0001\u0000\u0000\u0000"+
		"no\u0005i\u0000\u0000op\u0005t\u0000\u0000pq\u0005e\u0000\u0000qr\u0005"+
		"r\u0000\u0000rs\u0005a\u0000\u0000st\u0005t\u0000\u0000tu\u0005e\u0000"+
		"\u0000u\u001c\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{\u007f\u0005"+
		"\"\u0000\u0000|~\t\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\"\u0000\u0000\u0083 \u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0007\u0001\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\"\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0007\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0005.\u0000\u0000\u008f\u0091\u0007\u0001\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093$\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095"+
		"&\u0001\u0000\u0000\u0000\u0096\u00a0\u0007\u0003\u0000\u0000\u0097\u0098"+
		"\u0005>\u0000\u0000\u0098\u00a0\u0005=\u0000\u0000\u0099\u009a\u0005<"+
		"\u0000\u0000\u009a\u00a0\u0005=\u0000\u0000\u009b\u009c\u0005=\u0000\u0000"+
		"\u009c\u00a0\u0005=\u0000\u0000\u009d\u009e\u0005!\u0000\u0000\u009e\u00a0"+
		"\u0005=\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u0097\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009b\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0(\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005-\u0000\u0000\u00a2\u00a3\u0005>\u0000\u0000"+
		"\u00a3*\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005{\u0000\u0000\u00a5,"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005}\u0000\u0000\u00a7.\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005(\u0000\u0000\u00a90\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005)\u0000\u0000\u00ab2\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005>\u0000\u0000\u00ad\u00ae\u0005>\u0000\u0000\u00ae4\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005<\u0000\u0000\u00b0\u00b1\u0005<\u0000\u0000"+
		"\u00b16\u0001\u0000\u0000\u0000\u00b2\u00b4\u0007\u0004\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u001b\u0000\u0000\u00b8"+
		"8\u0001\u0000\u0000\u0000\b\u0000y\u007f\u0087\u008c\u0092\u009f\u00b5"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}