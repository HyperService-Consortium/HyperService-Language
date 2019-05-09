// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Golang.g4 by ANTLR 4.7

package edu.cwru.rise.golang.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GolangParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, IDENTIFIER=63, KEYWORD=64, BINARY_OP=65, 
		INT_LIT=66, FLOAT_LIT=67, IMAGINARY_LIT=68, RUNE_LIT=69, LITTLE_U_VALUE=70, 
		BIG_U_VALUE=71, STRING_LIT=72, WS=73, COMMENT=74, TERMINATOR=75, LINE_COMMENT=76;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_topLevelDecl = 5, RULE_declaration = 6, RULE_constDecl = 7, 
		RULE_constSpec = 8, RULE_identifierList = 9, RULE_expressionList = 10, 
		RULE_typeDecl = 11, RULE_typeSpec = 12, RULE_functionDecl = 13, RULE_function = 14, 
		RULE_methodDecl = 15, RULE_receiver = 16, RULE_varDecl = 17, RULE_varSpec = 18, 
		RULE_block = 19, RULE_statementList = 20, RULE_statement = 21, RULE_simpleStmt = 22, 
		RULE_expressionStmt = 23, RULE_sendStmt = 24, RULE_incDecStmt = 25, RULE_assignment = 26, 
		RULE_assign_op = 27, RULE_shortVarDecl = 28, RULE_emptyStmt = 29, RULE_labeledStmt = 30, 
		RULE_returnStmt = 31, RULE_breakStmt = 32, RULE_continueStmt = 33, RULE_gotoStmt = 34, 
		RULE_fallthroughStmt = 35, RULE_deferStmt = 36, RULE_ifStmt = 37, RULE_switchStmt = 38, 
		RULE_exprSwitchStmt = 39, RULE_exprCaseClause = 40, RULE_exprSwitchCase = 41, 
		RULE_typeSwitchStmt = 42, RULE_typeSwitchGuard = 43, RULE_typeCaseClause = 44, 
		RULE_typeSwitchCase = 45, RULE_typeList = 46, RULE_selectStmt = 47, RULE_commClause = 48, 
		RULE_commCase = 49, RULE_recvStmt = 50, RULE_forStmt = 51, RULE_forClause = 52, 
		RULE_rangeClause = 53, RULE_goStmt = 54, RULE_type = 55, RULE_typeName = 56, 
		RULE_typeLit = 57, RULE_arrayType = 58, RULE_arrayLength = 59, RULE_elementType = 60, 
		RULE_pointerType = 61, RULE_interfaceType = 62, RULE_sliceType = 63, RULE_mapType = 64, 
		RULE_channelType = 65, RULE_methodSpec = 66, RULE_functionType = 67, RULE_signature = 68, 
		RULE_result = 69, RULE_parameters = 70, RULE_parameterList = 71, RULE_parameterDecl = 72, 
		RULE_operand = 73, RULE_literal = 74, RULE_basicLit = 75, RULE_operandName = 76, 
		RULE_compositeLit = 77, RULE_literalType = 78, RULE_literalValue = 79, 
		RULE_elementList = 80, RULE_keyedElement = 81, RULE_key = 82, RULE_element = 83, 
		RULE_structType = 84, RULE_fieldDecl = 85, RULE_anonymousField = 86, RULE_functionLit = 87, 
		RULE_primaryExpr = 88, RULE_selector = 89, RULE_index = 90, RULE_slice = 91, 
		RULE_typeAssertion = 92, RULE_arguments = 93, RULE_methodExpr = 94, RULE_receiverType = 95, 
		RULE_expression = 96, RULE_unaryExpr = 97, RULE_conversion = 98, RULE_eos = 99;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
			"topLevelDecl", "declaration", "constDecl", "constSpec", "identifierList", 
			"expressionList", "typeDecl", "typeSpec", "functionDecl", "function", 
			"methodDecl", "receiver", "varDecl", "varSpec", "block", "statementList", 
			"statement", "simpleStmt", "expressionStmt", "sendStmt", "incDecStmt", 
			"assignment", "assign_op", "shortVarDecl", "emptyStmt", "labeledStmt", 
			"returnStmt", "breakStmt", "continueStmt", "gotoStmt", "fallthroughStmt", 
			"deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", "exprCaseClause", 
			"exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", "typeCaseClause", 
			"typeSwitchCase", "typeList", "selectStmt", "commClause", "commCase", 
			"recvStmt", "forStmt", "forClause", "rangeClause", "goStmt", "type", 
			"typeName", "typeLit", "arrayType", "arrayLength", "elementType", "pointerType", 
			"interfaceType", "sliceType", "mapType", "channelType", "methodSpec", 
			"functionType", "signature", "result", "parameters", "parameterList", 
			"parameterDecl", "operand", "literal", "basicLit", "operandName", "compositeLit", 
			"literalType", "literalValue", "elementList", "keyedElement", "key", 
			"element", "structType", "fieldDecl", "anonymousField", "functionLit", 
			"primaryExpr", "selector", "index", "slice", "typeAssertion", "arguments", 
			"methodExpr", "receiverType", "expression", "unaryExpr", "conversion", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'import'", "'('", "')'", "'.'", "'const'", "'='", 
			"','", "'type'", "'func'", "'var'", "'{'", "'}'", "'<-'", "'++'", "'--'", 
			"'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'&^'", "':='", "';'", "':'", "'return'", "'break'", "'continue'", "'goto'", 
			"'fallthrough'", "'defer'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
			"'select'", "'for'", "'range'", "'go'", "'['", "']'", "'interface'", 
			"'map'", "'chan'", "'...'", "'struct'", "'nil'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "KEYWORD", "BINARY_OP", "INT_LIT", "FLOAT_LIT", 
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
	public String getGrammarFileName() { return "Golang.g4"; }

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

	public GolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSourceFile(this);
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
			setState(200);
			packageClause();
			setState(201);
			eos();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(202);
				importDecl();
				setState(203);
				eos();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(210);
				topLevelDecl();
				setState(211);
				eos();
				}
				}
				setState(217);
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

	public static class PackageClauseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPackageClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitPackageClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__0);
			setState(219);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__1);
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case IDENTIFIER:
			case STRING_LIT:
				{
				setState(222);
				importSpec();
				}
				break;
			case T__2:
				{
				setState(223);
				match(T__2);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==IDENTIFIER || _la==STRING_LIT) {
					{
					{
					setState(224);
					importSpec();
					setState(225);
					eos();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__3);
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

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==IDENTIFIER) {
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(238);
			importPath();
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

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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

	public static class TopLevelDeclContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTopLevelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTopLevelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topLevelDecl);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				functionDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				methodDecl();
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

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				constDecl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				typeDecl();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__5);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(253);
				constSpec();
				}
				break;
			case T__2:
				{
				setState(254);
				match(T__2);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(255);
					constSpec();
					setState(256);
					eos();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(T__3);
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

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConstSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitConstSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			identifierList();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(267);
					type();
					}
				}

				setState(270);
				match(T__6);
				setState(271);
				expressionList();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GolangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GolangParser.IDENTIFIER, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IDENTIFIER);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(T__7);
					setState(276);
					match(IDENTIFIER);
					}
					} 
				}
				setState(281);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression(0);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(T__7);
					setState(284);
					expression(0);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__8);
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(291);
				typeSpec();
				}
				break;
			case T__2:
				{
				setState(292);
				match(T__2);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(293);
					typeSpec();
					setState(294);
					eos();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(T__3);
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

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IDENTIFIER);
			setState(305);
			type();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__9);
			setState(308);
			match(IDENTIFIER);
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(309);
				function();
				}
				break;
			case 2:
				{
				setState(310);
				signature();
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

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			signature();
			setState(314);
			block();
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

	public static class MethodDeclContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__9);
			setState(317);
			receiver();
			setState(318);
			match(IDENTIFIER);
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(319);
				function();
				}
				break;
			case 2:
				{
				setState(320);
				signature();
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

	public static class ReceiverContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__2);
			setState(324);
			identifierList();
			setState(325);
			type();
			setState(326);
			match(T__3);
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

	public static class VarDeclContext extends ParserRuleContext {
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
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__10);
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(329);
				varSpec();
				}
				break;
			case T__2:
				{
				setState(330);
				match(T__2);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(331);
					varSpec();
					setState(332);
					eos();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(T__3);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			identifierList();
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case IDENTIFIER:
				{
				setState(343);
				type();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(344);
					match(T__6);
					setState(345);
					expressionList();
					}
					break;
				}
				}
				break;
			case T__6:
				{
				setState(348);
				match(T__6);
				setState(349);
				expressionList();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__11);
			setState(353);
			statementList();
			setState(354);
			match(T__12);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				{
				setState(356);
				statement();
				setState(357);
				eos();
				}
				}
				setState(363);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public DeferStmtContext deferStmt() {
			return getRuleContext(DeferStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(374);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(375);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(376);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(377);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(378);
				deferStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleStmt);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				sendStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				expressionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				shortVarDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(386);
				emptyStmt();
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			expression(0);
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

	public static class SendStmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSendStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSendStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			expression(0);
			setState(392);
			match(T__13);
			setState(393);
			expression(0);
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

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			expression(0);
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			expressionList();
			setState(399);
			assign_op();
			setState(400);
			expressionList();
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

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(402);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(405);
			match(T__6);
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

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitShortVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitShortVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			identifierList();
			setState(408);
			match(T__27);
			setState(409);
			expressionList();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__28);
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

	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLabeledStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitLabeledStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IDENTIFIER);
			setState(414);
			match(T__29);
			setState(415);
			statement();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__30);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(418);
				expressionList();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__31);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(422);
				match(IDENTIFIER);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__32);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(426);
				match(IDENTIFIER);
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

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitGotoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__33);
			setState(430);
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

	public static class FallthroughStmtContext extends ParserRuleContext {
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFallthroughStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFallthroughStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFallthroughStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__34);
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

	public static class DeferStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterDeferStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitDeferStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitDeferStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__35);
			setState(435);
			expression(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__36);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(438);
				simpleStmt();
				setState(439);
				match(T__28);
				}
				break;
			}
			setState(443);
			expression(0);
			setState(444);
			block();
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(445);
				match(T__37);
				setState(448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(446);
					ifStmt();
					}
					break;
				case T__11:
					{
					setState(447);
					block();
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchStmt);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				typeSwitchStmt();
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

	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExprSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__38);
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(457);
				simpleStmt();
				setState(458);
				match(T__28);
				}
				break;
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				setState(462);
				expression(0);
				}
			}

			setState(465);
			match(T__11);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(466);
				exprCaseClause();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(T__12);
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

	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExprCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			exprSwitchCase();
			setState(475);
			match(T__29);
			setState(476);
			statementList();
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

	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExprSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExprSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExprSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprSwitchCase);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(T__39);
				setState(479);
				expressionList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__40);
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

	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__38);
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(484);
				simpleStmt();
				setState(485);
				match(T__28);
				}
				break;
			}
			setState(489);
			typeSwitchGuard();
			setState(490);
			match(T__11);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(491);
				typeCaseClause();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(T__12);
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

	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeSwitchGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(499);
				match(IDENTIFIER);
				setState(500);
				match(T__27);
				}
				break;
			}
			setState(503);
			primaryExpr(0);
			setState(504);
			match(T__4);
			setState(505);
			match(T__2);
			setState(506);
			match(T__8);
			setState(507);
			match(T__3);
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

	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			typeSwitchCase();
			setState(510);
			match(T__29);
			setState(511);
			statementList();
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

	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeSwitchCase);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(T__39);
				setState(514);
				typeList();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(T__40);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			type();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(519);
				match(T__7);
				setState(520);
				type();
				}
				}
				setState(525);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__41);
			setState(527);
			match(T__11);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__40) {
				{
				{
				setState(528);
				commClause();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(T__12);
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

	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCommClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCommClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitCommClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			commCase();
			setState(537);
			match(T__29);
			setState(538);
			statementList();
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

	public static class CommCaseContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public RecvStmtContext recvStmt() {
			return getRuleContext(RecvStmtContext.class,0);
		}
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCommCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCommCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitCommCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_commCase);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(T__39);
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(541);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(542);
					recvStmt();
					}
					break;
				}
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(T__40);
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

	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterRecvStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitRecvStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitRecvStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(548);
				expressionList();
				setState(549);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(551);
				identifierList();
				setState(552);
				match(T__27);
				}
				break;
			}
			setState(556);
			expression(0);
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

	public static class ForStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__42);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(559);
				expression(0);
				}
				break;
			case 2:
				{
				setState(560);
				forClause();
				}
				break;
			case 3:
				{
				setState(561);
				rangeClause();
				}
				break;
			}
			setState(564);
			block();
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(566);
				simpleStmt();
				}
				break;
			}
			setState(569);
			match(T__28);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				setState(570);
				expression(0);
				}
			}

			setState(573);
			match(T__28);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				setState(574);
				simpleStmt();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(577);
				expressionList();
				setState(578);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(580);
				identifierList();
				setState(581);
				match(T__27);
				}
				break;
			}
			setState(585);
			match(T__43);
			setState(586);
			expression(0);
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

	public static class GoStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitGoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitGoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__44);
			setState(589);
			expression(0);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				typeName();
				}
				break;
			case T__9:
			case T__13:
			case T__20:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				typeLit();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(T__2);
				setState(594);
				type();
				setState(595);
				match(T__3);
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

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GolangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GolangParser.IDENTIFIER, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(IDENTIFIER);
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(600);
				match(T__4);
				setState(601);
				match(IDENTIFIER);
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeLit);
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(609);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(611);
				channelType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(T__45);
			setState(615);
			arrayLength();
			setState(616);
			match(T__46);
			setState(617);
			elementType();
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			expression(0);
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

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			type();
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__20);
			setState(624);
			type();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public List<MethodSpecContext> methodSpec() {
			return getRuleContexts(MethodSpecContext.class);
		}
		public MethodSpecContext methodSpec(int i) {
			return getRuleContext(MethodSpecContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__47);
			setState(627);
			match(T__11);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					methodSpec();
					setState(629);
					eos();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(636);
			match(T__12);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__45);
			setState(639);
			match(T__46);
			setState(640);
			elementType();
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

	public static class MapTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__48);
			setState(643);
			match(T__45);
			setState(644);
			type();
			setState(645);
			match(T__46);
			setState(646);
			elementType();
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

	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterChannelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitChannelType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitChannelType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(648);
				match(T__49);
				}
				break;
			case 2:
				{
				setState(649);
				match(T__49);
				setState(650);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(651);
				match(T__13);
				setState(652);
				match(T__49);
				}
				break;
			}
			setState(655);
			elementType();
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

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitMethodSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_methodSpec);
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				if (!(noTerminatorAfterParams(2))) throw new FailedPredicateException(this, "noTerminatorAfterParams(2)");
				setState(658);
				match(IDENTIFIER);
				setState(659);
				parameters();
				setState(660);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(IDENTIFIER);
				setState(664);
				parameters();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(T__9);
			setState(668);
			signature();
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_signature);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				if (!(noTerminatorAfterParams(1))) throw new FailedPredicateException(this, "noTerminatorAfterParams(1)");
				setState(671);
				parameters();
				setState(672);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				parameters();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_result);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				type();
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__2);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__20) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(682);
				parameterList();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(683);
					match(T__7);
					}
				}

				}
			}

			setState(688);
			match(T__3);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			parameterDecl();
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					match(T__7);
					setState(692);
					parameterDecl();
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(698);
				identifierList();
				}
				break;
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(701);
				match(T__50);
				}
			}

			setState(704);
			type();
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_operand);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(709);
				match(T__2);
				setState(710);
				expression(0);
				setState(711);
				match(T__3);
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literal);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				basicLit();
				}
				break;
			case T__45:
			case T__48:
			case T__51:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				compositeLit();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				functionLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(GolangParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(GolangParser.FLOAT_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(GolangParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(GolangParser.RUNE_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitBasicLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) ) {
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

	public static class OperandNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GolangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GolangParser.IDENTIFIER, i);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitOperandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitOperandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_operandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(IDENTIFIER);
			{
			setState(723);
			match(T__4);
			setState(724);
			match(IDENTIFIER);
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

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitCompositeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitCompositeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			literalType();
			setState(727);
			literalValue();
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

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitLiteralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_literalType);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				match(T__45);
				setState(732);
				match(T__50);
				setState(733);
				match(T__46);
				setState(734);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(735);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(736);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(737);
				typeName();
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

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(T__11);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				setState(741);
				elementList();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(742);
					match(T__7);
					}
				}

				}
			}

			setState(747);
			match(T__12);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			keyedElement();
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(750);
					match(T__7);
					setState(751);
					keyedElement();
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitKeyedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitKeyedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(757);
				key();
				setState(758);
				match(T__29);
				}
				break;
			}
			setState(762);
			element();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_key);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				literalValue();
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

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_element);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__13:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__25:
			case T__45:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__61:
			case IDENTIFIER:
			case INT_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				literalValue();
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

	public static class StructTypeContext extends ParserRuleContext {
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_structType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__51);
			setState(774);
			match(T__11);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775);
					fieldDecl();
					setState(776);
					eos();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(783);
			match(T__12);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnonymousFieldContext anonymousField() {
			return getRuleContext(AnonymousFieldContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(GolangParser.STRING_LIT, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(785);
				if (!(noTerminatorBetween(2))) throw new FailedPredicateException(this, "noTerminatorBetween(2)");
				setState(786);
				identifierList();
				setState(787);
				type();
				}
				break;
			case 2:
				{
				setState(789);
				anonymousField();
				}
				break;
			}
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(792);
				match(STRING_LIT);
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

	public static class AnonymousFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AnonymousFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterAnonymousField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitAnonymousField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitAnonymousField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFieldContext anonymousField() throws RecognitionException {
		AnonymousFieldContext _localctx = new AnonymousFieldContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_anonymousField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(795);
				match(T__20);
				}
			}

			setState(798);
			typeName();
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

	public static class FunctionLitContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitFunctionLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitFunctionLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(T__9);
			setState(801);
			function();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(804);
				operand();
				}
				break;
			case 2:
				{
				setState(805);
				conversion();
				}
				break;
			case 3:
				{
				setState(806);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(807);
				match(T__52);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(820);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(810);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(811);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(812);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(813);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(814);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(815);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(816);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(817);
						typeAssertion();
						}
						break;
					case 5:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(818);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(819);
						arguments();
						}
						break;
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T__4);
			setState(826);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(T__45);
			setState(829);
			expression(0);
			setState(830);
			match(T__46);
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

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_slice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(T__45);
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
					{
					setState(833);
					expression(0);
					}
				}

				setState(836);
				match(T__29);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
					{
					setState(837);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
					{
					setState(840);
					expression(0);
					}
				}

				setState(843);
				match(T__29);
				setState(844);
				expression(0);
				setState(845);
				match(T__29);
				setState(846);
				expression(0);
				}
				}
				break;
			}
			setState(850);
			match(T__46);
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitTypeAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitTypeAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(T__4);
			setState(853);
			match(T__2);
			setState(854);
			type();
			setState(855);
			match(T__3);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(T__2);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__45) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__61) | (1L << IDENTIFIER))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT_LIT - 66)) | (1L << (FLOAT_LIT - 66)) | (1L << (IMAGINARY_LIT - 66)) | (1L << (RUNE_LIT - 66)) | (1L << (STRING_LIT - 66)))) != 0)) {
				{
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(858);
					expressionList();
					}
					break;
				case 2:
					{
					setState(859);
					type();
					setState(862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(860);
						match(T__7);
						setState(861);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(866);
					match(T__50);
					}
				}

				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(869);
					match(T__7);
					}
				}

				}
			}

			setState(874);
			match(T__3);
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

	public static class MethodExprContext extends ParserRuleContext {
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GolangParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			receiverType();
			setState(877);
			match(T__4);
			setState(878);
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

	public static class ReceiverTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitReceiverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitReceiverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_receiverType);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(T__2);
				setState(882);
				match(T__20);
				setState(883);
				typeName();
				setState(884);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				match(T__2);
				setState(887);
				receiverType();
				setState(888);
				match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(893);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(895);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(896);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(897);
					expression(2);
					}
					} 
				}
				setState(902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unaryExpr);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__25) | (1L << T__61))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(905);
				unaryExpr();
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

	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			type();
			setState(909);
			match(T__2);
			setState(910);
			expression(0);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(911);
				match(T__7);
				}
			}

			setState(914);
			match(T__3);
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
		public TerminalNode EOF() { return getToken(GolangParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GolangListener ) ((GolangListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GolangVisitor ) return ((GolangVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_eos);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(919);
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
		case 66:
			return methodSpec_sempred((MethodSpecContext)_localctx, predIndex);
		case 68:
			return signature_sempred((SignatureContext)_localctx, predIndex);
		case 85:
			return fieldDecl_sempred((FieldDeclContext)_localctx, predIndex);
		case 88:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 96:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 99:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean methodSpec_sempred(MethodSpecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noTerminatorAfterParams(2);
		}
		return true;
	}
	private boolean signature_sempred(SignatureContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return noTerminatorAfterParams(1);
		}
		return true;
	}
	private boolean fieldDecl_sempred(FieldDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return noTerminatorBetween(2);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return lineTerminatorAhead();
		case 10:
			return _input.LT(1).getText().equals("}") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u039d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\2\7\2\u00d0\n\2\f"+
		"\2\16\2\u00d3\13\2\3\2\3\2\3\2\7\2\u00d8\n\2\f\2\16\2\u00db\13\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e6\n\4\f\4\16\4\u00e9\13\4\3\4\5"+
		"\4\u00ec\n\4\3\5\5\5\u00ef\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u00f8\n"+
		"\7\3\b\3\b\3\b\5\b\u00fd\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0105\n\t\f\t"+
		"\16\t\u0108\13\t\3\t\5\t\u010b\n\t\3\n\3\n\5\n\u010f\n\n\3\n\3\n\5\n\u0113"+
		"\n\n\3\13\3\13\3\13\7\13\u0118\n\13\f\13\16\13\u011b\13\13\3\f\3\f\3\f"+
		"\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012b\n"+
		"\r\f\r\16\r\u012e\13\r\3\r\5\r\u0131\n\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\5\17\u013a\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0144"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0151"+
		"\n\23\f\23\16\23\u0154\13\23\3\23\5\23\u0157\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u015d\n\24\3\24\3\24\5\24\u0161\n\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\7\26\u016a\n\26\f\26\16\26\u016d\13\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017e\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0186\n\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\5\35\u0196\n\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u01a6\n!\3\"\3\"\5"+
		"\"\u01aa\n\"\3#\3#\5#\u01ae\n#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\5\'\u01bc\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01c3\n\'\5\'\u01c5\n\'\3(\3(\5"+
		"(\u01c9\n(\3)\3)\3)\3)\5)\u01cf\n)\3)\5)\u01d2\n)\3)\3)\7)\u01d6\n)\f"+
		")\16)\u01d9\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+\5+\u01e4\n+\3,\3,\3,\3,\5,"+
		"\u01ea\n,\3,\3,\3,\7,\u01ef\n,\f,\16,\u01f2\13,\3,\3,\3-\3-\5-\u01f8\n"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\5/\u0207\n/\3\60\3\60\3\60\7"+
		"\60\u020c\n\60\f\60\16\60\u020f\13\60\3\61\3\61\3\61\7\61\u0214\n\61\f"+
		"\61\16\61\u0217\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63"+
		"\u0222\n\63\3\63\5\63\u0225\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u022d"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0235\n\65\3\65\3\65\3\66\5\66"+
		"\u023a\n\66\3\66\3\66\5\66\u023e\n\66\3\66\3\66\5\66\u0242\n\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u024a\n\67\3\67\3\67\3\67\38\38\38\39\39"+
		"\39\39\39\39\59\u0258\n9\3:\3:\3:\5:\u025d\n:\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\5;\u0267\n;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\7@\u027a"+
		"\n@\f@\16@\u027d\13@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\5C\u0290\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u029c\nD\3E\3E\3E\3F\3"+
		"F\3F\3F\3F\5F\u02a6\nF\3G\3G\5G\u02aa\nG\3H\3H\3H\5H\u02af\nH\5H\u02b1"+
		"\nH\3H\3H\3I\3I\3I\7I\u02b8\nI\fI\16I\u02bb\13I\3J\5J\u02be\nJ\3J\5J\u02c1"+
		"\nJ\3J\3J\3K\3K\3K\3K\3K\3K\3K\5K\u02cc\nK\3L\3L\3L\5L\u02d1\nL\3M\3M"+
		"\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u02e5\nP\3Q\3Q\3Q"+
		"\5Q\u02ea\nQ\5Q\u02ec\nQ\3Q\3Q\3R\3R\3R\7R\u02f3\nR\fR\16R\u02f6\13R\3"+
		"S\3S\3S\5S\u02fb\nS\3S\3S\3T\3T\3T\5T\u0302\nT\3U\3U\5U\u0306\nU\3V\3"+
		"V\3V\3V\3V\7V\u030d\nV\fV\16V\u0310\13V\3V\3V\3W\3W\3W\3W\3W\5W\u0319"+
		"\nW\3W\5W\u031c\nW\3X\5X\u031f\nX\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\5Z\u032b"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0337\nZ\fZ\16Z\u033a\13Z\3[\3[\3"+
		"[\3\\\3\\\3\\\3\\\3]\3]\5]\u0345\n]\3]\3]\5]\u0349\n]\3]\5]\u034c\n]\3"+
		"]\3]\3]\3]\3]\5]\u0353\n]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\5_\u0361"+
		"\n_\5_\u0363\n_\3_\5_\u0366\n_\3_\5_\u0369\n_\5_\u036b\n_\3_\3_\3`\3`"+
		"\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u037d\na\3b\3b\3b\3b\3b\3b\7b"+
		"\u0385\nb\fb\16b\u0388\13b\3c\3c\3c\5c\u038d\nc\3d\3d\3d\3d\5d\u0393\n"+
		"d\3d\3d\3e\3e\3e\3e\5e\u039b\ne\3e\2\4\u00b2\u00c2f\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\2\b\4\2\7\7AA\3\2\21\22\3\2\23\35\4\2DGJJ\4\2\23\35"+
		"8?\7\2\20\20\23\24\26\27\34\34@@\2\u03c5\2\u00ca\3\2\2\2\4\u00dc\3\2\2"+
		"\2\6\u00df\3\2\2\2\b\u00ee\3\2\2\2\n\u00f2\3\2\2\2\f\u00f7\3\2\2\2\16"+
		"\u00fc\3\2\2\2\20\u00fe\3\2\2\2\22\u010c\3\2\2\2\24\u0114\3\2\2\2\26\u011c"+
		"\3\2\2\2\30\u0124\3\2\2\2\32\u0132\3\2\2\2\34\u0135\3\2\2\2\36\u013b\3"+
		"\2\2\2 \u013e\3\2\2\2\"\u0145\3\2\2\2$\u014a\3\2\2\2&\u0158\3\2\2\2(\u0162"+
		"\3\2\2\2*\u016b\3\2\2\2,\u017d\3\2\2\2.\u0185\3\2\2\2\60\u0187\3\2\2\2"+
		"\62\u0189\3\2\2\2\64\u018d\3\2\2\2\66\u0190\3\2\2\28\u0195\3\2\2\2:\u0199"+
		"\3\2\2\2<\u019d\3\2\2\2>\u019f\3\2\2\2@\u01a3\3\2\2\2B\u01a7\3\2\2\2D"+
		"\u01ab\3\2\2\2F\u01af\3\2\2\2H\u01b2\3\2\2\2J\u01b4\3\2\2\2L\u01b7\3\2"+
		"\2\2N\u01c8\3\2\2\2P\u01ca\3\2\2\2R\u01dc\3\2\2\2T\u01e3\3\2\2\2V\u01e5"+
		"\3\2\2\2X\u01f7\3\2\2\2Z\u01ff\3\2\2\2\\\u0206\3\2\2\2^\u0208\3\2\2\2"+
		"`\u0210\3\2\2\2b\u021a\3\2\2\2d\u0224\3\2\2\2f\u022c\3\2\2\2h\u0230\3"+
		"\2\2\2j\u0239\3\2\2\2l\u0249\3\2\2\2n\u024e\3\2\2\2p\u0257\3\2\2\2r\u0259"+
		"\3\2\2\2t\u0266\3\2\2\2v\u0268\3\2\2\2x\u026d\3\2\2\2z\u026f\3\2\2\2|"+
		"\u0271\3\2\2\2~\u0274\3\2\2\2\u0080\u0280\3\2\2\2\u0082\u0284\3\2\2\2"+
		"\u0084\u028f\3\2\2\2\u0086\u029b\3\2\2\2\u0088\u029d\3\2\2\2\u008a\u02a5"+
		"\3\2\2\2\u008c\u02a9\3\2\2\2\u008e\u02ab\3\2\2\2\u0090\u02b4\3\2\2\2\u0092"+
		"\u02bd\3\2\2\2\u0094\u02cb\3\2\2\2\u0096\u02d0\3\2\2\2\u0098\u02d2\3\2"+
		"\2\2\u009a\u02d4\3\2\2\2\u009c\u02d8\3\2\2\2\u009e\u02e4\3\2\2\2\u00a0"+
		"\u02e6\3\2\2\2\u00a2\u02ef\3\2\2\2\u00a4\u02fa\3\2\2\2\u00a6\u0301\3\2"+
		"\2\2\u00a8\u0305\3\2\2\2\u00aa\u0307\3\2\2\2\u00ac\u0318\3\2\2\2\u00ae"+
		"\u031e\3\2\2\2\u00b0\u0322\3\2\2\2\u00b2\u032a\3\2\2\2\u00b4\u033b\3\2"+
		"\2\2\u00b6\u033e\3\2\2\2\u00b8\u0342\3\2\2\2\u00ba\u0356\3\2\2\2\u00bc"+
		"\u035b\3\2\2\2\u00be\u036e\3\2\2\2\u00c0\u037c\3\2\2\2\u00c2\u037e\3\2"+
		"\2\2\u00c4\u038c\3\2\2\2\u00c6\u038e\3\2\2\2\u00c8\u039a\3\2\2\2\u00ca"+
		"\u00cb\5\4\3\2\u00cb\u00d1\5\u00c8e\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce"+
		"\5\u00c8e\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2"+
		"\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d9\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\5\u00c8e\2\u00d6\u00d8\3\2\2"+
		"\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\3\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\3\2\2\u00dd"+
		"\u00de\7A\2\2\u00de\5\3\2\2\2\u00df\u00eb\7\4\2\2\u00e0\u00ec\5\b\5\2"+
		"\u00e1\u00e7\7\5\2\2\u00e2\u00e3\5\b\5\2\u00e3\u00e4\5\u00c8e\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ec\7\6\2\2\u00eb\u00e0\3\2\2\2\u00eb\u00e1\3\2\2\2\u00ec\7\3\2\2\2"+
		"\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\5\n\6\2\u00f1\t\3\2\2\2\u00f2\u00f3\7J\2\2\u00f3"+
		"\13\3\2\2\2\u00f4\u00f8\5\16\b\2\u00f5\u00f8\5\34\17\2\u00f6\u00f8\5 "+
		"\21\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\r\3\2\2\2\u00f9\u00fd\5\20\t\2\u00fa\u00fd\5\30\r\2\u00fb\u00fd\5$\23"+
		"\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\17"+
		"\3\2\2\2\u00fe\u010a\7\b\2\2\u00ff\u010b\5\22\n\2\u0100\u0106\7\5\2\2"+
		"\u0101\u0102\5\22\n\2\u0102\u0103\5\u00c8e\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\7\6\2\2\u010a"+
		"\u00ff\3\2\2\2\u010a\u0100\3\2\2\2\u010b\21\3\2\2\2\u010c\u0112\5\24\13"+
		"\2\u010d\u010f\5p9\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\7\t\2\2\u0111\u0113\5\26\f\2\u0112\u010e\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\23\3\2\2\2\u0114\u0119\7A\2\2\u0115\u0116\7"+
		"\n\2\2\u0116\u0118\7A\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\25\3\2\2\2\u011b\u0119\3\2\2"+
		"\2\u011c\u0121\5\u00c2b\2\u011d\u011e\7\n\2\2\u011e\u0120\5\u00c2b\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\27\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0130\7\13\2\2\u0125\u0131"+
		"\5\32\16\2\u0126\u012c\7\5\2\2\u0127\u0128\5\32\16\2\u0128\u0129\5\u00c8"+
		"e\2\u0129\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0131\7\6\2\2\u0130\u0125\3\2\2\2\u0130\u0126\3\2\2\2\u0131"+
		"\31\3\2\2\2\u0132\u0133\7A\2\2\u0133\u0134\5p9\2\u0134\33\3\2\2\2\u0135"+
		"\u0136\7\f\2\2\u0136\u0139\7A\2\2\u0137\u013a\5\36\20\2\u0138\u013a\5"+
		"\u008aF\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\35\3\2\2\2\u013b"+
		"\u013c\5\u008aF\2\u013c\u013d\5(\25\2\u013d\37\3\2\2\2\u013e\u013f\7\f"+
		"\2\2\u013f\u0140\5\"\22\2\u0140\u0143\7A\2\2\u0141\u0144\5\36\20\2\u0142"+
		"\u0144\5\u008aF\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144!\3\2\2"+
		"\2\u0145\u0146\7\5\2\2\u0146\u0147\5\24\13\2\u0147\u0148\5p9\2\u0148\u0149"+
		"\7\6\2\2\u0149#\3\2\2\2\u014a\u0156\7\r\2\2\u014b\u0157\5&\24\2\u014c"+
		"\u0152\7\5\2\2\u014d\u014e\5&\24\2\u014e\u014f\5\u00c8e\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\7\6"+
		"\2\2\u0156\u014b\3\2\2\2\u0156\u014c\3\2\2\2\u0157%\3\2\2\2\u0158\u0160"+
		"\5\24\13\2\u0159\u015c\5p9\2\u015a\u015b\7\t\2\2\u015b\u015d\5\26\f\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u015f"+
		"\7\t\2\2\u015f\u0161\5\26\f\2\u0160\u0159\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\'\3\2\2\2\u0162\u0163\7\16\2\2\u0163\u0164\5*\26\2\u0164\u0165"+
		"\7\17\2\2\u0165)\3\2\2\2\u0166\u0167\5,\27\2\u0167\u0168\5\u00c8e\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c+\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u017e"+
		"\5\16\b\2\u016f\u017e\5> \2\u0170\u017e\5.\30\2\u0171\u017e\5n8\2\u0172"+
		"\u017e\5@!\2\u0173\u017e\5B\"\2\u0174\u017e\5D#\2\u0175\u017e\5F$\2\u0176"+
		"\u017e\5H%\2\u0177\u017e\5(\25\2\u0178\u017e\5L\'\2\u0179\u017e\5N(\2"+
		"\u017a\u017e\5`\61\2\u017b\u017e\5h\65\2\u017c\u017e\5J&\2\u017d\u016e"+
		"\3\2\2\2\u017d\u016f\3\2\2\2\u017d\u0170\3\2\2\2\u017d\u0171\3\2\2\2\u017d"+
		"\u0172\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u0174\3\2\2\2\u017d\u0175\3\2"+
		"\2\2\u017d\u0176\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d"+
		"\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2"+
		"\2\2\u017e-\3\2\2\2\u017f\u0186\5\62\32\2\u0180\u0186\5\60\31\2\u0181"+
		"\u0186\5\64\33\2\u0182\u0186\5\66\34\2\u0183\u0186\5:\36\2\u0184\u0186"+
		"\5<\37\2\u0185\u017f\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186/\3\2\2\2"+
		"\u0187\u0188\5\u00c2b\2\u0188\61\3\2\2\2\u0189\u018a\5\u00c2b\2\u018a"+
		"\u018b\7\20\2\2\u018b\u018c\5\u00c2b\2\u018c\63\3\2\2\2\u018d\u018e\5"+
		"\u00c2b\2\u018e\u018f\t\3\2\2\u018f\65\3\2\2\2\u0190\u0191\5\26\f\2\u0191"+
		"\u0192\58\35\2\u0192\u0193\5\26\f\2\u0193\67\3\2\2\2\u0194\u0196\t\4\2"+
		"\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\7\t\2\2\u01989\3\2\2\2\u0199\u019a\5\24\13\2\u019a\u019b\7\36\2\2\u019b"+
		"\u019c\5\26\f\2\u019c;\3\2\2\2\u019d\u019e\7\37\2\2\u019e=\3\2\2\2\u019f"+
		"\u01a0\7A\2\2\u01a0\u01a1\7 \2\2\u01a1\u01a2\5,\27\2\u01a2?\3\2\2\2\u01a3"+
		"\u01a5\7!\2\2\u01a4\u01a6\5\26\f\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6A\3\2\2\2\u01a7\u01a9\7\"\2\2\u01a8\u01aa\7A\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aaC\3\2\2\2\u01ab\u01ad\7#\2\2\u01ac\u01ae"+
		"\7A\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01aeE\3\2\2\2\u01af\u01b0"+
		"\7$\2\2\u01b0\u01b1\7A\2\2\u01b1G\3\2\2\2\u01b2\u01b3\7%\2\2\u01b3I\3"+
		"\2\2\2\u01b4\u01b5\7&\2\2\u01b5\u01b6\5\u00c2b\2\u01b6K\3\2\2\2\u01b7"+
		"\u01bb\7\'\2\2\u01b8\u01b9\5.\30\2\u01b9\u01ba\7\37\2\2\u01ba\u01bc\3"+
		"\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\5\u00c2b\2\u01be\u01c4\5(\25\2\u01bf\u01c2\7(\2\2\u01c0\u01c3\5"+
		"L\'\2\u01c1\u01c3\5(\25\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5M\3\2\2\2"+
		"\u01c6\u01c9\5P)\2\u01c7\u01c9\5V,\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3"+
		"\2\2\2\u01c9O\3\2\2\2\u01ca\u01ce\7)\2\2\u01cb\u01cc\5.\30\2\u01cc\u01cd"+
		"\7\37\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf\u01d1\3\2\2\2\u01d0\u01d2\5\u00c2b\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d7\7\16\2\2\u01d4\u01d6\5"+
		"R*\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7\17"+
		"\2\2\u01dbQ\3\2\2\2\u01dc\u01dd\5T+\2\u01dd\u01de\7 \2\2\u01de\u01df\5"+
		"*\26\2\u01dfS\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1\u01e4\5\26\f\2\u01e2\u01e4"+
		"\7+\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4U\3\2\2\2\u01e5\u01e9"+
		"\7)\2\2\u01e6\u01e7\5.\30\2\u01e7\u01e8\7\37\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e6\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5X"+
		"-\2\u01ec\u01f0\7\16\2\2\u01ed\u01ef\5Z.\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2"+
		"\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f4\7\17\2\2\u01f4W\3\2\2\2\u01f5\u01f6\7A\2\2"+
		"\u01f6\u01f8\7\36\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\5\u00b2Z\2\u01fa\u01fb\7\7\2\2\u01fb\u01fc\7\5\2"+
		"\2\u01fc\u01fd\7\13\2\2\u01fd\u01fe\7\6\2\2\u01feY\3\2\2\2\u01ff\u0200"+
		"\5\\/\2\u0200\u0201\7 \2\2\u0201\u0202\5*\26\2\u0202[\3\2\2\2\u0203\u0204"+
		"\7*\2\2\u0204\u0207\5^\60\2\u0205\u0207\7+\2\2\u0206\u0203\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207]\3\2\2\2\u0208\u020d\5p9\2\u0209\u020a\7\n\2\2\u020a"+
		"\u020c\5p9\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2"+
		"\2\u020d\u020e\3\2\2\2\u020e_\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\7,\2\2\u0211\u0215\7\16\2\2\u0212\u0214\5b\62\2\u0213\u0212\3\2\2\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2"+
		"\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7\17\2\2\u0219a\3\2\2\2\u021a\u021b"+
		"\5d\63\2\u021b\u021c\7 \2\2\u021c\u021d\5*\26\2\u021dc\3\2\2\2\u021e\u0221"+
		"\7*\2\2\u021f\u0222\5\62\32\2\u0220\u0222\5f\64\2\u0221\u021f\3\2\2\2"+
		"\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0225\7+\2\2\u0224\u021e"+
		"\3\2\2\2\u0224\u0223\3\2\2\2\u0225e\3\2\2\2\u0226\u0227\5\26\f\2\u0227"+
		"\u0228\7\t\2\2\u0228\u022d\3\2\2\2\u0229\u022a\5\24\13\2\u022a\u022b\7"+
		"\36\2\2\u022b\u022d\3\2\2\2\u022c\u0226\3\2\2\2\u022c\u0229\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5\u00c2b\2\u022fg\3\2\2"+
		"\2\u0230\u0234\7-\2\2\u0231\u0235\5\u00c2b\2\u0232\u0235\5j\66\2\u0233"+
		"\u0235\5l\67\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\5(\25\2\u0237"+
		"i\3\2\2\2\u0238\u023a\5.\30\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2"+
		"\u023a\u023b\3\2\2\2\u023b\u023d\7\37\2\2\u023c\u023e\5\u00c2b\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\7\37"+
		"\2\2\u0240\u0242\5.\30\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"k\3\2\2\2\u0243\u0244\5\26\f\2\u0244\u0245\7\t\2\2\u0245\u024a\3\2\2\2"+
		"\u0246\u0247\5\24\13\2\u0247\u0248\7\36\2\2\u0248\u024a\3\2\2\2\u0249"+
		"\u0243\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u024c\7.\2\2\u024c\u024d\5\u00c2b\2\u024dm\3\2\2\2\u024e\u024f"+
		"\7/\2\2\u024f\u0250\5\u00c2b\2\u0250o\3\2\2\2\u0251\u0258\5r:\2\u0252"+
		"\u0258\5t;\2\u0253\u0254\7\5\2\2\u0254\u0255\5p9\2\u0255\u0256\7\6\2\2"+
		"\u0256\u0258\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0253"+
		"\3\2\2\2\u0258q\3\2\2\2\u0259\u025c\7A\2\2\u025a\u025b\7\7\2\2\u025b\u025d"+
		"\7A\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025ds\3\2\2\2\u025e\u0267"+
		"\5v<\2\u025f\u0267\5\u00aaV\2\u0260\u0267\5|?\2\u0261\u0267\5\u0088E\2"+
		"\u0262\u0267\5~@\2\u0263\u0267\5\u0080A\2\u0264\u0267\5\u0082B\2\u0265"+
		"\u0267\5\u0084C\2\u0266\u025e\3\2\2\2\u0266\u025f\3\2\2\2\u0266\u0260"+
		"\3\2\2\2\u0266\u0261\3\2\2\2\u0266\u0262\3\2\2\2\u0266\u0263\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267u\3\2\2\2\u0268\u0269\7\60\2\2"+
		"\u0269\u026a\5x=\2\u026a\u026b\7\61\2\2\u026b\u026c\5z>\2\u026cw\3\2\2"+
		"\2\u026d\u026e\5\u00c2b\2\u026ey\3\2\2\2\u026f\u0270\5p9\2\u0270{\3\2"+
		"\2\2\u0271\u0272\7\27\2\2\u0272\u0273\5p9\2\u0273}\3\2\2\2\u0274\u0275"+
		"\7\62\2\2\u0275\u027b\7\16\2\2\u0276\u0277\5\u0086D\2\u0277\u0278\5\u00c8"+
		"e\2\u0278\u027a\3\2\2\2\u0279\u0276\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u027f\7\17\2\2\u027f\177\3\2\2\2\u0280\u0281\7\60\2\2\u0281"+
		"\u0282\7\61\2\2\u0282\u0283\5z>\2\u0283\u0081\3\2\2\2\u0284\u0285\7\63"+
		"\2\2\u0285\u0286\7\60\2\2\u0286\u0287\5p9\2\u0287\u0288\7\61\2\2\u0288"+
		"\u0289\5z>\2\u0289\u0083\3\2\2\2\u028a\u0290\7\64\2\2\u028b\u028c\7\64"+
		"\2\2\u028c\u0290\7\20\2\2\u028d\u028e\7\20\2\2\u028e\u0290\7\64\2\2\u028f"+
		"\u028a\3\2\2\2\u028f\u028b\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\5z>\2\u0292\u0085\3\2\2\2\u0293\u0294\6D\2\2\u0294\u0295"+
		"\7A\2\2\u0295\u0296\5\u008eH\2\u0296\u0297\5\u008cG\2\u0297\u029c\3\2"+
		"\2\2\u0298\u029c\5r:\2\u0299\u029a\7A\2\2\u029a\u029c\5\u008eH\2\u029b"+
		"\u0293\3\2\2\2\u029b\u0298\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u0087\3\2"+
		"\2\2\u029d\u029e\7\f\2\2\u029e\u029f\5\u008aF\2\u029f\u0089\3\2\2\2\u02a0"+
		"\u02a1\6F\3\2\u02a1\u02a2\5\u008eH\2\u02a2\u02a3\5\u008cG\2\u02a3\u02a6"+
		"\3\2\2\2\u02a4\u02a6\5\u008eH\2\u02a5\u02a0\3\2\2\2\u02a5\u02a4\3\2\2"+
		"\2\u02a6\u008b\3\2\2\2\u02a7\u02aa\5\u008eH\2\u02a8\u02aa\5p9\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u008d\3\2\2\2\u02ab\u02b0\7\5"+
		"\2\2\u02ac\u02ae\5\u0090I\2\u02ad\u02af\7\n\2\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\6\2\2\u02b3\u008f\3\2\2\2\u02b4"+
		"\u02b9\5\u0092J\2\u02b5\u02b6\7\n\2\2\u02b6\u02b8\5\u0092J\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u0091\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02be\5\24\13\2\u02bd\u02bc\3"+
		"\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02c1\7\65\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\5p"+
		"9\2\u02c3\u0093\3\2\2\2\u02c4\u02cc\5\u0096L\2\u02c5\u02cc\5\u009aN\2"+
		"\u02c6\u02cc\5\u00be`\2\u02c7\u02c8\7\5\2\2\u02c8\u02c9\5\u00c2b\2\u02c9"+
		"\u02ca\7\6\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cb\u02c5\3\2"+
		"\2\2\u02cb\u02c6\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cc\u0095\3\2\2\2\u02cd"+
		"\u02d1\5\u0098M\2\u02ce\u02d1\5\u009cO\2\u02cf\u02d1\5\u00b0Y\2\u02d0"+
		"\u02cd\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u0097\3\2"+
		"\2\2\u02d2\u02d3\t\5\2\2\u02d3\u0099\3\2\2\2\u02d4\u02d5\7A\2\2\u02d5"+
		"\u02d6\7\7\2\2\u02d6\u02d7\7A\2\2\u02d7\u009b\3\2\2\2\u02d8\u02d9\5\u009e"+
		"P\2\u02d9\u02da\5\u00a0Q\2\u02da\u009d\3\2\2\2\u02db\u02e5\5\u00aaV\2"+
		"\u02dc\u02e5\5v<\2\u02dd\u02de\7\60\2\2\u02de\u02df\7\65\2\2\u02df\u02e0"+
		"\7\61\2\2\u02e0\u02e5\5z>\2\u02e1\u02e5\5\u0080A\2\u02e2\u02e5\5\u0082"+
		"B\2\u02e3\u02e5\5r:\2\u02e4\u02db\3\2\2\2\u02e4\u02dc\3\2\2\2\u02e4\u02dd"+
		"\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5"+
		"\u009f\3\2\2\2\u02e6\u02eb\7\16\2\2\u02e7\u02e9\5\u00a2R\2\u02e8\u02ea"+
		"\7\n\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb"+
		"\u02e7\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\7\17"+
		"\2\2\u02ee\u00a1\3\2\2\2\u02ef\u02f4\5\u00a4S\2\u02f0\u02f1\7\n\2\2\u02f1"+
		"\u02f3\5\u00a4S\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u00a3\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f8\5\u00a6T\2\u02f8\u02f9\7 \2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f7\3"+
		"\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\5\u00a8U\2"+
		"\u02fd\u00a5\3\2\2\2\u02fe\u0302\7A\2\2\u02ff\u0302\5\u00c2b\2\u0300\u0302"+
		"\5\u00a0Q\2\u0301\u02fe\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2"+
		"\2\u0302\u00a7\3\2\2\2\u0303\u0306\5\u00c2b\2\u0304\u0306\5\u00a0Q\2\u0305"+
		"\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306\u00a9\3\2\2\2\u0307\u0308\7\66"+
		"\2\2\u0308\u030e\7\16\2\2\u0309\u030a\5\u00acW\2\u030a\u030b\5\u00c8e"+
		"\2\u030b\u030d\3\2\2\2\u030c\u0309\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0312\7\17\2\2\u0312\u00ab\3\2\2\2\u0313\u0314\6W\4\2\u0314\u0315\5\24"+
		"\13\2\u0315\u0316\5p9\2\u0316\u0319\3\2\2\2\u0317\u0319\5\u00aeX\2\u0318"+
		"\u0313\3\2\2\2\u0318\u0317\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u031c\7J"+
		"\2\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u00ad\3\2\2\2\u031d"+
		"\u031f\7\27\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3"+
		"\2\2\2\u0320\u0321\5r:\2\u0321\u00af\3\2\2\2\u0322\u0323\7\f\2\2\u0323"+
		"\u0324\5\36\20\2\u0324\u00b1\3\2\2\2\u0325\u0326\bZ\1\2\u0326\u032b\5"+
		"\u0094K\2\u0327\u032b\5\u00c6d\2\u0328\u032b\7A\2\2\u0329\u032b\7\67\2"+
		"\2\u032a\u0325\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329"+
		"\3\2\2\2\u032b\u0338\3\2\2\2\u032c\u032d\f\t\2\2\u032d\u0337\5\u00b4["+
		"\2\u032e\u032f\f\b\2\2\u032f\u0337\5\u00b6\\\2\u0330\u0331\f\7\2\2\u0331"+
		"\u0337\5\u00b8]\2\u0332\u0333\f\6\2\2\u0333\u0337\5\u00ba^\2\u0334\u0335"+
		"\f\5\2\2\u0335\u0337\5\u00bc_\2\u0336\u032c\3\2\2\2\u0336\u032e\3\2\2"+
		"\2\u0336\u0330\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u033a"+
		"\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00b3\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033b\u033c\7\7\2\2\u033c\u033d\7A\2\2\u033d\u00b5\3\2"+
		"\2\2\u033e\u033f\7\60\2\2\u033f\u0340\5\u00c2b\2\u0340\u0341\7\61\2\2"+
		"\u0341\u00b7\3\2\2\2\u0342\u0352\7\60\2\2\u0343\u0345\5\u00c2b\2\u0344"+
		"\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\7 "+
		"\2\2\u0347\u0349\5\u00c2b\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u0353\3\2\2\2\u034a\u034c\5\u00c2b\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7 \2\2\u034e\u034f\5\u00c2b\2"+
		"\u034f\u0350\7 \2\2\u0350\u0351\5\u00c2b\2\u0351\u0353\3\2\2\2\u0352\u0344"+
		"\3\2\2\2\u0352\u034b\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\7\61\2\2"+
		"\u0355\u00b9\3\2\2\2\u0356\u0357\7\7\2\2\u0357\u0358\7\5\2\2\u0358\u0359"+
		"\5p9\2\u0359\u035a\7\6\2\2\u035a\u00bb\3\2\2\2\u035b\u036a\7\5\2\2\u035c"+
		"\u0363\5\26\f\2\u035d\u0360\5p9\2\u035e\u035f\7\n\2\2\u035f\u0361\5\26"+
		"\f\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362"+
		"\u035c\3\2\2\2\u0362\u035d\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\7\65"+
		"\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367"+
		"\u0369\7\n\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2"+
		"\2\2\u036a\u0362\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\7\6\2\2\u036d\u00bd\3\2\2\2\u036e\u036f\5\u00c0a\2\u036f\u0370"+
		"\7\7\2\2\u0370\u0371\7A\2\2\u0371\u00bf\3\2\2\2\u0372\u037d\5r:\2\u0373"+
		"\u0374\7\5\2\2\u0374\u0375\7\27\2\2\u0375\u0376\5r:\2\u0376\u0377\7\6"+
		"\2\2\u0377\u037d\3\2\2\2\u0378\u0379\7\5\2\2\u0379\u037a\5\u00c0a\2\u037a"+
		"\u037b\7\6\2\2\u037b\u037d\3\2\2\2\u037c\u0372\3\2\2\2\u037c\u0373\3\2"+
		"\2\2\u037c\u0378\3\2\2\2\u037d\u00c1\3\2\2\2\u037e\u037f\bb\1\2\u037f"+
		"\u0380\5\u00c4c\2\u0380\u0386\3\2\2\2\u0381\u0382\f\3\2\2\u0382\u0383"+
		"\t\6\2\2\u0383\u0385\5\u00c2b\4\u0384\u0381\3\2\2\2\u0385\u0388\3\2\2"+
		"\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u00c3\3\2\2\2\u0388\u0386"+
		"\3\2\2\2\u0389\u038d\5\u00b2Z\2\u038a\u038b\t\7\2\2\u038b\u038d\5\u00c4"+
		"c\2\u038c\u0389\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u00c5\3\2\2\2\u038e"+
		"\u038f\5p9\2\u038f\u0390\7\5\2\2\u0390\u0392\5\u00c2b\2\u0391\u0393\7"+
		"\n\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\7\6\2\2\u0395\u00c7\3\2\2\2\u0396\u039b\7\37\2\2\u0397\u039b\7"+
		"\2\2\3\u0398\u039b\6e\13\2\u0399\u039b\6e\f\2\u039a\u0396\3\2\2\2\u039a"+
		"\u0397\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u00c9\3\2"+
		"\2\2_\u00d1\u00d9\u00e7\u00eb\u00ee\u00f7\u00fc\u0106\u010a\u010e\u0112"+
		"\u0119\u0121\u012c\u0130\u0139\u0143\u0152\u0156\u015c\u0160\u016b\u017d"+
		"\u0185\u0195\u01a5\u01a9\u01ad\u01bb\u01c2\u01c4\u01c8\u01ce\u01d1\u01d7"+
		"\u01e3\u01e9\u01f0\u01f7\u0206\u020d\u0215\u0221\u0224\u022c\u0234\u0239"+
		"\u023d\u0241\u0249\u0257\u025c\u0266\u027b\u028f\u029b\u02a5\u02a9\u02ae"+
		"\u02b0\u02b9\u02bd\u02c0\u02cb\u02d0\u02e4\u02e9\u02eb\u02f4\u02fa\u0301"+
		"\u0305\u030e\u0318\u031b\u031e\u032a\u0336\u0338\u0344\u0348\u034b\u0352"+
		"\u0360\u0362\u0365\u0368\u036a\u037c\u0386\u038c\u0392\u039a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}