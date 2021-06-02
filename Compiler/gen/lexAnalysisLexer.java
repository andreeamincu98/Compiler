// Generated from /Users/ioanamoflic/compilerrepo/Compiler/src/lexAnalysis.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexAnalysisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TEXT_TYPE=2, TINY=3, SIGNED_TINY=4, HUGE=5, SIGNED_HUGE=6, DOUBLE=7, 
		SIGNED_DOUBLE=8, EXPONENTIAL=9, SIGNED_EXPONENTIAL=10, BREAK=11, WHILE=12, 
		IF=13, ELSE=14, FOR=15, SWITCH=16, CASE=17, DEFAULT=18, DO=19, MAIN=20, 
		INSTRUCTION=21, BOOLEAN=22, TRUE=23, FALSE=24, METHOD_NAME=25, DATATYPE=26, 
		VAR=27, WORD=28, NOT_NULL_DIGIT=29, DIGIT=30, SIGN=31, CHAR=32, PLUS=33, 
		MINUS=34, LOWERCASE=35, UPPERCASE=36, NEWLINE=37, WS=38, COMMENT=39, CONST=40, 
		LET=41, COMMA=42, SEMI_COLON=43, COLON=44, MULT=45, DIV=46, MOD=47, LEFT_PAR=48, 
		RIGHT_PAR=49, LEFT_BR=50, RIGHT_BR=51, ASSIGN=52, NOT=53, AND=54, REF=55, 
		OR=56, GREATER_THAN=57, GREATER_EQUAL=58, LOWER_THAN=59, LOWER_EQUAL=60, 
		EQUAL=61, DIFFERENT=62, INCR=63, DECR=64, ADD_TO=65, SUB_FROM=66, MULT_BY=67, 
		DIV_BY=68, POW=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TEXT_TYPE", "TINY", "SIGNED_TINY", "HUGE", "SIGNED_HUGE", "DOUBLE", 
			"SIGNED_DOUBLE", "EXPONENTIAL", "SIGNED_EXPONENTIAL", "BREAK", "WHILE", 
			"IF", "ELSE", "FOR", "SWITCH", "CASE", "DEFAULT", "DO", "MAIN", "INSTRUCTION", 
			"BOOLEAN", "TRUE", "FALSE", "METHOD_NAME", "DATATYPE", "VAR", "WORD", 
			"NOT_NULL_DIGIT", "DIGIT", "SIGN", "CHAR", "PLUS", "MINUS", "LOWERCASE", 
			"UPPERCASE", "NEWLINE", "WS", "COMMENT", "CONST", "LET", "COMMA", "SEMI_COLON", 
			"COLON", "MULT", "DIV", "MOD", "LEFT_PAR", "RIGHT_PAR", "LEFT_BR", "RIGHT_BR", 
			"ASSIGN", "NOT", "AND", "REF", "OR", "GREATER_THAN", "GREATER_EQUAL", 
			"LOWER_THAN", "LOWER_EQUAL", "EQUAL", "DIFFERENT", "INCR", "DECR", "ADD_TO", 
			"SUB_FROM", "MULT_BY", "DIV_BY", "POW"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", null, null, null, null, null, null, null, null, null, "'break;'", 
			"'while'", "'if'", "'else'", "'for'", "'switch'", "'case'", "'default'", 
			"'do'", "'main'", null, null, "'true'", "'false'", null, null, null, 
			null, null, null, null, null, "'+'", "'-'", null, null, null, null, null, 
			"'const'", "'let'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'{'", "'}'", "'='", "'!'", "'&&'", "'&'", "'||'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", "'++'", "'--'", "'+='", "'-='", "'*='", 
			"'/='", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TEXT_TYPE", "TINY", "SIGNED_TINY", "HUGE", "SIGNED_HUGE", 
			"DOUBLE", "SIGNED_DOUBLE", "EXPONENTIAL", "SIGNED_EXPONENTIAL", "BREAK", 
			"WHILE", "IF", "ELSE", "FOR", "SWITCH", "CASE", "DEFAULT", "DO", "MAIN", 
			"INSTRUCTION", "BOOLEAN", "TRUE", "FALSE", "METHOD_NAME", "DATATYPE", 
			"VAR", "WORD", "NOT_NULL_DIGIT", "DIGIT", "SIGN", "CHAR", "PLUS", "MINUS", 
			"LOWERCASE", "UPPERCASE", "NEWLINE", "WS", "COMMENT", "CONST", "LET", 
			"COMMA", "SEMI_COLON", "COLON", "MULT", "DIV", "MOD", "LEFT_PAR", "RIGHT_PAR", 
			"LEFT_BR", "RIGHT_BR", "ASSIGN", "NOT", "AND", "REF", "OR", "GREATER_THAN", 
			"GREATER_EQUAL", "LOWER_THAN", "LOWER_EQUAL", "EQUAL", "DIFFERENT", "INCR", 
			"DECR", "ADD_TO", "SUB_FROM", "MULT_BY", "DIV_BY", "POW"
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


	public lexAnalysisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexAnalysis.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u009a\n\3\f\3\16\3\u009d\13\3\3\3"+
		"\3\3\3\4\3\4\5\4\u00a3\n\4\3\4\5\4\u00a6\n\4\3\4\5\4\u00a9\n\4\3\4\5\4"+
		"\u00ac\n\4\3\4\5\4\u00af\n\4\3\4\5\4\u00b2\n\4\3\4\5\4\u00b5\n\4\3\4\5"+
		"\4\u00b8\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u00c1\n\6\r\6\16\6\u00c2"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b\u00cc\n\b\r\b\16\b\u00cd\3\b\3\b\6\b"+
		"\u00d2\n\b\r\b\16\b\u00d3\3\b\3\b\3\b\6\b\u00d9\n\b\r\b\16\b\u00da\5\b"+
		"\u00dd\n\b\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u00e5\n\n\r\n\16\n\u00e6\3\n\3"+
		"\n\6\n\u00eb\n\n\r\n\16\n\u00ec\5\n\u00ef\n\n\3\n\3\n\3\n\7\n\u00f4\n"+
		"\n\f\n\16\n\u00f7\13\n\3\n\3\n\3\n\6\n\u00fc\n\n\r\n\16\n\u00fd\5\n\u0100"+
		"\n\n\3\n\3\n\3\n\7\n\u0105\n\n\f\n\16\n\u0108\13\n\5\n\u010a\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0150\n\26\3\27\3\27"+
		"\5\27\u0154\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016d"+
		"\n\32\3\33\3\33\5\33\u0171\n\33\3\34\3\34\5\34\u0175\n\34\3\34\3\34\3"+
		"\34\7\34\u017a\n\34\f\34\16\34\u017d\13\34\3\35\6\35\u0180\n\35\r\35\16"+
		"\35\u0181\3\36\3\36\3\37\3\37\3 \3 \5 \u018a\n \3!\3!\5!\u018e\n!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u0199\n&\r&\16&\u019a\3&\3&\3\'\6\'\u01a0"+
		"\n\'\r\'\16\'\u01a1\3\'\3\'\3(\3(\3(\3(\3(\6(\u01ab\n(\r(\16(\u01ac\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3"+
		"?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\2"+
		"\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\3\2"+
		"\r\5\2##%%BB\4\2&(,,\7\2\"\"..\60\60??aa\3\2\60\60\4\2GGgg\4\2--//\3\2"+
		"\63;\3\2\62;\3\2c|\3\2C\\\5\2\13\13\17\17\"\"\2\u0233\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2"+
		"\2\7\u00a0\3\2\2\2\t\u00b9\3\2\2\2\13\u00be\3\2\2\2\r\u00c4\3\2\2\2\17"+
		"\u00dc\3\2\2\2\21\u00de\3\2\2\2\23\u0109\3\2\2\2\25\u010b\3\2\2\2\27\u0110"+
		"\3\2\2\2\31\u0117\3\2\2\2\33\u011d\3\2\2\2\35\u0120\3\2\2\2\37\u0125\3"+
		"\2\2\2!\u0129\3\2\2\2#\u0130\3\2\2\2%\u0135\3\2\2\2\'\u013d\3\2\2\2)\u0140"+
		"\3\2\2\2+\u014f\3\2\2\2-\u0153\3\2\2\2/\u0155\3\2\2\2\61\u015a\3\2\2\2"+
		"\63\u0160\3\2\2\2\65\u0170\3\2\2\2\67\u0174\3\2\2\29\u017f\3\2\2\2;\u0183"+
		"\3\2\2\2=\u0185\3\2\2\2?\u0189\3\2\2\2A\u018d\3\2\2\2C\u018f\3\2\2\2E"+
		"\u0191\3\2\2\2G\u0193\3\2\2\2I\u0195\3\2\2\2K\u0198\3\2\2\2M\u019f\3\2"+
		"\2\2O\u01a5\3\2\2\2Q\u01b0\3\2\2\2S\u01b6\3\2\2\2U\u01ba\3\2\2\2W\u01bc"+
		"\3\2\2\2Y\u01be\3\2\2\2[\u01c0\3\2\2\2]\u01c2\3\2\2\2_\u01c4\3\2\2\2a"+
		"\u01c6\3\2\2\2c\u01c8\3\2\2\2e\u01ca\3\2\2\2g\u01cc\3\2\2\2i\u01ce\3\2"+
		"\2\2k\u01d0\3\2\2\2m\u01d2\3\2\2\2o\u01d5\3\2\2\2q\u01d7\3\2\2\2s\u01da"+
		"\3\2\2\2u\u01dc\3\2\2\2w\u01df\3\2\2\2y\u01e1\3\2\2\2{\u01e4\3\2\2\2}"+
		"\u01e7\3\2\2\2\177\u01ea\3\2\2\2\u0081\u01ed\3\2\2\2\u0083\u01f0\3\2\2"+
		"\2\u0085\u01f3\3\2\2\2\u0087\u01f6\3\2\2\2\u0089\u01f9\3\2\2\2\u008b\u01fc"+
		"\3\2\2\2\u008d\u008e\7\62\2\2\u008e\4\3\2\2\2\u008f\u009b\7$\2\2\u0090"+
		"\u009a\59\35\2\u0091\u009a\5A!\2\u0092\u009a\5\7\4\2\u0093\u009a\t\2\2"+
		"\2\u0094\u009a\5? \2\u0095\u009a\t\3\2\2\u0096\u009a\5a\61\2\u0097\u009a"+
		"\5c\62\2\u0098\u009a\t\4\2\2\u0099\u0090\3\2\2\2\u0099\u0091\3\2\2\2\u0099"+
		"\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7$\2\2\u009f\6\3\2\2\2\u00a0\u00a2"+
		"\5;\36\2\u00a1\u00a3\5=\37\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5=\37\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5=\37\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5=\37\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5=\37\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5="+
		"\37\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b5\5=\37\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b8\5=\37\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\b\3\2\2\2\u00b9\u00ba\5a\61\2\u00ba\u00bb\5E#\2\u00bb\u00bc\5\7\4\2\u00bc"+
		"\u00bd\5c\62\2\u00bd\n\3\2\2\2\u00be\u00c0\5;\36\2\u00bf\u00c1\5=\37\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\5a\61\2\u00c5\u00c6\5E#\2\u00c6\u00c7"+
		"\5\13\6\2\u00c7\u00c8\5c\62\2\u00c8\16\3\2\2\2\u00c9\u00cb\5;\36\2\u00ca"+
		"\u00cc\5=\37\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\t\5\2\2\u00d0"+
		"\u00d2\5=\37\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00dd\3\2\2\2\u00d5\u00d6\5=\37\2\u00d6"+
		"\u00d8\t\5\2\2\u00d7\u00d9\5=\37\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00c9\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd\20\3\2\2\2\u00de\u00df\5a\61"+
		"\2\u00df\u00e0\5E#\2\u00e0\u00e1\5\17\b\2\u00e1\u00e2\5c\62\2\u00e2\22"+
		"\3\2\2\2\u00e3\u00e5\5;\36\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ee\3\2\2\2\u00e8\u00ea\t\5"+
		"\2\2\u00e9\u00eb\5=\37\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\t\6\2\2\u00f1"+
		"\u00f5\t\7\2\2\u00f2\u00f4\5=\37\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u010a\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00ff\5=\37\2\u00f9\u00fb\t\5\2\2\u00fa\u00fc\5="+
		"\37\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\t\6\2\2\u0102\u0106\t\7\2\2\u0103"+
		"\u0105\5=\37\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u00e4\3\2\2\2\u0109\u00f8\3\2\2\2\u010a\24\3\2\2\2\u010b\u010c\5a\61"+
		"\2\u010c\u010d\5E#\2\u010d\u010e\5\23\n\2\u010e\u010f\5c\62\2\u010f\26"+
		"\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7m\2\2\u0115\u0116\7=\2\2\u0116\30\3\2\2\2\u0117"+
		"\u0118\7y\2\2\u0118\u0119\7j\2\2\u0119\u011a\7k\2\2\u011a\u011b\7n\2\2"+
		"\u011b\u011c\7g\2\2\u011c\32\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7"+
		"h\2\2\u011f\34\3\2\2\2\u0120\u0121\7g\2\2\u0121\u0122\7n\2\2\u0122\u0123"+
		"\7u\2\2\u0123\u0124\7g\2\2\u0124\36\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127"+
		"\7q\2\2\u0127\u0128\7t\2\2\u0128 \3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b"+
		"\7y\2\2\u012b\u012c\7k\2\2\u012c\u012d\7v\2\2\u012d\u012e\7e\2\2\u012e"+
		"\u012f\7j\2\2\u012f\"\3\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134$\3\2\2\2\u0135\u0136\7f\2\2\u0136"+
		"\u0137\7g\2\2\u0137\u0138\7h\2\2\u0138\u0139\7c\2\2\u0139\u013a\7w\2\2"+
		"\u013a\u013b\7n\2\2\u013b\u013c\7v\2\2\u013c&\3\2\2\2\u013d\u013e\7f\2"+
		"\2\u013e\u013f\7q\2\2\u013f(\3\2\2\2\u0140\u0141\7o\2\2\u0141\u0142\7"+
		"c\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144*\3\2\2\2\u0145\u0150"+
		"\5\27\f\2\u0146\u0150\5\31\r\2\u0147\u0150\5\33\16\2\u0148\u0150\5\35"+
		"\17\2\u0149\u0150\5\37\20\2\u014a\u0150\5!\21\2\u014b\u0150\5#\22\2\u014c"+
		"\u0150\5%\23\2\u014d\u0150\5\'\24\2\u014e\u0150\5)\25\2\u014f\u0145\3"+
		"\2\2\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u014f"+
		"\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150,\3\2\2\2\u0151\u0154"+
		"\5/\30\2\u0152\u0154\5\61\31\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2"+
		"\u0154.\3\2\2\2\u0155\u0156\7v\2\2\u0156\u0157\7t\2\2\u0157\u0158\7w\2"+
		"\2\u0158\u0159\7g\2\2\u0159\60\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c"+
		"\7c\2\2\u015c\u015d\7n\2\2\u015d\u015e\7u\2\2\u015e\u015f\7g\2\2\u015f"+
		"\62\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7w\2\2\u0162\u0163\7p\2\2\u0163"+
		"\u0164\7e\2\2\u0164\u0165\7v\2\2\u0165\u0166\7k\2\2\u0166\u0167\7q\2\2"+
		"\u0167\u0168\7p\2\2\u0168\u0169\7\"\2\2\u0169\u016c\3\2\2\2\u016a\u016d"+
		"\59\35\2\u016b\u016d\5A!\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\64\3\2\2\2\u016e\u0171\5S*\2\u016f\u0171\5Q)\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\66\3\2\2\2\u0172\u0175\5A!\2\u0173\u0175\59\35\2"+
		"\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u017b\3\2\2\2\u0176\u017a"+
		"\5\7\4\2\u0177\u017a\5A!\2\u0178\u017a\59\35\2\u0179\u0176\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c8\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180"+
		"\5A!\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182:\3\2\2\2\u0183\u0184\t\b\2\2\u0184<\3\2\2\2\u0185"+
		"\u0186\t\t\2\2\u0186>\3\2\2\2\u0187\u018a\5C\"\2\u0188\u018a\5E#\2\u0189"+
		"\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a@\3\2\2\2\u018b\u018e\5G$\2\u018c"+
		"\u018e\5I%\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eB\3\2\2\2\u018f"+
		"\u0190\7-\2\2\u0190D\3\2\2\2\u0191\u0192\7/\2\2\u0192F\3\2\2\2\u0193\u0194"+
		"\t\n\2\2\u0194H\3\2\2\2\u0195\u0196\t\13\2\2\u0196J\3\2\2\2\u0197\u0199"+
		"\7\f\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b&\2\2\u019dL\3\2\2\2\u019e"+
		"\u01a0\t\f\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\'\2\2\u01a4"+
		"N\3\2\2\2\u01a5\u01a6\7%\2\2\u01a6\u01a7\7%\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01ab\59\35\2\u01a9\u01ab\5M\'\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\b(\2\2\u01afP\3\2\2\2\u01b0\u01b1\7e\2\2\u01b1"+
		"\u01b2\7q\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7v\2\2"+
		"\u01b5R\3\2\2\2\u01b6\u01b7\7n\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7v\2"+
		"\2\u01b9T\3\2\2\2\u01ba\u01bb\7.\2\2\u01bbV\3\2\2\2\u01bc\u01bd\7=\2\2"+
		"\u01bdX\3\2\2\2\u01be\u01bf\7<\2\2\u01bfZ\3\2\2\2\u01c0\u01c1\7,\2\2\u01c1"+
		"\\\3\2\2\2\u01c2\u01c3\7\61\2\2\u01c3^\3\2\2\2\u01c4\u01c5\7\'\2\2\u01c5"+
		"`\3\2\2\2\u01c6\u01c7\7*\2\2\u01c7b\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9d"+
		"\3\2\2\2\u01ca\u01cb\7}\2\2\u01cbf\3\2\2\2\u01cc\u01cd\7\177\2\2\u01cd"+
		"h\3\2\2\2\u01ce\u01cf\7?\2\2\u01cfj\3\2\2\2\u01d0\u01d1\7#\2\2\u01d1l"+
		"\3\2\2\2\u01d2\u01d3\7(\2\2\u01d3\u01d4\7(\2\2\u01d4n\3\2\2\2\u01d5\u01d6"+
		"\7(\2\2\u01d6p\3\2\2\2\u01d7\u01d8\7~\2\2\u01d8\u01d9\7~\2\2\u01d9r\3"+
		"\2\2\2\u01da\u01db\7@\2\2\u01dbt\3\2\2\2\u01dc\u01dd\7@\2\2\u01dd\u01de"+
		"\7?\2\2\u01dev\3\2\2\2\u01df\u01e0\7>\2\2\u01e0x\3\2\2\2\u01e1\u01e2\7"+
		">\2\2\u01e2\u01e3\7?\2\2\u01e3z\3\2\2\2\u01e4\u01e5\7?\2\2\u01e5\u01e6"+
		"\7?\2\2\u01e6|\3\2\2\2\u01e7\u01e8\7#\2\2\u01e8\u01e9\7?\2\2\u01e9~\3"+
		"\2\2\2\u01ea\u01eb\7-\2\2\u01eb\u01ec\7-\2\2\u01ec\u0080\3\2\2\2\u01ed"+
		"\u01ee\7/\2\2\u01ee\u01ef\7/\2\2\u01ef\u0082\3\2\2\2\u01f0\u01f1\7-\2"+
		"\2\u01f1\u01f2\7?\2\2\u01f2\u0084\3\2\2\2\u01f3\u01f4\7/\2\2\u01f4\u01f5"+
		"\7?\2\2\u01f5\u0086\3\2\2\2\u01f6\u01f7\7,\2\2\u01f7\u01f8\7?\2\2\u01f8"+
		"\u0088\3\2\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fb\7?\2\2\u01fb\u008a\3\2"+
		"\2\2\u01fc\u01fd\7,\2\2\u01fd\u01fe\7,\2\2\u01fe\u008c\3\2\2\2(\2\u0099"+
		"\u009b\u00a2\u00a5\u00a8\u00ab\u00ae\u00b1\u00b4\u00b7\u00c2\u00cd\u00d3"+
		"\u00da\u00dc\u00e6\u00ec\u00ee\u00f5\u00fd\u00ff\u0106\u0109\u014f\u0153"+
		"\u016c\u0170\u0174\u0179\u017b\u0181\u0189\u018d\u019a\u01a1\u01aa\u01ac"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}