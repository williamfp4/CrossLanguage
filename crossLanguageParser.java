// Generated from crossLanguage.g4 by ANTLR 4.13.1

    import java.util.*;
    import java.util.ArrayList;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class crossLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, STRING=20, NUM=21, DEC=22, OPMAT=23, OPREL=24, LOOP=25, 
		AC=26, FC=27, AP=28, FP=29, OP_ATRIB=30, OP_INPUT=31, WS=32;
	public static final int
		RULE_vai = 0, RULE_declare = 1, RULE_atrib = 2, RULE_tipo = 3, RULE_expr = 4, 
		RULE_mathExpr = 5, RULE_mathAdd = 6, RULE_mathMul = 7, RULE_unaryExpr = 8, 
		RULE_comp = 9, RULE_comptext = 10, RULE_cond = 11, RULE_printf = 12, RULE_scanf = 13, 
		RULE_for = 14, RULE_while = 15, RULE_printTypes = 16, RULE_primary = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"vai", "declare", "atrib", "tipo", "expr", "mathExpr", "mathAdd", "mathMul", 
			"unaryExpr", "comp", "comptext", "cond", "printf", "scanf", "for", "while", 
			"printTypes", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'X+'", "'X-'", "','", "'nat'", "'txt'", "'dec'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'when'", "'do'", "'else'", "'outX'", "'inX'", 
			"'iterate'", null, null, null, null, "':'", null, "'->'", "'{'", "'}'", 
			"'('", "')'", "'>>'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "STRING", "NUM", "DEC", 
			"OPMAT", "OPREL", "LOOP", "AC", "FC", "AP", "FP", "OP_ATRIB", "OP_INPUT", 
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

	@Override
	public String getGrammarFileName() { return "crossLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Variavel novaVariavel = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String codigoJava = "";
	    String mathText, ifText, forText, atribText, printText = "";
	    String nome;
		int valor, tipo, insideExpr, numInt, numFloat;;
	    boolean hasScan = false, initScan = false, initFor = false;
	    private void tab(){
	        if(insideExpr > 0){
	            for(int i=0; i<insideExpr; i++){
	                codigoJava += "\t";
	            }
	        }
	        codigoJava += "\t\t";
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

	public crossLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VaiContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterVai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitVai(this);
		}
	}

	public final VaiContext vai() throws RecognitionException {
		VaiContext _localctx = new VaiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			 
			            codigoJava += "import java.util.*;\n\n";
					    codigoJava += "public class Codigo{\n";
			            codigoJava += "\tpublic static void main(String args[]){\n"; 
					
			setState(38);
			expr();

			            codigoJava += "\n\t}\n}";
			            System.out.println(codigoJava);
			        
			setState(40);
			match(T__1);
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
	public static class DeclareContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(42);
					tipo();
					setState(43);
					atrib();
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(44);
						match(T__2);
						codigoJava += ",";
						setState(46);
						atrib();
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					                    if(!initScan && !initFor){
					                        codigoJava += ";\n";
					                    }
					                
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public Token ID;
		public PrimaryContext primary;
		public Token STRING;
		public TerminalNode ID() { return getToken(crossLanguageParser.ID, 0); }
		public TerminalNode OP_ATRIB() { return getToken(crossLanguageParser.OP_ATRIB, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode STRING() { return getToken(crossLanguageParser.STRING, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((AtribContext)_localctx).ID = match(ID);
			 
			            novaVariavel = new Variavel((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null), tipo, valor);
			            boolean declarado = cv.adiciona(novaVariavel);
			            if(!declarado){
			                novaVariavel = cv.busca((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null));
			                tipo = novaVariavel.getTipo();
			            }
			            codigoJava += (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            if(insideExpr > 0){
			                forText = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            }
			        
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIB) {
				{
				setState(60);
				match(OP_ATRIB);
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(61);
					mathExpr();

					                    if(numFloat > 0 && tipo == 0){
					                        System.out.println(mathText + " is not a valid Natural number expression");
					                        System.exit(1);
					                    }
					                    
					                    if(numInt > 0 && tipo == 2){
					                        System.out.println(mathText + " is not a valid Decimal number expression");
					                        System.exit(1);
					                    }
					                    codigoJava += " = " + mathText;
					                
					}
					break;
				case 2:
					{
					setState(64);
					((AtribContext)_localctx).primary = primary();

					                    if((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null) != null){
					                        codigoJava += " = "+(((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null);
					                    }
					                    switch(tipo){
					                        case 0: if(isInteger((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null)) == false){System.out.println("Not a natural number!"); System.exit(1);} break;
					                        case 2: if(isFloat((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null)) == false){System.out.println("Not a decimal number!"); System.exit(1);} if(!initFor){ codigoJava += "f";} break;
					                        default: System.out.println("Variable type invalid!"); break;
					                    }
					                
					}
					break;
				case 3:
					{
					setState(67);
					((AtribContext)_localctx).STRING = match(STRING);

					                    codigoJava += " = "+(((AtribContext)_localctx).STRING!=null?((AtribContext)_localctx).STRING.getText():null);
					                
					}
					break;
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(73);
				match(T__3);
					tipo = 0;
				                        if(!initFor){
				                            tab();
				                        }
				                        codigoJava += "int ";
				                    
				}
				break;
			case T__4:
				{
				setState(75);
				match(T__4);
					tipo = 1;
				                        if(!initFor){
				                            tab();
				                        }
				                        codigoJava += "String ";
				                    
				}
				break;
			case T__5:
				{
				setState(77);
				match(T__5);
					tipo = 2;
				                        if(!initFor){
				                            tab();
				                        }
				                        codigoJava += "float ";
				                    
				}
				break;
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExprContext extends ParserRuleContext {
		public List<PrintfContext> printf() {
			return getRuleContexts(PrintfContext.class);
		}
		public PrintfContext printf(int i) {
			return getRuleContext(PrintfContext.class,i);
		}
		public List<ScanfContext> scanf() {
			return getRuleContexts(ScanfContext.class);
		}
		public ScanfContext scanf(int i) {
			return getRuleContext(ScanfContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42934384L) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					tab();
					setState(83);
					printf();
					}
					break;
				case 2:
					{
					tab();
					setState(85);
					scanf();
					}
					break;
				case 3:
					{
					tab();
					setState(87);
					cond();
					}
					break;
				case 4:
					{
					tab();
					setState(89);
					atrib();
					}
					break;
				case 5:
					{
					tab();
					setState(91);
					for_();
					}
					break;
				case 6:
					{
					tab();
					setState(93);
					while_();
					}
					break;
				case 7:
					{
					setState(94);
					declare();
					}
					break;
				case 8:
					{
					setState(95);
					mathExpr();
					}
					break;
				}
				}
				setState(100);
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
	public static class MathExprContext extends ParserRuleContext {
		public MathAddContext mathAdd;
		public TerminalNode OPMAT() { return getToken(crossLanguageParser.OPMAT, 0); }
		public MathAddContext mathAdd() {
			return getRuleContext(MathAddContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitMathExpr(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OPMAT);
			setState(102);
			((MathExprContext)_localctx).mathAdd = mathAdd();

			                numInt = numFloat = 0;

			                String var = "[a-zA-Z_]+";
			                String num = "[0-9]+";

			                Pattern regVar = Pattern.compile(var);
			                Pattern regNum = Pattern.compile(num);

			                mathText = (((MathExprContext)_localctx).mathAdd!=null?_input.getText(((MathExprContext)_localctx).mathAdd.start,((MathExprContext)_localctx).mathAdd.stop):null);

			                Matcher matchVar = regVar.matcher(mathText);
			                Matcher matchNum = regNum.matcher(mathText);

			                ArrayList<String> tokens = new ArrayList<>();
			                ArrayList<String> numbers = new ArrayList<>();

			                while (matchVar.find()) {
			                    tokens.add(matchVar.group());
			                }
			                while (matchNum.find()) {
			                    numbers.add(matchNum.group());
			                }

			                for (String t : tokens) {
			                    Variavel variable = cv.busca(t);
			                    switch(variable.getTipo()){
			                        case 0: numInt+=1; break;
			                        case 1: System.out.println("Can't use Text in a mathematical operation"); System.exit(1);
			                        case 2: numFloat+=1; break;
			                        default: System.out.println(variable.getValor() + " is not a valid operand\n"); System.exit(1);
			                    }
			                }
			                for (String n : numbers) {
			                    if (isInteger(n)) {
			                        numInt+=1;
			                    } else if (isFloat(n)) {
			                        numFloat+=1;
			                    } else {
			                        System.out.println(n + " is not a valid operand\n");
			                        System.exit(1);
			                    }
			                }

			                if (!((numInt > 0 && numFloat == 0) || (numInt == 0 && numFloat > 0))) {
			                    System.out.println("Only one variable type is supported during math expressions");
			                    System.exit(1);
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
	public static class MathAddContext extends ParserRuleContext {
		public List<MathMulContext> mathMul() {
			return getRuleContexts(MathMulContext.class);
		}
		public MathMulContext mathMul(int i) {
			return getRuleContext(MathMulContext.class,i);
		}
		public MathAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterMathAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitMathAdd(this);
		}
	}

	public final MathAddContext mathAdd() throws RecognitionException {
		MathAddContext _localctx = new MathAddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			mathMul();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				mathMul();
				}
				}
				setState(112);
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
	public static class MathMulContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public MathMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterMathMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitMathMul(this);
		}
	}

	public final MathMulContext mathMul() throws RecognitionException {
		MathMulContext _localctx = new MathMulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			unaryExpr();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) {
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				unaryExpr();
				}
				}
				setState(120);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public MathAddContext mathAdd() {
			return getRuleContext(MathAddContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
			case ID:
			case NUM:
			case DEC:
			case OPMAT:
			case LOOP:
			case FC:
			case FP:
				{
				setState(124);
				primary();
				}
				break;
			case AP:
				{
				setState(125);
				match(AP);
				setState(126);
				mathAdd();
				setState(127);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CompContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(crossLanguageParser.OPREL, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			primary();
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==OPREL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			primary();
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
	public static class ComptextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(crossLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(crossLanguageParser.STRING, i);
		}
		public ComptextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comptext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterComptext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitComptext(this);
		}
	}

	public final ComptextContext comptext() throws RecognitionException {
		ComptextContext _localctx = new ComptextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comptext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(STRING);
			{
			setState(136);
			match(T__11);
			}
			setState(137);
			match(STRING);
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
	public static class CondContext extends ParserRuleContext {
		public CompContext comp;
		public List<TerminalNode> AP() { return getTokens(crossLanguageParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(crossLanguageParser.AP, i);
		}
		public List<TerminalNode> FP() { return getTokens(crossLanguageParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(crossLanguageParser.FP, i);
		}
		public List<TerminalNode> AC() { return getTokens(crossLanguageParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(crossLanguageParser.AC, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(crossLanguageParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(crossLanguageParser.FC, i);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public List<ComptextContext> comptext() {
			return getRuleContexts(ComptextContext.class);
		}
		public ComptextContext comptext(int i) {
			return getRuleContext(ComptextContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cond);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__12);
			setState(140);
			match(AP);
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUM:
			case DEC:
			case OPREL:
				{
				setState(141);
				((CondContext)_localctx).comp = comp();
				}
				break;
			case STRING:
				{
				setState(142);
				comptext();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			match(FP);
			setState(146);
			match(T__13);
			setState(147);
			match(AC);

			            codigoJava += "if ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+") {\n";
			            insideExpr ++;
			        
			setState(149);
			expr();

			            codigoJava += "\t";
			            if(insideExpr > 1){
			                for(int i=0; i<insideExpr; i++){
			                    codigoJava += "\t";
			                }
			                codigoJava += "}";
			            } else{
			                codigoJava += "\t}";
			            }
			        
			setState(151);
			match(FC);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(T__14);
					setState(153);
					match(T__12);
					setState(154);
					match(AP);
					setState(157);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case ID:
					case NUM:
					case DEC:
					case OPREL:
						{
						setState(155);
						((CondContext)_localctx).comp = comp();
						}
						break;
					case STRING:
						{
						setState(156);
						comptext();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159);
					match(FP);
					codigoJava += " else if ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+")";
					setState(161);
					match(AC);

					                codigoJava += "{\n";
					            
					setState(163);
					expr();

					                codigoJava += "\t";
					                if(insideExpr > 1){
					                    for(int i=0; i<insideExpr; i++){
					                        codigoJava += "\t";
					                    }
					                    codigoJava += "}";
					                } else{
					                    codigoJava += "\t}";
					                }
					            
					setState(165);
					match(FC);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(172);
				match(T__14);
				codigoJava += " else ";
				setState(174);
				match(AC);

				                codigoJava += "{\n";
				            
				setState(176);
				expr();

				                codigoJava += "\t";
				                if(insideExpr > 1){
				                    for(int i=0; i<insideExpr; i++){
				                        codigoJava += "\t";
				                    }
				                    codigoJava += "}";
				                } else{
				                    codigoJava += "\t}";
				                }
				            
				setState(178);
				match(FC);
				}
			}

			codigoJava += "\n";
			insideExpr --;
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
	public static class PrintfContext extends ParserRuleContext {
		public PrintTypesContext printTypes;
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public PrintTypesContext printTypes() {
			return getRuleContext(PrintTypesContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitPrintf(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__15);
			setState(186);
			match(AP);
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
			case NUM:
			case DEC:
			case FP:
				{
				setState(187);
				((PrintfContext)_localctx).printTypes = printTypes();
				 codigoJava += "System.out.println("+(((PrintfContext)_localctx).printTypes!=null?_input.getText(((PrintfContext)_localctx).printTypes.start,((PrintfContext)_localctx).printTypes.stop):null)+");\n"; 
				}
				break;
			case OPMAT:
				{
				setState(190);
				mathExpr();
				 codigoJava += "System.out.println("+mathText+");\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			match(FP);
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
	public static class ScanfContext extends ParserRuleContext {
		public DeclareContext declare;
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterScanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitScanf(this);
		}
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scanf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__16);
			setState(198);
			match(AP);

			            initScan = true;
			            if(hasScan == false){
			                hasScan = true;
			                if(insideExpr > 0){
			                    for(int i=0; i<insideExpr; i++){
			                        codigoJava += "\t";
			                    }
			                }
			                codigoJava += "Scanner scan = new Scanner(System.in);\n";
			            }
			        
			setState(200);
			((ScanfContext)_localctx).declare = declare();

			            Variavel var = cv.busca((((ScanfContext)_localctx).declare!=null?_input.getText(((ScanfContext)_localctx).declare.start,((ScanfContext)_localctx).declare.stop):null).substring(3));
			            switch(var.getTipo()){
			                case 0: codigoJava += " = Integer.parseInt(scan.nextLine());\n"; break;
			                case 1: codigoJava += " = scan.nextLine();\n"; break;
			                case 2: codigoJava += " = Float.parseFloat(scan.nextLine());\n"; break;
			                default: System.out.println("Unknown error while declaring variable " + var.getNome()); break;
			            }
			            initScan = false;
			        
			setState(202);
			match(FP);
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
	public static class ForContext extends ParserRuleContext {
		public Token ID;
		public PrimaryContext primary;
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public TerminalNode LOOP() { return getToken(crossLanguageParser.LOOP, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public TerminalNode AC() { return getToken(crossLanguageParser.AC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FC() { return getToken(crossLanguageParser.FC, 0); }
		public TerminalNode ID() { return getToken(crossLanguageParser.ID, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__17);
			setState(205);
			match(AP);
			 
			            codigoJava += "for(";
			            insideExpr ++;
			            initFor = true;
			        
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(207);
				((ForContext)_localctx).ID = match(ID);
				forText = (((ForContext)_localctx).ID!=null?((ForContext)_localctx).ID.getText():null);
				}
				break;
			case 2:
				{
				setState(209);
				declare();
				}
				break;
			case 3:
				{
				setState(210);
				atrib();
				}
				break;
			}
			 
			            codigoJava += "; "+forText; 
			            initFor = false;
			        
			setState(214);
			match(LOOP);
			setState(215);
			((ForContext)_localctx).primary = primary();

			            codigoJava += " < "+(((ForContext)_localctx).primary!=null?_input.getText(((ForContext)_localctx).primary.start,((ForContext)_localctx).primary.stop):null)+"; "+forText+"++)";
			        
			setState(217);
			match(FP);
			setState(218);
			match(AC);
			codigoJava+="{\n";
			setState(220);
			expr();
			setState(221);
			match(FC);

			            insideExpr --;
			            if(insideExpr > 0){
			                for(int i=0; i<insideExpr; i++){
			                    codigoJava+="\t";
			                }
			            }
			            codigoJava+="\t\t}\n";
			        
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
	public static class WhileContext extends ParserRuleContext {
		public CompContext comp;
		public TerminalNode LOOP() { return getToken(crossLanguageParser.LOOP, 0); }
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public TerminalNode AC() { return getToken(crossLanguageParser.AC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FC() { return getToken(crossLanguageParser.FC, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LOOP);
			 
			            codigoJava += "while";
			            insideExpr++;
			        
			setState(226);
			match(AP);
			setState(227);
			((WhileContext)_localctx).comp = comp();
			setState(228);
			match(FP);
			codigoJava += "("+(((WhileContext)_localctx).comp!=null?_input.getText(((WhileContext)_localctx).comp.start,((WhileContext)_localctx).comp.stop):null)+"){\n";
			setState(230);
			match(AC);
			setState(231);
			expr();
			setState(232);
			match(FC);

			            codigoJava += "\t\t}";
			            insideExpr--;
			        
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
	public static class PrintTypesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(crossLanguageParser.STRING, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrintTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterPrintTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitPrintTypes(this);
		}
	}

	public final PrintTypesContext printTypes() throws RecognitionException {
		PrintTypesContext _localctx = new PrintTypesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printTypes);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(crossLanguageParser.ID, 0); }
		public TerminalNode NUM() { return getToken(crossLanguageParser.NUM, 0); }
		public TerminalNode DEC() { return getToken(crossLanguageParser.DEC, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(DEC);
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
		"\u0004\u0001 \u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0001\u0001\u0001\u0004\u00017\b\u0001\u000b\u0001\f\u0001"+
		"8\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"F\b\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001"+
		"\b\u0003\b{\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0082"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009e\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a8\b\u000b\n"+
		"\u000b\f\u000b\u00ab\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b5"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c2\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ef\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0003\u0001\u0000\u0007\b\u0001\u0000\t\u000b"+
		"\u0002\u0000\f\f\u0018\u0018\u0104\u0000$\u0001\u0000\u0000\u0000\u0002"+
		"6\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006P\u0001"+
		"\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000"+
		"\fi\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010z\u0001"+
		"\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u0087\u0001"+
		"\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u00b9\u0001"+
		"\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00cc\u0001"+
		"\u0000\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 \u00ee\u0001\u0000"+
		"\u0000\u0000\"\u00f4\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000"+
		"%&\u0006\u0000\uffff\uffff\u0000&\'\u0003\b\u0004\u0000\'(\u0006\u0000"+
		"\uffff\uffff\u0000()\u0005\u0002\u0000\u0000)\u0001\u0001\u0000\u0000"+
		"\u0000*+\u0003\u0006\u0003\u0000+1\u0003\u0004\u0002\u0000,-\u0005\u0003"+
		"\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000.0\u0003\u0004\u0002\u0000"+
		"/,\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000045\u0006\u0001\uffff\uffff\u000057\u0001\u0000\u0000\u0000"+
		"6*\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0013\u0000\u0000;G\u0006\u0002\uffff\uffff\u0000<E\u0005\u001e\u0000"+
		"\u0000=>\u0003\n\u0005\u0000>?\u0006\u0002\uffff\uffff\u0000?F\u0001\u0000"+
		"\u0000\u0000@A\u0003\"\u0011\u0000AB\u0006\u0002\uffff\uffff\u0000BF\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0014\u0000\u0000DF\u0006\u0002\uffff\uffff"+
		"\u0000E=\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0004\u0000"+
		"\u0000JQ\u0006\u0003\uffff\uffff\u0000KL\u0005\u0005\u0000\u0000LQ\u0006"+
		"\u0003\uffff\uffff\u0000MN\u0005\u0006\u0000\u0000NQ\u0006\u0003\uffff"+
		"\uffff\u0000OQ\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PK\u0001"+
		"\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"Q\u0007\u0001\u0000\u0000\u0000RS\u0006\u0004\uffff\uffff\u0000Sa\u0003"+
		"\u0018\f\u0000TU\u0006\u0004\uffff\uffff\u0000Ua\u0003\u001a\r\u0000V"+
		"W\u0006\u0004\uffff\uffff\u0000Wa\u0003\u0016\u000b\u0000XY\u0006\u0004"+
		"\uffff\uffff\u0000Ya\u0003\u0004\u0002\u0000Z[\u0006\u0004\uffff\uffff"+
		"\u0000[a\u0003\u001c\u000e\u0000\\]\u0006\u0004\uffff\uffff\u0000]a\u0003"+
		"\u001e\u000f\u0000^a\u0003\u0002\u0001\u0000_a\u0003\n\u0005\u0000`R\u0001"+
		"\u0000\u0000\u0000`T\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"`X\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\t\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0017\u0000\u0000"+
		"fg\u0003\f\u0006\u0000gh\u0006\u0005\uffff\uffff\u0000h\u000b\u0001\u0000"+
		"\u0000\u0000in\u0003\u000e\u0007\u0000jk\u0007\u0000\u0000\u0000km\u0003"+
		"\u000e\u0007\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\r\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qv\u0003\u0010\b\u0000rs\u0007\u0001\u0000"+
		"\u0000su\u0003\u0010\b\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000f\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0007\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0081\u0001\u0000"+
		"\u0000\u0000|\u0082\u0003\"\u0011\u0000}~\u0005\u001c\u0000\u0000~\u007f"+
		"\u0003\f\u0006\u0000\u007f\u0080\u0005\u001d\u0000\u0000\u0080\u0082\u0001"+
		"\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000"+
		"\u0000\u0082\u0011\u0001\u0000\u0000\u0000\u0083\u0084\u0003\"\u0011\u0000"+
		"\u0084\u0085\u0007\u0002\u0000\u0000\u0085\u0086\u0003\"\u0011\u0000\u0086"+
		"\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088"+
		"\u0089\u0005\f\u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a\u0015"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\r\u0000\u0000\u008c\u008f\u0005"+
		"\u001c\u0000\u0000\u008d\u0090\u0003\u0012\t\u0000\u008e\u0090\u0003\u0014"+
		"\n\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001d\u0000"+
		"\u0000\u0092\u0093\u0005\u000e\u0000\u0000\u0093\u0094\u0005\u001a\u0000"+
		"\u0000\u0094\u0095\u0006\u000b\uffff\uffff\u0000\u0095\u0096\u0003\b\u0004"+
		"\u0000\u0096\u0097\u0006\u000b\uffff\uffff\u0000\u0097\u00a9\u0005\u001b"+
		"\u0000\u0000\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009a\u0005\r\u0000"+
		"\u0000\u009a\u009d\u0005\u001c\u0000\u0000\u009b\u009e\u0003\u0012\t\u0000"+
		"\u009c\u009e\u0003\u0014\n\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u001d\u0000\u0000\u00a0\u00a1\u0006\u000b\uffff\uffff\u0000"+
		"\u00a1\u00a2\u0005\u001a\u0000\u0000\u00a2\u00a3\u0006\u000b\uffff\uffff"+
		"\u0000\u00a3\u00a4\u0003\b\u0004\u0000\u00a4\u00a5\u0006\u000b\uffff\uffff"+
		"\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u0098\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b4\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad\u00ae\u0006\u000b\uffff"+
		"\uffff\u0000\u00ae\u00af\u0005\u001a\u0000\u0000\u00af\u00b0\u0006\u000b"+
		"\uffff\uffff\u0000\u00b0\u00b1\u0003\b\u0004\u0000\u00b1\u00b2\u0006\u000b"+
		"\uffff\uffff\u0000\u00b2\u00b3\u0005\u001b\u0000\u0000\u00b3\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006"+
		"\u000b\uffff\uffff\u0000\u00b7\u00b8\u0006\u000b\uffff\uffff\u0000\u00b8"+
		"\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0010\u0000\u0000\u00ba"+
		"\u00c1\u0005\u001c\u0000\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc\u00bd"+
		"\u0006\f\uffff\uffff\u0000\u00bd\u00c2\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003\n\u0005\u0000\u00bf\u00c0\u0006\f\uffff\uffff\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00be"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u001d\u0000\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0011\u0000\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8"+
		"\u0006\r\uffff\uffff\u0000\u00c8\u00c9\u0003\u0002\u0001\u0000\u00c9\u00ca"+
		"\u0006\r\uffff\uffff\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u001b"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000\u00cd\u00ce"+
		"\u0005\u001c\u0000\u0000\u00ce\u00d3\u0006\u000e\uffff\uffff\u0000\u00cf"+
		"\u00d0\u0005\u0013\u0000\u0000\u00d0\u00d4\u0006\u000e\uffff\uffff\u0000"+
		"\u00d1\u00d4\u0003\u0002\u0001\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000"+
		"\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0006\u000e\uffff\uffff\u0000\u00d6\u00d7\u0005\u0019\u0000"+
		"\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8\u00d9\u0006\u000e\uffff\uffff"+
		"\u0000\u00d9\u00da\u0005\u001d\u0000\u0000\u00da\u00db\u0005\u001a\u0000"+
		"\u0000\u00db\u00dc\u0006\u000e\uffff\uffff\u0000\u00dc\u00dd\u0003\b\u0004"+
		"\u0000\u00dd\u00de\u0005\u001b\u0000\u0000\u00de\u00df\u0006\u000e\uffff"+
		"\uffff\u0000\u00df\u001d\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0019"+
		"\u0000\u0000\u00e1\u00e2\u0006\u000f\uffff\uffff\u0000\u00e2\u00e3\u0005"+
		"\u001c\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00e5\u0005\u001d"+
		"\u0000\u0000\u00e5\u00e6\u0006\u000f\uffff\uffff\u0000\u00e6\u00e7\u0005"+
		"\u001a\u0000\u0000\u00e7\u00e8\u0003\b\u0004\u0000\u00e8\u00e9\u0005\u001b"+
		"\u0000\u0000\u00e9\u00ea\u0006\u000f\uffff\uffff\u0000\u00ea\u001f\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ef\u0005\u0014\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0003\"\u0011\u0000\u00ee\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef!\u0001\u0000\u0000\u0000\u00f0\u00f5\u0005\u0013\u0000"+
		"\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f5\u0005\u0015\u0000"+
		"\u0000\u00f3\u00f5\u0005\u0016\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000"+
		"\u001318EGP`bnvz\u0081\u008f\u009d\u00a9\u00b4\u00c1\u00d3\u00ee\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}