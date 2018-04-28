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
			setState(11); 
			handler.async(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				((ProgramContext)_localctx).lines = line();
				}
				}
				setState(13); 
				handler.async(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(15);
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
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
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
			setState(17);
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
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
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
		public TerminalNode FUNCBODY() { return getToken(LParser.FUNCBODY, 0); }
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
			setState(121);
			handler.async(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				amatch(READ);
				setState(20);
				amatch(LPAREN);
				setState(21);
				amatch(ID);
				setState(22);
				amatch(RPAREN);
				setState(23);
				amatch(SEP);
				}
				break;
			case 2:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				amatch(WRITE);
				setState(25);
				amatch(LPAREN);
				setState(26);
				expression(0);
				setState(27);
				amatch(RPAREN);
				setState(28);
				amatch(SEP);
				}
				break;
			case 3:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				amatch(WHILE);
				setState(31);
				expression(0);
				setState(32);
				amatch(DO);
				setState(33);
				amatch(LFIG);
				setState(37);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(34);
					statement();
					}
					}
					setState(39);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(40);
				amatch(RFIG);
				}
				break;
			case 4:
				_localctx = new BranchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				amatch(IF);
				setState(43);
				expression(0);
				setState(44);
				amatch(THEN);
				setState(45);
				amatch(LFIG);
				setState(49);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(46);
					statement();
					}
					}
					setState(51);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(52);
				amatch(RFIG);
				}
				break;
			case 5:
				_localctx = new BranchStatementWithElseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				amatch(IF);
				setState(55);
				expression(0);
				setState(56);
				amatch(THEN);
				setState(57);
				amatch(LFIG);
				setState(61);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(58);
					statement();
					}
					}
					setState(63);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(64);
				amatch(RFIG);
				setState(65);
				amatch(ELSE);
				setState(66);
				amatch(LFIG);
				setState(70);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(67);
					statement();
					}
					}
					setState(72);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(73);
				amatch(RFIG);
				}
				break;
			case 6:
				_localctx = new NullaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				amatch(FUNCDECL);
				setState(76);
				amatch(ID);
				setState(77);
				amatch(LPAREN);
				setState(78);
				amatch(RPAREN);
				setState(79);
				amatch(FUNCBODY);
				setState(80);
				amatch(LFIG);
				setState(84);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(81);
					statement();
					}
					}
					setState(86);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(87);
				amatch(RFIG);
				}
				break;
			case 7:
				_localctx = new NaryFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				amatch(FUNCDECL);
				setState(89);
				amatch(ID);
				setState(90);
				amatch(LPAREN);
				setState(91);
				amatch(ID);
				setState(96);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(92);
					amatch(COMMA);
					setState(93);
					amatch(ID);
					}
					}
					setState(98);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(99);
				amatch(RPAREN);
				setState(100);
				amatch(FUNCBODY);
				setState(101);
				amatch(LFIG);
				setState(105);
				handler.async(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << FUNCDECL) | (1L << RETURN) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(102);
					statement();
					}
					}
					setState(107);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(108);
				amatch(RFIG);
				}
				break;
			case 8:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				amatch(RETURN);
				setState(110);
				expression(0);
				setState(111);
				amatch(SEP);
				}
				break;
			case 9:
				_localctx = new OneLineExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				expression(0);
				setState(114);
				amatch(SEP);
				}
				break;
			case 10:
				_localctx = new VariableAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				amatch(ID);
				setState(117);
				amatch(ASSIGN);
				setState(118);
				expression(0);
				setState(119);
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
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
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
			setState(144);

			handler.async(this);

			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124);
				amatch(LPAREN);
				setState(125);
				expression(0);
				setState(126);
				amatch(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ValueHolderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				value_holder();
				}
				break;
			case 3:
				{
				_localctx = new NullaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				amatch(ID);
				setState(130);
				amatch(LPAREN);
				setState(131);
				amatch(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new NaryFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				amatch(ID);
				setState(133);
				amatch(LPAREN);
				setState(134);
				expression(0);
				setState(139);
				handler.async(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					amatch(COMMA);
					setState(136);
					expression(0);
					}
					}
					setState(141);
					handler.async(this);
					_la = _input.LA(1);
				}
				setState(142);
				amatch(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			handler.async(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					handler.async(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExponentialOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExponentialOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(147);
						((BinaryExponentialOperationContext)_localctx).operator = amatch(POW);
						setState(148);
						((BinaryExponentialOperationContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryMultiplicationOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryMultiplicationOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(150);
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
						setState(151);
						((BinaryMultiplicationOperationContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryAddingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryAddingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
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
						setState(154);
						((BinaryAddingOperationContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new BooleanComparingOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanComparingOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
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
						setState(157);
						((BooleanComparingOperationContext)_localctx).right = expression(4);
						}
						break;
					case 5:
						{
						_localctx = new BooleanEqualityOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanEqualityOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
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
						setState(160);
						((BooleanEqualityOperationContext)_localctx).right = expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanLogicalOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BooleanLogicalOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(162);
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
						setState(163);
						((BooleanLogicalOperationContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(168);
				handler.async(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
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
			setState(172);
			handler.async(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				amatch(BOOL);
				}
				break;
			case NUMBER:
				_localctx = new NumericConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				amatch(NUMBER);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
//			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4&\n\4\f\4\16\4)\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4"+
		"\65\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3"+
		"\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13"+
		"\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\5\3\5\5\5\u0093"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u00a7\n\5\f\5\16\5\u00aa\13\5\3\6\3\6\3\6\5\6\u00af\n\6\3\6"+
		"\2\3\b\7\2\4\6\b\n\2\7\3\2\23\25\3\2\20\21\3\2\30\33\3\2\26\27\3\2\34"+
		"\35\2\u00c8\2\r\3\2\2\2\4\23\3\2\2\2\6{\3\2\2\2\b\u0092\3\2\2\2\n\u00ae"+
		"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\5\6\4\2\24\5\3\2\2"+
		"\2\25\26\7\b\2\2\26\27\7!\2\2\27\30\7(\2\2\30\31\7\"\2\2\31|\7 \2\2\32"+
		"\33\7\7\2\2\33\34\7!\2\2\34\35\5\b\5\2\35\36\7\"\2\2\36\37\7 \2\2\37|"+
		"\3\2\2\2 !\7\t\2\2!\"\5\b\5\2\"#\7\n\2\2#\'\7#\2\2$&\5\6\4\2%$\3\2\2\2"+
		"&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+|\3\2\2"+
		"\2,-\7\13\2\2-.\5\b\5\2./\7\f\2\2/\63\7#\2\2\60\62\5\6\4\2\61\60\3\2\2"+
		"\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2"+
		"\2\66\67\7$\2\2\67|\3\2\2\289\7\13\2\29:\5\b\5\2:;\7\f\2\2;?\7#\2\2<>"+
		"\5\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2B"+
		"C\7$\2\2CD\7\r\2\2DH\7#\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI"+
		"\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7$\2\2L|\3\2\2\2MN\7\16\2\2NO\7(\2\2OP"+
		"\7!\2\2PQ\7\"\2\2QR\7\37\2\2RV\7#\2\2SU\5\6\4\2TS\3\2\2\2UX\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2Y|\7$\2\2Z[\7\16\2\2[\\\7(\2\2\\"+
		"]\7!\2\2]b\7(\2\2^_\7%\2\2_a\7(\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\"\2\2fg\7\37\2\2gk\7#\2\2hj\5\6\4\2ih\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2n|\7$\2\2op\7"+
		"\17\2\2pq\5\b\5\2qr\7 \2\2r|\3\2\2\2st\5\b\5\2tu\7 \2\2u|\3\2\2\2vw\7"+
		"(\2\2wx\7\36\2\2xy\5\b\5\2yz\7 \2\2z|\3\2\2\2{\25\3\2\2\2{\32\3\2\2\2"+
		"{ \3\2\2\2{,\3\2\2\2{8\3\2\2\2{M\3\2\2\2{Z\3\2\2\2{o\3\2\2\2{s\3\2\2\2"+
		"{v\3\2\2\2|\7\3\2\2\2}~\b\5\1\2~\177\7!\2\2\177\u0080\5\b\5\2\u0080\u0081"+
		"\7\"\2\2\u0081\u0093\3\2\2\2\u0082\u0093\5\n\6\2\u0083\u0084\7(\2\2\u0084"+
		"\u0085\7!\2\2\u0085\u0093\7\"\2\2\u0086\u0087\7(\2\2\u0087\u0088\7!\2"+
		"\2\u0088\u008d\5\b\5\2\u0089\u008a\7%\2\2\u008a\u008c\5\b\5\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0093\3\2"+
		"\2\2\u0092}\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0086"+
		"\3\2\2\2\u0093\u00a8\3\2\2\2\u0094\u0095\f\b\2\2\u0095\u0096\7\22\2\2"+
		"\u0096\u00a7\5\b\5\t\u0097\u0098\f\7\2\2\u0098\u0099\t\2\2\2\u0099\u00a7"+
		"\5\b\5\b\u009a\u009b\f\6\2\2\u009b\u009c\t\3\2\2\u009c\u00a7\5\b\5\7\u009d"+
		"\u009e\f\5\2\2\u009e\u009f\t\4\2\2\u009f\u00a7\5\b\5\6\u00a0\u00a1\f\4"+
		"\2\2\u00a1\u00a2\t\5\2\2\u00a2\u00a7\5\b\5\5\u00a3\u00a4\f\3\2\2\u00a4"+
		"\u00a5\t\6\2\2\u00a5\u00a7\5\b\5\4\u00a6\u0094\3\2\2\2\u00a6\u0097\3\2"+
		"\2\2\u00a6\u009a\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\t\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\7\'\2\2\u00ac\u00af"+
		"\7&\2\2\u00ad\u00af\7(\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\13\3\2\2\2\20\17\'\63?HVbk{\u008d\u0092\u00a6\u00a8"+
		"\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}