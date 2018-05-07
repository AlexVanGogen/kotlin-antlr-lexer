// Generated from /Users/alexvangogen/SPbAU/FL/lexer_github/kotlin-antlr-lexer/kotlin-antlr-lexer/src/main/resources/ru.spbau.mit.fl.grammar/LParser.g4 by ANTLR 4.7
package ru.spbau.mit.fl.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

class LErrorHandler extends DefaultErrorStrategy {

	public void async(Parser recognizer) throws RecognitionException, ParserException {
		ATNState s = recognizer.getInterpreter().atn.states.get(recognizer.getState());
//		System.err.println("sync @ "+s.stateNumber+"="+s.getClass().getSimpleName());
		// If already recovering, don't try to sync
		if (inErrorRecoveryMode(recognizer)) {
			return;
		}

		TokenStream tokens = recognizer.getInputStream();
		int la = tokens.LA(1);

		// try cheaper subset first; might get lucky. seems to shave a wee bit off
		IntervalSet nextTokens = recognizer.getATN().nextTokens(s);
		if (nextTokens.contains(Token.EPSILON) || nextTokens.contains(la)) {
			return;
		}

		switch (s.getStateType()) {
			case ATNState.BLOCK_START:
			case ATNState.STAR_BLOCK_START:
			case ATNState.PLUS_BLOCK_START:
			case ATNState.STAR_LOOP_ENTRY:
				// report error and recover if possible
				throw new InputMismatchException(recognizer);

			case ATNState.PLUS_LOOP_BACK:
			case ATNState.STAR_LOOP_BACK:
//			System.err.println("at loop back: "+s.getClass().getSimpleName());
				Token offendingToken = recognizer.getCurrentToken();
				throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
						offendingToken.getLine(),
						offendingToken.getCharPositionInLine(),
						offendingToken.getText()));

			default:
				// do nothing if we can't identify the exact kind of ATN state
				break;
		}
	}
}


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LParser extends Parser {

	private LErrorHandler handler = new LErrorHandler();
	
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, SPACE=2, COMMENT=3, ML_COMMENT=4, WRITE=5, READ=6, WHILE=7, 
		DO=8, IF=9, THEN=10, ELSE=11, FUNCDECL=12, RETURN=13, PLUS=14, MINUS=15, 
		POW=16, MULT=17, DIV=18, MOD=19, EQ=20, NEQ=21, GT=22, GEQ=23, LT=24, 
		LEQ=25, AND=26, OR=27, ASSIGN=28, FUNCBODY=29, SEP=30, LPAREN=31, RPAREN=32, 
		LFIG=33, RFIG=34, COMMA=35, NUMBER=36, BOOL=37, ID=38;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_value_holder = 4;
	public static final String[] ruleNames = {
		"program", "line", "statement", "expression", "value_holder"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'write'", "'read'", "'while'", "'do'", 
		"'if'", "'then'", "'else'", "'fun'", "'return'", "'+'", "'-'", "'**'", 
		"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
		"'||'", "':='", "'<-'", "';'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "SPACE", "COMMENT", "ML_COMMENT", "WRITE", "READ", "WHILE", 
		"DO", "IF", "THEN", "ELSE", "FUNCDECL", "RETURN", "PLUS", "MINUS", "POW", 
		"MULT", "DIV", "MOD", "EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", 
		"ASSIGN", "FUNCBODY", "SEP", "LPAREN", "RPAREN", "LFIG", "RFIG", "COMMA", 
		"NUMBER", "BOOL", "ID"
	};
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
	public String getGrammarFileName() { return "LParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public LineContext lines;
		public TerminalNode EOF() { return getToken(LParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException, ParserException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				((ProgramContext)_localctx).lines = line();
				}
				}
				setState(15);
				handler.async(this);
				_la = _input.LA(1);
			}
			setState(16);
			amatch(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			Token offendingToken = re.getOffendingToken();
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					offendingToken.getLine(),
					offendingToken.getCharPositionInLine(),
					offendingToken.getText()));
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException, ParserException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			Token offendingToken = re.getOffendingToken();
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					offendingToken.getLine(),
					offendingToken.getCharPositionInLine(),
					offendingToken.getText()));
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BranchStatementWithElseContext extends StatementContext {
		public TerminalNode IF() { return getToken(LParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public List<TerminalNode> LFIG() { return getTokens(LParser.LFIG); }
		public TerminalNode LFIG(int i) {
			return getToken(LParser.LFIG, i);
		}
		public List<TerminalNode> RFIG() { return getTokens(LParser.RFIG); }
		public TerminalNode RFIG(int i) {
			return getToken(LParser.RFIG, i);
		}
		public TerminalNode ELSE() { return getToken(LParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BranchStatementWithElseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBranchStatementWithElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBranchStatementWithElse(this);
		}
	}
	public static class ReturnExpressionContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(LParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public ReturnExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitReturnExpression(this);
		}
	}
	public static class ReadStatementContext extends StatementContext {
		public TerminalNode READ() { return getToken(LParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public ReadStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitReadStatement(this);
		}
	}
	public static class VariableAssignmentContext extends StatementContext {
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public VariableAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitVariableAssignment(this);
		}
	}
	public static class NullaryFunctionDeclarationContext extends StatementContext {
		public TerminalNode FUNCDECL() { return getToken(LParser.FUNCDECL, 0); }
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NullaryFunctionDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNullaryFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNullaryFunctionDeclaration(this);
		}
	}
	public static class WriteStatementContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(LParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public WriteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitWriteStatement(this);
		}
	}
	public static class LoopStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(LParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(LParser.DO, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitLoopStatement(this);
		}
	}
	public static class BranchStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(LParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BranchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBranchStatement(this);
		}
	}
	public static class OneLineExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public OneLineExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterOneLineExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitOneLineExpression(this);
		}
	}
	public static class NaryFunctionDeclarationContext extends StatementContext {
		public TerminalNode FUNCDECL() { return getToken(LParser.FUNCDECL, 0); }
		public List<TerminalNode> ID() { return getTokens(LParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LParser.COMMA, i);
		}
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NaryFunctionDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNaryFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNaryFunctionDeclaration(this);
		}
	}

	public final StatementContext statement() throws RecognitionException, ParserException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(124);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				amatch(READ);
				setState(21);
				amatch(LPAREN);
				setState(22);
				amatch(ID);
				setState(23);
				amatch(RPAREN);
				setState(24);
				amatch(SEP);
				}
				break;
			case 2:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				amatch(WRITE);
				setState(26);
				amatch(LPAREN);
				setState(27);
				expression(0);
				setState(28);
				amatch(RPAREN);
				setState(29);
				amatch(SEP);
				}
				break;
			case 3:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				amatch(WHILE);
				setState(32);
				expression(0);
				setState(33);
				amatch(DO);
				setState(34);
				amatch(LFIG);
				setState(38);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(35);
					statement();
					}
					}
					setState(40);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(41);
				amatch(RFIG);
				}
				break;
			case 4:
				_localctx = new BranchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				amatch(IF);
				setState(44);
				expression(0);
				setState(45);
				amatch(THEN);
				setState(46);
				amatch(LFIG);
				setState(50);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(47);
					statement();
					}
					}
					setState(52);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(53);
				amatch(RFIG);
				}
				break;
			case 5:
				_localctx = new BranchStatementWithElseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				amatch(IF);
				setState(56);
				expression(0);
				setState(57);
				amatch(THEN);
				setState(58);
				amatch(LFIG);
				setState(62);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(59);
					statement();
					}
					}
					setState(64);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(65);
				amatch(RFIG);
				setState(66);
				amatch(ELSE);
				setState(67);
				amatch(LFIG);
				setState(71);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(68);
					statement();
					}
					}
					setState(73);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(74);
				amatch(RFIG);
				}
				break;
			case 6:
				_localctx = new NullaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				amatch(FUNCDECL);
				setState(77);
				amatch(ID);
				setState(78);
				amatch(LPAREN);
				setState(79);
				amatch(RPAREN);
				setState(80);
				amatch(FUNCBODY);
				setState(81);
				amatch(LFIG);
				setState(85);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(82);
					statement();
					}
					}
					setState(87);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(88);
				amatch(RFIG);
				}
				break;
			case 7:
				_localctx = new NaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				amatch(FUNCDECL);
				setState(90);
				amatch(ID);
				setState(91);
				amatch(LPAREN);
				setState(92);
				amatch(ID);
				setState(97);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					amatch(COMMA);
					setState(94);
					amatch(ID);
					}
					}
					setState(99);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(100);
				amatch(RPAREN);
				setState(102);
				handler.async(this);
				_la = _input.LA(1);
				if (_la==FUNCBODY) {
					{
					setState(101);
					amatch(FUNCBODY);
					}
				}

				setState(104);
				amatch(LFIG);
				setState(108);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(105);
					statement();
					}
					}
					setState(110);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(111);
				amatch(RFIG);
				}
				break;
			case 8:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				amatch(RETURN);
				setState(113);
				expression(0);
				setState(114);
				amatch(SEP);
				}
				break;
			case 9:
				_localctx = new OneLineExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				expression(0);
				setState(117);
				amatch(SEP);
				}
				break;
			case 10:
				_localctx = new VariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				amatch(ID);
				setState(120);
				amatch(ASSIGN);
				setState(121);
				expression(0);
				setState(122);
				amatch(SEP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			Token offendingToken = re.getOffendingToken();
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					offendingToken.getLine(),
					offendingToken.getCharPositionInLine(),
					offendingToken.getText()));
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private Token amatch(int ttype) throws RecognitionException, ParserException {
		Token t = getCurrentToken();
		if ( t.getType()==ttype ) {
			if ( ttype==Token.EOF ) {
				matchedEOF = true;
			}
			_errHandler.reportMatch(this);
			consume();
		}
		else {
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					t.getLine(),
					t.getCharPositionInLine(),
					t.getText()));
//			t = _errHandler.recoverInline(this);
//			if ( _buildParseTrees && t.getTokenIndex()==-1 ) {
//				// we must have conjured up a new token during single token insertion
//				// if it's not the current symbol
//				_ctx.addErrorNode(createErrorNode(_ctx,t));
//			}
		}
		return t;
	}
	
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NestedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public NestedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNestedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNestedExpression(this);
		}
	}
	public static class BinaryAddingOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LParser.MINUS, 0); }
		public BinaryAddingOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBinaryAddingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBinaryAddingOperation(this);
		}
	}
	public static class NullaryFunctionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public NullaryFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNullaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNullaryFunction(this);
		}
	}
	public static class BinaryExponentialOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(LParser.POW, 0); }
		public BinaryExponentialOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBinaryExponentialOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBinaryExponentialOperation(this);
		}
	}
	public static class BooleanComparingOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(LParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(LParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(LParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(LParser.LEQ, 0); }
		public BooleanComparingOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBooleanComparingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBooleanComparingOperation(this);
		}
	}
	public static class ValueHolderContext extends ExpressionContext {
		public Value_holderContext value_holder() {
			return getRuleContext(Value_holderContext.class,0);
		}
		public ValueHolderContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterValueHolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitValueHolder(this);
		}
	}
	public static class NaryFunctionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LParser.COMMA, i);
		}
		public NaryFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNaryFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNaryFunction(this);
		}
	}
	public static class BooleanEqualityOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LParser.NEQ, 0); }
		public BooleanEqualityOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBooleanEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBooleanEqualityOperation(this);
		}
	}
	public static class BinaryMultiplicationOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(LParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LParser.MOD, 0); }
		public BinaryMultiplicationOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBinaryMultiplicationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBinaryMultiplicationOperation(this);
		}
	}
	public static class BooleanLogicalOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LParser.AND, 0); }
		public TerminalNode OR() { return getToken(LParser.OR, 0); }
		public BooleanLogicalOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBooleanLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBooleanLogicalOperation(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException, ParserException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException, ParserException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				amatch(LPAREN);
				setState(128);
				expression(0);
				setState(129);
				amatch(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ValueHolderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				value_holder();
				}
				break;
			case 3:
				{
				_localctx = new NullaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				amatch(ID);
				setState(133);
				amatch(LPAREN);
				setState(134);
				amatch(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new NaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				amatch(ID);
				setState(136);
				amatch(LPAREN);
				setState(137);
				expression(0);
				setState(142);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					amatch(COMMA);
					setState(139);
					expression(0);
					}
					}
					setState(144);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(145);
				amatch(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			handler.async(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					handler.async(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExponentialOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExponentialOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						((BinaryExponentialOperationContext)_localctx).operator = amatch(POW);
						setState(151);
						((BinaryExponentialOperationContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryMultiplicationOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryMultiplicationOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						((BinaryMultiplicationOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((BinaryMultiplicationOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						((BinaryMultiplicationOperationContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryAddingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryAddingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						((BinaryAddingOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryAddingOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						((BinaryAddingOperationContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new BooleanComparingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanComparingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						((BooleanComparingOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ))) != 0)) ) {
							((BooleanComparingOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						((BooleanComparingOperationContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BooleanEqualityOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanEqualityOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						((BooleanEqualityOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BooleanEqualityOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						((BooleanEqualityOperationContext)_localctx).right = expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanLogicalOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanLogicalOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(165);
						((BooleanLogicalOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BooleanLogicalOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						((BooleanLogicalOperationContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(171);
				handler.async(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			Token offendingToken = re.getOffendingToken();
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					offendingToken.getLine(),
					offendingToken.getCharPositionInLine(),
					offendingToken.getText()));
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_holderContext extends ParserRuleContext {
		public Value_holderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_holder; }
	 
		public Value_holderContext() { }
		public void copyFrom(Value_holderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends Value_holderContext {
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public VariableContext(Value_holderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitVariable(this);
		}
	}
	public static class NumericConstantContext extends Value_holderContext {
		public TerminalNode NUMBER() { return getToken(LParser.NUMBER, 0); }
		public NumericConstantContext(Value_holderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitNumericConstant(this);
		}
	}
	public static class BooleanConstantContext extends Value_holderContext {
		public TerminalNode BOOL() { return getToken(LParser.BOOL, 0); }
		public BooleanConstantContext(Value_holderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBooleanConstant(this);
		}
	}

	public final Value_holderContext value_holder() throws RecognitionException, ParserException {
		Value_holderContext _localctx = new Value_holderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value_holder);
		try {
			setState(175);
			handler.async(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				amatch(BOOL);
				}
				break;
			case NUMBER:
				_localctx = new NumericConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				amatch(NUMBER);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				amatch(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			Token offendingToken = re.getOffendingToken();
			throw new ParserException(String.format("parsing error at %d:%d: unexpected token '%s'",
					offendingToken.getLine(),
					offendingToken.getCharPositionInLine(),
					offendingToken.getText()));
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4"+
		"\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16"+
		"\4e\13\4\3\4\3\4\5\4i\n\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13"+
		"\5\3\5\3\5\5\5\u0096\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00aa\n\5\f\5\16\5\u00ad\13\5\3\6\3\6\3"+
		"\6\5\6\u00b2\n\6\3\6\2\3\b\7\2\4\6\b\n\2\7\3\2\23\25\3\2\20\21\3\2\30"+
		"\33\3\2\26\27\3\2\34\35\2\u00cc\2\17\3\2\2\2\4\24\3\2\2\2\6~\3\2\2\2\b"+
		"\u0095\3\2\2\2\n\u00b1\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3"+
		"\23\3\3\2\2\2\24\25\5\6\4\2\25\5\3\2\2\2\26\27\7\b\2\2\27\30\7!\2\2\30"+
		"\31\7(\2\2\31\32\7\"\2\2\32\177\7 \2\2\33\34\7\7\2\2\34\35\7!\2\2\35\36"+
		"\5\b\5\2\36\37\7\"\2\2\37 \7 \2\2 \177\3\2\2\2!\"\7\t\2\2\"#\5\b\5\2#"+
		"$\7\n\2\2$(\7#\2\2%\'\5\6\4\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")+\3\2\2\2*(\3\2\2\2+,\7$\2\2,\177\3\2\2\2-.\7\13\2\2./\5\b\5\2/\60\7"+
		"\f\2\2\60\64\7#\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7$\2\28\177\3\2\2"+
		"\29:\7\13\2\2:;\5\b\5\2;<\7\f\2\2<@\7#\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7$\2\2DE\7\r\2\2EI\7#\2\2"+
		"FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2"+
		"LM\7$\2\2M\177\3\2\2\2NO\7\16\2\2OP\7(\2\2PQ\7!\2\2QR\7\"\2\2RS\7\37\2"+
		"\2SW\7#\2\2TV\5\6\4\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2"+
		"\2YW\3\2\2\2Z\177\7$\2\2[\\\7\16\2\2\\]\7(\2\2]^\7!\2\2^c\7(\2\2_`\7%"+
		"\2\2`b\7(\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2"+
		"\2\2fh\7\"\2\2gi\7\37\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jn\7#\2\2km\5\6"+
		"\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2q\177"+
		"\7$\2\2rs\7\17\2\2st\5\b\5\2tu\7 \2\2u\177\3\2\2\2vw\5\b\5\2wx\7 \2\2"+
		"x\177\3\2\2\2yz\7(\2\2z{\7\36\2\2{|\5\b\5\2|}\7 \2\2}\177\3\2\2\2~\26"+
		"\3\2\2\2~\33\3\2\2\2~!\3\2\2\2~-\3\2\2\2~9\3\2\2\2~N\3\2\2\2~[\3\2\2\2"+
		"~r\3\2\2\2~v\3\2\2\2~y\3\2\2\2\177\7\3\2\2\2\u0080\u0081\b\5\1\2\u0081"+
		"\u0082\7!\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7\"\2\2\u0084\u0096\3\2"+
		"\2\2\u0085\u0096\5\n\6\2\u0086\u0087\7(\2\2\u0087\u0088\7!\2\2\u0088\u0096"+
		"\7\"\2\2\u0089\u008a\7(\2\2\u008a\u008b\7!\2\2\u008b\u0090\5\b\5\2\u008c"+
		"\u008d\7%\2\2\u008d\u008f\5\b\5\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0096\3\2\2\2\u0095\u0080\3\2"+
		"\2\2\u0095\u0085\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0096"+
		"\u00ab\3\2\2\2\u0097\u0098\f\b\2\2\u0098\u0099\7\22\2\2\u0099\u00aa\5"+
		"\b\5\t\u009a\u009b\f\7\2\2\u009b\u009c\t\2\2\2\u009c\u00aa\5\b\5\b\u009d"+
		"\u009e\f\6\2\2\u009e\u009f\t\3\2\2\u009f\u00aa\5\b\5\7\u00a0\u00a1\f\5"+
		"\2\2\u00a1\u00a2\t\4\2\2\u00a2\u00aa\5\b\5\6\u00a3\u00a4\f\4\2\2\u00a4"+
		"\u00a5\t\5\2\2\u00a5\u00aa\5\b\5\5\u00a6\u00a7\f\3\2\2\u00a7\u00a8\t\6"+
		"\2\2\u00a8\u00aa\5\b\5\4\u00a9\u0097\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9"+
		"\u009d\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\t\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\7\'\2\2\u00af\u00b2\7&\2\2"+
		"\u00b0\u00b2\7(\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\13\3\2\2\2\21\17(\64@IWchn~\u0090\u0095\u00a9\u00ab\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}