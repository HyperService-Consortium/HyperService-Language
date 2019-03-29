// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/HSlang.g4 by ANTLR 4.7

package edu.cwru.rise.hslang.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HSlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENTIFIER=18, KEYWORD=19, BINARY_OP=20, INT_LIT=21, FLOAT_LIT=22, IMAGINARY_LIT=23, 
		RUNE_LIT=24, LITTLE_U_VALUE=25, BIG_U_VALUE=26, STRING_LIT=27, WS=28, 
		COMMENT=29, TERMINATOR=30, LINE_COMMENT=31;
	public static final int
		RULE_sourceFile = 0, RULE_importDecl = 1, RULE_importSpec = 2, RULE_varSpec = 3, 
		RULE_accountSpc = 4, RULE_contractSpc = 5, RULE_contractAddr = 6, RULE_opSpec = 7, 
		RULE_numericallit = 8, RULE_paymentSpec = 9, RULE_contractInvocationSpec = 10, 
		RULE_arg = 11, RULE_argList = 12, RULE_depSection = 13, RULE_depSpec = 14, 
		RULE_identifierList = 15, RULE_operandName = 16, RULE_qualifiedIdent = 17, 
		RULE_eos = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importDecl", "importSpec", "varSpec", "accountSpc", "contractSpc", 
			"contractAddr", "opSpec", "numericallit", "paymentSpec", "contractInvocationSpec", 
			"arg", "argList", "depSection", "depSpec", "identifierList", "operandName", 
			"qualifiedIdent", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'('", "')'", "'account'", "'='", "'::'", "'contract'", 
			"'op'", "'payment'", "'from'", "'to'", "'call'", "'.'", "'using'", "','", 
			"'dep:'", "';'"
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
		public List<DepSectionContext> depSection() {
			return getRuleContexts(DepSectionContext.class);
		}
		public DepSectionContext depSection(int i) {
			return getRuleContext(DepSectionContext.class,i);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				importDecl();
				setState(39);
				eos();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__6) {
				{
				{
				setState(46);
				varSpec();
				setState(47);
				eos();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(54);
				opSpec();
				setState(55);
				eos();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(62);
				depSection();
				setState(63);
				eos();
				}
				}
				setState(69);
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
			setState(70);
			match(T__0);
			setState(71);
			match(T__1);
			setState(72);
			importSpec();
			setState(73);
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
			setState(75);
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				accountSpc();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
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
			setState(81);
			match(T__3);
			setState(82);
			((AccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(83);
			match(T__4);
			setState(84);
			((AccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(85);
			match(T__5);
			setState(86);
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
			setState(88);
			match(T__6);
			setState(89);
			((ContractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(90);
			match(T__4);
			setState(91);
			((ContractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(92);
			match(T__5);
			setState(93);
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
			setState(95);
			((ContractAddrContext)_localctx).contract = match(IDENTIFIER);
			setState(96);
			match(T__1);
			setState(97);
			((ContractAddrContext)_localctx).address = match(STRING_LIT);
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

	public static class OpSpecContext extends ParserRuleContext {
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				paymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
		enterRule(_localctx, 16, RULE_numericallit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public Token unit;
		public Token fromacct;
		public Token toacct;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
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
		enterRule(_localctx, 18, RULE_paymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__7);
			setState(107);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(108);
			match(T__8);
			setState(109);
			((PaymentSpecContext)_localctx).amt = numericallit();
			setState(110);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(111);
			match(T__9);
			setState(112);
			((PaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(113);
			match(T__10);
			setState(114);
			((PaymentSpecContext)_localctx).toacct = match(IDENTIFIER);
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
		enterRule(_localctx, 20, RULE_contractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__7);
			setState(117);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(118);
			match(T__11);
			setState(119);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(120);
			match(T__12);
			setState(121);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(122);
			match(T__1);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(123);
				((ContractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(126);
			match(T__2);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(T__13);
					setState(128);
					((ContractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_arg);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(STRING_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				numericallit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(T__12);
				setState(139);
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
		enterRule(_localctx, 24, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			arg();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(143);
				match(T__14);
				setState(144);
				arg();
				}
				}
				setState(149);
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
		enterRule(_localctx, 26, RULE_depSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__15);
			setState(151);
			eos();
			setState(152);
			depSpec();
			setState(153);
			eos();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					depSpec();
					setState(155);
					eos();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 28, RULE_depSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(163);
			((DepSpecContext)_localctx).dep = match(IDENTIFIER);
			setState(164);
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
		enterRule(_localctx, 30, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(T__14);
					setState(168);
					match(IDENTIFIER);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 32, RULE_operandName);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
		enterRule(_localctx, 34, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(T__12);
			setState(180);
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
		enterRule(_localctx, 36, RULE_eos);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\7"+
		"\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\3\2"+
		"\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5R"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\5\ti\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3\f\3\f\3"+
		"\f\7\f\u0084\n\f\f\f\16\f\u0087\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008f"+
		"\n\r\3\16\3\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00a0\n\17\f\17\16\17\u00a3\13\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\7\21\u00ac\n\21\f\21\16\21\u00af\13\21\3"+
		"\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00bd\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2"+
		"\3\3\2\27\30\2\u00bd\2-\3\2\2\2\4H\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\nS\3"+
		"\2\2\2\fZ\3\2\2\2\16a\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26v"+
		"\3\2\2\2\30\u008e\3\2\2\2\32\u0090\3\2\2\2\34\u0098\3\2\2\2\36\u00a4\3"+
		"\2\2\2 \u00a8\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00bc\3\2\2\2()"+
		"\5\4\3\2)*\5&\24\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2."+
		"\65\3\2\2\2/-\3\2\2\2\60\61\5\b\5\2\61\62\5&\24\2\62\64\3\2\2\2\63\60"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66=\3\2\2\2\67\65\3"+
		"\2\2\289\5\20\t\29:\5&\24\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>"+
		"\3\2\2\2>E\3\2\2\2?=\3\2\2\2@A\5\34\17\2AB\5&\24\2BD\3\2\2\2C@\3\2\2\2"+
		"DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\7\3\2\2IJ\7\4\2"+
		"\2JK\5\6\4\2KL\7\5\2\2L\5\3\2\2\2MN\7\35\2\2N\7\3\2\2\2OR\5\n\6\2PR\5"+
		"\f\7\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\6\2\2TU\7\24\2\2UV\7\7\2\2V"+
		"W\7\24\2\2WX\7\b\2\2XY\7\35\2\2Y\13\3\2\2\2Z[\7\t\2\2[\\\7\24\2\2\\]\7"+
		"\7\2\2]^\7\24\2\2^_\7\b\2\2_`\5\16\b\2`\r\3\2\2\2ab\7\24\2\2bc\7\4\2\2"+
		"cd\7\35\2\2de\7\5\2\2e\17\3\2\2\2fi\5\24\13\2gi\5\26\f\2hf\3\2\2\2hg\3"+
		"\2\2\2i\21\3\2\2\2jk\t\2\2\2k\23\3\2\2\2lm\7\n\2\2mn\7\24\2\2no\7\13\2"+
		"\2op\5\22\n\2pq\7\35\2\2qr\7\f\2\2rs\7\24\2\2st\7\r\2\2tu\7\24\2\2u\25"+
		"\3\2\2\2vw\7\n\2\2wx\7\24\2\2xy\7\16\2\2yz\7\24\2\2z{\7\17\2\2{|\7\24"+
		"\2\2|~\7\4\2\2}\177\5\32\16\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0085\7\5\2\2\u0081\u0082\7\20\2\2\u0082\u0084\7\24\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\27\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008f\7\35\2\2\u0089\u008f\5\22"+
		"\n\2\u008a\u008f\7\24\2\2\u008b\u008c\7\24\2\2\u008c\u008d\7\17\2\2\u008d"+
		"\u008f\7\24\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3"+
		"\2\2\2\u008e\u008b\3\2\2\2\u008f\31\3\2\2\2\u0090\u0095\5\30\r\2\u0091"+
		"\u0092\7\21\2\2\u0092\u0094\5\30\r\2\u0093\u0091\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009a\5&\24\2\u009a\u009b\5"+
		"\36\20\2\u009b\u00a1\5&\24\2\u009c\u009d\5\36\20\2\u009d\u009e\5&\24\2"+
		"\u009e\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\24\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5 \21\2\u00a7\37\3\2"+
		"\2\2\u00a8\u00ad\7\24\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ac\7\24\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae!\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\7\24\2\2\u00b1\u00b3"+
		"\5$\23\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3#\3\2\2\2\u00b4"+
		"\u00b5\7\24\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\7\24\2\2\u00b7%\3\2\2"+
		"\2\u00b8\u00bd\7\23\2\2\u00b9\u00bd\7\2\2\3\u00ba\u00bd\6\24\2\2\u00bb"+
		"\u00bd\6\24\3\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\'\3\2\2\2\20-\65=EQh~\u0085\u008e\u0095"+
		"\u00a1\u00ad\u00b2\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}