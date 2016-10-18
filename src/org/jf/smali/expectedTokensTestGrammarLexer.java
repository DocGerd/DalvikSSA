// $ANTLR 3.2 Sep 23, 2009 14:05:07 org/jf/smali/expectedTokensTestGrammar.g 2011-03-15 14:34:45

package org.jf.smali;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class expectedTokensTestGrammarLexer extends Lexer {
    public static final int ESCAPE_SEQUENCE=6;
    public static final int STRING_LITERAL=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int BASE_STRING_LITERAL=7;
    public static final int TOKEN_NAME=9;
    public static final int HEX_DIGITS=5;
    public static final int HEX_DIGIT=4;
    public static final int EOF=-1;
    public static final int WHITE_SPACE=10;

    // delegates
    // delegators

    public expectedTokensTestGrammarLexer() {;} 
    public expectedTokensTestGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public expectedTokensTestGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "org/jf/smali/expectedTokensTestGrammar.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/jf/smali/expectedTokensTestGrammar.g:7:7: ( '(' )
            // org/jf/smali/expectedTokensTestGrammar.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/jf/smali/expectedTokensTestGrammar.g:8:7: ( ')' )
            // org/jf/smali/expectedTokensTestGrammar.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // org/jf/smali/expectedTokensTestGrammar.g:107:2: ( ( '0' .. '9' ) | ( 'A' .. 'F' ) | ( 'a' .. 'f' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt1=2;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // org/jf/smali/expectedTokensTestGrammar.g:107:4: ( '0' .. '9' )
                    {
                    // org/jf/smali/expectedTokensTestGrammar.g:107:4: ( '0' .. '9' )
                    // org/jf/smali/expectedTokensTestGrammar.g:107:5: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }


                    }
                    break;
                case 2 :
                    // org/jf/smali/expectedTokensTestGrammar.g:107:15: ( 'A' .. 'F' )
                    {
                    // org/jf/smali/expectedTokensTestGrammar.g:107:15: ( 'A' .. 'F' )
                    // org/jf/smali/expectedTokensTestGrammar.g:107:16: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }


                    }
                    break;
                case 3 :
                    // org/jf/smali/expectedTokensTestGrammar.g:107:26: ( 'a' .. 'f' )
                    {
                    // org/jf/smali/expectedTokensTestGrammar.g:107:26: ( 'a' .. 'f' )
                    // org/jf/smali/expectedTokensTestGrammar.g:107:27: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "HEX_DIGITS"
    public final void mHEX_DIGITS() throws RecognitionException {
        try {
            // org/jf/smali/expectedTokensTestGrammar.g:110:2: ( HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // org/jf/smali/expectedTokensTestGrammar.g:110:4: HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGITS"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE(StringBuilder sb) throws RecognitionException {
        try {
            CommonToken HEX_DIGITS1=null;

            // org/jf/smali/expectedTokensTestGrammar.g:113:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | 'u' HEX_DIGITS ) )
            // org/jf/smali/expectedTokensTestGrammar.g:113:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | 'u' HEX_DIGITS )
            {
            match('\\'); 
            // org/jf/smali/expectedTokensTestGrammar.g:114:3: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | 'u' HEX_DIGITS )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt2=1;
                }
                break;
            case 't':
                {
                alt2=2;
                }
                break;
            case 'n':
                {
                alt2=3;
                }
                break;
            case 'f':
                {
                alt2=4;
                }
                break;
            case 'r':
                {
                alt2=5;
                }
                break;
            case '\"':
                {
                alt2=6;
                }
                break;
            case '\'':
                {
                alt2=7;
                }
                break;
            case '\\':
                {
                alt2=8;
                }
                break;
            case 'u':
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // org/jf/smali/expectedTokensTestGrammar.g:115:4: 'b'
                    {
                    match('b'); 
                    sb.append("\b");

                    }
                    break;
                case 2 :
                    // org/jf/smali/expectedTokensTestGrammar.g:116:5: 't'
                    {
                    match('t'); 
                    sb.append("\t");

                    }
                    break;
                case 3 :
                    // org/jf/smali/expectedTokensTestGrammar.g:117:5: 'n'
                    {
                    match('n'); 
                    sb.append("\n");

                    }
                    break;
                case 4 :
                    // org/jf/smali/expectedTokensTestGrammar.g:118:5: 'f'
                    {
                    match('f'); 
                    sb.append("\f");

                    }
                    break;
                case 5 :
                    // org/jf/smali/expectedTokensTestGrammar.g:119:5: 'r'
                    {
                    match('r'); 
                    sb.append("\r");

                    }
                    break;
                case 6 :
                    // org/jf/smali/expectedTokensTestGrammar.g:120:5: '\\\"'
                    {
                    match('\"'); 
                    sb.append("\"");

                    }
                    break;
                case 7 :
                    // org/jf/smali/expectedTokensTestGrammar.g:121:5: '\\''
                    {
                    match('\''); 
                    sb.append("'");

                    }
                    break;
                case 8 :
                    // org/jf/smali/expectedTokensTestGrammar.g:122:5: '\\\\'
                    {
                    match('\\'); 
                    sb.append("\\");

                    }
                    break;
                case 9 :
                    // org/jf/smali/expectedTokensTestGrammar.g:123:5: 'u' HEX_DIGITS
                    {
                    match('u'); 
                    int HEX_DIGITS1Start161 = getCharIndex();
                    mHEX_DIGITS(); 
                    HEX_DIGITS1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, HEX_DIGITS1Start161, getCharIndex()-1);
                    sb.append((char)Integer.parseInt((HEX_DIGITS1!=null?HEX_DIGITS1.getText():null), 16));

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            StringBuilder sb = new StringBuilder();
            // org/jf/smali/expectedTokensTestGrammar.g:129:2: ( BASE_STRING_LITERAL[sb] )
            // org/jf/smali/expectedTokensTestGrammar.g:129:4: BASE_STRING_LITERAL[sb]
            {
            mBASE_STRING_LITERAL(sb); 
            setText(sb.toString());

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "BASE_STRING_LITERAL"
    public final void mBASE_STRING_LITERAL(StringBuilder sb) throws RecognitionException {
        try {
            // org/jf/smali/expectedTokensTestGrammar.g:132:2: ( '\"' ( ESCAPE_SEQUENCE[sb] | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // org/jf/smali/expectedTokensTestGrammar.g:132:4: '\"' ( ESCAPE_SEQUENCE[sb] | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // org/jf/smali/expectedTokensTestGrammar.g:133:3: ( ESCAPE_SEQUENCE[sb] | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:133:5: ESCAPE_SEQUENCE[sb]
            	    {
            	    mESCAPE_SEQUENCE(sb); 

            	    }
            	    break;
            	case 2 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:134:5: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    sb.append((char)input.LA(-1));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "BASE_STRING_LITERAL"

    // $ANTLR start "TOKEN_NAME"
    public final void mTOKEN_NAME() throws RecognitionException {
        try {
            int _type = TOKEN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/jf/smali/expectedTokensTestGrammar.g:139:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '0' .. '9' ) )+ )
            // org/jf/smali/expectedTokensTestGrammar.g:139:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '0' .. '9' ) )+
            {
            // org/jf/smali/expectedTokensTestGrammar.g:139:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' | ( '0' .. '9' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt4=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt4=2;
                    }
                    break;
                case '_':
                    {
                    alt4=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:5: ( 'a' .. 'z' )
            	    {
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:5: ( 'a' .. 'z' )
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:16: ( 'A' .. 'Z' )
            	    {
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:16: ( 'A' .. 'Z' )
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:29: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:33: ( '0' .. '9' )
            	    {
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:33: ( '0' .. '9' )
            	    // org/jf/smali/expectedTokensTestGrammar.g:139:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOKEN_NAME"

    // $ANTLR start "WHITE_SPACE"
    public final void mWHITE_SPACE() throws RecognitionException {
        try {
            int _type = WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/jf/smali/expectedTokensTestGrammar.g:142:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // org/jf/smali/expectedTokensTestGrammar.g:142:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // org/jf/smali/expectedTokensTestGrammar.g:142:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITE_SPACE"

    public void mTokens() throws RecognitionException {
        // org/jf/smali/expectedTokensTestGrammar.g:1:8: ( T__11 | T__12 | STRING_LITERAL | TOKEN_NAME | WHITE_SPACE )
        int alt6=5;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt6=1;
            }
            break;
        case ')':
            {
            alt6=2;
            }
            break;
        case '\"':
            {
            alt6=3;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=4;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // org/jf/smali/expectedTokensTestGrammar.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // org/jf/smali/expectedTokensTestGrammar.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // org/jf/smali/expectedTokensTestGrammar.g:1:22: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 4 :
                // org/jf/smali/expectedTokensTestGrammar.g:1:37: TOKEN_NAME
                {
                mTOKEN_NAME(); 

                }
                break;
            case 5 :
                // org/jf/smali/expectedTokensTestGrammar.g:1:48: WHITE_SPACE
                {
                mWHITE_SPACE(); 

                }
                break;

        }

    }


 

}