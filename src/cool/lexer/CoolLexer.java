// Generated from /home/dan/workspace/cpl/cpl_teme/cpl_tema1/Tema1/src/cool/lexer/CoolLexer.g4 by ANTLR 4.9.1

    package cool.lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, SEMI=2, COMMA=3, LPAREN=4, RPAREN=5, LBRACE=6, RBRACE=7, TILDE=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, EQUAL=13, NOT=14, LT=15, LE=16, ISVOID=17, 
		DOT=18, AT=19, ASSIGN=20, IF=21, THEN=22, ELSE=23, FI=24, WHILE=25, LOOP=26, 
		POOL=27, CASE=28, OF=29, CONNECTOR=30, ESAC=31, LET=32, IN=33, CLASS=34, 
		INHERITS=35, NEW=36, INT=37, BOOL=38, STRING=39, TYPE=40, SELF=41, SELF_TYPE=42, 
		ID=43, LINE_COMMENT=44, BLOCK_COMMENT=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "UPPER_LETTER", "LOWER_LETTER", "DIGITS", "NEW_LINE", "A", "C", 
			"D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", "T", "U", "V", 
			"W", "Y", "SEMI", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "TILDE", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", "LE", "ISVOID", 
			"DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", "POOL", 
			"CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", "INHERITS", 
			"NEW", "INT", "BOOL", "STRING", "TYPE", "SELF", "SELF_TYPE", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "'('", "')'", "'{'", "'}'", "'~'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'not'", "'<'", "'<='", null, "'.'", "'@'", "'<-'", 
			null, null, null, null, null, null, null, null, null, "'=>'", null, null, 
			null, null, null, null, null, null, null, null, "'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "SEMI", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"TILDE", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", "LE", 
			"ISVOID", "DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", 
			"LOOP", "POOL", "CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", 
			"INHERITS", "NEW", "INT", "BOOL", "STRING", "TYPE", "SELF", "SELF_TYPE", 
			"ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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

	    
	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 60:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:



			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u019f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\6\5\u0093\n\5\r\5\16\5\u0094\3\6\5\6\u0098\n\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3<\6<\u013b\n<\r<\16<\u013c\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5"+
		"=\u014a\n=\3>\3>\3>\3>\7>\u0150\n>\f>\16>\u0153\13>\3>\3>\3>\3?\3?\3?"+
		"\3?\3?\7?\u015d\n?\f?\16?\u0160\13?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\7B\u0176\nB\fB\16B\u0179\13B\3C\3C\3C\3C\7C"+
		"\u017f\nC\fC\16C\u0182\13C\3C\3C\5C\u0186\nC\3C\3C\3D\3D\3D\3D\3D\7D\u018f"+
		"\nD\fD\16D\u0192\13D\3D\3D\3D\3D\3D\3E\6E\u019a\nE\rE\16E\u019b\3E\3E"+
		"\5\u0151\u0180\u0190\2F\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\4\63\5\65\6\67\79\b"+
		";\t=\n?\13A\fC\rE\16G\17I\20K\21M\22O\23Q\24S\25U\26W\27Y\30[\31]\32_"+
		"\33a\34c\35e\36g\37i k!m\"o#q$s%u&w\'y({)}*\177+\u0081,\u0083-\u0085."+
		"\u0087/\u0089\60\3\2\30\3\2\62;\3\2C\\\3\2c|\4\2CCcc\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2[[{{\5\2\13\f\16\17\"\"\2"+
		"\u019a\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u008f\3\2\2\2\t\u0092\3\2\2\2\13\u0097\3\2\2\2\r\u009b\3\2"+
		"\2\2\17\u009d\3\2\2\2\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2"+
		"\2\27\u00a5\3\2\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2"+
		"\37\u00ad\3\2\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d1\3\2\2\2E\u00d3\3\2\2\2G\u00d5\3\2\2\2I\u00d8\3\2\2\2K\u00dc\3\2"+
		"\2\2M\u00de\3\2\2\2O\u00e1\3\2\2\2Q\u00e8\3\2\2\2S\u00ea\3\2\2\2U\u00ec"+
		"\3\2\2\2W\u00ef\3\2\2\2Y\u00f2\3\2\2\2[\u00f7\3\2\2\2]\u00fc\3\2\2\2_"+
		"\u00ff\3\2\2\2a\u0105\3\2\2\2c\u010a\3\2\2\2e\u010f\3\2\2\2g\u0114\3\2"+
		"\2\2i\u0117\3\2\2\2k\u011a\3\2\2\2m\u011f\3\2\2\2o\u0123\3\2\2\2q\u0126"+
		"\3\2\2\2s\u012c\3\2\2\2u\u0135\3\2\2\2w\u013a\3\2\2\2y\u0149\3\2\2\2{"+
		"\u014b\3\2\2\2}\u0157\3\2\2\2\177\u0161\3\2\2\2\u0081\u0166\3\2\2\2\u0083"+
		"\u0170\3\2\2\2\u0085\u017a\3\2\2\2\u0087\u0189\3\2\2\2\u0089\u0199\3\2"+
		"\2\2\u008b\u008c\t\2\2\2\u008c\4\3\2\2\2\u008d\u008e\t\3\2\2\u008e\6\3"+
		"\2\2\2\u008f\u0090\t\4\2\2\u0090\b\3\2\2\2\u0091\u0093\5\3\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\n\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\7\f\2\2\u009a\f\3\2\2\2\u009b\u009c"+
		"\t\5\2\2\u009c\16\3\2\2\2\u009d\u009e\t\6\2\2\u009e\20\3\2\2\2\u009f\u00a0"+
		"\t\7\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\t\b\2\2\u00a2\24\3\2\2\2\u00a3\u00a4"+
		"\t\t\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\t\n\2\2\u00a6\30\3\2\2\2\u00a7\u00a8"+
		"\t\13\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\t\f\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\t\r\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\t\16\2\2\u00ae \3\2\2\2\u00af"+
		"\u00b0\t\17\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\t\20\2\2\u00b2$\3\2\2\2\u00b3"+
		"\u00b4\t\21\2\2\u00b4&\3\2\2\2\u00b5\u00b6\t\22\2\2\u00b6(\3\2\2\2\u00b7"+
		"\u00b8\t\23\2\2\u00b8*\3\2\2\2\u00b9\u00ba\t\24\2\2\u00ba,\3\2\2\2\u00bb"+
		"\u00bc\t\25\2\2\u00bc.\3\2\2\2\u00bd\u00be\t\26\2\2\u00be\60\3\2\2\2\u00bf"+
		"\u00c0\7=\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7.\2\2\u00c2\64\3\2\2\2\u00c3"+
		"\u00c4\7*\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7+\2\2\u00c68\3\2\2\2\u00c7"+
		"\u00c8\7}\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7\177\2\2\u00ca<\3\2\2\2\u00cb"+
		"\u00cc\7\u0080\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce@\3\2\2\2\u00cf"+
		"\u00d0\7/\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2D\3\2\2\2\u00d3\u00d4"+
		"\7\61\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7H"+
		"\3\2\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7v\2\2\u00db"+
		"J\3\2\2\2\u00dc\u00dd\7>\2\2\u00ddL\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0N\3\2\2\2\u00e1\u00e2\5\31\r\2\u00e2\u00e3\5%\23\2\u00e3"+
		"\u00e4\5+\26\2\u00e4\u00e5\5\37\20\2\u00e5\u00e6\5\31\r\2\u00e6\u00e7"+
		"\5\21\t\2\u00e7P\3\2\2\2\u00e8\u00e9\7\60\2\2\u00e9R\3\2\2\2\u00ea\u00eb"+
		"\7B\2\2\u00ebT\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7/\2\2\u00eeV\3"+
		"\2\2\2\u00ef\u00f0\5\31\r\2\u00f0\u00f1\5\25\13\2\u00f1X\3\2\2\2\u00f2"+
		"\u00f3\5\'\24\2\u00f3\u00f4\5\27\f\2\u00f4\u00f5\5\23\n\2\u00f5\u00f6"+
		"\5\35\17\2\u00f6Z\3\2\2\2\u00f7\u00f8\5\23\n\2\u00f8\u00f9\5\33\16\2\u00f9"+
		"\u00fa\5%\23\2\u00fa\u00fb\5\23\n\2\u00fb\\\3\2\2\2\u00fc\u00fd\5\25\13"+
		"\2\u00fd\u00fe\5\31\r\2\u00fe^\3\2\2\2\u00ff\u0100\5-\27\2\u0100\u0101"+
		"\5\27\f\2\u0101\u0102\5\31\r\2\u0102\u0103\5\33\16\2\u0103\u0104\5\23"+
		"\n\2\u0104`\3\2\2\2\u0105\u0106\5\33\16\2\u0106\u0107\5\37\20\2\u0107"+
		"\u0108\5\37\20\2\u0108\u0109\5!\21\2\u0109b\3\2\2\2\u010a\u010b\5!\21"+
		"\2\u010b\u010c\5\37\20\2\u010c\u010d\5\37\20\2\u010d\u010e\5\33\16\2\u010e"+
		"d\3\2\2\2\u010f\u0110\5\17\b\2\u0110\u0111\5\r\7\2\u0111\u0112\5%\23\2"+
		"\u0112\u0113\5\23\n\2\u0113f\3\2\2\2\u0114\u0115\5\37\20\2\u0115\u0116"+
		"\5\25\13\2\u0116h\3\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7@\2\2\u0119"+
		"j\3\2\2\2\u011a\u011b\5\23\n\2\u011b\u011c\5%\23\2\u011c\u011d\5\r\7\2"+
		"\u011d\u011e\5\17\b\2\u011el\3\2\2\2\u011f\u0120\5\33\16\2\u0120\u0121"+
		"\5\23\n\2\u0121\u0122\5\'\24\2\u0122n\3\2\2\2\u0123\u0124\5\31\r\2\u0124"+
		"\u0125\5\35\17\2\u0125p\3\2\2\2\u0126\u0127\5\17\b\2\u0127\u0128\5\33"+
		"\16\2\u0128\u0129\5\r\7\2\u0129\u012a\5%\23\2\u012a\u012b\5%\23\2\u012b"+
		"r\3\2\2\2\u012c\u012d\5\31\r\2\u012d\u012e\5\35\17\2\u012e\u012f\5\27"+
		"\f\2\u012f\u0130\5\23\n\2\u0130\u0131\5#\22\2\u0131\u0132\5\31\r\2\u0132"+
		"\u0133\5\'\24\2\u0133\u0134\5%\23\2\u0134t\3\2\2\2\u0135\u0136\5\35\17"+
		"\2\u0136\u0137\5\23\n\2\u0137\u0138\5-\27\2\u0138v\3\2\2\2\u0139\u013b"+
		"\5\3\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013dx\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\5#\22\2\u0140"+
		"\u0141\5)\25\2\u0141\u0142\5\23\n\2\u0142\u014a\3\2\2\2\u0143\u0144\7"+
		"h\2\2\u0144\u0145\5\r\7\2\u0145\u0146\5\33\16\2\u0146\u0147\5%\23\2\u0147"+
		"\u0148\5\23\n\2\u0148\u014a\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0143\3"+
		"\2\2\2\u014az\3\2\2\2\u014b\u0151\7$\2\2\u014c\u014d\7^\2\2\u014d\u0150"+
		"\7$\2\2\u014e\u0150\13\2\2\2\u014f\u014c\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0156\b>\2\2\u0156|"+
		"\3\2\2\2\u0157\u015e\5\5\3\2\u0158\u015d\5\5\3\2\u0159\u015d\5\7\4\2\u015a"+
		"\u015d\5\3\2\2\u015b\u015d\7a\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f~\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\u0162\7u\2\2\u0162\u0163\7g\2\2\u0163\u0164\7n\2\2\u0164\u0165"+
		"\7h\2\2\u0165\u0080\3\2\2\2\u0166\u0167\7U\2\2\u0167\u0168\7G\2\2\u0168"+
		"\u0169\7N\2\2\u0169\u016a\7H\2\2\u016a\u016b\7a\2\2\u016b\u016c\7V\2\2"+
		"\u016c\u016d\7[\2\2\u016d\u016e\7R\2\2\u016e\u016f\7G\2\2\u016f\u0082"+
		"\3\2\2\2\u0170\u0177\5\7\4\2\u0171\u0176\5\5\3\2\u0172\u0176\5\7\4\2\u0173"+
		"\u0176\5\3\2\2\u0174\u0176\7a\2\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0084\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u017a\u017b\7/\2\2\u017b\u017c\7/\2\2\u017c\u0180\3\2\2\2\u017d\u017f"+
		"\13\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0180\u017e\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0186"+
		"\5\13\6\2\u0184\u0186\7\2\2\3\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0188\bC\3\2\u0188\u0086\3\2\2\2\u0189\u018a"+
		"\7*\2\2\u018a\u018b\7,\2\2\u018b\u0190\3\2\2\2\u018c\u018f\5\u0087D\2"+
		"\u018d\u018f\13\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7,\2\2\u0194\u0195\7+\2\2\u0195\u0196\3\2\2"+
		"\2\u0196\u0197\bD\3\2\u0197\u0088\3\2\2\2\u0198\u019a\t\27\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\bE\3\2\u019e\u008a\3\2\2\2\22\2\u0094\u0097"+
		"\u013c\u0149\u014f\u0151\u015c\u015e\u0175\u0177\u0180\u0185\u018e\u0190"+
		"\u019b\4\3>\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}