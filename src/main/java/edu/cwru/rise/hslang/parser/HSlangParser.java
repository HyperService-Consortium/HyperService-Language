// Generated from /Users/Jian/Downloads/HSL/antlr/HSlang.g4 by ANTLR 4.7

package edu.cwru.rise.hslang.parser;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HSlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, IDENTIFIER=38, 
		KEYWORD=39, BINARY_OP=40, INT_LIT=41, FLOAT_LIT=42, IMAGINARY_LIT=43, 
		RUNE_LIT=44, LITTLE_U_VALUE=45, BIG_U_VALUE=46, STRING_LIT=47, WS=48, 
		COMMENT=49, TERMINATOR=50, LINE_COMMENT=51;
	public static final int
		RULE_sourceFile = 0, RULE_importDecl = 1, RULE_importSpec = 2, RULE_arrDefin = 3, 
		RULE_arrSpec = 4, RULE_varSpec = 5, RULE_accountSpc = 6, RULE_contractSpc = 7, 
		RULE_contractAddr = 8, RULE_opSpec = 9, RULE_foreachSpec = 10, RULE_forOp = 11, 
		RULE_ifSpec = 12, RULE_ifStatemnt = 13, RULE_elseStatement = 14, RULE_blockVarSpec = 15, 
		RULE_ifaccountSpc = 16, RULE_ifcontractSpc = 17, RULE_blockOpSpec = 18, 
		RULE_loopSpec = 19, RULE_condExpression = 20, RULE_rEL_OP = 21, RULE_compareUnit = 22, 
		RULE_numericallit = 23, RULE_account = 24, RULE_paymentSpec = 25, RULE_contractInvocationSpec = 26, 
		RULE_ifpaymentSpec = 27, RULE_ifcontractInvocationSpec = 28, RULE_stateField = 29, 
		RULE_arg = 30, RULE_argList = 31, RULE_depSection = 32, RULE_depSpec = 33, 
		RULE_identifierList = 34, RULE_operandName = 35, RULE_qualifiedIdent = 36, 
		RULE_eos = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importDecl", "importSpec", "arrDefin", "arrSpec", "varSpec", 
			"accountSpc", "contractSpc", "contractAddr", "opSpec", "foreachSpec", 
			"forOp", "ifSpec", "ifStatemnt", "elseStatement", "blockVarSpec", "ifaccountSpc", 
			"ifcontractSpc", "blockOpSpec", "loopSpec", "condExpression", "rEL_OP", 
			"compareUnit", "numericallit", "account", "paymentSpec", "contractInvocationSpec", 
			"ifpaymentSpec", "ifcontractInvocationSpec", "stateField", "arg", "argList", 
			"depSection", "depSpec", "identifierList", "operandName", "qualifiedIdent", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'('", "')'", "'account'", "'[]'", "'='", "'new'", 
			"'['", "']'", "'contract'", "'::'", "'for('", "':'", "'){'", "'}'", "'op'", 
			"'if('", "'else'", "'{'", "'loop('", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'.'", "'payment'", "'from'", "'to'", "'with'", "'as'", "'call'", 
			"'using'", "','", "'dep:'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", "FLOAT_LIT", 
			"IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", "BIG_U_VALUE", "STRING_LIT", 
			"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "HSlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {
	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the HIDDEN channel.
	            return false;
	        }

	        if (ahead.getType() == TERMINATOR) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WS) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == COMMENT && (text.contains("\r") || text.contains("\n"))) ||
	                (type == TERMINATOR);
	    }

	     /**
	     * Returns {@code true} if no line terminator exists between the specified
	     * token offset and the prior one on the {@code HIDDEN} channel.
	     *
	     * @return {@code true} if no line terminator exists between the specified
	     * token offset and the prior one on the {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorBetween(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        List<Token> tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());

	        if (tokens == null) {
	            return true;
	        }

	        for (Token token : tokens) {
	            if (token.getText().contains("\n"))
	                return false;
	        }

	        return true;
	    }

	     /**
	     * Returns {@code true} if no line terminator exists after any encounterd
	     * parameters beyond the specified token offset and the next on the
	     * {@code HIDDEN} channel.
	     *
	     * @return {@code true} if no line terminator exists after any encounterd
	     * parameters beyond the specified token offset and the next on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean noTerminatorAfterParams(int tokenOffset) {
	        BufferedTokenStream stream = (BufferedTokenStream)_input;
	        int leftParams = 1;
	        int rightParams = 0;
	        String value;
	        if (stream.LT(tokenOffset).getText().equals("(")) {
	            // Scan past parameters
	            while (leftParams != rightParams) {
	                tokenOffset++;
	                value = stream.LT(tokenOffset).getText();
	                if (value.equals("(")) {
	                    leftParams++;
	                }
	                else if (value.equals(")")) {
	                    rightParams++;
	                }
	            }

	            tokenOffset++;
	            return noTerminatorBetween(tokenOffset);
	        }

	        return true;
	    }

	public HSlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public List<OpSpecContext> opSpec() {
			return getRuleContexts(OpSpecContext.class);
		}
		public OpSpecContext opSpec(int i) {
			return getRuleContext(OpSpecContext.class,i);
		}
		public DepSectionContext depSection() {
			return getRuleContext(DepSectionContext.class,0);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(76);
				importDecl();
				setState(77);
				eos();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(84);
				varSpec();
				setState(85);
				eos();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__15) {
				{
				{
				setState(92);
				opSpec();
				setState(93);
				eos();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(100);
				depSection();
				setState(101);
				eos();
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

	public static class ImportDeclContext extends ParserRuleContext {
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(106);
			match(T__1);
			setState(107);
			importSpec();
			setState(108);
			match(T__2);
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

	public static class ImportSpecContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRING_LIT);
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

	public static class ArrDefinContext extends ParserRuleContext {
		public Token name;
		public NumericallitContext amt;
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public ArrDefinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrDefin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterArrDefin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitArrDefin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitArrDefin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrDefinContext arrDefin() throws RecognitionException {
		ArrDefinContext _localctx = new ArrDefinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrDefin);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__3);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(113);
					match(T__4);
					setState(114);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(115);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					setState(116);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119);
				match(T__5);
				setState(120);
				match(T__6);
				setState(121);
				match(T__3);
				setState(122);
				match(T__7);
				setState(123);
				((ArrDefinContext)_localctx).amt = numericallit();
				setState(124);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__9);
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(127);
					match(T__4);
					setState(128);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(129);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					setState(130);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(133);
				match(T__5);
				setState(134);
				match(T__6);
				setState(135);
				match(T__9);
				setState(136);
				match(T__7);
				setState(137);
				((ArrDefinContext)_localctx).amt = numericallit();
				setState(138);
				match(T__8);
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

	public static class ArrSpecContext extends ParserRuleContext {
		public Token name;
		public NumericallitContext amt;
		public Token chain;
		public Token address;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public ContractAddrContext contractAddr() {
			return getRuleContext(ContractAddrContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public ArrSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterArrSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitArrSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitArrSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrSpecContext arrSpec() throws RecognitionException {
		ArrSpecContext _localctx = new ArrSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((ArrSpecContext)_localctx).name = match(IDENTIFIER);
			setState(143);
			match(T__7);
			setState(144);
			((ArrSpecContext)_localctx).amt = numericallit();
			setState(145);
			match(T__8);
			setState(146);
			match(T__5);
			setState(147);
			((ArrSpecContext)_localctx).chain = match(IDENTIFIER);
			setState(148);
			match(T__10);
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LIT:
				{
				setState(149);
				((ArrSpecContext)_localctx).address = match(STRING_LIT);
				}
				break;
			case IDENTIFIER:
				{
				setState(150);
				contractAddr();
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

	public static class VarSpecContext extends ParserRuleContext {
		public AccountSpcContext accountSpc() {
			return getRuleContext(AccountSpcContext.class,0);
		}
		public ContractSpcContext contractSpc() {
			return getRuleContext(ContractSpcContext.class,0);
		}
		public ArrDefinContext arrDefin() {
			return getRuleContext(ArrDefinContext.class,0);
		}
		public ArrSpecContext arrSpec() {
			return getRuleContext(ArrSpecContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varSpec);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				accountSpc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				contractSpc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				arrDefin();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				arrSpec();
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

	public static class AccountSpcContext extends ParserRuleContext {
		public Token id;
		public Token chain;
		public Token address;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public AccountSpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accountSpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterAccountSpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitAccountSpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitAccountSpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccountSpcContext accountSpc() throws RecognitionException {
		AccountSpcContext _localctx = new AccountSpcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accountSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__3);
			setState(160);
			((AccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(161);
			match(T__5);
			setState(162);
			((AccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(163);
			match(T__10);
			setState(164);
			((AccountSpcContext)_localctx).address = match(STRING_LIT);
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

	public static class ContractSpcContext extends ParserRuleContext {
		public Token id;
		public Token chain;
		public ContractAddrContext contractAddr() {
			return getRuleContext(ContractAddrContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public ContractSpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractSpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterContractSpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitContractSpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitContractSpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractSpcContext contractSpc() throws RecognitionException {
		ContractSpcContext _localctx = new ContractSpcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contractSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__9);
			setState(167);
			((ContractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(168);
			match(T__5);
			setState(169);
			((ContractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(170);
			match(T__10);
			setState(171);
			contractAddr();
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

	public static class ContractAddrContext extends ParserRuleContext {
		public Token contract;
		public Token address;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public ContractAddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractAddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterContractAddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitContractAddr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitContractAddr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractAddrContext contractAddr() throws RecognitionException {
		ContractAddrContext _localctx = new ContractAddrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contractAddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((ContractAddrContext)_localctx).contract = match(IDENTIFIER);
			setState(174);
			match(T__1);
			setState(175);
			((ContractAddrContext)_localctx).address = match(STRING_LIT);
			setState(176);
			match(T__2);
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

	public static class OpSpecContext extends ParserRuleContext {
		public IfSpecContext ifSpec() {
			return getRuleContext(IfSpecContext.class,0);
		}
		public LoopSpecContext loopSpec() {
			return getRuleContext(LoopSpecContext.class,0);
		}
		public PaymentSpecContext paymentSpec() {
			return getRuleContext(PaymentSpecContext.class,0);
		}
		public ContractInvocationSpecContext contractInvocationSpec() {
			return getRuleContext(ContractInvocationSpecContext.class,0);
		}
		public ForeachSpecContext foreachSpec() {
			return getRuleContext(ForeachSpecContext.class,0);
		}
		public OpSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterOpSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitOpSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitOpSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSpecContext opSpec() throws RecognitionException {
		OpSpecContext _localctx = new OpSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opSpec);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				ifSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				loopSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				paymentSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				contractInvocationSpec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				foreachSpec();
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

	public static class ForeachSpecContext extends ParserRuleContext {
		public Token ac;
		public Token con;
		public Token name;
		public Token arryName;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<ForOpContext> forOp() {
			return getRuleContexts(ForOpContext.class);
		}
		public ForOpContext forOp(int i) {
			return getRuleContext(ForOpContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ForeachSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterForeachSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitForeachSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitForeachSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachSpecContext foreachSpec() throws RecognitionException {
		ForeachSpecContext _localctx = new ForeachSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foreachSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__11);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(186);
				((ForeachSpecContext)_localctx).ac = match(T__3);
				}
				break;
			case T__9:
				{
				setState(187);
				((ForeachSpecContext)_localctx).con = match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			((ForeachSpecContext)_localctx).name = match(IDENTIFIER);
			setState(191);
			match(T__12);
			setState(192);
			((ForeachSpecContext)_localctx).arryName = match(IDENTIFIER);
			setState(193);
			match(T__13);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(194);
				forOp();
				setState(195);
				eos();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__14);
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

	public static class ForOpContext extends ParserRuleContext {
		public PaymentSpecContext paymentSpec() {
			return getRuleContext(PaymentSpecContext.class,0);
		}
		public ContractInvocationSpecContext contractInvocationSpec() {
			return getRuleContext(ContractInvocationSpecContext.class,0);
		}
		public ForOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterForOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitForOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitForOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForOpContext forOp() throws RecognitionException {
		ForOpContext _localctx = new ForOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forOp);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				paymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				contractInvocationSpec();
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

	public static class IfSpecContext extends ParserRuleContext {
		public Token opname;
		public IfStatemntContext ifStatemnt() {
			return getRuleContext(IfStatemntContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public List<ElseStatementContext> elseStatement() {
			return getRuleContexts(ElseStatementContext.class);
		}
		public ElseStatementContext elseStatement(int i) {
			return getRuleContext(ElseStatementContext.class,i);
		}
		public IfSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSpecContext ifSpec() throws RecognitionException {
		IfSpecContext _localctx = new IfSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__15);
			setState(209);
			((IfSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(210);
			ifStatemnt();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					elseStatement();
					}
					} 
				}
				setState(216);
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
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatemntContext extends ParserRuleContext {
		public CondExpressionContext condExpression() {
			return getRuleContext(CondExpressionContext.class,0);
		}
		public List<IfSpecContext> ifSpec() {
			return getRuleContexts(IfSpecContext.class);
		}
		public IfSpecContext ifSpec(int i) {
			return getRuleContext(IfSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<BlockVarSpecContext> blockVarSpec() {
			return getRuleContexts(BlockVarSpecContext.class);
		}
		public BlockVarSpecContext blockVarSpec(int i) {
			return getRuleContext(BlockVarSpecContext.class,i);
		}
		public List<BlockOpSpecContext> blockOpSpec() {
			return getRuleContexts(BlockOpSpecContext.class);
		}
		public BlockOpSpecContext blockOpSpec(int i) {
			return getRuleContext(BlockOpSpecContext.class,i);
		}
		public IfStatemntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatemnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfStatemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfStatemnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfStatemnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatemntContext ifStatemnt() throws RecognitionException {
		IfStatemntContext _localctx = new IfStatemntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatemnt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__16);
			setState(218);
			condExpression();
			setState(219);
			match(T__13);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					ifSpec();
					setState(221);
					eos();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(228);
				blockVarSpec();
				setState(229);
				eos();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(236);
				blockOpSpec();
				setState(237);
				eos();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__14);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public List<IfSpecContext> ifSpec() {
			return getRuleContexts(IfSpecContext.class);
		}
		public IfSpecContext ifSpec(int i) {
			return getRuleContext(IfSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<BlockVarSpecContext> blockVarSpec() {
			return getRuleContexts(BlockVarSpecContext.class);
		}
		public BlockVarSpecContext blockVarSpec(int i) {
			return getRuleContext(BlockVarSpecContext.class,i);
		}
		public List<BlockOpSpecContext> blockOpSpec() {
			return getRuleContexts(BlockOpSpecContext.class);
		}
		public BlockOpSpecContext blockOpSpec(int i) {
			return getRuleContext(BlockOpSpecContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__17);
			setState(247);
			match(T__18);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					ifSpec();
					setState(249);
					eos();
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(256);
				blockVarSpec();
				setState(257);
				eos();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(264);
				blockOpSpec();
				setState(265);
				eos();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(T__14);
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

	public static class BlockVarSpecContext extends ParserRuleContext {
		public IfaccountSpcContext ifaccountSpc() {
			return getRuleContext(IfaccountSpcContext.class,0);
		}
		public IfcontractSpcContext ifcontractSpc() {
			return getRuleContext(IfcontractSpcContext.class,0);
		}
		public BlockVarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockVarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterBlockVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitBlockVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitBlockVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockVarSpecContext blockVarSpec() throws RecognitionException {
		BlockVarSpecContext _localctx = new BlockVarSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockVarSpec);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				ifaccountSpc();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				ifcontractSpc();
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

	public static class IfaccountSpcContext extends ParserRuleContext {
		public Token id;
		public Token chain;
		public Token address;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public IfaccountSpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifaccountSpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfaccountSpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfaccountSpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfaccountSpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfaccountSpcContext ifaccountSpc() throws RecognitionException {
		IfaccountSpcContext _localctx = new IfaccountSpcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifaccountSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__3);
			setState(279);
			((IfaccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(280);
			match(T__5);
			setState(281);
			((IfaccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(282);
			match(T__10);
			setState(283);
			((IfaccountSpcContext)_localctx).address = match(STRING_LIT);
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

	public static class IfcontractSpcContext extends ParserRuleContext {
		public Token id;
		public Token chain;
		public ContractAddrContext contractAddr() {
			return getRuleContext(ContractAddrContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public IfcontractSpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcontractSpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfcontractSpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfcontractSpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfcontractSpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcontractSpcContext ifcontractSpc() throws RecognitionException {
		IfcontractSpcContext _localctx = new IfcontractSpcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifcontractSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__9);
			setState(286);
			((IfcontractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(287);
			match(T__5);
			setState(288);
			((IfcontractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(289);
			match(T__10);
			setState(290);
			contractAddr();
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

	public static class BlockOpSpecContext extends ParserRuleContext {
		public IfpaymentSpecContext ifpaymentSpec() {
			return getRuleContext(IfpaymentSpecContext.class,0);
		}
		public IfcontractInvocationSpecContext ifcontractInvocationSpec() {
			return getRuleContext(IfcontractInvocationSpecContext.class,0);
		}
		public BlockOpSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOpSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterBlockOpSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitBlockOpSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitBlockOpSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOpSpecContext blockOpSpec() throws RecognitionException {
		BlockOpSpecContext _localctx = new BlockOpSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockOpSpec);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				ifpaymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				ifcontractInvocationSpec();
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

	public static class LoopSpecContext extends ParserRuleContext {
		public Token opname;
		public NumericallitContext times;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public List<IfSpecContext> ifSpec() {
			return getRuleContexts(IfSpecContext.class);
		}
		public IfSpecContext ifSpec(int i) {
			return getRuleContext(IfSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<BlockVarSpecContext> blockVarSpec() {
			return getRuleContexts(BlockVarSpecContext.class);
		}
		public BlockVarSpecContext blockVarSpec(int i) {
			return getRuleContext(BlockVarSpecContext.class,i);
		}
		public List<BlockOpSpecContext> blockOpSpec() {
			return getRuleContexts(BlockOpSpecContext.class);
		}
		public BlockOpSpecContext blockOpSpec(int i) {
			return getRuleContext(BlockOpSpecContext.class,i);
		}
		public LoopSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterLoopSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitLoopSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitLoopSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopSpecContext loopSpec() throws RecognitionException {
		LoopSpecContext _localctx = new LoopSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__15);
			setState(297);
			((LoopSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(298);
			match(T__19);
			setState(299);
			((LoopSpecContext)_localctx).times = numericallit();
			setState(300);
			match(T__13);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					ifSpec();
					setState(302);
					eos();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(309);
				blockVarSpec();
				setState(310);
				eos();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(317);
				blockOpSpec();
				setState(318);
				eos();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__14);
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

	public static class CondExpressionContext extends ParserRuleContext {
		public CompareUnitContext cond1;
		public REL_OPContext compare;
		public CompareUnitContext cond2;
		public List<CompareUnitContext> compareUnit() {
			return getRuleContexts(CompareUnitContext.class);
		}
		public CompareUnitContext compareUnit(int i) {
			return getRuleContext(CompareUnitContext.class,i);
		}
		public REL_OPContext rEL_OP() {
			return getRuleContext(REL_OPContext.class,0);
		}
		public CondExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterCondExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitCondExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitCondExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpressionContext condExpression() throws RecognitionException {
		CondExpressionContext _localctx = new CondExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((CondExpressionContext)_localctx).cond1 = compareUnit();
			setState(328);
			((CondExpressionContext)_localctx).compare = rEL_OP();
			setState(329);
			((CondExpressionContext)_localctx).cond2 = compareUnit();
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

	public static class REL_OPContext extends ParserRuleContext {
		public Token equal;
		public Token neq;
		public Token smal;
		public Token smequ;
		public Token larg;
		public Token largequ;
		public REL_OPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rEL_OP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterREL_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitREL_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitREL_OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final REL_OPContext rEL_OP() throws RecognitionException {
		REL_OPContext _localctx = new REL_OPContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rEL_OP);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((REL_OPContext)_localctx).equal = match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((REL_OPContext)_localctx).neq = match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				((REL_OPContext)_localctx).smal = match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				((REL_OPContext)_localctx).smequ = match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				((REL_OPContext)_localctx).larg = match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				((REL_OPContext)_localctx).largequ = match(T__25);
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

	public static class CompareUnitContext extends ParserRuleContext {
		public NumericallitContext number;
		public Token name;
		public Token recv;
		public Token method;
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public CompareUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterCompareUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitCompareUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitCompareUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareUnitContext compareUnit() throws RecognitionException {
		CompareUnitContext _localctx = new CompareUnitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compareUnit);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				((CompareUnitContext)_localctx).number = numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((CompareUnitContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				((CompareUnitContext)_localctx).recv = match(IDENTIFIER);
				setState(342);
				match(T__26);
				setState(343);
				((CompareUnitContext)_localctx).method = match(IDENTIFIER);
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

	public static class NumericallitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(HSlangParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(HSlangParser.FLOAT_LIT, 0); }
		public NumericallitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericallit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterNumericallit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitNumericallit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitNumericallit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericallitContext numericallit() throws RecognitionException {
		NumericallitContext _localctx = new NumericallitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numericallit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==INT_LIT || _la==FLOAT_LIT) ) {
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

	public static class AccountContext extends ParserRuleContext {
		public Token fromacct;
		public Token accAr;
		public NumericallitContext index;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public AccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterAccount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitAccount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitAccount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccountContext account() throws RecognitionException {
		AccountContext _localctx = new AccountContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_account);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				((AccountContext)_localctx).fromacct = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				((AccountContext)_localctx).accAr = match(IDENTIFIER);
				setState(350);
				match(T__7);
				setState(351);
				((AccountContext)_localctx).index = numericallit();
				setState(352);
				match(T__8);
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

	public static class PaymentSpecContext extends ParserRuleContext {
		public Token opname;
		public NumericallitContext amt;
		public StateFieldContext contract;
		public Token unit;
		public AccountContext from;
		public AccountContext toacc;
		public NumericallitContext amtuint;
		public NumericallitContext newamt;
		public Token newuint;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public List<TerminalNode> STRING_LIT() { return getTokens(HSlangParser.STRING_LIT); }
		public TerminalNode STRING_LIT(int i) {
			return getToken(HSlangParser.STRING_LIT, i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public List<NumericallitContext> numericallit() {
			return getRuleContexts(NumericallitContext.class);
		}
		public NumericallitContext numericallit(int i) {
			return getRuleContext(NumericallitContext.class,i);
		}
		public StateFieldContext stateField() {
			return getRuleContext(StateFieldContext.class,0);
		}
		public PaymentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paymentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterPaymentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitPaymentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitPaymentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaymentSpecContext paymentSpec() throws RecognitionException {
		PaymentSpecContext _localctx = new PaymentSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_paymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__15);
			setState(357);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(358);
			match(T__27);
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(359);
				((PaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(360);
				((PaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(363);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(364);
			match(T__28);
			{
			setState(365);
			((PaymentSpecContext)_localctx).from = account();
			}
			setState(366);
			match(T__29);
			setState(367);
			((PaymentSpecContext)_localctx).toacc = account();
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(368);
				match(T__30);
				setState(369);
				((PaymentSpecContext)_localctx).amtuint = numericallit();
				setState(370);
				match(STRING_LIT);
				setState(371);
				match(T__31);
				setState(372);
				((PaymentSpecContext)_localctx).newamt = numericallit();
				setState(373);
				((PaymentSpecContext)_localctx).newuint = match(STRING_LIT);
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

	public static class ContractInvocationSpecContext extends ParserRuleContext {
		public Token opname;
		public Token recv;
		public Token method;
		public ArgListContext args;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ContractInvocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractInvocationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterContractInvocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitContractInvocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitContractInvocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractInvocationSpecContext contractInvocationSpec() throws RecognitionException {
		ContractInvocationSpecContext _localctx = new ContractInvocationSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_contractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__15);
			setState(378);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(379);
			match(T__32);
			setState(380);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(381);
			match(T__26);
			setState(382);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(383);
			match(T__1);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(384);
				((ContractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(387);
			match(T__2);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(T__33);
					setState(389);
					account();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class IfpaymentSpecContext extends ParserRuleContext {
		public Token opname;
		public NumericallitContext amt;
		public StateFieldContext contract;
		public Token unit;
		public AccountContext from;
		public AccountContext toacc;
		public NumericallitContext amtuint;
		public NumericallitContext newamt;
		public Token newuint;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public List<TerminalNode> STRING_LIT() { return getTokens(HSlangParser.STRING_LIT); }
		public TerminalNode STRING_LIT(int i) {
			return getToken(HSlangParser.STRING_LIT, i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public List<NumericallitContext> numericallit() {
			return getRuleContexts(NumericallitContext.class);
		}
		public NumericallitContext numericallit(int i) {
			return getRuleContext(NumericallitContext.class,i);
		}
		public StateFieldContext stateField() {
			return getRuleContext(StateFieldContext.class,0);
		}
		public IfpaymentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifpaymentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfpaymentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfpaymentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfpaymentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfpaymentSpecContext ifpaymentSpec() throws RecognitionException {
		IfpaymentSpecContext _localctx = new IfpaymentSpecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifpaymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__15);
			setState(396);
			((IfpaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(397);
			match(T__27);
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(398);
				((IfpaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(399);
				((IfpaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			((IfpaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(403);
			match(T__28);
			{
			setState(404);
			((IfpaymentSpecContext)_localctx).from = account();
			}
			setState(405);
			match(T__29);
			setState(406);
			((IfpaymentSpecContext)_localctx).toacc = account();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(407);
				match(T__30);
				setState(408);
				((IfpaymentSpecContext)_localctx).amtuint = numericallit();
				setState(409);
				match(STRING_LIT);
				setState(410);
				match(T__31);
				setState(411);
				((IfpaymentSpecContext)_localctx).newamt = numericallit();
				setState(412);
				((IfpaymentSpecContext)_localctx).newuint = match(STRING_LIT);
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

	public static class IfcontractInvocationSpecContext extends ParserRuleContext {
		public Token opname;
		public Token recv;
		public Token method;
		public ArgListContext args;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<AccountContext> account() {
			return getRuleContexts(AccountContext.class);
		}
		public AccountContext account(int i) {
			return getRuleContext(AccountContext.class,i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IfcontractInvocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcontractInvocationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIfcontractInvocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIfcontractInvocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIfcontractInvocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcontractInvocationSpecContext ifcontractInvocationSpec() throws RecognitionException {
		IfcontractInvocationSpecContext _localctx = new IfcontractInvocationSpecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifcontractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__15);
			setState(417);
			((IfcontractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(418);
			match(T__32);
			setState(419);
			((IfcontractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(420);
			match(T__26);
			setState(421);
			((IfcontractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(422);
			match(T__1);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(423);
				((IfcontractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(426);
			match(T__2);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					match(T__33);
					setState(428);
					account();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class StateFieldContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public StateFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterStateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitStateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitStateField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateFieldContext stateField() throws RecognitionException {
		StateFieldContext _localctx = new StateFieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stateField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(IDENTIFIER);
			setState(435);
			match(T__26);
			setState(436);
			match(IDENTIFIER);
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

	public static class ArgContext extends ParserRuleContext {
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arg);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(STRING_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				match(IDENTIFIER);
				setState(442);
				match(T__26);
				setState(443);
				match(IDENTIFIER);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			arg();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(447);
				match(T__34);
				setState(448);
				arg();
				}
				}
				setState(453);
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

	public static class DepSectionContext extends ParserRuleContext {
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<DepSpecContext> depSpec() {
			return getRuleContexts(DepSpecContext.class);
		}
		public DepSpecContext depSpec(int i) {
			return getRuleContext(DepSpecContext.class,i);
		}
		public DepSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterDepSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitDepSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitDepSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepSectionContext depSection() throws RecognitionException {
		DepSectionContext _localctx = new DepSectionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_depSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__35);
			setState(455);
			eos();
			setState(456);
			depSpec();
			setState(457);
			eos();
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					depSpec();
					setState(459);
					eos();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class DepSpecContext extends ParserRuleContext {
		public Token left;
		public Token dep;
		public IdentifierListContext right;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DepSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterDepSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitDepSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitDepSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepSpecContext depSpec() throws RecognitionException {
		DepSpecContext _localctx = new DepSpecContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_depSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(467);
			((DepSpecContext)_localctx).dep = match(IDENTIFIER);
			setState(468);
			((DepSpecContext)_localctx).right = identifierList();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(IDENTIFIER);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(471);
					match(T__34);
					setState(472);
					match(IDENTIFIER);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitOperandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitOperandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operandName);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				qualifiedIdent();
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitQualifiedIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitQualifiedIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(IDENTIFIER);
			setState(483);
			match(T__26);
			setState(484);
			match(IDENTIFIER);
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HSlangParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_eos);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				if (!(_input.LT(1).getText().equals("}") )) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"}\") ");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lineTerminatorAhead();
		case 1:
			return _input.LT(1).getText().equals("}") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2"+
		"\16\2e\13\2\3\2\3\2\3\2\5\2j\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0086\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u009a\n\6\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\5\f\u00bf\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3\f\3\f\3"+
		"\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\3\16\7\16\u00d7\n\16\f\16\16\16\u00da"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e2\n\17\f\17\16\17\u00e5"+
		"\13\17\3\17\3\17\3\17\7\17\u00ea\n\17\f\17\16\17\u00ed\13\17\3\17\3\17"+
		"\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00fe\n\20\f\20\16\20\u0101\13\20\3\20\3\20\3\20\7\20"+
		"\u0106\n\20\f\20\16\20\u0109\13\20\3\20\3\20\3\20\7\20\u010e\n\20\f\20"+
		"\16\20\u0111\13\20\3\20\3\20\3\21\3\21\5\21\u0117\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u0129\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0133\n\25\f"+
		"\25\16\25\u0136\13\25\3\25\3\25\3\25\7\25\u013b\n\25\f\25\16\25\u013e"+
		"\13\25\3\25\3\25\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0154\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u015b\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0165\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u016c\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017a\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0184\n\34\3\34\3\34\3\34"+
		"\7\34\u0189\n\34\f\34\16\34\u018c\13\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0193\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01a1\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ab\n"+
		"\36\3\36\3\36\3\36\7\36\u01b0\n\36\f\36\16\36\u01b3\13\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \5 \u01bf\n \3!\3!\3!\7!\u01c4\n!\f!\16!\u01c7"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01d0\n\"\f\"\16\"\u01d3\13\"\3#"+
		"\3#\3#\3#\3$\3$\3$\7$\u01dc\n$\f$\16$\u01df\13$\3%\3%\5%\u01e3\n%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01ed\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2+,\2\u0200\2S\3"+
		"\2\2\2\4k\3\2\2\2\6p\3\2\2\2\b\u008e\3\2\2\2\n\u0090\3\2\2\2\f\u009f\3"+
		"\2\2\2\16\u00a1\3\2\2\2\20\u00a8\3\2\2\2\22\u00af\3\2\2\2\24\u00b9\3\2"+
		"\2\2\26\u00bb\3\2\2\2\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34\u00db\3\2\2"+
		"\2\36\u00f8\3\2\2\2 \u0116\3\2\2\2\"\u0118\3\2\2\2$\u011f\3\2\2\2&\u0128"+
		"\3\2\2\2(\u012a\3\2\2\2*\u0149\3\2\2\2,\u0153\3\2\2\2.\u015a\3\2\2\2\60"+
		"\u015c\3\2\2\2\62\u0164\3\2\2\2\64\u0166\3\2\2\2\66\u017b\3\2\2\28\u018d"+
		"\3\2\2\2:\u01a2\3\2\2\2<\u01b4\3\2\2\2>\u01be\3\2\2\2@\u01c0\3\2\2\2B"+
		"\u01c8\3\2\2\2D\u01d4\3\2\2\2F\u01d8\3\2\2\2H\u01e2\3\2\2\2J\u01e4\3\2"+
		"\2\2L\u01ec\3\2\2\2NO\5\4\3\2OP\5L\'\2PR\3\2\2\2QN\3\2\2\2RU\3\2\2\2S"+
		"Q\3\2\2\2ST\3\2\2\2T[\3\2\2\2US\3\2\2\2VW\5\f\7\2WX\5L\'\2XZ\3\2\2\2Y"+
		"V\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\c\3\2\2\2][\3\2\2\2^_\5\24\13"+
		"\2_`\5L\'\2`b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2\2"+
		"\2ec\3\2\2\2fg\5B\"\2gh\5L\'\2hj\3\2\2\2if\3\2\2\2ij\3\2\2\2j\3\3\2\2"+
		"\2kl\7\3\2\2lm\7\4\2\2mn\5\6\4\2no\7\5\2\2o\5\3\2\2\2pq\7\61\2\2q\7\3"+
		"\2\2\2rw\7\6\2\2st\7\7\2\2tx\7(\2\2uv\7(\2\2vx\7\7\2\2ws\3\2\2\2wu\3\2"+
		"\2\2xy\3\2\2\2yz\7\b\2\2z{\7\t\2\2{|\7\6\2\2|}\7\n\2\2}~\5\60\31\2~\177"+
		"\7\13\2\2\177\u008f\3\2\2\2\u0080\u0085\7\f\2\2\u0081\u0082\7\7\2\2\u0082"+
		"\u0086\7(\2\2\u0083\u0084\7(\2\2\u0084\u0086\7\7\2\2\u0085\u0081\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089"+
		"\7\t\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7\n\2\2\u008b\u008c\5\60\31\2"+
		"\u008c\u008d\7\13\2\2\u008d\u008f\3\2\2\2\u008er\3\2\2\2\u008e\u0080\3"+
		"\2\2\2\u008f\t\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092\7\n\2\2\u0092\u0093"+
		"\5\60\31\2\u0093\u0094\7\13\2\2\u0094\u0095\7\b\2\2\u0095\u0096\7(\2\2"+
		"\u0096\u0099\7\r\2\2\u0097\u009a\7\61\2\2\u0098\u009a\5\22\n\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\13\3\2\2\2\u009b\u00a0\5\16\b\2\u009c"+
		"\u00a0\5\20\t\2\u009d\u00a0\5\b\5\2\u009e\u00a0\5\n\6\2\u009f\u009b\3"+
		"\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7\b\2\2"+
		"\u00a4\u00a5\7(\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\7\61\2\2\u00a7\17"+
		"\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\u00ac\7(\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\5\22\n\2\u00ae\21\3\2\2"+
		"\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3"+
		"\7\5\2\2\u00b3\23\3\2\2\2\u00b4\u00ba\5\32\16\2\u00b5\u00ba\5(\25\2\u00b6"+
		"\u00ba\5\64\33\2\u00b7\u00ba\5\66\34\2\u00b8\u00ba\5\26\f\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00be\7\16\2\2\u00bc\u00bf\7\6\2"+
		"\2\u00bd\u00bf\7\f\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7(\2\2\u00c3"+
		"\u00c9\7\20\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\5L\'\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\21"+
		"\2\2\u00cd\27\3\2\2\2\u00ce\u00d1\5\64\33\2\u00cf\u00d1\5\66\34\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7\22\2"+
		"\2\u00d3\u00d4\7(\2\2\u00d4\u00d8\5\34\17\2\u00d5\u00d7\5\36\20\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\33\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd"+
		"\5*\26\2\u00dd\u00e3\7\20\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\5L\'\2"+
		"\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00eb\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\5 \21\2\u00e7\u00e8\5L\'\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f3\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\5L"+
		"\'\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7\21\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9"+
		"\u00ff\7\25\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\5L\'\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0107\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5 "+
		"\21\2\u0103\u0104\5L\'\2\u0104\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010f\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5&\24\2\u010b\u010c\5L\'\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\21\2\2\u0113\37\3\2\2\2\u0114\u0117\5\"\22\2\u0115\u0117\5$\23"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117!\3\2\2\2\u0118\u0119"+
		"\7\6\2\2\u0119\u011a\7(\2\2\u011a\u011b\7\b\2\2\u011b\u011c\7(\2\2\u011c"+
		"\u011d\7\r\2\2\u011d\u011e\7\61\2\2\u011e#\3\2\2\2\u011f\u0120\7\f\2\2"+
		"\u0120\u0121\7(\2\2\u0121\u0122\7\b\2\2\u0122\u0123\7(\2\2\u0123\u0124"+
		"\7\r\2\2\u0124\u0125\5\22\n\2\u0125%\3\2\2\2\u0126\u0129\58\35\2\u0127"+
		"\u0129\5:\36\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\'\3\2\2\2"+
		"\u012a\u012b\7\22\2\2\u012b\u012c\7(\2\2\u012c\u012d\7\26\2\2\u012d\u012e"+
		"\5\60\31\2\u012e\u0134\7\20\2\2\u012f\u0130\5\32\16\2\u0130\u0131\5L\'"+
		"\2\u0131\u0133\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013c\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\5 \21\2\u0138\u0139\5L\'\2\u0139\u013b\3\2\2\2\u013a\u0137\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0144\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5&\24\2\u0140\u0141\5L"+
		"\'\2\u0141\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0148\7\21\2\2\u0148)\3\2\2\2\u0149\u014a\5.\30\2\u014a\u014b"+
		"\5,\27\2\u014b\u014c\5.\30\2\u014c+\3\2\2\2\u014d\u0154\7\27\2\2\u014e"+
		"\u0154\7\30\2\2\u014f\u0154\7\31\2\2\u0150\u0154\7\32\2\2\u0151\u0154"+
		"\7\33\2\2\u0152\u0154\7\34\2\2\u0153\u014d\3\2\2\2\u0153\u014e\3\2\2\2"+
		"\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154-\3\2\2\2\u0155\u015b\5\60\31\2\u0156\u015b\7(\2\2\u0157"+
		"\u0158\7(\2\2\u0158\u0159\7\35\2\2\u0159\u015b\7(\2\2\u015a\u0155\3\2"+
		"\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015b/\3\2\2\2\u015c\u015d"+
		"\t\2\2\2\u015d\61\3\2\2\2\u015e\u0165\7(\2\2\u015f\u0160\7(\2\2\u0160"+
		"\u0161\7\n\2\2\u0161\u0162\5\60\31\2\u0162\u0163\7\13\2\2\u0163\u0165"+
		"\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0165\63\3\2\2\2\u0166"+
		"\u0167\7\22\2\2\u0167\u0168\7(\2\2\u0168\u016b\7\36\2\2\u0169\u016c\5"+
		"\60\31\2\u016a\u016c\5<\37\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\7\61\2\2\u016e\u016f\7\37\2\2\u016f\u0170\5"+
		"\62\32\2\u0170\u0171\7 \2\2\u0171\u0179\5\62\32\2\u0172\u0173\7!\2\2\u0173"+
		"\u0174\5\60\31\2\u0174\u0175\7\61\2\2\u0175\u0176\7\"\2\2\u0176\u0177"+
		"\5\60\31\2\u0177\u0178\7\61\2\2\u0178\u017a\3\2\2\2\u0179\u0172\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\65\3\2\2\2\u017b\u017c\7\22\2\2\u017c\u017d"+
		"\7(\2\2\u017d\u017e\7#\2\2\u017e\u017f\7(\2\2\u017f\u0180\7\35\2\2\u0180"+
		"\u0181\7(\2\2\u0181\u0183\7\4\2\2\u0182\u0184\5@!\2\u0183\u0182\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018a\7\5\2\2\u0186\u0187"+
		"\7$\2\2\u0187\u0189\5\62\32\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2"+
		"\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\67\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018d\u018e\7\22\2\2\u018e\u018f\7(\2\2\u018f\u0192\7\36\2\2"+
		"\u0190\u0193\5\60\31\2\u0191\u0193\5<\37\2\u0192\u0190\3\2\2\2\u0192\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7\37\2\2"+
		"\u0196\u0197\5\62\32\2\u0197\u0198\7 \2\2\u0198\u01a0\5\62\32\2\u0199"+
		"\u019a\7!\2\2\u019a\u019b\5\60\31\2\u019b\u019c\7\61\2\2\u019c\u019d\7"+
		"\"\2\2\u019d\u019e\5\60\31\2\u019e\u019f\7\61\2\2\u019f\u01a1\3\2\2\2"+
		"\u01a0\u0199\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a19\3\2\2\2\u01a2\u01a3\7"+
		"\22\2\2\u01a3\u01a4\7(\2\2\u01a4\u01a5\7#\2\2\u01a5\u01a6\7(\2\2\u01a6"+
		"\u01a7\7\35\2\2\u01a7\u01a8\7(\2\2\u01a8\u01aa\7\4\2\2\u01a9\u01ab\5@"+
		"!\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01b1\7\5\2\2\u01ad\u01ae\7$\2\2\u01ae\u01b0\5\62\32\2\u01af\u01ad\3"+
		"\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		";\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7(\2\2\u01b5\u01b6\7\35\2\2"+
		"\u01b6\u01b7\7(\2\2\u01b7=\3\2\2\2\u01b8\u01bf\5\60\31\2\u01b9\u01bf\7"+
		"\61\2\2\u01ba\u01bf\7(\2\2\u01bb\u01bc\7(\2\2\u01bc\u01bd\7\35\2\2\u01bd"+
		"\u01bf\7(\2\2\u01be\u01b8\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2"+
		"\2\2\u01be\u01bb\3\2\2\2\u01bf?\3\2\2\2\u01c0\u01c5\5> \2\u01c1\u01c2"+
		"\7%\2\2\u01c2\u01c4\5> \2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6A\3\2\2\2\u01c7\u01c5\3\2\2\2"+
		"\u01c8\u01c9\7&\2\2\u01c9\u01ca\5L\'\2\u01ca\u01cb\5D#\2\u01cb\u01d1\5"+
		"L\'\2\u01cc\u01cd\5D#\2\u01cd\u01ce\5L\'\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"C\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7(\2\2\u01d5\u01d6\7(\2\2\u01d6"+
		"\u01d7\5F$\2\u01d7E\3\2\2\2\u01d8\u01dd\7(\2\2\u01d9\u01da\7%\2\2\u01da"+
		"\u01dc\7(\2\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01deG\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e3"+
		"\7(\2\2\u01e1\u01e3\5J&\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"I\3\2\2\2\u01e4\u01e5\7(\2\2\u01e5\u01e6\7\35\2\2\u01e6\u01e7\7(\2\2\u01e7"+
		"K\3\2\2\2\u01e8\u01ed\7\'\2\2\u01e9\u01ed\7\2\2\3\u01ea\u01ed\6\'\2\2"+
		"\u01eb\u01ed\6\'\3\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edM\3\2\2\2,S[ciw\u0085\u008e\u0099\u009f"+
		"\u00b9\u00be\u00c9\u00d0\u00d8\u00e3\u00eb\u00f3\u00ff\u0107\u010f\u0116"+
		"\u0128\u0134\u013c\u0144\u0153\u015a\u0164\u016b\u0179\u0183\u018a\u0192"+
		"\u01a0\u01aa\u01b1\u01be\u01c5\u01d1\u01dd\u01e2\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}