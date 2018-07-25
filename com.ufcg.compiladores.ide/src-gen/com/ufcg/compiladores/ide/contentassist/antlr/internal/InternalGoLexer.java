package com.ufcg.compiladores.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_VIRGULA=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=6;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING_DECL=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGoLexer() {;} 
    public InternalGoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGo.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:11:7: ( '(' )
            // InternalGo.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:12:7: ( ')' )
            // InternalGo.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:13:7: ( '+' )
            // InternalGo.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:14:7: ( '-' )
            // InternalGo.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:15:7: ( '*' )
            // InternalGo.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:16:7: ( '/' )
            // InternalGo.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:17:7: ( '^' )
            // InternalGo.g:17:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:18:7: ( '++' )
            // InternalGo.g:18:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:19:7: ( '--' )
            // InternalGo.g:19:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:20:7: ( 'for' )
            // InternalGo.g:20:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:21:7: ( '{' )
            // InternalGo.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:22:7: ( '}' )
            // InternalGo.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:23:7: ( 'range' )
            // InternalGo.g:23:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:24:7: ( ';' )
            // InternalGo.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:25:7: ( '[' )
            // InternalGo.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:26:7: ( ']' )
            // InternalGo.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:27:7: ( 'return' )
            // InternalGo.g:27:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:28:7: ( 'func' )
            // InternalGo.g:28:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:29:7: ( 'if' )
            // InternalGo.g:29:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:30:7: ( 'else' )
            // InternalGo.g:30:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:31:7: ( '&&' )
            // InternalGo.g:31:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:32:7: ( '||' )
            // InternalGo.g:32:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:33:7: ( 'true' )
            // InternalGo.g:33:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:34:7: ( 'false' )
            // InternalGo.g:34:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:35:7: ( 'var' )
            // InternalGo.g:35:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:36:7: ( 'const' )
            // InternalGo.g:36:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:37:7: ( '=' )
            // InternalGo.g:37:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:38:7: ( ':=' )
            // InternalGo.g:38:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:39:7: ( 'string' )
            // InternalGo.g:39:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:40:7: ( 'int' )
            // InternalGo.g:40:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:41:7: ( 'float' )
            // InternalGo.g:41:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:42:7: ( 'bool' )
            // InternalGo.g:42:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:43:7: ( '==' )
            // InternalGo.g:43:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:44:7: ( '>=' )
            // InternalGo.g:44:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:45:7: ( '<=' )
            // InternalGo.g:45:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:46:7: ( '>' )
            // InternalGo.g:46:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:47:7: ( '<' )
            // InternalGo.g:47:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_VIRGULA"
    public final void mRULE_VIRGULA() throws RecognitionException {
        try {
            int _type = RULE_VIRGULA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7097:14: ( ',' )
            // InternalGo.g:7097:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VIRGULA"

    // $ANTLR start "RULE_NUMERO"
    public final void mRULE_NUMERO() throws RecognitionException {
        try {
            int _type = RULE_NUMERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7099:13: ( RULE_INT )
            // InternalGo.g:7099:15: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERO"

    // $ANTLR start "RULE_STRING_DECL"
    public final void mRULE_STRING_DECL() throws RecognitionException {
        try {
            int _type = RULE_STRING_DECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7101:18: ( '\"' ( RULE_ID | RULE_NUMERO )* '\"' )
            // InternalGo.g:7101:20: '\"' ( RULE_ID | RULE_NUMERO )* '\"'
            {
            match('\"'); 
            // InternalGo.g:7101:24: ( RULE_ID | RULE_NUMERO )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:7101:25: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:7101:33: RULE_NUMERO
            	    {
            	    mRULE_NUMERO(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_DECL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7103:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:7103:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:7103:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:7103:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGo.g:7103:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalGo.g:7105:19: ( ( '0' .. '9' )+ )
            // InternalGo.g:7105:21: ( '0' .. '9' )+
            {
            // InternalGo.g:7105:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGo.g:7105:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7107:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:7107:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:7107:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:7107:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:7107:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGo.g:7107:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7107:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGo.g:7107:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:7107:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGo.g:7107:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:7107:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7109:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:7109:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:7109:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:7109:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7111:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:7111:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:7111:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:7111:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGo.g:7111:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:7111:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:7111:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:7111:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7113:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:7113:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:7113:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:7115:16: ( . )
            // InternalGo.g:7115:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGo.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_VIRGULA | RULE_NUMERO | RULE_STRING_DECL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=46;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGo.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:232: RULE_VIRGULA
                {
                mRULE_VIRGULA(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:245: RULE_NUMERO
                {
                mRULE_NUMERO(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:257: RULE_STRING_DECL
                {
                mRULE_STRING_DECL(); 

                }
                break;
            case 41 :
                // InternalGo.g:1:274: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalGo.g:1:282: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalGo.g:1:294: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalGo.g:1:310: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalGo.g:1:326: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalGo.g:1:334: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\3\uffff\1\46\1\50\1\uffff\1\54\1\55\1\56\2\uffff\1\56\3\uffff\2\56\2\42\3\56\1\103\1\42\2\56\1\110\1\112\2\uffff\1\42\1\uffff\1\42\16\uffff\4\56\2\uffff\2\56\3\uffff\1\131\2\56\2\uffff\3\56\3\uffff\2\56\14\uffff\1\144\5\56\1\uffff\1\152\2\56\1\155\3\56\4\uffff\1\161\4\56\1\uffff\1\166\1\167\1\uffff\2\56\1\172\1\uffff\1\173\1\174\1\175\1\56\2\uffff\1\177\1\56\4\uffff\1\u0081\1\uffff\1\u0082\2\uffff";
    static final String DFA13_eofS =
        "\u0083\uffff";
    static final String DFA13_minS =
        "\1\0\2\uffff\1\53\1\55\1\uffff\1\52\1\101\1\141\2\uffff\1\141\3\uffff\1\146\1\154\1\46\1\174\1\162\1\141\1\157\2\75\1\164\1\157\2\75\2\uffff\1\0\1\uffff\1\0\16\uffff\1\162\1\156\1\154\1\157\2\uffff\1\156\1\164\3\uffff\1\60\1\164\1\163\2\uffff\1\165\1\162\1\156\3\uffff\1\162\1\157\7\uffff\1\0\1\uffff\2\0\1\uffff\1\60\1\143\1\163\1\141\1\147\1\165\1\uffff\1\60\2\145\1\60\1\163\1\151\1\154\1\uffff\2\0\1\uffff\1\60\1\145\1\164\1\145\1\162\1\uffff\2\60\1\uffff\1\164\1\156\1\60\1\uffff\3\60\1\156\2\uffff\1\60\1\147\4\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\uffff\1\53\1\55\1\uffff\1\57\1\172\1\165\2\uffff\1\145\3\uffff\1\156\1\154\1\46\1\174\1\162\1\141\1\157\2\75\1\164\1\157\2\75\2\uffff\1\uffff\1\uffff\1\uffff\16\uffff\1\162\1\156\1\154\1\157\2\uffff\1\156\1\164\3\uffff\1\172\1\164\1\163\2\uffff\1\165\1\162\1\156\3\uffff\1\162\1\157\7\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\172\1\143\1\163\1\141\1\147\1\165\1\uffff\1\172\2\145\1\172\1\163\1\151\1\154\1\uffff\2\uffff\1\uffff\1\172\1\145\1\164\1\145\1\162\1\uffff\2\172\1\uffff\1\164\1\156\1\172\1\uffff\3\172\1\156\2\uffff\1\172\1\147\4\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\3\uffff\1\13\1\14\1\uffff\1\16\1\17\1\20\15\uffff\1\46\1\47\1\uffff\1\51\1\uffff\1\55\1\56\1\1\1\2\1\10\1\3\1\11\1\4\1\5\1\53\1\54\1\6\1\7\1\51\4\uffff\1\13\1\14\2\uffff\1\16\1\17\1\20\3\uffff\1\25\1\26\3\uffff\1\41\1\33\1\34\2\uffff\1\42\1\44\1\43\1\45\1\46\1\47\1\52\1\uffff\1\50\2\uffff\1\55\6\uffff\1\23\7\uffff\1\50\2\uffff\1\12\5\uffff\1\36\2\uffff\1\31\3\uffff\1\22\4\uffff\1\24\1\27\2\uffff\1\40\1\30\1\37\1\15\1\uffff\1\32\1\uffff\1\21\1\35";
    static final String DFA13_specialS =
        "\1\7\35\uffff\1\1\1\uffff\1\5\55\uffff\1\2\1\uffff\1\6\1\4\20\uffff\1\0\1\3\37\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\3\42\1\21\1\40\1\1\1\2\1\5\1\3\1\34\1\4\1\42\1\6\12\35\1\27\1\14\1\33\1\26\1\32\2\42\32\37\1\15\1\42\1\16\1\7\1\37\1\42\1\37\1\31\1\25\1\37\1\20\1\10\2\37\1\17\10\37\1\13\1\30\1\23\1\37\1\24\4\37\1\11\1\22\1\12\uff82\42",
            "",
            "",
            "\1\45",
            "\1\47",
            "",
            "\1\52\4\uffff\1\53",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\61\12\uffff\1\62\2\uffff\1\57\5\uffff\1\60",
            "",
            "",
            "\1\65\3\uffff\1\66",
            "",
            "",
            "",
            "\1\72\7\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111",
            "",
            "",
            "\42\115\1\117\15\115\12\121\7\115\32\120\3\115\1\116\1\120\1\115\32\120\uff85\115",
            "",
            "\0\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\101\115\32\120\4\115\1\120\1\115\32\120\uff85\115",
            "",
            "\42\115\1\117\15\115\12\143\7\115\32\142\3\115\1\116\1\142\1\115\32\142\uff85\115",
            "\42\115\1\117\15\115\12\121\7\115\32\120\3\115\1\116\1\120\1\115\32\120\uff85\115",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\153",
            "\1\154",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\42\115\1\117\15\115\12\143\7\115\32\142\3\115\1\116\1\142\1\115\32\142\uff85\115",
            "\42\115\1\117\15\115\12\143\7\115\32\142\3\115\1\116\1\142\1\115\32\142\uff85\115",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\170",
            "\1\171",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\176",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_VIRGULA | RULE_NUMERO | RULE_STRING_DECL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( ((LA13_98>='A' && LA13_98<='Z')||LA13_98=='_'||(LA13_98>='a' && LA13_98<='z')) ) {s = 98;}

                        else if ( (LA13_98=='\"') ) {s = 79;}

                        else if ( (LA13_98=='^') ) {s = 78;}

                        else if ( ((LA13_98>='0' && LA13_98<='9')) ) {s = 99;}

                        else if ( ((LA13_98>='\u0000' && LA13_98<='!')||(LA13_98>='#' && LA13_98<='/')||(LA13_98>=':' && LA13_98<='@')||(LA13_98>='[' && LA13_98<=']')||LA13_98=='`'||(LA13_98>='{' && LA13_98<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='!')||(LA13_30>='#' && LA13_30<='/')||(LA13_30>=':' && LA13_30<='@')||(LA13_30>='[' && LA13_30<=']')||LA13_30=='`'||(LA13_30>='{' && LA13_30<='\uFFFF')) ) {s = 77;}

                        else if ( (LA13_30=='^') ) {s = 78;}

                        else if ( (LA13_30=='\"') ) {s = 79;}

                        else if ( ((LA13_30>='A' && LA13_30<='Z')||LA13_30=='_'||(LA13_30>='a' && LA13_30<='z')) ) {s = 80;}

                        else if ( ((LA13_30>='0' && LA13_30<='9')) ) {s = 81;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_78 = input.LA(1);

                        s = -1;
                        if ( ((LA13_78>='A' && LA13_78<='Z')||LA13_78=='_'||(LA13_78>='a' && LA13_78<='z')) ) {s = 80;}

                        else if ( ((LA13_78>='\u0000' && LA13_78<='@')||(LA13_78>='[' && LA13_78<='^')||LA13_78=='`'||(LA13_78>='{' && LA13_78<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_99 = input.LA(1);

                        s = -1;
                        if ( (LA13_99=='\"') ) {s = 79;}

                        else if ( (LA13_99=='^') ) {s = 78;}

                        else if ( ((LA13_99>='A' && LA13_99<='Z')||LA13_99=='_'||(LA13_99>='a' && LA13_99<='z')) ) {s = 98;}

                        else if ( ((LA13_99>='0' && LA13_99<='9')) ) {s = 99;}

                        else if ( ((LA13_99>='\u0000' && LA13_99<='!')||(LA13_99>='#' && LA13_99<='/')||(LA13_99>=':' && LA13_99<='@')||(LA13_99>='[' && LA13_99<=']')||LA13_99=='`'||(LA13_99>='{' && LA13_99<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_81 = input.LA(1);

                        s = -1;
                        if ( (LA13_81=='\"') ) {s = 79;}

                        else if ( (LA13_81=='^') ) {s = 78;}

                        else if ( ((LA13_81>='A' && LA13_81<='Z')||LA13_81=='_'||(LA13_81>='a' && LA13_81<='z')) ) {s = 80;}

                        else if ( ((LA13_81>='0' && LA13_81<='9')) ) {s = 81;}

                        else if ( ((LA13_81>='\u0000' && LA13_81<='!')||(LA13_81>='#' && LA13_81<='/')||(LA13_81>=':' && LA13_81<='@')||(LA13_81>='[' && LA13_81<=']')||LA13_81=='`'||(LA13_81>='{' && LA13_81<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 77;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( ((LA13_80>='A' && LA13_80<='Z')||LA13_80=='_'||(LA13_80>='a' && LA13_80<='z')) ) {s = 98;}

                        else if ( (LA13_80=='\"') ) {s = 79;}

                        else if ( (LA13_80=='^') ) {s = 78;}

                        else if ( ((LA13_80>='0' && LA13_80<='9')) ) {s = 99;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='!')||(LA13_80>='#' && LA13_80<='/')||(LA13_80>=':' && LA13_80<='@')||(LA13_80>='[' && LA13_80<=']')||LA13_80=='`'||(LA13_80>='{' && LA13_80<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='(') ) {s = 1;}

                        else if ( (LA13_0==')') ) {s = 2;}

                        else if ( (LA13_0=='+') ) {s = 3;}

                        else if ( (LA13_0=='-') ) {s = 4;}

                        else if ( (LA13_0=='*') ) {s = 5;}

                        else if ( (LA13_0=='/') ) {s = 6;}

                        else if ( (LA13_0=='^') ) {s = 7;}

                        else if ( (LA13_0=='f') ) {s = 8;}

                        else if ( (LA13_0=='{') ) {s = 9;}

                        else if ( (LA13_0=='}') ) {s = 10;}

                        else if ( (LA13_0=='r') ) {s = 11;}

                        else if ( (LA13_0==';') ) {s = 12;}

                        else if ( (LA13_0=='[') ) {s = 13;}

                        else if ( (LA13_0==']') ) {s = 14;}

                        else if ( (LA13_0=='i') ) {s = 15;}

                        else if ( (LA13_0=='e') ) {s = 16;}

                        else if ( (LA13_0=='&') ) {s = 17;}

                        else if ( (LA13_0=='|') ) {s = 18;}

                        else if ( (LA13_0=='t') ) {s = 19;}

                        else if ( (LA13_0=='v') ) {s = 20;}

                        else if ( (LA13_0=='c') ) {s = 21;}

                        else if ( (LA13_0=='=') ) {s = 22;}

                        else if ( (LA13_0==':') ) {s = 23;}

                        else if ( (LA13_0=='s') ) {s = 24;}

                        else if ( (LA13_0=='b') ) {s = 25;}

                        else if ( (LA13_0=='>') ) {s = 26;}

                        else if ( (LA13_0=='<') ) {s = 27;}

                        else if ( (LA13_0==',') ) {s = 28;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 29;}

                        else if ( (LA13_0=='\"') ) {s = 30;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='d'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='q')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {s = 31;}

                        else if ( (LA13_0=='\'') ) {s = 32;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 33;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||LA13_0=='.'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}