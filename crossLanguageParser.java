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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, STRING=16, NUM=17, 
		DEC=18, OPMAT=19, OPREL=20, LOOP=21, AC=22, FC=23, AP=24, FP=25, OP_ATRIB=26, 
		OP_INPUT=27, WS=28;
	public static final int
		RULE_vai = 0, RULE_declare = 1, RULE_atrib = 2, RULE_tipo = 3, RULE_expr = 4, 
		RULE_mathExpr = 5, RULE_comp = 6, RULE_cond = 7, RULE_printf = 8, RULE_scanf = 9, 
		RULE_for = 10, RULE_while = 11, RULE_printTypes = 12, RULE_primary = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"vai", "declare", "atrib", "tipo", "expr", "mathExpr", "comp", "cond", 
			"printf", "scanf", "for", "while", "printTypes", "primary"
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
	    String ifText, forText, atribText, printText = "";
	    String nome;
		int escopo, tipo;
	    boolean hasScan, insideFor = false;

	public crossLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VaiContext extends ParserRuleContext {
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
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
			setState(28);
			match(T__0);
			 
			            escopo = 0;
					    codigoJava += "public class Codigo{\n";
					
			setState(30);
			declare();
			setState(31);
			match(T__1);
			 	
			            escopo = 1;
			            codigoJava += "\tpublic static void main(String args[]){\n"; 
			        
			setState(33);
			declare();
			setState(34);
			expr();
			setState(35);
			match(T__2);

			            codigoJava += "\n\t}\n}";
			            System.out.println(codigoJava);
			        
			setState(37);
			match(T__3);
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
		public List<TerminalNode> OP_INPUT() { return getTokens(crossLanguageParser.OP_INPUT); }
		public TerminalNode OP_INPUT(int i) {
			return getToken(crossLanguageParser.OP_INPUT, i);
		}
		public List<ScanfContext> scanf() {
			return getRuleContexts(ScanfContext.class);
		}
		public ScanfContext scanf(int i) {
			return getRuleContext(ScanfContext.class,i);
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
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					tipo();
					setState(40);
					atrib();
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(41);
						match(T__4);
						codigoJava += ",";
						setState(43);
						atrib();
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OP_INPUT) {
						{
						setState(49);
						match(OP_INPUT);
						codigoJava += " = ";
						setState(51);
						scanf();
						}
					}


					                    if(!insideFor)
					                        codigoJava += ";\n";
					                
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class AtribContext extends ParserRuleContext {
		public Token ID;
		public PrimaryContext primary;
		public TerminalNode ID() { return getToken(crossLanguageParser.ID, 0); }
		public TerminalNode OP_ATRIB() { return getToken(crossLanguageParser.OP_ATRIB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
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
			setState(61);
			((AtribContext)_localctx).ID = match(ID);
			 
			            novaVariavel = new Variavel((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null), tipo, escopo);
			            boolean declarado = cv.adiciona(novaVariavel);
			            if(!declarado){
			                System.err.println("Variavel "+(((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null)+" ja foi declarada!!!");
			                System.exit(0);
			            }
			            codigoJava += (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            if(insideFor){
			                forText = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			            }
			        
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIB) {
				{
				setState(63);
				match(OP_ATRIB);
				setState(64);
				((AtribContext)_localctx).primary = primary();
				}
			}


			            if((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null) != null)
			                codigoJava += " = "+(((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null);
			            if(novaVariavel.getTipo() == 2)
			                codigoJava += "f";
			        
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(69);
				match(T__5);
					tipo = 0;
				                        if(insideFor){
				                            codigoJava += "int ";
				                        } else {
				                            if(escopo == 0){
				                                codigoJava += "\tint ";
				                            } else {
				                                codigoJava += "\t\tint ";
				                            }
				                        }
				                    
				}
				break;
			case T__6:
				{
				setState(71);
				match(T__6);
					tipo = 1;
				                        if(insideFor){
				                            codigoJava += "String ";
				                        } else {
				                            if(escopo == 0){
				                                codigoJava += "\tString ";
				                            } else {
				                                codigoJava += "\t\tString ";
				                            }
				                        }
				                    
				}
				break;
			case T__7:
				{
				setState(73);
				match(T__7);
					tipo = 2;
				                        if(insideFor){
				                            codigoJava += "float ";
				                        } else {
				                            if(escopo == 0){
				                                codigoJava += "\tfloat ";
				                            } else {
				                                codigoJava += "\t\tfloat ";
				                            }
				                        }
				                    
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2159104L) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(78);
					printf();
					}
					break;
				case T__12:
					{
					setState(79);
					scanf();
					}
					break;
				case T__8:
					{
					setState(80);
					cond();
					}
					break;
				case ID:
					{
					setState(81);
					atrib();
					}
					break;
				case T__13:
					{
					setState(82);
					for_();
					}
					break;
				case LOOP:
					{
					setState(83);
					while_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
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
		public TerminalNode OPMAT() { return getToken(crossLanguageParser.OPMAT, 0); }
		public List<TerminalNode> ID() { return getTokens(crossLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(crossLanguageParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(crossLanguageParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(crossLanguageParser.NUM, i);
		}
		public List<TerminalNode> DEC() { return getTokens(crossLanguageParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(crossLanguageParser.DEC, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 425984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			match(OPMAT);
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 425984L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(crossLanguageParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(crossLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(crossLanguageParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(crossLanguageParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(crossLanguageParser.NUM, i);
		}
		public List<TerminalNode> DEC() { return getTokens(crossLanguageParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(crossLanguageParser.DEC, i);
		}
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
		enterRule(_localctx, 12, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 425984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(OPREL);
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 425984L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CompContext comp;
		public List<TerminalNode> AP() { return getTokens(crossLanguageParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(crossLanguageParser.AP, i);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
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
		enterRule(_localctx, 14, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__8);
			setState(98);
			match(AP);
			setState(99);
			((CondContext)_localctx).comp = comp();
			setState(100);
			match(FP);
			setState(101);
			match(T__9);
			setState(102);
			match(AC);

			            codigoJava += "\t\tif ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+") {";
			        
			setState(104);
			expr();

			            codigoJava += "\t\t}";
			        
			setState(106);
			match(FC);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(107);
				match(T__10);
				codigoJava += " else ";
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(109);
					match(T__8);
					setState(110);
					match(AP);
					setState(111);
					((CondContext)_localctx).comp = comp();
					setState(112);
					match(FP);
					codigoJava += "if ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+")";
					}
				}

				setState(117);
				match(AC);

				                codigoJava += "{";
				            
				setState(119);
				expr();

				                codigoJava += "\t\t}";
				            
				setState(121);
				match(FC);
				}
				}
				setState(127);
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
	public static class PrintfContext extends ParserRuleContext {
		public PrintTypesContext printTypes;
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public PrintTypesContext printTypes() {
			return getRuleContext(PrintTypesContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
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
		enterRule(_localctx, 16, RULE_printf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__11);
			setState(129);
			match(AP);
			setState(130);
			((PrintfContext)_localctx).printTypes = printTypes();
			setState(131);
			match(FP);

			            codigoJava += "\n\t\t\tSystem.out.println("+(((PrintfContext)_localctx).printTypes!=null?_input.getText(((PrintfContext)_localctx).printTypes.start,((PrintfContext)_localctx).printTypes.stop):null)+");\n";
			        
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
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
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
		enterRule(_localctx, 18, RULE_scanf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(135);
			match(AP);
			setState(136);
			match(FP);

			            //if(hasScan == false){
			            //    if(escopo == 1)
			            //        codigoJava += "\t";
			            //    codigoJava += "\tScanner scan = new Scanner(System.in);\n";
			            //}
			        

			            codigoJava += "scan.nextLine()";
			        
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
		public TerminalNode LOOP() { return getToken(crossLanguageParser.LOOP, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
		enterRule(_localctx, 20, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__13);
			setState(141);
			match(AP);
			 insideFor = true; 
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(143);
				((ForContext)_localctx).ID = match(ID);
				forText = (((ForContext)_localctx).ID!=null?((ForContext)_localctx).ID.getText():null);
				}
				break;
			case 2:
				{
				setState(145);
				declare();
				}
				break;
			}
			 
			            if(escopo == 1){
			                codigoJava += "\n\t";
			            } else {
			                codigoJava += "\n";
			            }
			            codigoJava += "\tfor(";
			        
			 codigoJava += "; "+forText; 
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP) {
				{
				setState(150);
				match(LOOP);
				setState(151);
				((ForContext)_localctx).primary = primary();
				}
			}


			            codigoJava += " < "+(((ForContext)_localctx).primary!=null?_input.getText(((ForContext)_localctx).primary.start,((ForContext)_localctx).primary.stop):null)+"; "+forText+"++)";
			        
			setState(155);
			match(FP);
			setState(156);
			match(AC);
			codigoJava+="{";
			setState(158);
			expr();
			setState(159);
			match(FC);
			codigoJava+="\t\t}";
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
		enterRule(_localctx, 22, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LOOP);
			 
			            if(escopo == 1){
			                codigoJava += "\n\t";
			            } else {
			                codigoJava += "\n";
			            }
			            codigoJava += "\twhile";
			        
			setState(165);
			match(AP);
			setState(166);
			((WhileContext)_localctx).comp = comp();
			setState(167);
			match(FP);
			codigoJava += "("+(((WhileContext)_localctx).comp!=null?_input.getText(((WhileContext)_localctx).comp.start,((WhileContext)_localctx).comp.stop):null)+"){";
			setState(169);
			match(AC);
			setState(170);
			expr();
			setState(171);
			match(FC);

			            if(escopo == 1){
			                codigoJava += "\t";
			            }
			            codigoJava += "\t}";
			        
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
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
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
		enterRule(_localctx, 24, RULE_printTypes);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
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
				setState(176);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				mathExpr();
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
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
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
				setState(182);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
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
		"\u0004\u0001\u001c\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007|\b"+
		"\u0007\n\u0007\f\u0007\u007f\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0093\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0099\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b3\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001\r\u0000\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0001\u0002\u0000\u000f\u000f\u0011\u0012\u00c3\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\nY\u0001\u0000"+
		"\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000"+
		"\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000"+
		"\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000"+
		"\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0006\u0000\uffff\uffff"+
		"\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0002\u0000\u0000"+
		" !\u0006\u0000\uffff\uffff\u0000!\"\u0003\u0002\u0001\u0000\"#\u0003\b"+
		"\u0004\u0000#$\u0005\u0003\u0000\u0000$%\u0006\u0000\uffff\uffff\u0000"+
		"%&\u0005\u0004\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'(\u0003\u0006"+
		"\u0003\u0000(.\u0003\u0004\u0002\u0000)*\u0005\u0005\u0000\u0000*+\u0006"+
		"\u0001\uffff\uffff\u0000+-\u0003\u0004\u0002\u0000,)\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/4\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005"+
		"\u001b\u0000\u000023\u0006\u0001\uffff\uffff\u000035\u0003\u0012\t\u0000"+
		"41\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0006\u0001\uffff\uffff\u000079\u0001\u0000\u0000\u00008\'\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=>\u0005\u000f\u0000\u0000>A\u0006\u0002\uffff\uffff\u0000"+
		"?@\u0005\u001a\u0000\u0000@B\u0003\u001a\r\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0002\uffff"+
		"\uffff\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000"+
		"FM\u0006\u0003\uffff\uffff\u0000GH\u0005\u0007\u0000\u0000HM\u0006\u0003"+
		"\uffff\uffff\u0000IJ\u0005\b\u0000\u0000JM\u0006\u0003\uffff\uffff\u0000"+
		"KM\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000LI\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0007\u0001"+
		"\u0000\u0000\u0000NU\u0003\u0010\b\u0000OU\u0003\u0012\t\u0000PU\u0003"+
		"\u000e\u0007\u0000QU\u0003\u0004\u0002\u0000RU\u0003\u0014\n\u0000SU\u0003"+
		"\u0016\u000b\u0000TN\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000"+
		"TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\t\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000YZ\u0007\u0000\u0000\u0000Z[\u0005\u0013\u0000\u0000"+
		"[\\\u0007\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0007\u0000"+
		"\u0000\u0000^_\u0005\u0014\u0000\u0000_`\u0007\u0000\u0000\u0000`\r\u0001"+
		"\u0000\u0000\u0000ab\u0005\t\u0000\u0000bc\u0005\u0018\u0000\u0000cd\u0003"+
		"\f\u0006\u0000de\u0005\u0019\u0000\u0000ef\u0005\n\u0000\u0000fg\u0005"+
		"\u0016\u0000\u0000gh\u0006\u0007\uffff\uffff\u0000hi\u0003\b\u0004\u0000"+
		"ij\u0006\u0007\uffff\uffff\u0000j}\u0005\u0017\u0000\u0000kl\u0005\u000b"+
		"\u0000\u0000ls\u0006\u0007\uffff\uffff\u0000mn\u0005\t\u0000\u0000no\u0005"+
		"\u0018\u0000\u0000op\u0003\f\u0006\u0000pq\u0005\u0019\u0000\u0000qr\u0006"+
		"\u0007\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0016"+
		"\u0000\u0000vw\u0006\u0007\uffff\uffff\u0000wx\u0003\b\u0004\u0000xy\u0006"+
		"\u0007\uffff\uffff\u0000yz\u0005\u0017\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{k\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000"+
		"\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0003\u0018\f\u0000\u0083"+
		"\u0084\u0005\u0019\u0000\u0000\u0084\u0085\u0006\b\uffff\uffff\u0000\u0085"+
		"\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0088"+
		"\u0005\u0018\u0000\u0000\u0088\u0089\u0005\u0019\u0000\u0000\u0089\u008a"+
		"\u0006\t\uffff\uffff\u0000\u008a\u008b\u0006\t\uffff\uffff\u0000\u008b"+
		"\u0013\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d"+
		"\u008e\u0005\u0018\u0000\u0000\u008e\u0092\u0006\n\uffff\uffff\u0000\u008f"+
		"\u0090\u0005\u000f\u0000\u0000\u0090\u0093\u0006\n\uffff\uffff\u0000\u0091"+
		"\u0093\u0003\u0002\u0001\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0006\n\uffff\uffff\u0000\u0095\u0098\u0006\n\uffff\uffff\u0000"+
		"\u0096\u0097\u0005\u0015\u0000\u0000\u0097\u0099\u0003\u001a\r\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006\n\uffff\uffff\u0000\u009b"+
		"\u009c\u0005\u0019\u0000\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d"+
		"\u009e\u0006\n\uffff\uffff\u0000\u009e\u009f\u0003\b\u0004\u0000\u009f"+
		"\u00a0\u0005\u0017\u0000\u0000\u00a0\u00a1\u0006\n\uffff\uffff\u0000\u00a1"+
		"\u00a2\u0006\n\uffff\uffff\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0015\u0000\u0000\u00a4\u00a5\u0006\u000b\uffff\uffff\u0000"+
		"\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0003\f\u0006\u0000\u00a7"+
		"\u00a8\u0005\u0019\u0000\u0000\u00a8\u00a9\u0006\u000b\uffff\uffff\u0000"+
		"\u00a9\u00aa\u0005\u0016\u0000\u0000\u00aa\u00ab\u0003\b\u0004\u0000\u00ab"+
		"\u00ac\u0005\u0017\u0000\u0000\u00ac\u00ad\u0006\u000b\uffff\uffff\u0000"+
		"\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00b3\u0005\u0010\u0000\u0000"+
		"\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00b3\u0003\u001a\r\u0000\u00b1"+
		"\u00b3\u0003\n\u0005\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00b9"+
		"\u0005\u000f\u0000\u0000\u00b5\u00b9\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0005\u0011\u0000\u0000\u00b7\u00b9\u0005\u0012\u0000\u0000\u00b8\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u001b"+
		"\u0001\u0000\u0000\u0000\r.4:ALTVs}\u0092\u0098\u00b2\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}