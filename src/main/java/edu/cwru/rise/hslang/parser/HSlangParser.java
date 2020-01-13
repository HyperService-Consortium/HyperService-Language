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
		IDENTIFIER=32, KEYWORD=33, BINARY_OP=34, INT_LIT=35, FLOAT_LIT=36, IMAGINARY_LIT=37, 
		RUNE_LIT=38, LITTLE_U_VALUE=39, BIG_U_VALUE=40, STRING_LIT=41, WS=42, 
		COMMENT=43, TERMINATOR=44, LINE_COMMENT=45;
	public static final int
		RULE_sourceFile = 0, RULE_importDecl = 1, RULE_importSpec = 2, RULE_varSpec = 3, 
		RULE_accountSpc = 4, RULE_contractSpc = 5, RULE_contractAddr = 6, RULE_opSpec = 7, 
		RULE_ifSpec = 8, RULE_ifStatemnt = 9, RULE_elseStatement = 10, RULE_blockVarSpec = 11, 
		RULE_ifaccountSpc = 12, RULE_ifcontractSpc = 13, RULE_blockOpSpec = 14, 
		RULE_loopSpec = 15, RULE_condExpression = 16, RULE_rEL_OP = 17, RULE_compareUnit = 18, 
		RULE_numericallit = 19, RULE_paymentSpec = 20, RULE_contractInvocationSpec = 21, 
		RULE_ifpaymentSpec = 22, RULE_ifcontractInvocationSpec = 23, RULE_stateField = 24, 
		RULE_arg = 25, RULE_argList = 26, RULE_depSection = 27, RULE_depSpec = 28, 
		RULE_identifierList = 29, RULE_operandName = 30, RULE_qualifiedIdent = 31, 
		RULE_eos = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importDecl", "importSpec", "varSpec", "accountSpc", "contractSpc", 
			"contractAddr", "opSpec", "ifSpec", "ifStatemnt", "elseStatement", "blockVarSpec", 
			"ifaccountSpc", "ifcontractSpc", "blockOpSpec", "loopSpec", "condExpression", 
			"rEL_OP", "compareUnit", "numericallit", "paymentSpec", "contractInvocationSpec", 
			"ifpaymentSpec", "ifcontractInvocationSpec", "stateField", "arg", "argList", 
			"depSection", "depSpec", "identifierList", "operandName", "qualifiedIdent", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'('", "')'", "'account'", "'='", "'::'", "'contract'", 
			"'if('", "'){'", "'}'", "'else'", "'{'", "'loop('", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'.'", "'op'", "'payment'", "'from'", "'to'", 
			"'with'", "'as'", "'call'", "'using'", "','", "'dep:'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(66);
				importDecl();
				setState(67);
				eos();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(74);
				varSpec();
				setState(75);
				eos();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__20))) != 0)) {
				{
				{
				setState(82);
				opSpec();
				setState(83);
				eos();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(90);
				depSection();
				setState(91);
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
			setState(95);
			match(T__0);
			setState(96);
			match(T__1);
			setState(97);
			importSpec();
			setState(98);
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
			setState(100);
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

	public static class VarSpecContext extends ParserRuleContext {
		public AccountSpcContext accountSpc() {
			return getRuleContext(AccountSpcContext.class,0);
		}
		public ContractSpcContext contractSpc() {
			return getRuleContext(ContractSpcContext.class,0);
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
		enterRule(_localctx, 6, RULE_varSpec);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				accountSpc();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				contractSpc();
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
		enterRule(_localctx, 8, RULE_accountSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			((AccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(108);
			match(T__4);
			setState(109);
			((AccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(110);
			match(T__5);
			setState(111);
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
		enterRule(_localctx, 10, RULE_contractSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(114);
			((ContractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(115);
			match(T__4);
			setState(116);
			((ContractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(117);
			match(T__5);
			setState(118);
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
		enterRule(_localctx, 12, RULE_contractAddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ContractAddrContext)_localctx).contract = match(IDENTIFIER);
			setState(121);
			match(T__1);
			setState(122);
			((ContractAddrContext)_localctx).address = match(STRING_LIT);
			setState(123);
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
		enterRule(_localctx, 14, RULE_opSpec);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				ifSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				loopSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				paymentSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
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
		public IfStatemntContext ifStatemnt() {
			return getRuleContext(IfStatemntContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_ifSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			ifStatemnt();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					elseStatement();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 18, RULE_ifStatemnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__7);
			setState(139);
			condExpression();
			setState(140);
			match(T__8);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(141);
				ifSpec();
				setState(142);
				eos();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(149);
				blockVarSpec();
				setState(150);
				eos();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(157);
				blockOpSpec();
				setState(158);
				eos();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__9);
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
		enterRule(_localctx, 20, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__10);
			setState(168);
			match(T__11);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(169);
				ifSpec();
				setState(170);
				eos();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(177);
				blockVarSpec();
				setState(178);
				eos();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(185);
				blockOpSpec();
				setState(186);
				eos();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__9);
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
		enterRule(_localctx, 22, RULE_blockVarSpec);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				ifaccountSpc();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
		enterRule(_localctx, 24, RULE_ifaccountSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__3);
			setState(200);
			((IfaccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(201);
			match(T__4);
			setState(202);
			((IfaccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(203);
			match(T__5);
			setState(204);
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
		enterRule(_localctx, 26, RULE_ifcontractSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__6);
			setState(207);
			((IfcontractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(208);
			match(T__4);
			setState(209);
			((IfcontractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(210);
			match(T__5);
			setState(211);
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
		enterRule(_localctx, 28, RULE_blockOpSpec);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				ifpaymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
		public NumericallitContext times;
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public List<BlockVarSpecContext> blockVarSpec() {
			return getRuleContexts(BlockVarSpecContext.class);
		}
		public BlockVarSpecContext blockVarSpec(int i) {
			return getRuleContext(BlockVarSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
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
		enterRule(_localctx, 30, RULE_loopSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__12);
			setState(218);
			((LoopSpecContext)_localctx).times = numericallit();
			setState(219);
			match(T__8);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(220);
				blockVarSpec();
				setState(221);
				eos();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(228);
				blockOpSpec();
				setState(229);
				eos();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__9);
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
		enterRule(_localctx, 32, RULE_condExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((CondExpressionContext)_localctx).cond1 = compareUnit();
			setState(239);
			((CondExpressionContext)_localctx).compare = rEL_OP();
			setState(240);
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
		enterRule(_localctx, 34, RULE_rEL_OP);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((REL_OPContext)_localctx).equal = match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((REL_OPContext)_localctx).neq = match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((REL_OPContext)_localctx).smal = match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				((REL_OPContext)_localctx).smequ = match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				((REL_OPContext)_localctx).larg = match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				((REL_OPContext)_localctx).largequ = match(T__18);
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
		enterRule(_localctx, 36, RULE_compareUnit);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((CompareUnitContext)_localctx).number = numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((CompareUnitContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((CompareUnitContext)_localctx).recv = match(IDENTIFIER);
				setState(253);
				match(T__19);
				setState(254);
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
		enterRule(_localctx, 38, RULE_numericallit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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

	public static class PaymentSpecContext extends ParserRuleContext {
		public Token opname;
		public NumericallitContext amt;
		public StateFieldContext contract;
		public Token unit;
		public Token fromacct;
		public Token toacct;
		public NumericallitContext amtuint;
		public NumericallitContext newamt;
		public Token newuint;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING_LIT() { return getTokens(HSlangParser.STRING_LIT); }
		public TerminalNode STRING_LIT(int i) {
			return getToken(HSlangParser.STRING_LIT, i);
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
		enterRule(_localctx, 40, RULE_paymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__20);
			setState(260);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(261);
			match(T__21);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(262);
				((PaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(263);
				((PaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(267);
			match(T__22);
			setState(268);
			((PaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(269);
			match(T__23);
			setState(270);
			((PaymentSpecContext)_localctx).toacct = match(IDENTIFIER);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271);
				match(T__24);
				setState(272);
				((PaymentSpecContext)_localctx).amtuint = numericallit();
				setState(273);
				match(STRING_LIT);
				setState(274);
				match(T__25);
				setState(275);
				((PaymentSpecContext)_localctx).newamt = numericallit();
				setState(276);
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
		public Token acct;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
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
		enterRule(_localctx, 42, RULE_contractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__20);
			setState(281);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(282);
			match(T__26);
			setState(283);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(284);
			match(T__19);
			setState(285);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(286);
			match(T__1);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(287);
				((ContractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(290);
			match(T__2);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					match(T__27);
					setState(292);
					((ContractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public Token fromacct;
		public Token toacct;
		public NumericallitContext amtuint;
		public NumericallitContext newamt;
		public Token newuint;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING_LIT() { return getTokens(HSlangParser.STRING_LIT); }
		public TerminalNode STRING_LIT(int i) {
			return getToken(HSlangParser.STRING_LIT, i);
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
		enterRule(_localctx, 44, RULE_ifpaymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__20);
			setState(299);
			((IfpaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(300);
			match(T__21);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(301);
				((IfpaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(302);
				((IfpaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			((IfpaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(306);
			match(T__22);
			setState(307);
			((IfpaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(308);
			match(T__23);
			setState(309);
			((IfpaymentSpecContext)_localctx).toacct = match(IDENTIFIER);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(310);
				match(T__24);
				setState(311);
				((IfpaymentSpecContext)_localctx).amtuint = numericallit();
				setState(312);
				match(STRING_LIT);
				setState(313);
				match(T__25);
				setState(314);
				((IfpaymentSpecContext)_localctx).newamt = numericallit();
				setState(315);
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
		public Token acct;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
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
		enterRule(_localctx, 46, RULE_ifcontractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__20);
			setState(320);
			((IfcontractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(321);
			match(T__26);
			setState(322);
			((IfcontractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(323);
			match(T__19);
			setState(324);
			((IfcontractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(325);
			match(T__1);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(326);
				((IfcontractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(329);
			match(T__2);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					match(T__27);
					setState(331);
					((IfcontractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 48, RULE_stateField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IDENTIFIER);
			setState(338);
			match(T__19);
			setState(339);
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
		enterRule(_localctx, 50, RULE_arg);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(STRING_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(IDENTIFIER);
				setState(345);
				match(T__19);
				setState(346);
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
		enterRule(_localctx, 52, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			arg();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(350);
				match(T__28);
				setState(351);
				arg();
				}
				}
				setState(356);
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
		enterRule(_localctx, 54, RULE_depSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__29);
			setState(358);
			eos();
			setState(359);
			depSpec();
			setState(360);
			eos();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					depSpec();
					setState(362);
					eos();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 56, RULE_depSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(370);
			((DepSpecContext)_localctx).dep = match(IDENTIFIER);
			setState(371);
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
		enterRule(_localctx, 58, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IDENTIFIER);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					match(T__28);
					setState(375);
					match(IDENTIFIER);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 60, RULE_operandName);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
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
		enterRule(_localctx, 62, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(IDENTIFIER);
			setState(386);
			match(T__19);
			setState(387);
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
		enterRule(_localctx, 64, RULE_eos);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
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
		case 32:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u018e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\7\2P\n\2\f"+
		"\2\16\2S\13\2\3\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\5\2`\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\t\u0084\n\t\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0093\n\13\f\13\16\13\u0096\13\13\3\13\3\13\3\13"+
		"\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\13\3\13\3\13\7\13\u00a3\n\13"+
		"\f\13\16\13\u00a6\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00af\n\f\f"+
		"\f\16\f\u00b2\13\f\3\f\3\f\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba\13\f\3\f\3"+
		"\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\3\f\3\r\3\r\5\r\u00c8\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00da\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n"+
		"\21\f\21\16\21\u00e5\13\21\3\21\3\21\3\21\7\21\u00ea\n\21\f\21\16\21\u00ed"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00fb\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0102\n\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u010b\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0119\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0123\n\27\3\27\3\27\3\27\7\27\u0128\n\27\f\27\16\27\u012b"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0140\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\31\3\31\3\31\7\31\u014f\n"+
		"\31\f\31\16\31\u0152\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u015e\n\33\3\34\3\34\3\34\7\34\u0163\n\34\f\34\16\34\u0166"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u016f\n\35\f\35\16\35\u0172"+
		"\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u017b\n\37\f\37\16\37\u017e"+
		"\13\37\3 \3 \5 \u0182\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u018c\n\"\3\""+
		"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@B\2\3\3\2%&\2\u0198\2I\3\2\2\2\4a\3\2\2\2\6f\3\2\2\2\bj\3\2\2\2\nl\3"+
		"\2\2\2\fs\3\2\2\2\16z\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u008c"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3\2\2\2\34\u00d0\3"+
		"\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"\u00f0\3\2\2\2$\u00fa\3\2\2\2"+
		"&\u0101\3\2\2\2(\u0103\3\2\2\2*\u0105\3\2\2\2,\u011a\3\2\2\2.\u012c\3"+
		"\2\2\2\60\u0141\3\2\2\2\62\u0153\3\2\2\2\64\u015d\3\2\2\2\66\u015f\3\2"+
		"\2\28\u0167\3\2\2\2:\u0173\3\2\2\2<\u0177\3\2\2\2>\u0181\3\2\2\2@\u0183"+
		"\3\2\2\2B\u018b\3\2\2\2DE\5\4\3\2EF\5B\"\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JQ\3\2\2\2KI\3\2\2\2LM\5\b\5\2MN\5B\"\2NP\3\2\2"+
		"\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SQ\3\2\2\2TU\5\20"+
		"\t\2UV\5B\"\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2"+
		"\2\2[Y\3\2\2\2\\]\58\35\2]^\5B\"\2^`\3\2\2\2_\\\3\2\2\2_`\3\2\2\2`\3\3"+
		"\2\2\2ab\7\3\2\2bc\7\4\2\2cd\5\6\4\2de\7\5\2\2e\5\3\2\2\2fg\7+\2\2g\7"+
		"\3\2\2\2hk\5\n\6\2ik\5\f\7\2jh\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\7\6\2\2"+
		"mn\7\"\2\2no\7\7\2\2op\7\"\2\2pq\7\b\2\2qr\7+\2\2r\13\3\2\2\2st\7\t\2"+
		"\2tu\7\"\2\2uv\7\7\2\2vw\7\"\2\2wx\7\b\2\2xy\5\16\b\2y\r\3\2\2\2z{\7\""+
		"\2\2{|\7\4\2\2|}\7+\2\2}~\7\5\2\2~\17\3\2\2\2\177\u0084\5\22\n\2\u0080"+
		"\u0084\5 \21\2\u0081\u0084\5*\26\2\u0082\u0084\5,\27\2\u0083\177\3\2\2"+
		"\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21"+
		"\3\2\2\2\u0085\u0089\5\24\13\2\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2"+
		"\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\"\22\2"+
		"\u008e\u0094\7\13\2\2\u008f\u0090\5\22\n\2\u0090\u0091\5B\"\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\30"+
		"\r\2\u0098\u0099\5B\"\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\5B\"\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\f\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00b0\7\16\2"+
		"\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\5B\"\2\u00ad\u00af\3\2\2\2\u00ae\u00ab"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\5"+
		"B\"\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\5B\"\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4"+
		"\27\3\2\2\2\u00c5\u00c8\5\32\16\2\u00c6\u00c8\5\34\17\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca"+
		"\u00cb\7\"\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7\b"+
		"\2\2\u00ce\u00cf\7+\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2"+
		"\7\"\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7\b\2\2\u00d5"+
		"\u00d6\5\16\b\2\u00d6\35\3\2\2\2\u00d7\u00da\5.\30\2\u00d8\u00da\5\60"+
		"\31\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\37\3\2\2\2\u00db\u00dc"+
		"\7\17\2\2\u00dc\u00dd\5(\25\2\u00dd\u00e3\7\13\2\2\u00de\u00df\5\30\r"+
		"\2\u00df\u00e0\5B\"\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00eb\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\5B\"\2\u00e8\u00ea\3"+
		"\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\f"+
		"\2\2\u00ef!\3\2\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2\5$\23\2\u00f2\u00f3"+
		"\5&\24\2\u00f3#\3\2\2\2\u00f4\u00fb\7\20\2\2\u00f5\u00fb\7\21\2\2\u00f6"+
		"\u00fb\7\22\2\2\u00f7\u00fb\7\23\2\2\u00f8\u00fb\7\24\2\2\u00f9\u00fb"+
		"\7\25\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2"+
		"\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb%\3"+
		"\2\2\2\u00fc\u0102\5(\25\2\u00fd\u0102\7\"\2\2\u00fe\u00ff\7\"\2\2\u00ff"+
		"\u0100\7\26\2\2\u0100\u0102\7\"\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3"+
		"\2\2\2\u0101\u00fe\3\2\2\2\u0102\'\3\2\2\2\u0103\u0104\t\2\2\2\u0104)"+
		"\3\2\2\2\u0105\u0106\7\27\2\2\u0106\u0107\7\"\2\2\u0107\u010a\7\30\2\2"+
		"\u0108\u010b\5(\25\2\u0109\u010b\5\62\32\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7+\2\2\u010d\u010e\7\31\2\2\u010e"+
		"\u010f\7\"\2\2\u010f\u0110\7\32\2\2\u0110\u0118\7\"\2\2\u0111\u0112\7"+
		"\33\2\2\u0112\u0113\5(\25\2\u0113\u0114\7+\2\2\u0114\u0115\7\34\2\2\u0115"+
		"\u0116\5(\25\2\u0116\u0117\7+\2\2\u0117\u0119\3\2\2\2\u0118\u0111\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119+\3\2\2\2\u011a\u011b\7\27\2\2\u011b\u011c"+
		"\7\"\2\2\u011c\u011d\7\35\2\2\u011d\u011e\7\"\2\2\u011e\u011f\7\26\2\2"+
		"\u011f\u0120\7\"\2\2\u0120\u0122\7\4\2\2\u0121\u0123\5\66\34\2\u0122\u0121"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129\7\5\2\2\u0125"+
		"\u0126\7\36\2\2\u0126\u0128\7\"\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a-\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012d\7\27\2\2\u012d\u012e\7\"\2\2\u012e\u0131\7\30\2\2"+
		"\u012f\u0132\5(\25\2\u0130\u0132\5\62\32\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7+\2\2\u0134\u0135\7\31\2\2\u0135"+
		"\u0136\7\"\2\2\u0136\u0137\7\32\2\2\u0137\u013f\7\"\2\2\u0138\u0139\7"+
		"\33\2\2\u0139\u013a\5(\25\2\u013a\u013b\7+\2\2\u013b\u013c\7\34\2\2\u013c"+
		"\u013d\5(\25\2\u013d\u013e\7+\2\2\u013e\u0140\3\2\2\2\u013f\u0138\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140/\3\2\2\2\u0141\u0142\7\27\2\2\u0142\u0143"+
		"\7\"\2\2\u0143\u0144\7\35\2\2\u0144\u0145\7\"\2\2\u0145\u0146\7\26\2\2"+
		"\u0146\u0147\7\"\2\2\u0147\u0149\7\4\2\2\u0148\u014a\5\66\34\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0150\7\5\2\2\u014c"+
		"\u014d\7\36\2\2\u014d\u014f\7\"\2\2\u014e\u014c\3\2\2\2\u014f\u0152\3"+
		"\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\61\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7\26\2\2\u0155\u0156\7"+
		"\"\2\2\u0156\63\3\2\2\2\u0157\u015e\5(\25\2\u0158\u015e\7+\2\2\u0159\u015e"+
		"\7\"\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7\26\2\2\u015c\u015e\7\"\2\2"+
		"\u015d\u0157\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a"+
		"\3\2\2\2\u015e\65\3\2\2\2\u015f\u0164\5\64\33\2\u0160\u0161\7\37\2\2\u0161"+
		"\u0163\5\64\33\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\67\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\7 \2\2\u0168\u0169\5B\"\2\u0169\u016a\5:\36\2\u016a\u0170\5B\""+
		"\2\u016b\u016c\5:\36\2\u016c\u016d\5B\"\2\u016d\u016f\3\2\2\2\u016e\u016b"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"9\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\"\2\2\u0174\u0175\7\"\2\2"+
		"\u0175\u0176\5<\37\2\u0176;\3\2\2\2\u0177\u017c\7\"\2\2\u0178\u0179\7"+
		"\37\2\2\u0179\u017b\7\"\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d=\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017f\u0182\7\"\2\2\u0180\u0182\5@!\2\u0181\u017f\3\2\2\2\u0181\u0180"+
		"\3\2\2\2\u0182?\3\2\2\2\u0183\u0184\7\"\2\2\u0184\u0185\7\26\2\2\u0185"+
		"\u0186\7\"\2\2\u0186A\3\2\2\2\u0187\u018c\7!\2\2\u0188\u018c\7\2\2\3\u0189"+
		"\u018c\6\"\2\2\u018a\u018c\6\"\3\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018cC\3\2\2\2#IQY_j\u0083"+
		"\u0089\u0094\u009c\u00a4\u00b0\u00b8\u00c0\u00c7\u00d9\u00e3\u00eb\u00fa"+
		"\u0101\u010a\u0118\u0122\u0129\u0131\u013f\u0149\u0150\u015d\u0164\u0170"+
		"\u017c\u0181\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}