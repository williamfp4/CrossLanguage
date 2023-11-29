// Generated from crossLanguage.g4 by ANTLR 4.13.1

    import java.util.*;

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
		T__17=18, T__18=19, ID=20, STRING=21, NUM=22, DEC=23, OPMAT=24, OPREL=25, 
		LOOP=26, AC=27, FC=28, AP=29, FP=30, OP_ATRIB=31, OP_INC=32, WS=33;
	public static final int
		RULE_start = 0, RULE_declare = 1, RULE_atrib = 2, RULE_type = 3, RULE_expr = 4, 
		RULE_mathExpr = 5, RULE_mathAdd = 6, RULE_mathMul = 7, RULE_unaryExpr = 8, 
		RULE_comp = 9, RULE_comptext = 10, RULE_cond = 11, RULE_printf = 12, RULE_scanf = 13, 
		RULE_for = 14, RULE_while = 15, RULE_increment = 16, RULE_break = 17, 
		RULE_printTypes = 18, RULE_primary = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declare", "atrib", "type", "expr", "mathExpr", "mathAdd", "mathMul", 
			"unaryExpr", "comp", "comptext", "cond", "printf", "scanf", "for", "while", 
			"increment", "break", "printTypes", "primary"
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

	@Override
	public String getGrammarFileName() { return "crossLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public crossLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			 
			            javaCode += "import java.util.*;\n\n";
					    javaCode += "public class Codigo{\n";
			            javaCode += "\tpublic static void main(String args[]){\n"; 
					
			setState(42);
			expr();

			            javaCode += "\n\t}\n}";
			            System.out.println(javaCode);
			        
			setState(44);
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
		public AtribContext atrib;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					type();
					setState(47);
					((DeclareContext)_localctx).atrib = atrib();
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(48);
						match(T__2);
						javaCode += ",";
						setState(50);
						((DeclareContext)_localctx).atrib = atrib();
						}
						}
						setState(55);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}

					                    try{
					                        int index = (((DeclareContext)_localctx).atrib!=null?_input.getText(((DeclareContext)_localctx).atrib.start,((DeclareContext)_localctx).atrib.stop):null).indexOf('>');
					                        if(!notDeclared){
					                            throw new Exception("Variable '"+(((DeclareContext)_localctx).atrib!=null?_input.getText(((DeclareContext)_localctx).atrib.start,((DeclareContext)_localctx).atrib.stop):null).substring(0, index)+"' has been declared!");
					                        }
					                    } catch(Exception e){
					                        e.printStackTrace();
					                        System.exit(1);
					                    }
					                    
					                    if(!initScan && !initFor){
					                        javaCode += ";\n";
					                    }
					                
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
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
			setState(62);
			((AtribContext)_localctx).ID = match(ID);
			 
			            newVariable = new Variable((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null), type, value);
			            notDeclared = vc.add(newVariable);
			            if(!notDeclared){
			                newVariable = vc.search((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null));
			                type = newVariable.getType();
			            }
			            javaCode += (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            if(insideFor){
			                forText = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            }
			        
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIB) {
				{
				setState(64);
				match(OP_ATRIB);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(65);
					mathExpr();

					                    try {
					                        if(numFloat > 0 && type == 0){
					                            throw new Exception(mathText + " is not a valid Natural number expression");
					                        } else if(numInt > 0 && type == 2){
					                            throw new Exception(mathText + " is not a valid Decimal number expression");
					                        }

					                        if(type == 2){
					                            javaCode += " = (float)("+mathText+")";
					                        } else{
					                            javaCode += " = " + mathText;
					                        }
					                    } catch(Exception e){
					                        e.printStackTrace();
					                        System.exit(1);
					                    }
					                
					}
					break;
				case 2:
					{
					setState(68);
					((AtribContext)_localctx).primary = primary();

					                    if((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null) != null){
					                        javaCode += " = "+(((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null);
					                    }
					                    try {
					                        switch(type){
					                            case 0: if(isInteger((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null)) == false){
					                                        throw new Exception("Not a natural number!");
					                                    } 
					                                break;

					                            case 2: if(isFloat((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null)) == false){
					                                        throw new Exception("Not a decimal number!");
					                                    } 
					                                    { javaCode += "f";} 
					                                break;

					                            default: throw new Exception("Variable type invalid!"); 
					                        }
					                    } catch(Exception e){
					                        e.printStackTrace();
					                        System.exit(1);
					                    }
					                
					}
					break;
				case 3:
					{
					setState(71);
					((AtribContext)_localctx).STRING = match(STRING);

					                    javaCode += " = "+(((AtribContext)_localctx).STRING!=null?((AtribContext)_localctx).STRING.getText():null);
					                
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(77);
				match(T__3);
					type = 0;
				                        if(!initFor){
				                            tab();
				                        }
				                        javaCode += "int ";
				                    
				}
				break;
			case T__4:
				{
				setState(79);
				match(T__4);
					type = 1;
				                        if(!initFor){
				                            tab();
				                        }
				                        javaCode += "String ";
				                    
				}
				break;
			case T__5:
				{
				setState(81);
				match(T__5);
					type = 2;
				                        if(!initFor){
				                            tab();
				                        }
				                        javaCode += "float ";
				                    
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
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
		}
		public List<BreakContext> break_() {
			return getRuleContexts(BreakContext.class);
		}
		public BreakContext break_(int i) {
			return getRuleContext(BreakContext.class,i);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 85926000L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					tab();
					setState(87);
					printf();
					}
					break;
				case 2:
					{
					tab();
					setState(89);
					scanf();
					}
					break;
				case 3:
					{
					tab();
					setState(91);
					cond();
					}
					break;
				case 4:
					{
					tab();
					setState(93);
					atrib();
					}
					break;
				case 5:
					{
					tab();
					setState(95);
					for_();
					}
					break;
				case 6:
					{
					tab();
					setState(97);
					while_();
					}
					break;
				case 7:
					{
					tab();
					setState(99);
					increment();
					}
					break;
				case 8:
					{
					tab();
					setState(101);
					break_();
					}
					break;
				case 9:
					{
					setState(102);
					atrib();
					}
					break;
				case 10:
					{
					setState(103);
					declare();
					}
					break;
				case 11:
					{
					setState(104);
					mathExpr();
					}
					break;
				}
				}
				setState(109);
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
			setState(110);
			match(OPMAT);
			setState(111);
			((MathExprContext)_localctx).mathAdd = mathAdd();

			                numInt = numFloat = 0;

			                mathText = (((MathExprContext)_localctx).mathAdd!=null?_input.getText(((MathExprContext)_localctx).mathAdd.start,((MathExprContext)_localctx).mathAdd.stop):null);
			                String operation = mathText.replace("(", "").replace(")", "");

			                String[] operands = operation.split("[+\\-*/\\s]+");

			                try {
			                    for (String o : operands) {
			                        if(o.matches(".*\\d+.*")){
			                            if (isInteger(o)) {
			                                numInt+=1;
			                            } else if (isFloat(o)) {
			                                numFloat+=1;
			                            } else {
			                                throw new Exception(o + " is not a valid operand\n");
			                            }
			                        }else{
			                            if(vc.exists(o) == false){
			                                throw new Exception("Variable "+o+" is not declared!");
			                            }
			                            Variable variable = vc.search(o);
			                            switch(variable.getType()){
			                                case 0: numInt+=1; break;
			                                case 1: throw new Exception("Can't use Text in a mathematical operation");
			                                case 2: numFloat+=1; break;
			                                default: throw new Exception(variable.getValue() + " is not a valid operand\n");
			                            }
			                        }
			                    }

			                    if (!((numInt > 0 && numFloat == 0) || (numInt == 0 && numFloat > 0))) {
			                        throw new Exception("Only one variable type is supported during math expressions");
			                    }
			                } catch(Exception e){
			                    e.printStackTrace();
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
			setState(114);
			mathMul();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				mathMul();
				}
				}
				setState(121);
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
			setState(122);
			unaryExpr();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				unaryExpr();
				}
				}
				setState(129);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(130);
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
			setState(138);
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
			case T__18:
			case ID:
			case NUM:
			case DEC:
			case OPMAT:
			case LOOP:
			case FC:
			case FP:
				{
				setState(133);
				primary();
				}
				break;
			case AP:
				{
				setState(134);
				match(AP);
				setState(135);
				mathAdd();
				setState(136);
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
		public PrimaryContext primary;
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
			setState(140);
			((CompContext)_localctx).primary = primary();

			            String op_1 = "";
			            if(isInteger((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null))){
			                op_1 = "int";
			            }else if(isFloat((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null))){
			                op_1 = "float";
			            }else{
			                isDeclared((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null));
			                Variable var_1 = vc.search((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null));
			                if(var_1.getType() == 0){
			                    op_1 = "int";
			                }else if(var_1.getType() == 1){
			                    op_1 = "String";
			                }else{
			                    op_1 = "float";
			                }
			            }
			        
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==OPREL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			((CompContext)_localctx).primary = primary();

			            String op_2 = "";
			            if(isInteger((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null))){
			                op_2 = "int";
			            }else if(isFloat((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null))){
			                op_2 = "float";
			            }else{
			                isDeclared((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null));
			                Variable var_2 = vc.search((((CompContext)_localctx).primary!=null?_input.getText(((CompContext)_localctx).primary.start,((CompContext)_localctx).primary.stop):null));
			                if(var_2.getType() == 0){
			                    op_2 = "int";
			                }else if(var_2.getType() == 1){
			                    op_2 = "String";
			                }else{
			                    op_2 = "float";
			                }
			            }
			        

			            try{
			                if(op_1 != op_2){
			                    throw new Exception("You can't compare variables with different types");
			                }
			            } catch (Exception e){
			                e.printStackTrace();
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
			setState(147);
			match(STRING);
			{
			setState(148);
			match(T__11);
			}
			setState(149);
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
			setState(151);
			match(T__12);
			setState(152);
			match(AP);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUM:
			case DEC:
			case OPREL:
				{
				setState(153);
				((CondContext)_localctx).comp = comp();
				}
				break;
			case STRING:
				{
				setState(154);
				comptext();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			match(FP);
			setState(158);
			match(T__13);
			setState(159);
			match(AC);

			            javaCode += "if ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+") {\n";
			            insideExpr ++;
			        
			setState(161);
			expr();

			            javaCode += "\t";
			            if(insideExpr > 1){
			                for(int i=0; i<insideExpr; i++){
			                    javaCode += "\t";
			                }
			                javaCode += "}";
			            } else{
			                javaCode += "\t}";
			            }
			        
			setState(163);
			match(FC);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(T__14);
					setState(165);
					match(T__12);
					setState(166);
					match(AP);
					setState(169);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case ID:
					case NUM:
					case DEC:
					case OPREL:
						{
						setState(167);
						((CondContext)_localctx).comp = comp();
						}
						break;
					case STRING:
						{
						setState(168);
						comptext();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171);
					match(FP);
					javaCode += " else if ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+")";
					setState(173);
					match(AC);

					                javaCode += "{\n";
					            
					setState(175);
					expr();

					                javaCode += "\t";
					                if(insideExpr > 1){
					                    for(int i=0; i<insideExpr; i++){
					                        javaCode += "\t";
					                    }
					                    javaCode += "}";
					                } else{
					                    javaCode += "\t}";
					                }
					            
					setState(177);
					match(FC);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(184);
				match(T__14);
				javaCode += " else ";
				setState(186);
				match(AC);

				                javaCode += "{\n";
				            
				setState(188);
				expr();

				                javaCode += "\t";
				                if(insideExpr > 1){
				                    for(int i=0; i<insideExpr; i++){
				                        javaCode += "\t";
				                    }
				                    javaCode += "}";
				                } else{
				                    javaCode += "\t}";
				                }
				            
				setState(190);
				match(FC);
				}
			}

			javaCode += "\n";
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
		public List<PrintTypesContext> printTypes() {
			return getRuleContexts(PrintTypesContext.class);
		}
		public PrintTypesContext printTypes(int i) {
			return getRuleContext(PrintTypesContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__15);
			setState(198);
			match(AP);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case ID:
			case STRING:
			case NUM:
			case DEC:
			case AP:
			case FP:
				{
				setState(199);
				((PrintfContext)_localctx).printTypes = printTypes();
				 javaCode += "System.out.println("+(((PrintfContext)_localctx).printTypes!=null?_input.getText(((PrintfContext)_localctx).printTypes.start,((PrintfContext)_localctx).printTypes.stop):null); 
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(201);
					match(T__6);
					setState(202);
					((PrintfContext)_localctx).printTypes = printTypes();
					 javaCode += " + "+(((PrintfContext)_localctx).printTypes!=null?_input.getText(((PrintfContext)_localctx).printTypes.start,((PrintfContext)_localctx).printTypes.stop):null); 
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 javaCode += ");\n"; 
				}
				break;
			case OPMAT:
				{
				setState(212);
				mathExpr();
				 javaCode += "System.out.println("+mathText+");\n"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
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
			setState(219);
			match(T__16);
			setState(220);
			match(AP);

			            initScan = true;
			            if(hasScan == false){
			                hasScan = true;
			                if(insideExpr > 0){
			                    for(int i=0; i<insideExpr; i++){
			                        javaCode += "\t";
			                    }
			                }
			                javaCode += "Scanner scan = new Scanner(System.in);\n";
			            }
			        
			setState(222);
			((ScanfContext)_localctx).declare = declare();

			            Variable var = vc.search((((ScanfContext)_localctx).declare!=null?_input.getText(((ScanfContext)_localctx).declare.start,((ScanfContext)_localctx).declare.stop):null).substring(3));
			            switch(var.getType()){
			                case 0: javaCode += " = Integer.parseInt(scan.nextLine());\n"; break;
			                case 1: javaCode += " = scan.nextLine();\n"; break;
			                case 2: javaCode += " = Float.parseFloat(scan.nextLine());\n"; break;
			                default: System.out.println("Unknown error while declaring variable " + var.getName()); break;
			            }
			            initScan = false;
			        
			setState(224);
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
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
			setState(226);
			match(T__17);
			setState(227);
			match(AP);
			 
			            javaCode += "for(";
			            insideExpr ++;
			            initFor = insideFor = true;
			        
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(229);
				((ForContext)_localctx).ID = match(ID);
				forText = (((ForContext)_localctx).ID!=null?((ForContext)_localctx).ID.getText():null);
				}
				break;
			case 2:
				{
				setState(231);
				atrib();
				}
				break;
			case 3:
				{
				setState(232);
				declare();
				}
				break;
			}
			 
			            javaCode += "; "+forText; 
			            initFor = false;
			        
			setState(236);
			match(LOOP);
			setState(237);
			((ForContext)_localctx).primary = primary();

			            javaCode += " < "+(((ForContext)_localctx).primary!=null?_input.getText(((ForContext)_localctx).primary.start,((ForContext)_localctx).primary.stop):null)+"; "+forText+"++)";
			        
			setState(239);
			match(FP);
			setState(240);
			match(AC);
			javaCode+="{\n";
			setState(242);
			expr();
			setState(243);
			match(FC);

			            insideExpr --;
			            if(insideExpr > 0){
			                for(int i=0; i<insideExpr; i++){
			                    javaCode+="\t";
			                }
			            }
			            javaCode+="\t\t}\n";
			            insideFor = false;
			        
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
		public ComptextContext comptext;
		public TerminalNode LOOP() { return getToken(crossLanguageParser.LOOP, 0); }
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
		public TerminalNode AC() { return getToken(crossLanguageParser.AC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FC() { return getToken(crossLanguageParser.FC, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ComptextContext comptext() {
			return getRuleContext(ComptextContext.class,0);
		}
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
			setState(246);
			match(LOOP);
			 
			            javaCode += "while";
			            insideExpr++;
			        
			setState(248);
			match(AP);
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case ID:
			case NUM:
			case DEC:
			case OPREL:
				{
				setState(249);
				((WhileContext)_localctx).comp = comp();
				javaCode += "("+(((WhileContext)_localctx).comp!=null?_input.getText(((WhileContext)_localctx).comp.start,((WhileContext)_localctx).comp.stop):null)+"){\n";
				}
				break;
			case STRING:
				{
				setState(252);
				((WhileContext)_localctx).comptext = comptext();
				javaCode += "("+(((WhileContext)_localctx).comptext!=null?_input.getText(((WhileContext)_localctx).comptext.start,((WhileContext)_localctx).comptext.stop):null)+"){\n";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			match(FP);
			setState(258);
			match(AC);
			setState(259);
			expr();
			setState(260);
			match(FC);

			            insideExpr--;
			            tab();
			            javaCode += "}";
			        
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
	public static class IncrementContext extends ParserRuleContext {
		public Token ID;
		public Token OP_INC;
		public TerminalNode ID() { return getToken(crossLanguageParser.ID, 0); }
		public TerminalNode OP_INC() { return getToken(crossLanguageParser.OP_INC, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((IncrementContext)_localctx).ID = match(ID);
			setState(264);
			((IncrementContext)_localctx).OP_INC = match(OP_INC);
			 
			                javaCode += (((IncrementContext)_localctx).ID!=null?((IncrementContext)_localctx).ID.getText():null); 
			                if((((IncrementContext)_localctx).OP_INC!=null?((IncrementContext)_localctx).OP_INC.getText():null).equals(">+")){
			                    javaCode += "++;\n"; 
			                }else{
			                    javaCode += "--;\n";
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
	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitBreak(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__18);
			 
			            try{
			                if(insideFor){
			                    throw new Exception("Break outside of a loop!");
			                }
			                javaCode += "break;\n"; 
			            } catch(Exception e){
			                e.printStackTrace();
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
	public static class PrintTypesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(crossLanguageParser.STRING, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public MathAddContext mathAdd() {
			return getRuleContext(MathAddContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
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
		enterRule(_localctx, 36, RULE_printTypes);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
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
				setState(272);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(AP);
				setState(274);
				mathAdd();
				setState(275);
				match(FP);
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
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
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
				setState(281);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
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
		"\u0004\u0001!\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0003"+
		"\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004j\b\u0004\n\u0004\f\u0004m\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006v\b"+
		"\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007~\b\u0007\n\u0007\f\u0007\u0081\t\u0007\u0001\b\u0003\b\u0084\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009c\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00aa\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b4"+
		"\b\u000b\n\u000b\f\u000b\u00b7\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ea\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0100"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0116\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011c\b\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0003\u0001\u0000\u0007\b\u0001\u0000"+
		"\t\u000b\u0002\u0000\f\f\u0019\u0019\u012f\u0000(\u0001\u0000\u0000\u0000"+
		"\u0002:\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006T"+
		"\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\fr\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014"+
		"\u0093\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u00c5\u0001\u0000\u0000\u0000\u001a\u00db\u0001\u0000\u0000\u0000\u001c"+
		"\u00e2\u0001\u0000\u0000\u0000\u001e\u00f6\u0001\u0000\u0000\u0000 \u0107"+
		"\u0001\u0000\u0000\u0000\"\u010b\u0001\u0000\u0000\u0000$\u0115\u0001"+
		"\u0000\u0000\u0000&\u011b\u0001\u0000\u0000\u0000()\u0005\u0001\u0000"+
		"\u0000)*\u0006\u0000\uffff\uffff\u0000*+\u0003\b\u0004\u0000+,\u0006\u0000"+
		"\uffff\uffff\u0000,-\u0005\u0002\u0000\u0000-\u0001\u0001\u0000\u0000"+
		"\u0000./\u0003\u0006\u0003\u0000/5\u0003\u0004\u0002\u000001\u0005\u0003"+
		"\u0000\u000012\u0006\u0001\uffff\uffff\u000024\u0003\u0004\u0002\u0000"+
		"30\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0006\u0001\uffff\uffff\u00009;\u0001\u0000\u0000\u0000"+
		":.\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0014\u0000\u0000?K\u0006\u0002\uffff\uffff\u0000@I\u0005\u001f\u0000"+
		"\u0000AB\u0003\n\u0005\u0000BC\u0006\u0002\uffff\uffff\u0000CJ\u0001\u0000"+
		"\u0000\u0000DE\u0003&\u0013\u0000EF\u0006\u0002\uffff\uffff\u0000FJ\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0015\u0000\u0000HJ\u0006\u0002\uffff\uffff"+
		"\u0000IA\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JL\u0001\u0000\u0000\u0000K@\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0005\u0004\u0000"+
		"\u0000NU\u0006\u0003\uffff\uffff\u0000OP\u0005\u0005\u0000\u0000PU\u0006"+
		"\u0003\uffff\uffff\u0000QR\u0005\u0006\u0000\u0000RU\u0006\u0003\uffff"+
		"\uffff\u0000SU\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TO\u0001"+
		"\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VW\u0006\u0004\uffff\uffff\u0000Wj\u0003"+
		"\u0018\f\u0000XY\u0006\u0004\uffff\uffff\u0000Yj\u0003\u001a\r\u0000Z"+
		"[\u0006\u0004\uffff\uffff\u0000[j\u0003\u0016\u000b\u0000\\]\u0006\u0004"+
		"\uffff\uffff\u0000]j\u0003\u0004\u0002\u0000^_\u0006\u0004\uffff\uffff"+
		"\u0000_j\u0003\u001c\u000e\u0000`a\u0006\u0004\uffff\uffff\u0000aj\u0003"+
		"\u001e\u000f\u0000bc\u0006\u0004\uffff\uffff\u0000cj\u0003 \u0010\u0000"+
		"de\u0006\u0004\uffff\uffff\u0000ej\u0003\"\u0011\u0000fj\u0003\u0004\u0002"+
		"\u0000gj\u0003\u0002\u0001\u0000hj\u0003\n\u0005\u0000iV\u0001\u0000\u0000"+
		"\u0000iX\u0001\u0000\u0000\u0000iZ\u0001\u0000\u0000\u0000i\\\u0001\u0000"+
		"\u0000\u0000i^\u0001\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000ib\u0001"+
		"\u0000\u0000\u0000id\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\t\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0018\u0000\u0000op\u0003"+
		"\f\u0006\u0000pq\u0006\u0005\uffff\uffff\u0000q\u000b\u0001\u0000\u0000"+
		"\u0000rw\u0003\u000e\u0007\u0000st\u0007\u0000\u0000\u0000tv\u0003\u000e"+
		"\u0007\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z\u007f\u0003\u0010\b\u0000{|\u0007\u0001\u0000"+
		"\u0000|~\u0003\u0010\b\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0007\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u008a\u0001\u0000\u0000"+
		"\u0000\u0085\u008b\u0003&\u0013\u0000\u0086\u0087\u0005\u001d\u0000\u0000"+
		"\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0005\u001e\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a"+
		"\u0086\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0003&\u0013\u0000\u008d\u008e\u0006\t\uffff\uffff\u0000\u008e"+
		"\u008f\u0007\u0002\u0000\u0000\u008f\u0090\u0003&\u0013\u0000\u0090\u0091"+
		"\u0006\t\uffff\uffff\u0000\u0091\u0092\u0006\t\uffff\uffff\u0000\u0092"+
		"\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094"+
		"\u0095\u0005\f\u0000\u0000\u0095\u0096\u0005\u0015\u0000\u0000\u0096\u0015"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\r\u0000\u0000\u0098\u009b\u0005"+
		"\u001d\u0000\u0000\u0099\u009c\u0003\u0012\t\u0000\u009a\u009c\u0003\u0014"+
		"\n\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001e\u0000"+
		"\u0000\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a0\u0005\u001b\u0000"+
		"\u0000\u00a0\u00a1\u0006\u000b\uffff\uffff\u0000\u00a1\u00a2\u0003\b\u0004"+
		"\u0000\u00a2\u00a3\u0006\u000b\uffff\uffff\u0000\u00a3\u00b5\u0005\u001c"+
		"\u0000\u0000\u00a4\u00a5\u0005\u000f\u0000\u0000\u00a5\u00a6\u0005\r\u0000"+
		"\u0000\u00a6\u00a9\u0005\u001d\u0000\u0000\u00a7\u00aa\u0003\u0012\t\u0000"+
		"\u00a8\u00aa\u0003\u0014\n\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001e\u0000\u0000\u00ac\u00ad\u0006\u000b\uffff\uffff\u0000"+
		"\u00ad\u00ae\u0005\u001b\u0000\u0000\u00ae\u00af\u0006\u000b\uffff\uffff"+
		"\u0000\u00af\u00b0\u0003\b\u0004\u0000\u00b0\u00b1\u0006\u000b\uffff\uffff"+
		"\u0000\u00b1\u00b2\u0005\u001c\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b3\u00a4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00c0\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u00ba\u0006\u000b\uffff"+
		"\uffff\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb\u00bc\u0006\u000b"+
		"\uffff\uffff\u0000\u00bc\u00bd\u0003\b\u0004\u0000\u00bd\u00be\u0006\u000b"+
		"\uffff\uffff\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006"+
		"\u000b\uffff\uffff\u0000\u00c3\u00c4\u0006\u000b\uffff\uffff\u0000\u00c4"+
		"\u0017\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0010\u0000\u0000\u00c6"+
		"\u00d7\u0005\u001d\u0000\u0000\u00c7\u00c8\u0003$\u0012\u0000\u00c8\u00cf"+
		"\u0006\f\uffff\uffff\u0000\u00c9\u00ca\u0005\u0007\u0000\u0000\u00ca\u00cb"+
		"\u0003$\u0012\u0000\u00cb\u00cc\u0006\f\uffff\uffff\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00ce\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\f\uffff\uffff\u0000\u00d3\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\n\u0005\u0000\u00d5\u00d6\u0006"+
		"\f\uffff\uffff\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\u001e\u0000\u0000\u00da\u0019\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\u0011\u0000\u0000\u00dc\u00dd\u0005"+
		"\u001d\u0000\u0000\u00dd\u00de\u0006\r\uffff\uffff\u0000\u00de\u00df\u0003"+
		"\u0002\u0001\u0000\u00df\u00e0\u0006\r\uffff\uffff\u0000\u00e0\u00e1\u0005"+
		"\u001e\u0000\u0000\u00e1\u001b\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0012\u0000\u0000\u00e3\u00e4\u0005\u001d\u0000\u0000\u00e4\u00e9\u0006"+
		"\u000e\uffff\uffff\u0000\u00e5\u00e6\u0005\u0014\u0000\u0000\u00e6\u00ea"+
		"\u0006\u000e\uffff\uffff\u0000\u00e7\u00ea\u0003\u0004\u0002\u0000\u00e8"+
		"\u00ea\u0003\u0002\u0001\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006\u000e\uffff\uffff\u0000"+
		"\u00ec\u00ed\u0005\u001a\u0000\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee"+
		"\u00ef\u0006\u000e\uffff\uffff\u0000\u00ef\u00f0\u0005\u001e\u0000\u0000"+
		"\u00f0\u00f1\u0005\u001b\u0000\u0000\u00f1\u00f2\u0006\u000e\uffff\uffff"+
		"\u0000\u00f2\u00f3\u0003\b\u0004\u0000\u00f3\u00f4\u0005\u001c\u0000\u0000"+
		"\u00f4\u00f5\u0006\u000e\uffff\uffff\u0000\u00f5\u001d\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u001a\u0000\u0000\u00f7\u00f8\u0006\u000f\uffff"+
		"\uffff\u0000\u00f8\u00ff\u0005\u001d\u0000\u0000\u00f9\u00fa\u0003\u0012"+
		"\t\u0000\u00fa\u00fb\u0006\u000f\uffff\uffff\u0000\u00fb\u0100\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0003\u0014\n\u0000\u00fd\u00fe\u0006\u000f\uffff"+
		"\uffff\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00f9\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u001e\u0000\u0000\u0102\u0103\u0005\u001b"+
		"\u0000\u0000\u0103\u0104\u0003\b\u0004\u0000\u0104\u0105\u0005\u001c\u0000"+
		"\u0000\u0105\u0106\u0006\u000f\uffff\uffff\u0000\u0106\u001f\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u0014\u0000\u0000\u0108\u0109\u0005 \u0000"+
		"\u0000\u0109\u010a\u0006\u0010\uffff\uffff\u0000\u010a!\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\u0013\u0000\u0000\u010c\u010d\u0006\u0011\uffff"+
		"\uffff\u0000\u010d#\u0001\u0000\u0000\u0000\u010e\u0116\u0005\u0015\u0000"+
		"\u0000\u010f\u0116\u0001\u0000\u0000\u0000\u0110\u0116\u0003&\u0013\u0000"+
		"\u0111\u0112\u0005\u001d\u0000\u0000\u0112\u0113\u0003\f\u0006\u0000\u0113"+
		"\u0114\u0005\u001e\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u010e\u0001\u0000\u0000\u0000\u0115\u010f\u0001\u0000\u0000\u0000\u0115"+
		"\u0110\u0001\u0000\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116"+
		"%\u0001\u0000\u0000\u0000\u0117\u011c\u0005\u0014\u0000\u0000\u0118\u011c"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0005\u0016\u0000\u0000\u011a\u011c"+
		"\u0005\u0017\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\'\u0001\u0000\u0000\u0000\u00155<IKTik"+
		"w\u007f\u0083\u008a\u009b\u00a9\u00b5\u00c0\u00cf\u00d7\u00e9\u00ff\u0115"+
		"\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}