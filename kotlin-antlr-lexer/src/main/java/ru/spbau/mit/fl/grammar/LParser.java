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
		RULE_loop_body = 4, RULE_true_body = 5, RULE_false_body = 6, RULE_expression = 7, 
		RULE_value_holder = 8;
	public static final String[] ruleNames = {
		"program", "line", "statement", "condition", "loop_body", "true_body", 
		"false_body", "expression", "value_holder"
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
			setState(21);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(18);
				((ProgramContext)_localctx).lines = line();
				}
				}
				setState(23);
				handler.async(this);
				_la = _input.LA(1);
			}
			setState(24);
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
			setState(26);
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
		public TerminalNode LFIG() { return getToken(LParser.LFIG, 0); }
		public TerminalNode RFIG() { return getToken(LParser.RFIG, 0); }
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
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
			setState(114);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				amatch(READ);
				setState(29);
				amatch(LPAREN);
				setState(30);
				amatch(ID);
				setState(31);
				amatch(RPAREN);
				setState(32);
				amatch(SEP);
				}
				break;
			case 2:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				amatch(WRITE);
				setState(34);
				amatch(LPAREN);
				setState(35);
				expression(0);
				setState(36);
				amatch(RPAREN);
				setState(37);
				amatch(SEP);
				}
				break;
			case 3:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				amatch(WHILE);
				setState(40);
				condition();
				setState(41);
				amatch(DO);
				setState(42);
				amatch(LFIG);
				setState(43);
				loop_body();
				setState(44);
				amatch(RFIG);
				}
				break;
			case 4:
				_localctx = new BranchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				amatch(IF);
				setState(47);
				condition();
				setState(48);
				amatch(THEN);
				setState(49);
				amatch(LFIG);
				setState(50);
				true_body();
				setState(51);
				amatch(RFIG);
				}
				break;
			case 5:
				_localctx = new BranchStatementWithElseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				amatch(IF);
				setState(54);
				condition();
				setState(55);
				amatch(THEN);
				setState(56);
				amatch(LFIG);
				setState(57);
				true_body();
				setState(58);
				amatch(RFIG);
				setState(59);
				amatch(ELSE);
				setState(60);
				amatch(LFIG);
				setState(61);
				false_body();
				setState(62);
				amatch(RFIG);
				}
				break;
			case 6:
				_localctx = new NullaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				amatch(FUNCDECL);
				setState(65);
				amatch(ID);
				setState(66);
				amatch(LPAREN);
				setState(67);
				amatch(RPAREN);
				setState(69);
				handler.async(this);
				_la = _input.LA(1);
				if (_la==FUNCBODY) {
					{
					setState(68);
					amatch(FUNCBODY);
					}
				}

				setState(71);
				amatch(LFIG);
				setState(75);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(72);
					statement();
					}
					}
					setState(77);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(78);
				amatch(RFIG);
				}
				break;
			case 7:
				_localctx = new NaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				amatch(FUNCDECL);
				setState(80);
				amatch(ID);
				setState(81);
				amatch(LPAREN);
				setState(82);
				amatch(ID);
				setState(87);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					amatch(COMMA);
					setState(84);
					amatch(ID);
					}
					}
					setState(89);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(90);
				amatch(RPAREN);
				setState(92);
				handler.async(this);
				_la = _input.LA(1);
				if (_la==FUNCBODY) {
					{
					setState(91);
					amatch(FUNCBODY);
					}
				}

				setState(94);
				amatch(LFIG);
				setState(98);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(95);
					statement();
					}
					}
					setState(100);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(101);
				amatch(RFIG);
				}
				break;
			case 8:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				amatch(RETURN);
				setState(103);
				expression(0);
				setState(104);
				amatch(SEP);
				}
				break;
			case 9:
				_localctx = new OneLineExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				expression(0);
				setState(107);
				amatch(SEP);
				}
				break;
			case 10:
				_localctx = new VariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				amatch(ID);
				setState(110);
				amatch(ASSIGN);
				setState(111);
				expression(0);
				setState(112);
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
			setState(116);
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
			setState(121);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				handler.async(this);
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
			setState(127);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
				handler.async(this);
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
			setState(133);
			handler.async(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				handler.async(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				amatch(LPAREN);
				setState(138);
				expression(0);
				setState(139);
				amatch(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ValueHolderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				value_holder();
				}
				break;
			case 3:
				{
				_localctx = new NullaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				amatch(ID);
				setState(143);
				amatch(LPAREN);
				setState(144);
				amatch(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new NaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				amatch(ID);
				setState(146);
				amatch(LPAREN);
				setState(147);
				expression(0);
				setState(152);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(148);
					amatch(COMMA);
					setState(149);
					expression(0);
					}
					}
					setState(154);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(155);
				amatch(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			handler.async(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					handler.async(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExponentialOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExponentialOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(160);
						((BinaryExponentialOperationContext)_localctx).operator = amatch(POW);
						setState(161);
						((BinaryExponentialOperationContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryMultiplicationOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryMultiplicationOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(163);
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
						setState(164);
						((BinaryMultiplicationOperationContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryAddingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryAddingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
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
						setState(167);
						((BinaryAddingOperationContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new BooleanComparingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanComparingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
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
						setState(170);
						((BooleanComparingOperationContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BooleanEqualityOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanEqualityOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
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
						setState(173);
						((BooleanEqualityOperationContext)_localctx).right = expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanLogicalOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanLogicalOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(175);
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
						setState(176);
						((BooleanLogicalOperationContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(181);
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
		enterRule(_localctx, 16, RULE_value_holder);
		try {
			setState(185);
			handler.async(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				amatch(BOOL);
				}
				break;
			case NUMBER:
				_localctx = new NumericConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				amatch(NUMBER);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4H"+
		"\n\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4X"+
		"\n\4\f\4\16\4[\13\4\3\4\3\4\5\4_\n\4\3\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3"+
		"\6\7\6z\n\6\f\6\16\6}\13\6\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\b\7"+
		"\b\u0086\n\b\f\b\16\b\u0089\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\t\3\t\5\t\u00a0"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\n\3\n\3\n\5\n\u00bc\n\n\3\n"+
		"\2\3\20\13\2\4\6\b\n\f\16\20\22\2\7\3\2\23\25\3\2\20\21\3\2\30\33\3\2"+
		"\26\27\3\2\34\35\2\u00d2\2\27\3\2\2\2\4\34\3\2\2\2\6t\3\2\2\2\bv\3\2\2"+
		"\2\n{\3\2\2\2\f\u0081\3\2\2\2\16\u0087\3\2\2\2\20\u009f\3\2\2\2\22\u00bb"+
		"\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35"+
		"\5\6\4\2\35\5\3\2\2\2\36\37\7\b\2\2\37 \7!\2\2 !\7(\2\2!\"\7\"\2\2\"u"+
		"\7 \2\2#$\7\7\2\2$%\7!\2\2%&\5\20\t\2&\'\7\"\2\2\'(\7 \2\2(u\3\2\2\2)"+
		"*\7\t\2\2*+\5\b\5\2+,\7\n\2\2,-\7#\2\2-.\5\n\6\2./\7$\2\2/u\3\2\2\2\60"+
		"\61\7\13\2\2\61\62\5\b\5\2\62\63\7\f\2\2\63\64\7#\2\2\64\65\5\f\7\2\65"+
		"\66\7$\2\2\66u\3\2\2\2\678\7\13\2\289\5\b\5\29:\7\f\2\2:;\7#\2\2;<\5\f"+
		"\7\2<=\7$\2\2=>\7\r\2\2>?\7#\2\2?@\5\16\b\2@A\7$\2\2Au\3\2\2\2BC\7\16"+
		"\2\2CD\7(\2\2DE\7!\2\2EG\7\"\2\2FH\7\37\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IM\7#\2\2JL\5\6\4\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OM\3\2\2\2Pu\7$\2\2QR\7\16\2\2RS\7(\2\2ST\7!\2\2TY\7(\2\2UV\7%\2\2"+
		"VX\7(\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2"+
		"\\^\7\"\2\2]_\7\37\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`d\7#\2\2ac\5\6\4"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gu\7$\2"+
		"\2hi\7\17\2\2ij\5\20\t\2jk\7 \2\2ku\3\2\2\2lm\5\20\t\2mn\7 \2\2nu\3\2"+
		"\2\2op\7(\2\2pq\7\36\2\2qr\5\20\t\2rs\7 \2\2su\3\2\2\2t\36\3\2\2\2t#\3"+
		"\2\2\2t)\3\2\2\2t\60\3\2\2\2t\67\3\2\2\2tB\3\2\2\2tQ\3\2\2\2th\3\2\2\2"+
		"tl\3\2\2\2to\3\2\2\2u\7\3\2\2\2vw\5\20\t\2w\t\3\2\2\2xz\5\6\4\2yx\3\2"+
		"\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}{\3\2\2\2~\u0080\5\6\4"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\r\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\6\4\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\17\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\b\t\1\2\u008b\u008c\7!\2\2"+
		"\u008c\u008d\5\20\t\2\u008d\u008e\7\"\2\2\u008e\u00a0\3\2\2\2\u008f\u00a0"+
		"\5\22\n\2\u0090\u0091\7(\2\2\u0091\u0092\7!\2\2\u0092\u00a0\7\"\2\2\u0093"+
		"\u0094\7(\2\2\u0094\u0095\7!\2\2\u0095\u009a\5\20\t\2\u0096\u0097\7%\2"+
		"\2\u0097\u0099\5\20\t\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\7\"\2\2\u009e\u00a0\3\2\2\2\u009f\u008a\3\2\2\2\u009f"+
		"\u008f\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u00a0\u00b5\3\2"+
		"\2\2\u00a1\u00a2\f\b\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00b4\5\20\t\t\u00a4"+
		"\u00a5\f\7\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00b4\5\20\t\b\u00a7\u00a8\f"+
		"\6\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00b4\5\20\t\7\u00aa\u00ab\f\5\2\2\u00ab"+
		"\u00ac\t\4\2\2\u00ac\u00b4\5\20\t\6\u00ad\u00ae\f\4\2\2\u00ae\u00af\t"+
		"\5\2\2\u00af\u00b4\5\20\t\5\u00b0\u00b1\f\3\2\2\u00b1\u00b2\t\6\2\2\u00b2"+
		"\u00b4\5\20\t\4\u00b3\u00a1\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3\u00a7\3"+
		"\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\21\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\7\'\2\2\u00b9\u00bc\7&\2\2\u00ba\u00bc"+
		"\7(\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\23\3\2\2\2\21\27GMY^dt{\u0081\u0087\u009a\u009f\u00b3\u00b5\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}