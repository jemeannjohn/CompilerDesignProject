// Generated from JAJ.g4 by ANTLR 4.4
package jaj;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JAJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		OR=10, AND=11, EQ=12, NEQ=13, GT=14, LT=15, GTEQ=16, LTEQ=17, PLUS=18, 
		MINUS=19, MULT=20, DIV=21, MOD=22, POW=23, NOT=24, SCOL=25, ASSIGN=26, 
		OPAR=27, CPAR=28, OBRACE=29, CBRACE=30, TRUE=31, FALSE=32, NIL=33, IF=34, 
		ELSE=35, WHILE=36, LOG=37, PRINT=38, ID=39, INT=40, FLOAT=41, STRING=42, 
		COMMENT=43, SPACE=44, OTHER=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'return'", "'spop'", "'['", "']'", "'spush'", "'stack'", 
		"'top'", "','", "'empty'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", 
		"'='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", 
		"'else'", "'while'", "'log'", "'print'", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "OTHER"
	};
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_global_scope = 3, 
		RULE_block_scope = 4, RULE_return_stat = 5, RULE_stack_init = 6, RULE_stack_operations = 7, 
		RULE_print = 8, RULE_functionDefinition = 9, RULE_functionCall = 10, RULE_paramDefs = 11, 
		RULE_assignment = 12, RULE_if_stat = 13, RULE_condition_block = 14, RULE_stat_block = 15, 
		RULE_while_stat = 16, RULE_log = 17, RULE_expr = 18, RULE_stack_top = 19, 
		RULE_atom = 20;
	public static final String[] ruleNames = {
		"parse", "block", "stat", "global_scope", "block_scope", "return_stat", 
		"stack_init", "stack_operations", "print", "functionDefinition", "functionCall", 
		"paramDefs", "assignment", "if_stat", "condition_block", "stat_block", 
		"while_stat", "log", "expr", "stack_top", "atom"
	};

	@Override
	public String getGrammarFileName() { return "JAJ.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JAJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); block();
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

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__4) | (1L << T__3) | (1L << T__0) | (1L << LT) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << PRINT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(44); stat();
				}
				}
				setState(49);
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

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Stack_initContext stack_init() {
			return getRuleContext(Stack_initContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(JAJParser.OTHER, 0); }
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public Global_scopeContext global_scope() {
			return getRuleContext(Global_scopeContext.class,0);
		}
		public Block_scopeContext block_scope() {
			return getRuleContext(Block_scopeContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Stack_operationsContext stack_operations() {
			return getRuleContext(Stack_operationsContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); while_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); log();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54); ((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56); functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57); functionCall();
				setState(58); match(SCOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60); return_stat();
				setState(61); match(SCOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63); print();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64); stack_init();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(65); stack_operations();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(66); global_scope();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(67); block_scope();
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

	public static class Global_scopeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Global_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterGlobal_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitGlobal_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitGlobal_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_scopeContext global_scope() throws RecognitionException {
		Global_scopeContext _localctx = new Global_scopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(LT);
			setState(71); block();
			setState(72); match(GT);
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

	public static class Block_scopeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterBlock_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitBlock_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitBlock_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_scopeContext block_scope() throws RecognitionException {
		Block_scopeContext _localctx = new Block_scopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__6);
			setState(75); block();
			setState(76); match(T__5);
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

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T__8);
			setState(79); expr(0);
			setState(80); match(SCOL);
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

	public static class Stack_initContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public Stack_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStack_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStack_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStack_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_initContext stack_init() throws RecognitionException {
		Stack_initContext _localctx = new Stack_initContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stack_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__3);
			setState(83); match(ID);
			setState(84); match(SCOL);
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

	public static class Stack_operationsContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public TerminalNode INT() { return getToken(JAJParser.INT, 0); }
		public Stack_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStack_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStack_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStack_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_operationsContext stack_operations() throws RecognitionException {
		Stack_operationsContext _localctx = new Stack_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stack_operations);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(T__4);
				setState(87); match(OPAR);
				setState(88); match(ID);
				setState(89); match(T__1);
				setState(90); match(INT);
				setState(91); match(CPAR);
				setState(92); match(SCOL);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(T__7);
				setState(94); match(OPAR);
				setState(95); match(ID);
				setState(96); match(CPAR);
				setState(97); match(SCOL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); match(T__0);
				setState(99); match(OPAR);
				setState(100); match(ID);
				setState(101); match(CPAR);
				setState(102); match(SCOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public TerminalNode STRING() { return getToken(JAJParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(PRINT);
				setState(106); match(ID);
				setState(107); match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(PRINT);
				setState(109); match(STRING);
				setState(110); match(SCOL);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(JAJParser.OBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(JAJParser.ID); }
		public TerminalNode CBRACE() { return getToken(JAJParser.CBRACE, 0); }
		public TerminalNode ID(int i) {
			return getToken(JAJParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(ID);
			setState(114); match(OPAR);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(115); match(ID);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(116); match(T__1);
					setState(117); match(ID);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128); match(CPAR);
			setState(129); match(OBRACE);
			setState(130); block();
			setState(131); match(CBRACE);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public ParamDefsContext paramDefs() {
			return getRuleContext(ParamDefsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(ID);
			setState(134); match(OPAR);
			setState(135); paramDefs();
			setState(136); match(CPAR);
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

	public static class ParamDefsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JAJParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JAJParser.ID, i);
		}
		public ParamDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterParamDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitParamDefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitParamDefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDefsContext paramDefs() throws RecognitionException {
		ParamDefsContext _localctx = new ParamDefsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramDefs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138); match(ID);
					setState(139); match(T__1);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(145); match(ID);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JAJParser.ASSIGN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stack_topContext stack_top() {
			return getRuleContext(Stack_topContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(ID);
				setState(148); match(ASSIGN);
				setState(149); expr(0);
				setState(150); match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); match(ID);
				setState(153); match(ASSIGN);
				setState(154); functionCall();
				setState(155); match(SCOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(ID);
				setState(158); match(ASSIGN);
				setState(159); stack_top();
				setState(160); match(SCOL);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(JAJParser.ELSE); }
		public List<TerminalNode> IF() { return getTokens(JAJParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(JAJParser.IF, i);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode ELSE(int i) {
			return getToken(JAJParser.ELSE, i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(IF);
			setState(165); condition_block();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); match(ELSE);
					setState(167); match(IF);
					setState(168); condition_block();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(174); match(ELSE);
				setState(175); stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); expr(0);
			setState(179); stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(JAJParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JAJParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat_block);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(OBRACE);
				setState(182); block();
				setState(183); match(CBRACE);
				}
				break;
			case T__8:
			case T__7:
			case T__6:
			case T__4:
			case T__3:
			case T__0:
			case LT:
			case IF:
			case WHILE:
			case LOG:
			case PRINT:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JAJParser.WHILE, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(WHILE);
			setState(189); expr(0);
			setState(190); stat_block();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(JAJParser.LOG, 0); }
		public TerminalNode SCOL() { return getToken(JAJParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(LOG);
			setState(193); expr(0);
			setState(194); match(SCOL);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(JAJParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(JAJParser.MINUS, 0); }
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(JAJParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(JAJParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(JAJParser.DIV, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(JAJParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JAJParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JAJParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(JAJParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(JAJParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(JAJParser.LT, 0); }
		public TerminalNode GT() { return getToken(JAJParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(JAJParser.GTEQ, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(JAJParser.NEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JAJParser.EQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(JAJParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197); match(MINUS);
				setState(198); expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(NOT);
				setState(200); expr(8);
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(205); match(POW);
						setState(206); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(209); expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(212); expr(7);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(215); expr(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(217);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(218); expr(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220); match(AND);
						setState(221); expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223); match(OR);
						setState(224); expr(3);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Stack_topContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public Stack_topContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStack_top(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStack_top(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStack_top(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_topContext stack_top() throws RecognitionException {
		Stack_topContext _localctx = new Stack_topContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stack_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(T__2);
			setState(231); match(OPAR);
			setState(232); match(ID);
			setState(233); match(CPAR);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(JAJParser.CPAR, 0); }
		public TerminalNode OPAR() { return getToken(JAJParser.OPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(JAJParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JAJParser.TRUE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(JAJParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(JAJParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(JAJParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(JAJParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JAJParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JAJListener ) ((JAJListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JAJVisitor ) return ((JAJVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235); match(OPAR);
				setState(236); expr(0);
				setState(237); match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241); match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(242); match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(243); match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 7);
		case 2: return precpred(_ctx, 6);
		case 3: return precpred(_ctx, 5);
		case 4: return precpred(_ctx, 4);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\7\13~\n\13\f\13\16\13\u0081\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u008f\n\r"+
		"\f\r\16\r\u0092\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a5\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\3\17\3\17\5\17\u00b3\n\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00bd\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cd\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00f7\n\26\3\26\2\3&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\b\3\2\26\30\3\2\24\25\3\2\20\23\3\2\16\17\3\2*+\3\2!\"\u0109"+
		"\2,\3\2\2\2\4\61\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16"+
		"T\3\2\2\2\20i\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26\u0087\3\2\2\2\30\u0090"+
		"\3\2\2\2\32\u00a4\3\2\2\2\34\u00a6\3\2\2\2\36\u00b4\3\2\2\2 \u00bc\3\2"+
		"\2\2\"\u00be\3\2\2\2$\u00c2\3\2\2\2&\u00cc\3\2\2\2(\u00e8\3\2\2\2*\u00f6"+
		"\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/"+
		"\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64G\5\32\16\2\65G\5"+
		"\34\17\2\66G\5\"\22\2\67G\5$\23\289\7/\2\29G\b\4\1\2:G\5\24\13\2;<\5\26"+
		"\f\2<=\7\33\2\2=G\3\2\2\2>?\5\f\7\2?@\7\33\2\2@G\3\2\2\2AG\5\22\n\2BG"+
		"\5\16\b\2CG\5\20\t\2DG\5\b\5\2EG\5\n\6\2F\64\3\2\2\2F\65\3\2\2\2F\66\3"+
		"\2\2\2F\67\3\2\2\2F8\3\2\2\2F:\3\2\2\2F;\3\2\2\2F>\3\2\2\2FA\3\2\2\2F"+
		"B\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\7\21\2\2IJ\5\4\3"+
		"\2JK\7\20\2\2K\t\3\2\2\2LM\7\5\2\2MN\5\4\3\2NO\7\6\2\2O\13\3\2\2\2PQ\7"+
		"\3\2\2QR\5&\24\2RS\7\33\2\2S\r\3\2\2\2TU\7\b\2\2UV\7)\2\2VW\7\33\2\2W"+
		"\17\3\2\2\2XY\7\7\2\2YZ\7\35\2\2Z[\7)\2\2[\\\7\n\2\2\\]\7*\2\2]^\7\36"+
		"\2\2^j\7\33\2\2_`\7\4\2\2`a\7\35\2\2ab\7)\2\2bc\7\36\2\2cj\7\33\2\2de"+
		"\7\13\2\2ef\7\35\2\2fg\7)\2\2gh\7\36\2\2hj\7\33\2\2iX\3\2\2\2i_\3\2\2"+
		"\2id\3\2\2\2j\21\3\2\2\2kl\7(\2\2lm\7)\2\2mr\7\33\2\2no\7(\2\2op\7,\2"+
		"\2pr\7\33\2\2qk\3\2\2\2qn\3\2\2\2r\23\3\2\2\2st\7)\2\2t\177\7\35\2\2u"+
		"z\7)\2\2vw\7\n\2\2wy\7)\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~"+
		"\3\2\2\2|z\3\2\2\2}u\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\36\2\2\u0083"+
		"\u0084\7\37\2\2\u0084\u0085\5\4\3\2\u0085\u0086\7 \2\2\u0086\25\3\2\2"+
		"\2\u0087\u0088\7)\2\2\u0088\u0089\7\35\2\2\u0089\u008a\5\30\r\2\u008a"+
		"\u008b\7\36\2\2\u008b\27\3\2\2\2\u008c\u008d\7)\2\2\u008d\u008f\7\n\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7)\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\7)\2\2\u0096\u0097\7\34\2\2\u0097\u0098\5&\24"+
		"\2\u0098\u0099\7\33\2\2\u0099\u00a5\3\2\2\2\u009a\u009b\7)\2\2\u009b\u009c"+
		"\7\34\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\33\2\2\u009e\u00a5\3\2\2"+
		"\2\u009f\u00a0\7)\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3"+
		"\7\33\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u009a\3\2\2\2"+
		"\u00a4\u009f\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\u00ad\5"+
		"\36\20\2\u00a8\u00a9\7%\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ac\5\36\20\2\u00ab"+
		"\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b2\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1"+
		"\u00b3\5 \21\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2"+
		"\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\5 \21\2\u00b6\37\3\2\2\2\u00b7\u00b8"+
		"\7\37\2\2\u00b8\u00b9\5\4\3\2\u00b9\u00ba\7 \2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00bd\5\6\4\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd!\3\2\2\2"+
		"\u00be\u00bf\7&\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\5 \21\2\u00c1#\3\2"+
		"\2\2\u00c2\u00c3\7\'\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\7\33\2\2\u00c5"+
		"%\3\2\2\2\u00c6\u00c7\b\24\1\2\u00c7\u00c8\7\25\2\2\u00c8\u00cd\5&\24"+
		"\13\u00c9\u00ca\7\32\2\2\u00ca\u00cd\5&\24\n\u00cb\u00cd\5*\26\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00e5\3\2"+
		"\2\2\u00ce\u00cf\f\f\2\2\u00cf\u00d0\7\31\2\2\u00d0\u00e4\5&\24\r\u00d1"+
		"\u00d2\f\t\2\2\u00d2\u00d3\t\2\2\2\u00d3\u00e4\5&\24\n\u00d4\u00d5\f\b"+
		"\2\2\u00d5\u00d6\t\3\2\2\u00d6\u00e4\5&\24\t\u00d7\u00d8\f\7\2\2\u00d8"+
		"\u00d9\t\4\2\2\u00d9\u00e4\5&\24\b\u00da\u00db\f\6\2\2\u00db\u00dc\t\5"+
		"\2\2\u00dc\u00e4\5&\24\7\u00dd\u00de\f\5\2\2\u00de\u00df\7\r\2\2\u00df"+
		"\u00e4\5&\24\6\u00e0\u00e1\f\4\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e4\5&"+
		"\24\5\u00e3\u00ce\3\2\2\2\u00e3\u00d1\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3"+
		"\u00d7\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\'\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\7\35\2"+
		"\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7\36\2\2\u00ec)\3\2\2\2\u00ed\u00ee"+
		"\7\35\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\7\36\2\2\u00f0\u00f7\3\2\2\2"+
		"\u00f1\u00f7\t\6\2\2\u00f2\u00f7\t\7\2\2\u00f3\u00f7\7)\2\2\u00f4\u00f7"+
		"\7,\2\2\u00f5\u00f7\7#\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7+\3\2\2\2\21\61Fiqz\177\u0090\u00a4\u00ad\u00b2\u00bc\u00cc"+
		"\u00e3\u00e5\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}