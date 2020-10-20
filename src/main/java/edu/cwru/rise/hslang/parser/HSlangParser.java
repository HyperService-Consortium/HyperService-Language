// Generated from /Users/Jian/Downloads/HSL/antlr/HSlang.g4 by ANTLR 4.7

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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, IDENTIFIER=41, KEYWORD=42, BINARY_OP=43, INT_LIT=44, 
		FLOAT_LIT=45, IMAGINARY_LIT=46, RUNE_LIT=47, LITTLE_U_VALUE=48, BIG_U_VALUE=49, 
		STRING_LIT=50, WS=51, COMMENT=52, TERMINATOR=53, LINE_COMMENT=54;
	public static final int
		RULE_sourceFile = 0, RULE_importDecl = 1, RULE_importSpec = 2, RULE_arrDefin = 3, 
		RULE_arrSpec = 4, RULE_varSpec = 5, RULE_accountSpc = 6, RULE_contractSpc = 7, 
		RULE_contractAddr = 8, RULE_opSpec = 9, RULE_forLoop = 10, RULE_collection = 11, 
		RULE_foreachSpec = 12, RULE_forOp = 13, RULE_ifSpec = 14, RULE_ifStatemnt = 15, 
		RULE_elseStatement = 16, RULE_blockVarSpec = 17, RULE_ifaccountSpc = 18, 
		RULE_ifcontractSpc = 19, RULE_blockOpSpec = 20, RULE_loopSpec = 21, RULE_condExpression = 22, 
		RULE_rEL_OP = 23, RULE_compareUnit = 24, RULE_numericallit = 25, RULE_account = 26, 
		RULE_paymentSpec = 27, RULE_contractInvocationSpec = 28, RULE_ifpaymentSpec = 29, 
		RULE_ifcontractInvocationSpec = 30, RULE_stateField = 31, RULE_arg = 32, 
		RULE_argList = 33, RULE_depSection = 34, RULE_depSpec = 35, RULE_identifierList = 36, 
		RULE_operandName = 37, RULE_qualifiedIdent = 38, RULE_eos = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importDecl", "importSpec", "arrDefin", "arrSpec", "varSpec", 
			"accountSpc", "contractSpc", "contractAddr", "opSpec", "forLoop", "collection", 
			"foreachSpec", "forOp", "ifSpec", "ifStatemnt", "elseStatement", "blockVarSpec", 
			"ifaccountSpc", "ifcontractSpc", "blockOpSpec", "loopSpec", "condExpression", 
			"rEL_OP", "compareUnit", "numericallit", "account", "paymentSpec", "contractInvocationSpec", 
			"ifpaymentSpec", "ifcontractInvocationSpec", "stateField", "arg", "argList", 
			"depSection", "depSpec", "identifierList", "operandName", "qualifiedIdent", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'('", "')'", "'account'", "'[]'", "'='", "'new'", 
			"'['", "']'", "'contract'", "'::'", "'Account'", "'op'", "'for'", "'in'", 
			"'{'", "'}'", "','", "'for('", "':'", "'){'", "'if('", "'else'", "'loop('", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'.'", "'payment'", "'from'", 
			"'to'", "'with'", "'as'", "'call'", "'using'", "'dep:'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", 
			"FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "LITTLE_U_VALUE", "BIG_U_VALUE", 
			"STRING_LIT", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(80);
				importDecl();
				setState(81);
				eos();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(88);
				varSpec();
				setState(89);
				eos();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__18) {
				{
				{
				setState(96);
				opSpec();
				setState(97);
				eos();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(104);
				depSection();
				setState(105);
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
			setState(109);
			match(T__0);
			setState(110);
			match(T__1);
			setState(111);
			importSpec();
			setState(112);
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
			setState(114);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__3);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(117);
					match(T__4);
					setState(118);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(119);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					setState(120);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123);
				match(T__5);
				setState(124);
				match(T__6);
				setState(125);
				match(T__3);
				setState(126);
				match(T__7);
				setState(127);
				((ArrDefinContext)_localctx).amt = numericallit();
				setState(128);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__9);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(131);
					match(T__4);
					setState(132);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					}
					break;
				case IDENTIFIER:
					{
					setState(133);
					((ArrDefinContext)_localctx).name = match(IDENTIFIER);
					setState(134);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__5);
				setState(138);
				match(T__6);
				setState(139);
				match(T__9);
				setState(140);
				match(T__7);
				setState(141);
				((ArrDefinContext)_localctx).amt = numericallit();
				setState(142);
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
			setState(146);
			((ArrSpecContext)_localctx).name = match(IDENTIFIER);
			setState(147);
			match(T__7);
			setState(148);
			((ArrSpecContext)_localctx).amt = numericallit();
			setState(149);
			match(T__8);
			setState(150);
			match(T__5);
			setState(151);
			((ArrSpecContext)_localctx).chain = match(IDENTIFIER);
			setState(152);
			match(T__10);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LIT:
				{
				setState(153);
				((ArrSpecContext)_localctx).address = match(STRING_LIT);
				}
				break;
			case IDENTIFIER:
				{
				setState(154);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				accountSpc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				contractSpc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				arrDefin();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
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
			setState(163);
			match(T__3);
			setState(164);
			((AccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(165);
			match(T__5);
			setState(166);
			((AccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(167);
			match(T__10);
			setState(168);
			match(T__11);
			setState(169);
			match(T__1);
			setState(170);
			((AccountSpcContext)_localctx).address = match(STRING_LIT);
			setState(171);
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
			setState(173);
			match(T__9);
			setState(174);
			((ContractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(175);
			match(T__5);
			setState(176);
			((ContractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(177);
			match(T__10);
			setState(178);
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
			setState(180);
			((ContractAddrContext)_localctx).contract = match(IDENTIFIER);
			setState(181);
			match(T__1);
			setState(182);
			((ContractAddrContext)_localctx).address = match(STRING_LIT);
			setState(183);
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
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				ifSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				loopSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				paymentSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				contractInvocationSpec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				foreachSpec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				forLoop();
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

	public static class ForLoopContext extends ParserRuleContext {
		public Token opName;
		public Token name;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public List<CollectionContext> collection() {
			return getRuleContexts(CollectionContext.class);
		}
		public CollectionContext collection(int i) {
			return getRuleContext(CollectionContext.class,i);
		}
		public List<BlockOpSpecContext> blockOpSpec() {
			return getRuleContexts(BlockOpSpecContext.class);
		}
		public BlockOpSpecContext blockOpSpec(int i) {
			return getRuleContext(BlockOpSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__12);
			setState(194);
			((ForLoopContext)_localctx).opName = match(IDENTIFIER);
			setState(195);
			match(T__13);
			setState(196);
			((ForLoopContext)_localctx).name = match(IDENTIFIER);
			setState(197);
			match(T__14);
			setState(198);
			match(T__7);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(199);
				collection();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__8);
			setState(206);
			match(T__15);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(207);
				blockOpSpec();
				setState(208);
				eos();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__16);
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

	public static class CollectionContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((CollectionContext)_localctx).id = match(IDENTIFIER);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(218);
				match(T__17);
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
		enterRule(_localctx, 24, RULE_foreachSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__18);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(222);
				((ForeachSpecContext)_localctx).ac = match(T__3);
				}
				break;
			case T__9:
				{
				setState(223);
				((ForeachSpecContext)_localctx).con = match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			((ForeachSpecContext)_localctx).name = match(IDENTIFIER);
			setState(227);
			match(T__19);
			setState(228);
			((ForeachSpecContext)_localctx).arryName = match(IDENTIFIER);
			setState(229);
			match(T__20);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(230);
				forOp();
				setState(231);
				eos();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(T__16);
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
		enterRule(_localctx, 26, RULE_forOp);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				paymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
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
		enterRule(_localctx, 28, RULE_ifSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__12);
			setState(245);
			((IfSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(246);
			ifStatemnt();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					elseStatement();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
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
		enterRule(_localctx, 30, RULE_ifStatemnt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__21);
			setState(254);
			condExpression();
			setState(255);
			match(T__20);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					ifSpec();
					setState(257);
					eos();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					forLoop();
					setState(265);
					eos();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(272);
				blockVarSpec();
				setState(273);
				eos();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(280);
				blockOpSpec();
				setState(281);
				eos();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__16);
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
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
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
		enterRule(_localctx, 32, RULE_elseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__22);
			setState(291);
			match(T__15);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					ifSpec();
					setState(293);
					eos();
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					forLoop();
					setState(301);
					eos();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(308);
				blockVarSpec();
				setState(309);
				eos();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(316);
				blockOpSpec();
				setState(317);
				eos();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(T__16);
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
		enterRule(_localctx, 34, RULE_blockVarSpec);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				ifaccountSpc();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
		enterRule(_localctx, 36, RULE_ifaccountSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__3);
			setState(331);
			((IfaccountSpcContext)_localctx).id = match(IDENTIFIER);
			setState(332);
			match(T__5);
			setState(333);
			((IfaccountSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(334);
			match(T__10);
			setState(335);
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
		enterRule(_localctx, 38, RULE_ifcontractSpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__9);
			setState(338);
			((IfcontractSpcContext)_localctx).id = match(IDENTIFIER);
			setState(339);
			match(T__5);
			setState(340);
			((IfcontractSpcContext)_localctx).chain = match(IDENTIFIER);
			setState(341);
			match(T__10);
			setState(342);
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
		enterRule(_localctx, 40, RULE_blockOpSpec);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				ifpaymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
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
		enterRule(_localctx, 42, RULE_loopSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__12);
			setState(349);
			((LoopSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(350);
			match(T__23);
			setState(351);
			((LoopSpecContext)_localctx).times = numericallit();
			setState(352);
			match(T__20);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					ifSpec();
					setState(354);
					eos();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__9) {
				{
				{
				setState(361);
				blockVarSpec();
				setState(362);
				eos();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(369);
				blockOpSpec();
				setState(370);
				eos();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(T__16);
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
		enterRule(_localctx, 44, RULE_condExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((CondExpressionContext)_localctx).cond1 = compareUnit();
			setState(380);
			((CondExpressionContext)_localctx).compare = rEL_OP();
			setState(381);
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
		enterRule(_localctx, 46, RULE_rEL_OP);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				((REL_OPContext)_localctx).equal = match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				((REL_OPContext)_localctx).neq = match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((REL_OPContext)_localctx).smal = match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				((REL_OPContext)_localctx).smequ = match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				((REL_OPContext)_localctx).larg = match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				((REL_OPContext)_localctx).largequ = match(T__29);
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
		enterRule(_localctx, 48, RULE_compareUnit);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				((CompareUnitContext)_localctx).number = numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				((CompareUnitContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				((CompareUnitContext)_localctx).recv = match(IDENTIFIER);
				setState(394);
				match(T__30);
				setState(395);
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
		enterRule(_localctx, 50, RULE_numericallit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 52, RULE_account);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((AccountContext)_localctx).fromacct = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				((AccountContext)_localctx).accAr = match(IDENTIFIER);
				setState(402);
				match(T__7);
				setState(403);
				((AccountContext)_localctx).index = numericallit();
				setState(404);
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
		enterRule(_localctx, 54, RULE_paymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__12);
			setState(409);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(410);
			match(T__31);
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(411);
				((PaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(412);
				((PaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(415);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(416);
			match(T__32);
			{
			setState(417);
			((PaymentSpecContext)_localctx).from = account();
			}
			setState(418);
			match(T__33);
			setState(419);
			((PaymentSpecContext)_localctx).toacc = account();
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(420);
				match(T__34);
				setState(421);
				((PaymentSpecContext)_localctx).amtuint = numericallit();
				setState(422);
				match(STRING_LIT);
				setState(423);
				match(T__35);
				setState(424);
				((PaymentSpecContext)_localctx).newamt = numericallit();
				setState(425);
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
		enterRule(_localctx, 56, RULE_contractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__12);
			setState(430);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(431);
			match(T__36);
			setState(432);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(433);
			match(T__30);
			setState(434);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(435);
			match(T__1);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(436);
				((ContractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(439);
			match(T__2);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					match(T__37);
					setState(441);
					account();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 58, RULE_ifpaymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__12);
			setState(448);
			((IfpaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(449);
			match(T__31);
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
				{
				setState(450);
				((IfpaymentSpecContext)_localctx).amt = numericallit();
				}
				break;
			case IDENTIFIER:
				{
				setState(451);
				((IfpaymentSpecContext)_localctx).contract = stateField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(454);
			((IfpaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(455);
			match(T__32);
			{
			setState(456);
			((IfpaymentSpecContext)_localctx).from = account();
			}
			setState(457);
			match(T__33);
			setState(458);
			((IfpaymentSpecContext)_localctx).toacc = account();
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(459);
				match(T__34);
				setState(460);
				((IfpaymentSpecContext)_localctx).amtuint = numericallit();
				setState(461);
				match(STRING_LIT);
				setState(462);
				match(T__35);
				setState(463);
				((IfpaymentSpecContext)_localctx).newamt = numericallit();
				setState(464);
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
		enterRule(_localctx, 60, RULE_ifcontractInvocationSpec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__12);
			setState(469);
			((IfcontractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(470);
			match(T__36);
			setState(471);
			((IfcontractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(472);
			match(T__30);
			setState(473);
			((IfcontractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(474);
			match(T__1);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(475);
				((IfcontractInvocationSpecContext)_localctx).args = argList();
				}
			}

			setState(478);
			match(T__2);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(T__37);
					setState(480);
					account();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 62, RULE_stateField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(IDENTIFIER);
			setState(487);
			match(T__30);
			setState(488);
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
		enterRule(_localctx, 64, RULE_arg);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				numericallit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(STRING_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(IDENTIFIER);
				setState(494);
				match(T__30);
				setState(495);
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
		enterRule(_localctx, 66, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			arg();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(499);
				match(T__17);
				setState(500);
				arg();
				}
				}
				setState(505);
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
		enterRule(_localctx, 68, RULE_depSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__38);
			setState(507);
			eos();
			setState(508);
			depSpec();
			setState(509);
			eos();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					depSpec();
					setState(511);
					eos();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 70, RULE_depSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(519);
			((DepSpecContext)_localctx).dep = match(IDENTIFIER);
			setState(520);
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
		enterRule(_localctx, 72, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(IDENTIFIER);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(T__17);
					setState(524);
					match(IDENTIFIER);
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 74, RULE_operandName);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
		enterRule(_localctx, 76, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(T__30);
			setState(536);
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
		enterRule(_localctx, 78, RULE_eos);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(T__39);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
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
		case 39:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0223\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\2"+
		"\7\2f\n\2\f\2\16\2i\13\2\3\2\3\2\3\2\5\2n\n\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u008a\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\5\7\u00a4"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\f\3\f\3\r\3\r\5\r\u00de"+
		"\n\r\3\16\3\16\3\16\5\16\u00e3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16\3\16\3\16\3\17\3\17\5\17\u00f5"+
		"\n\17\3\20\3\20\3\20\3\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0106\n\21\f\21\16\21\u0109\13\21\3\21"+
		"\3\21\3\21\7\21\u010e\n\21\f\21\16\21\u0111\13\21\3\21\3\21\3\21\7\21"+
		"\u0116\n\21\f\21\16\21\u0119\13\21\3\21\3\21\3\21\7\21\u011e\n\21\f\21"+
		"\16\21\u0121\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u012a\n\22"+
		"\f\22\16\22\u012d\13\22\3\22\3\22\3\22\7\22\u0132\n\22\f\22\16\22\u0135"+
		"\13\22\3\22\3\22\3\22\7\22\u013a\n\22\f\22\16\22\u013d\13\22\3\22\3\22"+
		"\3\22\7\22\u0142\n\22\f\22\16\22\u0145\13\22\3\22\3\22\3\23\3\23\5\23"+
		"\u014b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\5\26\u015d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0167\n\27\f\27\16\27\u016a\13\27\3\27\3\27\3\27\7\27\u016f"+
		"\n\27\f\27\16\27\u0172\13\27\3\27\3\27\3\27\7\27\u0177\n\27\f\27\16\27"+
		"\u017a\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0188\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u018f\n\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0199\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01a0\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01ae\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b8"+
		"\n\36\3\36\3\36\3\36\7\36\u01bd\n\36\f\36\16\36\u01c0\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01c7\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01d5\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01df"+
		"\n \3 \3 \3 \7 \u01e4\n \f \16 \u01e7\13 \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01f3\n\"\3#\3#\3#\7#\u01f8\n#\f#\16#\u01fb\13#\3$\3$\3$"+
		"\3$\3$\3$\3$\7$\u0204\n$\f$\16$\u0207\13$\3%\3%\3%\3%\3&\3&\3&\7&\u0210"+
		"\n&\f&\16&\u0213\13&\3\'\3\'\5\'\u0217\n\'\3(\3(\3(\3(\3)\3)\3)\3)\5)"+
		"\u0221\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNP\2\3\3\2./\2\u0238\2W\3\2\2\2\4o\3\2\2\2\6t\3\2\2\2"+
		"\b\u0092\3\2\2\2\n\u0094\3\2\2\2\f\u00a3\3\2\2\2\16\u00a5\3\2\2\2\20\u00af"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00c1\3\2\2\2\26\u00c3\3\2\2\2\30\u00db\3"+
		"\2\2\2\32\u00df\3\2\2\2\34\u00f4\3\2\2\2\36\u00f6\3\2\2\2 \u00ff\3\2\2"+
		"\2\"\u0124\3\2\2\2$\u014a\3\2\2\2&\u014c\3\2\2\2(\u0153\3\2\2\2*\u015c"+
		"\3\2\2\2,\u015e\3\2\2\2.\u017d\3\2\2\2\60\u0187\3\2\2\2\62\u018e\3\2\2"+
		"\2\64\u0190\3\2\2\2\66\u0198\3\2\2\28\u019a\3\2\2\2:\u01af\3\2\2\2<\u01c1"+
		"\3\2\2\2>\u01d6\3\2\2\2@\u01e8\3\2\2\2B\u01f2\3\2\2\2D\u01f4\3\2\2\2F"+
		"\u01fc\3\2\2\2H\u0208\3\2\2\2J\u020c\3\2\2\2L\u0216\3\2\2\2N\u0218\3\2"+
		"\2\2P\u0220\3\2\2\2RS\5\4\3\2ST\5P)\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU"+
		"\3\2\2\2WX\3\2\2\2X_\3\2\2\2YW\3\2\2\2Z[\5\f\7\2[\\\5P)\2\\^\3\2\2\2]"+
		"Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`g\3\2\2\2a_\3\2\2\2bc\5\24\13"+
		"\2cd\5P)\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3\2\2\2"+
		"ig\3\2\2\2jk\5F$\2kl\5P)\2ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2n\3\3\2\2\2op"+
		"\7\3\2\2pq\7\4\2\2qr\5\6\4\2rs\7\5\2\2s\5\3\2\2\2tu\7\64\2\2u\7\3\2\2"+
		"\2v{\7\6\2\2wx\7\7\2\2x|\7+\2\2yz\7+\2\2z|\7\7\2\2{w\3\2\2\2{y\3\2\2\2"+
		"|}\3\2\2\2}~\7\b\2\2~\177\7\t\2\2\177\u0080\7\6\2\2\u0080\u0081\7\n\2"+
		"\2\u0081\u0082\5\64\33\2\u0082\u0083\7\13\2\2\u0083\u0093\3\2\2\2\u0084"+
		"\u0089\7\f\2\2\u0085\u0086\7\7\2\2\u0086\u008a\7+\2\2\u0087\u0088\7+\2"+
		"\2\u0088\u008a\7\7\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\7\b\2\2\u008c\u008d\7\t\2\2\u008d\u008e\7\f\2\2\u008e"+
		"\u008f\7\n\2\2\u008f\u0090\5\64\33\2\u0090\u0091\7\13\2\2\u0091\u0093"+
		"\3\2\2\2\u0092v\3\2\2\2\u0092\u0084\3\2\2\2\u0093\t\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\7\n\2\2\u0096\u0097\5\64\33\2\u0097\u0098\7\13\2\2"+
		"\u0098\u0099\7\b\2\2\u0099\u009a\7+\2\2\u009a\u009d\7\r\2\2\u009b\u009e"+
		"\7\64\2\2\u009c\u009e\5\22\n\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\13\3\2\2\2\u009f\u00a4\5\16\b\2\u00a0\u00a4\5\20\t\2\u00a1\u00a4"+
		"\5\b\5\2\u00a2\u00a4\5\n\6\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\7\6\2\2"+
		"\u00a6\u00a7\7+\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\7+\2\2\u00a9\u00aa"+
		"\7\r\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\7\64\2\2"+
		"\u00ad\u00ae\7\5\2\2\u00ae\17\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1"+
		"\7+\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\7+\2\2\u00b3\u00b4\7\r\2\2\u00b4"+
		"\u00b5\5\22\n\2\u00b5\21\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\u00b8\7\4\2"+
		"\2\u00b8\u00b9\7\64\2\2\u00b9\u00ba\7\5\2\2\u00ba\23\3\2\2\2\u00bb\u00c2"+
		"\5\36\20\2\u00bc\u00c2\5,\27\2\u00bd\u00c2\58\35\2\u00be\u00c2\5:\36\2"+
		"\u00bf\u00c2\5\32\16\2\u00c0\u00c2\5\26\f\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5"+
		"\7+\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\7\21\2\2\u00c8"+
		"\u00cc\7\n\2\2\u00c9\u00cb\5\30\r\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d6\7\22\2\2\u00d1\u00d2\5"+
		"*\26\2\u00d2\u00d3\5P)\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\23\2\2\u00da\27\3\2\2\2\u00db\u00dd"+
		"\7+\2\2\u00dc\u00de\7\24\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\31\3\2\2\2\u00df\u00e2\7\25\2\2\u00e0\u00e3\7\6\2\2\u00e1\u00e3\7\f\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\7+\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\7+\2\2\u00e7\u00ed\7\27\2\2\u00e8"+
		"\u00e9\5\34\17\2\u00e9\u00ea\5P)\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\23\2\2\u00f1\33\3\2\2"+
		"\2\u00f2\u00f5\58\35\2\u00f3\u00f5\5:\36\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\7+\2\2\u00f8"+
		"\u00fc\5 \21\2\u00f9\u00fb\5\"\22\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7\30\2\2\u0100\u0101\5.\30\2\u0101\u0107\7"+
		"\27\2\2\u0102\u0103\5\36\20\2\u0103\u0104\5P)\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010f\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5\26\f\2\u010b"+
		"\u010c\5P)\2\u010c\u010e\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0117\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\5$\23\2\u0113\u0114\5P)\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011f\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\5*\26\2\u011b"+
		"\u011c\5P)\2\u011c\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2"+
		"\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\23\2\2\u0123!\3\2\2\2\u0124\u0125\7\31\2\2\u0125"+
		"\u012b\7\22\2\2\u0126\u0127\5\36\20\2\u0127\u0128\5P)\2\u0128\u012a\3"+
		"\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5\26"+
		"\f\2\u012f\u0130\5P)\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\5$\23\2\u0137\u0138\5P)\2\u0138\u013a\3\2\2"+
		"\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u0143\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5*\26\2\u013f"+
		"\u0140\5P)\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145\3\2\2"+
		"\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0147\7\23\2\2\u0147#\3\2\2\2\u0148\u014b\5&\24\2\u0149"+
		"\u014b\5(\25\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b%\3\2\2\2"+
		"\u014c\u014d\7\6\2\2\u014d\u014e\7+\2\2\u014e\u014f\7\b\2\2\u014f\u0150"+
		"\7+\2\2\u0150\u0151\7\r\2\2\u0151\u0152\7\64\2\2\u0152\'\3\2\2\2\u0153"+
		"\u0154\7\f\2\2\u0154\u0155\7+\2\2\u0155\u0156\7\b\2\2\u0156\u0157\7+\2"+
		"\2\u0157\u0158\7\r\2\2\u0158\u0159\5\22\n\2\u0159)\3\2\2\2\u015a\u015d"+
		"\5<\37\2\u015b\u015d\5> \2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"+\3\2\2\2\u015e\u015f\7\17\2\2\u015f\u0160\7+\2\2\u0160\u0161\7\32\2\2"+
		"\u0161\u0162\5\64\33\2\u0162\u0168\7\27\2\2\u0163\u0164\5\36\20\2\u0164"+
		"\u0165\5P)\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2"+
		"\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0170\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016c\5$\23\2\u016c\u016d\5P)\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0178\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5*\26\2\u0174"+
		"\u0175\5P)\2\u0175\u0177\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2"+
		"\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017c\7\23\2\2\u017c-\3\2\2\2\u017d\u017e\5\62\32\2\u017e"+
		"\u017f\5\60\31\2\u017f\u0180\5\62\32\2\u0180/\3\2\2\2\u0181\u0188\7\33"+
		"\2\2\u0182\u0188\7\34\2\2\u0183\u0188\7\35\2\2\u0184\u0188\7\36\2\2\u0185"+
		"\u0188\7\37\2\2\u0186\u0188\7 \2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2"+
		"\2\2\u0187\u0183\3\2\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\61\3\2\2\2\u0189\u018f\5\64\33\2\u018a\u018f\7+\2"+
		"\2\u018b\u018c\7+\2\2\u018c\u018d\7!\2\2\u018d\u018f\7+\2\2\u018e\u0189"+
		"\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018f\63\3\2\2\2\u0190"+
		"\u0191\t\2\2\2\u0191\65\3\2\2\2\u0192\u0199\7+\2\2\u0193\u0194\7+\2\2"+
		"\u0194\u0195\7\n\2\2\u0195\u0196\5\64\33\2\u0196\u0197\7\13\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0192\3\2\2\2\u0198\u0193\3\2\2\2\u0199\67\3\2\2"+
		"\2\u019a\u019b\7\17\2\2\u019b\u019c\7+\2\2\u019c\u019f\7\"\2\2\u019d\u01a0"+
		"\5\64\33\2\u019e\u01a0\5@!\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\7\64\2\2\u01a2\u01a3\7#\2\2\u01a3\u01a4\5\66"+
		"\34\2\u01a4\u01a5\7$\2\2\u01a5\u01ad\5\66\34\2\u01a6\u01a7\7%\2\2\u01a7"+
		"\u01a8\5\64\33\2\u01a8\u01a9\7\64\2\2\u01a9\u01aa\7&\2\2\u01aa\u01ab\5"+
		"\64\33\2\u01ab\u01ac\7\64\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a6\3\2\2\2"+
		"\u01ad\u01ae\3\2\2\2\u01ae9\3\2\2\2\u01af\u01b0\7\17\2\2\u01b0\u01b1\7"+
		"+\2\2\u01b1\u01b2\7\'\2\2\u01b2\u01b3\7+\2\2\u01b3\u01b4\7!\2\2\u01b4"+
		"\u01b5\7+\2\2\u01b5\u01b7\7\4\2\2\u01b6\u01b8\5D#\2\u01b7\u01b6\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\7\5\2\2\u01ba\u01bb"+
		"\7(\2\2\u01bb\u01bd\5\66\34\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2"+
		"\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf;\3\2\2\2\u01c0\u01be\3"+
		"\2\2\2\u01c1\u01c2\7\17\2\2\u01c2\u01c3\7+\2\2\u01c3\u01c6\7\"\2\2\u01c4"+
		"\u01c7\5\64\33\2\u01c5\u01c7\5@!\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\64\2\2\u01c9\u01ca\7#\2\2\u01ca"+
		"\u01cb\5\66\34\2\u01cb\u01cc\7$\2\2\u01cc\u01d4\5\66\34\2\u01cd\u01ce"+
		"\7%\2\2\u01ce\u01cf\5\64\33\2\u01cf\u01d0\7\64\2\2\u01d0\u01d1\7&\2\2"+
		"\u01d1\u01d2\5\64\33\2\u01d2\u01d3\7\64\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01cd\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5=\3\2\2\2\u01d6\u01d7\7\17\2\2"+
		"\u01d7\u01d8\7+\2\2\u01d8\u01d9\7\'\2\2\u01d9\u01da\7+\2\2\u01da\u01db"+
		"\7!\2\2\u01db\u01dc\7+\2\2\u01dc\u01de\7\4\2\2\u01dd\u01df\5D#\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e5\7\5"+
		"\2\2\u01e1\u01e2\7(\2\2\u01e2\u01e4\5\66\34\2\u01e3\u01e1\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6?\3\2\2\2"+
		"\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7+\2\2\u01e9\u01ea\7!\2\2\u01ea\u01eb"+
		"\7+\2\2\u01ebA\3\2\2\2\u01ec\u01f3\5\64\33\2\u01ed\u01f3\7\64\2\2\u01ee"+
		"\u01f3\7+\2\2\u01ef\u01f0\7+\2\2\u01f0\u01f1\7!\2\2\u01f1\u01f3\7+\2\2"+
		"\u01f2\u01ec\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01ef"+
		"\3\2\2\2\u01f3C\3\2\2\2\u01f4\u01f9\5B\"\2\u01f5\u01f6\7\24\2\2\u01f6"+
		"\u01f8\5B\"\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01faE\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd"+
		"\7)\2\2\u01fd\u01fe\5P)\2\u01fe\u01ff\5H%\2\u01ff\u0205\5P)\2\u0200\u0201"+
		"\5H%\2\u0201\u0202\5P)\2\u0202\u0204\3\2\2\2\u0203\u0200\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206G\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0208\u0209\7+\2\2\u0209\u020a\7+\2\2\u020a\u020b"+
		"\5J&\2\u020bI\3\2\2\2\u020c\u0211\7+\2\2\u020d\u020e\7\24\2\2\u020e\u0210"+
		"\7+\2\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212K\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0217\7+\2\2\u0215"+
		"\u0217\5N(\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217M\3\2\2\2\u0218"+
		"\u0219\7+\2\2\u0219\u021a\7!\2\2\u021a\u021b\7+\2\2\u021bO\3\2\2\2\u021c"+
		"\u0221\7*\2\2\u021d\u0221\7\2\2\3\u021e\u0221\6)\2\2\u021f\u0221\6)\3"+
		"\2\u0220\u021c\3\2\2\2\u0220\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221Q\3\2\2\2\61W_gm{\u0089\u0092\u009d\u00a3\u00c1\u00cc\u00d6"+
		"\u00dd\u00e2\u00ed\u00f4\u00fc\u0107\u010f\u0117\u011f\u012b\u0133\u013b"+
		"\u0143\u014a\u015c\u0168\u0170\u0178\u0187\u018e\u0198\u019f\u01ad\u01b7"+
		"\u01be\u01c6\u01d4\u01de\u01e5\u01f2\u01f9\u0205\u0211\u0216\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}