// Generated from /Users/alexvangogen/SPbAU/FL/kotlin-antlr-lexer/kotlin-antlr-lexer/src/main/resources/ru.spbau.mit.fl.grammar/LLexer.g4 by ANTLR 4.7
package ru.spbau.mit.fl.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, SPACE=2, COMMENT=3, WRITE=4, READ=5, WHILE=6, DO=7, IF=8, THEN=9, 
		ELSE=10, FUNCDECL=11, RETURN=12, PLUS=13, MINUS=14, MULT=15, DIV=16, MOD=17, 
		EQ=18, NEQ=19, GT=20, GEQ=21, LT=22, LEQ=23, AND=24, OR=25, ASSIGN=26, 
		FUNCBODY=27, SEP=28, LPAREN=29, RPAREN=30, LFIG=31, RFIG=32, COMMA=33, 
		NUMBER=34, BOOL=35, ID=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "SPACE", "COMMENT", "WRITE", "READ", "WHILE", "DO", "IF", "THEN", 
		"ELSE", "FUNCDECL", "RETURN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQ", 
		"NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "ASSIGN", "FUNCBODY", "SEP", 
		"LPAREN", "RPAREN", "LFIG", "RFIG", "COMMA", "NUMBER", "BOOL", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'write'", "'read'", "'while'", "'do'", "'if'", 
		"'then'", "'else'", "'fun'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "':='", 
		"'<-'", "';'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "SPACE", "COMMENT", "WRITE", "READ", "WHILE", "DO", "IF", 
		"THEN", "ELSE", "FUNCDECL", "RETURN", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "ASSIGN", "FUNCBODY", 
		"SEP", "LPAREN", "RPAREN", "LFIG", "RFIG", "COMMA", "NUMBER", "BOOL", 
		"ID"
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


	public LLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Token getNextToken() throws LexerException {
		if (_input == null) {
			throw new IllegalStateException("nextToken requires a non-null input stream.");
		}

		// Mark start location in char stream so unbuffered streams are
		// guaranteed at least have text of current token
		int tokenStartMarker = _input.mark();
		try {
			outer:
			while (true) {
				if (_hitEOF) {
					emitEOF();
					return _token;
				}

				_token = null;
				_channel = Token.DEFAULT_CHANNEL;
				_tokenStartCharIndex = _input.index();
				_tokenStartCharPositionInLine = getInterpreter().getCharPositionInLine();
				_tokenStartLine = getInterpreter().getLine();
				_text = null;
				do {
					_type = Token.INVALID_TYPE;
					int ttype;
					try {
						ttype = getInterpreter().match(_input, _mode);
					} catch (LexerNoViableAltException e) {
//						notifyListeners(e);        // report error
//						recover(e);
//						ttype = SKIP;
						String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));
						String msg = "token recognition error at: '"+ getErrorDisplay(text) + "'";
						throw new LexerException(msg);
					}
					if (_input.LA(1) == IntStream.EOF) {
						_hitEOF = true;
					}
					if (_type == Token.INVALID_TYPE) _type = ttype;
					if (_type == SKIP) {
						continue outer;
					}
				} while (_type == MORE);
				if (_token == null) emit();
				return _token;
			}
		} finally {
			// make sure we release marker after match or
			// unbuffered char stream will keep buffering
			_input.release(tokenStartMarker);
		}
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\5\2Q\n\2\3\3\6\3T\n"+
		"\3\r\3\16\3U\3\3\3\3\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#"+
		"\u00c2\n#\r#\16#\u00c3\3#\3#\7#\u00c8\n#\f#\16#\u00cb\13#\5#\u00cd\n#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00d8\n$\3%\7%\u00db\n%\f%\16%\u00de\13"+
		"%\3%\3%\7%\u00e2\n%\f%\16%\u00e5\13%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\3\2\62;\3\2aa\3\2c|\5\2\62;aac|\2\u00ef\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\3P\3\2\2\2\5S\3\2\2\2\7Y\3\2\2\2\tb\3\2\2\2\13h\3\2\2\2\rm\3\2"+
		"\2\2\17s\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0083\3\2\2\2"+
		"\31\u0087\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3\2\2\2!"+
		"\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009e\3"+
		"\2\2\2+\u00a0\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63"+
		"\u00ab\3\2\2\2\65\u00ae\3\2\2\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00b8\3\2\2\2?\u00ba\3\2\2\2A\u00bc\3\2\2\2C\u00be\3\2\2\2E"+
		"\u00c1\3\2\2\2G\u00d7\3\2\2\2I\u00dc\3\2\2\2KL\7\17\2\2LQ\7\f\2\2MQ\7"+
		"\17\2\2NO\7\f\2\2OQ\b\2\2\2PK\3\2\2\2PM\3\2\2\2PN\3\2\2\2Q\4\3\2\2\2R"+
		"T\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\3\3\2"+
		"X\6\3\2\2\2YZ\7\61\2\2Z[\7\61\2\2[_\3\2\2\2\\^\n\3\2\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\b\3\2\2\2a_\3\2\2\2bc\7y\2\2cd\7t\2\2de\7"+
		"k\2\2ef\7v\2\2fg\7g\2\2g\n\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7f\2\2"+
		"l\f\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr\7g\2\2r\16\3\2\2\2s"+
		"t\7f\2\2tu\7q\2\2u\20\3\2\2\2vw\7k\2\2wx\7h\2\2x\22\3\2\2\2yz\7v\2\2z"+
		"{\7j\2\2{|\7g\2\2|}\7p\2\2}\24\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\26\3\2\2\2\u0083\u0084\7h\2\2\u0084"+
		"\u0085\7w\2\2\u0085\u0086\7p\2\2\u0086\30\3\2\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7p\2\2\u008d\32\3\2\2\2\u008e\u008f\7-\2\2\u008f\34\3\2\2"+
		"\2\u0090\u0091\7/\2\2\u0091\36\3\2\2\2\u0092\u0093\7,\2\2\u0093 \3\2\2"+
		"\2\u0094\u0095\7\61\2\2\u0095\"\3\2\2\2\u0096\u0097\7\'\2\2\u0097$\3\2"+
		"\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a&\3\2\2\2\u009b\u009c"+
		"\7#\2\2\u009c\u009d\7?\2\2\u009d(\3\2\2\2\u009e\u009f\7@\2\2\u009f*\3"+
		"\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2,\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7\60"+
		"\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa\7(\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7<\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7/\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7<"+
		"\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9>\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb@\3"+
		"\2\2\2\u00bc\u00bd\7\177\2\2\u00bdB\3\2\2\2\u00be\u00bf\7.\2\2\u00bfD"+
		"\3\2\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c9\7\60"+
		"\2\2\u00c6\u00c8\t\4\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdF\3\2\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d8\7g\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2"+
		"\u00d6\u00d8\7g\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8H\3\2"+
		"\2\2\u00d9\u00db\t\5\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e3\t\6\2\2\u00e0\u00e2\t\7\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4J\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\f\2PU_\u00c3\u00c9\u00cc\u00d7\u00dc\u00e3\4\3\2"+
		"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}