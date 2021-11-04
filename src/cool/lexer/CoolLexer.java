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
		ERROR=1, COMMA=2, COLON=3, SEMI=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		NEG=9, PLUS=10, MINUS=11, MULT=12, DIV=13, EQUAL=14, NOT=15, LT=16, LE=17, 
		ISVOID=18, DOT=19, AT=20, ASSIGN=21, IF=22, THEN=23, ELSE=24, FI=25, WHILE=26, 
		LOOP=27, POOL=28, CASE=29, OF=30, CONNECTOR=31, ESAC=32, LET=33, IN=34, 
		CLASS=35, INHERITS=36, NEW=37, INT=38, BOOL=39, STRING_UNTERMINATED=40, 
		STRING_WITH_NULL=41, STRING_WITH_EOF=42, STRING=43, TYPE=44, ID=45, LINE_COMMENT=46, 
		BLOCK_COMMENT_END_WITHOUT_START=47, BLOCK_COMMENT_WITH_EOF=48, BLOCK_COMMENT=49, 
		WS=50, INVALID_CHAR=51;
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
			"RBRACE", "NEG", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NOT", "LT", 
			"LE", "ISVOID", "DOT", "AT", "ASSIGN", "IF", "THEN", "ELSE", "FI", "WHILE", 
			"LOOP", "POOL", "CASE", "OF", "CONNECTOR", "ESAC", "LET", "IN", "CLASS", 
			"INHERITS", "NEW", "INT", "BOOL", "STRING_UNTERMINATED", "STRING_WITH_NULL", 
			"STRING_WITH_EOF", "STRING", "TYPE", "ID", "LINE_COMMENT", "BLOCK_COMMENT_END_WITHOUT_START", 
			"BLOCK_COMMENT_WITH_EOF", "BLOCK_COMMENT", "WS", "INVALID_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "':'", "';'", "'('", "')'", "'{'", "'}'", "'~'", "'+'", 
			"'-'", "'*'", "'/'", "'=='", "'not'", "'<'", "'<='", null, "'.'", "'@'", 
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
		case 69:
			BLOCK_COMMENT_END_WITHOUT_START_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			BLOCK_COMMENT_WITH_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			INVALID_CHAR_action((RuleContext)_localctx, actionIndex);
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
	private void INVALID_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    raiseError("Invalid character: " + getText());

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01ee\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\u009f\n\5\r\5\16\5\u00a0"+
		"\3\6\5\6\u00a4\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u00ab\n\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3("+
		"\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39"+
		"\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3>\6>\u014e\n>\r>\16>\u014f\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u015d"+
		"\n?\3@\3@\3@\3@\3@\3@\7@\u0165\n@\f@\16@\u0168\13@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3A\7A\u0173\nA\fA\16A\u0176\13A\3A\3A\7A\u017a\nA\fA\16A\u017d\13"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3B\7B\u0188\nB\fB\16B\u018b\13B\3B\3B\3B\3C"+
		"\3C\3C\3C\3C\3C\7C\u0196\nC\fC\16C\u0199\13C\3C\3C\3C\3D\3D\3D\3D\3D\7"+
		"D\u01a3\nD\fD\16D\u01a6\13D\3E\3E\3E\3E\3E\7E\u01ad\nE\fE\16E\u01b0\13"+
		"E\3F\3F\3F\3F\7F\u01b6\nF\fF\16F\u01b9\13F\3F\3F\5F\u01bd\nF\3F\3F\3G"+
		"\3G\3G\3G\3G\3H\3H\3H\3H\3H\7H\u01cb\nH\fH\16H\u01ce\13H\3H\5H\u01d1\n"+
		"H\3H\3H\3H\3I\3I\3I\3I\3I\7I\u01db\nI\fI\16I\u01de\13I\3I\3I\3I\3I\3I"+
		"\3J\6J\u01e6\nJ\rJ\16J\u01e7\3J\3J\3K\3K\3K\t\u0166\u0174\u017b\u0189"+
		"\u0197\u01b7\u01dc\2L\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\4\65\5\67\69\7"+
		";\b=\t?\nA\13C\fE\rG\16I\17K\20M\21O\22Q\23S\24U\25W\26Y\27[\30]\31_\32"+
		"a\33c\34e\35g\36i\37k m!o\"q#s$u%w&y\'{(})\177*\u0081+\u0083,\u0085-\u0087"+
		".\u0089/\u008b\60\u008d\61\u008f\62\u0091\63\u0093\64\u0095\65\3\2\35"+
		"\3\2\62;\3\2C\\\3\2c|\3\2++\3\2,,\4\2CCcc\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2[[{{\3\2$$\4\2\f\f$$\5\2\13\f\16\17"+
		"\"\"\7\2##%(AA``~~\2\u01f7\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2\2\t\u009e\3\2\2"+
		"\2\13\u00a3\3\2\2\2\r\u00aa\3\2\2\2\17\u00ac\3\2\2\2\21\u00ae\3\2\2\2"+
		"\23\u00b0\3\2\2\2\25\u00b2\3\2\2\2\27\u00b4\3\2\2\2\31\u00b6\3\2\2\2\33"+
		"\u00b8\3\2\2\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0"+
		"\3\2\2\2%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2"+
		"-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2"+
		"?\u00dc\3\2\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3"+
		"\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00ef\3\2\2\2Q\u00f1"+
		"\3\2\2\2S\u00f4\3\2\2\2U\u00fb\3\2\2\2W\u00fd\3\2\2\2Y\u00ff\3\2\2\2["+
		"\u0102\3\2\2\2]\u0105\3\2\2\2_\u010a\3\2\2\2a\u010f\3\2\2\2c\u0112\3\2"+
		"\2\2e\u0118\3\2\2\2g\u011d\3\2\2\2i\u0122\3\2\2\2k\u0127\3\2\2\2m\u012a"+
		"\3\2\2\2o\u012d\3\2\2\2q\u0132\3\2\2\2s\u0136\3\2\2\2u\u0139\3\2\2\2w"+
		"\u013f\3\2\2\2y\u0148\3\2\2\2{\u014d\3\2\2\2}\u015c\3\2\2\2\177\u015e"+
		"\3\2\2\2\u0081\u016c\3\2\2\2\u0083\u0181\3\2\2\2\u0085\u018f\3\2\2\2\u0087"+
		"\u019d\3\2\2\2\u0089\u01a7\3\2\2\2\u008b\u01b1\3\2\2\2\u008d\u01c0\3\2"+
		"\2\2\u008f\u01c5\3\2\2\2\u0091\u01d5\3\2\2\2\u0093\u01e5\3\2\2\2\u0095"+
		"\u01eb\3\2\2\2\u0097\u0098\t\2\2\2\u0098\4\3\2\2\2\u0099\u009a\t\3\2\2"+
		"\u009a\6\3\2\2\2\u009b\u009c\t\4\2\2\u009c\b\3\2\2\2\u009d\u009f\5\3\2"+
		"\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\n\3\2\2\2\u00a2\u00a4\7\17\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\f\3\2\2\2"+
		"\u00a7\u00a8\7,\2\2\u00a8\u00ab\n\5\2\2\u00a9\u00ab\n\6\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00ad\t\7\2\2\u00ad"+
		"\20\3\2\2\2\u00ae\u00af\t\b\2\2\u00af\22\3\2\2\2\u00b0\u00b1\t\t\2\2\u00b1"+
		"\24\3\2\2\2\u00b2\u00b3\t\n\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\t\13\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\t\f\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\t\r"+
		"\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\t\16\2\2\u00bb\36\3\2\2\2\u00bc\u00bd"+
		"\t\17\2\2\u00bd \3\2\2\2\u00be\u00bf\t\20\2\2\u00bf\"\3\2\2\2\u00c0\u00c1"+
		"\t\21\2\2\u00c1$\3\2\2\2\u00c2\u00c3\t\22\2\2\u00c3&\3\2\2\2\u00c4\u00c5"+
		"\t\23\2\2\u00c5(\3\2\2\2\u00c6\u00c7\t\24\2\2\u00c7*\3\2\2\2\u00c8\u00c9"+
		"\t\25\2\2\u00c9,\3\2\2\2\u00ca\u00cb\t\26\2\2\u00cb.\3\2\2\2\u00cc\u00cd"+
		"\t\27\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\t\30\2\2\u00cf\62\3\2\2\2\u00d0"+
		"\u00d1\7.\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\66\3\2\2\2\u00d4"+
		"\u00d5\7=\2\2\u00d58\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7:\3\2\2\2\u00d8\u00d9"+
		"\7+\2\2\u00d9<\3\2\2\2\u00da\u00db\7}\2\2\u00db>\3\2\2\2\u00dc\u00dd\7"+
		"\177\2\2\u00dd@\3\2\2\2\u00de\u00df\7\u0080\2\2\u00dfB\3\2\2\2\u00e0\u00e1"+
		"\7-\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7"+
		",\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7"+
		"?\2\2\u00e9\u00ea\7?\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed"+
		"\7q\2\2\u00ed\u00ee\7v\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0P\3"+
		"\2\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3R\3\2\2\2\u00f4\u00f5"+
		"\5\33\16\2\u00f5\u00f6\5\'\24\2\u00f6\u00f7\5-\27\2\u00f7\u00f8\5!\21"+
		"\2\u00f8\u00f9\5\33\16\2\u00f9\u00fa\5\23\n\2\u00faT\3\2\2\2\u00fb\u00fc"+
		"\7\60\2\2\u00fcV\3\2\2\2\u00fd\u00fe\7B\2\2\u00feX\3\2\2\2\u00ff\u0100"+
		"\7>\2\2\u0100\u0101\7/\2\2\u0101Z\3\2\2\2\u0102\u0103\5\33\16\2\u0103"+
		"\u0104\5\27\f\2\u0104\\\3\2\2\2\u0105\u0106\5)\25\2\u0106\u0107\5\31\r"+
		"\2\u0107\u0108\5\25\13\2\u0108\u0109\5\37\20\2\u0109^\3\2\2\2\u010a\u010b"+
		"\5\25\13\2\u010b\u010c\5\35\17\2\u010c\u010d\5\'\24\2\u010d\u010e\5\25"+
		"\13\2\u010e`\3\2\2\2\u010f\u0110\5\27\f\2\u0110\u0111\5\33\16\2\u0111"+
		"b\3\2\2\2\u0112\u0113\5/\30\2\u0113\u0114\5\31\r\2\u0114\u0115\5\33\16"+
		"\2\u0115\u0116\5\35\17\2\u0116\u0117\5\25\13\2\u0117d\3\2\2\2\u0118\u0119"+
		"\5\35\17\2\u0119\u011a\5!\21\2\u011a\u011b\5!\21\2\u011b\u011c\5#\22\2"+
		"\u011cf\3\2\2\2\u011d\u011e\5#\22\2\u011e\u011f\5!\21\2\u011f\u0120\5"+
		"!\21\2\u0120\u0121\5\35\17\2\u0121h\3\2\2\2\u0122\u0123\5\21\t\2\u0123"+
		"\u0124\5\17\b\2\u0124\u0125\5\'\24\2\u0125\u0126\5\25\13\2\u0126j\3\2"+
		"\2\2\u0127\u0128\5!\21\2\u0128\u0129\5\27\f\2\u0129l\3\2\2\2\u012a\u012b"+
		"\7?\2\2\u012b\u012c\7@\2\2\u012cn\3\2\2\2\u012d\u012e\5\25\13\2\u012e"+
		"\u012f\5\'\24\2\u012f\u0130\5\17\b\2\u0130\u0131\5\21\t\2\u0131p\3\2\2"+
		"\2\u0132\u0133\5\35\17\2\u0133\u0134\5\25\13\2\u0134\u0135\5)\25\2\u0135"+
		"r\3\2\2\2\u0136\u0137\5\33\16\2\u0137\u0138\5\37\20\2\u0138t\3\2\2\2\u0139"+
		"\u013a\5\21\t\2\u013a\u013b\5\35\17\2\u013b\u013c\5\17\b\2\u013c\u013d"+
		"\5\'\24\2\u013d\u013e\5\'\24\2\u013ev\3\2\2\2\u013f\u0140\5\33\16\2\u0140"+
		"\u0141\5\37\20\2\u0141\u0142\5\31\r\2\u0142\u0143\5\25\13\2\u0143\u0144"+
		"\5%\23\2\u0144\u0145\5\33\16\2\u0145\u0146\5)\25\2\u0146\u0147\5\'\24"+
		"\2\u0147x\3\2\2\2\u0148\u0149\5\37\20\2\u0149\u014a\5\25\13\2\u014a\u014b"+
		"\5/\30\2\u014bz\3\2\2\2\u014c\u014e\5\3\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150|\3\2\2\2"+
		"\u0151\u0152\7v\2\2\u0152\u0153\5%\23\2\u0153\u0154\5+\26\2\u0154\u0155"+
		"\5\25\13\2\u0155\u015d\3\2\2\2\u0156\u0157\7h\2\2\u0157\u0158\5\17\b\2"+
		"\u0158\u0159\5\35\17\2\u0159\u015a\5\'\24\2\u015a\u015b\5\25\13\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0156\3\2\2\2\u015d~\3\2\2\2"+
		"\u015e\u0166\7$\2\2\u015f\u0160\7^\2\2\u0160\u0165\7^\2\2\u0161\u0162"+
		"\7^\2\2\u0162\u0165\7$\2\2\u0163\u0165\n\31\2\2\u0164\u015f\3\2\2\2\u0164"+
		"\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7\f\2\2\u016a\u016b\b@\2\2\u016b\u0080\3\2\2\2\u016c\u0174\7$\2"+
		"\2\u016d\u016e\7^\2\2\u016e\u0173\7^\2\2\u016f\u0170\7^\2\2\u0170\u0173"+
		"\7$\2\2\u0171\u0173\n\32\2\2\u0172\u016d\3\2\2\2\u0172\u016f\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0175\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017b\7\2\2\2\u0178"+
		"\u017a\13\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u017c\3"+
		"\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\7$\2\2\u017f\u0180\bA\3\2\u0180\u0082\3\2\2\2\u0181\u0189\7$\2"+
		"\2\u0182\u0183\7^\2\2\u0183\u0188\7^\2\2\u0184\u0185\7^\2\2\u0185\u0188"+
		"\7$\2\2\u0186\u0188\n\32\2\2\u0187\u0182\3\2\2\2\u0187\u0184\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\2\2\3\u018d"+
		"\u018e\bB\4\2\u018e\u0084\3\2\2\2\u018f\u0197\7$\2\2\u0190\u0191\7^\2"+
		"\2\u0191\u0196\7^\2\2\u0192\u0193\7^\2\2\u0193\u0196\7$\2\2\u0194\u0196"+
		"\n\32\2\2\u0195\u0190\3\2\2\2\u0195\u0192\3\2\2\2\u0195\u0194\3\2\2\2"+
		"\u0196\u0199\3\2\2\2\u0197\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7$\2\2\u019b\u019c\bC\5\2\u019c"+
		"\u0086\3\2\2\2\u019d\u01a4\5\5\3\2\u019e\u01a3\5\5\3\2\u019f\u01a3\5\7"+
		"\4\2\u01a0\u01a3\5\3\2\2\u01a1\u01a3\7a\2\2\u01a2\u019e\3\2\2\2\u01a2"+
		"\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u0088\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01ae\5\7\4\2\u01a8\u01ad\5\5\3\2\u01a9\u01ad\5\7"+
		"\4\2\u01aa\u01ad\5\3\2\2\u01ab\u01ad\7a\2\2\u01ac\u01a8\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u008a\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b2\7/\2\2\u01b2\u01b3\7/\2\2\u01b3\u01b7\3\2\2"+
		"\2\u01b4\u01b6\13\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bc\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bd\5\13\6\2\u01bb\u01bd\7\2\2\3\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\bF\6\2\u01bf\u008c\3\2"+
		"\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2\7+\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4"+
		"\bG\7\2\u01c4\u008e\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6\u01c7\7,\2\2\u01c7"+
		"\u01cc\3\2\2\2\u01c8\u01cb\5\u0091I\2\u01c9\u01cb\5\r\7\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7,"+
		"\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\7\2\2\3\u01d3\u01d4\bH\b\2\u01d4\u0090\3\2\2\2\u01d5\u01d6\7*\2"+
		"\2\u01d6\u01d7\7,\2\2\u01d7\u01dc\3\2\2\2\u01d8\u01db\5\u0091I\2\u01d9"+
		"\u01db\13\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e0\7,\2\2\u01e0\u01e1\7+\2\2\u01e1\u01e2\3\2\2"+
		"\2\u01e2\u01e3\bI\6\2\u01e3\u0092\3\2\2\2\u01e4\u01e6\t\33\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\bJ\6\2\u01ea\u0094\3\2\2\2\u01eb\u01ec\t\34"+
		"\2\2\u01ec\u01ed\bK\t\2\u01ed\u0096\3\2\2\2\35\2\u00a0\u00a3\u00aa\u014f"+
		"\u015c\u0164\u0166\u0172\u0174\u017b\u0187\u0189\u0195\u0197\u01a2\u01a4"+
		"\u01ac\u01ae\u01b7\u01bc\u01ca\u01cc\u01d0\u01da\u01dc\u01e7\n\3@\2\3"+
		"A\3\3B\4\3C\5\b\2\2\3G\6\3H\7\3K\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}