// $ANTLR 3.2 Sep 23, 2009 14:05:07 org/jf/smali/expectedTokensTestGrammar.g 2011-03-15 14:34:45

package org.jf.smali;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class expectedTokensTestGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "HEX_DIGIT", "HEX_DIGITS", "ESCAPE_SEQUENCE", "BASE_STRING_LITERAL", "STRING_LITERAL", "TOKEN_NAME", "WHITE_SPACE", "'('", "')'"
    };
    public static final int ESCAPE_SEQUENCE=6;
    public static final int STRING_LITERAL=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int BASE_STRING_LITERAL=7;
    public static final int TOKEN_NAME=9;
    public static final int HEX_DIGIT=4;
    public static final int HEX_DIGITS=5;
    public static final int EOF=-1;
    public static final int WHITE_SPACE=10;

    // delegates
    // delegators


        public expectedTokensTestGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public expectedTokensTestGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return expectedTokensTestGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "org/jf/smali/expectedTokensTestGrammar.g"; }


    	public static class ExpectedToken {
    		public final String tokenName;
    		public final String tokenText;
    		
    		public ExpectedToken(String tokenName, String tokenText) {
    			this.tokenName = tokenName;
    			this.tokenText = tokenText;
    		}
    		
    		public ExpectedToken(String tokenName) {
    			this.tokenName = tokenName;
    			this.tokenText = null;
    		}
    	}

    	private final ArrayList<ExpectedToken> expectedTokens = new ArrayList<ExpectedToken>();
    	
    	public List<ExpectedToken> getExpectedTokens() {
    		return Collections.unmodifiableList(expectedTokens);
    	}



    // $ANTLR start "top"
    // org/jf/smali/expectedTokensTestGrammar.g:144:1: top : ( token )* ;
    public final void top() throws RecognitionException {
        try {
            // org/jf/smali/expectedTokensTestGrammar.g:144:5: ( ( token )* )
            // org/jf/smali/expectedTokensTestGrammar.g:144:7: ( token )*
            {
            // org/jf/smali/expectedTokensTestGrammar.g:144:7: ( token )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case TOKEN_NAME:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/jf/smali/expectedTokensTestGrammar.g:144:7: token
            	    {
            	    pushFollow(FOLLOW_token_in_top305);
            	    token();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "top"


    // $ANTLR start "token"
    // org/jf/smali/expectedTokensTestGrammar.g:146:1: token : ( TOKEN_NAME ( '(' STRING_LITERAL ')' ) | TOKEN_NAME );
    public final void token() throws RecognitionException {
        Token TOKEN_NAME1=null;
        Token STRING_LITERAL2=null;
        Token TOKEN_NAME3=null;

        try {
            // org/jf/smali/expectedTokensTestGrammar.g:146:7: ( TOKEN_NAME ( '(' STRING_LITERAL ')' ) | TOKEN_NAME )
            int alt2=2;
            switch ( input.LA(1) ) {
            case TOKEN_NAME:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case TOKEN_NAME:
                    {
                    alt2=2;
                    }
                    break;
                case 11:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // org/jf/smali/expectedTokensTestGrammar.g:146:9: TOKEN_NAME ( '(' STRING_LITERAL ')' )
                    {
                    TOKEN_NAME1=(Token)match(input,TOKEN_NAME,FOLLOW_TOKEN_NAME_in_token314); 
                    // org/jf/smali/expectedTokensTestGrammar.g:146:20: ( '(' STRING_LITERAL ')' )
                    // org/jf/smali/expectedTokensTestGrammar.g:146:22: '(' STRING_LITERAL ')'
                    {
                    match(input,11,FOLLOW_11_in_token318); 
                    STRING_LITERAL2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_token320); 
                    match(input,12,FOLLOW_12_in_token322); 

                    }


                    			expectedTokens.add(new ExpectedToken(TOKEN_NAME1.getText(), STRING_LITERAL2.getText()));
                    		

                    }
                    break;
                case 2 :
                    // org/jf/smali/expectedTokensTestGrammar.g:150:3: TOKEN_NAME
                    {
                    TOKEN_NAME3=(Token)match(input,TOKEN_NAME,FOLLOW_TOKEN_NAME_in_token334); 

                    			expectedTokens.add(new ExpectedToken(TOKEN_NAME3.getText()));
                    		

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "token"

    // Delegated rules


 

    public static final BitSet FOLLOW_token_in_top305 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TOKEN_NAME_in_token314 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_token318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_token320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_token322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_NAME_in_token334 = new BitSet(new long[]{0x0000000000000002L});

}