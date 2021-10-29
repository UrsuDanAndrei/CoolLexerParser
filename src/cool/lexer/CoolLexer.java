// Generated from /home/dan/workspace/cpl/cpl_teme/cpl_tema1/Tema1/src/cool/lexer/CoolLexer.g4 by ANTLR 4.9.1

    package cool.lexer;
    // TODO you might have to import the string builder here

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
		ERROR=1, COMMA=2, COLON=3, SEMI=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		TILDE=9, PLUS=10, MINUS=11, MULT=12, DIV=13, EQUAL=14, NOT=15, LT=16, 
		LE=17, ISVOID=18, DOT=19, AT=20, ASSIGN=21, IF=22, THEN=23, ELSE=24, FI=25, 
		WHILE=26, LOOP=27, POOL=28, CASE=29, OF=30, CONNECTOR=31, ESAC=32, LET=33, 
		IN=34, CLASS=35, INHERITS=36, NEW=37, INT=38, BOOL=39, STRING_UNTERMINATED=40, 
		STRING_WITH_NULL=41, STRING_WITH_EOF=42, STRING=43, TYPE=44, SELF=45, 
		SELF_TYPE=46, ID=47, LINE_COMMENT=48, BLOCK_COMMENT_END_WITHOUT_START=49, 
		BLOCK_COMMENT_WITH_EOF=50, BLOCK_COMMENT=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "UPPER_LETTER", "LOWER_LETTER", "DIGITS", "NEW_LINE", "ANY_BUT_STAR_RPAREN", 
			"A", "C", "D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", "T", 
			"U", "V", "W", "Y", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "TILDE", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", 
			"LE", "ISVOID", "DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", 
			"LOOP", "POOL", "CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", 
			"INHERITS", "NEW", "INT", "BOOL", "STRING_UNTERMINATED", "STRING_WITH_NULL", 
			"STRING_WITH_EOF", "STRING", "TYPE", "SELF", "SELF_TYPE", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT_END_WITHOUT_START", "BLOCK_COMMENT_WITH_EOF", "BLOCK_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'~'", "'+'", 
			"'-'", "'*'", "'/'", "'=='", "'not'", "'<'", "'<='", null, "'.'", "'@'", 
			"'<-'", null, null, null, null, null, null, null, null, null, "'=>'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'self'", "'SELF_TYPE'", null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "TILDE", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", 
			"LE", "ISVOID", "DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", 
			"LOOP", "POOL", "CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", 
			"INHERITS", "NEW", "INT", "BOOL", "STRING_UNTERMINATED", "STRING_WITH_NULL", 
			"STRING_WITH_EOF", "STRING", "TYPE", "SELF", "SELF_TYPE", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT_END_WITHOUT_START", "BLOCK_COMMENT_WITH_EOF", "BLOCK_COMMENT", 
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
		case 62:
			STRING_UNTERMINATED_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			STRING_WITH_NULL_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			STRING_WITH_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			BLOCK_COMMENT_END_WITHOUT_START_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			BLOCK_COMMENT_WITH_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_UNTERMINATED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    raiseError("Unterminated string constant");

			break;
		}
	}
	private void STRING_WITH_NULL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    raiseError("String contains null character");

			break;
		}
	}
	private void STRING_WITH_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    raiseError("EOF in string constant");

			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    String text = getText();
			    var newText = new StringBuilder();

			    // trim the surrounding ""
			    text = text.substring(1, text.length() - 1);

			    int i = 0;
			    int j = text.indexOf('\\');

			    while (j != -1) {
			        char notEscapedChar = text.charAt(j + 1);
			        char escapedChar = switch (notEscapedChar) {
			            case 'n' -> '\n';
			            case 'b' -> '\b';
			            case 't' -> '\t';
			            case 'f' -> '\f';
			            default -> notEscapedChar; // case '\\' is treated here
			        };

			        newText.append(text, i, j);
			        newText.append(escapedChar);

			        i = j + 2;
			        j = text.indexOf('\\', i);
			    }

			    newText.append(text, i, text.length());

			    if (newText.length() <= 1024) {
			        setText(newText.toString());
			    } else {
			        raiseError("String constant too long");
			    }

			break;
		}
	}
	private void BLOCK_COMMENT_END_WITHOUT_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    raiseError("Unmatched *)");

			break;
		}
	}
	private void BLOCK_COMMENT_WITH_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    raiseError("EOF in comment");

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\u00a1\n\5\r\5\16"+
		"\5\u00a2\3\6\5\6\u00a6\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\3"+
		"9\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3>\6>\u0150\n>\r>\16>\u0151\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u015f"+
		"\n?\3@\3@\3@\3@\3@\3@\7@\u0167\n@\f@\16@\u016a\13@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3A\7A\u0175\nA\fA\16A\u0178\13A\3A\3A\7A\u017c\nA\fA\16A\u017f\13"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3B\7B\u018a\nB\fB\16B\u018d\13B\3B\3B\3B\3C"+
		"\3C\3C\3C\3C\3C\7C\u0198\nC\fC\16C\u019b\13C\3C\3C\3C\3D\3D\3D\3D\3D\7"+
		"D\u01a5\nD\fD\16D\u01a8\13D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3G\3G\3G\3G\3G\7G\u01be\nG\fG\16G\u01c1\13G\3H\3H\3H\3H\7H\u01c7\n"+
		"H\fH\16H\u01ca\13H\3H\3H\5H\u01ce\nH\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J"+
		"\3J\7J\u01dc\nJ\fJ\16J\u01df\13J\3J\5J\u01e2\nJ\3J\3J\3J\3K\3K\3K\3K\3"+
		"K\7K\u01ec\nK\fK\16K\u01ef\13K\3K\3K\3K\3K\3K\3L\6L\u01f7\nL\rL\16L\u01f8"+
		"\3L\3L\t\u0168\u0176\u017d\u018b\u0199\u01c8\u01ed\2M\3\2\5\2\7\2\t\2"+
		"\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2"+
		"+\2-\2/\2\61\2\63\4\65\5\67\69\7;\b=\t?\nA\13C\fE\rG\16I\17K\20M\21O\22"+
		"Q\23S\24U\25W\26Y\27[\30]\31_\32a\33c\34e\35g\36i\37k m!o\"q#s$u%w&y\'"+
		"{(})\177*\u0081+\u0083,\u0085-\u0087.\u0089/\u008b\60\u008d\61\u008f\62"+
		"\u0091\63\u0093\64\u0095\65\u0097\66\3\2\34\3\2\62;\3\2C\\\3\2c|\3\2+"+
		"+\3\2,,\4\2CCcc\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2KKkk\4\2NN"+
		"nn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2[[{{\3\2$$\4\2\f\f$$\5\2\13\f\16\17\"\"\2\u0205\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2"+
		"\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u00a0\3\2\2\2\13\u00a5\3\2\2\2\r"+
		"\u00ac\3\2\2\2\17\u00ae\3\2\2\2\21\u00b0\3\2\2\2\23\u00b2\3\2\2\2\25\u00b4"+
		"\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3"+
		"\2\2\2\37\u00be\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2%\u00c4\3\2\2\2\'"+
		"\u00c6\3\2\2\2)\u00c8\3\2\2\2+\u00ca\3\2\2\2-\u00cc\3\2\2\2/\u00ce\3\2"+
		"\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67\u00d6\3\2\2"+
		"\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00e0"+
		"\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I\u00e8\3\2\2\2K"+
		"\u00ea\3\2\2\2M\u00ed\3\2\2\2O\u00f1\3\2\2\2Q\u00f3\3\2\2\2S\u00f6\3\2"+
		"\2\2U\u00fd\3\2\2\2W\u00ff\3\2\2\2Y\u0101\3\2\2\2[\u0104\3\2\2\2]\u0107"+
		"\3\2\2\2_\u010c\3\2\2\2a\u0111\3\2\2\2c\u0114\3\2\2\2e\u011a\3\2\2\2g"+
		"\u011f\3\2\2\2i\u0124\3\2\2\2k\u0129\3\2\2\2m\u012c\3\2\2\2o\u012f\3\2"+
		"\2\2q\u0134\3\2\2\2s\u0138\3\2\2\2u\u013b\3\2\2\2w\u0141\3\2\2\2y\u014a"+
		"\3\2\2\2{\u014f\3\2\2\2}\u015e\3\2\2\2\177\u0160\3\2\2\2\u0081\u016e\3"+
		"\2\2\2\u0083\u0183\3\2\2\2\u0085\u0191\3\2\2\2\u0087\u019f\3\2\2\2\u0089"+
		"\u01a9\3\2\2\2\u008b\u01ae\3\2\2\2\u008d\u01b8\3\2\2\2\u008f\u01c2\3\2"+
		"\2\2\u0091\u01d1\3\2\2\2\u0093\u01d6\3\2\2\2\u0095\u01e6\3\2\2\2\u0097"+
		"\u01f6\3\2\2\2\u0099\u009a\t\2\2\2\u009a\4\3\2\2\2\u009b\u009c\t\3\2\2"+
		"\u009c\6\3\2\2\2\u009d\u009e\t\4\2\2\u009e\b\3\2\2\2\u009f\u00a1\5\3\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\n\3\2\2\2\u00a4\u00a6\7\17\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8\f\3\2\2\2"+
		"\u00a9\u00aa\7,\2\2\u00aa\u00ad\n\5\2\2\u00ab\u00ad\n\6\2\2\u00ac\u00a9"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\16\3\2\2\2\u00ae\u00af\t\7\2\2\u00af"+
		"\20\3\2\2\2\u00b0\u00b1\t\b\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\t\t\2\2\u00b3"+
		"\24\3\2\2\2\u00b4\u00b5\t\n\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\t\13\2\2"+
		"\u00b7\30\3\2\2\2\u00b8\u00b9\t\f\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\t\r"+
		"\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\t\16\2\2\u00bd\36\3\2\2\2\u00be\u00bf"+
		"\t\17\2\2\u00bf \3\2\2\2\u00c0\u00c1\t\20\2\2\u00c1\"\3\2\2\2\u00c2\u00c3"+
		"\t\21\2\2\u00c3$\3\2\2\2\u00c4\u00c5\t\22\2\2\u00c5&\3\2\2\2\u00c6\u00c7"+
		"\t\23\2\2\u00c7(\3\2\2\2\u00c8\u00c9\t\24\2\2\u00c9*\3\2\2\2\u00ca\u00cb"+
		"\t\25\2\2\u00cb,\3\2\2\2\u00cc\u00cd\t\26\2\2\u00cd.\3\2\2\2\u00ce\u00cf"+
		"\t\27\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\t\30\2\2\u00d1\62\3\2\2\2\u00d2"+
		"\u00d3\7.\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5\66\3\2\2\2\u00d6"+
		"\u00d7\7=\2\2\u00d78\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7+\2\2\u00db<\3\2\2\2\u00dc\u00dd\7}\2\2\u00dd>\3\2\2\2\u00de\u00df\7"+
		"\177\2\2\u00df@\3\2\2\2\u00e0\u00e1\7\u0080\2\2\u00e1B\3\2\2\2\u00e2\u00e3"+
		"\7-\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7"+
		",\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7"+
		"?\2\2\u00eb\u00ec\7?\2\2\u00ecL\3\2\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef\u00f0\7v\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2P\3"+
		"\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7?\2\2\u00f5R\3\2\2\2\u00f6\u00f7"+
		"\5\33\16\2\u00f7\u00f8\5\'\24\2\u00f8\u00f9\5-\27\2\u00f9\u00fa\5!\21"+
		"\2\u00fa\u00fb\5\33\16\2\u00fb\u00fc\5\23\n\2\u00fcT\3\2\2\2\u00fd\u00fe"+
		"\7\60\2\2\u00feV\3\2\2\2\u00ff\u0100\7B\2\2\u0100X\3\2\2\2\u0101\u0102"+
		"\7>\2\2\u0102\u0103\7/\2\2\u0103Z\3\2\2\2\u0104\u0105\5\33\16\2\u0105"+
		"\u0106\5\27\f\2\u0106\\\3\2\2\2\u0107\u0108\5)\25\2\u0108\u0109\5\31\r"+
		"\2\u0109\u010a\5\25\13\2\u010a\u010b\5\37\20\2\u010b^\3\2\2\2\u010c\u010d"+
		"\5\25\13\2\u010d\u010e\5\35\17\2\u010e\u010f\5\'\24\2\u010f\u0110\5\25"+
		"\13\2\u0110`\3\2\2\2\u0111\u0112\5\27\f\2\u0112\u0113\5\33\16\2\u0113"+
		"b\3\2\2\2\u0114\u0115\5/\30\2\u0115\u0116\5\31\r\2\u0116\u0117\5\33\16"+
		"\2\u0117\u0118\5\35\17\2\u0118\u0119\5\25\13\2\u0119d\3\2\2\2\u011a\u011b"+
		"\5\35\17\2\u011b\u011c\5!\21\2\u011c\u011d\5!\21\2\u011d\u011e\5#\22\2"+
		"\u011ef\3\2\2\2\u011f\u0120\5#\22\2\u0120\u0121\5!\21\2\u0121\u0122\5"+
		"!\21\2\u0122\u0123\5\35\17\2\u0123h\3\2\2\2\u0124\u0125\5\21\t\2\u0125"+
		"\u0126\5\17\b\2\u0126\u0127\5\'\24\2\u0127\u0128\5\25\13\2\u0128j\3\2"+
		"\2\2\u0129\u012a\5!\21\2\u012a\u012b\5\27\f\2\u012bl\3\2\2\2\u012c\u012d"+
		"\7?\2\2\u012d\u012e\7@\2\2\u012en\3\2\2\2\u012f\u0130\5\25\13\2\u0130"+
		"\u0131\5\'\24\2\u0131\u0132\5\17\b\2\u0132\u0133\5\21\t\2\u0133p\3\2\2"+
		"\2\u0134\u0135\5\35\17\2\u0135\u0136\5\25\13\2\u0136\u0137\5)\25\2\u0137"+
		"r\3\2\2\2\u0138\u0139\5\33\16\2\u0139\u013a\5\37\20\2\u013at\3\2\2\2\u013b"+
		"\u013c\5\21\t\2\u013c\u013d\5\35\17\2\u013d\u013e\5\17\b\2\u013e\u013f"+
		"\5\'\24\2\u013f\u0140\5\'\24\2\u0140v\3\2\2\2\u0141\u0142\5\33\16\2\u0142"+
		"\u0143\5\37\20\2\u0143\u0144\5\31\r\2\u0144\u0145\5\25\13\2\u0145\u0146"+
		"\5%\23\2\u0146\u0147\5\33\16\2\u0147\u0148\5)\25\2\u0148\u0149\5\'\24"+
		"\2\u0149x\3\2\2\2\u014a\u014b\5\37\20\2\u014b\u014c\5\25\13\2\u014c\u014d"+
		"\5/\30\2\u014dz\3\2\2\2\u014e\u0150\5\3\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152|\3\2\2\2"+
		"\u0153\u0154\7v\2\2\u0154\u0155\5%\23\2\u0155\u0156\5+\26\2\u0156\u0157"+
		"\5\25\13\2\u0157\u015f\3\2\2\2\u0158\u0159\7h\2\2\u0159\u015a\5\17\b\2"+
		"\u015a\u015b\5\35\17\2\u015b\u015c\5\'\24\2\u015c\u015d\5\25\13\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0153\3\2\2\2\u015e\u0158\3\2\2\2\u015f~\3\2\2\2"+
		"\u0160\u0168\7$\2\2\u0161\u0162\7^\2\2\u0162\u0167\7^\2\2\u0163\u0164"+
		"\7^\2\2\u0164\u0167\7$\2\2\u0165\u0167\n\31\2\2\u0166\u0161\3\2\2\2\u0166"+
		"\u0163\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7\f\2\2\u016c\u016d\b@\2\2\u016d\u0080\3\2\2\2\u016e\u0176\7$\2"+
		"\2\u016f\u0170\7^\2\2\u0170\u0175\7^\2\2\u0171\u0172\7^\2\2\u0172\u0175"+
		"\7$\2\2\u0173\u0175\n\32\2\2\u0174\u016f\3\2\2\2\u0174\u0171\3\2\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017d\7\2\2\2\u017a"+
		"\u017c\13\2\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\7$\2\2\u0181\u0182\bA\3\2\u0182\u0082\3\2\2\2\u0183\u018b\7$\2"+
		"\2\u0184\u0185\7^\2\2\u0185\u018a\7^\2\2\u0186\u0187\7^\2\2\u0187\u018a"+
		"\7$\2\2\u0188\u018a\n\32\2\2\u0189\u0184\3\2\2\2\u0189\u0186\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\2\2\3\u018f"+
		"\u0190\bB\4\2\u0190\u0084\3\2\2\2\u0191\u0199\7$\2\2\u0192\u0193\7^\2"+
		"\2\u0193\u0198\7^\2\2\u0194\u0195\7^\2\2\u0195\u0198\7$\2\2\u0196\u0198"+
		"\n\32\2\2\u0197\u0192\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0196\3\2\2\2"+
		"\u0198\u019b\3\2\2\2\u0199\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7$\2\2\u019d\u019e\bC\5\2\u019e"+
		"\u0086\3\2\2\2\u019f\u01a6\5\5\3\2\u01a0\u01a5\5\5\3\2\u01a1\u01a5\5\7"+
		"\4\2\u01a2\u01a5\5\3\2\2\u01a3\u01a5\7a\2\2\u01a4\u01a0\3\2\2\2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u0088\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7u\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7n\2"+
		"\2\u01ac\u01ad\7h\2\2\u01ad\u008a\3\2\2\2\u01ae\u01af\7U\2\2\u01af\u01b0"+
		"\7G\2\2\u01b0\u01b1\7N\2\2\u01b1\u01b2\7H\2\2\u01b2\u01b3\7a\2\2\u01b3"+
		"\u01b4\7V\2\2\u01b4\u01b5\7[\2\2\u01b5\u01b6\7R\2\2\u01b6\u01b7\7G\2\2"+
		"\u01b7\u008c\3\2\2\2\u01b8\u01bf\5\7\4\2\u01b9\u01be\5\5\3\2\u01ba\u01be"+
		"\5\7\4\2\u01bb\u01be\5\3\2\2\u01bc\u01be\7a\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u008e\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c3\7/\2\2\u01c3\u01c4\7/\2\2\u01c4\u01c8\3\2\2"+
		"\2\u01c5\u01c7\13\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cd\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01ce\5\13\6\2\u01cc\u01ce\7\2\2\3\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bH\6\2\u01d0\u0090\3\2"+
		"\2\2\u01d1\u01d2\7,\2\2\u01d2\u01d3\7+\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\bI\7\2\u01d5\u0092\3\2\2\2\u01d6\u01d7\7*\2\2\u01d7\u01d8\7,\2\2\u01d8"+
		"\u01dd\3\2\2\2\u01d9\u01dc\5\u0095K\2\u01da\u01dc\5\r\7\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e2\7,"+
		"\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\7\2\2\3\u01e4\u01e5\bJ\b\2\u01e5\u0094\3\2\2\2\u01e6\u01e7\7*\2"+
		"\2\u01e7\u01e8\7,\2\2\u01e8\u01ed\3\2\2\2\u01e9\u01ec\5\u0095K\2\u01ea"+
		"\u01ec\13\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3"+
		"\2\2\2\u01ed\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\7,\2\2\u01f1\u01f2\7+\2\2\u01f2\u01f3\3\2\2"+
		"\2\u01f3\u01f4\bK\6\2\u01f4\u0096\3\2\2\2\u01f5\u01f7\t\33\2\2\u01f6\u01f5"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\bL\6\2\u01fb\u0098\3\2\2\2\35\2\u00a2\u00a5"+
		"\u00ac\u0151\u015e\u0166\u0168\u0174\u0176\u017d\u0189\u018b\u0197\u0199"+
		"\u01a4\u01a6\u01bd\u01bf\u01c8\u01cd\u01db\u01dd\u01e1\u01eb\u01ed\u01f8"+
		"\t\3@\2\3A\3\3B\4\3C\5\b\2\2\3I\6\3J\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}