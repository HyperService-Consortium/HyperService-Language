// Generated from HSlang.g4 by ANTLR 4.7.2

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
	public static final int
		RULE_sourceFile = 0, RULE_varSpec = 1, RULE_type = 2, RULE_opSpec = 3, 
		RULE_numericallit = 4, RULE_paymentSpec = 5, RULE_contractInvocationSpec = 6, 
		RULE_arg = 7, RULE_argList = 8, RULE_depSection = 9, RULE_depSpec = 10, 
		RULE_identifierList = 11, RULE_operandName = 12, RULE_qualifiedIdent = 13, 
		RULE_eos = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "varSpec", "type", "opSpec", "numericallit", "paymentSpec", 
			"contractInvocationSpec", "arg", "argList", "depSection", "depSpec", 
			"identifierList", "operandName", "qualifiedIdent", "eos"
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
		public DepSectionContext depSection() {
			return getRuleContext(DepSectionContext.class,0);
		}
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<OpSpecContext> opSpec() {
			return getRuleContexts(OpSpecContext.class);
		}
		public OpSpecContext opSpec(int i) {
			return getRuleContext(OpSpecContext.class,i);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(30);
				varSpec();
				setState(31);
				eos();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(38);
				opSpec();
				setState(39);
				eos();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			depSection();
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
		public Token id;
		public Token chain;
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
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
		enterRule(_localctx, 2, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			type();
			setState(49);
			((VarSpecContext)_localctx).id = match(IDENTIFIER);
			setState(50);
			match(T__0);
			setState(51);
			((VarSpecContext)_localctx).chain = match(IDENTIFIER);
			setState(52);
			match(T__1);
			setState(53);
			((VarSpecContext)_localctx).name = match(IDENTIFIER);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HSlangListener ) ((HSlangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HSlangVisitor ) return ((HSlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
		enterRule(_localctx, 6, RULE_opSpec);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				paymentSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
		enterRule(_localctx, 8, RULE_numericallit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 10, RULE_paymentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__2);
			setState(64);
			((PaymentSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(65);
			match(T__3);
			setState(66);
			((PaymentSpecContext)_localctx).amt = numericallit();
			setState(67);
			((PaymentSpecContext)_localctx).unit = match(STRING_LIT);
			setState(68);
			match(T__4);
			setState(69);
			((PaymentSpecContext)_localctx).fromacct = match(IDENTIFIER);
			setState(70);
			match(T__5);
			setState(71);
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
		public Token acct;
		public Token ret;
		public List<TerminalNode> IDENTIFIER() { return getTokens(HSlangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HSlangParser.IDENTIFIER, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
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
		enterRule(_localctx, 12, RULE_contractInvocationSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			((ContractInvocationSpecContext)_localctx).opname = match(IDENTIFIER);
			setState(75);
			match(T__6);
			setState(76);
			((ContractInvocationSpecContext)_localctx).recv = match(IDENTIFIER);
			setState(77);
			match(T__7);
			setState(78);
			((ContractInvocationSpecContext)_localctx).method = match(IDENTIFIER);
			setState(79);
			match(T__8);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << STRING_LIT))) != 0)) {
				{
				setState(80);
				argList();
				}
			}

			setState(83);
			match(T__9);
			setState(84);
			match(T__10);
			setState(85);
			((ContractInvocationSpecContext)_localctx).acct = match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				match(T__11);
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(87);
					((ContractInvocationSpecContext)_localctx).ret = match(IDENTIFIER);
					}
					break;
				case T__8:
					{
					setState(88);
					match(T__8);
					setState(89);
					identifierList();
					setState(90);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(HSlangParser.STRING_LIT, 0); }
		public NumericallitContext numericallit() {
			return getRuleContext(NumericallitContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 14, RULE_arg);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(STRING_LIT);
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				numericallit();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(IDENTIFIER);
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
		enterRule(_localctx, 16, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			arg();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(102);
				match(T__12);
				setState(103);
				arg();
				}
				}
				setState(108);
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
		enterRule(_localctx, 18, RULE_depSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__13);
			setState(110);
			eos();
			setState(111);
			depSpec();
			setState(112);
			eos();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(113);
				depSpec();
				setState(114);
				eos();
				}
				}
				setState(120);
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

	public static class DepSpecContext extends ParserRuleContext {
		public Token left;
		public IdentifierListContext right;
		public TerminalNode IDENTIFIER() { return getToken(HSlangParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_depSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((DepSpecContext)_localctx).left = match(IDENTIFIER);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
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
		enterRule(_localctx, 22, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(T__12);
					setState(127);
					match(IDENTIFIER);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 24, RULE_operandName);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		enterRule(_localctx, 26, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(T__7);
			setState(139);
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
		enterRule(_localctx, 28, RULE_eos);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0096\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5>\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\5\ba\n\b\3\t\3\t\3\t\5\tf\n\t"+
		"\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0083\n"+
		"\r\f\r\16\r\u0086\13\r\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0094\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\4\3\2\27\30\3\2\21\22\2\u0095\2%\3\2\2\2\4\62\3\2\2"+
		"\2\69\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16K\3\2\2\2\20e\3\2\2\2"+
		"\22g\3\2\2\2\24o\3\2\2\2\26{\3\2\2\2\30\177\3\2\2\2\32\u0089\3\2\2\2\34"+
		"\u008b\3\2\2\2\36\u0093\3\2\2\2 !\5\4\3\2!\"\5\36\20\2\"$\3\2\2\2# \3"+
		"\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&-\3\2\2\2\'%\3\2\2\2()\5\b\5\2)"+
		"*\5\36\20\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2"+
		"\2\2/-\3\2\2\2\60\61\5\24\13\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\7\24\2"+
		"\2\64\65\7\3\2\2\65\66\7\24\2\2\66\67\7\4\2\2\678\7\24\2\28\5\3\2\2\2"+
		"9:\7\24\2\2:\7\3\2\2\2;>\5\f\7\2<>\5\16\b\2=;\3\2\2\2=<\3\2\2\2>\t\3\2"+
		"\2\2?@\t\2\2\2@\13\3\2\2\2AB\7\5\2\2BC\7\24\2\2CD\7\6\2\2DE\5\n\6\2EF"+
		"\7\35\2\2FG\7\7\2\2GH\7\24\2\2HI\7\b\2\2IJ\7\24\2\2J\r\3\2\2\2KL\7\5\2"+
		"\2LM\7\24\2\2MN\7\t\2\2NO\7\24\2\2OP\7\n\2\2PQ\7\24\2\2QS\7\13\2\2RT\5"+
		"\22\n\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2VW\7\r\2\2W`\7\24\2\2X"+
		"^\7\16\2\2Y_\7\24\2\2Z[\7\13\2\2[\\\5\30\r\2\\]\7\f\2\2]_\3\2\2\2^Y\3"+
		"\2\2\2^Z\3\2\2\2_a\3\2\2\2`X\3\2\2\2`a\3\2\2\2a\17\3\2\2\2bf\7\35\2\2"+
		"cf\5\n\6\2df\7\24\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\21\3\2\2\2gl\5\20"+
		"\t\2hi\7\17\2\2ik\5\20\t\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23"+
		"\3\2\2\2nl\3\2\2\2op\7\20\2\2pq\5\36\20\2qr\5\26\f\2rx\5\36\20\2st\5\26"+
		"\f\2tu\5\36\20\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\25"+
		"\3\2\2\2zx\3\2\2\2{|\7\24\2\2|}\t\3\2\2}~\5\30\r\2~\27\3\2\2\2\177\u0084"+
		"\7\24\2\2\u0080\u0081\7\17\2\2\u0081\u0083\7\24\2\2\u0082\u0080\3\2\2"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\31"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\7\24\2\2\u0088\u008a\5\34\17"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\33\3\2\2\2\u008b\u008c"+
		"\7\24\2\2\u008c\u008d\7\n\2\2\u008d\u008e\7\24\2\2\u008e\35\3\2\2\2\u008f"+
		"\u0094\7\23\2\2\u0090\u0094\7\2\2\3\u0091\u0094\6\20\2\2\u0092\u0094\6"+
		"\20\3\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\37\3\2\2\2\16%-=S^`elx\u0084\u0089\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}