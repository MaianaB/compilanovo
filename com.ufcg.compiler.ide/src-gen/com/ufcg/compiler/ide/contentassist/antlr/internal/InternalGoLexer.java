package com.ufcg.compiler.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=5;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_STRING_DECL=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:18:7: ( 'for' )
            // InternalGo.g:18:9: 'for'
            {
            match("for"); 


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
            // InternalGo.g:19:7: ( '{' )
            // InternalGo.g:19:9: '{'
            {
            match('{'); 

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
            // InternalGo.g:20:7: ( '}' )
            // InternalGo.g:20:9: '}'
            {
            match('}'); 

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
            // InternalGo.g:21:7: ( ';' )
            // InternalGo.g:21:9: ';'
            {
            match(';'); 

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
            // InternalGo.g:22:7: ( ',' )
            // InternalGo.g:22:9: ','
            {
            match(','); 

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
            // InternalGo.g:23:7: ( '[' )
            // InternalGo.g:23:9: '['
            {
            match('['); 

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
            // InternalGo.g:24:7: ( ']' )
            // InternalGo.g:24:9: ']'
            {
            match(']'); 

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
            // InternalGo.g:25:7: ( 'func' )
            // InternalGo.g:25:9: 'func'
            {
            match("func"); 


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
            // InternalGo.g:26:7: ( '&' )
            // InternalGo.g:26:9: '&'
            {
            match('&'); 

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
            // InternalGo.g:27:7: ( '||' )
            // InternalGo.g:27:9: '||'
            {
            match("||"); 


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
            // InternalGo.g:28:7: ( 'true' )
            // InternalGo.g:28:9: 'true'
            {
            match("true"); 


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
            // InternalGo.g:29:7: ( 'false' )
            // InternalGo.g:29:9: 'false'
            {
            match("false"); 


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
            // InternalGo.g:30:7: ( 'var' )
            // InternalGo.g:30:9: 'var'
            {
            match("var"); 


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
            // InternalGo.g:31:7: ( 'const' )
            // InternalGo.g:31:9: 'const'
            {
            match("const"); 


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
            // InternalGo.g:32:7: ( '=' )
            // InternalGo.g:32:9: '='
            {
            match('='); 

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
            // InternalGo.g:33:7: ( ':=' )
            // InternalGo.g:33:9: ':='
            {
            match(":="); 


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
            // InternalGo.g:34:7: ( 'string' )
            // InternalGo.g:34:9: 'string'
            {
            match("string"); 


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
            // InternalGo.g:35:7: ( 'int' )
            // InternalGo.g:35:9: 'int'
            {
            match("int"); 


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
            // InternalGo.g:36:7: ( 'float' )
            // InternalGo.g:36:9: 'float'
            {
            match("float"); 


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
            // InternalGo.g:37:7: ( 'bool' )
            // InternalGo.g:37:9: 'bool'
            {
            match("bool"); 


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
            // InternalGo.g:38:7: ( '==' )
            // InternalGo.g:38:9: '=='
            {
            match("=="); 


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
            // InternalGo.g:39:7: ( '>=' )
            // InternalGo.g:39:9: '>='
            {
            match(">="); 


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
            // InternalGo.g:40:7: ( '<=' )
            // InternalGo.g:40:9: '<='
            {
            match("<="); 


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
            // InternalGo.g:41:7: ( '>' )
            // InternalGo.g:41:9: '>'
            {
            match('>'); 

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
            // InternalGo.g:42:7: ( '<' )
            // InternalGo.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_NUMERO"
    public final void mRULE_NUMERO() throws RecognitionException {
        try {
            int _type = RULE_NUMERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGo.g:4794:13: ( RULE_INT )
            // InternalGo.g:4794:15: RULE_INT
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
            // InternalGo.g:4796:18: ( '\"' ( RULE_ID | RULE_NUMERO )* '\"' )
            // InternalGo.g:4796:20: '\"' ( RULE_ID | RULE_NUMERO )* '\"'
            {
            match('\"'); 
            // InternalGo.g:4796:24: ( RULE_ID | RULE_NUMERO )*
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
            	    // InternalGo.g:4796:25: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalGo.g:4796:33: RULE_NUMERO
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
            // InternalGo.g:4798:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGo.g:4798:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGo.g:4798:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:4798:11: '^'
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

            // InternalGo.g:4798:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalGo.g:4800:19: ( ( '0' .. '9' )+ )
            // InternalGo.g:4800:21: ( '0' .. '9' )+
            {
            // InternalGo.g:4800:21: ( '0' .. '9' )+
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
            	    // InternalGo.g:4800:22: '0' .. '9'
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
            // InternalGo.g:4802:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGo.g:4802:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGo.g:4802:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalGo.g:4802:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGo.g:4802:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalGo.g:4802:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:4802:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalGo.g:4802:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGo.g:4802:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalGo.g:4802:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGo.g:4802:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalGo.g:4804:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGo.g:4804:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGo.g:4804:24: ( options {greedy=false; } : . )*
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
            	    // InternalGo.g:4804:52: .
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
            // InternalGo.g:4806:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGo.g:4806:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGo.g:4806:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGo.g:4806:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalGo.g:4806:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:4806:41: ( '\\r' )? '\\n'
                    {
                    // InternalGo.g:4806:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:4806:41: '\\r'
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
            // InternalGo.g:4808:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGo.g:4808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGo.g:4808:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalGo.g:4810:16: ( . )
            // InternalGo.g:4810:18: .
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
        // InternalGo.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_NUMERO | RULE_STRING_DECL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalGo.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalGo.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalGo.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalGo.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalGo.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalGo.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalGo.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalGo.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalGo.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalGo.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalGo.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalGo.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalGo.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalGo.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalGo.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalGo.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalGo.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalGo.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalGo.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalGo.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalGo.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalGo.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalGo.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalGo.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalGo.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalGo.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalGo.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalGo.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalGo.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalGo.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalGo.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalGo.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalGo.g:1:202: RULE_NUMERO
                {
                mRULE_NUMERO(); 

                }
                break;
            case 34 :
                // InternalGo.g:1:214: RULE_STRING_DECL
                {
                mRULE_STRING_DECL(); 

                }
                break;
            case 35 :
                // InternalGo.g:1:231: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalGo.g:1:239: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalGo.g:1:251: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalGo.g:1:267: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalGo.g:1:283: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalGo.g:1:291: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\6\uffff\1\50\1\51\1\52\7\uffff\1\40\3\52\1\73\1\40\3\52\1\101\1\103\1\uffff\1\40\1\uffff\1\40\14\uffff\4\52\10\uffff\3\52\3\uffff\3\52\13\uffff\1\130\4\52\1\135\2\52\1\140\1\52\4\uffff\1\142\2\52\1\145\1\uffff\2\52\1\uffff\1\150\1\uffff\1\151\1\152\1\uffff\1\153\1\52\4\uffff\1\155\1\uffff";
    static final String DFA13_eofS =
        "\156\uffff";
    static final String DFA13_minS =
        "\1\0\5\uffff\1\52\1\101\1\141\7\uffff\1\174\1\162\1\141\1\157\2\75\1\164\1\156\1\157\2\75\1\uffff\1\0\1\uffff\1\0\14\uffff\1\162\1\156\1\154\1\157\10\uffff\1\165\1\162\1\156\3\uffff\1\162\1\164\1\157\6\uffff\1\0\1\uffff\2\0\1\uffff\1\60\1\143\1\163\1\141\1\145\1\60\1\163\1\151\1\60\1\154\1\uffff\2\0\1\uffff\1\60\1\145\1\164\1\60\1\uffff\1\164\1\156\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\1\147\4\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\5\uffff\1\57\1\172\1\165\7\uffff\1\174\1\162\1\141\1\157\2\75\1\164\1\156\1\157\2\75\1\uffff\1\uffff\1\uffff\1\uffff\14\uffff\1\162\1\156\1\154\1\157\10\uffff\1\165\1\162\1\156\3\uffff\1\162\1\164\1\157\6\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\172\1\143\1\163\1\141\1\145\1\172\1\163\1\151\1\172\1\154\1\uffff\2\uffff\1\uffff\1\172\1\145\1\164\1\172\1\uffff\1\164\1\156\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\147\4\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\20\13\uffff\1\41\1\uffff\1\43\1\uffff\1\47\1\50\1\1\1\2\1\3\1\4\1\5\1\45\1\46\1\6\1\7\1\43\4\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\3\uffff\1\34\1\26\1\27\3\uffff\1\35\1\37\1\36\1\40\1\41\1\44\1\uffff\1\42\2\uffff\1\47\12\uffff\1\42\2\uffff\1\10\4\uffff\1\24\2\uffff\1\31\1\uffff\1\17\2\uffff\1\22\2\uffff\1\33\1\23\1\32\1\25\1\uffff\1\30";
    static final String DFA13_specialS =
        "\1\6\33\uffff\1\7\1\uffff\1\1\47\uffff\1\5\1\uffff\1\2\1\4\14\uffff\1\3\1\0\26\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\3\40\1\17\1\36\1\1\1\2\1\5\1\3\1\14\1\4\1\40\1\6\12\33\1\25\1\13\1\32\1\24\1\31\2\40\32\35\1\15\1\40\1\16\1\7\1\35\1\40\1\35\1\30\1\23\2\35\1\10\2\35\1\27\11\35\1\26\1\21\1\35\1\22\4\35\1\11\1\20\1\12\uff82\40",
            "",
            "",
            "",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\55\12\uffff\1\56\2\uffff\1\53\5\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102",
            "",
            "\42\105\1\107\15\105\12\111\7\105\32\110\3\105\1\106\1\110\1\105\32\110\uff85\105",
            "",
            "\0\105",
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
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "\101\105\32\110\4\105\1\110\1\105\32\110\uff85\105",
            "",
            "\42\105\1\107\15\105\12\127\7\105\32\126\3\105\1\106\1\126\1\105\32\126\uff85\105",
            "\42\105\1\107\15\105\12\111\7\105\32\110\3\105\1\106\1\110\1\105\32\110\uff85\105",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\136",
            "\1\137",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\141",
            "",
            "\42\105\1\107\15\105\12\127\7\105\32\126\3\105\1\106\1\126\1\105\32\126\uff85\105",
            "\42\105\1\107\15\105\12\127\7\105\32\126\3\105\1\106\1\126\1\105\32\126\uff85\105",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\143",
            "\1\144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\146",
            "\1\147",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\154",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_NUMERO | RULE_STRING_DECL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_87 = input.LA(1);

                        s = -1;
                        if ( (LA13_87=='\"') ) {s = 71;}

                        else if ( (LA13_87=='^') ) {s = 70;}

                        else if ( ((LA13_87>='A' && LA13_87<='Z')||LA13_87=='_'||(LA13_87>='a' && LA13_87<='z')) ) {s = 86;}

                        else if ( ((LA13_87>='0' && LA13_87<='9')) ) {s = 87;}

                        else if ( ((LA13_87>='\u0000' && LA13_87<='!')||(LA13_87>='#' && LA13_87<='/')||(LA13_87>=':' && LA13_87<='@')||(LA13_87>='[' && LA13_87<=']')||LA13_87=='`'||(LA13_87>='{' && LA13_87<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_72 = input.LA(1);

                        s = -1;
                        if ( ((LA13_72>='A' && LA13_72<='Z')||LA13_72=='_'||(LA13_72>='a' && LA13_72<='z')) ) {s = 86;}

                        else if ( (LA13_72=='\"') ) {s = 71;}

                        else if ( (LA13_72=='^') ) {s = 70;}

                        else if ( ((LA13_72>='0' && LA13_72<='9')) ) {s = 87;}

                        else if ( ((LA13_72>='\u0000' && LA13_72<='!')||(LA13_72>='#' && LA13_72<='/')||(LA13_72>=':' && LA13_72<='@')||(LA13_72>='[' && LA13_72<=']')||LA13_72=='`'||(LA13_72>='{' && LA13_72<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_86 = input.LA(1);

                        s = -1;
                        if ( ((LA13_86>='A' && LA13_86<='Z')||LA13_86=='_'||(LA13_86>='a' && LA13_86<='z')) ) {s = 86;}

                        else if ( (LA13_86=='\"') ) {s = 71;}

                        else if ( (LA13_86=='^') ) {s = 70;}

                        else if ( ((LA13_86>='0' && LA13_86<='9')) ) {s = 87;}

                        else if ( ((LA13_86>='\u0000' && LA13_86<='!')||(LA13_86>='#' && LA13_86<='/')||(LA13_86>=':' && LA13_86<='@')||(LA13_86>='[' && LA13_86<=']')||LA13_86=='`'||(LA13_86>='{' && LA13_86<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_73 = input.LA(1);

                        s = -1;
                        if ( (LA13_73=='\"') ) {s = 71;}

                        else if ( (LA13_73=='^') ) {s = 70;}

                        else if ( ((LA13_73>='A' && LA13_73<='Z')||LA13_73=='_'||(LA13_73>='a' && LA13_73<='z')) ) {s = 72;}

                        else if ( ((LA13_73>='0' && LA13_73<='9')) ) {s = 73;}

                        else if ( ((LA13_73>='\u0000' && LA13_73<='!')||(LA13_73>='#' && LA13_73<='/')||(LA13_73>=':' && LA13_73<='@')||(LA13_73>='[' && LA13_73<=']')||LA13_73=='`'||(LA13_73>='{' && LA13_73<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( ((LA13_70>='A' && LA13_70<='Z')||LA13_70=='_'||(LA13_70>='a' && LA13_70<='z')) ) {s = 72;}

                        else if ( ((LA13_70>='\u0000' && LA13_70<='@')||(LA13_70>='[' && LA13_70<='^')||LA13_70=='`'||(LA13_70>='{' && LA13_70<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
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

                        else if ( (LA13_0==';') ) {s = 11;}

                        else if ( (LA13_0==',') ) {s = 12;}

                        else if ( (LA13_0=='[') ) {s = 13;}

                        else if ( (LA13_0==']') ) {s = 14;}

                        else if ( (LA13_0=='&') ) {s = 15;}

                        else if ( (LA13_0=='|') ) {s = 16;}

                        else if ( (LA13_0=='t') ) {s = 17;}

                        else if ( (LA13_0=='v') ) {s = 18;}

                        else if ( (LA13_0=='c') ) {s = 19;}

                        else if ( (LA13_0=='=') ) {s = 20;}

                        else if ( (LA13_0==':') ) {s = 21;}

                        else if ( (LA13_0=='s') ) {s = 22;}

                        else if ( (LA13_0=='i') ) {s = 23;}

                        else if ( (LA13_0=='b') ) {s = 24;}

                        else if ( (LA13_0=='>') ) {s = 25;}

                        else if ( (LA13_0=='<') ) {s = 26;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 27;}

                        else if ( (LA13_0=='\"') ) {s = 28;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='d' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='r')||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {s = 29;}

                        else if ( (LA13_0=='\'') ) {s = 30;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 31;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||LA13_0=='.'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='!')||(LA13_28>='#' && LA13_28<='/')||(LA13_28>=':' && LA13_28<='@')||(LA13_28>='[' && LA13_28<=']')||LA13_28=='`'||(LA13_28>='{' && LA13_28<='\uFFFF')) ) {s = 69;}

                        else if ( (LA13_28=='^') ) {s = 70;}

                        else if ( (LA13_28=='\"') ) {s = 71;}

                        else if ( ((LA13_28>='A' && LA13_28<='Z')||LA13_28=='_'||(LA13_28>='a' && LA13_28<='z')) ) {s = 72;}

                        else if ( ((LA13_28>='0' && LA13_28<='9')) ) {s = 73;}

                        else s = 32;

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