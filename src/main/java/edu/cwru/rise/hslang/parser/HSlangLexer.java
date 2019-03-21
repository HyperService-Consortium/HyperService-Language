// Generated from HSlang.g4 by ANTLR 4.7.2

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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENTIFIER=18, KEYWORD=19, BINARY_OP=20, INT_LIT=21, FLOAT_LIT=22, IMAGINARY_LIT=23, 
		RUNE_LIT=24, LITTLE_U_VALUE=25, BIG_U_VALUE=26, STRING_LIT=27, WS=28, 
		COMMENT=29, TERMINATOR=30, LINE_COMMENT=31;
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
			"IDENTIFIER", "KEYWORD", "BINARY_OP", "REL_OP", "ADD_OP", "MUL_OP", "UNARY_OP", 
			"INT_LIT", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "DECIMALS", 
			"EXPONENT", "IMAGINARY_LIT", "RUNE_LIT", "UNICODE_VALUE", "BYTE_VALUE", 
			"OCTAL_BYTE_VALUE", "HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", 
			"ESCAPED_CHAR", "STRING_LIT", "RAW_STRING_LIT", "INTERPRETED_STRING_LIT", 
			"LETTER", "DECIMAL_DIGIT", "OCTAL_DIGIT", "HEX_DIGIT", "NEWLINE", "UNICODE_CHAR", 
			"UNICODE_DIGIT", "UNICODE_LETTER", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'::'", "'op'", "'payment'", "'from'", "'to'", "'call'", 
			"'.'", "'('", "')'", "'using'", "'returns'", "','", "'dep:'", "'before'", 
			"'after'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", 
			"INT_LIT", "FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u022e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\7\23\u00bc\n\23\f\23\16\23\u00bf\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0142\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014b\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0157\n\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0163\n\30\3\31\3\31\3\31"+
		"\5\31\u0168\n\31\3\32\3\32\3\32\5\32\u016d\n\32\3\33\3\33\7\33\u0171\n"+
		"\33\f\33\16\33\u0174\13\33\3\34\3\34\7\34\u0178\n\34\f\34\16\34\u017b"+
		"\13\34\3\35\3\35\3\35\6\35\u0180\n\35\r\35\16\35\u0181\3\36\3\36\3\36"+
		"\5\36\u0187\n\36\3\36\5\36\u018a\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0192\n\36\5\36\u0194\n\36\3\37\6\37\u0197\n\37\r\37\16\37\u0198\3"+
		" \3 \5 \u019d\n \3 \3 \3!\3!\5!\u01a3\n!\3!\3!\3\"\3\"\3\"\5\"\u01aa\n"+
		"\"\3\"\3\"\3#\3#\3#\3#\5#\u01b2\n#\3$\3$\5$\u01b6\n$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3)\3)\3)\3*\3*\5*\u01db\n*\3+\3+\3+\3+\7+\u01e1\n+\f+\16"+
		"+\u01e4\13+\3+\3+\3,\3,\3,\3,\3,\7,\u01ed\n,\f,\16,\u01f0\13,\3,\3,\3"+
		"-\3-\5-\u01f6\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\5\63\u0203"+
		"\n\63\3\64\5\64\u0206\n\64\3\65\6\65\u0209\n\65\r\65\16\65\u020a\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\7\66\u0213\n\66\f\66\16\66\u0216\13\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\6\67\u021e\n\67\r\67\16\67\u021f\3\67\3\67\3"+
		"8\38\38\38\78\u0228\n8\f8\168\u022b\138\38\38\5\u01e2\u01ee\u0214\29\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\27\65\2\67\29\2;\30=\2?\2A\31"+
		"C\32E\2G\2I\2K\2M\33O\34Q\2S\35U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\36k\37"+
		"m o!\3\2\23\6\2--//``~~\5\2\'\',,\61\61\7\2##((,-//``\3\2\63;\4\2ZZzz"+
		"\4\2GGgg\4\2--//\13\2$$))^^cdhhppttvvxx\4\2bb\u0080\u0080\3\2\62;\3\2"+
		"\629\5\2\62;CHch\3\2\f\f\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971"+
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
		"\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\4\2\13\13\"\"\4\2\f\f\17\17\2\u025b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\63\3\2\2\2\2;\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\ty\3\2\2\2\13"+
		"\u0081\3\2\2\2\r\u0086\3\2\2\2\17\u0089\3\2\2\2\21\u008e\3\2\2\2\23\u0090"+
		"\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u009a\3\2\2\2\33\u00a2\3"+
		"\2\2\2\35\u00a4\3\2\2\2\37\u00a9\3\2\2\2!\u00b0\3\2\2\2#\u00b6\3\2\2\2"+
		"%\u00b8\3\2\2\2\'\u0141\3\2\2\2)\u014a\3\2\2\2+\u0156\3\2\2\2-\u0158\3"+
		"\2\2\2/\u0162\3\2\2\2\61\u0167\3\2\2\2\63\u016c\3\2\2\2\65\u016e\3\2\2"+
		"\2\67\u0175\3\2\2\29\u017c\3\2\2\2;\u0193\3\2\2\2=\u0196\3\2\2\2?\u019a"+
		"\3\2\2\2A\u01a2\3\2\2\2C\u01a6\3\2\2\2E\u01b1\3\2\2\2G\u01b5\3\2\2\2I"+
		"\u01b7\3\2\2\2K\u01bc\3\2\2\2M\u01c1\3\2\2\2O\u01c9\3\2\2\2Q\u01d5\3\2"+
		"\2\2S\u01da\3\2\2\2U\u01dc\3\2\2\2W\u01e7\3\2\2\2Y\u01f5\3\2\2\2[\u01f7"+
		"\3\2\2\2]\u01f9\3\2\2\2_\u01fb\3\2\2\2a\u01fd\3\2\2\2c\u01ff\3\2\2\2e"+
		"\u0202\3\2\2\2g\u0205\3\2\2\2i\u0208\3\2\2\2k\u020e\3\2\2\2m\u021d\3\2"+
		"\2\2o\u0223\3\2\2\2qr\7?\2\2r\4\3\2\2\2st\7<\2\2tu\7<\2\2u\6\3\2\2\2v"+
		"w\7q\2\2wx\7r\2\2x\b\3\2\2\2yz\7r\2\2z{\7c\2\2{|\7{\2\2|}\7o\2\2}~\7g"+
		"\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\n\3\2\2\2\u0081\u0082\7h\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7q\2\2\u0084\u0085\7o\2\2\u0085\f\3\2\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7q\2\2\u0088\16\3\2\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7n\2\2\u008d\20\3\2\2\2\u008e"+
		"\u008f\7\60\2\2\u008f\22\3\2\2\2\u0090\u0091\7*\2\2\u0091\24\3\2\2\2\u0092"+
		"\u0093\7+\2\2\u0093\26\3\2\2\2\u0094\u0095\7w\2\2\u0095\u0096\7u\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2\u0099\30\3\2\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d\u009e\7w\2\2"+
		"\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7u\2\2\u00a1\32\3\2"+
		"\2\2\u00a2\u00a3\7.\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7<\2\2\u00a8\36\3\2\2\2\u00a9\u00aa"+
		"\7d\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af \3\2\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7h\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\"\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7$\3\2\2\2\u00b8\u00bd\5Y-\2\u00b9"+
		"\u00bc\5Y-\2\u00ba\u00bc\5e\63\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be&"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7c\2\2\u00c4\u0142\7m\2\2\u00c5\u00c6\7f\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00cb\7n\2\2\u00cb\u0142\7v\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\u00ce\7w\2\2\u00ce\u00cf\7p\2\2\u00cf\u0142\7e\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7t\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7e\2\2\u00d8"+
		"\u0142\7g\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7n\2\2"+
		"\u00dc\u00dd\7g\2\2\u00dd\u00de\7e\2\2\u00de\u0142\7v\2\2\u00df\u00e0"+
		"\7e\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2\u0142\7g\2\2\u00e3"+
		"\u00e4\7f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\u0142\7t\2\2\u00e8\u00e9\7i\2\2\u00e9\u0142\7q\2\2\u00ea\u00eb"+
		"\7o\2\2\u00eb\u00ec\7c\2\2\u00ec\u0142\7r\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7e\2\2"+
		"\u00f2\u0142\7v\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6"+
		"\7c\2\2\u00f6\u0142\7p\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\u0142\7g\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u00fe\7v\2\2\u00fe\u0142\7q\2\2\u00ff\u0100\7r\2\2\u0100\u0101"+
		"\7c\2\2\u0101\u0102\7e\2\2\u0102\u0103\7m\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7i\2\2\u0105\u0142\7g\2\2\u0106\u0107\7u\2\2\u0107\u0108\7y\2\2"+
		"\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7e\2\2\u010b\u0142"+
		"\7j\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0142\7v\2\2\u0111\u0112\7h\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7n\2\2\u0114\u0115\7n\2\2\u0115\u0116\7v\2\2\u0116\u0117"+
		"\7j\2\2\u0117\u0118\7t\2\2\u0118\u0119\7q\2\2\u0119\u011a\7w\2\2\u011a"+
		"\u011b\7i\2\2\u011b\u0142\7j\2\2\u011c\u011d\7k\2\2\u011d\u0142\7h\2\2"+
		"\u011e\u011f\7t\2\2\u011f\u0120\7c\2\2\u0120\u0121\7p\2\2\u0121\u0122"+
		"\7i\2\2\u0122\u0142\7g\2\2\u0123\u0124\7v\2\2\u0124\u0125\7{\2\2\u0125"+
		"\u0126\7r\2\2\u0126\u0142\7g\2\2\u0127\u0128\7e\2\2\u0128\u0129\7q\2\2"+
		"\u0129\u012a\7p\2\2\u012a\u012b\7v\2\2\u012b\u012c\7k\2\2\u012c\u012d"+
		"\7p\2\2\u012d\u012e\7w\2\2\u012e\u0142\7g\2\2\u012f\u0130\7h\2\2\u0130"+
		"\u0131\7q\2\2\u0131\u0142\7t\2\2\u0132\u0133\7k\2\2\u0133\u0134\7o\2\2"+
		"\u0134\u0135\7r\2\2\u0135\u0136\7q\2\2\u0136\u0137\7t\2\2\u0137\u0142"+
		"\7v\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a\u013b\7v\2\2\u013b"+
		"\u013c\7w\2\2\u013c\u013d\7t\2\2\u013d\u0142\7p\2\2\u013e\u013f\7x\2\2"+
		"\u013f\u0140\7c\2\2\u0140\u0142\7t\2\2\u0141\u00c0\3\2\2\2\u0141\u00c5"+
		"\3\2\2\2\u0141\u00cc\3\2\2\2\u0141\u00d0\3\2\2\2\u0141\u00d9\3\2\2\2\u0141"+
		"\u00df\3\2\2\2\u0141\u00e3\3\2\2\2\u0141\u00e8\3\2\2\2\u0141\u00ea\3\2"+
		"\2\2\u0141\u00ed\3\2\2\2\u0141\u00f3\3\2\2\2\u0141\u00f7\3\2\2\2\u0141"+
		"\u00fb\3\2\2\2\u0141\u00ff\3\2\2\2\u0141\u0106\3\2\2\2\u0141\u010c\3\2"+
		"\2\2\u0141\u0111\3\2\2\2\u0141\u011c\3\2\2\2\u0141\u011e\3\2\2\2\u0141"+
		"\u0123\3\2\2\2\u0141\u0127\3\2\2\2\u0141\u012f\3\2\2\2\u0141\u0132\3\2"+
		"\2\2\u0141\u0138\3\2\2\2\u0141\u013e\3\2\2\2\u0142(\3\2\2\2\u0143\u0144"+
		"\7~\2\2\u0144\u014b\7~\2\2\u0145\u0146\7(\2\2\u0146\u014b\7(\2\2\u0147"+
		"\u014b\5+\26\2\u0148\u014b\5-\27\2\u0149\u014b\5/\30\2\u014a\u0143\3\2"+
		"\2\2\u014a\u0145\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b*\3\2\2\2\u014c\u014d\7?\2\2\u014d\u0157\7?\2\2\u014e"+
		"\u014f\7#\2\2\u014f\u0157\7?\2\2\u0150\u0157\7>\2\2\u0151\u0152\7>\2\2"+
		"\u0152\u0157\7?\2\2\u0153\u0157\7@\2\2\u0154\u0155\7@\2\2\u0155\u0157"+
		"\7?\2\2\u0156\u014c\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0150\3\2\2\2\u0156"+
		"\u0151\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0157,\3\2\2\2"+
		"\u0158\u0159\t\2\2\2\u0159.\3\2\2\2\u015a\u0163\t\3\2\2\u015b\u015c\7"+
		">\2\2\u015c\u0163\7>\2\2\u015d\u015e\7@\2\2\u015e\u0163\7@\2\2\u015f\u0163"+
		"\7(\2\2\u0160\u0161\7(\2\2\u0161\u0163\7`\2\2\u0162\u015a\3\2\2\2\u0162"+
		"\u015b\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\60\3\2\2\2\u0164\u0168\t\4\2\2\u0165\u0166\7>\2\2\u0166\u0168"+
		"\7/\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0168\62\3\2\2\2\u0169"+
		"\u016d\5\65\33\2\u016a\u016d\5\67\34\2\u016b\u016d\59\35\2\u016c\u0169"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\64\3\2\2\2\u016e"+
		"\u0172\t\5\2\2\u016f\u0171\5[.\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\66\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0179\7\62\2\2\u0176\u0178\5]/\2\u0177\u0176\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a8\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017c\u017d\7\62\2\2\u017d\u017f\t\6\2\2\u017e\u0180"+
		"\5_\60\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182:\3\2\2\2\u0183\u0184\5=\37\2\u0184\u0186\7\60\2\2"+
		"\u0185\u0187\5=\37\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189"+
		"\3\2\2\2\u0188\u018a\5? \2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u0194\3\2\2\2\u018b\u018c\5=\37\2\u018c\u018d\5? \2\u018d\u0194\3\2\2"+
		"\2\u018e\u018f\7\60\2\2\u018f\u0191\5=\37\2\u0190\u0192\5? \2\u0191\u0190"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0183\3\2\2\2\u0193"+
		"\u018b\3\2\2\2\u0193\u018e\3\2\2\2\u0194<\3\2\2\2\u0195\u0197\5[.\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199>\3\2\2\2\u019a\u019c\t\7\2\2\u019b\u019d\t\b\2\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\5=\37\2\u019f"+
		"@\3\2\2\2\u01a0\u01a3\5=\37\2\u01a1\u01a3\5;\36\2\u01a2\u01a0\3\2\2\2"+
		"\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7k\2\2\u01a5B\3\2"+
		"\2\2\u01a6\u01a9\7)\2\2\u01a7\u01aa\5E#\2\u01a8\u01aa\5G$\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac"+
		"D\3\2\2\2\u01ad\u01b2\5c\62\2\u01ae\u01b2\5M\'\2\u01af\u01b2\5O(\2\u01b0"+
		"\u01b2\5Q)\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b0\3\2\2\2\u01b2F\3\2\2\2\u01b3\u01b6\5I%\2\u01b4\u01b6\5"+
		"K&\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6H\3\2\2\2\u01b7\u01b8"+
		"\7^\2\2\u01b8\u01b9\5]/\2\u01b9\u01ba\5]/\2\u01ba\u01bb\5]/\2\u01bbJ\3"+
		"\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01be\7z\2\2\u01be\u01bf\5_\60\2\u01bf"+
		"\u01c0\5_\60\2\u01c0L\3\2\2\2\u01c1\u01c2\7^\2\2\u01c2\u01c3\7w\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\5_\60\2\u01c5\u01c6\5_\60\2\u01c6\u01c7\5_"+
		"\60\2\u01c7\u01c8\5_\60\2\u01c8N\3\2\2\2\u01c9\u01ca\7^\2\2\u01ca\u01cb"+
		"\7W\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5_\60\2\u01cd\u01ce\5_\60\2\u01ce"+
		"\u01cf\5_\60\2\u01cf\u01d0\5_\60\2\u01d0\u01d1\5_\60\2\u01d1\u01d2\5_"+
		"\60\2\u01d2\u01d3\5_\60\2\u01d3\u01d4\5_\60\2\u01d4P\3\2\2\2\u01d5\u01d6"+
		"\7^\2\2\u01d6\u01d7\t\t\2\2\u01d7R\3\2\2\2\u01d8\u01db\5U+\2\u01d9\u01db"+
		"\5W,\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbT\3\2\2\2\u01dc\u01e2"+
		"\7b\2\2\u01dd\u01e1\5c\62\2\u01de\u01e1\5a\61\2\u01df\u01e1\t\n\2\2\u01e0"+
		"\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e6\7b\2\2\u01e6V\3\2\2\2\u01e7\u01ee\7$\2\2\u01e8"+
		"\u01e9\7^\2\2\u01e9\u01ed\7$\2\2\u01ea\u01ed\5E#\2\u01eb\u01ed\5G$\2\u01ec"+
		"\u01e8\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f2\7$\2\2\u01f2X\3\2\2\2\u01f3\u01f6\5g\64\2\u01f4"+
		"\u01f6\7a\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6Z\3\2\2\2\u01f7"+
		"\u01f8\t\13\2\2\u01f8\\\3\2\2\2\u01f9\u01fa\t\f\2\2\u01fa^\3\2\2\2\u01fb"+
		"\u01fc\t\r\2\2\u01fc`\3\2\2\2\u01fd\u01fe\t\16\2\2\u01feb\3\2\2\2\u01ff"+
		"\u0200\n\16\2\2\u0200d\3\2\2\2\u0201\u0203\t\17\2\2\u0202\u0201\3\2\2"+
		"\2\u0203f\3\2\2\2\u0204\u0206\t\20\2\2\u0205\u0204\3\2\2\2\u0206h\3\2"+
		"\2\2\u0207\u0209\t\21\2\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\b\65"+
		"\2\2\u020dj\3\2\2\2\u020e\u020f\7\61\2\2\u020f\u0210\7,\2\2\u0210\u0214"+
		"\3\2\2\2\u0211\u0213\13\2\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0217\u0218\7,\2\2\u0218\u0219\7\61\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\b\66\2\2\u021bl\3\2\2\2\u021c\u021e\t\22\2\2\u021d\u021c\3\2\2"+
		"\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0222\b\67\2\2\u0222n\3\2\2\2\u0223\u0224\7\61\2\2\u0224"+
		"\u0225\7\61\2\2\u0225\u0229\3\2\2\2\u0226\u0228\n\22\2\2\u0227\u0226\3"+
		"\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\b8\3\2\u022dp\3\2\2\2$"+
		"\2\u00bb\u00bd\u0141\u014a\u0156\u0162\u0167\u016c\u0172\u0179\u0181\u0186"+
		"\u0189\u0191\u0193\u0198\u019c\u01a2\u01a9\u01b1\u01b5\u01da\u01e0\u01e2"+
		"\u01ec\u01ee\u01f5\u0202\u0205\u020a\u0214\u021f\u0229\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}