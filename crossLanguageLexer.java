// Generated from crossLanguage.g4 by ANTLR 4.13.1

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, STRING=21, NUM=22, DEC=23, OPMAT=24, OPREL=25, 
		LOOP=26, AC=27, FC=28, AP=29, FP=30, OP_ATRIB=31, OP_INC=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "ID", "STRING", "NUM", "DEC", "OPMAT", "OPREL", "LOOP", 
			"AC", "FC", "AP", "FP", "OP_ATRIB", "OP_INC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'X+'", "'X-'", "','", "'nat'", "'txt'", "'dec'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'when'", "'do'", "'else'", "'outX'", "'inX'", 
			"'iterate'", "'break'", null, null, null, null, "':'", null, "'->'", 
			"'{'", "'}'", "'('", "')'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "STRING", "NUM", 
			"DEC", "OPMAT", "OPREL", "LOOP", "AC", "FC", "AP", "FP", "OP_ATRIB", 
			"OP_INC", "WS"
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


		Variable newVariable = new Variable();
		VariableController vc = new VariableController();
		String javaCode = "";
	    String name, mathText, ifText, forText, atribText, printText = "";
		int value, type, insideExpr, numInt, numFloat;
	    boolean notDeclared, hasScan = false, initScan = false, initFor = false, insideFor = false, insideDeclare = false;

	    private void tab(){
	        if(insideExpr > 0){
	            for(int i=0; i<insideExpr; i++){
	                javaCode += "\t";
	            }
	        }
	        javaCode += "\t\t";
	    } 

	    private void isDeclared(String text){
	        try {
	            if(vc.exists(text) == false){
	                throw new Exception("Variable "+text+" is not declared!");
	            }
	        } catch(Exception e){
	            e.printStackTrace();
	            System.exit(1);
	        }
	    }

	    private static boolean isInteger(String s) {
	        try {
	            Integer.parseInt(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    private static boolean isFloat(String s) {
	        if (isValidFloat(s)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    private static boolean isValidFloat(String s) {
	        try {
	            float f = Float.parseFloat(s);
	            return s.contains(".") && s.indexOf('.') < s.length() - 1;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }


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
		"\u0004\u0000!\u00cc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u008a\b\u0013"+
		"\u000b\u0013\f\u0013\u008b\u0001\u0014\u0001\u0014\u0005\u0014\u0090\b"+
		"\u0014\n\u0014\f\u0014\u0093\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015\u0098\b\u0015\u000b\u0015\f\u0015\u0099\u0001\u0016\u0004"+
		"\u0016\u009d\b\u0016\u000b\u0016\f\u0016\u009e\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u00a3\b\u0016\u000b\u0016\f\u0016\u00a4\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00b0\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00c4\b\u001f\u0001"+
		" \u0004 \u00c7\b \u000b \f \u00c8\u0001 \u0001 \u0001\u0091\u0000!\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0001\u000009\u0002\u0000<<>>\u0003\u0000\t\n\r"+
		"\r  \u00d5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003F\u0001"+
		"\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007K\u0001\u0000\u0000"+
		"\u0000\tO\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000\u0000\rW\u0001"+
		"\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011[\u0001\u0000\u0000"+
		"\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017"+
		"a\u0001\u0000\u0000\u0000\u0019d\u0001\u0000\u0000\u0000\u001bi\u0001"+
		"\u0000\u0000\u0000\u001dl\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000"+
		"\u0000!v\u0001\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000%\u0082\u0001"+
		"\u0000\u0000\u0000\'\u0089\u0001\u0000\u0000\u0000)\u008d\u0001\u0000"+
		"\u0000\u0000+\u0097\u0001\u0000\u0000\u0000-\u009c\u0001\u0000\u0000\u0000"+
		"/\u00a6\u0001\u0000\u0000\u00001\u00af\u0001\u0000\u0000\u00003\u00b1"+
		"\u0001\u0000\u0000\u00005\u00b4\u0001\u0000\u0000\u00007\u00b6\u0001\u0000"+
		"\u0000\u00009\u00b8\u0001\u0000\u0000\u0000;\u00ba\u0001\u0000\u0000\u0000"+
		"=\u00bc\u0001\u0000\u0000\u0000?\u00c3\u0001\u0000\u0000\u0000A\u00c6"+
		"\u0001\u0000\u0000\u0000CD\u0005X\u0000\u0000DE\u0005+\u0000\u0000E\u0002"+
		"\u0001\u0000\u0000\u0000FG\u0005X\u0000\u0000GH\u0005-\u0000\u0000H\u0004"+
		"\u0001\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0006\u0001\u0000\u0000"+
		"\u0000KL\u0005n\u0000\u0000LM\u0005a\u0000\u0000MN\u0005t\u0000\u0000"+
		"N\b\u0001\u0000\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005x\u0000\u0000"+
		"QR\u0005t\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005d\u0000\u0000"+
		"TU\u0005e\u0000\u0000UV\u0005c\u0000\u0000V\f\u0001\u0000\u0000\u0000"+
		"WX\u0005+\u0000\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005-\u0000\u0000"+
		"Z\u0010\u0001\u0000\u0000\u0000[\\\u0005*\u0000\u0000\\\u0012\u0001\u0000"+
		"\u0000\u0000]^\u0005/\u0000\u0000^\u0014\u0001\u0000\u0000\u0000_`\u0005"+
		"%\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000bc\u0005"+
		"=\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005w\u0000\u0000ef\u0005"+
		"h\u0000\u0000fg\u0005e\u0000\u0000gh\u0005n\u0000\u0000h\u001a\u0001\u0000"+
		"\u0000\u0000ij\u0005d\u0000\u0000jk\u0005o\u0000\u0000k\u001c\u0001\u0000"+
		"\u0000\u0000lm\u0005e\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000"+
		"\u0000op\u0005e\u0000\u0000p\u001e\u0001\u0000\u0000\u0000qr\u0005o\u0000"+
		"\u0000rs\u0005u\u0000\u0000st\u0005t\u0000\u0000tu\u0005X\u0000\u0000"+
		"u \u0001\u0000\u0000\u0000vw\u0005i\u0000\u0000wx\u0005n\u0000\u0000x"+
		"y\u0005X\u0000\u0000y\"\u0001\u0000\u0000\u0000z{\u0005i\u0000\u0000{"+
		"|\u0005t\u0000\u0000|}\u0005e\u0000\u0000}~\u0005r\u0000\u0000~\u007f"+
		"\u0005a\u0000\u0000\u007f\u0080\u0005t\u0000\u0000\u0080\u0081\u0005e"+
		"\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0083\u0005b\u0000\u0000"+
		"\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086"+
		"\u0005a\u0000\u0000\u0086\u0087\u0005k\u0000\u0000\u0087&\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0007\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c(\u0001\u0000\u0000"+
		"\u0000\u008d\u0091\u0005\"\u0000\u0000\u008e\u0090\t\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\"\u0000\u0000\u0095*\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0007\u0001\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a,\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0007\u0001\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0005.\u0000\u0000\u00a1\u00a3\u0007\u0001\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5.\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005:\u0000\u0000\u00a70\u0001\u0000\u0000\u0000"+
		"\u00a8\u00b0\u0007\u0002\u0000\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa"+
		"\u00b0\u0005=\u0000\u0000\u00ab\u00ac\u0005<\u0000\u0000\u00ac\u00b0\u0005"+
		"=\u0000\u0000\u00ad\u00ae\u0005!\u0000\u0000\u00ae\u00b0\u0005=\u0000"+
		"\u0000\u00af\u00a8\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000"+
		"\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005-\u0000\u0000\u00b2"+
		"\u00b3\u0005>\u0000\u0000\u00b34\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"{\u0000\u0000\u00b56\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005}\u0000"+
		"\u0000\u00b78\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005(\u0000\u0000\u00b9"+
		":\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb<\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005>\u0000\u0000\u00bd\u00be\u0005>\u0000"+
		"\u0000\u00be>\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000\u00c0"+
		"\u00c4\u0005+\u0000\u0000\u00c1\u00c2\u0005>\u0000\u0000\u00c2\u00c4\u0005"+
		"-\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4@\u0001\u0000\u0000\u0000\u00c5\u00c7\u0007\u0003\u0000"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006 \u0000\u0000"+
		"\u00cbB\u0001\u0000\u0000\u0000\t\u0000\u008b\u0091\u0099\u009e\u00a4"+
		"\u00af\u00c3\u00c8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}