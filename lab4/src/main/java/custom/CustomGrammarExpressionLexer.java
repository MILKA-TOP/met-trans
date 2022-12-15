// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab4/src/main/kotlin\CustomGrammarExpression.g4 by ANTLR 4.10.1
package custom;

import models.GrammarData;
import models.TerminalState;
import models.NonTerminalState;
import models.RuleTarget;
import models.NonTerminalTarget;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomGrammarExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INPUT=2, ALPS=3, WS=4, EQUAL=5, LINE_END=6, DOUBLE_POINT=7, VERT=8, 
		ARROW=9, PARAM_LEFT=10, PARAM_RIGHT=11, FUNCTION_LEFT=12, FUNCTION_RIGHT=13, 
		SPEC_LEFT=14, SPEC_RIGHT=15, VAR=16, HEADER=17, TERMINAL_NAME=18, NON_TERMINAL_NAME=19, 
		GRAMMAR_NAME=20, FUNCTION_PARAMETER=21, FUNCTION_CODE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INPUT", "ALPS", "WS", "EQUAL", "LINE_END", "DOUBLE_POINT", "VERT", 
			"ARROW", "PARAM_LEFT", "PARAM_RIGHT", "FUNCTION_LEFT", "FUNCTION_RIGHT", 
			"SPEC_LEFT", "SPEC_RIGHT", "VAR", "HEADER", "TERMINAL_NAME", "NON_TERMINAL_NAME", 
			"GRAMMAR_NAME", "FUNCTION_PARAMETER", "FUNCTION_CODE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar '", null, null, null, "'='", "';'", "':'", "'|'", "'->'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "'var'", "'@header'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INPUT", "ALPS", "WS", "EQUAL", "LINE_END", "DOUBLE_POINT", 
			"VERT", "ARROW", "PARAM_LEFT", "PARAM_RIGHT", "FUNCTION_LEFT", "FUNCTION_RIGHT", 
			"SPEC_LEFT", "SPEC_RIGHT", "VAR", "HEADER", "TERMINAL_NAME", "NON_TERMINAL_NAME", 
			"GRAMMAR_NAME", "FUNCTION_PARAMETER", "FUNCTION_CODE"
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


	GrammarData grammarMember = new GrammarData();


	public CustomGrammarExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CustomGrammarExpression.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002"+
		"E\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003J\b\u0003\u000b"+
		"\u0003\f\u0003K\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004"+
		"\u0011t\b\u0011\u000b\u0011\f\u0011u\u0001\u0011\u0005\u0011y\b\u0011"+
		"\n\u0011\f\u0011|\t\u0011\u0001\u0012\u0004\u0012\u007f\b\u0012\u000b"+
		"\u0012\f\u0012\u0080\u0001\u0012\u0005\u0012\u0084\b\u0012\n\u0012\f\u0012"+
		"\u0087\t\u0012\u0001\u0013\u0004\u0013\u008a\b\u0013\u000b\u0013\f\u0013"+
		"\u008b\u0001\u0013\u0005\u0013\u008f\b\u0013\n\u0013\f\u0013\u0092\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0004\u0014\u0096\b\u0014\u000b\u0014\f\u0014"+
		"\u0097\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u009e"+
		"\b\u0015\n\u0015\f\u0015\u00a1\t\u0015\u0001\u0015\u0001\u0015\u0004:"+
		"C\u0097\u009f\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"AZ\u0002\u0000AZ__\u0001\u0000az\u0002\u0000AZaz\u00ae\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000"+
		"\u0005?\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tO\u0001"+
		"\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000"+
		"\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013"+
		"Z\u0001\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000\u0017^\u0001"+
		"\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000"+
		"\u0000\u001dd\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!"+
		"j\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000"+
		"\u0000\'\u0089\u0001\u0000\u0000\u0000)\u0093\u0001\u0000\u0000\u0000"+
		"+\u009b\u0001\u0000\u0000\u0000-.\u0005g\u0000\u0000./\u0005r\u0000\u0000"+
		"/0\u0005a\u0000\u000001\u0005m\u0000\u000012\u0005m\u0000\u000023\u0005"+
		"a\u0000\u000034\u0005r\u0000\u000045\u0005 \u0000\u00005\u0002\u0001\u0000"+
		"\u0000\u00006:\u0005\'\u0000\u000079\t\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=>\u0005\'\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?C\u0005\'\u0000"+
		"\u0000@B\t\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\'\u0000\u0000G\u0006\u0001"+
		"\u0000\u0000\u0000HJ\u0007\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u0003\u0000\u0000N\b\u0001\u0000"+
		"\u0000\u0000OP\u0005=\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005;"+
		"\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005:\u0000\u0000T\u000e\u0001"+
		"\u0000\u0000\u0000UV\u0005|\u0000\u0000V\u0010\u0001\u0000\u0000\u0000"+
		"WX\u0005-\u0000\u0000XY\u0005>\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000"+
		"Z[\u0005[\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\]\u0005]\u0000\u0000"+
		"]\u0016\u0001\u0000\u0000\u0000^_\u0005{\u0000\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000`a\u0005}\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bc\u0005"+
		"<\u0000\u0000c\u001c\u0001\u0000\u0000\u0000de\u0005>\u0000\u0000e\u001e"+
		"\u0001\u0000\u0000\u0000fg\u0005v\u0000\u0000gh\u0005a\u0000\u0000hi\u0005"+
		"r\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005@\u0000\u0000kl\u0005h"+
		"\u0000\u0000lm\u0005e\u0000\u0000mn\u0005a\u0000\u0000no\u0005d\u0000"+
		"\u0000op\u0005e\u0000\u0000pq\u0005r\u0000\u0000q\"\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vz\u0001"+
		"\u0000\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{$\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0007"+
		"\u0003\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0085\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0004\u0000\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086&\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0007\u0001\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0090\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0007\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091(\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0013\t\u0000\u0094\u0096\t"+
		"\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0003"+
		"\u0015\n\u0000\u009a*\u0001\u0000\u0000\u0000\u009b\u009f\u0003\u0017"+
		"\u000b\u0000\u009c\u009e\t\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0019\f\u0000"+
		"\u00a3,\u0001\u0000\u0000\u0000\f\u0000:CKuz\u0080\u0085\u008b\u0090\u0097"+
		"\u009f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}