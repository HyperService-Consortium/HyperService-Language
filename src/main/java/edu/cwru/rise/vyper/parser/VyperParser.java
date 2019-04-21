// Generated from /Users/Jian/Downloads/Hyper-Service-Language/antlr/Vyper.g4 by ANTLR 4.7

package edu.cwru.rise.vyper.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VyperParser extends Parser {
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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, HexNumber=89, NumberUnit=90, HexLiteral=91, BooleanLiteral=92, 
		StringLiteral=93, Augassign=94, Identifier=95, IntegerNumber=96, DecimalNumber=97, 
		WS=98, LINE_COMMENT=99;
	public static final int
		RULE_sourceUnit = 0, RULE_contractDefinition = 1, RULE_customUnitDeclarations = 2, 
		RULE_customUnitDeclaration = 3, RULE_interfaceDefinition = 4, RULE_import_name = 5, 
		RULE_dotted_as_names = 6, RULE_dotted_as_name = 7, RULE_dotted_name = 8, 
		RULE_import_from = 9, RULE_importDeclarations = 10, RULE_importDeclaration = 11, 
		RULE_extracting_Interfaces = 12, RULE_contract_Interfaces = 13, RULE_contract_def = 14, 
		RULE_stateVariableDeclaration = 15, RULE_type = 16, RULE_valueType = 17, 
		RULE_integerValue = 18, RULE_unitType = 19, RULE_customUnitType = 20, 
		RULE_definedType = 21, RULE_referenceType = 22, RULE_structDefinition = 23, 
		RULE_structVar = 24, RULE_mappingType = 25, RULE_listType = 26, RULE_eventDefinition = 27, 
		RULE_eventParameterList = 28, RULE_eventParameter = 29, RULE_decorator = 30, 
		RULE_decorators = 31, RULE_functionDefinition = 32, RULE_functionArgument = 33, 
		RULE_parameter = 34, RULE_expression = 35, RULE_primaryExpression = 36, 
		RULE_localVar = 37, RULE_expressionList = 38, RULE_nameValueList = 39, 
		RULE_nameValue = 40, RULE_functionCallArguments = 41, RULE_numberLiteral = 42, 
		RULE_identifier = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "contractDefinition", "customUnitDeclarations", "customUnitDeclaration", 
			"interfaceDefinition", "import_name", "dotted_as_names", "dotted_as_name", 
			"dotted_name", "import_from", "importDeclarations", "importDeclaration", 
			"extracting_Interfaces", "contract_Interfaces", "contract_def", "stateVariableDeclaration", 
			"type", "valueType", "integerValue", "unitType", "customUnitType", "definedType", 
			"referenceType", "structDefinition", "structVar", "mappingType", "listType", 
			"eventDefinition", "eventParameterList", "eventParameter", "decorator", 
			"decorators", "functionDefinition", "functionArgument", "parameter", 
			"expression", "primaryExpression", "localVar", "expressionList", "nameValueList", 
			"nameValue", "functionCallArguments", "numberLiteral", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'units'", "':'", "'{'", "','", "'}'", "'import'", "'as'", "'.'", 
			"'from'", "'...'", "'*'", "'('", "')'", "'vyper'", "'-f'", "'interface'", 
			"'external_interface'", "'/'", "'.vy'", "'contract'", "'def'", "'='", 
			"'->'", "'constant'", "'modifying'", "'public'", "'bool'", "'address'", 
			"'bytes32'", "'int128'", "'uint256'", "'decimal'", "'timestamp'", "'timedelta'", 
			"'wei_value'", "'struct'", "'map('", "'bytes'", "'string'", "'['", "']'", 
			"'event'", "'indexed('", "'@'", "'payable'", "'nonrentant'", "'private'", 
			"'++'", "'--'", "'new'", "'+'", "'-'", "'after'", "'delete'", "'!'", 
			"'~'", "'**'", "'%'", "'<<'", "'>>'", "'&'", "'^'", "'|'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'and'", "'or'", "'not'", "'||'", 
			"'?'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'min'", "'max'", "'wei'"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "HexNumber", "NumberUnit", "HexLiteral", 
			"BooleanLiteral", "StringLiteral", "Augassign", "Identifier", "IntegerNumber", 
			"DecimalNumber", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Vyper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VyperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VyperParser.EOF, 0); }
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<CustomUnitDeclarationsContext> customUnitDeclarations() {
			return getRuleContexts(CustomUnitDeclarationsContext.class);
		}
		public CustomUnitDeclarationsContext customUnitDeclarations(int i) {
			return getRuleContext(CustomUnitDeclarationsContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<StateVariableDeclarationContext> stateVariableDeclaration() {
			return getRuleContexts(StateVariableDeclarationContext.class);
		}
		public StateVariableDeclarationContext stateVariableDeclaration(int i) {
			return getRuleContext(StateVariableDeclarationContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__19) | (1L << T__35) | (1L << T__43))) != 0) || _la==T__87 || _la==Identifier) {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(88);
					interfaceDefinition();
					}
					break;
				case 2:
					{
					setState(89);
					customUnitDeclarations();
					}
					break;
				case 3:
					{
					setState(90);
					eventDefinition();
					}
					break;
				case 4:
					{
					setState(91);
					structDefinition();
					}
					break;
				case 5:
					{
					setState(92);
					stateVariableDeclaration();
					}
					break;
				case 6:
					{
					setState(93);
					functionDefinition();
					}
					break;
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<CustomUnitDeclarationsContext> customUnitDeclarations() {
			return getRuleContexts(CustomUnitDeclarationsContext.class);
		}
		public CustomUnitDeclarationsContext customUnitDeclarations(int i) {
			return getRuleContext(CustomUnitDeclarationsContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<StateVariableDeclarationContext> stateVariableDeclaration() {
			return getRuleContexts(StateVariableDeclarationContext.class);
		}
		public StateVariableDeclarationContext stateVariableDeclaration(int i) {
			return getRuleContext(StateVariableDeclarationContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					interfaceDefinition();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(107);
				customUnitDeclarations();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					eventDefinition();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(119);
				structDefinition();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__87 || _la==Identifier) {
				{
				{
				setState(125);
				stateVariableDeclaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				functionDefinition();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__43 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomUnitDeclarationsContext extends ParserRuleContext {
		public List<CustomUnitDeclarationContext> customUnitDeclaration() {
			return getRuleContexts(CustomUnitDeclarationContext.class);
		}
		public CustomUnitDeclarationContext customUnitDeclaration(int i) {
			return getRuleContext(CustomUnitDeclarationContext.class,i);
		}
		public CustomUnitDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterCustomUnitDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitCustomUnitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitCustomUnitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomUnitDeclarationsContext customUnitDeclarations() throws RecognitionException {
		CustomUnitDeclarationsContext _localctx = new CustomUnitDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_customUnitDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__0);
			setState(137);
			match(T__1);
			setState(138);
			match(T__2);
			setState(139);
			customUnitDeclaration();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(140);
				match(T__3);
				setState(141);
				customUnitDeclaration();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomUnitDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(VyperParser.StringLiteral, 0); }
		public CustomUnitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterCustomUnitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitCustomUnitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitCustomUnitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomUnitDeclarationContext customUnitDeclaration() throws RecognitionException {
		CustomUnitDeclarationContext _localctx = new CustomUnitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_customUnitDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			identifier();
			setState(150);
			match(T__1);
			setState(151);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Extracting_InterfacesContext extracting_Interfaces() {
			return getRuleContext(Extracting_InterfacesContext.class,0);
		}
		public Contract_InterfacesContext contract_Interfaces() {
			return getRuleContext(Contract_InterfacesContext.class,0);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitInterfaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitInterfaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDefinition);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				import_name();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				import_from();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				extracting_Interfaces();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				contract_Interfaces();
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

	public static class Import_nameContext extends ParserRuleContext {
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__5);
			setState(160);
			dotted_as_names();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			dotted_as_name();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(163);
				match(T__3);
				setState(164);
				dotted_as_name();
				}
				}
				setState(169);
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

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			dotted_name();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(171);
				match(T__6);
				setState(172);
				identifier();
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			identifier();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(176);
				match(T__7);
				setState(177);
				identifier();
				}
				}
				setState(182);
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

	public static class Import_fromContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			match(T__8);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==T__9) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 || _la==T__9 );
				}
				break;
			}
			setState(198);
			match(T__5);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(199);
				match(T__10);
				}
				break;
			case T__11:
				{
				setState(200);
				match(T__11);
				setState(201);
				importDeclarations();
				setState(202);
				match(T__12);
				}
				break;
			case T__13:
			case T__87:
			case Identifier:
				{
				setState(204);
				importDeclarations();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ImportDeclarationsContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImportDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImportDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImportDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			importDeclaration();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(208);
				match(T__3);
				setState(209);
				importDeclaration();
				}
				}
				setState(214);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(216);
				match(T__6);
				setState(217);
				identifier();
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

	public static class Extracting_InterfacesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Extracting_InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extracting_Interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExtracting_Interfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExtracting_Interfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExtracting_Interfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extracting_InterfacesContext extracting_Interfaces() throws RecognitionException {
		Extracting_InterfacesContext _localctx = new Extracting_InterfacesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_extracting_Interfaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__13);
			setState(221);
			match(T__14);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			identifier();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(224);
				match(T__17);
				setState(225);
				identifier();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contract_InterfacesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Contract_defContext> contract_def() {
			return getRuleContexts(Contract_defContext.class);
		}
		public Contract_defContext contract_def(int i) {
			return getRuleContext(Contract_defContext.class,i);
		}
		public Contract_InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_Interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterContract_Interfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitContract_Interfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitContract_Interfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contract_InterfacesContext contract_Interfaces() throws RecognitionException {
		Contract_InterfacesContext _localctx = new Contract_InterfacesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_contract_Interfaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__19);
			setState(234);
			identifier();
			setState(235);
			match(T__1);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(236);
				contract_def();
				}
				}
				setState(241);
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

	public static class Contract_defContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Contract_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterContract_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitContract_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitContract_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contract_defContext contract_def() throws RecognitionException {
		Contract_defContext _localctx = new Contract_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contract_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__20);
			setState(243);
			identifier();
			setState(244);
			match(T__11);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__87 || _la==Identifier) {
				{
				{
				setState(245);
				parameter();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(246);
					match(T__21);
					setState(247);
					expression(0);
					}
				}

				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__12);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(256);
				match(T__22);
				setState(257);
				type();
				}
			}

			setState(260);
			match(T__1);
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext varName;
		public TypeContext varType;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((StateVariableDeclarationContext)_localctx).varName = identifier();
			setState(264);
			match(T__1);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(265);
				match(T__25);
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(268);
				match(T__23);
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(271);
				match(T__11);
				}
			}

			setState(274);
			((StateVariableDeclarationContext)_localctx).varType = type();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(275);
				match(T__12);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(278);
				match(T__21);
				setState(279);
				expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public DefinedTypeContext definedType() {
			return getRuleContext(DefinedTypeContext.class,0);
		}
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				valueType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				definedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				unitType();
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

	public static class ValueTypeContext extends ParserRuleContext {
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valueType);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(T__28);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				integerValue();
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

	public static class IntegerValueContext extends ParserRuleContext {
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class UnitTypeContext extends ParserRuleContext {
		public CustomUnitTypeContext customUnitType() {
			return getRuleContext(CustomUnitTypeContext.class,0);
		}
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unitType);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(T__34);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				customUnitType();
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

	public static class CustomUnitTypeContext extends ParserRuleContext {
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CustomUnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterCustomUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitCustomUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitCustomUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomUnitTypeContext customUnitType() throws RecognitionException {
		CustomUnitTypeContext _localctx = new CustomUnitTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_customUnitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			integerValue();
			setState(303);
			match(T__11);
			setState(304);
			identifier();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__17) {
				{
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				identifier();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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

	public static class DefinedTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDefinedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedTypeContext definedType() throws RecognitionException {
		DefinedTypeContext _localctx = new DefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_definedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public MappingTypeContext mappingType() {
			return getRuleContext(MappingTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_referenceType);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				mappingType();
				}
				break;
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				listType();
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext structName;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructVarContext> structVar() {
			return getRuleContexts(StructVarContext.class);
		}
		public StructVarContext structVar(int i) {
			return getRuleContext(StructVarContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__35);
			setState(321);
			((StructDefinitionContext)_localctx).structName = identifier();
			setState(322);
			match(T__1);
			setState(324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(323);
					structVar();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructVarContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterStructVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitStructVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitStructVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVarContext structVar() throws RecognitionException {
		StructVarContext _localctx = new StructVarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			identifier();
			setState(329);
			match(T__1);
			setState(330);
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

	public static class MappingTypeContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterMappingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitMappingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitMappingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mappingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__36);
			setState(333);
			valueType();
			setState(334);
			match(T__3);
			setState(335);
			type();
			setState(336);
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

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode IntegerNumber() { return getToken(VyperParser.IntegerNumber, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				{
				setState(338);
				valueType();
				}
				break;
			case T__37:
				{
				setState(339);
				match(T__37);
				}
				break;
			case T__38:
				{
				setState(340);
				match(T__38);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			match(T__39);
			setState(344);
			match(IntegerNumber);
			setState(345);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eventDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Identifier);
			setState(348);
			match(T__1);
			setState(349);
			match(T__41);
			setState(350);
			eventParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__11);
			setState(353);
			match(T__2);
			setState(354);
			eventParameter();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(355);
				match(T__3);
				setState(356);
				eventParameter();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(T__4);
			setState(363);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eventParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(Identifier);
			setState(366);
			match(T__1);
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				{
				{
				setState(367);
				match(T__42);
				setState(368);
				type();
				setState(369);
				match(T__12);
				}
				}
				break;
			case T__13:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__87:
			case Identifier:
				{
				setState(371);
				type();
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

	public static class DecoratorContext extends ParserRuleContext {
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__43);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__44) {
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(378);
				match(T__45);
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

	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDecorators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__43);
			setState(382);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__46) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(383);
				decorator();
				}
				}
				setState(388);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public FunctionArgumentContext functionArgument() {
			return getRuleContext(FunctionArgumentContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			decorators();
			setState(390);
			functionArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public IdentifierContext funcName;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__20);
			setState(393);
			((FunctionArgumentContext)_localctx).funcName = identifier();
			setState(394);
			match(T__11);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__87 || _la==Identifier) {
				{
				{
				setState(395);
				parameter();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(396);
					match(T__21);
					setState(397);
					expression(0);
					}
				}

				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(T__12);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(406);
				match(T__22);
				setState(407);
				type();
				}
			}

			setState(410);
			match(T__1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					expression(0);
					}
					} 
				}
				setState(416);
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

	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext parName;
		public TypeContext parType;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((ParameterContext)_localctx).parName = identifier();
			setState(418);
			match(T__1);
			setState(419);
			((ParameterContext)_localctx).parType = type();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(420);
				match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				{
				setState(424);
				match(T__49);
				setState(425);
				type();
				}
				break;
			case T__11:
				{
				setState(426);
				match(T__11);
				setState(427);
				expression(0);
				setState(428);
				match(T__12);
				}
				break;
			case T__47:
			case T__48:
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==T__47 || _la==T__48) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
				expression(21);
				}
				break;
			case T__50:
			case T__51:
				{
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==T__50 || _la==T__51) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
				expression(20);
				}
				break;
			case T__52:
			case T__53:
				{
				setState(434);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(435);
				expression(19);
				}
				break;
			case T__54:
				{
				setState(436);
				match(T__54);
				setState(437);
				expression(18);
				}
				break;
			case T__55:
				{
				setState(438);
				match(T__55);
				setState(439);
				expression(17);
				}
				break;
			case T__85:
			case T__86:
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==T__85 || _la==T__86) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				expression(3);
				}
				break;
			case T__1:
				{
				setState(442);
				match(T__1);
				setState(443);
				expression(2);
				}
				break;
			case T__13:
			case T__87:
			case HexNumber:
			case HexLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case Identifier:
			case IntegerNumber:
			case DecimalNumber:
				{
				setState(444);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(448);
						match(T__56);
						setState(449);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(451);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__57))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(452);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(453);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(454);
						_la = _input.LA(1);
						if ( !(_la==T__50 || _la==T__51) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(455);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(457);
						_la = _input.LA(1);
						if ( !(_la==T__58 || _la==T__59) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(458);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(460);
						match(T__60);
						setState(461);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(463);
						match(T__61);
						setState(464);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(466);
						match(T__62);
						setState(467);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(469);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(470);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(472);
						_la = _input.LA(1);
						if ( !(_la==T__67 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(473);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(475);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(476);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(478);
						match(T__73);
						setState(479);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(481);
						match(T__74);
						setState(482);
						expression(0);
						setState(483);
						match(T__1);
						setState(484);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(487);
						_la = _input.LA(1);
						if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)) | (1L << (T__79 - 22)) | (1L << (T__80 - 22)) | (1L << (T__81 - 22)) | (1L << (T__82 - 22)) | (1L << (T__83 - 22)) | (1L << (T__84 - 22)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(488);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(490);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(491);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(492);
						match(T__39);
						setState(493);
						expression(0);
						setState(494);
						match(T__40);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(497);
						match(T__11);
						setState(498);
						functionCallArguments();
						setState(499);
						match(T__12);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(502);
						match(T__7);
						setState(503);
						identifier();
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(VyperParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(VyperParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(VyperParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IntegerNumber() { return getToken(VyperParser.IntegerNumber, 0); }
		public NameValueContext nameValue() {
			return getRuleContext(NameValueContext.class,0);
		}
		public LocalVarContext localVar() {
			return getRuleContext(LocalVarContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primaryExpression);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				identifier();
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(514);
					match(T__39);
					setState(515);
					match(IntegerNumber);
					setState(516);
					match(T__40);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(519);
				nameValue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				localVar();
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

	public static class LocalVarContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterLocalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitLocalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitLocalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarContext localVar() throws RecognitionException {
		LocalVarContext _localctx = new LocalVarContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_localVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier();
			setState(524);
			match(T__1);
			setState(525);
			type();
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(526);
				match(T__21);
				setState(527);
				expression(0);
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
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			expression(0);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(531);
				match(T__3);
				setState(532);
				expression(0);
				}
				}
				setState(537);
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

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			nameValue();
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					match(T__3);
					setState(540);
					nameValue();
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(546);
				match(T__3);
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

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			identifier();
			setState(550);
			match(T__1);
			setState(551);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionCallArguments);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(T__2);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__87 || _la==Identifier) {
					{
					setState(554);
					nameValueList();
					}
				}

				setState(557);
				match(T__4);
				}
				break;
			case T__1:
			case T__11:
			case T__12:
			case T__13:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__85:
			case T__86:
			case T__87:
			case HexNumber:
			case HexLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case Identifier:
			case IntegerNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (T__85 - 86)) | (1L << (T__86 - 86)) | (1L << (T__87 - 86)) | (1L << (HexNumber - 86)) | (1L << (HexLiteral - 86)) | (1L << (BooleanLiteral - 86)) | (1L << (StringLiteral - 86)) | (1L << (Identifier - 86)) | (1L << (IntegerNumber - 86)) | (1L << (DecimalNumber - 86)))) != 0)) {
					{
					setState(558);
					expressionList();
					}
				}

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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerNumber() { return getToken(VyperParser.IntegerNumber, 0); }
		public TerminalNode DecimalNumber() { return getToken(VyperParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(VyperParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(VyperParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (HexNumber - 89)) | (1L << (IntegerNumber - 89)) | (1L << (DecimalNumber - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(564);
				match(NumberUnit);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__87 || _la==Identifier) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u023c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3"+
		"\7\3i\n\3\f\3\16\3l\13\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\7\3u\n\3\f\3"+
		"\16\3x\13\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084"+
		"\13\3\3\3\6\3\u0087\n\3\r\3\16\3\u0088\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0091"+
		"\n\4\f\4\16\4\u0094\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00a0"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab\13\b\3\t\3\t"+
		"\3\t\5\t\u00b0\n\t\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\13"+
		"\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13\3\13\3\13\6\13\u00c3\n\13"+
		"\r\13\16\13\u00c4\5\13\u00c7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00d0\n\13\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\3"+
		"\r\5\r\u00dd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16"+
		"\16\u00e8\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00f0\n\17\f\17\16"+
		"\17\u00f3\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\7\20\u00fd"+
		"\n\20\f\20\16\20\u0100\13\20\3\20\3\20\3\20\5\20\u0105\n\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\5\21\u010d\n\21\3\21\5\21\u0110\n\21\3\21\5\21\u0113"+
		"\n\21\3\21\3\21\5\21\u0117\n\21\3\21\3\21\5\21\u011b\n\21\3\22\3\22\3"+
		"\22\3\22\5\22\u0121\n\22\3\23\3\23\3\23\3\23\5\23\u0127\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u012f\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u0136"+
		"\n\26\f\26\16\26\u0139\13\26\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0141"+
		"\n\30\3\31\3\31\3\31\3\31\6\31\u0147\n\31\r\31\16\31\u0148\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0158\n\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0168\n\36\f\36\16\36\u016b\13\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0177\n\37\3 \3 \5 \u017b\n \3 \5 \u017e\n "+
		"\3!\3!\3!\7!\u0183\n!\f!\16!\u0186\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5"+
		"#\u0191\n#\7#\u0193\n#\f#\16#\u0196\13#\3#\3#\3#\5#\u019b\n#\3#\3#\7#"+
		"\u019f\n#\f#\16#\u01a2\13#\3$\3$\3$\3$\5$\u01a8\n$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01c0\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\7%\u01fb\n%\f%\16%\u01fe\13%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\5&\u0208\n&\3&\3&\5&\u020c\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0213\n\'"+
		"\3(\3(\3(\7(\u0218\n(\f(\16(\u021b\13(\3)\3)\3)\7)\u0220\n)\f)\16)\u0223"+
		"\13)\3)\5)\u0226\n)\3*\3*\3*\3*\3+\3+\5+\u022e\n+\3+\3+\5+\u0232\n+\5"+
		"+\u0234\n+\3,\3,\5,\u0238\n,\3-\3-\3-\2\3H.\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\25\4\2\n\n\f\f\3"+
		"\2\22\23\3\2\32\33\3\2 \"\4\2\r\r\24\24\4\2\32\32//\4\2\34\34\61\61\3"+
		"\2\62\63\3\2\65\66\3\2\678\3\2XY\5\2\r\r\24\24<<\3\2=>\3\2BE\3\2FG\3\2"+
		"HK\4\2\30\30NW\4\2[[bc\5\2\20\20ZZaa\2\u0274\2b\3\2\2\2\4j\3\2\2\2\6\u008a"+
		"\3\2\2\2\b\u0097\3\2\2\2\n\u009f\3\2\2\2\f\u00a1\3\2\2\2\16\u00a4\3\2"+
		"\2\2\20\u00ac\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3\2\2\2\26\u00d1\3\2\2"+
		"\2\30\u00d9\3\2\2\2\32\u00de\3\2\2\2\34\u00eb\3\2\2\2\36\u00f4\3\2\2\2"+
		" \u0109\3\2\2\2\"\u0120\3\2\2\2$\u0126\3\2\2\2&\u0128\3\2\2\2(\u012e\3"+
		"\2\2\2*\u0130\3\2\2\2,\u013c\3\2\2\2.\u0140\3\2\2\2\60\u0142\3\2\2\2\62"+
		"\u014a\3\2\2\2\64\u014e\3\2\2\2\66\u0157\3\2\2\28\u015d\3\2\2\2:\u0162"+
		"\3\2\2\2<\u016f\3\2\2\2>\u0178\3\2\2\2@\u017f\3\2\2\2B\u0187\3\2\2\2D"+
		"\u018a\3\2\2\2F\u01a3\3\2\2\2H\u01bf\3\2\2\2J\u020b\3\2\2\2L\u020d\3\2"+
		"\2\2N\u0214\3\2\2\2P\u021c\3\2\2\2R\u0227\3\2\2\2T\u0233\3\2\2\2V\u0235"+
		"\3\2\2\2X\u0239\3\2\2\2Za\5\n\6\2[a\5\6\4\2\\a\58\35\2]a\5\60\31\2^a\5"+
		" \21\2_a\5B\"\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2\2\3f\3"+
		"\3\2\2\2gi\5\n\6\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2l"+
		"j\3\2\2\2mo\5\6\4\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2"+
		"rp\3\2\2\2su\58\35\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2"+
		"xv\3\2\2\2y{\5\60\31\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0082"+
		"\3\2\2\2~|\3\2\2\2\177\u0081\5 \21\2\u0080\177\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5B\"\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u008b"+
		"\7\3\2\2\u008b\u008c\7\4\2\2\u008c\u008d\7\5\2\2\u008d\u0092\5\b\5\2\u008e"+
		"\u008f\7\6\2\2\u008f\u0091\5\b\5\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\7\2\2\u0096\7\3\2\2\2\u0097\u0098\5X-\2\u0098"+
		"\u0099\7\4\2\2\u0099\u009a\7_\2\2\u009a\t\3\2\2\2\u009b\u00a0\5\f\7\2"+
		"\u009c\u00a0\5\24\13\2\u009d\u00a0\5\32\16\2\u009e\u00a0\5\34\17\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\16\b\2\u00a3\r"+
		"\3\2\2\2\u00a4\u00a9\5\20\t\2\u00a5\u00a6\7\6\2\2\u00a6\u00a8\5\20\t\2"+
		"\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\5\22\n\2\u00ad"+
		"\u00ae\7\t\2\2\u00ae\u00b0\5X-\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\21\3\2\2\2\u00b1\u00b6\5X-\2\u00b2\u00b3\7\n\2\2\u00b3\u00b5"+
		"\5X-\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c6\7\13\2"+
		"\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c7\5\22\n\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00bd\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cf\7\b"+
		"\2\2\u00c9\u00d0\7\r\2\2\u00ca\u00cb\7\16\2\2\u00cb\u00cc\5\26\f\2\u00cc"+
		"\u00cd\7\17\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00c9\3"+
		"\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00d6\5\30\r\2\u00d2\u00d3\7\6\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00d2\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\27\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\5X-\2\u00da\u00db\7\t\2\2"+
		"\u00db\u00dd\5X-\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\31\3"+
		"\2\2\2\u00de\u00df\7\20\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\t\3\2\2\u00e1"+
		"\u00e6\5X-\2\u00e2\u00e3\7\24\2\2\u00e3\u00e5\5X-\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea\33\3\2\2\2\u00eb"+
		"\u00ec\7\26\2\2\u00ec\u00ed\5X-\2\u00ed\u00f1\7\4\2\2\u00ee\u00f0\5\36"+
		"\20\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\27\2"+
		"\2\u00f5\u00f6\5X-\2\u00f6\u00fe\7\16\2\2\u00f7\u00fa\5F$\2\u00f8\u00f9"+
		"\7\30\2\2\u00f9\u00fb\5H%\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0104\7\17\2\2\u0102\u0103\7\31\2\2\u0103\u0105\5\"\22\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\4\2\2\u0107"+
		"\u0108\t\4\2\2\u0108\37\3\2\2\2\u0109\u010a\5X-\2\u010a\u010c\7\4\2\2"+
		"\u010b\u010d\7\34\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0110\7\32\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0112\3\2\2\2\u0111\u0113\7\16\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5\"\22\2\u0115\u0117\7\17\2\2"+
		"\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0119"+
		"\7\30\2\2\u0119\u011b\5H%\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"!\3\2\2\2\u011c\u0121\5.\30\2\u011d\u0121\5$\23\2\u011e\u0121\5,\27\2"+
		"\u011f\u0121\5(\25\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u011f\3\2\2\2\u0121#\3\2\2\2\u0122\u0127\7\35\2\2\u0123"+
		"\u0127\7\36\2\2\u0124\u0127\7\37\2\2\u0125\u0127\5&\24\2\u0126\u0122\3"+
		"\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"%\3\2\2\2\u0128\u0129\t\5\2\2\u0129\'\3\2\2\2\u012a\u012f\7#\2\2\u012b"+
		"\u012f\7$\2\2\u012c\u012f\7%\2\2\u012d\u012f\5*\26\2\u012e\u012a\3\2\2"+
		"\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f)"+
		"\3\2\2\2\u0130\u0131\5&\24\2\u0131\u0132\7\16\2\2\u0132\u0137\5X-\2\u0133"+
		"\u0134\t\6\2\2\u0134\u0136\5X-\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2"+
		"\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\7\17\2\2\u013b+\3\2\2\2\u013c\u013d\5X-\2\u013d-"+
		"\3\2\2\2\u013e\u0141\5\64\33\2\u013f\u0141\5\66\34\2\u0140\u013e\3\2\2"+
		"\2\u0140\u013f\3\2\2\2\u0141/\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144\5"+
		"X-\2\u0144\u0146\7\4\2\2\u0145\u0147\5\62\32\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\61\3\2\2"+
		"\2\u014a\u014b\5X-\2\u014b\u014c\7\4\2\2\u014c\u014d\5\"\22\2\u014d\63"+
		"\3\2\2\2\u014e\u014f\7\'\2\2\u014f\u0150\5$\23\2\u0150\u0151\7\6\2\2\u0151"+
		"\u0152\5\"\22\2\u0152\u0153\7\17\2\2\u0153\65\3\2\2\2\u0154\u0158\5$\23"+
		"\2\u0155\u0158\7(\2\2\u0156\u0158\7)\2\2\u0157\u0154\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7*\2\2\u015a"+
		"\u015b\7b\2\2\u015b\u015c\7+\2\2\u015c\67\3\2\2\2\u015d\u015e\7a\2\2\u015e"+
		"\u015f\7\4\2\2\u015f\u0160\7,\2\2\u0160\u0161\5:\36\2\u01619\3\2\2\2\u0162"+
		"\u0163\7\16\2\2\u0163\u0164\7\5\2\2\u0164\u0169\5<\37\2\u0165\u0166\7"+
		"\6\2\2\u0166\u0168\5<\37\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u016d\7\7\2\2\u016d\u016e\7\17\2\2\u016e;\3\2\2\2\u016f\u0170"+
		"\7a\2\2\u0170\u0176\7\4\2\2\u0171\u0172\7-\2\2\u0172\u0173\5\"\22\2\u0173"+
		"\u0174\7\17\2\2\u0174\u0177\3\2\2\2\u0175\u0177\5\"\22\2\u0176\u0171\3"+
		"\2\2\2\u0176\u0175\3\2\2\2\u0177=\3\2\2\2\u0178\u017a\7.\2\2\u0179\u017b"+
		"\t\7\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017e\7\60\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e?\3\2\2\2"+
		"\u017f\u0180\7.\2\2\u0180\u0184\t\b\2\2\u0181\u0183\5> \2\u0182\u0181"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"A\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\5@!\2\u0188\u0189\5D#\2\u0189"+
		"C\3\2\2\2\u018a\u018b\7\27\2\2\u018b\u018c\5X-\2\u018c\u0194\7\16\2\2"+
		"\u018d\u0190\5F$\2\u018e\u018f\7\30\2\2\u018f\u0191\5H%\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u018d\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0197\u019a\7\17\2\2\u0198\u0199\7\31\2\2\u0199"+
		"\u019b\5\"\22\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3"+
		"\2\2\2\u019c\u01a0\7\4\2\2\u019d\u019f\5H%\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1E\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3\u01a4\5X-\2\u01a4\u01a5\7\4\2\2\u01a5\u01a7"+
		"\5\"\22\2\u01a6\u01a8\7\6\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2"+
		"\u01a8G\3\2\2\2\u01a9\u01aa\b%\1\2\u01aa\u01ab\7\64\2\2\u01ab\u01c0\5"+
		"\"\22\2\u01ac\u01ad\7\16\2\2\u01ad\u01ae\5H%\2\u01ae\u01af\7\17\2\2\u01af"+
		"\u01c0\3\2\2\2\u01b0\u01b1\t\t\2\2\u01b1\u01c0\5H%\27\u01b2\u01b3\t\n"+
		"\2\2\u01b3\u01c0\5H%\26\u01b4\u01b5\t\13\2\2\u01b5\u01c0\5H%\25\u01b6"+
		"\u01b7\79\2\2\u01b7\u01c0\5H%\24\u01b8\u01b9\7:\2\2\u01b9\u01c0\5H%\23"+
		"\u01ba\u01bb\t\f\2\2\u01bb\u01c0\5H%\5\u01bc\u01bd\7\4\2\2\u01bd\u01c0"+
		"\5H%\4\u01be\u01c0\5J&\2\u01bf\u01a9\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf"+
		"\u01b0\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf\u01b6\3\2"+
		"\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf"+
		"\u01be\3\2\2\2\u01c0\u01fc\3\2\2\2\u01c1\u01c2\f\22\2\2\u01c2\u01c3\7"+
		";\2\2\u01c3\u01fb\5H%\23\u01c4\u01c5\f\21\2\2\u01c5\u01c6\t\r\2\2\u01c6"+
		"\u01fb\5H%\22\u01c7\u01c8\f\20\2\2\u01c8\u01c9\t\n\2\2\u01c9\u01fb\5H"+
		"%\21\u01ca\u01cb\f\17\2\2\u01cb\u01cc\t\16\2\2\u01cc\u01fb\5H%\20\u01cd"+
		"\u01ce\f\16\2\2\u01ce\u01cf\7?\2\2\u01cf\u01fb\5H%\17\u01d0\u01d1\f\r"+
		"\2\2\u01d1\u01d2\7@\2\2\u01d2\u01fb\5H%\16\u01d3\u01d4\f\f\2\2\u01d4\u01d5"+
		"\7A\2\2\u01d5\u01fb\5H%\r\u01d6\u01d7\f\13\2\2\u01d7\u01d8\t\17\2\2\u01d8"+
		"\u01fb\5H%\f\u01d9\u01da\f\n\2\2\u01da\u01db\t\20\2\2\u01db\u01fb\5H%"+
		"\13\u01dc\u01dd\f\t\2\2\u01dd\u01de\t\21\2\2\u01de\u01fb\5H%\n\u01df\u01e0"+
		"\f\b\2\2\u01e0\u01e1\7L\2\2\u01e1\u01fb\5H%\t\u01e2\u01e3\f\7\2\2\u01e3"+
		"\u01e4\7M\2\2\u01e4\u01e5\5H%\2\u01e5\u01e6\7\4\2\2\u01e6\u01e7\5H%\b"+
		"\u01e7\u01fb\3\2\2\2\u01e8\u01e9\f\6\2\2\u01e9\u01ea\t\22\2\2\u01ea\u01fb"+
		"\5H%\7\u01eb\u01ec\f\35\2\2\u01ec\u01fb\t\t\2\2\u01ed\u01ee\f\33\2\2\u01ee"+
		"\u01ef\7*\2\2\u01ef\u01f0\5H%\2\u01f0\u01f1\7+\2\2\u01f1\u01fb\3\2\2\2"+
		"\u01f2\u01f3\f\32\2\2\u01f3\u01f4\7\16\2\2\u01f4\u01f5\5T+\2\u01f5\u01f6"+
		"\7\17\2\2\u01f6\u01fb\3\2\2\2\u01f7\u01f8\f\31\2\2\u01f8\u01f9\7\n\2\2"+
		"\u01f9\u01fb\5X-\2\u01fa\u01c1\3\2\2\2\u01fa\u01c4\3\2\2\2\u01fa\u01c7"+
		"\3\2\2\2\u01fa\u01ca\3\2\2\2\u01fa\u01cd\3\2\2\2\u01fa\u01d0\3\2\2\2\u01fa"+
		"\u01d3\3\2\2\2\u01fa\u01d6\3\2\2\2\u01fa\u01d9\3\2\2\2\u01fa\u01dc\3\2"+
		"\2\2\u01fa\u01df\3\2\2\2\u01fa\u01e2\3\2\2\2\u01fa\u01e8\3\2\2\2\u01fa"+
		"\u01eb\3\2\2\2\u01fa\u01ed\3\2\2\2\u01fa\u01f2\3\2\2\2\u01fa\u01f7\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"I\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u020c\7^\2\2\u0200\u020c\5V,\2\u0201"+
		"\u020c\7]\2\2\u0202\u020c\7_\2\2\u0203\u0207\5X-\2\u0204\u0205\7*\2\2"+
		"\u0205\u0206\7b\2\2\u0206\u0208\7+\2\2\u0207\u0204\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020c\3\2\2\2\u0209\u020c\5R*\2\u020a\u020c\5L\'\2\u020b"+
		"\u01ff\3\2\2\2\u020b\u0200\3\2\2\2\u020b\u0201\3\2\2\2\u020b\u0202\3\2"+
		"\2\2\u020b\u0203\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c"+
		"K\3\2\2\2\u020d\u020e\5X-\2\u020e\u020f\7\4\2\2\u020f\u0212\5\"\22\2\u0210"+
		"\u0211\7\30\2\2\u0211\u0213\5H%\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213M\3\2\2\2\u0214\u0219\5H%\2\u0215\u0216\7\6\2\2\u0216\u0218"+
		"\5H%\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021aO\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0221\5R*\2\u021d"+
		"\u021e\7\6\2\2\u021e\u0220\5R*\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2"+
		"\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0224\u0226\7\6\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"Q\3\2\2\2\u0227\u0228\5X-\2\u0228\u0229\7\4\2\2\u0229\u022a\5H%\2\u022a"+
		"S\3\2\2\2\u022b\u022d\7\5\2\2\u022c\u022e\5P)\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0234\7\7\2\2\u0230\u0232\5N"+
		"(\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u022b\3\2\2\2\u0233\u0231\3\2\2\2\u0234U\3\2\2\2\u0235\u0237\t\23\2\2"+
		"\u0236\u0238\7\\\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238W\3"+
		"\2\2\2\u0239\u023a\t\24\2\2\u023aY\3\2\2\2=`bjpv|\u0082\u0088\u0092\u009f"+
		"\u00a9\u00af\u00b6\u00bd\u00c4\u00c6\u00cf\u00d6\u00dc\u00e6\u00f1\u00fa"+
		"\u00fe\u0104\u010c\u010f\u0112\u0116\u011a\u0120\u0126\u012e\u0137\u0140"+
		"\u0148\u0157\u0169\u0176\u017a\u017d\u0184\u0190\u0194\u019a\u01a0\u01a7"+
		"\u01bf\u01fa\u01fc\u0207\u020b\u0212\u0219\u0221\u0225\u022d\u0231\u0233"+
		"\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}