// Generated from /Users/Jian/Downloads/暑期学习/Hyper-Service-Language-master/src/HSlang.g4 by ANTLR 4.7

package edu.cwru.rise.hslang.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HSlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, IDENTIFIER=20, KEYWORD=21, BINARY_OP=22, INT_LIT=23, 
		FLOAT_LIT=24, IMAGINARY_LIT=25, RUNE_LIT=26, LITTLE_U_VALUE=27, BIG_U_VALUE=28, 
		STRING_LIT=29, WS=30, COMMENT=31, TERMINATOR=32, LINE_COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "IDENTIFIER", "KEYWORD", "BINARY_OP", "REL_OP", "ADD_OP", 
			"MUL_OP", "UNARY_OP", "INT_LIT", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", 
			"FLOAT_LIT", "DECIMALS", "EXPONENT", "IMAGINARY_LIT", "RUNE_LIT", "UNICODE_VALUE", 
			"BYTE_VALUE", "OCTAL_BYTE_VALUE", "HEX_BYTE_VALUE", "LITTLE_U_VALUE", 
			"BIG_U_VALUE", "ESCAPED_CHAR", "STRING_LIT", "RAW_STRING_LIT", "INTERPRETED_STRING_LIT", 
			"LETTER", "DECIMAL_DIGIT", "OCTAL_DIGIT", "HEX_DIGIT", "NEWLINE", "UNICODE_CHAR", 
			"UNICODE_DIGIT", "UNICODE_LETTER", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'('", "')'", "'account'", "'='", "'::'", "'contract'", 
			"'op'", "'payment'", "'from'", "'to'", "'call'", "'.'", "'using'", "','", 
			"'dep:'", "'before'", "'after'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IDENTIFIER", "KEYWORD", 
			"BINARY_OP", "INT_LIT", "FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", 
			"BIG_U_VALUE", "STRING_LIT", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
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


	    // The most recently produced token.
	    private Token lastToken = null;
	    /**
	     * Return the next token from the character stream and records this last
	     * token in case it resides on the default channel. This recorded token
	     * is used to determine when the lexer could possibly match a regex
	     * literal.
	     *
	     * @return the next token from the character stream.
	     */
	    @Override
	    public Token nextToken() {
	        // Get the next token.
	        Token next = super.nextToken();
	        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	            // Keep track of the last token on the default channel.
	            this.lastToken = next;
	        }

	        return next;
	    }


	public HSlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HSlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0242\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u00d0\n\25\f\25\16\25\u00d3\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0156\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u015f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u016b"+
		"\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0177\n\32"+
		"\3\33\3\33\3\33\5\33\u017c\n\33\3\34\3\34\3\34\5\34\u0181\n\34\3\35\3"+
		"\35\7\35\u0185\n\35\f\35\16\35\u0188\13\35\3\36\3\36\7\36\u018c\n\36\f"+
		"\36\16\36\u018f\13\36\3\37\3\37\3\37\6\37\u0194\n\37\r\37\16\37\u0195"+
		"\3 \3 \3 \5 \u019b\n \3 \5 \u019e\n \3 \3 \3 \3 \3 \3 \5 \u01a6\n \5 "+
		"\u01a8\n \3!\6!\u01ab\n!\r!\16!\u01ac\3\"\3\"\5\"\u01b1\n\"\3\"\3\"\3"+
		"#\3#\5#\u01b7\n#\3#\3#\3$\3$\3$\5$\u01be\n$\3$\3$\3%\3%\3%\3%\5%\u01c6"+
		"\n%\3&\3&\5&\u01ca\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\5,\u01ef"+
		"\n,\3-\3-\3-\3-\7-\u01f5\n-\f-\16-\u01f8\13-\3-\3-\3.\3.\3.\3.\3.\7.\u0201"+
		"\n.\f.\16.\u0204\13.\3.\3.\3/\3/\5/\u020a\n/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\5\65\u0217\n\65\3\66\5\66\u021a\n\66\3"+
		"\67\6\67\u021d\n\67\r\67\16\67\u021e\3\67\3\67\38\38\38\38\78\u0227\n"+
		"8\f8\168\u022a\138\38\38\38\38\38\39\69\u0232\n9\r9\169\u0233\39\39\3"+
		":\3:\3:\3:\7:\u023c\n:\f:\16:\u023f\13:\3:\3:\5\u01f6\u0202\u0228\2;\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\319\2;\2=\2?\32"+
		"A\2C\2E\33G\34I\2K\2M\2O\2Q\35S\36U\2W\37Y\2[\2]\2_\2a\2c\2e\2g\2i\2k"+
		"\2m o!q\"s#\3\2\23\6\2--//``~~\5\2\'\',,\61\61\7\2##((,-//``\3\2\63;\4"+
		"\2ZZzz\4\2GGgg\4\2--//\13\2$$))^^cdhhppttvvxx\4\2bb\u0080\u0080\3\2\62"+
		";\3\2\629\5\2\62;CHch\3\2\f\f\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971"+
		"\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71"+
		"\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b"+
		"\u136b\u1373\u17e2\u17eb\u1812\u181b\uff12\uff1b\u0104\2C\\c|\u00ac\u00ac"+
		"\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0221\u0224\u0235"+
		"\u0252\u02af\u02b2\u02ba\u02bd\u02c3\u02d2\u02d3\u02e2\u02e6\u02f0\u02f0"+
		"\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0"+
		"\u03d2\u03d9\u03dc\u03f5\u0402\u0483\u048e\u04c6\u04c9\u04ca\u04cd\u04ce"+
		"\u04d2\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec"+
		"\u05f2\u05f4\u0623\u063c\u0642\u064c\u0673\u06d5\u06d7\u06d7\u06e7\u06e8"+
		"\u06fc\u06fe\u0712\u0712\u0714\u072e\u0782\u07a7\u0907\u093b\u093f\u093f"+
		"\u0952\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2"+
		"\u09b4\u09b4\u09b8\u09bb\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c"+
		"\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b"+
		"\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93"+
		"\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2"+
		"\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35"+
		"\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b87\u0b8c\u0b90\u0b92"+
		"\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac"+
		"\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35"+
		"\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5"+
		"\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a"+
		"\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf"+
		"\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86"+
		"\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5"+
		"\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6"+
		"\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f6c\u0f8a\u0f8d\u1002\u1023"+
		"\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10f8\u1102\u115b"+
		"\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f"+
		"\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f"+
		"\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7"+
		"\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317"+
		"\u131a\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u1678\u1683\u169c"+
		"\u16a2\u16ec\u1782\u17b5\u1822\u1879\u1882\u18aa\u1e02\u1e9d\u1ea2\u1efb"+
		"\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b"+
		"\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0"+
		"\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6"+
		"\u1ff8\u1ffe\u2081\u2081\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117"+
		"\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133"+
		"\u2135\u213b\u2162\u2185\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303c"+
		"\u3043\u3096\u309f\u30a0\u30a3\u30fc\u30fe\u3100\u3107\u312e\u3133\u3190"+
		"\u31a2\u31b9\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fa7\u9fa7\ua002\ua48e"+
		"\uac02\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f"+
		"\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46"+
		"\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74"+
		"\ufe76\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9"+
		"\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\4\2\13\13\"\"\4\2\f\f\17\17\2\u026f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\67\3\2"+
		"\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5|\3\2\2\2\7~"+
		"\3\2\2\2\t\u0080\3\2\2\2\13\u0088\3\2\2\2\r\u008a\3\2\2\2\17\u008d\3\2"+
		"\2\2\21\u0096\3\2\2\2\23\u0099\3\2\2\2\25\u00a1\3\2\2\2\27\u00a6\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2\2\2\37\u00b6\3\2\2\2"+
		"!\u00b8\3\2\2\2#\u00bd\3\2\2\2%\u00c4\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3"+
		"\2\2\2+\u0155\3\2\2\2-\u015e\3\2\2\2/\u016a\3\2\2\2\61\u016c\3\2\2\2\63"+
		"\u0176\3\2\2\2\65\u017b\3\2\2\2\67\u0180\3\2\2\29\u0182\3\2\2\2;\u0189"+
		"\3\2\2\2=\u0190\3\2\2\2?\u01a7\3\2\2\2A\u01aa\3\2\2\2C\u01ae\3\2\2\2E"+
		"\u01b6\3\2\2\2G\u01ba\3\2\2\2I\u01c5\3\2\2\2K\u01c9\3\2\2\2M\u01cb\3\2"+
		"\2\2O\u01d0\3\2\2\2Q\u01d5\3\2\2\2S\u01dd\3\2\2\2U\u01e9\3\2\2\2W\u01ee"+
		"\3\2\2\2Y\u01f0\3\2\2\2[\u01fb\3\2\2\2]\u0209\3\2\2\2_\u020b\3\2\2\2a"+
		"\u020d\3\2\2\2c\u020f\3\2\2\2e\u0211\3\2\2\2g\u0213\3\2\2\2i\u0216\3\2"+
		"\2\2k\u0219\3\2\2\2m\u021c\3\2\2\2o\u0222\3\2\2\2q\u0231\3\2\2\2s\u0237"+
		"\3\2\2\2uv\7k\2\2vw\7o\2\2wx\7r\2\2xy\7q\2\2yz\7t\2\2z{\7v\2\2{\4\3\2"+
		"\2\2|}\7*\2\2}\6\3\2\2\2~\177\7+\2\2\177\b\3\2\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7e\2\2\u0082\u0083\7e\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\n\3\2\2\2\u0088\u0089"+
		"\7?\2\2\u0089\f\3\2\2\2\u008a\u008b\7<\2\2\u008b\u008c\7<\2\2\u008c\16"+
		"\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2"+
		"\u0094\u0095\7v\2\2\u0095\20\3\2\2\2\u0096\u0097\7q\2\2\u0097\u0098\7"+
		"r\2\2\u0098\22\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7{\2\2\u009c\u009d\7o\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7o\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7n\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7\60\2\2"+
		"\u00af\34\3\2\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7i\2\2\u00b5\36\3\2\2\2\u00b6\u00b7"+
		"\7.\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7r\2\2\u00bb\u00bc\7<\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7h\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7t\2\2\u00c9&\3\2\2\2\u00ca"+
		"\u00cb\7=\2\2\u00cb(\3\2\2\2\u00cc\u00d1\5]/\2\u00cd\u00d0\5]/\2\u00ce"+
		"\u00d0\5i\65\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2*\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u0156\7m\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7g\2\2"+
		"\u00db\u00dc\7h\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7w\2\2\u00de\u00df"+
		"\7n\2\2\u00df\u0156\7v\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u0156\7e\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea"+
		"\7h\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7e\2\2\u00ec\u0156\7g\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7e\2\2\u00f2\u0156\7v\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5"+
		"\7c\2\2\u00f5\u00f6\7u\2\2\u00f6\u0156\7g\2\2\u00f7\u00f8\7f\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7g\2\2\u00fb\u0156\7t\2\2"+
		"\u00fc\u00fd\7i\2\2\u00fd\u0156\7q\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100"+
		"\7c\2\2\u0100\u0156\7r\2\2\u0101\u0102\7u\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u0105\7w\2\2\u0105\u0106\7e\2\2\u0106\u0156\7v\2\2"+
		"\u0107\u0108\7e\2\2\u0108\u0109\7j\2\2\u0109\u010a\7c\2\2\u010a\u0156"+
		"\7p\2\2\u010b\u010c\7g\2\2\u010c\u010d\7n\2\2\u010d\u010e\7u\2\2\u010e"+
		"\u0156\7g\2\2\u010f\u0110\7i\2\2\u0110\u0111\7q\2\2\u0111\u0112\7v\2\2"+
		"\u0112\u0156\7q\2\2\u0113\u0114\7r\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7e\2\2\u0116\u0117\7m\2\2\u0117\u0118\7c\2\2\u0118\u0119\7i\2\2\u0119"+
		"\u0156\7g\2\2\u011a\u011b\7u\2\2\u011b\u011c\7y\2\2\u011c\u011d\7k\2\2"+
		"\u011d\u011e\7v\2\2\u011e\u011f\7e\2\2\u011f\u0156\7j\2\2\u0120\u0121"+
		"\7e\2\2\u0121\u0122\7q\2\2\u0122\u0123\7p\2\2\u0123\u0124\7u\2\2\u0124"+
		"\u0156\7v\2\2\u0125\u0126\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2"+
		"\u0128\u0129\7n\2\2\u0129\u012a\7v\2\2\u012a\u012b\7j\2\2\u012b\u012c"+
		"\7t\2\2\u012c\u012d\7q\2\2\u012d\u012e\7w\2\2\u012e\u012f\7i\2\2\u012f"+
		"\u0156\7j\2\2\u0130\u0131\7k\2\2\u0131\u0156\7h\2\2\u0132\u0133\7t\2\2"+
		"\u0133\u0134\7c\2\2\u0134\u0135\7p\2\2\u0135\u0136\7i\2\2\u0136\u0156"+
		"\7g\2\2\u0137\u0138\7v\2\2\u0138\u0139\7{\2\2\u0139\u013a\7r\2\2\u013a"+
		"\u0156\7g\2\2\u013b\u013c\7e\2\2\u013c\u013d\7q\2\2\u013d\u013e\7p\2\2"+
		"\u013e\u013f\7v\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142"+
		"\7w\2\2\u0142\u0156\7g\2\2\u0143\u0144\7h\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0156\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7o\2\2\u0148\u0149\7r\2\2"+
		"\u0149\u014a\7q\2\2\u014a\u014b\7t\2\2\u014b\u0156\7v\2\2\u014c\u014d"+
		"\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f\7v\2\2\u014f\u0150\7w\2\2\u0150"+
		"\u0151\7t\2\2\u0151\u0156\7p\2\2\u0152\u0153\7x\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0156\7t\2\2\u0155\u00d4\3\2\2\2\u0155\u00d9\3\2\2\2\u0155\u00e0"+
		"\3\2\2\2\u0155\u00e4\3\2\2\2\u0155\u00ed\3\2\2\2\u0155\u00f3\3\2\2\2\u0155"+
		"\u00f7\3\2\2\2\u0155\u00fc\3\2\2\2\u0155\u00fe\3\2\2\2\u0155\u0101\3\2"+
		"\2\2\u0155\u0107\3\2\2\2\u0155\u010b\3\2\2\2\u0155\u010f\3\2\2\2\u0155"+
		"\u0113\3\2\2\2\u0155\u011a\3\2\2\2\u0155\u0120\3\2\2\2\u0155\u0125\3\2"+
		"\2\2\u0155\u0130\3\2\2\2\u0155\u0132\3\2\2\2\u0155\u0137\3\2\2\2\u0155"+
		"\u013b\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0146\3\2\2\2\u0155\u014c\3\2"+
		"\2\2\u0155\u0152\3\2\2\2\u0156,\3\2\2\2\u0157\u0158\7~\2\2\u0158\u015f"+
		"\7~\2\2\u0159\u015a\7(\2\2\u015a\u015f\7(\2\2\u015b\u015f\5/\30\2\u015c"+
		"\u015f\5\61\31\2\u015d\u015f\5\63\32\2\u015e\u0157\3\2\2\2\u015e\u0159"+
		"\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		".\3\2\2\2\u0160\u0161\7?\2\2\u0161\u016b\7?\2\2\u0162\u0163\7#\2\2\u0163"+
		"\u016b\7?\2\2\u0164\u016b\7>\2\2\u0165\u0166\7>\2\2\u0166\u016b\7?\2\2"+
		"\u0167\u016b\7@\2\2\u0168\u0169\7@\2\2\u0169\u016b\7?\2\2\u016a\u0160"+
		"\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a"+
		"\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016b\60\3\2\2\2\u016c\u016d\t\2\2"+
		"\2\u016d\62\3\2\2\2\u016e\u0177\t\3\2\2\u016f\u0170\7>\2\2\u0170\u0177"+
		"\7>\2\2\u0171\u0172\7@\2\2\u0172\u0177\7@\2\2\u0173\u0177\7(\2\2\u0174"+
		"\u0175\7(\2\2\u0175\u0177\7`\2\2\u0176\u016e\3\2\2\2\u0176\u016f\3\2\2"+
		"\2\u0176\u0171\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0177\64"+
		"\3\2\2\2\u0178\u017c\t\4\2\2\u0179\u017a\7>\2\2\u017a\u017c\7/\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017c\66\3\2\2\2\u017d\u0181\59\35"+
		"\2\u017e\u0181\5;\36\2\u017f\u0181\5=\37\2\u0180\u017d\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u01818\3\2\2\2\u0182\u0186\t\5\2\2\u0183"+
		"\u0185\5_\60\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187:\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d"+
		"\7\62\2\2\u018a\u018c\5a\61\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e<\3\2\2\2\u018f\u018d\3"+
		"\2\2\2\u0190\u0191\7\62\2\2\u0191\u0193\t\6\2\2\u0192\u0194\5c\62\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196>\3\2\2\2\u0197\u0198\5A!\2\u0198\u019a\7\60\2\2\u0199\u019b"+
		"\5A!\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019e\5C\"\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a8\3\2"+
		"\2\2\u019f\u01a0\5A!\2\u01a0\u01a1\5C\"\2\u01a1\u01a8\3\2\2\2\u01a2\u01a3"+
		"\7\60\2\2\u01a3\u01a5\5A!\2\u01a4\u01a6\5C\"\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u0197\3\2\2\2\u01a7\u019f\3\2"+
		"\2\2\u01a7\u01a2\3\2\2\2\u01a8@\3\2\2\2\u01a9\u01ab\5_\60\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"B\3\2\2\2\u01ae\u01b0\t\7\2\2\u01af\u01b1\t\b\2\2\u01b0\u01af\3\2\2\2"+
		"\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5A!\2\u01b3D\3\2"+
		"\2\2\u01b4\u01b7\5A!\2\u01b5\u01b7\5? \2\u01b6\u01b4\3\2\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7k\2\2\u01b9F\3\2\2\2\u01ba\u01bd"+
		"\7)\2\2\u01bb\u01be\5I%\2\u01bc\u01be\5K&\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7)\2\2\u01c0H\3\2\2\2\u01c1"+
		"\u01c6\5g\64\2\u01c2\u01c6\5Q)\2\u01c3\u01c6\5S*\2\u01c4\u01c6\5U+\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6J\3\2\2\2\u01c7\u01ca\5M\'\2\u01c8\u01ca\5O(\2\u01c9\u01c7\3"+
		"\2\2\2\u01c9\u01c8\3\2\2\2\u01caL\3\2\2\2\u01cb\u01cc\7^\2\2\u01cc\u01cd"+
		"\5a\61\2\u01cd\u01ce\5a\61\2\u01ce\u01cf\5a\61\2\u01cfN\3\2\2\2\u01d0"+
		"\u01d1\7^\2\2\u01d1\u01d2\7z\2\2\u01d2\u01d3\5c\62\2\u01d3\u01d4\5c\62"+
		"\2\u01d4P\3\2\2\2\u01d5\u01d6\7^\2\2\u01d6\u01d7\7w\2\2\u01d7\u01d8\3"+
		"\2\2\2\u01d8\u01d9\5c\62\2\u01d9\u01da\5c\62\2\u01da\u01db\5c\62\2\u01db"+
		"\u01dc\5c\62\2\u01dcR\3\2\2\2\u01dd\u01de\7^\2\2\u01de\u01df\7W\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\5c\62\2\u01e1\u01e2\5c\62\2\u01e2\u01e3\5c"+
		"\62\2\u01e3\u01e4\5c\62\2\u01e4\u01e5\5c\62\2\u01e5\u01e6\5c\62\2\u01e6"+
		"\u01e7\5c\62\2\u01e7\u01e8\5c\62\2\u01e8T\3\2\2\2\u01e9\u01ea\7^\2\2\u01ea"+
		"\u01eb\t\t\2\2\u01ebV\3\2\2\2\u01ec\u01ef\5Y-\2\u01ed\u01ef\5[.\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efX\3\2\2\2\u01f0\u01f6\7b\2\2\u01f1"+
		"\u01f5\5g\64\2\u01f2\u01f5\5e\63\2\u01f3\u01f5\t\n\2\2\u01f4\u01f1\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fa\7b\2\2\u01faZ\3\2\2\2\u01fb\u0202\7$\2\2\u01fc\u01fd"+
		"\7^\2\2\u01fd\u0201\7$\2\2\u01fe\u0201\5I%\2\u01ff\u0201\5K&\2\u0200\u01fc"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0205\u0206\7$\2\2\u0206\\\3\2\2\2\u0207\u020a\5k\66\2\u0208\u020a"+
		"\7a\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a^\3\2\2\2\u020b\u020c"+
		"\t\13\2\2\u020c`\3\2\2\2\u020d\u020e\t\f\2\2\u020eb\3\2\2\2\u020f\u0210"+
		"\t\r\2\2\u0210d\3\2\2\2\u0211\u0212\t\16\2\2\u0212f\3\2\2\2\u0213\u0214"+
		"\n\16\2\2\u0214h\3\2\2\2\u0215\u0217\t\17\2\2\u0216\u0215\3\2\2\2\u0217"+
		"j\3\2\2\2\u0218\u021a\t\20\2\2\u0219\u0218\3\2\2\2\u021al\3\2\2\2\u021b"+
		"\u021d\t\21\2\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3"+
		"\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\b\67\2\2\u0221"+
		"n\3\2\2\2\u0222\u0223\7\61\2\2\u0223\u0224\7,\2\2\u0224\u0228\3\2\2\2"+
		"\u0225\u0227\13\2\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\7,\2\2\u022c\u022d\7\61\2\2\u022d\u022e\3\2\2\2\u022e\u022f\b8"+
		"\2\2\u022fp\3\2\2\2\u0230\u0232\t\22\2\2\u0231\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\b9\2\2\u0236r\3\2\2\2\u0237\u0238\7\61\2\2\u0238\u0239\7\61\2\2"+
		"\u0239\u023d\3\2\2\2\u023a\u023c\n\22\2\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\b:\3\2\u0241t\3\2\2\2$\2\u00cf\u00d1\u0155"+
		"\u015e\u016a\u0176\u017b\u0180\u0186\u018d\u0195\u019a\u019d\u01a5\u01a7"+
		"\u01ac\u01b0\u01b6\u01bd\u01c5\u01c9\u01ee\u01f4\u01f6\u0200\u0202\u0209"+
		"\u0216\u0219\u021e\u0228\u0233\u023d\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}