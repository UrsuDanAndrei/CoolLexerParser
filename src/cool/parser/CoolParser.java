// Generated from /home/dan/workspace/cpl/cpl_teme/cpl_tema1/Tema1/src/cool/parser/CoolParser.g4 by ANTLR 4.9.2

    package cool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, COMMA=2, COLON=3, SEMI=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		NEG=9, PLUS=10, MINUS=11, MULT=12, DIV=13, EQUAL=14, NOT=15, LT=16, LE=17, 
		ISVOID=18, DOT=19, AT=20, ASSIGN=21, IF=22, THEN=23, ELSE=24, FI=25, WHILE=26, 
		LOOP=27, POOL=28, CASE=29, OF=30, CONNECTOR=31, ESAC=32, LET=33, IN=34, 
		CLASS=35, INHERITS=36, NEW=37, INT=38, BOOL=39, STRING_UNTERMINATED=40, 
		STRING_WITH_NULL=41, STRING_WITH_EOF=42, STRING=43, TYPE=44, ID=45, LINE_COMMENT=46, 
		BLOCK_COMMENT_END_WITHOUT_START=47, BLOCK_COMMENT_WITH_EOF=48, BLOCK_COMMENT=49, 
		WS=50, INVALID_CHAR=51;
	public static final int
		RULE_program = 0, RULE_coolClass = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4, RULE_localVariable = 5, RULE_caseBranch = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "coolClass", "feature", "formal", "expr", "localVariable", 
			"caseBranch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'~'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'not'", "'<'", "'<='", null, "'.'", "'@'", 
			"'<-'", null, null, null, null, null, null, null, null, null, "'=>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "NEG", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", 
			"LE", "ISVOID", "DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", 
			"LOOP", "POOL", "CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", 
			"INHERITS", "NEW", "INT", "BOOL", "STRING_UNTERMINATED", "STRING_WITH_NULL", 
			"STRING_WITH_EOF", "STRING", "TYPE", "ID", "LINE_COMMENT", "BLOCK_COMMENT_END_WITHOUT_START", 
			"BLOCK_COMMENT_WITH_EOF", "BLOCK_COMMENT", "WS", "INVALID_CHAR"
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
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<CoolClassContext> coolClass() {
			return getRuleContexts(CoolClassContext.class);
		}
		public CoolClassContext coolClass(int i) {
			return getRuleContext(CoolClassContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				coolClass();
				setState(15);
				match(SEMI);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(21);
			match(EOF);
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

	public static class CoolClassContext extends ParserRuleContext {
		public Token id;
		public Token parentClass;
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public CoolClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coolClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCoolClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCoolClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCoolClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoolClassContext coolClass() throws RecognitionException {
		CoolClassContext _localctx = new CoolClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coolClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CLASS);
			setState(24);
			((CoolClassContext)_localctx).id = match(TYPE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(25);
				match(INHERITS);
				setState(26);
				((CoolClassContext)_localctx).parentClass = match(TYPE);
				}
			}

			setState(29);
			match(LBRACE);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				feature();
				setState(31);
				match(SEMI);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(RBRACE);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends FeatureContext {
		public Token id;
		public Token returnType;
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends FeatureContext {
		public Token id;
		public Token type;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((AttributeContext)_localctx).id = match(ID);
				setState(41);
				match(COLON);
				setState(42);
				((AttributeContext)_localctx).type = match(TYPE);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(43);
					match(ASSIGN);
					setState(44);
					((AttributeContext)_localctx).value = expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((MethodContext)_localctx).id = match(ID);
				setState(48);
				match(LPAREN);
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					}
					break;
				case ID:
					{
					setState(50);
					formal();
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(51);
						match(COMMA);
						setState(52);
						formal();
						}
						}
						setState(57);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60);
				match(RPAREN);
				setState(61);
				match(COLON);
				setState(62);
				((MethodContext)_localctx).returnType = match(TYPE);
				setState(63);
				match(LBRACE);
				setState(64);
				((MethodContext)_localctx).body = expr(0);
				setState(65);
				match(RBRACE);
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

	public static class FormalContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((FormalContext)_localctx).id = match(ID);
			setState(70);
			match(COLON);
			setState(71);
			((FormalContext)_localctx).type = match(TYPE);
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
	public static class NewContext extends ExprContext {
		public Token type;
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public NewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExprContext {
		public ExprContext leftOperand;
		public Token operation;
		public ExprContext rightOperand;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public PlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExprContext {
		public ExprContext leftOperand;
		public Token operation;
		public ExprContext rightOperand;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExprContext {
		public Token operation;
		public ExprContext operand;
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public ExprContext cond;
		public ExprContext body;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicitDispatchContext extends ExprContext {
		public Token id;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ImplicitDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterImplicitDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitImplicitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitImplicitDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegContext extends ExprContext {
		public Token operation;
		public ExprContext operand;
		public TerminalNode NEG() { return getToken(CoolParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public Token operation;
		public ExprContext operand;
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public ExprContext leftOperand;
		public Token operation;
		public ExprContext rightOperand;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CoolParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplicitDispatchContext extends ExprContext {
		public ExprContext caller;
		public Token classContext;
		public Token id;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ExplicitDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterExplicitDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitExplicitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitExplicitDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExprContext {
		public ExprContext body;
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<LocalVariableContext> localVariable() {
			return getRuleContexts(LocalVariableContext.class);
		}
		public LocalVariableContext localVariable(int i) {
			return getRuleContext(LocalVariableContext.class,i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExprContext {
		public ExprContext cond;
		public ExprContext thenBr;
		public ExprContext elseBr;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExprContext {
		public ExprContext toEvaluated;
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public Token leftOperand;
		public Token operation;
		public ExprContext rightOperand;
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAssign(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				match(IF);
				setState(75);
				((IfContext)_localctx).cond = expr(0);
				setState(76);
				match(THEN);
				setState(77);
				((IfContext)_localctx).thenBr = expr(0);
				setState(78);
				match(ELSE);
				setState(79);
				((IfContext)_localctx).elseBr = expr(0);
				setState(80);
				match(FI);
				}
				break;
			case 2:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(WHILE);
				setState(83);
				((WhileContext)_localctx).cond = expr(0);
				setState(84);
				match(LOOP);
				setState(85);
				((WhileContext)_localctx).body = expr(0);
				setState(86);
				match(POOL);
				}
				break;
			case 3:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LET);
				setState(89);
				localVariable();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					localVariable();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(IN);
				{
				setState(98);
				((LetContext)_localctx).body = expr(0);
				}
				}
				break;
			case 4:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(CASE);
				setState(101);
				((CaseContext)_localctx).toEvaluated = expr(0);
				setState(102);
				match(OF);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					caseBranch();
					setState(104);
					match(SEMI);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(110);
				match(ESAC);
				}
				break;
			case 5:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(LBRACE);
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					expr(0);
					setState(114);
					match(SEMI);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << NEG) | (1L << NOT) | (1L << ISVOID) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << LET) | (1L << NEW) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0) );
				setState(120);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new ImplicitDispatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				((ImplicitDispatchContext)_localctx).id = match(ID);
				setState(123);
				match(LPAREN);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					}
					break;
				case LPAREN:
				case LBRACE:
				case NEG:
				case NOT:
				case ISVOID:
				case IF:
				case WHILE:
				case CASE:
				case LET:
				case NEW:
				case INT:
				case BOOL:
				case STRING:
				case ID:
					{
					setState(125);
					((ImplicitDispatchContext)_localctx).expr = expr(0);
					((ImplicitDispatchContext)_localctx).args.add(((ImplicitDispatchContext)_localctx).expr);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(126);
						match(COMMA);
						setState(127);
						((ImplicitDispatchContext)_localctx).expr = expr(0);
						((ImplicitDispatchContext)_localctx).args.add(((ImplicitDispatchContext)_localctx).expr);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(LPAREN);
				setState(137);
				expr(0);
				setState(138);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				((NegContext)_localctx).operation = match(NEG);
				setState(141);
				((NegContext)_localctx).operand = expr(12);
				}
				break;
			case 9:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				((IsvoidContext)_localctx).operation = match(ISVOID);
				setState(143);
				((IsvoidContext)_localctx).operand = expr(11);
				}
				break;
			case 10:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				((NotContext)_localctx).operation = match(NOT);
				setState(145);
				((NotContext)_localctx).operand = expr(7);
				}
				break;
			case 11:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				((AssignContext)_localctx).leftOperand = match(ID);
				setState(147);
				((AssignContext)_localctx).operation = match(ASSIGN);
				setState(148);
				((AssignContext)_localctx).rightOperand = expr(6);
				}
				break;
			case 12:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(NEW);
				setState(150);
				((NewContext)_localctx).type = match(TYPE);
				}
				break;
			case 13:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(INT);
				}
				break;
			case 15:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).leftOperand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
						((MultDivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						((MultDivContext)_localctx).rightOperand = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusContext)_localctx).leftOperand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						((PlusMinusContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						((PlusMinusContext)_localctx).rightOperand = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						((CompareContext)_localctx).leftOperand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						((CompareContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0)) ) {
							((CompareContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						((CompareContext)_localctx).rightOperand = expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExplicitDispatchContext(new ExprContext(_parentctx, _parentState));
						((ExplicitDispatchContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(167);
							match(AT);
							setState(168);
							((ExplicitDispatchContext)_localctx).classContext = match(TYPE);
							}
						}

						setState(171);
						match(DOT);
						setState(172);
						((ExplicitDispatchContext)_localctx).id = match(ID);
						setState(173);
						match(LPAREN);
						setState(183);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case RPAREN:
							{
							}
							break;
						case LPAREN:
						case LBRACE:
						case NEG:
						case NOT:
						case ISVOID:
						case IF:
						case WHILE:
						case CASE:
						case LET:
						case NEW:
						case INT:
						case BOOL:
						case STRING:
						case ID:
							{
							setState(175);
							((ExplicitDispatchContext)_localctx).expr = expr(0);
							((ExplicitDispatchContext)_localctx).args.add(((ExplicitDispatchContext)_localctx).expr);
							setState(180);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(176);
								match(COMMA);
								setState(177);
								((ExplicitDispatchContext)_localctx).expr = expr(0);
								((ExplicitDispatchContext)_localctx).args.add(((ExplicitDispatchContext)_localctx).expr);
								}
								}
								setState(182);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(185);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class LocalVariableContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLocalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLocalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLocalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableContext localVariable() throws RecognitionException {
		LocalVariableContext _localctx = new LocalVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_localVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((LocalVariableContext)_localctx).id = match(ID);
			setState(192);
			match(COLON);
			setState(193);
			((LocalVariableContext)_localctx).type = match(TYPE);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(194);
				match(ASSIGN);
				setState(195);
				((LocalVariableContext)_localctx).value = expr(0);
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

	public static class CaseBranchContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public ExprContext body;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode CONNECTOR() { return getToken(CoolParser.CONNECTOR, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCaseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((CaseBranchContext)_localctx).id = match(ID);
			setState(199);
			match(COLON);
			setState(200);
			((CaseBranchContext)_localctx).type = match(TYPE);
			setState(201);
			match(CONNECTOR);
			setState(202);
			((CaseBranchContext)_localctx).body = expr(0);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00cf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6w\n\6\r\6\16\6x\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f"+
		"\6\16\6\u0086\13\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00b5\n\6\f\6\16\6\u00b8\13\6\5\6\u00ba\n\6\3\6\7\6\u00bd\n"+
		"\6\f\6\16\6\u00c0\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c7\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\5\3\2\16\17\3\2\f\r\4\2\20\20"+
		"\22\23\2\u00ea\2\23\3\2\2\2\4\31\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\n\u009d"+
		"\3\2\2\2\f\u00c1\3\2\2\2\16\u00c8\3\2\2\2\20\21\5\4\3\2\21\22\7\6\2\2"+
		"\22\24\3\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2"+
		"\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\7%\2\2\32\35\7.\2\2\33"+
		"\34\7&\2\2\34\36\7.\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37%"+
		"\7\t\2\2 !\5\6\4\2!\"\7\6\2\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\n\2\2)\5\3\2\2\2*+\7/\2\2+,\7\5"+
		"\2\2,/\7.\2\2-.\7\27\2\2.\60\5\n\6\2/-\3\2\2\2/\60\3\2\2\2\60F\3\2\2\2"+
		"\61\62\7/\2\2\62<\7\7\2\2\63=\3\2\2\2\649\5\b\5\2\65\66\7\4\2\2\668\5"+
		"\b\5\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2<\63\3\2\2\2<\64\3\2\2\2=>\3\2\2\2>?\7\b\2\2?@\7\5\2\2@A\7.\2\2AB\7"+
		"\t\2\2BC\5\n\6\2CD\7\n\2\2DF\3\2\2\2E*\3\2\2\2E\61\3\2\2\2F\7\3\2\2\2"+
		"GH\7/\2\2HI\7\5\2\2IJ\7.\2\2J\t\3\2\2\2KL\b\6\1\2LM\7\30\2\2MN\5\n\6\2"+
		"NO\7\31\2\2OP\5\n\6\2PQ\7\32\2\2QR\5\n\6\2RS\7\33\2\2S\u009e\3\2\2\2T"+
		"U\7\34\2\2UV\5\n\6\2VW\7\35\2\2WX\5\n\6\2XY\7\36\2\2Y\u009e\3\2\2\2Z["+
		"\7#\2\2[`\5\f\7\2\\]\7\4\2\2]_\5\f\7\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7$\2\2de\5\n\6\2e\u009e\3\2\2\2fg\7\37"+
		"\2\2gh\5\n\6\2hl\7 \2\2ij\5\16\b\2jk\7\6\2\2km\3\2\2\2li\3\2\2\2mn\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\"\2\2q\u009e\3\2\2\2rv\7\t\2\2"+
		"st\5\n\6\2tu\7\6\2\2uw\3\2\2\2vs\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"yz\3\2\2\2z{\7\n\2\2{\u009e\3\2\2\2|}\7/\2\2}\u0087\7\7\2\2~\u0088\3\2"+
		"\2\2\177\u0084\5\n\6\2\u0080\u0081\7\4\2\2\u0081\u0083\5\n\6\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087~\3\2\2\2\u0087\177\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u009e\7\b\2\2\u008a\u008b\7\7\2\2\u008b\u008c\5\n"+
		"\6\2\u008c\u008d\7\b\2\2\u008d\u009e\3\2\2\2\u008e\u008f\7\13\2\2\u008f"+
		"\u009e\5\n\6\16\u0090\u0091\7\24\2\2\u0091\u009e\5\n\6\r\u0092\u0093\7"+
		"\21\2\2\u0093\u009e\5\n\6\t\u0094\u0095\7/\2\2\u0095\u0096\7\27\2\2\u0096"+
		"\u009e\5\n\6\b\u0097\u0098\7\'\2\2\u0098\u009e\7.\2\2\u0099\u009e\7/\2"+
		"\2\u009a\u009e\7(\2\2\u009b\u009e\7-\2\2\u009c\u009e\7)\2\2\u009dK\3\2"+
		"\2\2\u009dT\3\2\2\2\u009dZ\3\2\2\2\u009df\3\2\2\2\u009dr\3\2\2\2\u009d"+
		"|\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0090\3\2\2\2"+
		"\u009d\u0092\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099"+
		"\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00be\3\2\2\2\u009f\u00a0\f\f\2\2\u00a0\u00a1\t\2\2\2\u00a1\u00bd\5\n"+
		"\6\r\u00a2\u00a3\f\13\2\2\u00a3\u00a4\t\3\2\2\u00a4\u00bd\5\n\6\f\u00a5"+
		"\u00a6\f\n\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00bd\5\n\6\13\u00a8\u00ab\f"+
		"\21\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ac\7.\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\7"+
		"/\2\2\u00af\u00b9\7\7\2\2\u00b0\u00ba\3\2\2\2\u00b1\u00b6\5\n\6\2\u00b2"+
		"\u00b3\7\4\2\2\u00b3\u00b5\5\n\6\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\7\b\2\2\u00bc\u009f\3\2\2\2\u00bc\u00a2\3\2\2\2\u00bc"+
		"\u00a5\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\13\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c6\7.\2\2\u00c4\u00c5\7\27\2\2\u00c5"+
		"\u00c7\5\n\6\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\r\3\2\2\2"+
		"\u00c8\u00c9\7/\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\7.\2\2\u00cb\u00cc"+
		"\7!\2\2\u00cc\u00cd\5\n\6\2\u00cd\17\3\2\2\2\25\25\35%/9<E`nx\u0084\u0087"+
		"\u009d\u00ab\u00b6\u00b9\u00bc\u00be\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}