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
			"'op'", "'if('", "'){'", "'}'", "'else'", "'{'", "'loop('", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'.'", "'payment'", "'from'", "'to'", "'with'", 
			"'as'", "'call'", "'using'", "','", "'dep:'", "';'"
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
			while (_la==T__7) {
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
		enterRule(_localctx, 16, RULE_ifSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__7);
			setState(132);
			((IfSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(133);
			ifStatemnt();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					elseStatement();
					}
					} 
				}
				setState(139);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__8);
			setState(141);
			condExpression();
			setState(142);
			match(T__9);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					ifSpec();
					setState(144);
					eos();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(151);
				blockVarSpec();
				setState(152);
				eos();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(159);
				blockOpSpec();
				setState(160);
				eos();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(T__10);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__11);
			setState(170);
			match(T__12);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					ifSpec();
					setState(172);
					eos();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(179);
				blockVarSpec();
				setState(180);
				eos();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(187);
				blockOpSpec();
				setState(188);
				eos();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__10);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				ifaccountSpc();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
			setState(201);
			match(T__3);
			setState(202);
			((IfaccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(203);
			match(T__4);
			setState(204);
			((IfaccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(205);
			match(T__5);
			setState(206);
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
			setState(208);
			match(T__6);
			setState(209);
			((IfcontractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(210);
			match(T__4);
			setState(211);
			((IfcontractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(212);
			match(T__5);
			setState(213);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				ifpaymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		enterRule(_localctx, 30, RULE_loopSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__7);
			setState(220);
			((LoopSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(221);
			match(T__13);
			setState(222);
			((LoopSpecContext)_localctx).times = numericallit();
			setState(223);
			match(T__9);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					ifSpec();
					setState(225);
					eos();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(232);
				blockVarSpec();
				setState(233);
				eos();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(240);
				blockOpSpec();
				setState(241);
				eos();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(T__10);
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
			setState(250);
			((CondExpressionContext)_localctx).cond1 = compareUnit();
			setState(251);
			((CondExpressionContext)_localctx).compare = rEL_OP();
			setState(252);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((REL_OPContext)_localctx).equal = match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((REL_OPContext)_localctx).neq = match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				((REL_OPContext)_localctx).smal = match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				((REL_OPContext)_localctx).smequ = match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				((REL_OPContext)_localctx).larg = match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				((REL_OPContext)_localctx).largequ = match(T__19);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((CompareUnitContext)_localctx).number = numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((CompareUnitContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				((CompareUnitContext)_localctx).recv = match(IDENTIFIER);
				setState(265);
				match(T__20);
				setState(266);
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
			setState(269);
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
			setState(271);
			match(T__7);
			setState(272);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(273);
			match(T__21);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(274);
				((PaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(275);
				((PaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(279);
			match(T__22);
			setState(280);
			((PaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(281);
			match(T__23);
			setState(282);
			((PaymentSpecContext)_localctx).toacct = match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(283);
				match(T__24);
				setState(284);
				((PaymentSpecContext)_localctx).amtuint = numericallit();
				setState(285);
				match(STRING_LIT);
				setState(286);
				match(T__25);
				setState(287);
				((PaymentSpecContext)_localctx).newamt = numericallit();
				setState(288);
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
			setState(292);
			match(T__7);
			setState(293);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(294);
			match(T__26);
			setState(295);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(296);
			match(T__20);
			setState(297);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(298);
			match(T__1);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(299);
				((ContractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(302);
			match(T__2);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(T__27);
					setState(304);
					((ContractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(310);
			match(T__7);
			setState(311);
			((IfpaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(312);
			match(T__21);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(313);
				((IfpaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(314);
				((IfpaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			((IfpaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(318);
			match(T__22);
			setState(319);
			((IfpaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(320);
			match(T__23);
			setState(321);
			((IfpaymentSpecContext)_localctx).toacct = match(IDENTIFIER);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(322);
				match(T__24);
				setState(323);
				((IfpaymentSpecContext)_localctx).amtuint = numericallit();
				setState(324);
				match(STRING_LIT);
				setState(325);
				match(T__25);
				setState(326);
				((IfpaymentSpecContext)_localctx).newamt = numericallit();
				setState(327);
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
			setState(331);
			match(T__7);
			setState(332);
			((IfcontractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(333);
			match(T__26);
			setState(334);
			((IfcontractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(335);
			match(T__20);
			setState(336);
			((IfcontractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(337);
			match(T__1);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(338);
				((IfcontractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(341);
			match(T__2);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(T__27);
					setState(343);
					((IfcontractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(349);
			match(IDENTIFIER);
			setState(350);
			match(T__20);
			setState(351);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(STRING_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(IDENTIFIER);
				setState(357);
				match(T__20);
				setState(358);
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
			setState(361);
			arg();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(362);
				match(T__28);
				setState(363);
				arg();
				}
				}
				setState(368);
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
			setState(369);
			match(T__29);
			setState(370);
			eos();
			setState(371);
			depSpec();
			setState(372);
			eos();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					depSpec();
					setState(374);
					eos();
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
			setState(381);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(382);
			((DepSpecContext)_localctx).dep = match(IDENTIFIER);
			setState(383);
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
			setState(385);
			match(IDENTIFIER);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					match(T__28);
					setState(387);
					match(IDENTIFIER);
					}
					} 
				}
				setState(392);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
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
			setState(397);
			match(IDENTIFIER);
			setState(398);
			match(T__20);
			setState(399);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\7\2P\n\2\f"+
		"\2\16\2S\13\2\3\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\5\2`\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\t\u0084\n\t\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\13\3"+
		"\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\3\13\7\13\u00a5"+
		"\n\13\f\13\16\13\u00a8\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b1\n"+
		"\f\f\f\16\f\u00b4\13\f\3\f\3\f\3\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3"+
		"\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\3\f\3\f\3\r\3\r\5\r\u00ca"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u00dc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00e6\n\21\f\21\16\21\u00e9\13\21\3\21\3\21\3\21\7\21\u00ee\n\21"+
		"\f\21\16\21\u00f1\13\21\3\21\3\21\3\21\7\21\u00f6\n\21\f\21\16\21\u00f9"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0107\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0117\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0125\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u012f\n\27\3\27\3\27\3\27\7\27\u0134\n\27\f\27\16\27\u0137"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u014c\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0156\n\31\3\31\3\31\3\31\7\31\u015b\n"+
		"\31\f\31\16\31\u015e\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u016a\n\33\3\34\3\34\3\34\7\34\u016f\n\34\f\34\16\34\u0172"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u017b\n\35\f\35\16\35\u017e"+
		"\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0187\n\37\f\37\16\37\u018a"+
		"\13\37\3 \3 \5 \u018e\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0198\n\"\3\""+
		"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@B\2\3\3\2%&\2\u01a5\2I\3\2\2\2\4a\3\2\2\2\6f\3\2\2\2\bj\3\2\2\2\nl\3"+
		"\2\2\2\fs\3\2\2\2\16z\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24\u008e"+
		"\3\2\2\2\26\u00ab\3\2\2\2\30\u00c9\3\2\2\2\32\u00cb\3\2\2\2\34\u00d2\3"+
		"\2\2\2\36\u00db\3\2\2\2 \u00dd\3\2\2\2\"\u00fc\3\2\2\2$\u0106\3\2\2\2"+
		"&\u010d\3\2\2\2(\u010f\3\2\2\2*\u0111\3\2\2\2,\u0126\3\2\2\2.\u0138\3"+
		"\2\2\2\60\u014d\3\2\2\2\62\u015f\3\2\2\2\64\u0169\3\2\2\2\66\u016b\3\2"+
		"\2\28\u0173\3\2\2\2:\u017f\3\2\2\2<\u0183\3\2\2\2>\u018d\3\2\2\2@\u018f"+
		"\3\2\2\2B\u0197\3\2\2\2DE\5\4\3\2EF\5B\"\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2"+
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
		"\3\2\2\2\u0085\u0086\7\n\2\2\u0086\u0087\7\"\2\2\u0087\u008b\5\24\13\2"+
		"\u0088\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\23\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\13\2\2\u008f\u0090\5\"\22\2\u0090\u0096\7\f\2\2\u0091\u0092\5"+
		"\22\n\2\u0092\u0093\5B\"\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009e\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5\30\r\2\u009a\u009b\5B\"\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\5\36\20\2\u00a2\u00a3\5B\"\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\25\3\2\2"+
		"\2\u00ab\u00ac\7\16\2\2\u00ac\u00b2\7\17\2\2\u00ad\u00ae\5\22\n\2\u00ae"+
		"\u00af\5B\"\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\5B\"\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\36"+
		"\20\2\u00be\u00bf\5B\"\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6\27\3\2\2\2\u00c7\u00ca"+
		"\5\32\16\2\u00c8\u00ca\5\34\17\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce"+
		"\7\7\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\7+\2\2\u00d1"+
		"\33\3\2\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7\7\2"+
		"\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5\16\b\2\u00d8"+
		"\35\3\2\2\2\u00d9\u00dc\5.\30\2\u00da\u00dc\5\60\31\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00de\7\n\2\2\u00de\u00df"+
		"\7\"\2\2\u00df\u00e0\7\20\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e7\7\f\2\2"+
		"\u00e2\u00e3\5\22\n\2\u00e3\u00e4\5B\"\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ef\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\5"+
		"B\"\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\5B\"\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\r\2\2\u00fb"+
		"!\3\2\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\5$\23\2\u00fe\u00ff\5&\24\2"+
		"\u00ff#\3\2\2\2\u0100\u0107\7\21\2\2\u0101\u0107\7\22\2\2\u0102\u0107"+
		"\7\23\2\2\u0103\u0107\7\24\2\2\u0104\u0107\7\25\2\2\u0105\u0107\7\26\2"+
		"\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107%\3\2\2\2\u0108"+
		"\u010e\5(\25\2\u0109\u010e\7\"\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7\27"+
		"\2\2\u010c\u010e\7\"\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\t\2\2\2\u0110)\3\2\2\2\u0111"+
		"\u0112\7\n\2\2\u0112\u0113\7\"\2\2\u0113\u0116\7\30\2\2\u0114\u0117\5"+
		"(\25\2\u0115\u0117\5\62\32\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7+\2\2\u0119\u011a\7\31\2\2\u011a\u011b\7\""+
		"\2\2\u011b\u011c\7\32\2\2\u011c\u0124\7\"\2\2\u011d\u011e\7\33\2\2\u011e"+
		"\u011f\5(\25\2\u011f\u0120\7+\2\2\u0120\u0121\7\34\2\2\u0121\u0122\5("+
		"\25\2\u0122\u0123\7+\2\2\u0123\u0125\3\2\2\2\u0124\u011d\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125+\3\2\2\2\u0126\u0127\7\n\2\2\u0127\u0128\7\"\2\2"+
		"\u0128\u0129\7\35\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7\27\2\2\u012b\u012c"+
		"\7\"\2\2\u012c\u012e\7\4\2\2\u012d\u012f\5\66\34\2\u012e\u012d\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0135\7\5\2\2\u0131\u0132"+
		"\7\36\2\2\u0132\u0134\7\"\2\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136-\3\2\2\2\u0137\u0135\3"+
		"\2\2\2\u0138\u0139\7\n\2\2\u0139\u013a\7\"\2\2\u013a\u013d\7\30\2\2\u013b"+
		"\u013e\5(\25\2\u013c\u013e\5\62\32\2\u013d\u013b\3\2\2\2\u013d\u013c\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7+\2\2\u0140\u0141\7\31\2\2\u0141"+
		"\u0142\7\"\2\2\u0142\u0143\7\32\2\2\u0143\u014b\7\"\2\2\u0144\u0145\7"+
		"\33\2\2\u0145\u0146\5(\25\2\u0146\u0147\7+\2\2\u0147\u0148\7\34\2\2\u0148"+
		"\u0149\5(\25\2\u0149\u014a\7+\2\2\u014a\u014c\3\2\2\2\u014b\u0144\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c/\3\2\2\2\u014d\u014e\7\n\2\2\u014e\u014f"+
		"\7\"\2\2\u014f\u0150\7\35\2\2\u0150\u0151\7\"\2\2\u0151\u0152\7\27\2\2"+
		"\u0152\u0153\7\"\2\2\u0153\u0155\7\4\2\2\u0154\u0156\5\66\34\2\u0155\u0154"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\7\5\2\2\u0158"+
		"\u0159\7\36\2\2\u0159\u015b\7\"\2\2\u015a\u0158\3\2\2\2\u015b\u015e\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\61\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0160\7\"\2\2\u0160\u0161\7\27\2\2\u0161\u0162\7"+
		"\"\2\2\u0162\63\3\2\2\2\u0163\u016a\5(\25\2\u0164\u016a\7+\2\2\u0165\u016a"+
		"\7\"\2\2\u0166\u0167\7\"\2\2\u0167\u0168\7\27\2\2\u0168\u016a\7\"\2\2"+
		"\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166"+
		"\3\2\2\2\u016a\65\3\2\2\2\u016b\u0170\5\64\33\2\u016c\u016d\7\37\2\2\u016d"+
		"\u016f\5\64\33\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\67\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7 \2\2\u0174\u0175\5B\"\2\u0175\u0176\5:\36\2\u0176\u017c\5B\""+
		"\2\u0177\u0178\5:\36\2\u0178\u0179\5B\"\2\u0179\u017b\3\2\2\2\u017a\u0177"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"9\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\"\2\2\u0180\u0181\7\"\2\2"+
		"\u0181\u0182\5<\37\2\u0182;\3\2\2\2\u0183\u0188\7\"\2\2\u0184\u0185\7"+
		"\37\2\2\u0185\u0187\7\"\2\2\u0186\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189=\3\2\2\2\u018a\u0188\3\2\2\2"+
		"\u018b\u018e\7\"\2\2\u018c\u018e\5@!\2\u018d\u018b\3\2\2\2\u018d\u018c"+
		"\3\2\2\2\u018e?\3\2\2\2\u018f\u0190\7\"\2\2\u0190\u0191\7\27\2\2\u0191"+
		"\u0192\7\"\2\2\u0192A\3\2\2\2\u0193\u0198\7!\2\2\u0194\u0198\7\2\2\3\u0195"+
		"\u0198\6\"\2\2\u0196\u0198\6\"\3\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198C\3\2\2\2$IQY_j\u0083"+
		"\u008b\u0096\u009e\u00a6\u00b2\u00ba\u00c2\u00c9\u00db\u00e7\u00ef\u00f7"+
		"\u0106\u010d\u0116\u0124\u012e\u0135\u013d\u014b\u0155\u015c\u0169\u0170"+
		"\u017c\u0188\u018d\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}