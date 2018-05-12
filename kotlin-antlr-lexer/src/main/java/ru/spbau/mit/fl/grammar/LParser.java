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
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_condition = 3, 
		RULE_loop_body = 4, RULE_true_body = 5, RULE_false_body = 6, RULE_true_expression = 7, 
		RULE_false_expression = 8, RULE_expression = 9, RULE_value_holder = 10;
	public static final String[] ruleNames = {
		"program", "line", "statement", "condition", "loop_body", "true_body", 
		"false_body", "true_expression", "false_expression", "expression", "value_holder"
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
			setState(25);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				((ProgramContext)_localctx).lines = line();
				}
				}
				setState(27);
				handler.async(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(30);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public List<TerminalNode> LFIG() { return getTokens(LParser.LFIG); }
		public TerminalNode LFIG(int i) {
			return getToken(LParser.LFIG, i);
		}
		public True_bodyContext true_body() {
			return getRuleContext(True_bodyContext.class,0);
		}
		public List<TerminalNode> RFIG() { return getTokens(LParser.RFIG); }
		public TerminalNode RFIG(int i) {
			return getToken(LParser.RFIG, i);
		}
		public TerminalNode ELSE() { return getToken(LParser.ELSE, 0); }
		public False_bodyContext false_body() {
			return getRuleContext(False_bodyContext.class,0);
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
	public static class OnelineNullaryFunctionDeclarationContext extends StatementContext {
		public TerminalNode FUNCDECL() { return getToken(LParser.FUNCDECL, 0); }
		public TerminalNode ID() { return getToken(LParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public OnelineNullaryFunctionDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterOnelineNullaryFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitOnelineNullaryFunctionDeclaration(this);
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
		public List<TerminalNode> ID() { return getTokens(LParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(LParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(LParser.ASSIGN, i);
		}
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(LParser.DO, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public True_bodyContext true_body() {
			return getRuleContext(True_bodyContext.class,0);
		}
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
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
	public static class OnelineNaryFunctionDeclarationContext extends StatementContext {
		public TerminalNode FUNCDECL() { return getToken(LParser.FUNCDECL, 0); }
		public List<TerminalNode> ID() { return getTokens(LParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(LParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LParser.RPAREN, 0); }
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LParser.SEP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LParser.COMMA, i);
		}
		public OnelineNaryFunctionDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterOnelineNaryFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitOnelineNaryFunctionDeclaration(this);
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
			int _alt;
			setState(143);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				amatch(READ);
				setState(33);
				amatch(LPAREN);
				setState(34);
				amatch(ID);
				setState(35);
				amatch(RPAREN);
				setState(36);
				amatch(SEP);
				}
				break;
			case 2:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				amatch(WRITE);
				setState(38);
				amatch(LPAREN);
				setState(39);
				expression(0);
				setState(40);
				amatch(RPAREN);
				setState(41);
				amatch(SEP);
				}
				break;
			case 3:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				amatch(WHILE);
				setState(44);
				condition();
				setState(45);
				amatch(DO);
				setState(46);
				amatch(LFIG);
				setState(47);
				loop_body();
				setState(48);
				amatch(RFIG);
				}
				break;
			case 4:
				_localctx = new BranchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				amatch(IF);
				setState(51);
				condition();
				setState(52);
				amatch(THEN);
				setState(53);
				amatch(LFIG);
				setState(54);
				true_body();
				setState(55);
				amatch(RFIG);
				}
				break;
			case 5:
				_localctx = new BranchStatementWithElseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				amatch(IF);
				setState(58);
				condition();
				setState(59);
				amatch(THEN);
				setState(60);
				amatch(LFIG);
				setState(61);
				true_body();
				setState(62);
				amatch(RFIG);
				setState(63);
				amatch(ELSE);
				setState(64);
				amatch(LFIG);
				setState(65);
				false_body();
				setState(66);
				amatch(RFIG);
				}
				break;
			case 6:
				_localctx = new NullaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				amatch(FUNCDECL);
				setState(69);
				amatch(ID);
				setState(70);
				amatch(LPAREN);
				setState(71);
				amatch(RPAREN);
				setState(72);
				amatch(LFIG);
				setState(76);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(73);
					statement();
					}
					}
					setState(78);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(79);
				amatch(RFIG);
				}
				break;
			case 7:
				_localctx = new NaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				amatch(FUNCDECL);
				setState(81);
				amatch(ID);
				setState(82);
				amatch(LPAREN);
				setState(83);
				amatch(ID);
				setState(88);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					amatch(COMMA);
					setState(85);
					amatch(ID);
					}
					}
					setState(90);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(91);
				amatch(RPAREN);
				setState(92);
				amatch(LFIG);
				setState(96);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(93);
					statement();
					}
					}
					setState(98);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(99);
				amatch(RFIG);
				}
				break;
			case 8:
				_localctx = new OnelineNullaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				amatch(FUNCDECL);
				setState(101);
				amatch(ID);
				setState(102);
				amatch(LPAREN);
				setState(103);
				amatch(RPAREN);
				setState(104);
				amatch(FUNCBODY);
				setState(105);
				expression(0);
				setState(106);
				amatch(SEP);
				}
				break;
			case 9:
				_localctx = new OnelineNaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				amatch(FUNCDECL);
				setState(109);
				amatch(ID);
				setState(110);
				amatch(LPAREN);
				setState(111);
				amatch(ID);
				setState(116);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(112);
					amatch(COMMA);
					setState(113);
					amatch(ID);
					}
					}
					setState(118);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(119);
				amatch(RPAREN);
				setState(120);
				amatch(FUNCBODY);
				setState(121);
				expression(0);
				setState(122);
				amatch(SEP);
				}
				break;
			case 10:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				amatch(RETURN);
				setState(125);
				expression(0);
				setState(126);
				amatch(SEP);
				}
				break;
			case 11:
				_localctx = new OneLineExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(128);
				expression(0);
				setState(129);
				amatch(SEP);
				}
				break;
			case 12:
				_localctx = new VariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				amatch(ID);
				setState(132);
				amatch(ASSIGN);
				setState(137);
				handler.async(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						amatch(ID);
						setState(134);
						amatch(ASSIGN);
						}
						} 
					}
					setState(139);
					handler.async(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(140);
				expression(0);
				setState(141);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionExpressionContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitConditionExpression(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException, ParserException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			_localctx = new ConditionExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			expression(0);
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

	public static class Loop_bodyContext extends ParserRuleContext {
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
	 
		public Loop_bodyContext() { }
		public void copyFrom(Loop_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopBodyContext extends Loop_bodyContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopBodyContext(Loop_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitLoopBody(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException, ParserException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_body);
		int _la;
		try {
			_localctx = new LoopBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(147);
				statement();
				}
				}
				setState(152);
				handler.async(this);
				_la = _input.LA(1);
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
			exitRule();
		}
		return _localctx;
	}

	public static class True_bodyContext extends ParserRuleContext {
		public True_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_body; }
	 
		public True_bodyContext() { }
		public void copyFrom(True_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueBodyContext extends True_bodyContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TrueBodyContext(True_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterTrueBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitTrueBody(this);
		}
	}

	public final True_bodyContext true_body() throws RecognitionException, ParserException {
		True_bodyContext _localctx = new True_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_true_body);
		int _la;
		try {
			_localctx = new TrueBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				handler.async(this);
				_la = _input.LA(1);
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
			exitRule();
		}
		return _localctx;
	}

	public static class False_bodyContext extends ParserRuleContext {
		public False_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_body; }
	 
		public False_bodyContext() { }
		public void copyFrom(False_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseBodyContext extends False_bodyContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FalseBodyContext(False_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterFalseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitFalseBody(this);
		}
	}

	public final False_bodyContext false_body() throws RecognitionException, ParserException {
		False_bodyContext _localctx = new False_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_false_body);
		int _la;
		try {
			_localctx = new FalseBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(164);
				handler.async(this);
				_la = _input.LA(1);
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
			exitRule();
		}
		return _localctx;
	}

	public static class True_expressionContext extends ParserRuleContext {
		public True_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_expression; }
	 
		public True_expressionContext() { }
		public void copyFrom(True_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueExpressionContext extends True_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TrueExpressionContext(True_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitTrueExpression(this);
		}
	}

	public final True_expressionContext true_expression() throws RecognitionException, ParserException {
		True_expressionContext _localctx = new True_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_true_expression);
		try {
			_localctx = new TrueExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expression(0);
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

	public static class False_expressionContext extends ParserRuleContext {
		public False_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_expression; }
	 
		public False_expressionContext() { }
		public void copyFrom(False_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseExpressionContext extends False_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FalseExpressionContext(False_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitFalseExpression(this);
		}
	}

	public final False_expressionContext false_expression() throws RecognitionException, ParserException {
		False_expressionContext _localctx = new False_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_false_expression);
		try {
			_localctx = new FalseExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expression(0);
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
	public static class BranchedExpressionContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(LParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LParser.THEN, 0); }
		public True_expressionContext true_expression() {
			return getRuleContext(True_expressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(LParser.ELSE, 0); }
		public False_expressionContext false_expression() {
			return getRuleContext(False_expressionContext.class,0);
		}
		public BranchedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).enterBranchedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LParserListener ) ((LParserListener)listener).exitBranchedExpression(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new BranchedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				amatch(IF);
				setState(171);
				condition();
				setState(172);
				amatch(THEN);
				setState(173);
				true_expression();
				setState(174);
				amatch(ELSE);
				setState(175);
				false_expression();
				}
				break;
			case 2:
				{
				_localctx = new NestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				amatch(LPAREN);
				setState(178);
				expression(0);
				setState(179);
				amatch(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ValueHolderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				value_holder();
				}
				break;
			case 4:
				{
				_localctx = new NullaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				amatch(ID);
				setState(183);
				amatch(LPAREN);
				setState(184);
				amatch(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new NaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				amatch(ID);
				setState(186);
				amatch(LPAREN);
				setState(187);
				expression(0);
				setState(192);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					amatch(COMMA);
					setState(189);
					expression(0);
					}
					}
					setState(194);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(195);
				amatch(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			handler.async(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					handler.async(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExponentialOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExponentialOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						((BinaryExponentialOperationContext)_localctx).operator = amatch(POW);
						setState(201);
						((BinaryExponentialOperationContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryMultiplicationOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryMultiplicationOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(203);
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
						setState(204);
						((BinaryMultiplicationOperationContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryAddingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryAddingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
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
						setState(207);
						((BinaryAddingOperationContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new BooleanComparingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanComparingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
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
						setState(210);
						((BooleanComparingOperationContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BooleanEqualityOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanEqualityOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
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
						setState(213);
						((BooleanEqualityOperationContext)_localctx).right = expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanLogicalOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanLogicalOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
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
						setState(216);
						((BooleanLogicalOperationContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(221);
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
		enterRule(_localctx, 20, RULE_value_holder);
		try {
			setState(225);
			handler.async(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				amatch(BOOL);
				}
				break;
			case NUMBER:
				_localctx = new NumericConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				amatch(NUMBER);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4u\n\4\f\4\16\4"+
		"x\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\4\5\4\u0092\n\4\3\5\3\5\3"+
		"\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\7\7\u009d\n\7\f\7\16\7\u00a0"+
		"\13\7\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00c1\n\13\f\13\16\13\u00c4\13\13\3\13"+
		"\3\13\5\13\u00c8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00dc\n\13\f\13\16\13\u00df"+
		"\13\13\3\f\3\f\3\f\5\f\u00e4\n\f\3\f\2\3\24\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\7\3\2\23\25\3\2\20\21\3\2\30\33\3\2\26\27\3\2\34\35\2\u00fb\2\33"+
		"\3\2\2\2\4 \3\2\2\2\6\u0091\3\2\2\2\b\u0093\3\2\2\2\n\u0098\3\2\2\2\f"+
		"\u009e\3\2\2\2\16\u00a4\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00c7"+
		"\3\2\2\2\26\u00e3\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33"+
		"\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37"+
		"\3\3\2\2\2 !\5\6\4\2!\5\3\2\2\2\"#\7\b\2\2#$\7!\2\2$%\7(\2\2%&\7\"\2\2"+
		"&\u0092\7 \2\2\'(\7\7\2\2()\7!\2\2)*\5\24\13\2*+\7\"\2\2+,\7 \2\2,\u0092"+
		"\3\2\2\2-.\7\t\2\2./\5\b\5\2/\60\7\n\2\2\60\61\7#\2\2\61\62\5\n\6\2\62"+
		"\63\7$\2\2\63\u0092\3\2\2\2\64\65\7\13\2\2\65\66\5\b\5\2\66\67\7\f\2\2"+
		"\678\7#\2\289\5\f\7\29:\7$\2\2:\u0092\3\2\2\2;<\7\13\2\2<=\5\b\5\2=>\7"+
		"\f\2\2>?\7#\2\2?@\5\f\7\2@A\7$\2\2AB\7\r\2\2BC\7#\2\2CD\5\16\b\2DE\7$"+
		"\2\2E\u0092\3\2\2\2FG\7\16\2\2GH\7(\2\2HI\7!\2\2IJ\7\"\2\2JN\7#\2\2KM"+
		"\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2Q"+
		"\u0092\7$\2\2RS\7\16\2\2ST\7(\2\2TU\7!\2\2UZ\7(\2\2VW\7%\2\2WY\7(\2\2"+
		"XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\"\2"+
		"\2^b\7#\2\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2db\3\2\2\2e\u0092\7$\2\2fg\7\16\2\2gh\7(\2\2hi\7!\2\2ij\7\"\2\2jk\7"+
		"\37\2\2kl\5\24\13\2lm\7 \2\2m\u0092\3\2\2\2no\7\16\2\2op\7(\2\2pq\7!\2"+
		"\2qv\7(\2\2rs\7%\2\2su\7(\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wy\3\2\2\2xv\3\2\2\2yz\7\"\2\2z{\7\37\2\2{|\5\24\13\2|}\7 \2\2}\u0092"+
		"\3\2\2\2~\177\7\17\2\2\177\u0080\5\24\13\2\u0080\u0081\7 \2\2\u0081\u0092"+
		"\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7 \2\2\u0084\u0092\3\2\2\2"+
		"\u0085\u0086\7(\2\2\u0086\u008b\7\36\2\2\u0087\u0088\7(\2\2\u0088\u008a"+
		"\7\36\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\5\24\13\2\u008f\u0090\7 \2\2\u0090\u0092\3\2\2\2\u0091\"\3\2\2\2\u0091"+
		"\'\3\2\2\2\u0091-\3\2\2\2\u0091\64\3\2\2\2\u0091;\3\2\2\2\u0091F\3\2\2"+
		"\2\u0091R\3\2\2\2\u0091f\3\2\2\2\u0091n\3\2\2\2\u0091~\3\2\2\2\u0091\u0082"+
		"\3\2\2\2\u0091\u0085\3\2\2\2\u0092\7\3\2\2\2\u0093\u0094\5\24\13\2\u0094"+
		"\t\3\2\2\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009d\5\6\4\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\5\24\13\2\u00a8\21\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa\23\3\2\2"+
		"\2\u00ab\u00ac\b\13\1\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\b\5\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\5"+
		"\22\n\2\u00b2\u00c8\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\5\24\13\2\u00b5"+
		"\u00b6\7\"\2\2\u00b6\u00c8\3\2\2\2\u00b7\u00c8\5\26\f\2\u00b8\u00b9\7"+
		"(\2\2\u00b9\u00ba\7!\2\2\u00ba\u00c8\7\"\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\u00bd\7!\2\2\u00bd\u00c2\5\24\13\2\u00be\u00bf\7%\2\2\u00bf\u00c1\5\24"+
		"\13\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\""+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00ab\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7"+
		"\u00b7\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c8\u00dd\3\2"+
		"\2\2\u00c9\u00ca\f\b\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00dc\5\24\13\t\u00cc"+
		"\u00cd\f\7\2\2\u00cd\u00ce\t\2\2\2\u00ce\u00dc\5\24\13\b\u00cf\u00d0\f"+
		"\6\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00dc\5\24\13\7\u00d2\u00d3\f\5\2\2\u00d3"+
		"\u00d4\t\4\2\2\u00d4\u00dc\5\24\13\6\u00d5\u00d6\f\4\2\2\u00d6\u00d7\t"+
		"\5\2\2\u00d7\u00dc\5\24\13\5\u00d8\u00d9\f\3\2\2\u00d9\u00da\t\6\2\2\u00da"+
		"\u00dc\5\24\13\4\u00db\u00c9\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00cf\3"+
		"\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\25\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\7\'\2\2\u00e1\u00e4\7&\2\2\u00e2\u00e4"+
		"\7(\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\27\3\2\2\2\21\33NZbv\u008b\u0091\u0098\u009e\u00a4\u00c2\u00c7\u00db"+
		"\u00dd\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}