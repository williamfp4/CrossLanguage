// Generated from .//crossLanguage.g4 by ANTLR 4.13.1

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
		ID=10, STRING=11, NUM=12, DEC=13, OPMAT=14, OPREL=15, PV=16, AC=17, FC=18, 
		AP=19, FP=20, OP_ATRIB=21, WS=22;
	public static final int
		RULE_vai = 0, RULE_declare = 1, RULE_atrib = 2, RULE_tipo = 3, RULE_expr = 4, 
		RULE_mathExpr = 5, RULE_cond = 6, RULE_print = 7, RULE_comp = 8, RULE_printTypes = 9, 
		RULE_primary = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"vai", "declare", "atrib", "tipo", "expr", "mathExpr", "cond", "print", 
			"comp", "printTypes", "primary"
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
	    String ifText, atribText, printText = "";
	    String nome;
		int escopo, tipo;

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
			 
			            escopo = 0;
					    codigoJava += "public class Codigo{\n";
					
			setState(23);
			declare();
			setState(24);
			match(T__0);
			 	
			            escopo = 1;
			            codigoJava += "\tpublic static void main(String args[]){\n"; 
			        
			setState(26);
			declare();
			setState(27);
			expr();
			setState(28);
			match(T__1);

			            codigoJava += "\n\t}\n}";
			            System.out.println(codigoJava);
			        
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
		public List<TerminalNode> PV() { return getTokens(crossLanguageParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(crossLanguageParser.PV, i);
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
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(31);
					tipo();
					setState(32);
					atrib();
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(33);
						match(T__2);
						codigoJava += ",";
						setState(35);
						atrib();
						}
						}
						setState(40);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(41);
					match(PV);
					codigoJava += ";\n";
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public Token OP_ATRIB;
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
			setState(49);
			((AtribContext)_localctx).ID = match(ID);
			 
			            novaVariavel = new Variavel((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null), tipo, escopo);
			            boolean declarado = cv.adiciona(novaVariavel);
			            if(!declarado){
			                System.err.println("Variavel "+(((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null)+" ja foi declarada!!!");
			                System.exit(0);
			            }
			            codigoJava += (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
			        
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATRIB) {
				{
				setState(51);
				((AtribContext)_localctx).OP_ATRIB = match(OP_ATRIB);
				setState(52);
				((AtribContext)_localctx).primary = primary();
				}
			}


			            if((((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null) != null)
			                codigoJava += (((AtribContext)_localctx).OP_ATRIB!=null?((AtribContext)_localctx).OP_ATRIB.getText():null)+(((AtribContext)_localctx).primary!=null?_input.getText(((AtribContext)_localctx).primary.start,((AtribContext)_localctx).primary.stop):null);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(57);
				match(T__3);
					tipo = 0;
				                            if(escopo == 1){
				                                codigoJava += "\t";
				                            }
											codigoJava += "\tint "; 
										
				}
				break;
			case T__4:
				{
				setState(59);
				match(T__4);
					tipo = 1;
				                            if(escopo == 1){
				                                codigoJava += "\t";
				                            }
											codigoJava += "\tString ";
										
				}
				break;
			case T__5:
				{
				setState(61);
				match(T__5);
					tipo = 2;
				                            if(escopo == 1){
				                                codigoJava += "\t";
				                            }
											codigoJava += "\tfloat ";
										
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
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1664L) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(66);
					print();
					}
					break;
				case T__6:
					{
					setState(67);
					cond();
					}
					break;
				case ID:
					{
					setState(68);
					atrib();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73);
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
		public TerminalNode PV() { return getToken(crossLanguageParser.PV, 0); }
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
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(OPMAT);
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CompContext comp;
		public ExprContext expr;
		public TerminalNode AP() { return getToken(crossLanguageParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(crossLanguageParser.FP, 0); }
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
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__6);
			setState(81);
			match(AP);
			setState(82);
			((CondContext)_localctx).comp = comp();
			setState(83);
			match(FP);
			setState(84);
			match(AC);
			setState(85);
			((CondContext)_localctx).expr = expr();
			setState(86);
			match(FC);

			            codigoJava += "\t\tif ("+(((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null)+") {"+printText+"\n\t\t}";
			        
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(88);
				match(T__7);
				setState(89);
				match(AC);
				setState(90);
				((CondContext)_localctx).expr = expr();
				setState(91);
				match(FC);

				                codigoJava += " else{\n\t\t\t"+(((CondContext)_localctx).expr!=null?_input.getText(((CondContext)_localctx).expr.start,((CondContext)_localctx).expr.stop):null)+"\n\t\t}";
				            
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
	public static class PrintContext extends ParserRuleContext {
		public PrintTypesContext printTypes;
		public PrintTypesContext printTypes() {
			return getRuleContext(PrintTypesContext.class,0);
		}
		public TerminalNode PV() { return getToken(crossLanguageParser.PV, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crossLanguageListener ) ((crossLanguageListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__8);
			setState(97);
			((PrintContext)_localctx).printTypes = printTypes();
			setState(98);
			match(PV);

			            printText += "\n\t\t\tSystem.out.println("+(((PrintContext)_localctx).printTypes!=null?_input.getText(((PrintContext)_localctx).printTypes.start,((PrintContext)_localctx).printTypes.stop):null)+");";
			        
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
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13312L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(OPREL);
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13312L) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_printTypes);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
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
				setState(107);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
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
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
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
				setState(113);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
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
		"\u0004\u0001\u0016v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006_\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tn\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nt\b\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0001\u0002\u0000\n\n\f\r{\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u0002.\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006@"+
		"\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000"+
		"\u0000\fP\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010"+
		"e\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014s\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0006\u0000\uffff\uffff\u0000\u0017\u0018"+
		"\u0003\u0002\u0001\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a"+
		"\u0006\u0000\uffff\uffff\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b"+
		"\u001c\u0003\b\u0004\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e"+
		"\u0006\u0000\uffff\uffff\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f"+
		" \u0003\u0006\u0003\u0000 &\u0003\u0004\u0002\u0000!\"\u0005\u0003\u0000"+
		"\u0000\"#\u0006\u0001\uffff\uffff\u0000#%\u0003\u0004\u0002\u0000$!\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0010\u0000\u0000*+\u0006\u0001\uffff\uffff\u0000+-\u0001"+
		"\u0000\u0000\u0000,\u001f\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\n\u0000\u000025\u0006"+
		"\u0002\uffff\uffff\u000034\u0005\u0015\u0000\u000046\u0003\u0014\n\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0006\u0002\uffff\uffff\u00008\u0005\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0004\u0000\u0000:A\u0006\u0003\uffff\uffff\u0000;<\u0005\u0005"+
		"\u0000\u0000<A\u0006\u0003\uffff\uffff\u0000=>\u0005\u0006\u0000\u0000"+
		">A\u0006\u0003\uffff\uffff\u0000?A\u0001\u0000\u0000\u0000@9\u0001\u0000"+
		"\u0000\u0000@;\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BF\u0003\u000e\u0007"+
		"\u0000CF\u0003\f\u0006\u0000DF\u0003\u0004\u0002\u0000EB\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\t\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000\u0000"+
		"KL\u0005\u000e\u0000\u0000LN\u0007\u0000\u0000\u0000MO\u0005\u0010\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u000b\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0005\u0013\u0000\u0000"+
		"RS\u0003\u0010\b\u0000ST\u0005\u0014\u0000\u0000TU\u0005\u0011\u0000\u0000"+
		"UV\u0003\b\u0004\u0000VW\u0005\u0012\u0000\u0000W^\u0006\u0006\uffff\uffff"+
		"\u0000XY\u0005\b\u0000\u0000YZ\u0005\u0011\u0000\u0000Z[\u0003\b\u0004"+
		"\u0000[\\\u0005\u0012\u0000\u0000\\]\u0006\u0006\uffff\uffff\u0000]_\u0001"+
		"\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\r\u0001\u0000\u0000\u0000`a\u0005\t\u0000\u0000ab\u0003\u0012\t\u0000"+
		"bc\u0005\u0010\u0000\u0000cd\u0006\u0007\uffff\uffff\u0000d\u000f\u0001"+
		"\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000fg\u0005\u000f\u0000\u0000"+
		"gh\u0007\u0000\u0000\u0000h\u0011\u0001\u0000\u0000\u0000in\u0005\u000b"+
		"\u0000\u0000jn\u0001\u0000\u0000\u0000kn\u0003\u0014\n\u0000ln\u0003\n"+
		"\u0005\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0013\u0001\u0000\u0000"+
		"\u0000ot\u0005\n\u0000\u0000pt\u0001\u0000\u0000\u0000qt\u0005\f\u0000"+
		"\u0000rt\u0005\r\u0000\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0015\u0001"+
		"\u0000\u0000\u0000\n&.5@EGN^ms";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}