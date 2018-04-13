// Generated from /Users/alexvangogen/SPbAU/FL/lexer_github/kotlin-antlr-lexer/kotlin-antlr-lexer/src/main/resources/ru.spbau.mit.fl.grammar/LLexer.g4 by ANTLR 4.7
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
		ELSE=10, FUNCDECL=11, RETURN=12, PLUS=13, MINUS=14, POW=15, MULT=16, DIV=17, 
		MOD=18, EQ=19, NEQ=20, GT=21, GEQ=22, LT=23, LEQ=24, AND=25, OR=26, ASSIGN=27, 
		FUNCBODY=28, SEP=29, LPAREN=30, RPAREN=31, LFIG=32, RFIG=33, COMMA=34, 
		NUMBER=35, BOOL=36, ID=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "SPACE", "COMMENT", "WRITE", "READ", "WHILE", "DO", "IF", "THEN", 
		"ELSE", "FUNCDECL", "RETURN", "PLUS", "MINUS", "POW", "MULT", "DIV", "MOD", 
		"EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "ASSIGN", "FUNCBODY", 
		"SEP", "LPAREN", "RPAREN", "LFIG", "RFIG", "COMMA", "NUMBER", "BOOL", 
		"ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'write'", "'read'", "'while'", "'do'", "'if'", 
		"'then'", "'else'", "'fun'", "'return'", "'+'", "'-'", "'**'", "'*'", 
		"'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
		"':='", "'<-'", "';'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "SPACE", "COMMENT", "WRITE", "READ", "WHILE", "DO", "IF", 
		"THEN", "ELSE", "FUNCDECL", "RETURN", "PLUS", "MINUS", "POW", "MULT", 
		"DIV", "MOD", "EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "ASSIGN", 
		"FUNCBODY", "SEP", "LPAREN", "RPAREN", "LFIG", "RFIG", "COMMA", "NUMBER", 
		"BOOL", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\5\2S\n\2\3\3\6"+
		"\3V\n\3\r\3\16\3W\3\3\3\3\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\5$\u00c7\n$\3$\6$\u00ca\n$\r$\16$\u00cb\3$\3$\7$\u00d0\n"+
		"$\f$\16$\u00d3\13$\5$\u00d5\n$\3$\3$\5$\u00d9\n$\3$\6$\u00dc\n$\r$\16"+
		"$\u00dd\3$\3$\7$\u00e2\n$\f$\16$\u00e5\13$\5$\u00e7\n$\5$\u00e9\n$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00f4\n%\3&\7&\u00f7\n&\f&\16&\u00fa\13&\3"+
		"&\3&\7&\u00fe\n&\f&\16&\u0101\13&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\n\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\4\2--//\3\2\62;\4\2GGgg\3\2aa\3\2c|\5\2\62;aac|"+
		"\2\u0111\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3R\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\td"+
		"\3\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17u\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25"+
		"\u0080\3\2\2\2\27\u0085\3\2\2\2\31\u0089\3\2\2\2\33\u0090\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2"+
		"\'\u009d\3\2\2\2)\u00a0\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b3\3\2"+
		"\2\29\u00b6\3\2\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00bf"+
		"\3\2\2\2C\u00c1\3\2\2\2E\u00c3\3\2\2\2G\u00c6\3\2\2\2I\u00f3\3\2\2\2K"+
		"\u00f8\3\2\2\2MN\7\17\2\2NS\7\f\2\2OS\7\17\2\2PQ\7\f\2\2QS\b\2\2\2RM\3"+
		"\2\2\2RO\3\2\2\2RP\3\2\2\2S\4\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU"+
		"\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\3\3\2Z\6\3\2\2\2[\\\7\61\2\2\\]\7\61"+
		"\2\2]a\3\2\2\2^`\n\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\b\3"+
		"\2\2\2ca\3\2\2\2de\7y\2\2ef\7t\2\2fg\7k\2\2gh\7v\2\2hi\7g\2\2i\n\3\2\2"+
		"\2jk\7t\2\2kl\7g\2\2lm\7c\2\2mn\7f\2\2n\f\3\2\2\2op\7y\2\2pq\7j\2\2qr"+
		"\7k\2\2rs\7n\2\2st\7g\2\2t\16\3\2\2\2uv\7f\2\2vw\7q\2\2w\20\3\2\2\2xy"+
		"\7k\2\2yz\7h\2\2z\22\3\2\2\2{|\7v\2\2|}\7j\2\2}~\7g\2\2~\177\7p\2\2\177"+
		"\24\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7g\2\2\u0084\26\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7p\2\2\u0088\30\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2\u008e\u008f\7p\2\2"+
		"\u008f\32\3\2\2\2\u0090\u0091\7-\2\2\u0091\34\3\2\2\2\u0092\u0093\7/\2"+
		"\2\u0093\36\3\2\2\2\u0094\u0095\7,\2\2\u0095\u0096\7,\2\2\u0096 \3\2\2"+
		"\2\u0097\u0098\7,\2\2\u0098\"\3\2\2\2\u0099\u009a\7\61\2\2\u009a$\3\2"+
		"\2\2\u009b\u009c\7\'\2\2\u009c&\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f"+
		"\7?\2\2\u009f(\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7?\2\2\u00a2*\3"+
		"\2\2\2\u00a3\u00a4\7@\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7"+
		"\7?\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\60\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab\u00ac\7?\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\u00af"+
		"\7(\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7~\2\2\u00b1\u00b2\7~\2\2\u00b2\66"+
		"\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\7?\2\2\u00b58\3\2\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b7\u00b8\7/\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba<\3"+
		"\2\2\2\u00bb\u00bc\7*\2\2\u00bc>\3\2\2\2\u00bd\u00be\7+\2\2\u00be@\3\2"+
		"\2\2\u00bf\u00c0\7}\2\2\u00c0B\3\2\2\2\u00c1\u00c2\7\177\2\2\u00c2D\3"+
		"\2\2\2\u00c3\u00c4\7.\2\2\u00c4F\3\2\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\t\5\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00d1\7\60\2\2\u00ce\u00d0\t\5\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00e8\3\2\2\2\u00d6\u00d8\t\6\2\2\u00d7\u00d9\t\4"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00dc\t\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e6\3\2\2\2\u00df\u00e3\7\60\2\2\u00e0"+
		"\u00e2\t\5\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00df\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00d6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00f4\7g\2\2\u00ee\u00ef\7h\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f4\7g\2\2"+
		"\u00f3\u00ea\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4J\3\2\2\2\u00f5\u00f7\t"+
		"\7\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\t\b"+
		"\2\2\u00fc\u00fe\t\t\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100L\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\22\2RWa\u00c6\u00cb\u00d1\u00d4\u00d8\u00dd\u00e3\u00e6\u00e8\u00f3\u00f8"+
		"\u00ff\4\3\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}