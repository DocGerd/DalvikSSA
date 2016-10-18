// $ANTLR 3.2 Sep 23, 2009 14:05:07 org/jf/smali/smaliParser.g 2011-03-15 14:34:40

package org.jf.smali;

import org.jf.dexlib.Code.Format.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class smaliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DIRECTIVE", "SUPER_DIRECTIVE", "IMPLEMENTS_DIRECTIVE", "SOURCE_DIRECTIVE", "FIELD_DIRECTIVE", "END_FIELD_DIRECTIVE", "SUBANNOTATION_DIRECTIVE", "END_SUBANNOTATION_DIRECTIVE", "ANNOTATION_DIRECTIVE", "END_ANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "METHOD_DIRECTIVE", "END_METHOD_DIRECTIVE", "REGISTERS_DIRECTIVE", "LOCALS_DIRECTIVE", "ARRAY_DATA_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", "PACKED_SWITCH_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", "CATCH_DIRECTIVE", "CATCHALL_DIRECTIVE", "LINE_DIRECTIVE", "PARAMETER_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "LOCAL_DIRECTIVE", "END_LOCAL_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "PROLOGUE_DIRECTIVE", "EPILOGUE_DIRECTIVE", "HEX_PREFIX", "HEX_DIGIT", "BASE_INTEGER", "DECIMAL_EXPONENT", "BINARY_EXPONENT", "HEX_DIGITS", "BASE_FLOAT_OR_ID", "BASE_FLOAT", "ESCAPE_SEQUENCE", "POSITIVE_INTEGER_LITERAL", "NEGATIVE_INTEGER_LITERAL", "LONG_LITERAL", "SHORT_LITERAL", "BYTE_LITERAL", "FLOAT_LITERAL_OR_ID", "DOUBLE_LITERAL_OR_ID", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BOOL_LITERAL", "NULL_LITERAL", "BASE_STRING_LITERAL", "STRING_LITERAL", "BASE_CHAR_LITERAL", "CHAR_LITERAL", "REGISTER", "ANNOTATION_VISIBILITY", "ACCESS_SPEC", "VTABLE_OFFSET", "FIELD_OFFSET", "OFFSET", "LINE_COMMENT", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT12x", "INSTRUCTION_FORMAT20t", "INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", "INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21h", "INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", "INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", "INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", "INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", "INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_TYPE", "INSTRUCTION_FORMAT35s_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT51l", "BASE_SIMPLE_NAME", "BASE_PRIMITIVE_TYPE", "BASE_CLASS_DESCRIPTOR", "BASE_ARRAY_DESCRIPTOR", "BASE_TYPE", "PRIMITIVE_TYPE", "VOID_TYPE", "CLASS_DESCRIPTOR", "ARRAY_DESCRIPTOR", "PARAM_LIST_OR_ID", "PARAM_LIST", "SIMPLE_NAME", "METHOD_NAME", "DOTDOT", "ARROW", "EQUAL", "COLON", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "WHITE_SPACE", "I_CLASS_DEF", "I_SUPER", "I_IMPLEMENTS", "I_SOURCE", "I_ACCESS_LIST", "I_METHODS", "I_FIELDS", "I_FIELD", "I_FIELD_TYPE", "I_FIELD_INITIAL_VALUE", "I_METHOD", "I_METHOD_PROTOTYPE", "I_METHOD_RETURN_TYPE", "I_REGISTERS", "I_LOCALS", "I_LABELS", "I_LABEL", "I_ANNOTATIONS", "I_ANNOTATION", "I_ANNOTATION_ELEMENT", "I_SUBANNOTATION", "I_ENCODED_FIELD", "I_ENCODED_METHOD", "I_ENCODED_ENUM", "I_ENCODED_ARRAY", "I_ARRAY_ELEMENT_SIZE", "I_ARRAY_ELEMENTS", "I_PACKED_SWITCH_START_KEY", "I_PACKED_SWITCH_TARGET_COUNT", "I_PACKED_SWITCH_TARGETS", "I_PACKED_SWITCH_DECLARATION", "I_PACKED_SWITCH_DECLARATIONS", "I_SPARSE_SWITCH_KEYS", "I_SPARSE_SWITCH_TARGET_COUNT", "I_SPARSE_SWITCH_TARGETS", "I_SPARSE_SWITCH_DECLARATION", "I_SPARSE_SWITCH_DECLARATIONS", "I_ADDRESS", "I_CATCH", "I_CATCHALL", "I_CATCHES", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", "I_ORDERED_DEBUG_DIRECTIVES", "I_LINE", "I_LOCAL", "I_END_LOCAL", "I_RESTART_LOCAL", "I_PROLOGUE", "I_EPILOGUE", "I_STATEMENTS", "I_STATEMENT_FORMAT10t", "I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", "I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20t", "I_STATEMENT_FORMAT21c_TYPE", "I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21h", "I_STATEMENT_FORMAT21s", "I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", "I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", "I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", "I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", "I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", "I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT51l", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", "I_REGISTER_RANGE", "I_REGISTER_LIST", "LABEL", "INTEGER_LITERAL", "INVALID_TOKEN"
    };
    public static final int I_REGISTER_LIST=212;
    public static final int I_STATEMENT_FORMAT51l=207;
    public static final int SPARSE_SWITCH_DIRECTIVE=23;
    public static final int END_PARAMETER_DIRECTIVE=29;
    public static final int I_ORDERED_DEBUG_DIRECTIVES=171;
    public static final int BINARY_EXPONENT=39;
    public static final int INSTRUCTION_FORMAT11x=69;
    public static final int ANNOTATION_VISIBILITY=60;
    public static final int INVALID_TOKEN=215;
    public static final int END_SUBANNOTATION_DIRECTIVE=11;
    public static final int HEX_PREFIX=35;
    public static final int EOF=-1;
    public static final int I_STATEMENT_FORMAT12x=183;
    public static final int I_METHOD=137;
    public static final int I_SUBANNOTATION=147;
    public static final int INSTRUCTION_FORMAT11n=68;
    public static final int I_SPARSE_SWITCH_TARGETS=161;
    public static final int I_PACKED_SWITCH_TARGET_COUNT=155;
    public static final int STRING_LITERAL=56;
    public static final int SHORT_LITERAL=47;
    public static final int I_FIELD_INITIAL_VALUE=136;
    public static final int INSTRUCTION_FORMAT10x=67;
    public static final int I_PACKED_SWITCH_DECLARATION=157;
    public static final int I_SUPER=128;
    public static final int I_STATEMENT_FORMAT11n=181;
    public static final int INSTRUCTION_FORMAT10t=66;
    public static final int NEGATIVE_INTEGER_LITERAL=45;
    public static final int REGISTER=59;
    public static final int INSTRUCTION_FORMAT21c_TYPE=76;
    public static final int I_STATEMENT_FORMAT11x=182;
    public static final int LOCAL_DIRECTIVE=30;
    public static final int I_LINE=172;
    public static final int LOCALS_DIRECTIVE=18;
    public static final int I_CATCHALL=166;
    public static final int INSTRUCTION_FORMAT35c_TYPE=97;
    public static final int INSTRUCTION_FORMAT31i_OR_ID=92;
    public static final int I_PARAMETERS=169;
    public static final int I_METHOD_RETURN_TYPE=139;
    public static final int INSTRUCTION_FORMAT51l=103;
    public static final int ENUM_DIRECTIVE=14;
    public static final int REGISTERS_DIRECTIVE=17;
    public static final int NULL_LITERAL=54;
    public static final int BASE_SIMPLE_NAME=104;
    public static final int END_ARRAY_DATA_DIRECTIVE=20;
    public static final int I_STATEMENT_FORMAT21c_FIELD=186;
    public static final int I_METHOD_PROTOTYPE=138;
    public static final int EPILOGUE_DIRECTIVE=34;
    public static final int I_LOCALS=141;
    public static final int RESTART_LOCAL_DIRECTIVE=32;
    public static final int I_ENCODED_ARRAY=151;
    public static final int POSITIVE_INTEGER_LITERAL=44;
    public static final int BASE_PRIMITIVE_TYPE=105;
    public static final int CATCH_DIRECTIVE=25;
    public static final int I_CATCH=165;
    public static final int I_PARAMETER_NOT_SPECIFIED=170;
    public static final int INSTRUCTION_FORMAT21h=77;
    public static final int I_ANNOTATION=145;
    public static final int INSTRUCTION_FORMAT21s=78;
    public static final int INSTRUCTION_FORMAT21t=79;
    public static final int WHITE_SPACE=126;
    public static final int INSTRUCTION_FORMAT22b=80;
    public static final int INSTRUCTION_FORMAT20t=72;
    public static final int OFFSET=64;
    public static final int FLOAT_LITERAL_OR_ID=49;
    public static final int I_PACKED_SWITCH_START_KEY=154;
    public static final int I_ACCESS_LIST=131;
    public static final int I_REGISTERS=140;
    public static final int IMPLEMENTS_DIRECTIVE=6;
    public static final int SOURCE_DIRECTIVE=7;
    public static final int CLASS_DIRECTIVE=4;
    public static final int BASE_CHAR_LITERAL=57;
    public static final int I_STATEMENT_FORMAT35c_METHOD=203;
    public static final int I_STATEMENT_SPARSE_SWITCH=210;
    public static final int BASE_STRING_LITERAL=55;
    public static final int INSTRUCTION_FORMAT23x=89;
    public static final int OPEN_PAREN=124;
    public static final int HEX_DIGIT=36;
    public static final int END_PACKED_SWITCH_DIRECTIVE=22;
    public static final int CLOSE_BRACE=123;
    public static final int I_EPILOGUE=177;
    public static final int LONG_LITERAL=46;
    public static final int I_METHODS=132;
    public static final int INSTRUCTION_FORMAT22c_FIELD=81;
    public static final int END_FIELD_DIRECTIVE=9;
    public static final int ACCESS_SPEC=61;
    public static final int I_IMPLEMENTS=129;
    public static final int COLON=120;
    public static final int I_STATEMENT_FORMAT23x=197;
    public static final int INSTRUCTION_FORMAT35ms_METHOD=99;
    public static final int CHAR_LITERAL=58;
    public static final int INSTRUCTION_FORMAT22s=86;
    public static final int VOID_TYPE=110;
    public static final int INSTRUCTION_FORMAT22t=87;
    public static final int CLASS_DESCRIPTOR=111;
    public static final int ARROW=118;
    public static final int INSTRUCTION_FORMAT22x=88;
    public static final int VTABLE_OFFSET=62;
    public static final int INSTRUCTION_FORMAT12x=71;
    public static final int I_LOCAL=173;
    public static final int I_REGISTER_RANGE=211;
    public static final int INSTRUCTION_FORMAT32x=95;
    public static final int I_STATEMENT_FORMAT22b=191;
    public static final int ANNOTATION_DIRECTIVE=12;
    public static final int END_ANNOTATION_DIRECTIVE=13;
    public static final int I_SPARSE_SWITCH_TARGET_COUNT=160;
    public static final int DOUBLE_LITERAL=52;
    public static final int I_STATEMENT_FORMAT22s=194;
    public static final int I_STATEMENT_FORMAT22t=195;
    public static final int I_STATEMENT_FORMAT32x=202;
    public static final int END_LOCAL_DIRECTIVE=31;
    public static final int BASE_FLOAT_OR_ID=41;
    public static final int BASE_INTEGER=37;
    public static final int I_STATEMENT_FORMAT22x=196;
    public static final int I_STATEMENT_FORMAT21c_STRING=187;
    public static final int INSTRUCTION_FORMAT12x_OR_ID=70;
    public static final int I_STATEMENT_FORMAT31c=199;
    public static final int I_STATEMENT_FORMAT31i=200;
    public static final int INSTRUCTION_FORMAT35s_METHOD=98;
    public static final int I_STATEMENT_FORMAT21h=188;
    public static final int I_ANNOTATIONS=144;
    public static final int PRIMITIVE_TYPE=109;
    public static final int CATCHALL_DIRECTIVE=26;
    public static final int I_STATEMENT_FORMAT21s=189;
    public static final int DOUBLE_LITERAL_OR_ID=50;
    public static final int I_STATEMENT_FORMAT31t=201;
    public static final int I_SOURCE=130;
    public static final int CLOSE_PAREN=125;
    public static final int I_SPARSE_SWITCH_DECLARATIONS=163;
    public static final int ARRAY_DESCRIPTOR=112;
    public static final int I_ADDRESS=164;
    public static final int I_STATEMENT_FORMAT21t=190;
    public static final int I_STATEMENTS=178;
    public static final int SUBANNOTATION_DIRECTIVE=10;
    public static final int INSTRUCTION_FORMAT31c=91;
    public static final int LINE_COMMENT=65;
    public static final int I_PARAMETER=168;
    public static final int I_ARRAY_ELEMENTS=153;
    public static final int I_SPARSE_SWITCH_DECLARATION=162;
    public static final int INSTRUCTION_FORMAT30t=90;
    public static final int BOOL_LITERAL=53;
    public static final int I_STATEMENT_FORMAT21c_TYPE=185;
    public static final int I_STATEMENT_FORMAT20t=184;
    public static final int I_STATEMENT_FORMAT3rc_TYPE=206;
    public static final int BASE_FLOAT=42;
    public static final int METHOD_NAME=116;
    public static final int I_ANNOTATION_ELEMENT=146;
    public static final int PACKED_SWITCH_DIRECTIVE=21;
    public static final int PARAMETER_DIRECTIVE=28;
    public static final int ARRAY_DATA_DIRECTIVE=19;
    public static final int DECIMAL_EXPONENT=38;
    public static final int INTEGER_LITERAL=214;
    public static final int PROLOGUE_DIRECTIVE=33;
    public static final int I_SPARSE_SWITCH_KEYS=159;
    public static final int INSTRUCTION_FORMAT31t=94;
    public static final int I_RESTART_LOCAL=175;
    public static final int INSTRUCTION_FORMAT31i=93;
    public static final int METHOD_DIRECTIVE=15;
    public static final int I_ENCODED_FIELD=148;
    public static final int INSTRUCTION_FORMAT22c_TYPE=83;
    public static final int INSTRUCTION_FORMAT35c_METHOD=96;
    public static final int I_END_LOCAL=174;
    public static final int INSTRUCTION_FORMAT3rc_METHOD=100;
    public static final int BASE_ARRAY_DESCRIPTOR=107;
    public static final int INSTRUCTION_FORMAT22s_OR_ID=85;
    public static final int I_CATCHES=167;
    public static final int SUPER_DIRECTIVE=5;
    public static final int DOTDOT=117;
    public static final int END_SPARSE_SWITCH_DIRECTIVE=24;
    public static final int I_ENCODED_METHOD=149;
    public static final int INSTRUCTION_FORMAT21c_FIELD=73;
    public static final int I_ARRAY_ELEMENT_SIZE=152;
    public static final int I_FIELDS=133;
    public static final int I_LABELS=142;
    public static final int ESCAPE_SEQUENCE=43;
    public static final int I_STATEMENT_FORMAT35c_TYPE=204;
    public static final int BYTE_LITERAL=48;
    public static final int COMMA=121;
    public static final int I_CLASS_DEF=127;
    public static final int EQUAL=119;
    public static final int PARAM_LIST_OR_ID=113;
    public static final int I_FIELD=134;
    public static final int I_STATEMENT_PACKED_SWITCH=209;
    public static final int I_STATEMENT_FORMAT22c_FIELD=192;
    public static final int FIELD_OFFSET=63;
    public static final int FIELD_DIRECTIVE=8;
    public static final int INSTRUCTION_FORMAT3rc_TYPE=101;
    public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=74;
    public static final int I_STATEMENT_FORMAT10x=180;
    public static final int I_LABEL=143;
    public static final int I_STATEMENT_ARRAY_DATA=208;
    public static final int END_METHOD_DIRECTIVE=16;
    public static final int I_STATEMENT_FORMAT10t=179;
    public static final int I_PROLOGUE=176;
    public static final int I_ENCODED_ENUM=150;
    public static final int I_PACKED_SWITCH_DECLARATIONS=158;
    public static final int I_STATEMENT_FORMAT30t=198;
    public static final int I_FIELD_TYPE=135;
    public static final int FLOAT_LITERAL=51;
    public static final int INSTRUCTION_FORMAT21c_STRING=75;
    public static final int SIMPLE_NAME=115;
    public static final int PARAM_LIST=114;
    public static final int I_PACKED_SWITCH_TARGETS=156;
    public static final int BASE_CLASS_DESCRIPTOR=106;
    public static final int LINE_DIRECTIVE=27;
    public static final int INSTRUCTION_FORMAT22cs_FIELD=84;
    public static final int LABEL=213;
    public static final int BASE_TYPE=108;
    public static final int I_STATEMENT_FORMAT3rc_METHOD=205;
    public static final int HEX_DIGITS=40;
    public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=82;
    public static final int INSTRUCTION_FORMAT3rms_METHOD=102;
    public static final int OPEN_BRACE=122;
    public static final int I_STATEMENT_FORMAT22c_TYPE=193;

    // delegates
    // delegators


        public smaliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public smaliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return smaliParser.tokenNames; }
    public String getGrammarFileName() { return "org/jf/smali/smaliParser.g"; }


    	private boolean verboseErrors = false;

    	public void setVerboseErrors(boolean verboseErrors) {
    		this.verboseErrors = verboseErrors;
    	}

    	public String getErrorMessage(RecognitionException e,
    		String[] tokenNames) {

    		if (verboseErrors) {
    			List stack = getRuleInvocationStack(e, this.getClass().getName());
    			String msg = null;

    			if (e instanceof NoViableAltException) {
    				NoViableAltException nvae = (NoViableAltException)e;
    				msg = " no viable alt; token="+getTokenErrorDisplay(e.token)+
    				" (decision="+nvae.decisionNumber+
    				" state "+nvae.stateNumber+")"+
    				" decision=<<"+nvae.grammarDecisionDescription+">>";
    			} else {
    				msg = super.getErrorMessage(e, tokenNames);
    			}

    			return stack + " " + msg;
    		} else {
    			return super.getErrorMessage(e, tokenNames);
    		}
    	}

    	public String getTokenErrorDisplay(Token t) {
    		if (!verboseErrors) {
    			String s = t.getText();
    			if ( s==null ) {
    				if ( t.getType()==Token.EOF ) {
    					s = "<EOF>";
    				}
    				else {
    					s = "<"+tokenNames[t.getType()]+">";
    				}
    			}
    			s = s.replaceAll("\n","\\\\n");
    			s = s.replaceAll("\r","\\\\r");
    			s = s.replaceAll("\t","\\\\t");
    			return "'"+s+"'";
    		}

    		CommonToken ct = (CommonToken)t;

    		String channelStr = "";
    		if (t.getChannel()>0) {
    			channelStr=",channel="+t.getChannel();
    		}
    		String txt = t.getText();
    		if ( txt!=null ) {
    			txt = txt.replaceAll("\n","\\\\n");
    			txt = txt.replaceAll("\r","\\\\r");
    			txt = txt.replaceAll("\t","\\\\t");
    		}
    		else {
    			txt = "<no text>";
    		}
    		return "[@"+t.getTokenIndex()+","+ct.getStartIndex()+":"+ct.getStopIndex()+"='"+txt+"',<"+tokenNames[t.getType()]+">"+channelStr+","+t.getLine()+":"+t.getCharPositionInLine()+"]";
    	}

    	public String getErrorHeader(RecognitionException e) {
    		return getSourceName()+"["+ e.line+","+e.charPositionInLine+"]";
    	}

    	private CommonTree buildTree(int type, String text, List<CommonTree> children) {
    		CommonTree root = new CommonTree(new CommonToken(type, text));
    		for (CommonTree child: children) {
    			root.addChild(child);
    		}
    		return root;
    	}

    	private CommonToken getParamListSubToken(CommonToken baseToken, String str, int typeStartIndex) {
    		CommonToken token = new CommonToken(baseToken);
    		token.setStartIndex(baseToken.getStartIndex() + typeStartIndex);

    		switch (str.charAt(typeStartIndex)) {
    			case 'Z':
    			case 'B':
    			case 'S':
    			case 'C':
    			case 'I':
    			case 'J':
    			case 'F':
    			case 'D':
    			{
    				token.setType(PRIMITIVE_TYPE);
    				token.setText(str.substring(typeStartIndex, typeStartIndex+1));
    				token.setStopIndex(baseToken.getStartIndex() + typeStartIndex);
    				break;
    			}
    			case 'L':
    			{
    				int i = typeStartIndex;
    				while (str.charAt(++i) != ';');

    				token.setType(CLASS_DESCRIPTOR);
    				token.setText(str.substring(typeStartIndex, i + 1));
    				token.setStopIndex(baseToken.getStartIndex() + i);
    				break;
    			}
    			case '[':
    			{
    				int i = typeStartIndex;
        				while (str.charAt(++i) == '[');

        				if (str.charAt(i++) == 'L') {
        				    while (str.charAt(i++) != ';');
    				}

        				token.setType(ARRAY_DESCRIPTOR);
        				token.setText(str.substring(typeStartIndex, i));
        				token.setStopIndex(baseToken.getStartIndex() + i - 1);
        				break;
    			}
    			default:
    				throw new RuntimeException(String.format("Invalid character '%c' in param list \"%s\" at position %d", str.charAt(typeStartIndex), str, typeStartIndex));
    		}

    		return token;
    	}

    	private CommonTree parseParamList(CommonToken paramListToken) {
    		String paramList = paramListToken.getText();
    		CommonTree root = new CommonTree();

    		int startIndex = paramListToken.getStartIndex();

    		int i=0;
    		while (i<paramList.length()) {
    			CommonToken token = getParamListSubToken(paramListToken, paramList, i);
    			root.addChild(new CommonTree(token));
    			i += token.getText().length();
    		}

    		if (root.getChildCount() == 0) {
    			return null;
    		}
    		return root;
    	}

    	private void throwOdexedInstructionException(IntStream input, String odexedInstruction)
    			throws OdexedInstructionException {
    		/*this has to be done in a separate method, otherwise java will complain about the
    		auto-generated code in the rule after the throw not being reachable*/
    		throw new OdexedInstructionException(input, odexedInstruction);
    	}


    protected static class smali_file_scope {
        boolean hasClassSpec;
        boolean hasSuperSpec;
        boolean hasSourceSpec;
        List<CommonTree> classAnnotations;
    }
    protected Stack smali_file_stack = new Stack();

    public static class smali_file_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "smali_file"
    // org/jf/smali/smaliParser.g:293:1: smali_file : ({...}? => class_spec | {...}? => super_spec | implements_spec | {...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) ;
    public final smaliParser.smali_file_return smali_file() throws RecognitionException {
        smali_file_stack.push(new smali_file_scope());
        smaliParser.smali_file_return retval = new smaliParser.smali_file_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF8=null;
        smaliParser.class_spec_return class_spec1 = null;

        smaliParser.super_spec_return super_spec2 = null;

        smaliParser.implements_spec_return implements_spec3 = null;

        smaliParser.source_spec_return source_spec4 = null;

        smaliParser.method_return method5 = null;

        smaliParser.field_return field6 = null;

        smaliParser.annotation_return annotation7 = null;


        CommonTree EOF8_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_super_spec=new RewriteRuleSubtreeStream(adaptor,"rule super_spec");
        RewriteRuleSubtreeStream stream_implements_spec=new RewriteRuleSubtreeStream(adaptor,"rule implements_spec");
        RewriteRuleSubtreeStream stream_source_spec=new RewriteRuleSubtreeStream(adaptor,"rule source_spec");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_class_spec=new RewriteRuleSubtreeStream(adaptor,"rule class_spec");
        	((smali_file_scope)smali_file_stack.peek()).hasClassSpec = ((smali_file_scope)smali_file_stack.peek()).hasSuperSpec = ((smali_file_scope)smali_file_stack.peek()).hasSourceSpec = false;
        		((smali_file_scope)smali_file_stack.peek()).classAnnotations = new ArrayList<CommonTree>();
        	
        try {
            // org/jf/smali/smaliParser.g:305:2: ( ({...}? => class_spec | {...}? => super_spec | implements_spec | {...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) )
            // org/jf/smali/smaliParser.g:306:2: ({...}? => class_spec | {...}? => super_spec | implements_spec | {...}? => source_spec | method | field | annotation )+ EOF
            {
            // org/jf/smali/smaliParser.g:306:2: ({...}? => class_spec | {...}? => super_spec | implements_spec | {...}? => source_spec | method | field | annotation )+
            int cnt1=0;
            loop1:
            do {
                int alt1=8;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASS_DIRECTIVE) && ((!((smali_file_scope)smali_file_stack.peek()).hasClassSpec))) {
                    alt1=1;
                }
                else if ( (LA1_0==SUPER_DIRECTIVE) && ((!((smali_file_scope)smali_file_stack.peek()).hasSuperSpec))) {
                    alt1=2;
                }
                else if ( (LA1_0==IMPLEMENTS_DIRECTIVE) ) {
                    alt1=3;
                }
                else if ( (LA1_0==SOURCE_DIRECTIVE) && ((!((smali_file_scope)smali_file_stack.peek()).hasSourceSpec))) {
                    alt1=4;
                }
                else if ( (LA1_0==METHOD_DIRECTIVE) ) {
                    alt1=5;
                }
                else if ( (LA1_0==FIELD_DIRECTIVE) ) {
                    alt1=6;
                }
                else if ( (LA1_0==ANNOTATION_DIRECTIVE) ) {
                    alt1=7;
                }


                switch (alt1) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:306:4: {...}? => class_spec
            	    {
            	    if ( !((!((smali_file_scope)smali_file_stack.peek()).hasClassSpec)) ) {
            	        throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasClassSpec");
            	    }
            	    pushFollow(FOLLOW_class_spec_in_smali_file436);
            	    class_spec1=class_spec();

            	    state._fsp--;

            	    stream_class_spec.add(class_spec1.getTree());
            	    ((smali_file_scope)smali_file_stack.peek()).hasClassSpec = true;

            	    }
            	    break;
            	case 2 :
            	    // org/jf/smali/smaliParser.g:307:4: {...}? => super_spec
            	    {
            	    if ( !((!((smali_file_scope)smali_file_stack.peek()).hasSuperSpec)) ) {
            	        throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSuperSpec");
            	    }
            	    pushFollow(FOLLOW_super_spec_in_smali_file446);
            	    super_spec2=super_spec();

            	    state._fsp--;

            	    stream_super_spec.add(super_spec2.getTree());
            	    ((smali_file_scope)smali_file_stack.peek()).hasSuperSpec = true;

            	    }
            	    break;
            	case 3 :
            	    // org/jf/smali/smaliParser.g:308:4: implements_spec
            	    {
            	    pushFollow(FOLLOW_implements_spec_in_smali_file453);
            	    implements_spec3=implements_spec();

            	    state._fsp--;

            	    stream_implements_spec.add(implements_spec3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // org/jf/smali/smaliParser.g:309:4: {...}? => source_spec
            	    {
            	    if ( !((!((smali_file_scope)smali_file_stack.peek()).hasSourceSpec)) ) {
            	        throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSourceSpec");
            	    }
            	    pushFollow(FOLLOW_source_spec_in_smali_file461);
            	    source_spec4=source_spec();

            	    state._fsp--;

            	    stream_source_spec.add(source_spec4.getTree());
            	    ((smali_file_scope)smali_file_stack.peek()).hasSourceSpec = true;

            	    }
            	    break;
            	case 5 :
            	    // org/jf/smali/smaliParser.g:310:4: method
            	    {
            	    pushFollow(FOLLOW_method_in_smali_file468);
            	    method5=method();

            	    state._fsp--;

            	    stream_method.add(method5.getTree());

            	    }
            	    break;
            	case 6 :
            	    // org/jf/smali/smaliParser.g:311:4: field
            	    {
            	    pushFollow(FOLLOW_field_in_smali_file473);
            	    field6=field();

            	    state._fsp--;

            	    stream_field.add(field6.getTree());

            	    }
            	    break;
            	case 7 :
            	    // org/jf/smali/smaliParser.g:312:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_smali_file478);
            	    annotation7=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation7.getTree());
            	    ((smali_file_scope)smali_file_stack.peek()).classAnnotations.add((annotation7!=null?((CommonTree)annotation7.tree):null));

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_smali_file487);  
            stream_EOF.add(EOF8);


            		if (!((smali_file_scope)smali_file_stack.peek()).hasClassSpec) {
            			throw new SemanticException(input, "The file must contain a .class directive");
            		}

            		if (!((smali_file_scope)smali_file_stack.peek()).hasSuperSpec) {
            			if (!(class_spec1!=null?class_spec1.className:null).equals("Ljava/lang/Object;")) {
            				throw new SemanticException(input, "The file must contain a .super directive");
            			}
            		}
            	


            // AST REWRITE
            // elements: class_spec, field, source_spec, method, implements_spec, super_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 326:2: -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
            {
                // org/jf/smali/smaliParser.g:326:5: ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CLASS_DEF, "I_CLASS_DEF"), root_1);

                adaptor.addChild(root_1, stream_class_spec.nextTree());
                // org/jf/smali/smaliParser.g:328:4: ( super_spec )?
                if ( stream_super_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_super_spec.nextTree());

                }
                stream_super_spec.reset();
                // org/jf/smali/smaliParser.g:329:4: ( implements_spec )*
                while ( stream_implements_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_implements_spec.nextTree());

                }
                stream_implements_spec.reset();
                // org/jf/smali/smaliParser.g:330:4: ( source_spec )?
                if ( stream_source_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_source_spec.nextTree());

                }
                stream_source_spec.reset();
                // org/jf/smali/smaliParser.g:331:4: ^( I_METHODS ( method )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHODS, "I_METHODS"), root_2);

                // org/jf/smali/smaliParser.g:331:16: ( method )*
                while ( stream_method.hasNext() ) {
                    adaptor.addChild(root_2, stream_method.nextTree());

                }
                stream_method.reset();

                adaptor.addChild(root_1, root_2);
                }
                // org/jf/smali/smaliParser.g:331:25: ^( I_FIELDS ( field )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELDS, "I_FIELDS"), root_2);

                // org/jf/smali/smaliParser.g:331:36: ( field )*
                while ( stream_field.hasNext() ) {
                    adaptor.addChild(root_2, stream_field.nextTree());

                }
                stream_field.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", ((smali_file_scope)smali_file_stack.peek()).classAnnotations));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            smali_file_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "smali_file"

    public static class class_spec_return extends ParserRuleReturnScope {
        public String className;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_spec"
    // org/jf/smali/smaliParser.g:333:1: class_spec returns [String className] : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list ;
    public final smaliParser.class_spec_return class_spec() throws RecognitionException {
        smaliParser.class_spec_return retval = new smaliParser.class_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS_DIRECTIVE9=null;
        Token CLASS_DESCRIPTOR11=null;
        smaliParser.access_list_return access_list10 = null;


        CommonTree CLASS_DIRECTIVE9_tree=null;
        CommonTree CLASS_DESCRIPTOR11_tree=null;
        RewriteRuleTokenStream stream_CLASS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CLASS_DIRECTIVE");
        RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
        RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
        try {
            // org/jf/smali/smaliParser.g:334:2: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list )
            // org/jf/smali/smaliParser.g:334:4: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
            {
            CLASS_DIRECTIVE9=(Token)match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec551);  
            stream_CLASS_DIRECTIVE.add(CLASS_DIRECTIVE9);

            pushFollow(FOLLOW_access_list_in_class_spec553);
            access_list10=access_list();

            state._fsp--;

            stream_access_list.add(access_list10.getTree());
            CLASS_DESCRIPTOR11=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec555);  
            stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR11);

            retval.className = (CLASS_DESCRIPTOR11!=null?CLASS_DESCRIPTOR11.getText():null);


            // AST REWRITE
            // elements: CLASS_DESCRIPTOR, access_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 334:88: -> CLASS_DESCRIPTOR access_list
            {
                adaptor.addChild(root_0, stream_CLASS_DESCRIPTOR.nextNode());
                adaptor.addChild(root_0, stream_access_list.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_spec"

    public static class super_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "super_spec"
    // org/jf/smali/smaliParser.g:336:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) ;
    public final smaliParser.super_spec_return super_spec() throws RecognitionException {
        smaliParser.super_spec_return retval = new smaliParser.super_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SUPER_DIRECTIVE12=null;
        Token CLASS_DESCRIPTOR13=null;

        CommonTree SUPER_DIRECTIVE12_tree=null;
        CommonTree CLASS_DESCRIPTOR13_tree=null;
        RewriteRuleTokenStream stream_SUPER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUPER_DIRECTIVE");
        RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");

        try {
            // org/jf/smali/smaliParser.g:337:2: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) )
            // org/jf/smali/smaliParser.g:337:4: SUPER_DIRECTIVE CLASS_DESCRIPTOR
            {
            SUPER_DIRECTIVE12=(Token)match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec572);  
            stream_SUPER_DIRECTIVE.add(SUPER_DIRECTIVE12);

            CLASS_DESCRIPTOR13=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec574);  
            stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR13);



            // AST REWRITE
            // elements: CLASS_DESCRIPTOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:37: -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
            {
                // org/jf/smali/smaliParser.g:337:40: ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUPER, ((Token)retval.start), "I_SUPER"), root_1);

                adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "super_spec"

    public static class implements_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implements_spec"
    // org/jf/smali/smaliParser.g:339:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) ;
    public final smaliParser.implements_spec_return implements_spec() throws RecognitionException {
        smaliParser.implements_spec_return retval = new smaliParser.implements_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPLEMENTS_DIRECTIVE14=null;
        Token CLASS_DESCRIPTOR15=null;

        CommonTree IMPLEMENTS_DIRECTIVE14_tree=null;
        CommonTree CLASS_DESCRIPTOR15_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS_DIRECTIVE");
        RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");

        try {
            // org/jf/smali/smaliParser.g:340:2: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) )
            // org/jf/smali/smaliParser.g:340:4: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
            {
            IMPLEMENTS_DIRECTIVE14=(Token)match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec592);  
            stream_IMPLEMENTS_DIRECTIVE.add(IMPLEMENTS_DIRECTIVE14);

            CLASS_DESCRIPTOR15=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec594);  
            stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR15);



            // AST REWRITE
            // elements: CLASS_DESCRIPTOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:42: -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
            {
                // org/jf/smali/smaliParser.g:340:45: ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_IMPLEMENTS, ((Token)retval.start), "I_IMPLEMENTS"), root_1);

                adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "implements_spec"

    public static class source_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source_spec"
    // org/jf/smali/smaliParser.g:342:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) ;
    public final smaliParser.source_spec_return source_spec() throws RecognitionException {
        smaliParser.source_spec_return retval = new smaliParser.source_spec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SOURCE_DIRECTIVE16=null;
        Token STRING_LITERAL17=null;

        CommonTree SOURCE_DIRECTIVE16_tree=null;
        CommonTree STRING_LITERAL17_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");

        try {
            // org/jf/smali/smaliParser.g:343:2: ( SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) )
            // org/jf/smali/smaliParser.g:343:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            SOURCE_DIRECTIVE16=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec612);  
            stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE16);

            STRING_LITERAL17=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec614);  
            stream_STRING_LITERAL.add(STRING_LITERAL17);



            // AST REWRITE
            // elements: STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:36: -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
            {
                // org/jf/smali/smaliParser.g:343:39: ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, ((Token)retval.start), "I_SOURCE"), root_1);

                adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "source_spec"

    public static class access_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access_list"
    // org/jf/smali/smaliParser.g:345:1: access_list : ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) ;
    public final smaliParser.access_list_return access_list() throws RecognitionException {
        smaliParser.access_list_return retval = new smaliParser.access_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACCESS_SPEC18=null;

        CommonTree ACCESS_SPEC18_tree=null;
        RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");

        try {
            // org/jf/smali/smaliParser.g:346:2: ( ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) )
            // org/jf/smali/smaliParser.g:346:4: ( ACCESS_SPEC )*
            {
            // org/jf/smali/smaliParser.g:346:4: ( ACCESS_SPEC )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case ACCESS_SPEC:
                    {
                    switch ( input.LA(2) ) {
                    case POSITIVE_INTEGER_LITERAL:
                    case NEGATIVE_INTEGER_LITERAL:
                    case FLOAT_LITERAL_OR_ID:
                    case DOUBLE_LITERAL_OR_ID:
                    case BOOL_LITERAL:
                    case NULL_LITERAL:
                    case REGISTER:
                    case ANNOTATION_VISIBILITY:
                    case ACCESS_SPEC:
                    case INSTRUCTION_FORMAT10t:
                    case INSTRUCTION_FORMAT10x:
                    case INSTRUCTION_FORMAT11x:
                    case INSTRUCTION_FORMAT12x_OR_ID:
                    case INSTRUCTION_FORMAT21c_FIELD:
                    case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                    case INSTRUCTION_FORMAT21c_STRING:
                    case INSTRUCTION_FORMAT21c_TYPE:
                    case INSTRUCTION_FORMAT21t:
                    case INSTRUCTION_FORMAT22c_FIELD:
                    case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                    case INSTRUCTION_FORMAT22c_TYPE:
                    case INSTRUCTION_FORMAT22cs_FIELD:
                    case INSTRUCTION_FORMAT22s_OR_ID:
                    case INSTRUCTION_FORMAT22t:
                    case INSTRUCTION_FORMAT23x:
                    case INSTRUCTION_FORMAT31i_OR_ID:
                    case INSTRUCTION_FORMAT31t:
                    case INSTRUCTION_FORMAT35c_METHOD:
                    case INSTRUCTION_FORMAT35c_TYPE:
                    case INSTRUCTION_FORMAT35s_METHOD:
                    case INSTRUCTION_FORMAT35ms_METHOD:
                    case INSTRUCTION_FORMAT51l:
                    case PRIMITIVE_TYPE:
                    case VOID_TYPE:
                    case CLASS_DESCRIPTOR:
                    case PARAM_LIST_OR_ID:
                    case SIMPLE_NAME:
                    case METHOD_NAME:
                    case INTEGER_LITERAL:
                        {
                        alt2=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:346:4: ACCESS_SPEC
            	    {
            	    ACCESS_SPEC18=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list632);  
            	    stream_ACCESS_SPEC.add(ACCESS_SPEC18);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: ACCESS_SPEC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:17: -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
            {
                // org/jf/smali/smaliParser.g:346:20: ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ACCESS_LIST, ((Token)retval.start), "I_ACCESS_LIST"), root_1);

                // org/jf/smali/smaliParser.g:346:60: ( ACCESS_SPEC )*
                while ( stream_ACCESS_SPEC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ACCESS_SPEC.nextNode());

                }
                stream_ACCESS_SPEC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "access_list"

    public static class field_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // org/jf/smali/smaliParser.g:353:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) ;
    public final smaliParser.field_return field() throws RecognitionException {
        smaliParser.field_return retval = new smaliParser.field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FIELD_DIRECTIVE19=null;
        Token COLON22=null;
        Token EQUAL24=null;
        Token END_FIELD_DIRECTIVE27=null;
        smaliParser.access_list_return access_list20 = null;

        smaliParser.simple_name_return simple_name21 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor23 = null;

        smaliParser.literal_return literal25 = null;

        smaliParser.annotation_return annotation26 = null;


        CommonTree FIELD_DIRECTIVE19_tree=null;
        CommonTree COLON22_tree=null;
        CommonTree EQUAL24_tree=null;
        CommonTree END_FIELD_DIRECTIVE27_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token FIELD_DIRECTIVE");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_END_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_FIELD_DIRECTIVE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        List<CommonTree> annotations = new ArrayList<CommonTree>();
        try {
            // org/jf/smali/smaliParser.g:355:2: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) )
            // org/jf/smali/smaliParser.g:355:4: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
            {
            FIELD_DIRECTIVE19=(Token)match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field661);  
            stream_FIELD_DIRECTIVE.add(FIELD_DIRECTIVE19);

            pushFollow(FOLLOW_access_list_in_field663);
            access_list20=access_list();

            state._fsp--;

            stream_access_list.add(access_list20.getTree());
            pushFollow(FOLLOW_simple_name_in_field665);
            simple_name21=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name21.getTree());
            COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_field667);  
            stream_COLON.add(COLON22);

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_field669);
            nonvoid_type_descriptor23=nonvoid_type_descriptor();

            state._fsp--;

            stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor23.getTree());
            // org/jf/smali/smaliParser.g:355:74: ( EQUAL literal )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // org/jf/smali/smaliParser.g:355:75: EQUAL literal
                    {
                    EQUAL24=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_field672);  
                    stream_EQUAL.add(EQUAL24);

                    pushFollow(FOLLOW_literal_in_field674);
                    literal25=literal();

                    state._fsp--;

                    stream_literal.add(literal25.getTree());

                    }
                    break;

            }

            // org/jf/smali/smaliParser.g:356:3: ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
            // org/jf/smali/smaliParser.g:356:5: ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
            {
            // org/jf/smali/smaliParser.g:356:5: ({...}? annotation )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:356:6: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        throw new FailedPredicateException(input, "field", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }
            	    pushFollow(FOLLOW_annotation_in_field685);
            	    annotation26=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation26.getTree());
            	    annotations.add((annotation26!=null?((CommonTree)annotation26.tree):null));

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // org/jf/smali/smaliParser.g:357:4: ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case END_FIELD_DIRECTIVE:
                {
                alt5=1;
                }
                break;
            case EOF:
            case CLASS_DIRECTIVE:
            case SUPER_DIRECTIVE:
            case IMPLEMENTS_DIRECTIVE:
            case SOURCE_DIRECTIVE:
            case FIELD_DIRECTIVE:
            case ANNOTATION_DIRECTIVE:
            case METHOD_DIRECTIVE:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // org/jf/smali/smaliParser.g:357:6: END_FIELD_DIRECTIVE
                    {
                    END_FIELD_DIRECTIVE27=(Token)match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field696);  
                    stream_END_FIELD_DIRECTIVE.add(END_FIELD_DIRECTIVE27);



                    // AST REWRITE
                    // elements: simple_name, access_list, nonvoid_type_descriptor, annotation, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 358:5: -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
                    {
                        // org/jf/smali/smaliParser.g:358:8: ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, ((Token)retval.start), "I_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_simple_name.nextTree());
                        adaptor.addChild(root_1, stream_access_list.nextTree());
                        // org/jf/smali/smaliParser.g:358:61: ^( I_FIELD_TYPE nonvoid_type_descriptor )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);

                        adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:358:101: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
                        if ( stream_literal.hasNext() ) {
                            // org/jf/smali/smaliParser.g:358:101: ^( I_FIELD_INITIAL_VALUE literal )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);

                            adaptor.addChild(root_2, stream_literal.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_literal.reset();
                        // org/jf/smali/smaliParser.g:358:135: ^( I_ANNOTATIONS ( annotation )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);

                        // org/jf/smali/smaliParser.g:358:151: ( annotation )*
                        while ( stream_annotation.hasNext() ) {
                            adaptor.addChild(root_2, stream_annotation.nextTree());

                        }
                        stream_annotation.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:359:18: 
                    {
                    ((smali_file_scope)smali_file_stack.peek()).classAnnotations.addAll(annotations);


                    // AST REWRITE
                    // elements: literal, simple_name, access_list, nonvoid_type_descriptor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 360:5: -> ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
                    {
                        // org/jf/smali/smaliParser.g:360:8: ^( I_FIELD[$start, \"I_FIELD\"] simple_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, ((Token)retval.start), "I_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_simple_name.nextTree());
                        adaptor.addChild(root_1, stream_access_list.nextTree());
                        // org/jf/smali/smaliParser.g:360:61: ^( I_FIELD_TYPE nonvoid_type_descriptor )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);

                        adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:360:101: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
                        if ( stream_literal.hasNext() ) {
                            // org/jf/smali/smaliParser.g:360:101: ^( I_FIELD_INITIAL_VALUE literal )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);

                            adaptor.addChild(root_2, stream_literal.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_literal.reset();
                        // org/jf/smali/smaliParser.g:360:135: ^( I_ANNOTATIONS )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field"

    protected static class method_scope {
        int currentAddress;
    }
    protected Stack method_stack = new Stack();

    public static class method_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method"
    // org/jf/smali/smaliParser.g:364:1: method : METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] method_name method_prototype access_list statements_and_directives ) ;
    public final smaliParser.method_return method() throws RecognitionException {
        method_stack.push(new method_scope());
        smaliParser.method_return retval = new smaliParser.method_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token METHOD_DIRECTIVE28=null;
        Token END_METHOD_DIRECTIVE33=null;
        smaliParser.access_list_return access_list29 = null;

        smaliParser.method_name_return method_name30 = null;

        smaliParser.method_prototype_return method_prototype31 = null;

        smaliParser.statements_and_directives_return statements_and_directives32 = null;


        CommonTree METHOD_DIRECTIVE28_tree=null;
        CommonTree END_METHOD_DIRECTIVE33_tree=null;
        RewriteRuleTokenStream stream_END_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_METHOD_DIRECTIVE");
        RewriteRuleTokenStream stream_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token METHOD_DIRECTIVE");
        RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
        RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
        RewriteRuleSubtreeStream stream_statements_and_directives=new RewriteRuleSubtreeStream(adaptor,"rule statements_and_directives");
        RewriteRuleSubtreeStream stream_method_name=new RewriteRuleSubtreeStream(adaptor,"rule method_name");
        try {
            // org/jf/smali/smaliParser.g:366:2: ( METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] method_name method_prototype access_list statements_and_directives ) )
            // org/jf/smali/smaliParser.g:366:4: METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
            {
            ((method_scope)method_stack.peek()).currentAddress = 0;
            METHOD_DIRECTIVE28=(Token)match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method799);  
            stream_METHOD_DIRECTIVE.add(METHOD_DIRECTIVE28);

            pushFollow(FOLLOW_access_list_in_method801);
            access_list29=access_list();

            state._fsp--;

            stream_access_list.add(access_list29.getTree());
            pushFollow(FOLLOW_method_name_in_method803);
            method_name30=method_name();

            state._fsp--;

            stream_method_name.add(method_name30.getTree());
            pushFollow(FOLLOW_method_prototype_in_method805);
            method_prototype31=method_prototype();

            state._fsp--;

            stream_method_prototype.add(method_prototype31.getTree());
            pushFollow(FOLLOW_statements_and_directives_in_method807);
            statements_and_directives32=statements_and_directives();

            state._fsp--;

            stream_statements_and_directives.add(statements_and_directives32.getTree());
            END_METHOD_DIRECTIVE33=(Token)match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method811);  
            stream_END_METHOD_DIRECTIVE.add(END_METHOD_DIRECTIVE33);



            // AST REWRITE
            // elements: statements_and_directives, method_prototype, method_name, access_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 369:3: -> ^( I_METHOD[$start, \"I_METHOD\"] method_name method_prototype access_list statements_and_directives )
            {
                // org/jf/smali/smaliParser.g:369:6: ^( I_METHOD[$start, \"I_METHOD\"] method_name method_prototype access_list statements_and_directives )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD, ((Token)retval.start), "I_METHOD"), root_1);

                adaptor.addChild(root_1, stream_method_name.nextTree());
                adaptor.addChild(root_1, stream_method_prototype.nextTree());
                adaptor.addChild(root_1, stream_access_list.nextTree());
                adaptor.addChild(root_1, stream_statements_and_directives.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            method_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "method"

    protected static class statements_and_directives_scope {
        boolean hasRegistersDirective;
        List<CommonTree> packedSwitchDeclarations;
        List<CommonTree> sparseSwitchDeclarations;
        List<CommonTree> methodAnnotations;
    }
    protected Stack statements_and_directives_stack = new Stack();

    public static class statements_and_directives_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements_and_directives"
    // org/jf/smali/smaliParser.g:371:1: statements_and_directives : ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )* -> ( registers_directive )? ^( I_LABELS ( label )* ) ^( I_STATEMENTS ( instruction )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) ^( I_ORDERED_DEBUG_DIRECTIVES ( ordered_debug_directive )* ) ;
    public final smaliParser.statements_and_directives_return statements_and_directives() throws RecognitionException {
        statements_and_directives_stack.push(new statements_and_directives_scope());
        smaliParser.statements_and_directives_return retval = new smaliParser.statements_and_directives_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        smaliParser.instruction_return instruction34 = null;

        smaliParser.registers_directive_return registers_directive35 = null;

        smaliParser.label_return label36 = null;

        smaliParser.catch_directive_return catch_directive37 = null;

        smaliParser.catchall_directive_return catchall_directive38 = null;

        smaliParser.parameter_directive_return parameter_directive39 = null;

        smaliParser.ordered_debug_directive_return ordered_debug_directive40 = null;

        smaliParser.annotation_return annotation41 = null;


        RewriteRuleSubtreeStream stream_catchall_directive=new RewriteRuleSubtreeStream(adaptor,"rule catchall_directive");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_catch_directive=new RewriteRuleSubtreeStream(adaptor,"rule catch_directive");
        RewriteRuleSubtreeStream stream_registers_directive=new RewriteRuleSubtreeStream(adaptor,"rule registers_directive");
        RewriteRuleSubtreeStream stream_ordered_debug_directive=new RewriteRuleSubtreeStream(adaptor,"rule ordered_debug_directive");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
        RewriteRuleSubtreeStream stream_parameter_directive=new RewriteRuleSubtreeStream(adaptor,"rule parameter_directive");
        try {
            // org/jf/smali/smaliParser.g:379:2: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )* -> ( registers_directive )? ^( I_LABELS ( label )* ) ^( I_STATEMENTS ( instruction )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) ^( I_ORDERED_DEBUG_DIRECTIVES ( ordered_debug_directive )* ) )
            // org/jf/smali/smaliParser.g:379:4: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )*
            {

            			((method_scope)method_stack.peek()).currentAddress = 0;
            			((statements_and_directives_scope)statements_and_directives_stack.peek()).hasRegistersDirective = false;
            			((statements_and_directives_scope)statements_and_directives_stack.peek()).packedSwitchDeclarations = new ArrayList<CommonTree>();
            			((statements_and_directives_scope)statements_and_directives_stack.peek()).sparseSwitchDeclarations = new ArrayList<CommonTree>();
            			((statements_and_directives_scope)statements_and_directives_stack.peek()).methodAnnotations = new ArrayList<CommonTree>();
            		
            // org/jf/smali/smaliParser.g:386:3: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )*
            loop6:
            do {
                int alt6=9;
                switch ( input.LA(1) ) {
                case ARRAY_DATA_DIRECTIVE:
                case PACKED_SWITCH_DIRECTIVE:
                case SPARSE_SWITCH_DIRECTIVE:
                case INSTRUCTION_FORMAT10t:
                case INSTRUCTION_FORMAT10x:
                case INSTRUCTION_FORMAT11n:
                case INSTRUCTION_FORMAT11x:
                case INSTRUCTION_FORMAT12x_OR_ID:
                case INSTRUCTION_FORMAT12x:
                case INSTRUCTION_FORMAT20t:
                case INSTRUCTION_FORMAT21c_FIELD:
                case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                case INSTRUCTION_FORMAT21c_STRING:
                case INSTRUCTION_FORMAT21c_TYPE:
                case INSTRUCTION_FORMAT21h:
                case INSTRUCTION_FORMAT21s:
                case INSTRUCTION_FORMAT21t:
                case INSTRUCTION_FORMAT22b:
                case INSTRUCTION_FORMAT22c_FIELD:
                case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                case INSTRUCTION_FORMAT22c_TYPE:
                case INSTRUCTION_FORMAT22cs_FIELD:
                case INSTRUCTION_FORMAT22s_OR_ID:
                case INSTRUCTION_FORMAT22s:
                case INSTRUCTION_FORMAT22t:
                case INSTRUCTION_FORMAT22x:
                case INSTRUCTION_FORMAT23x:
                case INSTRUCTION_FORMAT30t:
                case INSTRUCTION_FORMAT31c:
                case INSTRUCTION_FORMAT31i_OR_ID:
                case INSTRUCTION_FORMAT31i:
                case INSTRUCTION_FORMAT31t:
                case INSTRUCTION_FORMAT32x:
                case INSTRUCTION_FORMAT35c_METHOD:
                case INSTRUCTION_FORMAT35c_TYPE:
                case INSTRUCTION_FORMAT35s_METHOD:
                case INSTRUCTION_FORMAT35ms_METHOD:
                case INSTRUCTION_FORMAT3rc_METHOD:
                case INSTRUCTION_FORMAT3rc_TYPE:
                case INSTRUCTION_FORMAT3rms_METHOD:
                case INSTRUCTION_FORMAT51l:
                    {
                    alt6=1;
                    }
                    break;
                case REGISTERS_DIRECTIVE:
                case LOCALS_DIRECTIVE:
                    {
                    alt6=2;
                    }
                    break;
                case COLON:
                    {
                    alt6=3;
                    }
                    break;
                case CATCH_DIRECTIVE:
                    {
                    alt6=4;
                    }
                    break;
                case CATCHALL_DIRECTIVE:
                    {
                    alt6=5;
                    }
                    break;
                case PARAMETER_DIRECTIVE:
                    {
                    alt6=6;
                    }
                    break;
                case SOURCE_DIRECTIVE:
                case LINE_DIRECTIVE:
                case LOCAL_DIRECTIVE:
                case END_LOCAL_DIRECTIVE:
                case RESTART_LOCAL_DIRECTIVE:
                case PROLOGUE_DIRECTIVE:
                case EPILOGUE_DIRECTIVE:
                    {
                    alt6=7;
                    }
                    break;
                case ANNOTATION_DIRECTIVE:
                    {
                    alt6=8;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:386:5: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_statements_and_directives849);
            	    instruction34=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction34.getTree());
            	    ((method_scope)method_stack.peek()).currentAddress += (instruction34!=null?instruction34.size:0)/2;

            	    }
            	    break;
            	case 2 :
            	    // org/jf/smali/smaliParser.g:387:5: registers_directive
            	    {
            	    pushFollow(FOLLOW_registers_directive_in_statements_and_directives857);
            	    registers_directive35=registers_directive();

            	    state._fsp--;

            	    stream_registers_directive.add(registers_directive35.getTree());

            	    }
            	    break;
            	case 3 :
            	    // org/jf/smali/smaliParser.g:388:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statements_and_directives863);
            	    label36=label();

            	    state._fsp--;

            	    stream_label.add(label36.getTree());

            	    }
            	    break;
            	case 4 :
            	    // org/jf/smali/smaliParser.g:389:5: catch_directive
            	    {
            	    pushFollow(FOLLOW_catch_directive_in_statements_and_directives869);
            	    catch_directive37=catch_directive();

            	    state._fsp--;

            	    stream_catch_directive.add(catch_directive37.getTree());

            	    }
            	    break;
            	case 5 :
            	    // org/jf/smali/smaliParser.g:390:5: catchall_directive
            	    {
            	    pushFollow(FOLLOW_catchall_directive_in_statements_and_directives875);
            	    catchall_directive38=catchall_directive();

            	    state._fsp--;

            	    stream_catchall_directive.add(catchall_directive38.getTree());

            	    }
            	    break;
            	case 6 :
            	    // org/jf/smali/smaliParser.g:391:5: parameter_directive
            	    {
            	    pushFollow(FOLLOW_parameter_directive_in_statements_and_directives881);
            	    parameter_directive39=parameter_directive();

            	    state._fsp--;

            	    stream_parameter_directive.add(parameter_directive39.getTree());

            	    }
            	    break;
            	case 7 :
            	    // org/jf/smali/smaliParser.g:392:5: ordered_debug_directive
            	    {
            	    pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives887);
            	    ordered_debug_directive40=ordered_debug_directive();

            	    state._fsp--;

            	    stream_ordered_debug_directive.add(ordered_debug_directive40.getTree());

            	    }
            	    break;
            	case 8 :
            	    // org/jf/smali/smaliParser.g:393:5: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_statements_and_directives893);
            	    annotation41=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation41.getTree());
            	    ((statements_and_directives_scope)statements_and_directives_stack.peek()).methodAnnotations.add((annotation41!=null?((CommonTree)annotation41.tree):null));

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: ordered_debug_directive, instruction, parameter_directive, catch_directive, catchall_directive, label, registers_directive
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 395:3: -> ( registers_directive )? ^( I_LABELS ( label )* ) ^( I_STATEMENTS ( instruction )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) ^( I_ORDERED_DEBUG_DIRECTIVES ( ordered_debug_directive )* )
            {
                // org/jf/smali/smaliParser.g:395:6: ( registers_directive )?
                if ( stream_registers_directive.hasNext() ) {
                    adaptor.addChild(root_0, stream_registers_directive.nextTree());

                }
                stream_registers_directive.reset();
                // org/jf/smali/smaliParser.g:396:4: ^( I_LABELS ( label )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LABELS, "I_LABELS"), root_1);

                // org/jf/smali/smaliParser.g:396:15: ( label )*
                while ( stream_label.hasNext() ) {
                    adaptor.addChild(root_1, stream_label.nextTree());

                }
                stream_label.reset();

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, buildTree(I_PACKED_SWITCH_DECLARATIONS, "I_PACKED_SWITCH_DECLARATIONS", ((statements_and_directives_scope)statements_and_directives_stack.peek()).packedSwitchDeclarations));
                adaptor.addChild(root_0, buildTree(I_SPARSE_SWITCH_DECLARATIONS, "I_SPARSE_SWITCH_DECLARATIONS", ((statements_and_directives_scope)statements_and_directives_stack.peek()).sparseSwitchDeclarations));
                // org/jf/smali/smaliParser.g:399:4: ^( I_STATEMENTS ( instruction )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENTS, "I_STATEMENTS"), root_1);

                // org/jf/smali/smaliParser.g:399:19: ( instruction )*
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }
                // org/jf/smali/smaliParser.g:400:4: ^( I_CATCHES ( catch_directive )* ( catchall_directive )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHES, "I_CATCHES"), root_1);

                // org/jf/smali/smaliParser.g:400:16: ( catch_directive )*
                while ( stream_catch_directive.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_directive.nextTree());

                }
                stream_catch_directive.reset();
                // org/jf/smali/smaliParser.g:400:33: ( catchall_directive )*
                while ( stream_catchall_directive.hasNext() ) {
                    adaptor.addChild(root_1, stream_catchall_directive.nextTree());

                }
                stream_catchall_directive.reset();

                adaptor.addChild(root_0, root_1);
                }
                // org/jf/smali/smaliParser.g:401:4: ^( I_PARAMETERS ( parameter_directive )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETERS, "I_PARAMETERS"), root_1);

                // org/jf/smali/smaliParser.g:401:19: ( parameter_directive )*
                while ( stream_parameter_directive.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_directive.nextTree());

                }
                stream_parameter_directive.reset();

                adaptor.addChild(root_0, root_1);
                }
                // org/jf/smali/smaliParser.g:402:4: ^( I_ORDERED_DEBUG_DIRECTIVES ( ordered_debug_directive )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ORDERED_DEBUG_DIRECTIVES, "I_ORDERED_DEBUG_DIRECTIVES"), root_1);

                // org/jf/smali/smaliParser.g:402:33: ( ordered_debug_directive )*
                while ( stream_ordered_debug_directive.hasNext() ) {
                    adaptor.addChild(root_1, stream_ordered_debug_directive.nextTree());

                }
                stream_ordered_debug_directive.reset();

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", ((statements_and_directives_scope)statements_and_directives_stack.peek()).methodAnnotations));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            statements_and_directives_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "statements_and_directives"

    public static class registers_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "registers_directive"
    // org/jf/smali/smaliParser.g:405:1: registers_directive : (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) | directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) ;
    public final smaliParser.registers_directive_return registers_directive() throws RecognitionException {
        smaliParser.registers_directive_return retval = new smaliParser.registers_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token directive=null;
        smaliParser.integral_literal_return regCount = null;

        smaliParser.integral_literal_return regCount2 = null;


        CommonTree directive_tree=null;
        RewriteRuleTokenStream stream_REGISTERS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token REGISTERS_DIRECTIVE");
        RewriteRuleTokenStream stream_LOCALS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCALS_DIRECTIVE");
        RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");
        try {
            // org/jf/smali/smaliParser.g:406:2: ( (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) | directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) )
            // org/jf/smali/smaliParser.g:406:4: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) | directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
            {
            // org/jf/smali/smaliParser.g:406:4: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) | directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case REGISTERS_DIRECTIVE:
                {
                alt7=1;
                }
                break;
            case LOCALS_DIRECTIVE:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // org/jf/smali/smaliParser.g:407:4: directive= REGISTERS_DIRECTIVE regCount= integral_literal
                    {
                    directive=(Token)match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive992);  
                    stream_REGISTERS_DIRECTIVE.add(directive);

                    pushFollow(FOLLOW_integral_literal_in_registers_directive996);
                    regCount=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(regCount.getTree());


                    // AST REWRITE
                    // elements: regCount
                    // token labels: 
                    // rule labels: retval, regCount
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_regCount=new RewriteRuleSubtreeStream(adaptor,"rule regCount",regCount!=null?regCount.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 407:60: -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
                    {
                        // org/jf/smali/smaliParser.g:407:63: ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTERS, directive, "I_REGISTERS"), root_1);

                        adaptor.addChild(root_1, stream_regCount.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:408:5: directive= LOCALS_DIRECTIVE regCount2= integral_literal
                    {
                    directive=(Token)match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1014);  
                    stream_LOCALS_DIRECTIVE.add(directive);

                    pushFollow(FOLLOW_integral_literal_in_registers_directive1018);
                    regCount2=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(regCount2.getTree());


                    // AST REWRITE
                    // elements: regCount2
                    // token labels: 
                    // rule labels: retval, regCount2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_regCount2=new RewriteRuleSubtreeStream(adaptor,"rule regCount2",regCount2!=null?regCount2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 408:59: -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
                    {
                        // org/jf/smali/smaliParser.g:408:62: ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCALS, directive, "I_LOCALS"), root_1);

                        adaptor.addChild(root_1, stream_regCount2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            			if (((statements_and_directives_scope)statements_and_directives_stack.peek()).hasRegistersDirective) {
            				throw new SemanticException(input, directive, "There can only be a single .registers or .locals directive in a method");
            			}
            			((statements_and_directives_scope)statements_and_directives_stack.peek()).hasRegistersDirective =true;
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "registers_directive"

    public static class simple_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_name"
    // org/jf/smali/smaliParser.g:419:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | INTEGER_LITERAL -> SIMPLE_NAME[$INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | PARAM_LIST_OR_ID -> SIMPLE_NAME[$PARAM_LIST_OR_ID] | PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35s_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35s_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] );
    public final smaliParser.simple_name_return simple_name() throws RecognitionException {
        smaliParser.simple_name_return retval = new smaliParser.simple_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SIMPLE_NAME42=null;
        Token ACCESS_SPEC43=null;
        Token POSITIVE_INTEGER_LITERAL44=null;
        Token NEGATIVE_INTEGER_LITERAL45=null;
        Token INTEGER_LITERAL46=null;
        Token FLOAT_LITERAL_OR_ID47=null;
        Token DOUBLE_LITERAL_OR_ID48=null;
        Token BOOL_LITERAL49=null;
        Token NULL_LITERAL50=null;
        Token REGISTER51=null;
        Token PARAM_LIST_OR_ID52=null;
        Token PRIMITIVE_TYPE53=null;
        Token VOID_TYPE54=null;
        Token ANNOTATION_VISIBILITY55=null;
        Token INSTRUCTION_FORMAT10t56=null;
        Token INSTRUCTION_FORMAT10x57=null;
        Token INSTRUCTION_FORMAT11x58=null;
        Token INSTRUCTION_FORMAT12x_OR_ID59=null;
        Token INSTRUCTION_FORMAT21c_FIELD60=null;
        Token INSTRUCTION_FORMAT21c_FIELD_ODEX61=null;
        Token INSTRUCTION_FORMAT21c_STRING62=null;
        Token INSTRUCTION_FORMAT21c_TYPE63=null;
        Token INSTRUCTION_FORMAT21t64=null;
        Token INSTRUCTION_FORMAT22c_FIELD65=null;
        Token INSTRUCTION_FORMAT22c_FIELD_ODEX66=null;
        Token INSTRUCTION_FORMAT22c_TYPE67=null;
        Token INSTRUCTION_FORMAT22cs_FIELD68=null;
        Token INSTRUCTION_FORMAT22s_OR_ID69=null;
        Token INSTRUCTION_FORMAT22t70=null;
        Token INSTRUCTION_FORMAT23x71=null;
        Token INSTRUCTION_FORMAT31i_OR_ID72=null;
        Token INSTRUCTION_FORMAT31t73=null;
        Token INSTRUCTION_FORMAT35c_METHOD74=null;
        Token INSTRUCTION_FORMAT35c_TYPE75=null;
        Token INSTRUCTION_FORMAT35s_METHOD76=null;
        Token INSTRUCTION_FORMAT35ms_METHOD77=null;
        Token INSTRUCTION_FORMAT51l78=null;

        CommonTree SIMPLE_NAME42_tree=null;
        CommonTree ACCESS_SPEC43_tree=null;
        CommonTree POSITIVE_INTEGER_LITERAL44_tree=null;
        CommonTree NEGATIVE_INTEGER_LITERAL45_tree=null;
        CommonTree INTEGER_LITERAL46_tree=null;
        CommonTree FLOAT_LITERAL_OR_ID47_tree=null;
        CommonTree DOUBLE_LITERAL_OR_ID48_tree=null;
        CommonTree BOOL_LITERAL49_tree=null;
        CommonTree NULL_LITERAL50_tree=null;
        CommonTree REGISTER51_tree=null;
        CommonTree PARAM_LIST_OR_ID52_tree=null;
        CommonTree PRIMITIVE_TYPE53_tree=null;
        CommonTree VOID_TYPE54_tree=null;
        CommonTree ANNOTATION_VISIBILITY55_tree=null;
        CommonTree INSTRUCTION_FORMAT10t56_tree=null;
        CommonTree INSTRUCTION_FORMAT10x57_tree=null;
        CommonTree INSTRUCTION_FORMAT11x58_tree=null;
        CommonTree INSTRUCTION_FORMAT12x_OR_ID59_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_FIELD60_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX61_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_STRING62_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_TYPE63_tree=null;
        CommonTree INSTRUCTION_FORMAT21t64_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_FIELD65_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX66_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_TYPE67_tree=null;
        CommonTree INSTRUCTION_FORMAT22cs_FIELD68_tree=null;
        CommonTree INSTRUCTION_FORMAT22s_OR_ID69_tree=null;
        CommonTree INSTRUCTION_FORMAT22t70_tree=null;
        CommonTree INSTRUCTION_FORMAT23x71_tree=null;
        CommonTree INSTRUCTION_FORMAT31i_OR_ID72_tree=null;
        CommonTree INSTRUCTION_FORMAT31t73_tree=null;
        CommonTree INSTRUCTION_FORMAT35c_METHOD74_tree=null;
        CommonTree INSTRUCTION_FORMAT35c_TYPE75_tree=null;
        CommonTree INSTRUCTION_FORMAT35s_METHOD76_tree=null;
        CommonTree INSTRUCTION_FORMAT35ms_METHOD77_tree=null;
        CommonTree INSTRUCTION_FORMAT51l78_tree=null;
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
        RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");
        RewriteRuleTokenStream stream_NULL_LITERAL=new RewriteRuleTokenStream(adaptor,"token NULL_LITERAL");
        RewriteRuleTokenStream stream_BOOL_LITERAL=new RewriteRuleTokenStream(adaptor,"token BOOL_LITERAL");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
        RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35ms_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35ms_METHOD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35s_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35s_METHOD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22cs_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22cs_FIELD");
        RewriteRuleTokenStream stream_VOID_TYPE=new RewriteRuleTokenStream(adaptor,"token VOID_TYPE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");
        RewriteRuleTokenStream stream_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token INTEGER_LITERAL");
        RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
        RewriteRuleTokenStream stream_PRIMITIVE_TYPE=new RewriteRuleTokenStream(adaptor,"token PRIMITIVE_TYPE");
        RewriteRuleTokenStream stream_PARAM_LIST_OR_ID=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
        RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD_ODEX");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
        RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
        RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD_ODEX");

        try {
            // org/jf/smali/smaliParser.g:420:2: ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | INTEGER_LITERAL -> SIMPLE_NAME[$INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | PARAM_LIST_OR_ID -> SIMPLE_NAME[$PARAM_LIST_OR_ID] | PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35s_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35s_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] )
            int alt8=37;
            switch ( input.LA(1) ) {
            case SIMPLE_NAME:
                {
                alt8=1;
                }
                break;
            case ACCESS_SPEC:
                {
                alt8=2;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
                {
                alt8=3;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
                {
                alt8=4;
                }
                break;
            case INTEGER_LITERAL:
                {
                alt8=5;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
                {
                alt8=6;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
                {
                alt8=7;
                }
                break;
            case BOOL_LITERAL:
                {
                alt8=8;
                }
                break;
            case NULL_LITERAL:
                {
                alt8=9;
                }
                break;
            case REGISTER:
                {
                alt8=10;
                }
                break;
            case PARAM_LIST_OR_ID:
                {
                alt8=11;
                }
                break;
            case PRIMITIVE_TYPE:
                {
                alt8=12;
                }
                break;
            case VOID_TYPE:
                {
                alt8=13;
                }
                break;
            case ANNOTATION_VISIBILITY:
                {
                alt8=14;
                }
                break;
            case INSTRUCTION_FORMAT10t:
                {
                alt8=15;
                }
                break;
            case INSTRUCTION_FORMAT10x:
                {
                alt8=16;
                }
                break;
            case INSTRUCTION_FORMAT11x:
                {
                alt8=17;
                }
                break;
            case INSTRUCTION_FORMAT12x_OR_ID:
                {
                alt8=18;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD:
                {
                alt8=19;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                {
                alt8=20;
                }
                break;
            case INSTRUCTION_FORMAT21c_STRING:
                {
                alt8=21;
                }
                break;
            case INSTRUCTION_FORMAT21c_TYPE:
                {
                alt8=22;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt8=23;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt8=24;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt8=25;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt8=26;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt8=27;
                }
                break;
            case INSTRUCTION_FORMAT22s_OR_ID:
                {
                alt8=28;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt8=29;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt8=30;
                }
                break;
            case INSTRUCTION_FORMAT31i_OR_ID:
                {
                alt8=31;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt8=32;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt8=33;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt8=34;
                }
                break;
            case INSTRUCTION_FORMAT35s_METHOD:
                {
                alt8=35;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt8=36;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt8=37;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // org/jf/smali/smaliParser.g:420:4: SIMPLE_NAME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SIMPLE_NAME42=(Token)match(input,SIMPLE_NAME,FOLLOW_SIMPLE_NAME_in_simple_name1047); 
                    SIMPLE_NAME42_tree = (CommonTree)adaptor.create(SIMPLE_NAME42);
                    adaptor.addChild(root_0, SIMPLE_NAME42_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:421:4: ACCESS_SPEC
                    {
                    ACCESS_SPEC43=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_simple_name1052);  
                    stream_ACCESS_SPEC.add(ACCESS_SPEC43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 421:16: -> SIMPLE_NAME[$ACCESS_SPEC]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ACCESS_SPEC43));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:422:4: POSITIVE_INTEGER_LITERAL
                    {
                    POSITIVE_INTEGER_LITERAL44=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1062);  
                    stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 422:29: -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, POSITIVE_INTEGER_LITERAL44));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:423:4: NEGATIVE_INTEGER_LITERAL
                    {
                    NEGATIVE_INTEGER_LITERAL45=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1072);  
                    stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 423:29: -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NEGATIVE_INTEGER_LITERAL45));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:424:4: INTEGER_LITERAL
                    {
                    INTEGER_LITERAL46=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_simple_name1082);  
                    stream_INTEGER_LITERAL.add(INTEGER_LITERAL46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 424:20: -> SIMPLE_NAME[$INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INTEGER_LITERAL46));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:425:4: FLOAT_LITERAL_OR_ID
                    {
                    FLOAT_LITERAL_OR_ID47=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1092);  
                    stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 425:24: -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, FLOAT_LITERAL_OR_ID47));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:426:4: DOUBLE_LITERAL_OR_ID
                    {
                    DOUBLE_LITERAL_OR_ID48=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1102);  
                    stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 426:25: -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, DOUBLE_LITERAL_OR_ID48));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // org/jf/smali/smaliParser.g:427:4: BOOL_LITERAL
                    {
                    BOOL_LITERAL49=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_simple_name1112);  
                    stream_BOOL_LITERAL.add(BOOL_LITERAL49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 427:17: -> SIMPLE_NAME[$BOOL_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, BOOL_LITERAL49));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // org/jf/smali/smaliParser.g:428:4: NULL_LITERAL
                    {
                    NULL_LITERAL50=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_simple_name1122);  
                    stream_NULL_LITERAL.add(NULL_LITERAL50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 428:17: -> SIMPLE_NAME[$NULL_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NULL_LITERAL50));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // org/jf/smali/smaliParser.g:429:4: REGISTER
                    {
                    REGISTER51=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_simple_name1132);  
                    stream_REGISTER.add(REGISTER51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 429:13: -> SIMPLE_NAME[$REGISTER]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, REGISTER51));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // org/jf/smali/smaliParser.g:430:4: PARAM_LIST_OR_ID
                    {
                    PARAM_LIST_OR_ID52=(Token)match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_simple_name1142);  
                    stream_PARAM_LIST_OR_ID.add(PARAM_LIST_OR_ID52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 430:21: -> SIMPLE_NAME[$PARAM_LIST_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, PARAM_LIST_OR_ID52));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // org/jf/smali/smaliParser.g:431:4: PRIMITIVE_TYPE
                    {
                    PRIMITIVE_TYPE53=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_simple_name1152);  
                    stream_PRIMITIVE_TYPE.add(PRIMITIVE_TYPE53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 431:19: -> SIMPLE_NAME[$PRIMITIVE_TYPE]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, PRIMITIVE_TYPE53));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // org/jf/smali/smaliParser.g:432:4: VOID_TYPE
                    {
                    VOID_TYPE54=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_simple_name1162);  
                    stream_VOID_TYPE.add(VOID_TYPE54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 432:14: -> SIMPLE_NAME[$VOID_TYPE]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, VOID_TYPE54));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // org/jf/smali/smaliParser.g:433:4: ANNOTATION_VISIBILITY
                    {
                    ANNOTATION_VISIBILITY55=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1172);  
                    stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 433:26: -> SIMPLE_NAME[$ANNOTATION_VISIBILITY]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ANNOTATION_VISIBILITY55));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // org/jf/smali/smaliParser.g:434:4: INSTRUCTION_FORMAT10t
                    {
                    INSTRUCTION_FORMAT10t56=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1182);  
                    stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t56);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 434:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10t56));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // org/jf/smali/smaliParser.g:435:4: INSTRUCTION_FORMAT10x
                    {
                    INSTRUCTION_FORMAT10x57=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name1192);  
                    stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 435:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10x57));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // org/jf/smali/smaliParser.g:436:4: INSTRUCTION_FORMAT11x
                    {
                    INSTRUCTION_FORMAT11x58=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name1202);  
                    stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 436:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT11x58));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // org/jf/smali/smaliParser.g:437:4: INSTRUCTION_FORMAT12x_OR_ID
                    {
                    INSTRUCTION_FORMAT12x_OR_ID59=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name1212);  
                    stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 437:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT12x_OR_ID59));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // org/jf/smali/smaliParser.g:438:4: INSTRUCTION_FORMAT21c_FIELD
                    {
                    INSTRUCTION_FORMAT21c_FIELD60=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name1222);  
                    stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 438:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD60));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // org/jf/smali/smaliParser.g:439:4: INSTRUCTION_FORMAT21c_FIELD_ODEX
                    {
                    INSTRUCTION_FORMAT21c_FIELD_ODEX61=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name1232);  
                    stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.add(INSTRUCTION_FORMAT21c_FIELD_ODEX61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 439:37: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD_ODEX61));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // org/jf/smali/smaliParser.g:440:4: INSTRUCTION_FORMAT21c_STRING
                    {
                    INSTRUCTION_FORMAT21c_STRING62=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name1242);  
                    stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_STRING62));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // org/jf/smali/smaliParser.g:441:4: INSTRUCTION_FORMAT21c_TYPE
                    {
                    INSTRUCTION_FORMAT21c_TYPE63=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name1252);  
                    stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 441:31: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_TYPE63));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // org/jf/smali/smaliParser.g:442:4: INSTRUCTION_FORMAT21t
                    {
                    INSTRUCTION_FORMAT21t64=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name1262);  
                    stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 442:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21t64));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // org/jf/smali/smaliParser.g:443:4: INSTRUCTION_FORMAT22c_FIELD
                    {
                    INSTRUCTION_FORMAT22c_FIELD65=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name1272);  
                    stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 443:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD65));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // org/jf/smali/smaliParser.g:444:4: INSTRUCTION_FORMAT22c_FIELD_ODEX
                    {
                    INSTRUCTION_FORMAT22c_FIELD_ODEX66=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name1282);  
                    stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.add(INSTRUCTION_FORMAT22c_FIELD_ODEX66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 444:37: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD_ODEX66));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // org/jf/smali/smaliParser.g:445:4: INSTRUCTION_FORMAT22c_TYPE
                    {
                    INSTRUCTION_FORMAT22c_TYPE67=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name1292);  
                    stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 445:31: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_TYPE67));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // org/jf/smali/smaliParser.g:446:4: INSTRUCTION_FORMAT22cs_FIELD
                    {
                    INSTRUCTION_FORMAT22cs_FIELD68=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name1302);  
                    stream_INSTRUCTION_FORMAT22cs_FIELD.add(INSTRUCTION_FORMAT22cs_FIELD68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 446:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22cs_FIELD68));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // org/jf/smali/smaliParser.g:447:4: INSTRUCTION_FORMAT22s_OR_ID
                    {
                    INSTRUCTION_FORMAT22s_OR_ID69=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name1312);  
                    stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 447:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22s_OR_ID69));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // org/jf/smali/smaliParser.g:448:4: INSTRUCTION_FORMAT22t
                    {
                    INSTRUCTION_FORMAT22t70=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name1322);  
                    stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 448:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22t70));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // org/jf/smali/smaliParser.g:449:4: INSTRUCTION_FORMAT23x
                    {
                    INSTRUCTION_FORMAT23x71=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name1332);  
                    stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 449:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT23x71));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 31 :
                    // org/jf/smali/smaliParser.g:450:4: INSTRUCTION_FORMAT31i_OR_ID
                    {
                    INSTRUCTION_FORMAT31i_OR_ID72=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name1342);  
                    stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 450:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31i_OR_ID72));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 32 :
                    // org/jf/smali/smaliParser.g:451:4: INSTRUCTION_FORMAT31t
                    {
                    INSTRUCTION_FORMAT31t73=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name1352);  
                    stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 451:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31t73));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // org/jf/smali/smaliParser.g:452:4: INSTRUCTION_FORMAT35c_METHOD
                    {
                    INSTRUCTION_FORMAT35c_METHOD74=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name1362);  
                    stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 452:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_METHOD74));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 34 :
                    // org/jf/smali/smaliParser.g:453:4: INSTRUCTION_FORMAT35c_TYPE
                    {
                    INSTRUCTION_FORMAT35c_TYPE75=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name1372);  
                    stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 453:31: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_TYPE75));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 35 :
                    // org/jf/smali/smaliParser.g:454:4: INSTRUCTION_FORMAT35s_METHOD
                    {
                    INSTRUCTION_FORMAT35s_METHOD76=(Token)match(input,INSTRUCTION_FORMAT35s_METHOD,FOLLOW_INSTRUCTION_FORMAT35s_METHOD_in_simple_name1382);  
                    stream_INSTRUCTION_FORMAT35s_METHOD.add(INSTRUCTION_FORMAT35s_METHOD76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35s_METHOD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35s_METHOD76));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 36 :
                    // org/jf/smali/smaliParser.g:455:4: INSTRUCTION_FORMAT35ms_METHOD
                    {
                    INSTRUCTION_FORMAT35ms_METHOD77=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name1392);  
                    stream_INSTRUCTION_FORMAT35ms_METHOD.add(INSTRUCTION_FORMAT35ms_METHOD77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35ms_METHOD77));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 37 :
                    // org/jf/smali/smaliParser.g:456:4: INSTRUCTION_FORMAT51l
                    {
                    INSTRUCTION_FORMAT51l78=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name1402);  
                    stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 456:26: -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT51l78));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_name"

    public static class method_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_name"
    // org/jf/smali/smaliParser.g:458:1: method_name : ( simple_name | METHOD_NAME -> SIMPLE_NAME[$METHOD_NAME] );
    public final smaliParser.method_name_return method_name() throws RecognitionException {
        smaliParser.method_name_return retval = new smaliParser.method_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token METHOD_NAME80=null;
        smaliParser.simple_name_return simple_name79 = null;


        CommonTree METHOD_NAME80_tree=null;
        RewriteRuleTokenStream stream_METHOD_NAME=new RewriteRuleTokenStream(adaptor,"token METHOD_NAME");

        try {
            // org/jf/smali/smaliParser.g:459:2: ( simple_name | METHOD_NAME -> SIMPLE_NAME[$METHOD_NAME] )
            int alt9=2;
            switch ( input.LA(1) ) {
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case FLOAT_LITERAL_OR_ID:
            case DOUBLE_LITERAL_OR_ID:
            case BOOL_LITERAL:
            case NULL_LITERAL:
            case REGISTER:
            case ANNOTATION_VISIBILITY:
            case ACCESS_SPEC:
            case INSTRUCTION_FORMAT10t:
            case INSTRUCTION_FORMAT10x:
            case INSTRUCTION_FORMAT11x:
            case INSTRUCTION_FORMAT12x_OR_ID:
            case INSTRUCTION_FORMAT21c_FIELD:
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
            case INSTRUCTION_FORMAT21c_STRING:
            case INSTRUCTION_FORMAT21c_TYPE:
            case INSTRUCTION_FORMAT21t:
            case INSTRUCTION_FORMAT22c_FIELD:
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
            case INSTRUCTION_FORMAT22c_TYPE:
            case INSTRUCTION_FORMAT22cs_FIELD:
            case INSTRUCTION_FORMAT22s_OR_ID:
            case INSTRUCTION_FORMAT22t:
            case INSTRUCTION_FORMAT23x:
            case INSTRUCTION_FORMAT31i_OR_ID:
            case INSTRUCTION_FORMAT31t:
            case INSTRUCTION_FORMAT35c_METHOD:
            case INSTRUCTION_FORMAT35c_TYPE:
            case INSTRUCTION_FORMAT35s_METHOD:
            case INSTRUCTION_FORMAT35ms_METHOD:
            case INSTRUCTION_FORMAT51l:
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
            case PARAM_LIST_OR_ID:
            case SIMPLE_NAME:
            case INTEGER_LITERAL:
                {
                alt9=1;
                }
                break;
            case METHOD_NAME:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // org/jf/smali/smaliParser.g:459:4: simple_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simple_name_in_method_name1416);
                    simple_name79=simple_name();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_name79.getTree());

                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:460:4: METHOD_NAME
                    {
                    METHOD_NAME80=(Token)match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name1421);  
                    stream_METHOD_NAME.add(METHOD_NAME80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 460:16: -> SIMPLE_NAME[$METHOD_NAME]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, METHOD_NAME80));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_name"

    public static class method_prototype_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_prototype"
    // org/jf/smali/smaliParser.g:462:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) ;
    public final smaliParser.method_prototype_return method_prototype() throws RecognitionException {
        smaliParser.method_prototype_return retval = new smaliParser.method_prototype_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPEN_PAREN81=null;
        Token CLOSE_PAREN83=null;
        smaliParser.param_list_return param_list82 = null;

        smaliParser.type_descriptor_return type_descriptor84 = null;


        CommonTree OPEN_PAREN81_tree=null;
        CommonTree CLOSE_PAREN83_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleSubtreeStream stream_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule type_descriptor");
        RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");
        try {
            // org/jf/smali/smaliParser.g:463:2: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) )
            // org/jf/smali/smaliParser.g:463:4: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
            {
            OPEN_PAREN81=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype1435);  
            stream_OPEN_PAREN.add(OPEN_PAREN81);

            pushFollow(FOLLOW_param_list_in_method_prototype1437);
            param_list82=param_list();

            state._fsp--;

            stream_param_list.add(param_list82.getTree());
            CLOSE_PAREN83=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype1439);  
            stream_CLOSE_PAREN.add(CLOSE_PAREN83);

            pushFollow(FOLLOW_type_descriptor_in_method_prototype1441);
            type_descriptor84=type_descriptor();

            state._fsp--;

            stream_type_descriptor.add(type_descriptor84.getTree());


            // AST REWRITE
            // elements: param_list, type_descriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 464:3: -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
            {
                // org/jf/smali/smaliParser.g:464:6: ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_PROTOTYPE, ((Token)retval.start), "I_METHOD_PROTOTYPE"), root_1);

                // org/jf/smali/smaliParser.g:464:57: ^( I_METHOD_RETURN_TYPE type_descriptor )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_RETURN_TYPE, "I_METHOD_RETURN_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type_descriptor.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // org/jf/smali/smaliParser.g:464:97: ( param_list )?
                if ( stream_param_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_param_list.nextTree());

                }
                stream_param_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_prototype"

    public static class param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_list"
    // org/jf/smali/smaliParser.g:466:1: param_list : ( PARAM_LIST -> | PARAM_LIST_OR_ID -> | ( nonvoid_type_descriptor )* );
    public final smaliParser.param_list_return param_list() throws RecognitionException {
        smaliParser.param_list_return retval = new smaliParser.param_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PARAM_LIST85=null;
        Token PARAM_LIST_OR_ID86=null;
        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor87 = null;


        CommonTree PARAM_LIST85_tree=null;
        CommonTree PARAM_LIST_OR_ID86_tree=null;
        RewriteRuleTokenStream stream_PARAM_LIST=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST");
        RewriteRuleTokenStream stream_PARAM_LIST_OR_ID=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:467:2: ( PARAM_LIST -> | PARAM_LIST_OR_ID -> | ( nonvoid_type_descriptor )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case PARAM_LIST:
                {
                alt11=1;
                }
                break;
            case PARAM_LIST_OR_ID:
                {
                alt11=2;
                }
                break;
            case PRIMITIVE_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
            case CLOSE_PAREN:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // org/jf/smali/smaliParser.g:467:4: PARAM_LIST
                    {
                    PARAM_LIST85=(Token)match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list1468);  
                    stream_PARAM_LIST.add(PARAM_LIST85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 467:15: ->
                    {
                        adaptor.addChild(root_0,  parseParamList((CommonToken)PARAM_LIST85) );

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:468:4: PARAM_LIST_OR_ID
                    {
                    PARAM_LIST_OR_ID86=(Token)match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list1477);  
                    stream_PARAM_LIST_OR_ID.add(PARAM_LIST_OR_ID86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 468:21: ->
                    {
                        adaptor.addChild(root_0,  parseParamList((CommonToken)PARAM_LIST_OR_ID86) );

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:469:4: ( nonvoid_type_descriptor )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // org/jf/smali/smaliParser.g:469:4: ( nonvoid_type_descriptor )*
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case PRIMITIVE_TYPE:
                        case CLASS_DESCRIPTOR:
                        case ARRAY_DESCRIPTOR:
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:469:4: nonvoid_type_descriptor
                    	    {
                    	    pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list1486);
                    	    nonvoid_type_descriptor87=nonvoid_type_descriptor();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nonvoid_type_descriptor87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_list"

    public static class type_descriptor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_descriptor"
    // org/jf/smali/smaliParser.g:471:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final smaliParser.type_descriptor_return type_descriptor() throws RecognitionException {
        smaliParser.type_descriptor_return retval = new smaliParser.type_descriptor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set88=null;

        CommonTree set88_tree=null;

        try {
            // org/jf/smali/smaliParser.g:472:2: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // org/jf/smali/smaliParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set88=(Token)input.LT(1);
            if ( (input.LA(1)>=PRIMITIVE_TYPE && input.LA(1)<=ARRAY_DESCRIPTOR) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set88));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_descriptor"

    public static class nonvoid_type_descriptor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonvoid_type_descriptor"
    // org/jf/smali/smaliParser.g:477:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor() throws RecognitionException {
        smaliParser.nonvoid_type_descriptor_return retval = new smaliParser.nonvoid_type_descriptor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set89=null;

        CommonTree set89_tree=null;

        try {
            // org/jf/smali/smaliParser.g:478:2: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // org/jf/smali/smaliParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set89=(Token)input.LT(1);
            if ( input.LA(1)==PRIMITIVE_TYPE||(input.LA(1)>=CLASS_DESCRIPTOR && input.LA(1)<=ARRAY_DESCRIPTOR) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set89));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nonvoid_type_descriptor"

    public static class reference_type_descriptor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference_type_descriptor"
    // org/jf/smali/smaliParser.g:482:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final smaliParser.reference_type_descriptor_return reference_type_descriptor() throws RecognitionException {
        smaliParser.reference_type_descriptor_return retval = new smaliParser.reference_type_descriptor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set90=null;

        CommonTree set90_tree=null;

        try {
            // org/jf/smali/smaliParser.g:483:2: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // org/jf/smali/smaliParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set90=(Token)input.LT(1);
            if ( (input.LA(1)>=CLASS_DESCRIPTOR && input.LA(1)<=ARRAY_DESCRIPTOR) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set90));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference_type_descriptor"

    public static class integer_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_literal"
    // org/jf/smali/smaliParser.g:486:1: integer_literal : ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] | INTEGER_LITERAL );
    public final smaliParser.integer_literal_return integer_literal() throws RecognitionException {
        smaliParser.integer_literal_return retval = new smaliParser.integer_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POSITIVE_INTEGER_LITERAL91=null;
        Token NEGATIVE_INTEGER_LITERAL92=null;
        Token INTEGER_LITERAL93=null;

        CommonTree POSITIVE_INTEGER_LITERAL91_tree=null;
        CommonTree NEGATIVE_INTEGER_LITERAL92_tree=null;
        CommonTree INTEGER_LITERAL93_tree=null;
        RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
        RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");

        try {
            // org/jf/smali/smaliParser.g:487:2: ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] | INTEGER_LITERAL )
            int alt12=3;
            switch ( input.LA(1) ) {
            case POSITIVE_INTEGER_LITERAL:
                {
                alt12=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
                {
                alt12=2;
                }
                break;
            case INTEGER_LITERAL:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // org/jf/smali/smaliParser.g:487:4: POSITIVE_INTEGER_LITERAL
                    {
                    POSITIVE_INTEGER_LITERAL91=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal1553);  
                    stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 487:29: -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, POSITIVE_INTEGER_LITERAL91));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:488:4: NEGATIVE_INTEGER_LITERAL
                    {
                    NEGATIVE_INTEGER_LITERAL92=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal1563);  
                    stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 488:29: -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, NEGATIVE_INTEGER_LITERAL92));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:489:4: INTEGER_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER_LITERAL93=(Token)match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integer_literal1573); 
                    INTEGER_LITERAL93_tree = (CommonTree)adaptor.create(INTEGER_LITERAL93);
                    adaptor.addChild(root_0, INTEGER_LITERAL93_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer_literal"

    public static class float_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "float_literal"
    // org/jf/smali/smaliParser.g:491:1: float_literal : ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL );
    public final smaliParser.float_literal_return float_literal() throws RecognitionException {
        smaliParser.float_literal_return retval = new smaliParser.float_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FLOAT_LITERAL_OR_ID94=null;
        Token FLOAT_LITERAL95=null;

        CommonTree FLOAT_LITERAL_OR_ID94_tree=null;
        CommonTree FLOAT_LITERAL95_tree=null;
        RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:492:2: ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL )
            int alt13=2;
            switch ( input.LA(1) ) {
            case FLOAT_LITERAL_OR_ID:
                {
                alt13=1;
                }
                break;
            case FLOAT_LITERAL:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // org/jf/smali/smaliParser.g:492:4: FLOAT_LITERAL_OR_ID
                    {
                    FLOAT_LITERAL_OR_ID94=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal1582);  
                    stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 492:24: -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT_LITERAL, FLOAT_LITERAL_OR_ID94));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:493:4: FLOAT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT_LITERAL95=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_float_literal1592); 
                    FLOAT_LITERAL95_tree = (CommonTree)adaptor.create(FLOAT_LITERAL95);
                    adaptor.addChild(root_0, FLOAT_LITERAL95_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "float_literal"

    public static class double_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "double_literal"
    // org/jf/smali/smaliParser.g:495:1: double_literal : ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL );
    public final smaliParser.double_literal_return double_literal() throws RecognitionException {
        smaliParser.double_literal_return retval = new smaliParser.double_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOUBLE_LITERAL_OR_ID96=null;
        Token DOUBLE_LITERAL97=null;

        CommonTree DOUBLE_LITERAL_OR_ID96_tree=null;
        CommonTree DOUBLE_LITERAL97_tree=null;
        RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:496:2: ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL )
            int alt14=2;
            switch ( input.LA(1) ) {
            case DOUBLE_LITERAL_OR_ID:
                {
                alt14=1;
                }
                break;
            case DOUBLE_LITERAL:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // org/jf/smali/smaliParser.g:496:4: DOUBLE_LITERAL_OR_ID
                    {
                    DOUBLE_LITERAL_OR_ID96=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal1601);  
                    stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 496:25: -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DOUBLE_LITERAL, DOUBLE_LITERAL_OR_ID96));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:497:4: DOUBLE_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DOUBLE_LITERAL97=(Token)match(input,DOUBLE_LITERAL,FOLLOW_DOUBLE_LITERAL_in_double_literal1611); 
                    DOUBLE_LITERAL97_tree = (CommonTree)adaptor.create(DOUBLE_LITERAL97);
                    adaptor.addChild(root_0, DOUBLE_LITERAL97_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "double_literal"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // org/jf/smali/smaliParser.g:499:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
    public final smaliParser.literal_return literal() throws RecognitionException {
        smaliParser.literal_return retval = new smaliParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LONG_LITERAL98=null;
        Token SHORT_LITERAL100=null;
        Token BYTE_LITERAL101=null;
        Token CHAR_LITERAL104=null;
        Token STRING_LITERAL105=null;
        Token BOOL_LITERAL106=null;
        Token NULL_LITERAL107=null;
        smaliParser.integer_literal_return integer_literal99 = null;

        smaliParser.float_literal_return float_literal102 = null;

        smaliParser.double_literal_return double_literal103 = null;

        smaliParser.array_literal_return array_literal108 = null;

        smaliParser.subannotation_return subannotation109 = null;

        smaliParser.type_field_method_literal_return type_field_method_literal110 = null;

        smaliParser.enum_literal_return enum_literal111 = null;


        CommonTree LONG_LITERAL98_tree=null;
        CommonTree SHORT_LITERAL100_tree=null;
        CommonTree BYTE_LITERAL101_tree=null;
        CommonTree CHAR_LITERAL104_tree=null;
        CommonTree STRING_LITERAL105_tree=null;
        CommonTree BOOL_LITERAL106_tree=null;
        CommonTree NULL_LITERAL107_tree=null;

        try {
            // org/jf/smali/smaliParser.g:500:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
            int alt15=14;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt15=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt15=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt15=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt15=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt15=5;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
            case DOUBLE_LITERAL:
                {
                alt15=6;
                }
                break;
            case CHAR_LITERAL:
                {
                alt15=7;
                }
                break;
            case STRING_LITERAL:
                {
                alt15=8;
                }
                break;
            case BOOL_LITERAL:
                {
                alt15=9;
                }
                break;
            case NULL_LITERAL:
                {
                alt15=10;
                }
                break;
            case OPEN_BRACE:
                {
                alt15=11;
                }
                break;
            case SUBANNOTATION_DIRECTIVE:
                {
                alt15=12;
                }
                break;
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
                {
                alt15=13;
                }
                break;
            case ENUM_DIRECTIVE:
                {
                alt15=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // org/jf/smali/smaliParser.g:500:4: LONG_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LONG_LITERAL98=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1620); 
                    LONG_LITERAL98_tree = (CommonTree)adaptor.create(LONG_LITERAL98);
                    adaptor.addChild(root_0, LONG_LITERAL98_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:501:4: integer_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integer_literal_in_literal1625);
                    integer_literal99=integer_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, integer_literal99.getTree());

                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:502:4: SHORT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SHORT_LITERAL100=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1630); 
                    SHORT_LITERAL100_tree = (CommonTree)adaptor.create(SHORT_LITERAL100);
                    adaptor.addChild(root_0, SHORT_LITERAL100_tree);


                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:503:4: BYTE_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BYTE_LITERAL101=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1635); 
                    BYTE_LITERAL101_tree = (CommonTree)adaptor.create(BYTE_LITERAL101);
                    adaptor.addChild(root_0, BYTE_LITERAL101_tree);


                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:504:4: float_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_literal1640);
                    float_literal102=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal102.getTree());

                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:505:4: double_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_double_literal_in_literal1645);
                    double_literal103=double_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, double_literal103.getTree());

                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:506:4: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL104=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1650); 
                    CHAR_LITERAL104_tree = (CommonTree)adaptor.create(CHAR_LITERAL104);
                    adaptor.addChild(root_0, CHAR_LITERAL104_tree);


                    }
                    break;
                case 8 :
                    // org/jf/smali/smaliParser.g:507:4: STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING_LITERAL105=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1655); 
                    STRING_LITERAL105_tree = (CommonTree)adaptor.create(STRING_LITERAL105);
                    adaptor.addChild(root_0, STRING_LITERAL105_tree);


                    }
                    break;
                case 9 :
                    // org/jf/smali/smaliParser.g:508:4: BOOL_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOL_LITERAL106=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1660); 
                    BOOL_LITERAL106_tree = (CommonTree)adaptor.create(BOOL_LITERAL106);
                    adaptor.addChild(root_0, BOOL_LITERAL106_tree);


                    }
                    break;
                case 10 :
                    // org/jf/smali/smaliParser.g:509:4: NULL_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NULL_LITERAL107=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1665); 
                    NULL_LITERAL107_tree = (CommonTree)adaptor.create(NULL_LITERAL107);
                    adaptor.addChild(root_0, NULL_LITERAL107_tree);


                    }
                    break;
                case 11 :
                    // org/jf/smali/smaliParser.g:510:4: array_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_array_literal_in_literal1670);
                    array_literal108=array_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, array_literal108.getTree());

                    }
                    break;
                case 12 :
                    // org/jf/smali/smaliParser.g:511:4: subannotation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_subannotation_in_literal1675);
                    subannotation109=subannotation();

                    state._fsp--;

                    adaptor.addChild(root_0, subannotation109.getTree());

                    }
                    break;
                case 13 :
                    // org/jf/smali/smaliParser.g:512:4: type_field_method_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_field_method_literal_in_literal1680);
                    type_field_method_literal110=type_field_method_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, type_field_method_literal110.getTree());

                    }
                    break;
                case 14 :
                    // org/jf/smali/smaliParser.g:513:4: enum_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_literal_in_literal1685);
                    enum_literal111=enum_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_literal111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class integral_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integral_literal"
    // org/jf/smali/smaliParser.g:515:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
    public final smaliParser.integral_literal_return integral_literal() throws RecognitionException {
        smaliParser.integral_literal_return retval = new smaliParser.integral_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LONG_LITERAL112=null;
        Token SHORT_LITERAL114=null;
        Token CHAR_LITERAL115=null;
        Token BYTE_LITERAL116=null;
        smaliParser.integer_literal_return integer_literal113 = null;


        CommonTree LONG_LITERAL112_tree=null;
        CommonTree SHORT_LITERAL114_tree=null;
        CommonTree CHAR_LITERAL115_tree=null;
        CommonTree BYTE_LITERAL116_tree=null;

        try {
            // org/jf/smali/smaliParser.g:516:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
            int alt16=5;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt16=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt16=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt16=3;
                }
                break;
            case CHAR_LITERAL:
                {
                alt16=4;
                }
                break;
            case BYTE_LITERAL:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // org/jf/smali/smaliParser.g:516:4: LONG_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LONG_LITERAL112=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1694); 
                    LONG_LITERAL112_tree = (CommonTree)adaptor.create(LONG_LITERAL112);
                    adaptor.addChild(root_0, LONG_LITERAL112_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:517:4: integer_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integer_literal_in_integral_literal1699);
                    integer_literal113=integer_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, integer_literal113.getTree());

                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:518:4: SHORT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SHORT_LITERAL114=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1704); 
                    SHORT_LITERAL114_tree = (CommonTree)adaptor.create(SHORT_LITERAL114);
                    adaptor.addChild(root_0, SHORT_LITERAL114_tree);


                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:519:4: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL115=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1709); 
                    CHAR_LITERAL115_tree = (CommonTree)adaptor.create(CHAR_LITERAL115);
                    adaptor.addChild(root_0, CHAR_LITERAL115_tree);


                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:520:4: BYTE_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BYTE_LITERAL116=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1714); 
                    BYTE_LITERAL116_tree = (CommonTree)adaptor.create(BYTE_LITERAL116);
                    adaptor.addChild(root_0, BYTE_LITERAL116_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integral_literal"

    public static class fixed_32bit_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixed_32bit_literal"
    // org/jf/smali/smaliParser.g:522:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final smaliParser.fixed_32bit_literal_return fixed_32bit_literal() throws RecognitionException {
        smaliParser.fixed_32bit_literal_return retval = new smaliParser.fixed_32bit_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LONG_LITERAL117=null;
        Token SHORT_LITERAL119=null;
        Token BYTE_LITERAL120=null;
        Token CHAR_LITERAL122=null;
        Token BOOL_LITERAL123=null;
        smaliParser.integer_literal_return integer_literal118 = null;

        smaliParser.float_literal_return float_literal121 = null;


        CommonTree LONG_LITERAL117_tree=null;
        CommonTree SHORT_LITERAL119_tree=null;
        CommonTree BYTE_LITERAL120_tree=null;
        CommonTree CHAR_LITERAL122_tree=null;
        CommonTree BOOL_LITERAL123_tree=null;

        try {
            // org/jf/smali/smaliParser.g:523:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt17=7;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt17=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt17=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt17=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt17=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt17=5;
                }
                break;
            case CHAR_LITERAL:
                {
                alt17=6;
                }
                break;
            case BOOL_LITERAL:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // org/jf/smali/smaliParser.g:523:4: LONG_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LONG_LITERAL117=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1723); 
                    LONG_LITERAL117_tree = (CommonTree)adaptor.create(LONG_LITERAL117);
                    adaptor.addChild(root_0, LONG_LITERAL117_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:524:4: integer_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1728);
                    integer_literal118=integer_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, integer_literal118.getTree());

                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:525:4: SHORT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SHORT_LITERAL119=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1733); 
                    SHORT_LITERAL119_tree = (CommonTree)adaptor.create(SHORT_LITERAL119);
                    adaptor.addChild(root_0, SHORT_LITERAL119_tree);


                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:526:4: BYTE_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BYTE_LITERAL120=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1738); 
                    BYTE_LITERAL120_tree = (CommonTree)adaptor.create(BYTE_LITERAL120);
                    adaptor.addChild(root_0, BYTE_LITERAL120_tree);


                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:527:4: float_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1743);
                    float_literal121=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal121.getTree());

                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:528:4: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL122=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1748); 
                    CHAR_LITERAL122_tree = (CommonTree)adaptor.create(CHAR_LITERAL122);
                    adaptor.addChild(root_0, CHAR_LITERAL122_tree);


                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:529:4: BOOL_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOL_LITERAL123=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1753); 
                    BOOL_LITERAL123_tree = (CommonTree)adaptor.create(BOOL_LITERAL123);
                    adaptor.addChild(root_0, BOOL_LITERAL123_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fixed_32bit_literal"

    public static class fixed_literal_return extends ParserRuleReturnScope {
        public int size;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixed_literal"
    // org/jf/smali/smaliParser.g:531:1: fixed_literal returns [int size] : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final smaliParser.fixed_literal_return fixed_literal() throws RecognitionException {
        smaliParser.fixed_literal_return retval = new smaliParser.fixed_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LONG_LITERAL125=null;
        Token SHORT_LITERAL126=null;
        Token BYTE_LITERAL127=null;
        Token CHAR_LITERAL130=null;
        Token BOOL_LITERAL131=null;
        smaliParser.integer_literal_return integer_literal124 = null;

        smaliParser.float_literal_return float_literal128 = null;

        smaliParser.double_literal_return double_literal129 = null;


        CommonTree LONG_LITERAL125_tree=null;
        CommonTree SHORT_LITERAL126_tree=null;
        CommonTree BYTE_LITERAL127_tree=null;
        CommonTree CHAR_LITERAL130_tree=null;
        CommonTree BOOL_LITERAL131_tree=null;

        try {
            // org/jf/smali/smaliParser.g:532:2: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt18=8;
            switch ( input.LA(1) ) {
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt18=1;
                }
                break;
            case LONG_LITERAL:
                {
                alt18=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt18=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt18=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt18=5;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
            case DOUBLE_LITERAL:
                {
                alt18=6;
                }
                break;
            case CHAR_LITERAL:
                {
                alt18=7;
                }
                break;
            case BOOL_LITERAL:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // org/jf/smali/smaliParser.g:532:4: integer_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integer_literal_in_fixed_literal1765);
                    integer_literal124=integer_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, integer_literal124.getTree());
                    retval.size = 4;

                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:533:4: LONG_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LONG_LITERAL125=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1772); 
                    LONG_LITERAL125_tree = (CommonTree)adaptor.create(LONG_LITERAL125);
                    adaptor.addChild(root_0, LONG_LITERAL125_tree);

                    retval.size = 8;

                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:534:4: SHORT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SHORT_LITERAL126=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1779); 
                    SHORT_LITERAL126_tree = (CommonTree)adaptor.create(SHORT_LITERAL126);
                    adaptor.addChild(root_0, SHORT_LITERAL126_tree);

                    retval.size = 2;

                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:535:4: BYTE_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BYTE_LITERAL127=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1786); 
                    BYTE_LITERAL127_tree = (CommonTree)adaptor.create(BYTE_LITERAL127);
                    adaptor.addChild(root_0, BYTE_LITERAL127_tree);

                    retval.size = 1;

                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:536:4: float_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_float_literal_in_fixed_literal1793);
                    float_literal128=float_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, float_literal128.getTree());
                    retval.size = 4;

                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:537:4: double_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_double_literal_in_fixed_literal1800);
                    double_literal129=double_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, double_literal129.getTree());
                    retval.size = 8;

                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:538:4: CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR_LITERAL130=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1807); 
                    CHAR_LITERAL130_tree = (CommonTree)adaptor.create(CHAR_LITERAL130);
                    adaptor.addChild(root_0, CHAR_LITERAL130_tree);

                    retval.size = 2;

                    }
                    break;
                case 8 :
                    // org/jf/smali/smaliParser.g:539:4: BOOL_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOL_LITERAL131=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1814); 
                    BOOL_LITERAL131_tree = (CommonTree)adaptor.create(BOOL_LITERAL131);
                    adaptor.addChild(root_0, BOOL_LITERAL131_tree);

                    retval.size = 1;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fixed_literal"

    public static class array_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_literal"
    // org/jf/smali/smaliParser.g:541:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* | ) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) ;
    public final smaliParser.array_literal_return array_literal() throws RecognitionException {
        smaliParser.array_literal_return retval = new smaliParser.array_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OPEN_BRACE132=null;
        Token COMMA134=null;
        Token CLOSE_BRACE136=null;
        smaliParser.literal_return literal133 = null;

        smaliParser.literal_return literal135 = null;


        CommonTree OPEN_BRACE132_tree=null;
        CommonTree COMMA134_tree=null;
        CommonTree CLOSE_BRACE136_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // org/jf/smali/smaliParser.g:542:2: ( OPEN_BRACE ( literal ( COMMA literal )* | ) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) )
            // org/jf/smali/smaliParser.g:542:4: OPEN_BRACE ( literal ( COMMA literal )* | ) CLOSE_BRACE
            {
            OPEN_BRACE132=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1825);  
            stream_OPEN_BRACE.add(OPEN_BRACE132);

            // org/jf/smali/smaliParser.g:542:15: ( literal ( COMMA literal )* | )
            int alt20=2;
            switch ( input.LA(1) ) {
            case SUBANNOTATION_DIRECTIVE:
            case ENUM_DIRECTIVE:
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case LONG_LITERAL:
            case SHORT_LITERAL:
            case BYTE_LITERAL:
            case FLOAT_LITERAL_OR_ID:
            case DOUBLE_LITERAL_OR_ID:
            case FLOAT_LITERAL:
            case DOUBLE_LITERAL:
            case BOOL_LITERAL:
            case NULL_LITERAL:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
            case OPEN_BRACE:
            case INTEGER_LITERAL:
                {
                alt20=1;
                }
                break;
            case CLOSE_BRACE:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // org/jf/smali/smaliParser.g:542:16: literal ( COMMA literal )*
                    {
                    pushFollow(FOLLOW_literal_in_array_literal1828);
                    literal133=literal();

                    state._fsp--;

                    stream_literal.add(literal133.getTree());
                    // org/jf/smali/smaliParser.g:542:24: ( COMMA literal )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:542:25: COMMA literal
                    	    {
                    	    COMMA134=(Token)match(input,COMMA,FOLLOW_COMMA_in_array_literal1831);  
                    	    stream_COMMA.add(COMMA134);

                    	    pushFollow(FOLLOW_literal_in_array_literal1833);
                    	    literal135=literal();

                    	    state._fsp--;

                    	    stream_literal.add(literal135.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:542:43: 
                    {
                    }
                    break;

            }

            CLOSE_BRACE136=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1841);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE136);



            // AST REWRITE
            // elements: literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 543:3: -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
            {
                // org/jf/smali/smaliParser.g:543:6: ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ARRAY, ((Token)retval.start), "I_ENCODED_ARRAY"), root_1);

                // org/jf/smali/smaliParser.g:543:51: ( literal )*
                while ( stream_literal.hasNext() ) {
                    adaptor.addChild(root_1, stream_literal.nextTree());

                }
                stream_literal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array_literal"

    public static class annotation_element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation_element"
    // org/jf/smali/smaliParser.g:545:1: annotation_element : simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) ;
    public final smaliParser.annotation_element_return annotation_element() throws RecognitionException {
        smaliParser.annotation_element_return retval = new smaliParser.annotation_element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUAL138=null;
        smaliParser.simple_name_return simple_name137 = null;

        smaliParser.literal_return literal139 = null;


        CommonTree EQUAL138_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // org/jf/smali/smaliParser.g:546:2: ( simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) )
            // org/jf/smali/smaliParser.g:546:4: simple_name EQUAL literal
            {
            pushFollow(FOLLOW_simple_name_in_annotation_element1862);
            simple_name137=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name137.getTree());
            EQUAL138=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1864);  
            stream_EQUAL.add(EQUAL138);

            pushFollow(FOLLOW_literal_in_annotation_element1866);
            literal139=literal();

            state._fsp--;

            stream_literal.add(literal139.getTree());


            // AST REWRITE
            // elements: literal, simple_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 547:3: -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
            {
                // org/jf/smali/smaliParser.g:547:6: ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION_ELEMENT, ((Token)retval.start), "I_ANNOTATION_ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_simple_name.nextTree());
                adaptor.addChild(root_1, stream_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation_element"

    public static class annotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // org/jf/smali/smaliParser.g:549:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) ;
    public final smaliParser.annotation_return annotation() throws RecognitionException {
        smaliParser.annotation_return retval = new smaliParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ANNOTATION_DIRECTIVE140=null;
        Token ANNOTATION_VISIBILITY141=null;
        Token CLASS_DESCRIPTOR142=null;
        Token END_ANNOTATION_DIRECTIVE144=null;
        smaliParser.annotation_element_return annotation_element143 = null;


        CommonTree ANNOTATION_DIRECTIVE140_tree=null;
        CommonTree ANNOTATION_VISIBILITY141_tree=null;
        CommonTree CLASS_DESCRIPTOR142_tree=null;
        CommonTree END_ANNOTATION_DIRECTIVE144_tree=null;
        RewriteRuleTokenStream stream_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_DIRECTIVE");
        RewriteRuleTokenStream stream_END_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ANNOTATION_DIRECTIVE");
        RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
        RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
        RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");
        try {
            // org/jf/smali/smaliParser.g:550:2: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) )
            // org/jf/smali/smaliParser.g:550:4: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
            {
            ANNOTATION_DIRECTIVE140=(Token)match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1888);  
            stream_ANNOTATION_DIRECTIVE.add(ANNOTATION_DIRECTIVE140);

            ANNOTATION_VISIBILITY141=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1890);  
            stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY141);

            CLASS_DESCRIPTOR142=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation1892);  
            stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR142);

            // org/jf/smali/smaliParser.g:551:3: ( annotation_element )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case POSITIVE_INTEGER_LITERAL:
                case NEGATIVE_INTEGER_LITERAL:
                case FLOAT_LITERAL_OR_ID:
                case DOUBLE_LITERAL_OR_ID:
                case BOOL_LITERAL:
                case NULL_LITERAL:
                case REGISTER:
                case ANNOTATION_VISIBILITY:
                case ACCESS_SPEC:
                case INSTRUCTION_FORMAT10t:
                case INSTRUCTION_FORMAT10x:
                case INSTRUCTION_FORMAT11x:
                case INSTRUCTION_FORMAT12x_OR_ID:
                case INSTRUCTION_FORMAT21c_FIELD:
                case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                case INSTRUCTION_FORMAT21c_STRING:
                case INSTRUCTION_FORMAT21c_TYPE:
                case INSTRUCTION_FORMAT21t:
                case INSTRUCTION_FORMAT22c_FIELD:
                case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                case INSTRUCTION_FORMAT22c_TYPE:
                case INSTRUCTION_FORMAT22cs_FIELD:
                case INSTRUCTION_FORMAT22s_OR_ID:
                case INSTRUCTION_FORMAT22t:
                case INSTRUCTION_FORMAT23x:
                case INSTRUCTION_FORMAT31i_OR_ID:
                case INSTRUCTION_FORMAT31t:
                case INSTRUCTION_FORMAT35c_METHOD:
                case INSTRUCTION_FORMAT35c_TYPE:
                case INSTRUCTION_FORMAT35s_METHOD:
                case INSTRUCTION_FORMAT35ms_METHOD:
                case INSTRUCTION_FORMAT51l:
                case PRIMITIVE_TYPE:
                case VOID_TYPE:
                case PARAM_LIST_OR_ID:
                case SIMPLE_NAME:
                case INTEGER_LITERAL:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:551:3: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation1896);
            	    annotation_element143=annotation_element();

            	    state._fsp--;

            	    stream_annotation_element.add(annotation_element143.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            END_ANNOTATION_DIRECTIVE144=(Token)match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1899);  
            stream_END_ANNOTATION_DIRECTIVE.add(END_ANNOTATION_DIRECTIVE144);



            // AST REWRITE
            // elements: CLASS_DESCRIPTOR, annotation_element, ANNOTATION_VISIBILITY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 552:3: -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
            {
                // org/jf/smali/smaliParser.g:552:6: ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION, ((Token)retval.start), "I_ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_ANNOTATION_VISIBILITY.nextNode());
                // org/jf/smali/smaliParser.g:552:67: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, ((Token)retval.start), "I_SUBANNOTATION"), root_2);

                adaptor.addChild(root_2, stream_CLASS_DESCRIPTOR.nextNode());
                // org/jf/smali/smaliParser.g:552:129: ( annotation_element )*
                while ( stream_annotation_element.hasNext() ) {
                    adaptor.addChild(root_2, stream_annotation_element.nextTree());

                }
                stream_annotation_element.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class subannotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subannotation"
    // org/jf/smali/smaliParser.g:554:1: subannotation : SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ;
    public final smaliParser.subannotation_return subannotation() throws RecognitionException {
        smaliParser.subannotation_return retval = new smaliParser.subannotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SUBANNOTATION_DIRECTIVE145=null;
        Token CLASS_DESCRIPTOR146=null;
        Token END_SUBANNOTATION_DIRECTIVE148=null;
        smaliParser.annotation_element_return annotation_element147 = null;


        CommonTree SUBANNOTATION_DIRECTIVE145_tree=null;
        CommonTree CLASS_DESCRIPTOR146_tree=null;
        CommonTree END_SUBANNOTATION_DIRECTIVE148_tree=null;
        RewriteRuleTokenStream stream_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUBANNOTATION_DIRECTIVE");
        RewriteRuleTokenStream stream_END_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SUBANNOTATION_DIRECTIVE");
        RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
        RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");
        try {
            // org/jf/smali/smaliParser.g:555:2: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
            // org/jf/smali/smaliParser.g:555:4: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
            {
            SUBANNOTATION_DIRECTIVE145=(Token)match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1929);  
            stream_SUBANNOTATION_DIRECTIVE.add(SUBANNOTATION_DIRECTIVE145);

            CLASS_DESCRIPTOR146=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation1931);  
            stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR146);

            // org/jf/smali/smaliParser.g:555:45: ( annotation_element )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case POSITIVE_INTEGER_LITERAL:
                case NEGATIVE_INTEGER_LITERAL:
                case FLOAT_LITERAL_OR_ID:
                case DOUBLE_LITERAL_OR_ID:
                case BOOL_LITERAL:
                case NULL_LITERAL:
                case REGISTER:
                case ANNOTATION_VISIBILITY:
                case ACCESS_SPEC:
                case INSTRUCTION_FORMAT10t:
                case INSTRUCTION_FORMAT10x:
                case INSTRUCTION_FORMAT11x:
                case INSTRUCTION_FORMAT12x_OR_ID:
                case INSTRUCTION_FORMAT21c_FIELD:
                case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                case INSTRUCTION_FORMAT21c_STRING:
                case INSTRUCTION_FORMAT21c_TYPE:
                case INSTRUCTION_FORMAT21t:
                case INSTRUCTION_FORMAT22c_FIELD:
                case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                case INSTRUCTION_FORMAT22c_TYPE:
                case INSTRUCTION_FORMAT22cs_FIELD:
                case INSTRUCTION_FORMAT22s_OR_ID:
                case INSTRUCTION_FORMAT22t:
                case INSTRUCTION_FORMAT23x:
                case INSTRUCTION_FORMAT31i_OR_ID:
                case INSTRUCTION_FORMAT31t:
                case INSTRUCTION_FORMAT35c_METHOD:
                case INSTRUCTION_FORMAT35c_TYPE:
                case INSTRUCTION_FORMAT35s_METHOD:
                case INSTRUCTION_FORMAT35ms_METHOD:
                case INSTRUCTION_FORMAT51l:
                case PRIMITIVE_TYPE:
                case VOID_TYPE:
                case PARAM_LIST_OR_ID:
                case SIMPLE_NAME:
                case INTEGER_LITERAL:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:555:45: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_subannotation1933);
            	    annotation_element147=annotation_element();

            	    state._fsp--;

            	    stream_annotation_element.add(annotation_element147.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            END_SUBANNOTATION_DIRECTIVE148=(Token)match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1936);  
            stream_END_SUBANNOTATION_DIRECTIVE.add(END_SUBANNOTATION_DIRECTIVE148);



            // AST REWRITE
            // elements: annotation_element, CLASS_DESCRIPTOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 556:3: -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
            {
                // org/jf/smali/smaliParser.g:556:6: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, ((Token)retval.start), "I_SUBANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
                // org/jf/smali/smaliParser.g:556:68: ( annotation_element )*
                while ( stream_annotation_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotation_element.nextTree());

                }
                stream_annotation_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subannotation"

    public static class enum_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_literal"
    // org/jf/smali/smaliParser.g:558:1: enum_literal : ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor ) ;
    public final smaliParser.enum_literal_return enum_literal() throws RecognitionException {
        smaliParser.enum_literal_return retval = new smaliParser.enum_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ENUM_DIRECTIVE149=null;
        Token ARROW151=null;
        Token COLON153=null;
        smaliParser.reference_type_descriptor_return reference_type_descriptor150 = null;

        smaliParser.simple_name_return simple_name152 = null;

        smaliParser.reference_type_descriptor_return reference_type_descriptor154 = null;


        CommonTree ENUM_DIRECTIVE149_tree=null;
        CommonTree ARROW151_tree=null;
        CommonTree COLON153_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ENUM_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ENUM_DIRECTIVE");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:559:2: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor ) )
            // org/jf/smali/smaliParser.g:559:4: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
            {
            ENUM_DIRECTIVE149=(Token)match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1959);  
            stream_ENUM_DIRECTIVE.add(ENUM_DIRECTIVE149);

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1961);
            reference_type_descriptor150=reference_type_descriptor();

            state._fsp--;

            stream_reference_type_descriptor.add(reference_type_descriptor150.getTree());
            ARROW151=(Token)match(input,ARROW,FOLLOW_ARROW_in_enum_literal1963);  
            stream_ARROW.add(ARROW151);

            pushFollow(FOLLOW_simple_name_in_enum_literal1965);
            simple_name152=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name152.getTree());
            COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_enum_literal1967);  
            stream_COLON.add(COLON153);

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1969);
            reference_type_descriptor154=reference_type_descriptor();

            state._fsp--;

            stream_reference_type_descriptor.add(reference_type_descriptor154.getTree());


            // AST REWRITE
            // elements: reference_type_descriptor, simple_name, reference_type_descriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 560:2: -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor )
            {
                // org/jf/smali/smaliParser.g:560:5: ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ENUM, "I_ENCODED_ENUM"), root_1);

                adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
                adaptor.addChild(root_1, stream_simple_name.nextTree());
                adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_literal"

    public static class type_field_method_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_field_method_literal"
    // org/jf/smali/smaliParser.g:562:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) ) | -> reference_type_descriptor ) | PRIMITIVE_TYPE | VOID_TYPE );
    public final smaliParser.type_field_method_literal_return type_field_method_literal() throws RecognitionException {
        smaliParser.type_field_method_literal_return retval = new smaliParser.type_field_method_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARROW156=null;
        Token COLON158=null;
        Token PRIMITIVE_TYPE162=null;
        Token VOID_TYPE163=null;
        smaliParser.reference_type_descriptor_return reference_type_descriptor155 = null;

        smaliParser.simple_name_return simple_name157 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor159 = null;

        smaliParser.method_name_return method_name160 = null;

        smaliParser.method_prototype_return method_prototype161 = null;


        CommonTree ARROW156_tree=null;
        CommonTree COLON158_tree=null;
        CommonTree PRIMITIVE_TYPE162_tree=null;
        CommonTree VOID_TYPE163_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
        RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");
        RewriteRuleSubtreeStream stream_method_name=new RewriteRuleSubtreeStream(adaptor,"rule method_name");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:563:2: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) ) | -> reference_type_descriptor ) | PRIMITIVE_TYPE | VOID_TYPE )
            int alt25=3;
            switch ( input.LA(1) ) {
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
                {
                alt25=1;
                }
                break;
            case PRIMITIVE_TYPE:
                {
                alt25=2;
                }
                break;
            case VOID_TYPE:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // org/jf/smali/smaliParser.g:563:4: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) ) | -> reference_type_descriptor )
                    {
                    pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1991);
                    reference_type_descriptor155=reference_type_descriptor();

                    state._fsp--;

                    stream_reference_type_descriptor.add(reference_type_descriptor155.getTree());
                    // org/jf/smali/smaliParser.g:564:3: ( ARROW ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) ) | -> reference_type_descriptor )
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case ARROW:
                        {
                        alt24=1;
                        }
                        break;
                    case EOF:
                    case CLASS_DIRECTIVE:
                    case SUPER_DIRECTIVE:
                    case IMPLEMENTS_DIRECTIVE:
                    case SOURCE_DIRECTIVE:
                    case FIELD_DIRECTIVE:
                    case END_FIELD_DIRECTIVE:
                    case END_SUBANNOTATION_DIRECTIVE:
                    case ANNOTATION_DIRECTIVE:
                    case END_ANNOTATION_DIRECTIVE:
                    case METHOD_DIRECTIVE:
                    case POSITIVE_INTEGER_LITERAL:
                    case NEGATIVE_INTEGER_LITERAL:
                    case FLOAT_LITERAL_OR_ID:
                    case DOUBLE_LITERAL_OR_ID:
                    case BOOL_LITERAL:
                    case NULL_LITERAL:
                    case REGISTER:
                    case ANNOTATION_VISIBILITY:
                    case ACCESS_SPEC:
                    case INSTRUCTION_FORMAT10t:
                    case INSTRUCTION_FORMAT10x:
                    case INSTRUCTION_FORMAT11x:
                    case INSTRUCTION_FORMAT12x_OR_ID:
                    case INSTRUCTION_FORMAT21c_FIELD:
                    case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                    case INSTRUCTION_FORMAT21c_STRING:
                    case INSTRUCTION_FORMAT21c_TYPE:
                    case INSTRUCTION_FORMAT21t:
                    case INSTRUCTION_FORMAT22c_FIELD:
                    case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                    case INSTRUCTION_FORMAT22c_TYPE:
                    case INSTRUCTION_FORMAT22cs_FIELD:
                    case INSTRUCTION_FORMAT22s_OR_ID:
                    case INSTRUCTION_FORMAT22t:
                    case INSTRUCTION_FORMAT23x:
                    case INSTRUCTION_FORMAT31i_OR_ID:
                    case INSTRUCTION_FORMAT31t:
                    case INSTRUCTION_FORMAT35c_METHOD:
                    case INSTRUCTION_FORMAT35c_TYPE:
                    case INSTRUCTION_FORMAT35s_METHOD:
                    case INSTRUCTION_FORMAT35ms_METHOD:
                    case INSTRUCTION_FORMAT51l:
                    case PRIMITIVE_TYPE:
                    case VOID_TYPE:
                    case PARAM_LIST_OR_ID:
                    case SIMPLE_NAME:
                    case COMMA:
                    case CLOSE_BRACE:
                    case INTEGER_LITERAL:
                        {
                        alt24=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // org/jf/smali/smaliParser.g:564:5: ARROW ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) )
                            {
                            ARROW156=(Token)match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1997);  
                            stream_ARROW.add(ARROW156);

                            // org/jf/smali/smaliParser.g:565:4: ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) )
                            int alt23=2;
                            alt23 = dfa23.predict(input);
                            switch (alt23) {
                                case 1 :
                                    // org/jf/smali/smaliParser.g:565:6: simple_name COLON nonvoid_type_descriptor
                                    {
                                    pushFollow(FOLLOW_simple_name_in_type_field_method_literal2004);
                                    simple_name157=simple_name();

                                    state._fsp--;

                                    stream_simple_name.add(simple_name157.getTree());
                                    COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_type_field_method_literal2006);  
                                    stream_COLON.add(COLON158);

                                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal2008);
                                    nonvoid_type_descriptor159=nonvoid_type_descriptor();

                                    state._fsp--;

                                    stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor159.getTree());


                                    // AST REWRITE
                                    // elements: nonvoid_type_descriptor, reference_type_descriptor, simple_name
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 565:48: -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor )
                                    {
                                        // org/jf/smali/smaliParser.g:565:51: ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_FIELD, "I_ENCODED_FIELD"), root_1);

                                        adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
                                        adaptor.addChild(root_1, stream_simple_name.nextTree());
                                        adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;
                                    }
                                    break;
                                case 2 :
                                    // org/jf/smali/smaliParser.g:566:6: method_name method_prototype
                                    {
                                    pushFollow(FOLLOW_method_name_in_type_field_method_literal2027);
                                    method_name160=method_name();

                                    state._fsp--;

                                    stream_method_name.add(method_name160.getTree());
                                    pushFollow(FOLLOW_method_prototype_in_type_field_method_literal2029);
                                    method_prototype161=method_prototype();

                                    state._fsp--;

                                    stream_method_prototype.add(method_prototype161.getTree());


                                    // AST REWRITE
                                    // elements: reference_type_descriptor, method_prototype, method_name
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 566:35: -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype )
                                    {
                                        // org/jf/smali/smaliParser.g:566:38: ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_METHOD, "I_ENCODED_METHOD"), root_1);

                                        adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
                                        adaptor.addChild(root_1, stream_method_name.nextTree());
                                        adaptor.addChild(root_1, stream_method_prototype.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }

                                    retval.tree = root_0;
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // org/jf/smali/smaliParser.g:568:5: 
                            {

                            // AST REWRITE
                            // elements: reference_type_descriptor
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 568:5: -> reference_type_descriptor
                            {
                                adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:570:4: PRIMITIVE_TYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PRIMITIVE_TYPE162=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal2063); 
                    PRIMITIVE_TYPE162_tree = (CommonTree)adaptor.create(PRIMITIVE_TYPE162);
                    adaptor.addChild(root_0, PRIMITIVE_TYPE162_tree);


                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:571:4: VOID_TYPE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VOID_TYPE163=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal2068); 
                    VOID_TYPE163_tree = (CommonTree)adaptor.create(VOID_TYPE163);
                    adaptor.addChild(root_0, VOID_TYPE163_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_field_method_literal"

    public static class fully_qualified_method_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_method"
    // org/jf/smali/smaliParser.g:573:1: fully_qualified_method : reference_type_descriptor ARROW method_name method_prototype -> reference_type_descriptor method_name method_prototype ;
    public final smaliParser.fully_qualified_method_return fully_qualified_method() throws RecognitionException {
        smaliParser.fully_qualified_method_return retval = new smaliParser.fully_qualified_method_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARROW165=null;
        smaliParser.reference_type_descriptor_return reference_type_descriptor164 = null;

        smaliParser.method_name_return method_name166 = null;

        smaliParser.method_prototype_return method_prototype167 = null;


        CommonTree ARROW165_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
        RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");
        RewriteRuleSubtreeStream stream_method_name=new RewriteRuleSubtreeStream(adaptor,"rule method_name");
        try {
            // org/jf/smali/smaliParser.g:574:2: ( reference_type_descriptor ARROW method_name method_prototype -> reference_type_descriptor method_name method_prototype )
            // org/jf/smali/smaliParser.g:574:4: reference_type_descriptor ARROW method_name method_prototype
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method2077);
            reference_type_descriptor164=reference_type_descriptor();

            state._fsp--;

            stream_reference_type_descriptor.add(reference_type_descriptor164.getTree());
            ARROW165=(Token)match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method2079);  
            stream_ARROW.add(ARROW165);

            pushFollow(FOLLOW_method_name_in_fully_qualified_method2081);
            method_name166=method_name();

            state._fsp--;

            stream_method_name.add(method_name166.getTree());
            pushFollow(FOLLOW_method_prototype_in_fully_qualified_method2083);
            method_prototype167=method_prototype();

            state._fsp--;

            stream_method_prototype.add(method_prototype167.getTree());


            // AST REWRITE
            // elements: method_prototype, method_name, reference_type_descriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 575:2: -> reference_type_descriptor method_name method_prototype
            {
                adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
                adaptor.addChild(root_0, stream_method_name.nextTree());
                adaptor.addChild(root_0, stream_method_prototype.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_method"

    public static class fully_qualified_field_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_field"
    // org/jf/smali/smaliParser.g:577:1: fully_qualified_field : reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor -> reference_type_descriptor simple_name nonvoid_type_descriptor ;
    public final smaliParser.fully_qualified_field_return fully_qualified_field() throws RecognitionException {
        smaliParser.fully_qualified_field_return retval = new smaliParser.fully_qualified_field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARROW169=null;
        Token COLON171=null;
        smaliParser.reference_type_descriptor_return reference_type_descriptor168 = null;

        smaliParser.simple_name_return simple_name170 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor172 = null;


        CommonTree ARROW169_tree=null;
        CommonTree COLON171_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:578:2: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor -> reference_type_descriptor simple_name nonvoid_type_descriptor )
            // org/jf/smali/smaliParser.g:578:4: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field2101);
            reference_type_descriptor168=reference_type_descriptor();

            state._fsp--;

            stream_reference_type_descriptor.add(reference_type_descriptor168.getTree());
            ARROW169=(Token)match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field2103);  
            stream_ARROW.add(ARROW169);

            pushFollow(FOLLOW_simple_name_in_fully_qualified_field2105);
            simple_name170=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name170.getTree());
            COLON171=(Token)match(input,COLON,FOLLOW_COLON_in_fully_qualified_field2107);  
            stream_COLON.add(COLON171);

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field2109);
            nonvoid_type_descriptor172=nonvoid_type_descriptor();

            state._fsp--;

            stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor172.getTree());


            // AST REWRITE
            // elements: reference_type_descriptor, simple_name, nonvoid_type_descriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 579:2: -> reference_type_descriptor simple_name nonvoid_type_descriptor
            {
                adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
                adaptor.addChild(root_0, stream_simple_name.nextTree());
                adaptor.addChild(root_0, stream_nonvoid_type_descriptor.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_field"

    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // org/jf/smali/smaliParser.g:581:1: label : COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.label_return label() throws RecognitionException {
        smaliParser.label_return retval = new smaliParser.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON173=null;
        smaliParser.simple_name_return simple_name174 = null;


        CommonTree COLON173_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:582:2: ( COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:582:4: COLON simple_name
            {
            COLON173=(Token)match(input,COLON,FOLLOW_COLON_in_label2127);  
            stream_COLON.add(COLON173);

            pushFollow(FOLLOW_simple_name_in_label2129);
            simple_name174=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name174.getTree());


            // AST REWRITE
            // elements: simple_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 582:22: -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:582:25: ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LABEL, COLON173, "I_LABEL"), root_1);

                adaptor.addChild(root_1, stream_simple_name.nextTree());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label"

    public static class label_ref_or_offset_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label_ref_or_offset"
    // org/jf/smali/smaliParser.g:584:1: label_ref_or_offset : ( COLON simple_name -> simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL -> OFFSET[$NEGATIVE_INTEGER_LITERAL] );
    public final smaliParser.label_ref_or_offset_return label_ref_or_offset() throws RecognitionException {
        smaliParser.label_ref_or_offset_return retval = new smaliParser.label_ref_or_offset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON175=null;
        Token OFFSET177=null;
        Token NEGATIVE_INTEGER_LITERAL178=null;
        smaliParser.simple_name_return simple_name176 = null;


        CommonTree COLON175_tree=null;
        CommonTree OFFSET177_tree=null;
        CommonTree NEGATIVE_INTEGER_LITERAL178_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:585:2: ( COLON simple_name -> simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL -> OFFSET[$NEGATIVE_INTEGER_LITERAL] )
            int alt26=3;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt26=1;
                }
                break;
            case OFFSET:
                {
                alt26=2;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // org/jf/smali/smaliParser.g:585:4: COLON simple_name
                    {
                    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset2150);  
                    stream_COLON.add(COLON175);

                    pushFollow(FOLLOW_simple_name_in_label_ref_or_offset2152);
                    simple_name176=simple_name();

                    state._fsp--;

                    stream_simple_name.add(simple_name176.getTree());


                    // AST REWRITE
                    // elements: simple_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 585:22: -> simple_name
                    {
                        adaptor.addChild(root_0, stream_simple_name.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:586:4: OFFSET
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OFFSET177=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset2161); 
                    OFFSET177_tree = (CommonTree)adaptor.create(OFFSET177);
                    adaptor.addChild(root_0, OFFSET177_tree);


                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:587:4: NEGATIVE_INTEGER_LITERAL
                    {
                    NEGATIVE_INTEGER_LITERAL178=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset2166);  
                    stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL178);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 587:29: -> OFFSET[$NEGATIVE_INTEGER_LITERAL]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(OFFSET, NEGATIVE_INTEGER_LITERAL178));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "label_ref_or_offset"

    public static class register_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "register_list"
    // org/jf/smali/smaliParser.g:589:1: register_list : ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) );
    public final smaliParser.register_list_return register_list() throws RecognitionException {
        smaliParser.register_list_return retval = new smaliParser.register_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REGISTER179=null;
        Token COMMA180=null;
        Token REGISTER181=null;

        CommonTree REGISTER179_tree=null;
        CommonTree COMMA180_tree=null;
        CommonTree REGISTER181_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

        try {
            // org/jf/smali/smaliParser.g:590:2: ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case REGISTER:
                {
                alt28=1;
                }
                break;
            case CLOSE_BRACE:
                {
                alt28=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // org/jf/smali/smaliParser.g:590:4: REGISTER ( COMMA REGISTER )*
                    {
                    REGISTER179=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list2180);  
                    stream_REGISTER.add(REGISTER179);

                    // org/jf/smali/smaliParser.g:590:13: ( COMMA REGISTER )*
                    loop27:
                    do {
                        int alt27=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt27=1;
                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:590:14: COMMA REGISTER
                    	    {
                    	    COMMA180=(Token)match(input,COMMA,FOLLOW_COMMA_in_register_list2183);  
                    	    stream_COMMA.add(COMMA180);

                    	    REGISTER181=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list2185);  
                    	    stream_REGISTER.add(REGISTER181);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 590:31: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
                    {
                        // org/jf/smali/smaliParser.g:590:34: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, ((Token)retval.start), "I_REGISTER_LIST"), root_1);

                        // org/jf/smali/smaliParser.g:590:79: ( REGISTER )*
                        while ( stream_REGISTER.hasNext() ) {
                            adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        }
                        stream_REGISTER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:591:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 591:4: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
                    {
                        // org/jf/smali/smaliParser.g:591:6: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, ((Token)retval.start), "I_REGISTER_LIST"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "register_list"

    public static class register_range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "register_range"
    // org/jf/smali/smaliParser.g:593:1: register_range : REGISTER ( DOTDOT REGISTER )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] REGISTER ( REGISTER )? ) ;
    public final smaliParser.register_range_return register_range() throws RecognitionException {
        smaliParser.register_range_return retval = new smaliParser.register_range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REGISTER182=null;
        Token DOTDOT183=null;
        Token REGISTER184=null;

        CommonTree REGISTER182_tree=null;
        CommonTree DOTDOT183_tree=null;
        CommonTree REGISTER184_tree=null;
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

        try {
            // org/jf/smali/smaliParser.g:594:2: ( REGISTER ( DOTDOT REGISTER )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] REGISTER ( REGISTER )? ) )
            // org/jf/smali/smaliParser.g:594:4: REGISTER ( DOTDOT REGISTER )?
            {
            REGISTER182=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range2215);  
            stream_REGISTER.add(REGISTER182);

            // org/jf/smali/smaliParser.g:594:13: ( DOTDOT REGISTER )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case DOTDOT:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // org/jf/smali/smaliParser.g:594:14: DOTDOT REGISTER
                    {
                    DOTDOT183=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range2218);  
                    stream_DOTDOT.add(DOTDOT183);

                    REGISTER184=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range2220);  
                    stream_REGISTER.add(REGISTER184);


                    }
                    break;

            }



            // AST REWRITE
            // elements: REGISTER, REGISTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 594:32: -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] REGISTER ( REGISTER )? )
            {
                // org/jf/smali/smaliParser.g:594:35: ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] REGISTER ( REGISTER )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_RANGE, ((Token)retval.start), "I_REGISTER_RANGE"), root_1);

                adaptor.addChild(root_1, stream_REGISTER.nextNode());
                // org/jf/smali/smaliParser.g:594:91: ( REGISTER )?
                if ( stream_REGISTER.hasNext() ) {
                    adaptor.addChild(root_1, stream_REGISTER.nextNode());

                }
                stream_REGISTER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "register_range"

    public static class catch_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_directive"
    // org/jf/smali/smaliParser.g:596:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset -> ^( I_CATCH[$start, \"I_CATCH\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] nonvoid_type_descriptor $from $to $using) ;
    public final smaliParser.catch_directive_return catch_directive() throws RecognitionException {
        smaliParser.catch_directive_return retval = new smaliParser.catch_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CATCH_DIRECTIVE185=null;
        Token OPEN_BRACE187=null;
        Token DOTDOT188=null;
        Token CLOSE_BRACE189=null;
        smaliParser.label_ref_or_offset_return from = null;

        smaliParser.label_ref_or_offset_return to = null;

        smaliParser.label_ref_or_offset_return using = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor186 = null;


        CommonTree CATCH_DIRECTIVE185_tree=null;
        CommonTree OPEN_BRACE187_tree=null;
        CommonTree DOTDOT188_tree=null;
        CommonTree CLOSE_BRACE189_tree=null;
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_CATCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCH_DIRECTIVE");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_label_ref_or_offset=new RewriteRuleSubtreeStream(adaptor,"rule label_ref_or_offset");
        try {
            // org/jf/smali/smaliParser.g:597:2: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset -> ^( I_CATCH[$start, \"I_CATCH\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] nonvoid_type_descriptor $from $to $using) )
            // org/jf/smali/smaliParser.g:597:4: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset
            {
            CATCH_DIRECTIVE185=(Token)match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive2243);  
            stream_CATCH_DIRECTIVE.add(CATCH_DIRECTIVE185);

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive2245);
            nonvoid_type_descriptor186=nonvoid_type_descriptor();

            state._fsp--;

            stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor186.getTree());
            OPEN_BRACE187=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive2247);  
            stream_OPEN_BRACE.add(OPEN_BRACE187);

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive2251);
            from=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(from.getTree());
            DOTDOT188=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive2253);  
            stream_DOTDOT.add(DOTDOT188);

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive2257);
            to=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(to.getTree());
            CLOSE_BRACE189=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive2259);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE189);

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive2263);
            using=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(using.getTree());


            // AST REWRITE
            // elements: from, to, nonvoid_type_descriptor, using
            // token labels: 
            // rule labels: to, retval, using, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 598:3: -> ^( I_CATCH[$start, \"I_CATCH\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] nonvoid_type_descriptor $from $to $using)
            {
                // org/jf/smali/smaliParser.g:598:6: ^( I_CATCH[$start, \"I_CATCH\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] nonvoid_type_descriptor $from $to $using)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCH, ((Token)retval.start), "I_CATCH"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));
                adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
                adaptor.addChild(root_1, stream_from.nextTree());
                adaptor.addChild(root_1, stream_to.nextTree());
                adaptor.addChild(root_1, stream_using.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_directive"

    public static class catchall_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchall_directive"
    // org/jf/smali/smaliParser.g:600:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] $from $to $using) ;
    public final smaliParser.catchall_directive_return catchall_directive() throws RecognitionException {
        smaliParser.catchall_directive_return retval = new smaliParser.catchall_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CATCHALL_DIRECTIVE190=null;
        Token OPEN_BRACE191=null;
        Token DOTDOT192=null;
        Token CLOSE_BRACE193=null;
        smaliParser.label_ref_or_offset_return from = null;

        smaliParser.label_ref_or_offset_return to = null;

        smaliParser.label_ref_or_offset_return using = null;


        CommonTree CATCHALL_DIRECTIVE190_tree=null;
        CommonTree OPEN_BRACE191_tree=null;
        CommonTree DOTDOT192_tree=null;
        CommonTree CLOSE_BRACE193_tree=null;
        RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_CATCHALL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCHALL_DIRECTIVE");
        RewriteRuleSubtreeStream stream_label_ref_or_offset=new RewriteRuleSubtreeStream(adaptor,"rule label_ref_or_offset");
        try {
            // org/jf/smali/smaliParser.g:601:2: ( CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] $from $to $using) )
            // org/jf/smali/smaliParser.g:601:4: CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref_or_offset DOTDOT to= label_ref_or_offset CLOSE_BRACE using= label_ref_or_offset
            {
            CATCHALL_DIRECTIVE190=(Token)match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive2295);  
            stream_CATCHALL_DIRECTIVE.add(CATCHALL_DIRECTIVE190);

            OPEN_BRACE191=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive2297);  
            stream_OPEN_BRACE.add(OPEN_BRACE191);

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive2301);
            from=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(from.getTree());
            DOTDOT192=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive2303);  
            stream_DOTDOT.add(DOTDOT192);

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive2307);
            to=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(to.getTree());
            CLOSE_BRACE193=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive2309);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE193);

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive2313);
            using=label_ref_or_offset();

            state._fsp--;

            stream_label_ref_or_offset.add(using.getTree());


            // AST REWRITE
            // elements: using, from, to
            // token labels: 
            // rule labels: to, retval, using, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 602:3: -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] $from $to $using)
            {
                // org/jf/smali/smaliParser.g:602:6: ^( I_CATCHALL[$start, \"I_CATCHALL\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] $from $to $using)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHALL, ((Token)retval.start), "I_CATCHALL"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));
                adaptor.addChild(root_1, stream_from.nextTree());
                adaptor.addChild(root_1, stream_to.nextTree());
                adaptor.addChild(root_1, stream_using.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchall_directive"

    public static class parameter_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_directive"
    // org/jf/smali/smaliParser.g:608:1: parameter_directive : PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) ;
    public final smaliParser.parameter_directive_return parameter_directive() throws RecognitionException {
        smaliParser.parameter_directive_return retval = new smaliParser.parameter_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PARAMETER_DIRECTIVE194=null;
        Token STRING_LITERAL195=null;
        Token END_PARAMETER_DIRECTIVE197=null;
        smaliParser.annotation_return annotation196 = null;


        CommonTree PARAMETER_DIRECTIVE194_tree=null;
        CommonTree STRING_LITERAL195_tree=null;
        CommonTree END_PARAMETER_DIRECTIVE197_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_END_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PARAMETER_DIRECTIVE");
        RewriteRuleTokenStream stream_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PARAMETER_DIRECTIVE");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        List<CommonTree> annotations = new ArrayList<CommonTree>();
        try {
            // org/jf/smali/smaliParser.g:610:2: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) )
            // org/jf/smali/smaliParser.g:610:4: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
            {
            PARAMETER_DIRECTIVE194=(Token)match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive2351);  
            stream_PARAMETER_DIRECTIVE.add(PARAMETER_DIRECTIVE194);

            // org/jf/smali/smaliParser.g:611:3: ( STRING_LITERAL )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case STRING_LITERAL:
                    {
                    alt30=1;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // org/jf/smali/smaliParser.g:611:3: STRING_LITERAL
                    {
                    STRING_LITERAL195=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive2355);  
                    stream_STRING_LITERAL.add(STRING_LITERAL195);


                    }
                    break;

            }

            // org/jf/smali/smaliParser.g:612:3: ({...}? annotation )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // org/jf/smali/smaliParser.g:612:4: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }
            	    pushFollow(FOLLOW_annotation_in_parameter_directive2363);
            	    annotation196=annotation();

            	    state._fsp--;

            	    stream_annotation.add(annotation196.getTree());
            	    annotations.add((annotation196!=null?((CommonTree)annotation196.tree):null));

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // org/jf/smali/smaliParser.g:614:3: ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case END_PARAMETER_DIRECTIVE:
                {
                alt32=1;
                }
                break;
            case SOURCE_DIRECTIVE:
            case ANNOTATION_DIRECTIVE:
            case END_METHOD_DIRECTIVE:
            case REGISTERS_DIRECTIVE:
            case LOCALS_DIRECTIVE:
            case ARRAY_DATA_DIRECTIVE:
            case PACKED_SWITCH_DIRECTIVE:
            case SPARSE_SWITCH_DIRECTIVE:
            case CATCH_DIRECTIVE:
            case CATCHALL_DIRECTIVE:
            case LINE_DIRECTIVE:
            case PARAMETER_DIRECTIVE:
            case LOCAL_DIRECTIVE:
            case END_LOCAL_DIRECTIVE:
            case RESTART_LOCAL_DIRECTIVE:
            case PROLOGUE_DIRECTIVE:
            case EPILOGUE_DIRECTIVE:
            case INSTRUCTION_FORMAT10t:
            case INSTRUCTION_FORMAT10x:
            case INSTRUCTION_FORMAT11n:
            case INSTRUCTION_FORMAT11x:
            case INSTRUCTION_FORMAT12x_OR_ID:
            case INSTRUCTION_FORMAT12x:
            case INSTRUCTION_FORMAT20t:
            case INSTRUCTION_FORMAT21c_FIELD:
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
            case INSTRUCTION_FORMAT21c_STRING:
            case INSTRUCTION_FORMAT21c_TYPE:
            case INSTRUCTION_FORMAT21h:
            case INSTRUCTION_FORMAT21s:
            case INSTRUCTION_FORMAT21t:
            case INSTRUCTION_FORMAT22b:
            case INSTRUCTION_FORMAT22c_FIELD:
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
            case INSTRUCTION_FORMAT22c_TYPE:
            case INSTRUCTION_FORMAT22cs_FIELD:
            case INSTRUCTION_FORMAT22s_OR_ID:
            case INSTRUCTION_FORMAT22s:
            case INSTRUCTION_FORMAT22t:
            case INSTRUCTION_FORMAT22x:
            case INSTRUCTION_FORMAT23x:
            case INSTRUCTION_FORMAT30t:
            case INSTRUCTION_FORMAT31c:
            case INSTRUCTION_FORMAT31i_OR_ID:
            case INSTRUCTION_FORMAT31i:
            case INSTRUCTION_FORMAT31t:
            case INSTRUCTION_FORMAT32x:
            case INSTRUCTION_FORMAT35c_METHOD:
            case INSTRUCTION_FORMAT35c_TYPE:
            case INSTRUCTION_FORMAT35s_METHOD:
            case INSTRUCTION_FORMAT35ms_METHOD:
            case INSTRUCTION_FORMAT3rc_METHOD:
            case INSTRUCTION_FORMAT3rc_TYPE:
            case INSTRUCTION_FORMAT3rms_METHOD:
            case INSTRUCTION_FORMAT51l:
            case COLON:
                {
                alt32=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // org/jf/smali/smaliParser.g:614:5: END_PARAMETER_DIRECTIVE
                    {
                    END_PARAMETER_DIRECTIVE197=(Token)match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive2374);  
                    stream_END_PARAMETER_DIRECTIVE.add(END_PARAMETER_DIRECTIVE197);



                    // AST REWRITE
                    // elements: STRING_LITERAL, annotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 615:4: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
                    {
                        // org/jf/smali/smaliParser.g:615:7: ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, ((Token)retval.start), "I_PARAMETER"), root_1);

                        // org/jf/smali/smaliParser.g:615:44: ( STRING_LITERAL )?
                        if ( stream_STRING_LITERAL.hasNext() ) {
                            adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                        }
                        stream_STRING_LITERAL.reset();
                        // org/jf/smali/smaliParser.g:615:60: ^( I_ANNOTATIONS ( annotation )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);

                        // org/jf/smali/smaliParser.g:615:76: ( annotation )*
                        while ( stream_annotation.hasNext() ) {
                            adaptor.addChild(root_2, stream_annotation.nextTree());

                        }
                        stream_annotation.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:616:17: 
                    {
                    ((statements_and_directives_scope)statements_and_directives_stack.peek()).methodAnnotations.addAll(annotations);


                    // AST REWRITE
                    // elements: STRING_LITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 617:4: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
                    {
                        // org/jf/smali/smaliParser.g:617:7: ^( I_PARAMETER[$start, \"I_PARAMETER\"] ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, ((Token)retval.start), "I_PARAMETER"), root_1);

                        // org/jf/smali/smaliParser.g:617:44: ( STRING_LITERAL )?
                        if ( stream_STRING_LITERAL.hasNext() ) {
                            adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                        }
                        stream_STRING_LITERAL.reset();
                        // org/jf/smali/smaliParser.g:617:60: ^( I_ANNOTATIONS )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_directive"

    public static class ordered_debug_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordered_debug_directive"
    // org/jf/smali/smaliParser.g:620:1: ordered_debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
    public final smaliParser.ordered_debug_directive_return ordered_debug_directive() throws RecognitionException {
        smaliParser.ordered_debug_directive_return retval = new smaliParser.ordered_debug_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        smaliParser.line_directive_return line_directive198 = null;

        smaliParser.local_directive_return local_directive199 = null;

        smaliParser.end_local_directive_return end_local_directive200 = null;

        smaliParser.restart_local_directive_return restart_local_directive201 = null;

        smaliParser.prologue_directive_return prologue_directive202 = null;

        smaliParser.epilogue_directive_return epilogue_directive203 = null;

        smaliParser.source_directive_return source_directive204 = null;



        try {
            // org/jf/smali/smaliParser.g:621:2: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
            int alt33=7;
            switch ( input.LA(1) ) {
            case LINE_DIRECTIVE:
                {
                alt33=1;
                }
                break;
            case LOCAL_DIRECTIVE:
                {
                alt33=2;
                }
                break;
            case END_LOCAL_DIRECTIVE:
                {
                alt33=3;
                }
                break;
            case RESTART_LOCAL_DIRECTIVE:
                {
                alt33=4;
                }
                break;
            case PROLOGUE_DIRECTIVE:
                {
                alt33=5;
                }
                break;
            case EPILOGUE_DIRECTIVE:
                {
                alt33=6;
                }
                break;
            case SOURCE_DIRECTIVE:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // org/jf/smali/smaliParser.g:621:4: line_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_line_directive_in_ordered_debug_directive2432);
                    line_directive198=line_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, line_directive198.getTree());

                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:622:4: local_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_local_directive_in_ordered_debug_directive2437);
                    local_directive199=local_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, local_directive199.getTree());

                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:623:4: end_local_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive2442);
                    end_local_directive200=end_local_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, end_local_directive200.getTree());

                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:624:4: restart_local_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive2447);
                    restart_local_directive201=restart_local_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, restart_local_directive201.getTree());

                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:625:4: prologue_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive2452);
                    prologue_directive202=prologue_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, prologue_directive202.getTree());

                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:626:4: epilogue_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive2457);
                    epilogue_directive203=epilogue_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, epilogue_directive203.getTree());

                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:627:4: source_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_source_directive_in_ordered_debug_directive2462);
                    source_directive204=source_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, source_directive204.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ordered_debug_directive"

    public static class line_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line_directive"
    // org/jf/smali/smaliParser.g:629:1: line_directive : LINE_DIRECTIVE integral_literal -> ^( I_LINE integral_literal I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.line_directive_return line_directive() throws RecognitionException {
        smaliParser.line_directive_return retval = new smaliParser.line_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINE_DIRECTIVE205=null;
        smaliParser.integral_literal_return integral_literal206 = null;


        CommonTree LINE_DIRECTIVE205_tree=null;
        RewriteRuleTokenStream stream_LINE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LINE_DIRECTIVE");
        RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");
        try {
            // org/jf/smali/smaliParser.g:630:2: ( LINE_DIRECTIVE integral_literal -> ^( I_LINE integral_literal I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:630:4: LINE_DIRECTIVE integral_literal
            {
            LINE_DIRECTIVE205=(Token)match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive2471);  
            stream_LINE_DIRECTIVE.add(LINE_DIRECTIVE205);

            pushFollow(FOLLOW_integral_literal_in_line_directive2473);
            integral_literal206=integral_literal();

            state._fsp--;

            stream_integral_literal.add(integral_literal206.getTree());


            // AST REWRITE
            // elements: integral_literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 631:3: -> ^( I_LINE integral_literal I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:631:6: ^( I_LINE integral_literal I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LINE, "I_LINE"), root_1);

                adaptor.addChild(root_1, stream_integral_literal.nextTree());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "line_directive"

    public static class local_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "local_directive"
    // org/jf/smali/smaliParser.g:633:1: local_directive : LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER simple_name nonvoid_type_descriptor ( STRING_LITERAL )? I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.local_directive_return local_directive() throws RecognitionException {
        smaliParser.local_directive_return retval = new smaliParser.local_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOCAL_DIRECTIVE207=null;
        Token REGISTER208=null;
        Token COMMA209=null;
        Token COLON211=null;
        Token COMMA213=null;
        Token STRING_LITERAL214=null;
        smaliParser.simple_name_return simple_name210 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor212 = null;


        CommonTree LOCAL_DIRECTIVE207_tree=null;
        CommonTree REGISTER208_tree=null;
        CommonTree COMMA209_tree=null;
        CommonTree COLON211_tree=null;
        CommonTree COMMA213_tree=null;
        CommonTree STRING_LITERAL214_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCAL_DIRECTIVE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
        try {
            // org/jf/smali/smaliParser.g:634:2: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER simple_name nonvoid_type_descriptor ( STRING_LITERAL )? I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:634:4: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
            {
            LOCAL_DIRECTIVE207=(Token)match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive2495);  
            stream_LOCAL_DIRECTIVE.add(LOCAL_DIRECTIVE207);

            REGISTER208=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_local_directive2497);  
            stream_REGISTER.add(REGISTER208);

            COMMA209=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive2499);  
            stream_COMMA.add(COMMA209);

            pushFollow(FOLLOW_simple_name_in_local_directive2501);
            simple_name210=simple_name();

            state._fsp--;

            stream_simple_name.add(simple_name210.getTree());
            COLON211=(Token)match(input,COLON,FOLLOW_COLON_in_local_directive2503);  
            stream_COLON.add(COLON211);

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive2505);
            nonvoid_type_descriptor212=nonvoid_type_descriptor();

            state._fsp--;

            stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor212.getTree());
            // org/jf/smali/smaliParser.g:634:77: ( COMMA STRING_LITERAL )?
            int alt34=2;
            switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt34=1;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // org/jf/smali/smaliParser.g:634:78: COMMA STRING_LITERAL
                    {
                    COMMA213=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive2508);  
                    stream_COMMA.add(COMMA213);

                    STRING_LITERAL214=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive2510);  
                    stream_STRING_LITERAL.add(STRING_LITERAL214);


                    }
                    break;

            }



            // AST REWRITE
            // elements: STRING_LITERAL, REGISTER, simple_name, nonvoid_type_descriptor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 635:3: -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER simple_name nonvoid_type_descriptor ( STRING_LITERAL )? I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:635:6: ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER simple_name nonvoid_type_descriptor ( STRING_LITERAL )? I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCAL, ((Token)retval.start), "I_LOCAL"), root_1);

                adaptor.addChild(root_1, stream_REGISTER.nextNode());
                adaptor.addChild(root_1, stream_simple_name.nextTree());
                adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
                // org/jf/smali/smaliParser.g:635:80: ( STRING_LITERAL )?
                if ( stream_STRING_LITERAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                }
                stream_STRING_LITERAL.reset();
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "local_directive"

    public static class end_local_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "end_local_directive"
    // org/jf/smali/smaliParser.g:637:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.end_local_directive_return end_local_directive() throws RecognitionException {
        smaliParser.end_local_directive_return retval = new smaliParser.end_local_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END_LOCAL_DIRECTIVE215=null;
        Token REGISTER216=null;

        CommonTree END_LOCAL_DIRECTIVE215_tree=null;
        CommonTree REGISTER216_tree=null;
        RewriteRuleTokenStream stream_END_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_LOCAL_DIRECTIVE");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

        try {
            // org/jf/smali/smaliParser.g:638:2: ( END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:638:4: END_LOCAL_DIRECTIVE REGISTER
            {
            END_LOCAL_DIRECTIVE215=(Token)match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive2542);  
            stream_END_LOCAL_DIRECTIVE.add(END_LOCAL_DIRECTIVE215);

            REGISTER216=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive2544);  
            stream_REGISTER.add(REGISTER216);



            // AST REWRITE
            // elements: REGISTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 639:3: -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:639:6: ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_END_LOCAL, ((Token)retval.start), "I_END_LOCAL"), root_1);

                adaptor.addChild(root_1, stream_REGISTER.nextNode());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "end_local_directive"

    public static class restart_local_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "restart_local_directive"
    // org/jf/smali/smaliParser.g:641:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.restart_local_directive_return restart_local_directive() throws RecognitionException {
        smaliParser.restart_local_directive_return retval = new smaliParser.restart_local_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RESTART_LOCAL_DIRECTIVE217=null;
        Token REGISTER218=null;

        CommonTree RESTART_LOCAL_DIRECTIVE217_tree=null;
        CommonTree REGISTER218_tree=null;
        RewriteRuleTokenStream stream_RESTART_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token RESTART_LOCAL_DIRECTIVE");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

        try {
            // org/jf/smali/smaliParser.g:642:2: ( RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:642:4: RESTART_LOCAL_DIRECTIVE REGISTER
            {
            RESTART_LOCAL_DIRECTIVE217=(Token)match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive2567);  
            stream_RESTART_LOCAL_DIRECTIVE.add(RESTART_LOCAL_DIRECTIVE217);

            REGISTER218=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive2569);  
            stream_REGISTER.add(REGISTER218);



            // AST REWRITE
            // elements: REGISTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 643:3: -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:643:6: ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_RESTART_LOCAL, ((Token)retval.start), "I_RESTART_LOCAL"), root_1);

                adaptor.addChild(root_1, stream_REGISTER.nextNode());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "restart_local_directive"

    public static class prologue_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prologue_directive"
    // org/jf/smali/smaliParser.g:645:1: prologue_directive : PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.prologue_directive_return prologue_directive() throws RecognitionException {
        smaliParser.prologue_directive_return retval = new smaliParser.prologue_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROLOGUE_DIRECTIVE219=null;

        CommonTree PROLOGUE_DIRECTIVE219_tree=null;
        RewriteRuleTokenStream stream_PROLOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PROLOGUE_DIRECTIVE");

        try {
            // org/jf/smali/smaliParser.g:646:2: ( PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:646:4: PROLOGUE_DIRECTIVE
            {
            PROLOGUE_DIRECTIVE219=(Token)match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive2592);  
            stream_PROLOGUE_DIRECTIVE.add(PROLOGUE_DIRECTIVE219);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 647:3: -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:647:6: ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PROLOGUE, ((Token)retval.start), "I_PROLOGUE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prologue_directive"

    public static class epilogue_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "epilogue_directive"
    // org/jf/smali/smaliParser.g:649:1: epilogue_directive : EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.epilogue_directive_return epilogue_directive() throws RecognitionException {
        smaliParser.epilogue_directive_return retval = new smaliParser.epilogue_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EPILOGUE_DIRECTIVE220=null;

        CommonTree EPILOGUE_DIRECTIVE220_tree=null;
        RewriteRuleTokenStream stream_EPILOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token EPILOGUE_DIRECTIVE");

        try {
            // org/jf/smali/smaliParser.g:650:2: ( EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:650:4: EPILOGUE_DIRECTIVE
            {
            EPILOGUE_DIRECTIVE220=(Token)match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive2613);  
            stream_EPILOGUE_DIRECTIVE.add(EPILOGUE_DIRECTIVE220);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 651:3: -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:651:6: ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_EPILOGUE, ((Token)retval.start), "I_EPILOGUE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "epilogue_directive"

    public static class source_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source_directive"
    // org/jf/smali/smaliParser.g:653:1: source_directive : SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) ;
    public final smaliParser.source_directive_return source_directive() throws RecognitionException {
        smaliParser.source_directive_return retval = new smaliParser.source_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SOURCE_DIRECTIVE221=null;
        Token STRING_LITERAL222=null;

        CommonTree SOURCE_DIRECTIVE221_tree=null;
        CommonTree STRING_LITERAL222_tree=null;
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");

        try {
            // org/jf/smali/smaliParser.g:654:2: ( SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL I_ADDRESS[$start, Integer.toString($method::currentAddress)] ) )
            // org/jf/smali/smaliParser.g:654:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            SOURCE_DIRECTIVE221=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive2634);  
            stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE221);

            STRING_LITERAL222=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive2636);  
            stream_STRING_LITERAL.add(STRING_LITERAL222);



            // AST REWRITE
            // elements: STRING_LITERAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 655:3: -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
            {
                // org/jf/smali/smaliParser.g:655:6: ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL I_ADDRESS[$start, Integer.toString($method::currentAddress)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, ((Token)retval.start), "I_SOURCE"), root_1);

                adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
                adaptor.addChild(root_1, (CommonTree)adaptor.create(I_ADDRESS, ((Token)retval.start), Integer.toString(((method_scope)method_stack.peek()).currentAddress)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "source_directive"

    public static class instruction_format12x_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_format12x"
    // org/jf/smali/smaliParser.g:657:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] );
    public final smaliParser.instruction_format12x_return instruction_format12x() throws RecognitionException {
        smaliParser.instruction_format12x_return retval = new smaliParser.instruction_format12x_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSTRUCTION_FORMAT12x223=null;
        Token INSTRUCTION_FORMAT12x_OR_ID224=null;

        CommonTree INSTRUCTION_FORMAT12x223_tree=null;
        CommonTree INSTRUCTION_FORMAT12x_OR_ID224_tree=null;
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:658:2: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] )
            int alt35=2;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT12x:
                {
                alt35=1;
                }
                break;
            case INSTRUCTION_FORMAT12x_OR_ID:
                {
                alt35=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // org/jf/smali/smaliParser.g:658:4: INSTRUCTION_FORMAT12x
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT12x223=(Token)match(input,INSTRUCTION_FORMAT12x,FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x2659); 
                    INSTRUCTION_FORMAT12x223_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x223);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT12x223_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:659:4: INSTRUCTION_FORMAT12x_OR_ID
                    {
                    INSTRUCTION_FORMAT12x_OR_ID224=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x2664);  
                    stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 659:32: -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x, INSTRUCTION_FORMAT12x_OR_ID224));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_format12x"

    public static class instruction_format22s_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_format22s"
    // org/jf/smali/smaliParser.g:661:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] );
    public final smaliParser.instruction_format22s_return instruction_format22s() throws RecognitionException {
        smaliParser.instruction_format22s_return retval = new smaliParser.instruction_format22s_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSTRUCTION_FORMAT22s225=null;
        Token INSTRUCTION_FORMAT22s_OR_ID226=null;

        CommonTree INSTRUCTION_FORMAT22s225_tree=null;
        CommonTree INSTRUCTION_FORMAT22s_OR_ID226_tree=null;
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:662:2: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] )
            int alt36=2;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT22s:
                {
                alt36=1;
                }
                break;
            case INSTRUCTION_FORMAT22s_OR_ID:
                {
                alt36=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // org/jf/smali/smaliParser.g:662:4: INSTRUCTION_FORMAT22s
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT22s225=(Token)match(input,INSTRUCTION_FORMAT22s,FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s2678); 
                    INSTRUCTION_FORMAT22s225_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s225);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT22s225_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:663:4: INSTRUCTION_FORMAT22s_OR_ID
                    {
                    INSTRUCTION_FORMAT22s_OR_ID226=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s2683);  
                    stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 663:32: -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s, INSTRUCTION_FORMAT22s_OR_ID226));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_format22s"

    public static class instruction_format31i_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_format31i"
    // org/jf/smali/smaliParser.g:665:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] );
    public final smaliParser.instruction_format31i_return instruction_format31i() throws RecognitionException {
        smaliParser.instruction_format31i_return retval = new smaliParser.instruction_format31i_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSTRUCTION_FORMAT31i227=null;
        Token INSTRUCTION_FORMAT31i_OR_ID228=null;

        CommonTree INSTRUCTION_FORMAT31i227_tree=null;
        CommonTree INSTRUCTION_FORMAT31i_OR_ID228_tree=null;
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");

        try {
            // org/jf/smali/smaliParser.g:666:2: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] )
            int alt37=2;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT31i:
                {
                alt37=1;
                }
                break;
            case INSTRUCTION_FORMAT31i_OR_ID:
                {
                alt37=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // org/jf/smali/smaliParser.g:666:4: INSTRUCTION_FORMAT31i
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT31i227=(Token)match(input,INSTRUCTION_FORMAT31i,FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i2697); 
                    INSTRUCTION_FORMAT31i227_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i227);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT31i227_tree);


                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:667:4: INSTRUCTION_FORMAT31i_OR_ID
                    {
                    INSTRUCTION_FORMAT31i_OR_ID228=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i2702);  
                    stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID228);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 667:32: -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID]
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i, INSTRUCTION_FORMAT31i_OR_ID228));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_format31i"

    public static class instruction_return extends ParserRuleReturnScope {
        public int size;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // org/jf/smali/smaliParser.g:669:1: instruction returns [int size] : ( INSTRUCTION_FORMAT10t label_ref_or_offset -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref_or_offset ) | INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) | INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) | instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) | INSTRUCTION_FORMAT20t label_ref_or_offset -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref_or_offset ) | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field ) | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER reference_type_descriptor ) | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21h[$start, \"I_STATEMENT_FORMAT21h\"] INSTRUCTION_FORMAT21h REGISTER integral_literal ) | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field ) | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) | INSTRUCTION_FORMAT30t label_ref_or_offset -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref_or_offset ) | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) | instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method ) | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) | INSTRUCTION_FORMAT35s_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_OFFSET | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method ) | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_OFFSET | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_ARRAY_DATA ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal (switch_target+= label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) ) -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) ) | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW switch_target+= label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) ) -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) ) );
    public final smaliParser.instruction_return instruction() throws RecognitionException {
        smaliParser.instruction_return retval = new smaliParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSTRUCTION_FORMAT10t229=null;
        Token INSTRUCTION_FORMAT10x231=null;
        Token INSTRUCTION_FORMAT11n232=null;
        Token REGISTER233=null;
        Token COMMA234=null;
        Token INSTRUCTION_FORMAT11x236=null;
        Token REGISTER237=null;
        Token REGISTER239=null;
        Token COMMA240=null;
        Token REGISTER241=null;
        Token INSTRUCTION_FORMAT20t242=null;
        Token INSTRUCTION_FORMAT21c_FIELD244=null;
        Token REGISTER245=null;
        Token COMMA246=null;
        Token INSTRUCTION_FORMAT21c_FIELD_ODEX248=null;
        Token REGISTER249=null;
        Token COMMA250=null;
        Token INSTRUCTION_FORMAT21c_STRING252=null;
        Token REGISTER253=null;
        Token COMMA254=null;
        Token STRING_LITERAL255=null;
        Token INSTRUCTION_FORMAT21c_TYPE256=null;
        Token REGISTER257=null;
        Token COMMA258=null;
        Token INSTRUCTION_FORMAT21h260=null;
        Token REGISTER261=null;
        Token COMMA262=null;
        Token INSTRUCTION_FORMAT21s264=null;
        Token REGISTER265=null;
        Token COMMA266=null;
        Token INSTRUCTION_FORMAT21t268=null;
        Token REGISTER269=null;
        Token COMMA270=null;
        Token INSTRUCTION_FORMAT22b272=null;
        Token REGISTER273=null;
        Token COMMA274=null;
        Token REGISTER275=null;
        Token COMMA276=null;
        Token INSTRUCTION_FORMAT22c_FIELD278=null;
        Token REGISTER279=null;
        Token COMMA280=null;
        Token REGISTER281=null;
        Token COMMA282=null;
        Token INSTRUCTION_FORMAT22c_FIELD_ODEX284=null;
        Token REGISTER285=null;
        Token COMMA286=null;
        Token REGISTER287=null;
        Token COMMA288=null;
        Token INSTRUCTION_FORMAT22c_TYPE290=null;
        Token REGISTER291=null;
        Token COMMA292=null;
        Token REGISTER293=null;
        Token COMMA294=null;
        Token INSTRUCTION_FORMAT22cs_FIELD296=null;
        Token REGISTER297=null;
        Token COMMA298=null;
        Token REGISTER299=null;
        Token COMMA300=null;
        Token FIELD_OFFSET301=null;
        Token REGISTER303=null;
        Token COMMA304=null;
        Token REGISTER305=null;
        Token COMMA306=null;
        Token INSTRUCTION_FORMAT22t308=null;
        Token REGISTER309=null;
        Token COMMA310=null;
        Token REGISTER311=null;
        Token COMMA312=null;
        Token INSTRUCTION_FORMAT22x314=null;
        Token REGISTER315=null;
        Token COMMA316=null;
        Token REGISTER317=null;
        Token INSTRUCTION_FORMAT23x318=null;
        Token REGISTER319=null;
        Token COMMA320=null;
        Token REGISTER321=null;
        Token COMMA322=null;
        Token REGISTER323=null;
        Token INSTRUCTION_FORMAT30t324=null;
        Token INSTRUCTION_FORMAT31c326=null;
        Token REGISTER327=null;
        Token COMMA328=null;
        Token STRING_LITERAL329=null;
        Token REGISTER331=null;
        Token COMMA332=null;
        Token INSTRUCTION_FORMAT31t334=null;
        Token REGISTER335=null;
        Token COMMA336=null;
        Token INSTRUCTION_FORMAT32x338=null;
        Token REGISTER339=null;
        Token COMMA340=null;
        Token REGISTER341=null;
        Token INSTRUCTION_FORMAT35c_METHOD342=null;
        Token OPEN_BRACE343=null;
        Token CLOSE_BRACE345=null;
        Token COMMA346=null;
        Token INSTRUCTION_FORMAT35c_TYPE348=null;
        Token OPEN_BRACE349=null;
        Token CLOSE_BRACE351=null;
        Token COMMA352=null;
        Token INSTRUCTION_FORMAT35s_METHOD354=null;
        Token OPEN_BRACE355=null;
        Token CLOSE_BRACE357=null;
        Token COMMA358=null;
        Token INSTRUCTION_FORMAT35ms_METHOD360=null;
        Token OPEN_BRACE361=null;
        Token CLOSE_BRACE363=null;
        Token COMMA364=null;
        Token VTABLE_OFFSET365=null;
        Token INSTRUCTION_FORMAT3rc_METHOD366=null;
        Token OPEN_BRACE367=null;
        Token CLOSE_BRACE369=null;
        Token COMMA370=null;
        Token INSTRUCTION_FORMAT3rc_TYPE372=null;
        Token OPEN_BRACE373=null;
        Token CLOSE_BRACE375=null;
        Token COMMA376=null;
        Token INSTRUCTION_FORMAT3rms_METHOD378=null;
        Token OPEN_BRACE379=null;
        Token CLOSE_BRACE381=null;
        Token COMMA382=null;
        Token VTABLE_OFFSET383=null;
        Token INSTRUCTION_FORMAT51l384=null;
        Token REGISTER385=null;
        Token COMMA386=null;
        Token ARRAY_DATA_DIRECTIVE388=null;
        Token END_ARRAY_DATA_DIRECTIVE391=null;
        Token PACKED_SWITCH_DIRECTIVE392=null;
        Token END_PACKED_SWITCH_DIRECTIVE394=null;
        Token SPARSE_SWITCH_DIRECTIVE395=null;
        Token ARROW397=null;
        Token END_SPARSE_SWITCH_DIRECTIVE398=null;
        List list_switch_target=null;
        smaliParser.label_ref_or_offset_return label_ref_or_offset230 = null;

        smaliParser.integral_literal_return integral_literal235 = null;

        smaliParser.instruction_format12x_return instruction_format12x238 = null;

        smaliParser.label_ref_or_offset_return label_ref_or_offset243 = null;

        smaliParser.fully_qualified_field_return fully_qualified_field247 = null;

        smaliParser.fully_qualified_field_return fully_qualified_field251 = null;

        smaliParser.reference_type_descriptor_return reference_type_descriptor259 = null;

        smaliParser.integral_literal_return integral_literal263 = null;

        smaliParser.integral_literal_return integral_literal267 = null;

        smaliParser.label_ref_or_offset_return label_ref_or_offset271 = null;

        smaliParser.integral_literal_return integral_literal277 = null;

        smaliParser.fully_qualified_field_return fully_qualified_field283 = null;

        smaliParser.fully_qualified_field_return fully_qualified_field289 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor295 = null;

        smaliParser.instruction_format22s_return instruction_format22s302 = null;

        smaliParser.integral_literal_return integral_literal307 = null;

        smaliParser.label_ref_or_offset_return label_ref_or_offset313 = null;

        smaliParser.label_ref_or_offset_return label_ref_or_offset325 = null;

        smaliParser.instruction_format31i_return instruction_format31i330 = null;

        smaliParser.fixed_32bit_literal_return fixed_32bit_literal333 = null;

        smaliParser.label_ref_or_offset_return label_ref_or_offset337 = null;

        smaliParser.register_list_return register_list344 = null;

        smaliParser.fully_qualified_method_return fully_qualified_method347 = null;

        smaliParser.register_list_return register_list350 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor353 = null;

        smaliParser.register_list_return register_list356 = null;

        smaliParser.fully_qualified_method_return fully_qualified_method359 = null;

        smaliParser.register_list_return register_list362 = null;

        smaliParser.register_range_return register_range368 = null;

        smaliParser.fully_qualified_method_return fully_qualified_method371 = null;

        smaliParser.register_range_return register_range374 = null;

        smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor377 = null;

        smaliParser.register_range_return register_range380 = null;

        smaliParser.fixed_literal_return fixed_literal387 = null;

        smaliParser.integral_literal_return integral_literal389 = null;

        smaliParser.fixed_literal_return fixed_literal390 = null;

        smaliParser.fixed_32bit_literal_return fixed_32bit_literal393 = null;

        smaliParser.fixed_32bit_literal_return fixed_32bit_literal396 = null;

        RuleReturnScope switch_target = null;
        CommonTree INSTRUCTION_FORMAT10t229_tree=null;
        CommonTree INSTRUCTION_FORMAT10x231_tree=null;
        CommonTree INSTRUCTION_FORMAT11n232_tree=null;
        CommonTree REGISTER233_tree=null;
        CommonTree COMMA234_tree=null;
        CommonTree INSTRUCTION_FORMAT11x236_tree=null;
        CommonTree REGISTER237_tree=null;
        CommonTree REGISTER239_tree=null;
        CommonTree COMMA240_tree=null;
        CommonTree REGISTER241_tree=null;
        CommonTree INSTRUCTION_FORMAT20t242_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_FIELD244_tree=null;
        CommonTree REGISTER245_tree=null;
        CommonTree COMMA246_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX248_tree=null;
        CommonTree REGISTER249_tree=null;
        CommonTree COMMA250_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_STRING252_tree=null;
        CommonTree REGISTER253_tree=null;
        CommonTree COMMA254_tree=null;
        CommonTree STRING_LITERAL255_tree=null;
        CommonTree INSTRUCTION_FORMAT21c_TYPE256_tree=null;
        CommonTree REGISTER257_tree=null;
        CommonTree COMMA258_tree=null;
        CommonTree INSTRUCTION_FORMAT21h260_tree=null;
        CommonTree REGISTER261_tree=null;
        CommonTree COMMA262_tree=null;
        CommonTree INSTRUCTION_FORMAT21s264_tree=null;
        CommonTree REGISTER265_tree=null;
        CommonTree COMMA266_tree=null;
        CommonTree INSTRUCTION_FORMAT21t268_tree=null;
        CommonTree REGISTER269_tree=null;
        CommonTree COMMA270_tree=null;
        CommonTree INSTRUCTION_FORMAT22b272_tree=null;
        CommonTree REGISTER273_tree=null;
        CommonTree COMMA274_tree=null;
        CommonTree REGISTER275_tree=null;
        CommonTree COMMA276_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_FIELD278_tree=null;
        CommonTree REGISTER279_tree=null;
        CommonTree COMMA280_tree=null;
        CommonTree REGISTER281_tree=null;
        CommonTree COMMA282_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX284_tree=null;
        CommonTree REGISTER285_tree=null;
        CommonTree COMMA286_tree=null;
        CommonTree REGISTER287_tree=null;
        CommonTree COMMA288_tree=null;
        CommonTree INSTRUCTION_FORMAT22c_TYPE290_tree=null;
        CommonTree REGISTER291_tree=null;
        CommonTree COMMA292_tree=null;
        CommonTree REGISTER293_tree=null;
        CommonTree COMMA294_tree=null;
        CommonTree INSTRUCTION_FORMAT22cs_FIELD296_tree=null;
        CommonTree REGISTER297_tree=null;
        CommonTree COMMA298_tree=null;
        CommonTree REGISTER299_tree=null;
        CommonTree COMMA300_tree=null;
        CommonTree FIELD_OFFSET301_tree=null;
        CommonTree REGISTER303_tree=null;
        CommonTree COMMA304_tree=null;
        CommonTree REGISTER305_tree=null;
        CommonTree COMMA306_tree=null;
        CommonTree INSTRUCTION_FORMAT22t308_tree=null;
        CommonTree REGISTER309_tree=null;
        CommonTree COMMA310_tree=null;
        CommonTree REGISTER311_tree=null;
        CommonTree COMMA312_tree=null;
        CommonTree INSTRUCTION_FORMAT22x314_tree=null;
        CommonTree REGISTER315_tree=null;
        CommonTree COMMA316_tree=null;
        CommonTree REGISTER317_tree=null;
        CommonTree INSTRUCTION_FORMAT23x318_tree=null;
        CommonTree REGISTER319_tree=null;
        CommonTree COMMA320_tree=null;
        CommonTree REGISTER321_tree=null;
        CommonTree COMMA322_tree=null;
        CommonTree REGISTER323_tree=null;
        CommonTree INSTRUCTION_FORMAT30t324_tree=null;
        CommonTree INSTRUCTION_FORMAT31c326_tree=null;
        CommonTree REGISTER327_tree=null;
        CommonTree COMMA328_tree=null;
        CommonTree STRING_LITERAL329_tree=null;
        CommonTree REGISTER331_tree=null;
        CommonTree COMMA332_tree=null;
        CommonTree INSTRUCTION_FORMAT31t334_tree=null;
        CommonTree REGISTER335_tree=null;
        CommonTree COMMA336_tree=null;
        CommonTree INSTRUCTION_FORMAT32x338_tree=null;
        CommonTree REGISTER339_tree=null;
        CommonTree COMMA340_tree=null;
        CommonTree REGISTER341_tree=null;
        CommonTree INSTRUCTION_FORMAT35c_METHOD342_tree=null;
        CommonTree OPEN_BRACE343_tree=null;
        CommonTree CLOSE_BRACE345_tree=null;
        CommonTree COMMA346_tree=null;
        CommonTree INSTRUCTION_FORMAT35c_TYPE348_tree=null;
        CommonTree OPEN_BRACE349_tree=null;
        CommonTree CLOSE_BRACE351_tree=null;
        CommonTree COMMA352_tree=null;
        CommonTree INSTRUCTION_FORMAT35s_METHOD354_tree=null;
        CommonTree OPEN_BRACE355_tree=null;
        CommonTree CLOSE_BRACE357_tree=null;
        CommonTree COMMA358_tree=null;
        CommonTree INSTRUCTION_FORMAT35ms_METHOD360_tree=null;
        CommonTree OPEN_BRACE361_tree=null;
        CommonTree CLOSE_BRACE363_tree=null;
        CommonTree COMMA364_tree=null;
        CommonTree VTABLE_OFFSET365_tree=null;
        CommonTree INSTRUCTION_FORMAT3rc_METHOD366_tree=null;
        CommonTree OPEN_BRACE367_tree=null;
        CommonTree CLOSE_BRACE369_tree=null;
        CommonTree COMMA370_tree=null;
        CommonTree INSTRUCTION_FORMAT3rc_TYPE372_tree=null;
        CommonTree OPEN_BRACE373_tree=null;
        CommonTree CLOSE_BRACE375_tree=null;
        CommonTree COMMA376_tree=null;
        CommonTree INSTRUCTION_FORMAT3rms_METHOD378_tree=null;
        CommonTree OPEN_BRACE379_tree=null;
        CommonTree CLOSE_BRACE381_tree=null;
        CommonTree COMMA382_tree=null;
        CommonTree VTABLE_OFFSET383_tree=null;
        CommonTree INSTRUCTION_FORMAT51l384_tree=null;
        CommonTree REGISTER385_tree=null;
        CommonTree COMMA386_tree=null;
        CommonTree ARRAY_DATA_DIRECTIVE388_tree=null;
        CommonTree END_ARRAY_DATA_DIRECTIVE391_tree=null;
        CommonTree PACKED_SWITCH_DIRECTIVE392_tree=null;
        CommonTree END_PACKED_SWITCH_DIRECTIVE394_tree=null;
        CommonTree SPARSE_SWITCH_DIRECTIVE395_tree=null;
        CommonTree ARROW397_tree=null;
        CommonTree END_SPARSE_SWITCH_DIRECTIVE398_tree=null;
        RewriteRuleTokenStream stream_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SPARSE_SWITCH_DIRECTIVE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31c=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31c");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21h=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21h");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_METHOD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21s=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21s");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT30t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT30t");
        RewriteRuleTokenStream stream_END_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PACKED_SWITCH_DIRECTIVE");
        RewriteRuleTokenStream stream_END_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SPARSE_SWITCH_DIRECTIVE");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_END_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ARRAY_DATA_DIRECTIVE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11n=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11n");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22b=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22b");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");
        RewriteRuleTokenStream stream_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PACKED_SWITCH_DIRECTIVE");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleTokenStream stream_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ARRAY_DATA_DIRECTIVE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT20t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT20t");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22x");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_TYPE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
        RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
        RewriteRuleTokenStream stream_INSTRUCTION_FORMAT32x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT32x");
        RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
        RewriteRuleSubtreeStream stream_instruction_format31i=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format31i");
        RewriteRuleSubtreeStream stream_instruction_format22s=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format22s");
        RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
        RewriteRuleSubtreeStream stream_fixed_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_literal");
        RewriteRuleSubtreeStream stream_label_ref_or_offset=new RewriteRuleSubtreeStream(adaptor,"rule label_ref_or_offset");
        RewriteRuleSubtreeStream stream_fully_qualified_method=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_method");
        RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");
        RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");
        RewriteRuleSubtreeStream stream_instruction_format12x=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format12x");
        RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");
        RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");
        RewriteRuleSubtreeStream stream_fully_qualified_field=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_field");
        boolean needsNop = false; int targetCount = 0;
        try {
            // org/jf/smali/smaliParser.g:671:2: ( INSTRUCTION_FORMAT10t label_ref_or_offset -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref_or_offset ) | INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) | INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) | instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) | INSTRUCTION_FORMAT20t label_ref_or_offset -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref_or_offset ) | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field ) | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER reference_type_descriptor ) | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21h[$start, \"I_STATEMENT_FORMAT21h\"] INSTRUCTION_FORMAT21h REGISTER integral_literal ) | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field ) | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) | INSTRUCTION_FORMAT30t label_ref_or_offset -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref_or_offset ) | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) | instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref_or_offset ) | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method ) | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) | INSTRUCTION_FORMAT35s_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_OFFSET | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method ) | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_OFFSET | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_ARRAY_DATA ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal (switch_target+= label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) ) -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) ) | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW switch_target+= label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) ) -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) ) )
            int alt41=38;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT10t:
                {
                alt41=1;
                }
                break;
            case INSTRUCTION_FORMAT10x:
                {
                alt41=2;
                }
                break;
            case INSTRUCTION_FORMAT11n:
                {
                alt41=3;
                }
                break;
            case INSTRUCTION_FORMAT11x:
                {
                alt41=4;
                }
                break;
            case INSTRUCTION_FORMAT12x_OR_ID:
            case INSTRUCTION_FORMAT12x:
                {
                alt41=5;
                }
                break;
            case INSTRUCTION_FORMAT20t:
                {
                alt41=6;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD:
                {
                alt41=7;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                {
                alt41=8;
                }
                break;
            case INSTRUCTION_FORMAT21c_STRING:
                {
                alt41=9;
                }
                break;
            case INSTRUCTION_FORMAT21c_TYPE:
                {
                alt41=10;
                }
                break;
            case INSTRUCTION_FORMAT21h:
                {
                alt41=11;
                }
                break;
            case INSTRUCTION_FORMAT21s:
                {
                alt41=12;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt41=13;
                }
                break;
            case INSTRUCTION_FORMAT22b:
                {
                alt41=14;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt41=15;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt41=16;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt41=17;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt41=18;
                }
                break;
            case INSTRUCTION_FORMAT22s_OR_ID:
            case INSTRUCTION_FORMAT22s:
                {
                alt41=19;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt41=20;
                }
                break;
            case INSTRUCTION_FORMAT22x:
                {
                alt41=21;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt41=22;
                }
                break;
            case INSTRUCTION_FORMAT30t:
                {
                alt41=23;
                }
                break;
            case INSTRUCTION_FORMAT31c:
                {
                alt41=24;
                }
                break;
            case INSTRUCTION_FORMAT31i_OR_ID:
            case INSTRUCTION_FORMAT31i:
                {
                alt41=25;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt41=26;
                }
                break;
            case INSTRUCTION_FORMAT32x:
                {
                alt41=27;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt41=28;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt41=29;
                }
                break;
            case INSTRUCTION_FORMAT35s_METHOD:
                {
                alt41=30;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt41=31;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD:
                {
                alt41=32;
                }
                break;
            case INSTRUCTION_FORMAT3rc_TYPE:
                {
                alt41=33;
                }
                break;
            case INSTRUCTION_FORMAT3rms_METHOD:
                {
                alt41=34;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt41=35;
                }
                break;
            case ARRAY_DATA_DIRECTIVE:
                {
                alt41=36;
                }
                break;
            case PACKED_SWITCH_DIRECTIVE:
                {
                alt41=37;
                }
                break;
            case SPARSE_SWITCH_DIRECTIVE:
                {
                alt41=38;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // org/jf/smali/smaliParser.g:673:3: INSTRUCTION_FORMAT10t label_ref_or_offset
                    {
                    INSTRUCTION_FORMAT10t229=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_instruction2732);  
                    stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t229);

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2734);
                    label_ref_or_offset230=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset230.getTree());
                    retval.size = Format.Format10t.size;


                    // AST REWRITE
                    // elements: label_ref_or_offset, INSTRUCTION_FORMAT10t
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 674:3: -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:674:6: ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10t, ((Token)retval.start), "I_STATEMENT_FORMAT10t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10t.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/jf/smali/smaliParser.g:676:3: INSTRUCTION_FORMAT10x
                    {
                    INSTRUCTION_FORMAT10x231=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_instruction2757);  
                    stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x231);

                    retval.size = Format.Format10x.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT10x
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 677:3: -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
                    {
                        // org/jf/smali/smaliParser.g:677:6: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, ((Token)retval.start), "I_STATEMENT_FORMAT10x"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10x.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/jf/smali/smaliParser.g:679:3: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
                    {
                    INSTRUCTION_FORMAT11n232=(Token)match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_instruction2778);  
                    stream_INSTRUCTION_FORMAT11n.add(INSTRUCTION_FORMAT11n232);

                    REGISTER233=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2780);  
                    stream_REGISTER.add(REGISTER233);

                    COMMA234=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2782);  
                    stream_COMMA.add(COMMA234);

                    pushFollow(FOLLOW_integral_literal_in_instruction2784);
                    integral_literal235=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal235.getTree());
                    retval.size = Format.Format11n.size;


                    // AST REWRITE
                    // elements: REGISTER, integral_literal, INSTRUCTION_FORMAT11n
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 680:3: -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
                    {
                        // org/jf/smali/smaliParser.g:680:6: ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11n, ((Token)retval.start), "I_STATEMENT_FORMAT11n"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11n.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_integral_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // org/jf/smali/smaliParser.g:682:3: INSTRUCTION_FORMAT11x REGISTER
                    {
                    INSTRUCTION_FORMAT11x236=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_instruction2809);  
                    stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x236);

                    REGISTER237=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2811);  
                    stream_REGISTER.add(REGISTER237);

                    retval.size = Format.Format11x.size;


                    // AST REWRITE
                    // elements: REGISTER, INSTRUCTION_FORMAT11x
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 683:3: -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
                    {
                        // org/jf/smali/smaliParser.g:683:6: ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11x, ((Token)retval.start), "I_STATEMENT_FORMAT11x"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11x.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // org/jf/smali/smaliParser.g:685:3: instruction_format12x REGISTER COMMA REGISTER
                    {
                    pushFollow(FOLLOW_instruction_format12x_in_instruction2834);
                    instruction_format12x238=instruction_format12x();

                    state._fsp--;

                    stream_instruction_format12x.add(instruction_format12x238.getTree());
                    REGISTER239=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2836);  
                    stream_REGISTER.add(REGISTER239);

                    COMMA240=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2838);  
                    stream_COMMA.add(COMMA240);

                    REGISTER241=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2840);  
                    stream_REGISTER.add(REGISTER241);

                    retval.size = Format.Format12x.size;


                    // AST REWRITE
                    // elements: instruction_format12x, REGISTER, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 686:3: -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
                    {
                        // org/jf/smali/smaliParser.g:686:6: ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT12x, ((Token)retval.start), "I_STATEMENT_FORMAT12x"), root_1);

                        adaptor.addChild(root_1, stream_instruction_format12x.nextTree());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // org/jf/smali/smaliParser.g:688:3: INSTRUCTION_FORMAT20t label_ref_or_offset
                    {
                    INSTRUCTION_FORMAT20t242=(Token)match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_instruction2865);  
                    stream_INSTRUCTION_FORMAT20t.add(INSTRUCTION_FORMAT20t242);

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2867);
                    label_ref_or_offset243=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset243.getTree());
                    retval.size = Format.Format20t.size;


                    // AST REWRITE
                    // elements: label_ref_or_offset, INSTRUCTION_FORMAT20t
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 689:3: -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:689:6: ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT20t, ((Token)retval.start), "I_STATEMENT_FORMAT20t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT20t.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // org/jf/smali/smaliParser.g:691:3: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    INSTRUCTION_FORMAT21c_FIELD244=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction2890);  
                    stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD244);

                    REGISTER245=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2892);  
                    stream_REGISTER.add(REGISTER245);

                    COMMA246=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2894);  
                    stream_COMMA.add(COMMA246);

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2896);
                    fully_qualified_field247=fully_qualified_field();

                    state._fsp--;

                    stream_fully_qualified_field.add(fully_qualified_field247.getTree());
                    retval.size = Format.Format21c.size;


                    // AST REWRITE
                    // elements: fully_qualified_field, REGISTER, INSTRUCTION_FORMAT21c_FIELD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 692:3: -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field )
                    {
                        // org/jf/smali/smaliParser.g:692:6: ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_FIELD, ((Token)retval.start), "I_STATEMENT_FORMAT21c_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_FIELD.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // org/jf/smali/smaliParser.g:694:3: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT21c_FIELD_ODEX248=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction2921); 
                    INSTRUCTION_FORMAT21c_FIELD_ODEX248_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT21c_FIELD_ODEX248);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT21c_FIELD_ODEX248_tree);

                    REGISTER249=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2923); 
                    REGISTER249_tree = (CommonTree)adaptor.create(REGISTER249);
                    adaptor.addChild(root_0, REGISTER249_tree);

                    COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2925); 
                    COMMA250_tree = (CommonTree)adaptor.create(COMMA250);
                    adaptor.addChild(root_0, COMMA250_tree);

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2927);
                    fully_qualified_field251=fully_qualified_field();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_field251.getTree());

                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT21c_FIELD_ODEX248!=null?INSTRUCTION_FORMAT21c_FIELD_ODEX248.getText():null));
                    		

                    }
                    break;
                case 9 :
                    // org/jf/smali/smaliParser.g:699:3: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
                    {
                    INSTRUCTION_FORMAT21c_STRING252=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction2939);  
                    stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING252);

                    REGISTER253=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2941);  
                    stream_REGISTER.add(REGISTER253);

                    COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2943);  
                    stream_COMMA.add(COMMA254);

                    STRING_LITERAL255=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction2945);  
                    stream_STRING_LITERAL.add(STRING_LITERAL255);

                    retval.size = Format.Format21c.size;


                    // AST REWRITE
                    // elements: STRING_LITERAL, REGISTER, INSTRUCTION_FORMAT21c_STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 700:3: -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
                    {
                        // org/jf/smali/smaliParser.g:700:6: ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_STRING, ((Token)retval.start), "I_STATEMENT_FORMAT21c_STRING"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_STRING.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // org/jf/smali/smaliParser.g:702:3: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    INSTRUCTION_FORMAT21c_TYPE256=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction2970);  
                    stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE256);

                    REGISTER257=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction2972);  
                    stream_REGISTER.add(REGISTER257);

                    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction2974);  
                    stream_COMMA.add(COMMA258);

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction2976);
                    reference_type_descriptor259=reference_type_descriptor();

                    state._fsp--;

                    stream_reference_type_descriptor.add(reference_type_descriptor259.getTree());
                    retval.size = Format.Format21c.size;


                    // AST REWRITE
                    // elements: REGISTER, reference_type_descriptor, INSTRUCTION_FORMAT21c_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 703:3: -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER reference_type_descriptor )
                    {
                        // org/jf/smali/smaliParser.g:703:6: ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER reference_type_descriptor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_TYPE, ((Token)retval.start), "I_STATEMENT_FORMAT21c"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // org/jf/smali/smaliParser.g:705:3: INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
                    {
                    INSTRUCTION_FORMAT21h260=(Token)match(input,INSTRUCTION_FORMAT21h,FOLLOW_INSTRUCTION_FORMAT21h_in_instruction3001);  
                    stream_INSTRUCTION_FORMAT21h.add(INSTRUCTION_FORMAT21h260);

                    REGISTER261=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3003);  
                    stream_REGISTER.add(REGISTER261);

                    COMMA262=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3005);  
                    stream_COMMA.add(COMMA262);

                    pushFollow(FOLLOW_integral_literal_in_instruction3007);
                    integral_literal263=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal263.getTree());
                    retval.size = Format.Format21h.size;


                    // AST REWRITE
                    // elements: integral_literal, REGISTER, INSTRUCTION_FORMAT21h
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 706:3: -> ^( I_STATEMENT_FORMAT21h[$start, \"I_STATEMENT_FORMAT21h\"] INSTRUCTION_FORMAT21h REGISTER integral_literal )
                    {
                        // org/jf/smali/smaliParser.g:706:6: ^( I_STATEMENT_FORMAT21h[$start, \"I_STATEMENT_FORMAT21h\"] INSTRUCTION_FORMAT21h REGISTER integral_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21h, ((Token)retval.start), "I_STATEMENT_FORMAT21h"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21h.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_integral_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // org/jf/smali/smaliParser.g:708:3: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
                    {
                    INSTRUCTION_FORMAT21s264=(Token)match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_instruction3032);  
                    stream_INSTRUCTION_FORMAT21s.add(INSTRUCTION_FORMAT21s264);

                    REGISTER265=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3034);  
                    stream_REGISTER.add(REGISTER265);

                    COMMA266=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3036);  
                    stream_COMMA.add(COMMA266);

                    pushFollow(FOLLOW_integral_literal_in_instruction3038);
                    integral_literal267=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal267.getTree());
                    retval.size = Format.Format21s.size;


                    // AST REWRITE
                    // elements: REGISTER, INSTRUCTION_FORMAT21s, integral_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 709:3: -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
                    {
                        // org/jf/smali/smaliParser.g:709:6: ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21s, ((Token)retval.start), "I_STATEMENT_FORMAT21s"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21s.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_integral_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // org/jf/smali/smaliParser.g:711:3: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
                    {
                    INSTRUCTION_FORMAT21t268=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_instruction3063);  
                    stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t268);

                    REGISTER269=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3065);  
                    stream_REGISTER.add(REGISTER269);

                    COMMA270=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3067);  
                    stream_COMMA.add(COMMA270);

                    // org/jf/smali/smaliParser.g:711:40: ( label_ref_or_offset )
                    // org/jf/smali/smaliParser.g:711:41: label_ref_or_offset
                    {
                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction3070);
                    label_ref_or_offset271=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset271.getTree());

                    }

                    retval.size = Format.Format21t.size;


                    // AST REWRITE
                    // elements: REGISTER, INSTRUCTION_FORMAT21t, label_ref_or_offset
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 712:3: -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:712:6: ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21t, ((Token)retval.start), "I_STATEMENT_FORMAT21t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21t.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // org/jf/smali/smaliParser.g:714:3: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    INSTRUCTION_FORMAT22b272=(Token)match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_instruction3096);  
                    stream_INSTRUCTION_FORMAT22b.add(INSTRUCTION_FORMAT22b272);

                    REGISTER273=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3098);  
                    stream_REGISTER.add(REGISTER273);

                    COMMA274=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3100);  
                    stream_COMMA.add(COMMA274);

                    REGISTER275=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3102);  
                    stream_REGISTER.add(REGISTER275);

                    COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3104);  
                    stream_COMMA.add(COMMA276);

                    pushFollow(FOLLOW_integral_literal_in_instruction3106);
                    integral_literal277=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal277.getTree());
                    retval.size = Format.Format22b.size;


                    // AST REWRITE
                    // elements: REGISTER, INSTRUCTION_FORMAT22b, REGISTER, integral_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 715:3: -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
                    {
                        // org/jf/smali/smaliParser.g:715:6: ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22b, ((Token)retval.start), "I_STATEMENT_FORMAT22b"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22b.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_integral_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // org/jf/smali/smaliParser.g:717:3: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    INSTRUCTION_FORMAT22c_FIELD278=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction3133);  
                    stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD278);

                    REGISTER279=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3135);  
                    stream_REGISTER.add(REGISTER279);

                    COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3137);  
                    stream_COMMA.add(COMMA280);

                    REGISTER281=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3139);  
                    stream_REGISTER.add(REGISTER281);

                    COMMA282=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3141);  
                    stream_COMMA.add(COMMA282);

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction3143);
                    fully_qualified_field283=fully_qualified_field();

                    state._fsp--;

                    stream_fully_qualified_field.add(fully_qualified_field283.getTree());
                    retval.size = Format.Format22c.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT22c_FIELD, fully_qualified_field, REGISTER, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 718:3: -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field )
                    {
                        // org/jf/smali/smaliParser.g:718:6: ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_FIELD, ((Token)retval.start), "I_STATEMENT_FORMAT22c_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_FIELD.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // org/jf/smali/smaliParser.g:720:3: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT22c_FIELD_ODEX284=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction3170); 
                    INSTRUCTION_FORMAT22c_FIELD_ODEX284_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22c_FIELD_ODEX284);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT22c_FIELD_ODEX284_tree);

                    REGISTER285=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3172); 
                    REGISTER285_tree = (CommonTree)adaptor.create(REGISTER285);
                    adaptor.addChild(root_0, REGISTER285_tree);

                    COMMA286=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3174); 
                    COMMA286_tree = (CommonTree)adaptor.create(COMMA286);
                    adaptor.addChild(root_0, COMMA286_tree);

                    REGISTER287=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3176); 
                    REGISTER287_tree = (CommonTree)adaptor.create(REGISTER287);
                    adaptor.addChild(root_0, REGISTER287_tree);

                    COMMA288=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3178); 
                    COMMA288_tree = (CommonTree)adaptor.create(COMMA288);
                    adaptor.addChild(root_0, COMMA288_tree);

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction3180);
                    fully_qualified_field289=fully_qualified_field();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_field289.getTree());

                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22c_FIELD_ODEX284!=null?INSTRUCTION_FORMAT22c_FIELD_ODEX284.getText():null));
                    		

                    }
                    break;
                case 17 :
                    // org/jf/smali/smaliParser.g:725:3: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    INSTRUCTION_FORMAT22c_TYPE290=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction3192);  
                    stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE290);

                    REGISTER291=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3194);  
                    stream_REGISTER.add(REGISTER291);

                    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3196);  
                    stream_COMMA.add(COMMA292);

                    REGISTER293=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3198);  
                    stream_REGISTER.add(REGISTER293);

                    COMMA294=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3200);  
                    stream_COMMA.add(COMMA294);

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction3202);
                    nonvoid_type_descriptor295=nonvoid_type_descriptor();

                    state._fsp--;

                    stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor295.getTree());
                    retval.size = Format.Format22c.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT22c_TYPE, nonvoid_type_descriptor, REGISTER, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 726:3: -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
                    {
                        // org/jf/smali/smaliParser.g:726:6: ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_TYPE, ((Token)retval.start), "I_STATEMENT_FORMAT22c_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // org/jf/smali/smaliParser.g:728:3: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT22cs_FIELD296=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction3229); 
                    INSTRUCTION_FORMAT22cs_FIELD296_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22cs_FIELD296);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT22cs_FIELD296_tree);

                    REGISTER297=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3231); 
                    REGISTER297_tree = (CommonTree)adaptor.create(REGISTER297);
                    adaptor.addChild(root_0, REGISTER297_tree);

                    COMMA298=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3233); 
                    COMMA298_tree = (CommonTree)adaptor.create(COMMA298);
                    adaptor.addChild(root_0, COMMA298_tree);

                    REGISTER299=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3235); 
                    REGISTER299_tree = (CommonTree)adaptor.create(REGISTER299);
                    adaptor.addChild(root_0, REGISTER299_tree);

                    COMMA300=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3237); 
                    COMMA300_tree = (CommonTree)adaptor.create(COMMA300);
                    adaptor.addChild(root_0, COMMA300_tree);

                    FIELD_OFFSET301=(Token)match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_instruction3239); 
                    FIELD_OFFSET301_tree = (CommonTree)adaptor.create(FIELD_OFFSET301);
                    adaptor.addChild(root_0, FIELD_OFFSET301_tree);


                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22cs_FIELD296!=null?INSTRUCTION_FORMAT22cs_FIELD296.getText():null));
                    		

                    }
                    break;
                case 19 :
                    // org/jf/smali/smaliParser.g:733:3: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    pushFollow(FOLLOW_instruction_format22s_in_instruction3251);
                    instruction_format22s302=instruction_format22s();

                    state._fsp--;

                    stream_instruction_format22s.add(instruction_format22s302.getTree());
                    REGISTER303=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3253);  
                    stream_REGISTER.add(REGISTER303);

                    COMMA304=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3255);  
                    stream_COMMA.add(COMMA304);

                    REGISTER305=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3257);  
                    stream_REGISTER.add(REGISTER305);

                    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3259);  
                    stream_COMMA.add(COMMA306);

                    pushFollow(FOLLOW_integral_literal_in_instruction3261);
                    integral_literal307=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal307.getTree());
                    retval.size = Format.Format22s.size;


                    // AST REWRITE
                    // elements: REGISTER, instruction_format22s, REGISTER, integral_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 734:3: -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
                    {
                        // org/jf/smali/smaliParser.g:734:6: ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22s, ((Token)retval.start), "I_STATEMENT_FORMAT22s"), root_1);

                        adaptor.addChild(root_1, stream_instruction_format22s.nextTree());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_integral_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // org/jf/smali/smaliParser.g:736:3: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
                    {
                    INSTRUCTION_FORMAT22t308=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_instruction3288);  
                    stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t308);

                    REGISTER309=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3290);  
                    stream_REGISTER.add(REGISTER309);

                    COMMA310=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3292);  
                    stream_COMMA.add(COMMA310);

                    REGISTER311=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3294);  
                    stream_REGISTER.add(REGISTER311);

                    COMMA312=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3296);  
                    stream_COMMA.add(COMMA312);

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction3298);
                    label_ref_or_offset313=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset313.getTree());
                    retval.size = Format.Format22t.size;


                    // AST REWRITE
                    // elements: REGISTER, REGISTER, label_ref_or_offset, INSTRUCTION_FORMAT22t
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 737:3: -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:737:6: ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22t, ((Token)retval.start), "I_STATEMENT_FFORMAT22t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22t.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // org/jf/smali/smaliParser.g:739:3: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
                    {
                    INSTRUCTION_FORMAT22x314=(Token)match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_instruction3325);  
                    stream_INSTRUCTION_FORMAT22x.add(INSTRUCTION_FORMAT22x314);

                    REGISTER315=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3327);  
                    stream_REGISTER.add(REGISTER315);

                    COMMA316=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3329);  
                    stream_COMMA.add(COMMA316);

                    REGISTER317=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3331);  
                    stream_REGISTER.add(REGISTER317);

                    retval.size = Format.Format22x.size;


                    // AST REWRITE
                    // elements: REGISTER, REGISTER, INSTRUCTION_FORMAT22x
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 740:3: -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
                    {
                        // org/jf/smali/smaliParser.g:740:6: ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22x, ((Token)retval.start), "I_STATEMENT_FORMAT22x"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22x.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // org/jf/smali/smaliParser.g:742:3: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
                    {
                    INSTRUCTION_FORMAT23x318=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_instruction3356);  
                    stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x318);

                    REGISTER319=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3358);  
                    stream_REGISTER.add(REGISTER319);

                    COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3360);  
                    stream_COMMA.add(COMMA320);

                    REGISTER321=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3362);  
                    stream_REGISTER.add(REGISTER321);

                    COMMA322=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3364);  
                    stream_COMMA.add(COMMA322);

                    REGISTER323=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3366);  
                    stream_REGISTER.add(REGISTER323);

                    retval.size = Format.Format23x.size;


                    // AST REWRITE
                    // elements: REGISTER, REGISTER, REGISTER, INSTRUCTION_FORMAT23x
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 743:3: -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
                    {
                        // org/jf/smali/smaliParser.g:743:6: ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT23x, ((Token)retval.start), "I_STATEMENT_FORMAT23x"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT23x.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // org/jf/smali/smaliParser.g:745:3: INSTRUCTION_FORMAT30t label_ref_or_offset
                    {
                    INSTRUCTION_FORMAT30t324=(Token)match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_instruction3393);  
                    stream_INSTRUCTION_FORMAT30t.add(INSTRUCTION_FORMAT30t324);

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction3395);
                    label_ref_or_offset325=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset325.getTree());
                    retval.size = Format.Format30t.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT30t, label_ref_or_offset
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 746:3: -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:746:6: ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT30t, ((Token)retval.start), "I_STATEMENT_FORMAT30t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT30t.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // org/jf/smali/smaliParser.g:748:3: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
                    {
                    INSTRUCTION_FORMAT31c326=(Token)match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_instruction3418);  
                    stream_INSTRUCTION_FORMAT31c.add(INSTRUCTION_FORMAT31c326);

                    REGISTER327=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3420);  
                    stream_REGISTER.add(REGISTER327);

                    COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3422);  
                    stream_COMMA.add(COMMA328);

                    STRING_LITERAL329=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction3424);  
                    stream_STRING_LITERAL.add(STRING_LITERAL329);

                    retval.size = Format.Format31c.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT31c, STRING_LITERAL, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 749:3: -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
                    {
                        // org/jf/smali/smaliParser.g:749:5: ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31c, ((Token)retval.start), "I_STATEMENT_FORMAT31c"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31c.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // org/jf/smali/smaliParser.g:751:3: instruction_format31i REGISTER COMMA fixed_32bit_literal
                    {
                    pushFollow(FOLLOW_instruction_format31i_in_instruction3448);
                    instruction_format31i330=instruction_format31i();

                    state._fsp--;

                    stream_instruction_format31i.add(instruction_format31i330.getTree());
                    REGISTER331=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3450);  
                    stream_REGISTER.add(REGISTER331);

                    COMMA332=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3452);  
                    stream_COMMA.add(COMMA332);

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction3454);
                    fixed_32bit_literal333=fixed_32bit_literal();

                    state._fsp--;

                    stream_fixed_32bit_literal.add(fixed_32bit_literal333.getTree());
                    retval.size = Format.Format31i.size;


                    // AST REWRITE
                    // elements: instruction_format31i, fixed_32bit_literal, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 752:3: -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
                    {
                        // org/jf/smali/smaliParser.g:752:6: ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31i, ((Token)retval.start), "I_STATEMENT_FORMAT31i"), root_1);

                        adaptor.addChild(root_1, stream_instruction_format31i.nextTree());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // org/jf/smali/smaliParser.g:754:3: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
                    {
                    INSTRUCTION_FORMAT31t334=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_instruction3479);  
                    stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t334);

                    REGISTER335=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3481);  
                    stream_REGISTER.add(REGISTER335);

                    COMMA336=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3483);  
                    stream_COMMA.add(COMMA336);

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction3485);
                    label_ref_or_offset337=label_ref_or_offset();

                    state._fsp--;

                    stream_label_ref_or_offset.add(label_ref_or_offset337.getTree());
                    retval.size = Format.Format31t.size;

                    			if ((INSTRUCTION_FORMAT31t334!=null?INSTRUCTION_FORMAT31t334.getText():null).equals("packed-switch")) {
                    				CommonTree root = new CommonTree(new CommonToken(I_PACKED_SWITCH_DECLARATION, "I_PACKED_SWITCH_DECLARATION"));
                    				CommonTree address = new CommonTree(new CommonToken(I_ADDRESS, Integer.toString(((method_scope)method_stack.peek()).currentAddress)));
                    				root.addChild(address);
                    				root.addChild((label_ref_or_offset337!=null?((CommonTree)label_ref_or_offset337.tree):null).dupNode());
                    				((statements_and_directives_scope)statements_and_directives_stack.peek()).packedSwitchDeclarations.add(root);
                    			} else if ((INSTRUCTION_FORMAT31t334!=null?INSTRUCTION_FORMAT31t334.getText():null).equals("sparse-switch")) {
                    				CommonTree root = new CommonTree(new CommonToken(I_SPARSE_SWITCH_DECLARATION, "I_SPARSE_SWITCH_DECLARATION"));
                    				CommonTree address = new CommonTree(new CommonToken(I_ADDRESS, Integer.toString(((method_scope)method_stack.peek()).currentAddress)));
                    				root.addChild(address);
                    				root.addChild((label_ref_or_offset337!=null?((CommonTree)label_ref_or_offset337.tree):null).dupNode());
                    				((statements_and_directives_scope)statements_and_directives_stack.peek()).sparseSwitchDeclarations.add(root);
                    			}
                    		


                    // AST REWRITE
                    // elements: label_ref_or_offset, REGISTER, INSTRUCTION_FORMAT31t
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 770:3: -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref_or_offset )
                    {
                        // org/jf/smali/smaliParser.g:770:6: ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref_or_offset )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31t, ((Token)retval.start), "I_STATEMENT_FORMAT31t"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31t.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_label_ref_or_offset.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // org/jf/smali/smaliParser.g:772:3: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
                    {
                    INSTRUCTION_FORMAT32x338=(Token)match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_instruction3514);  
                    stream_INSTRUCTION_FORMAT32x.add(INSTRUCTION_FORMAT32x338);

                    REGISTER339=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3516);  
                    stream_REGISTER.add(REGISTER339);

                    COMMA340=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3518);  
                    stream_COMMA.add(COMMA340);

                    REGISTER341=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3520);  
                    stream_REGISTER.add(REGISTER341);

                    retval.size = Format.Format32x.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT32x, REGISTER, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 773:3: -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
                    {
                        // org/jf/smali/smaliParser.g:773:6: ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT32x, ((Token)retval.start), "I_STATEMENT_FORMAT32x"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT32x.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // org/jf/smali/smaliParser.g:775:3: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    INSTRUCTION_FORMAT35c_METHOD342=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction3545);  
                    stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD342);

                    OPEN_BRACE343=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3547);  
                    stream_OPEN_BRACE.add(OPEN_BRACE343);

                    pushFollow(FOLLOW_register_list_in_instruction3549);
                    register_list344=register_list();

                    state._fsp--;

                    stream_register_list.add(register_list344.getTree());
                    CLOSE_BRACE345=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3551);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE345);

                    COMMA346=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3553);  
                    stream_COMMA.add(COMMA346);

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction3555);
                    fully_qualified_method347=fully_qualified_method();

                    state._fsp--;

                    stream_fully_qualified_method.add(fully_qualified_method347.getTree());
                    retval.size = Format.Format35c.size;


                    // AST REWRITE
                    // elements: INSTRUCTION_FORMAT35c_METHOD, register_list, fully_qualified_method
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 776:3: -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method )
                    {
                        // org/jf/smali/smaliParser.g:776:6: ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_METHOD, ((Token)retval.start), "I_STATEMENT_FORMAT35c_METHOD"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_METHOD.nextNode());
                        adaptor.addChild(root_1, stream_register_list.nextTree());
                        adaptor.addChild(root_1, stream_fully_qualified_method.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // org/jf/smali/smaliParser.g:778:3: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    INSTRUCTION_FORMAT35c_TYPE348=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction3580);  
                    stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE348);

                    OPEN_BRACE349=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3582);  
                    stream_OPEN_BRACE.add(OPEN_BRACE349);

                    pushFollow(FOLLOW_register_list_in_instruction3584);
                    register_list350=register_list();

                    state._fsp--;

                    stream_register_list.add(register_list350.getTree());
                    CLOSE_BRACE351=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3586);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE351);

                    COMMA352=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3588);  
                    stream_COMMA.add(COMMA352);

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction3590);
                    nonvoid_type_descriptor353=nonvoid_type_descriptor();

                    state._fsp--;

                    stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor353.getTree());
                    retval.size = Format.Format35c.size;


                    // AST REWRITE
                    // elements: nonvoid_type_descriptor, register_list, INSTRUCTION_FORMAT35c_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 779:3: -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
                    {
                        // org/jf/smali/smaliParser.g:779:6: ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_TYPE, ((Token)retval.start), "I_STATEMENT_FORMAT35c_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_register_list.nextTree());
                        adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // org/jf/smali/smaliParser.g:781:3: INSTRUCTION_FORMAT35s_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT35s_METHOD354=(Token)match(input,INSTRUCTION_FORMAT35s_METHOD,FOLLOW_INSTRUCTION_FORMAT35s_METHOD_in_instruction3615); 
                    INSTRUCTION_FORMAT35s_METHOD354_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35s_METHOD354);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT35s_METHOD354_tree);

                    OPEN_BRACE355=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3617); 
                    OPEN_BRACE355_tree = (CommonTree)adaptor.create(OPEN_BRACE355);
                    adaptor.addChild(root_0, OPEN_BRACE355_tree);

                    pushFollow(FOLLOW_register_list_in_instruction3619);
                    register_list356=register_list();

                    state._fsp--;

                    adaptor.addChild(root_0, register_list356.getTree());
                    CLOSE_BRACE357=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3621); 
                    CLOSE_BRACE357_tree = (CommonTree)adaptor.create(CLOSE_BRACE357);
                    adaptor.addChild(root_0, CLOSE_BRACE357_tree);

                    COMMA358=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3623); 
                    COMMA358_tree = (CommonTree)adaptor.create(COMMA358);
                    adaptor.addChild(root_0, COMMA358_tree);

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction3625);
                    fully_qualified_method359=fully_qualified_method();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_method359.getTree());

                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35s_METHOD354!=null?INSTRUCTION_FORMAT35s_METHOD354.getText():null));
                    		

                    }
                    break;
                case 31 :
                    // org/jf/smali/smaliParser.g:786:3: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_OFFSET
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT35ms_METHOD360=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction3637); 
                    INSTRUCTION_FORMAT35ms_METHOD360_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35ms_METHOD360);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT35ms_METHOD360_tree);

                    OPEN_BRACE361=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3639); 
                    OPEN_BRACE361_tree = (CommonTree)adaptor.create(OPEN_BRACE361);
                    adaptor.addChild(root_0, OPEN_BRACE361_tree);

                    pushFollow(FOLLOW_register_list_in_instruction3641);
                    register_list362=register_list();

                    state._fsp--;

                    adaptor.addChild(root_0, register_list362.getTree());
                    CLOSE_BRACE363=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3643); 
                    CLOSE_BRACE363_tree = (CommonTree)adaptor.create(CLOSE_BRACE363);
                    adaptor.addChild(root_0, CLOSE_BRACE363_tree);

                    COMMA364=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3645); 
                    COMMA364_tree = (CommonTree)adaptor.create(COMMA364);
                    adaptor.addChild(root_0, COMMA364_tree);

                    VTABLE_OFFSET365=(Token)match(input,VTABLE_OFFSET,FOLLOW_VTABLE_OFFSET_in_instruction3647); 
                    VTABLE_OFFSET365_tree = (CommonTree)adaptor.create(VTABLE_OFFSET365);
                    adaptor.addChild(root_0, VTABLE_OFFSET365_tree);


                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35ms_METHOD360!=null?INSTRUCTION_FORMAT35ms_METHOD360.getText():null));
                    		

                    }
                    break;
                case 32 :
                    // org/jf/smali/smaliParser.g:791:3: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    INSTRUCTION_FORMAT3rc_METHOD366=(Token)match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction3659);  
                    stream_INSTRUCTION_FORMAT3rc_METHOD.add(INSTRUCTION_FORMAT3rc_METHOD366);

                    OPEN_BRACE367=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3661);  
                    stream_OPEN_BRACE.add(OPEN_BRACE367);

                    pushFollow(FOLLOW_register_range_in_instruction3663);
                    register_range368=register_range();

                    state._fsp--;

                    stream_register_range.add(register_range368.getTree());
                    CLOSE_BRACE369=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3665);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE369);

                    COMMA370=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3667);  
                    stream_COMMA.add(COMMA370);

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction3669);
                    fully_qualified_method371=fully_qualified_method();

                    state._fsp--;

                    stream_fully_qualified_method.add(fully_qualified_method371.getTree());
                    retval.size = Format.Format3rc.size;


                    // AST REWRITE
                    // elements: register_range, fully_qualified_method, INSTRUCTION_FORMAT3rc_METHOD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 792:3: -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method )
                    {
                        // org/jf/smali/smaliParser.g:792:6: ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_METHOD, ((Token)retval.start), "I_STATEMENT_FORMAT3rc_METHOD"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_METHOD.nextNode());
                        adaptor.addChild(root_1, stream_register_range.nextTree());
                        adaptor.addChild(root_1, stream_fully_qualified_method.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // org/jf/smali/smaliParser.g:794:3: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    INSTRUCTION_FORMAT3rc_TYPE372=(Token)match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction3694);  
                    stream_INSTRUCTION_FORMAT3rc_TYPE.add(INSTRUCTION_FORMAT3rc_TYPE372);

                    OPEN_BRACE373=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3696);  
                    stream_OPEN_BRACE.add(OPEN_BRACE373);

                    pushFollow(FOLLOW_register_range_in_instruction3698);
                    register_range374=register_range();

                    state._fsp--;

                    stream_register_range.add(register_range374.getTree());
                    CLOSE_BRACE375=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3700);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE375);

                    COMMA376=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3702);  
                    stream_COMMA.add(COMMA376);

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction3704);
                    nonvoid_type_descriptor377=nonvoid_type_descriptor();

                    state._fsp--;

                    stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor377.getTree());
                    retval.size = Format.Format3rc.size;


                    // AST REWRITE
                    // elements: nonvoid_type_descriptor, INSTRUCTION_FORMAT3rc_TYPE, register_range
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 795:3: -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
                    {
                        // org/jf/smali/smaliParser.g:795:6: ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_TYPE, ((Token)retval.start), "I_STATEMENT_FORMAT3rc_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_TYPE.nextNode());
                        adaptor.addChild(root_1, stream_register_range.nextTree());
                        adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 34 :
                    // org/jf/smali/smaliParser.g:797:3: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_OFFSET
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INSTRUCTION_FORMAT3rms_METHOD378=(Token)match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction3729); 
                    INSTRUCTION_FORMAT3rms_METHOD378_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rms_METHOD378);
                    adaptor.addChild(root_0, INSTRUCTION_FORMAT3rms_METHOD378_tree);

                    OPEN_BRACE379=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction3731); 
                    OPEN_BRACE379_tree = (CommonTree)adaptor.create(OPEN_BRACE379);
                    adaptor.addChild(root_0, OPEN_BRACE379_tree);

                    pushFollow(FOLLOW_register_range_in_instruction3733);
                    register_range380=register_range();

                    state._fsp--;

                    adaptor.addChild(root_0, register_range380.getTree());
                    CLOSE_BRACE381=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction3735); 
                    CLOSE_BRACE381_tree = (CommonTree)adaptor.create(CLOSE_BRACE381);
                    adaptor.addChild(root_0, CLOSE_BRACE381_tree);

                    COMMA382=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3737); 
                    COMMA382_tree = (CommonTree)adaptor.create(COMMA382);
                    adaptor.addChild(root_0, COMMA382_tree);

                    VTABLE_OFFSET383=(Token)match(input,VTABLE_OFFSET,FOLLOW_VTABLE_OFFSET_in_instruction3739); 
                    VTABLE_OFFSET383_tree = (CommonTree)adaptor.create(VTABLE_OFFSET383);
                    adaptor.addChild(root_0, VTABLE_OFFSET383_tree);


                    			throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rms_METHOD378!=null?INSTRUCTION_FORMAT3rms_METHOD378.getText():null));
                    		

                    }
                    break;
                case 35 :
                    // org/jf/smali/smaliParser.g:802:3: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
                    {
                    INSTRUCTION_FORMAT51l384=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_instruction3751);  
                    stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l384);

                    REGISTER385=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_instruction3753);  
                    stream_REGISTER.add(REGISTER385);

                    COMMA386=(Token)match(input,COMMA,FOLLOW_COMMA_in_instruction3755);  
                    stream_COMMA.add(COMMA386);

                    pushFollow(FOLLOW_fixed_literal_in_instruction3757);
                    fixed_literal387=fixed_literal();

                    state._fsp--;

                    stream_fixed_literal.add(fixed_literal387.getTree());
                    retval.size = Format.Format51l.size;


                    // AST REWRITE
                    // elements: fixed_literal, INSTRUCTION_FORMAT51l, REGISTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 803:3: -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
                    {
                        // org/jf/smali/smaliParser.g:803:6: ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT51l, ((Token)retval.start), "I_STATEMENT_FORMAT51l"), root_1);

                        adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT51l.nextNode());
                        adaptor.addChild(root_1, stream_REGISTER.nextNode());
                        adaptor.addChild(root_1, stream_fixed_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 36 :
                    // org/jf/smali/smaliParser.g:805:3: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
                    {
                    ARRAY_DATA_DIRECTIVE388=(Token)match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction3781);  
                    stream_ARRAY_DATA_DIRECTIVE.add(ARRAY_DATA_DIRECTIVE388);


                    			if ((((method_scope)method_stack.peek()).currentAddress % 2) != 0) {
                    				needsNop = true;
                    				retval.size = 2;
                    			} else {
                    				retval.size = 0;
                    			}
                    		
                    pushFollow(FOLLOW_integral_literal_in_instruction3790);
                    integral_literal389=integral_literal();

                    state._fsp--;

                    stream_integral_literal.add(integral_literal389.getTree());
                    // org/jf/smali/smaliParser.g:815:20: ( fixed_literal )*
                    loop38:
                    do {
                        int alt38=2;
                        switch ( input.LA(1) ) {
                        case POSITIVE_INTEGER_LITERAL:
                        case NEGATIVE_INTEGER_LITERAL:
                        case LONG_LITERAL:
                        case SHORT_LITERAL:
                        case BYTE_LITERAL:
                        case FLOAT_LITERAL_OR_ID:
                        case DOUBLE_LITERAL_OR_ID:
                        case FLOAT_LITERAL:
                        case DOUBLE_LITERAL:
                        case BOOL_LITERAL:
                        case CHAR_LITERAL:
                        case INTEGER_LITERAL:
                            {
                            alt38=1;
                            }
                            break;

                        }

                        switch (alt38) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:815:21: fixed_literal
                    	    {
                    	    pushFollow(FOLLOW_fixed_literal_in_instruction3793);
                    	    fixed_literal390=fixed_literal();

                    	    state._fsp--;

                    	    stream_fixed_literal.add(fixed_literal390.getTree());
                    	    retval.size+=(fixed_literal390!=null?fixed_literal390.size:0);

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    END_ARRAY_DATA_DIRECTIVE391=(Token)match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction3799);  
                    stream_END_ARRAY_DATA_DIRECTIVE.add(END_ARRAY_DATA_DIRECTIVE391);

                    retval.size = ((retval.size + 1)/2)*2 + 8;


                    // AST REWRITE
                    // elements: integral_literal, integral_literal, fixed_literal, fixed_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 819:3: -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_ARRAY_DATA ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
                    if (needsNop) {
                        // org/jf/smali/smaliParser.g:819:18: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, ((Token)retval.start), "I_STATEMENT_FORMAT10x"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(INSTRUCTION_FORMAT10x, ((Token)retval.start), "nop"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // org/jf/smali/smaliParser.g:820:6: ^( I_STATEMENT_ARRAY_DATA ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_ARRAY_DATA, "I_STATEMENT_ARRAY_DATA"), root_1);

                        // org/jf/smali/smaliParser.g:820:31: ^( I_ARRAY_ELEMENT_SIZE integral_literal )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENT_SIZE, "I_ARRAY_ELEMENT_SIZE"), root_2);

                        adaptor.addChild(root_2, stream_integral_literal.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:820:72: ^( I_ARRAY_ELEMENTS ( fixed_literal )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENTS, "I_ARRAY_ELEMENTS"), root_2);

                        // org/jf/smali/smaliParser.g:820:91: ( fixed_literal )*
                        while ( stream_fixed_literal.hasNext() ) {
                            adaptor.addChild(root_2, stream_fixed_literal.nextTree());

                        }
                        stream_fixed_literal.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 822:3: -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
                    {
                        // org/jf/smali/smaliParser.g:822:6: ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE integral_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_ARRAY_DATA, ((Token)retval.start), "I_STATEMENT_ARRAY_DATA"), root_1);

                        // org/jf/smali/smaliParser.g:822:65: ^( I_ARRAY_ELEMENT_SIZE integral_literal )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENT_SIZE, "I_ARRAY_ELEMENT_SIZE"), root_2);

                        adaptor.addChild(root_2, stream_integral_literal.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:823:5: ^( I_ARRAY_ELEMENTS ( fixed_literal )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENTS, "I_ARRAY_ELEMENTS"), root_2);

                        // org/jf/smali/smaliParser.g:823:24: ( fixed_literal )*
                        while ( stream_fixed_literal.hasNext() ) {
                            adaptor.addChild(root_2, stream_fixed_literal.nextTree());

                        }
                        stream_fixed_literal.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 37 :
                    // org/jf/smali/smaliParser.g:825:3: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal (switch_target+= label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
                    {
                    PACKED_SWITCH_DIRECTIVE392=(Token)match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction3878);  
                    stream_PACKED_SWITCH_DIRECTIVE.add(PACKED_SWITCH_DIRECTIVE392);


                    			targetCount = 0;
                    			if ((((method_scope)method_stack.peek()).currentAddress % 2) != 0) {
                    				needsNop = true;
                    				retval.size = 2;
                    			} else {
                    				retval.size = 0;
                    			}
                    		
                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction3887);
                    fixed_32bit_literal393=fixed_32bit_literal();

                    state._fsp--;

                    stream_fixed_32bit_literal.add(fixed_32bit_literal393.getTree());
                    // org/jf/smali/smaliParser.g:838:3: (switch_target+= label_ref_or_offset )*
                    loop39:
                    do {
                        int alt39=2;
                        switch ( input.LA(1) ) {
                        case NEGATIVE_INTEGER_LITERAL:
                        case OFFSET:
                        case COLON:
                            {
                            alt39=1;
                            }
                            break;

                        }

                        switch (alt39) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:838:4: switch_target+= label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction3897);
                    	    switch_target=label_ref_or_offset();

                    	    state._fsp--;

                    	    stream_label_ref_or_offset.add(switch_target.getTree());
                    	    if (list_switch_target==null) list_switch_target=new ArrayList();
                    	    list_switch_target.add(switch_target.getTree());

                    	    retval.size+=4; targetCount++;

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    END_PACKED_SWITCH_DIRECTIVE394=(Token)match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction3906);  
                    stream_END_PACKED_SWITCH_DIRECTIVE.add(END_PACKED_SWITCH_DIRECTIVE394);

                    retval.size = retval.size + 8;


                    // AST REWRITE
                    // elements: fixed_32bit_literal, switch_target, switch_target, fixed_32bit_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: switch_target
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_switch_target=new RewriteRuleSubtreeStream(adaptor,"token switch_target",list_switch_target);
                    root_0 = (CommonTree)adaptor.nil();
                    // 843:3: -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) )
                    if (needsNop) {
                        // org/jf/smali/smaliParser.g:843:18: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, ((Token)retval.start), "I_STATEMENT_FORMAT10x"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(INSTRUCTION_FORMAT10x, ((Token)retval.start), "nop"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // org/jf/smali/smaliParser.g:844:6: ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_PACKED_SWITCH, ((Token)retval.start), "I_STATEMENT_PACKED_SWITCH"), root_1);

                        // org/jf/smali/smaliParser.g:845:7: ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_START_KEY, ((Token)retval.start), "I_PACKED_SWITCH_START_KEY"), root_2);

                        adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:846:7: ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_TARGETS, ((Token)retval.start), "I_PACKED_SWITCH_TARGETS"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(I_PACKED_SWITCH_TARGET_COUNT, ((Token)retval.start), Integer.toString(targetCount)));
                        // org/jf/smali/smaliParser.g:846:136: ( $switch_target)*
                        while ( stream_switch_target.hasNext() ) {
                            adaptor.addChild(root_2, stream_switch_target.nextTree());

                        }
                        stream_switch_target.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 849:3: -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) )
                    {
                        // org/jf/smali/smaliParser.g:849:6: ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_PACKED_SWITCH, ((Token)retval.start), "I_STATEMENT_PACKED_SWITCH"), root_1);

                        // org/jf/smali/smaliParser.g:850:5: ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_START_KEY, ((Token)retval.start), "I_PACKED_SWITCH_START_KEY"), root_2);

                        adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:851:5: ^( I_PACKED_SWITCH_TARGETS[$start, \"I_PACKED_SWITCH_TARGETS\"] I_PACKED_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ( $switch_target)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_TARGETS, ((Token)retval.start), "I_PACKED_SWITCH_TARGETS"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(I_PACKED_SWITCH_TARGET_COUNT, ((Token)retval.start), Integer.toString(targetCount)));
                        // org/jf/smali/smaliParser.g:851:134: ( $switch_target)*
                        while ( stream_switch_target.hasNext() ) {
                            adaptor.addChild(root_2, stream_switch_target.nextTree());

                        }
                        stream_switch_target.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 38 :
                    // org/jf/smali/smaliParser.g:855:3: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW switch_target+= label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
                    {
                    SPARSE_SWITCH_DIRECTIVE395=(Token)match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction4023);  
                    stream_SPARSE_SWITCH_DIRECTIVE.add(SPARSE_SWITCH_DIRECTIVE395);


                    			targetCount = 0;
                    			if ((((method_scope)method_stack.peek()).currentAddress % 2) != 0) {
                    				needsNop = true;
                    				retval.size = 2;
                    			} else {
                    				retval.size = 0;
                    			}
                    		
                    // org/jf/smali/smaliParser.g:866:3: ( fixed_32bit_literal ARROW switch_target+= label_ref_or_offset )*
                    loop40:
                    do {
                        int alt40=2;
                        switch ( input.LA(1) ) {
                        case POSITIVE_INTEGER_LITERAL:
                        case NEGATIVE_INTEGER_LITERAL:
                        case LONG_LITERAL:
                        case SHORT_LITERAL:
                        case BYTE_LITERAL:
                        case FLOAT_LITERAL_OR_ID:
                        case FLOAT_LITERAL:
                        case BOOL_LITERAL:
                        case CHAR_LITERAL:
                        case INTEGER_LITERAL:
                            {
                            alt40=1;
                            }
                            break;

                        }

                        switch (alt40) {
                    	case 1 :
                    	    // org/jf/smali/smaliParser.g:866:4: fixed_32bit_literal ARROW switch_target+= label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction4033);
                    	    fixed_32bit_literal396=fixed_32bit_literal();

                    	    state._fsp--;

                    	    stream_fixed_32bit_literal.add(fixed_32bit_literal396.getTree());
                    	    ARROW397=(Token)match(input,ARROW,FOLLOW_ARROW_in_instruction4035);  
                    	    stream_ARROW.add(ARROW397);

                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction4041);
                    	    switch_target=label_ref_or_offset();

                    	    state._fsp--;

                    	    stream_label_ref_or_offset.add(switch_target.getTree());
                    	    if (list_switch_target==null) list_switch_target=new ArrayList();
                    	    list_switch_target.add(switch_target.getTree());

                    	    retval.size += 8; targetCount++;

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    END_SPARSE_SWITCH_DIRECTIVE398=(Token)match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction4050);  
                    stream_END_SPARSE_SWITCH_DIRECTIVE.add(END_SPARSE_SWITCH_DIRECTIVE398);

                    retval.size = retval.size + 4;


                    // AST REWRITE
                    // elements: fixed_32bit_literal, switch_target, switch_target, fixed_32bit_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: switch_target
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_switch_target=new RewriteRuleSubtreeStream(adaptor,"token switch_target",list_switch_target);
                    root_0 = (CommonTree)adaptor.nil();
                    // 871:3: -> {needsNop}? ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] ) ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) )
                    if (needsNop) {
                        // org/jf/smali/smaliParser.g:871:18: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x[$start, \"nop\"] )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, ((Token)retval.start), "I_STATEMENT_FORMAT10x"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(INSTRUCTION_FORMAT10x, ((Token)retval.start), "nop"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // org/jf/smali/smaliParser.g:872:6: ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_SPARSE_SWITCH, ((Token)retval.start), "I_STATEMENT_SPARSE_SWITCH"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(I_SPARSE_SWITCH_TARGET_COUNT, ((Token)retval.start), Integer.toString(targetCount)));
                        // org/jf/smali/smaliParser.g:874:7: ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_KEYS, ((Token)retval.start), "I_SPARSE_SWITCH_KEYS"), root_2);

                        // org/jf/smali/smaliParser.g:874:62: ( fixed_32bit_literal )*
                        while ( stream_fixed_32bit_literal.hasNext() ) {
                            adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());

                        }
                        stream_fixed_32bit_literal.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:875:7: ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_TARGETS, "I_SPARSE_SWITCH_TARGETS"), root_2);

                        // org/jf/smali/smaliParser.g:875:33: ( $switch_target)*
                        while ( stream_switch_target.hasNext() ) {
                            adaptor.addChild(root_2, stream_switch_target.nextTree());

                        }
                        stream_switch_target.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 876:3: -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) )
                    {
                        // org/jf/smali/smaliParser.g:876:6: ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] I_SPARSE_SWITCH_TARGET_COUNT[$start, Integer.toString(targetCount)] ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* ) ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_SPARSE_SWITCH, ((Token)retval.start), "I_STATEMENT_SPARSE_SWITCH"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(I_SPARSE_SWITCH_TARGET_COUNT, ((Token)retval.start), Integer.toString(targetCount)));
                        // org/jf/smali/smaliParser.g:878:5: ^( I_SPARSE_SWITCH_KEYS[$start, \"I_SPARSE_SWITCH_KEYS\"] ( fixed_32bit_literal )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_KEYS, ((Token)retval.start), "I_SPARSE_SWITCH_KEYS"), root_2);

                        // org/jf/smali/smaliParser.g:878:60: ( fixed_32bit_literal )*
                        while ( stream_fixed_32bit_literal.hasNext() ) {
                            adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());

                        }
                        stream_fixed_32bit_literal.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // org/jf/smali/smaliParser.g:879:5: ^( I_SPARSE_SWITCH_TARGETS ( $switch_target)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_TARGETS, "I_SPARSE_SWITCH_TARGETS"), root_2);

                        // org/jf/smali/smaliParser.g:879:31: ( $switch_target)*
                        while ( stream_switch_target.hasNext() ) {
                            adaptor.addChild(root_2, stream_switch_target.nextTree());

                        }
                        stream_switch_target.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\1\1\12\uffff";
    static final String DFA4_minS =
        "\1\4\10\uffff\1\0\1\uffff";
    static final String DFA4_maxS =
        "\1\17\10\uffff\1\0\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA4_specialS =
        "\11\uffff\1\0\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\6\1\2\uffff\1\11\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 356:5: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\50\uffff";
    static final String DFA23_eofS =
        "\50\uffff";
    static final String DFA23_minS =
        "\1\54\45\170\2\uffff";
    static final String DFA23_maxS =
        "\1\u00d6\45\174\2\uffff";
    static final String DFA23_acceptS =
        "\46\uffff\1\2\1\1";
    static final String DFA23_specialS =
        "\50\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\1\4\3\uffff\1\6\1\7\2\uffff\1\10\1\11\4\uffff\1\12\1\16"+
            "\1\2\4\uffff\1\17\1\20\1\uffff\1\21\1\22\2\uffff\1\23\1\24\1"+
            "\25\1\26\2\uffff\1\27\1\uffff\1\30\1\31\1\32\1\33\1\34\1\uffff"+
            "\1\35\1\uffff\1\36\2\uffff\1\37\1\uffff\1\40\1\uffff\1\41\1"+
            "\42\1\43\1\44\3\uffff\1\45\5\uffff\1\14\1\15\2\uffff\1\13\1"+
            "\uffff\1\1\1\46\141\uffff\1\5",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "\1\47\3\uffff\1\46",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "565:4: ( simple_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor simple_name nonvoid_type_descriptor ) | method_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor method_name method_prototype ) )";
        }
    }
    static final String DFA31_eotS =
        "\73\uffff";
    static final String DFA31_eofS =
        "\73\uffff";
    static final String DFA31_minS =
        "\1\7\70\uffff\1\0\1\uffff";
    static final String DFA31_maxS =
        "\1\170\70\uffff\1\0\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\70\uffff\1\1";
    static final String DFA31_specialS =
        "\71\uffff\1\0\1\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\4\uffff\1\71\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\12\1\37\uffff\46\1\20\uffff\1\1",
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
            "\1\uffff",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 612:3: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_57 = input.LA(1);

                         
                        int index31_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_57);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_class_spec_in_smali_file436 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_super_spec_in_smali_file446 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_implements_spec_in_smali_file453 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_source_spec_in_smali_file461 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_method_in_smali_file468 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_field_in_smali_file473 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_annotation_in_smali_file478 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_EOF_in_smali_file487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec551 = new BitSet(new long[]{0x2000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_access_list_in_class_spec553 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec572 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec592 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec612 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list632 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field661 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_access_list_in_field663 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_field665 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_field667 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field669 = new BitSet(new long[]{0x00000000000093F2L,0x0080000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_field672 = new BitSet(new long[]{0x057FF00000004400L,0x0401E00000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_literal_in_field674 = new BitSet(new long[]{0x00000000000093F2L});
    public static final BitSet FOLLOW_annotation_in_field685 = new BitSet(new long[]{0x00000000000093F2L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method799 = new BitSet(new long[]{0x3866300000000000L,0x001A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_access_list_in_method801 = new BitSet(new long[]{0x3866300000000000L,0x001A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_method_name_in_method803 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_method805 = new BitSet(new long[]{0x00000007DEAF91F0L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_statements_and_directives_in_method807 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_statements_and_directives849 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_registers_directive_in_statements_and_directives857 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_label_in_statements_and_directives863 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_catch_directive_in_statements_and_directives869 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives875 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives881 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives887 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_annotation_in_statements_and_directives893 = new BitSet(new long[]{0x00000007DEAE91F2L,0x010000FFFFFFFFFCL});
    public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive992 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1014 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIMPLE_NAME_in_simple_name1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_simple_name1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_simple_name1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_simple_name1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_simple_name1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_simple_name1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_simple_name1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_simple_name1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_simple_name1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35s_METHOD_in_simple_name1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_method_name1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_NAME_in_method_name1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype1435 = new BitSet(new long[]{0x0000000000000000L,0x2007A00000000000L});
    public static final BitSet FOLLOW_param_list_in_method_prototype1437 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype1439 = new BitSet(new long[]{0x0000000000000000L,0x0001E00000000000L});
    public static final BitSet FOLLOW_type_descriptor_in_method_prototype1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_in_param_list1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list1486 = new BitSet(new long[]{0x0000000000000002L,0x0001A00000000000L});
    public static final BitSet FOLLOW_set_in_type_descriptor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nonvoid_type_descriptor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reference_type_descriptor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integer_literal1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_in_float_literal1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_LITERAL_in_double_literal1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_literal1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_literal1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_literal1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_literal1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_literal_in_literal1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subannotation_in_literal1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_method_literal_in_literal1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_literal_in_literal1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integral_literal1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_literal1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_literal1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_fixed_literal1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1825 = new BitSet(new long[]{0x057FF00000004400L,0x0C01E00000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_literal_in_array_literal1828 = new BitSet(new long[]{0x0000000000000000L,0x0A00000000000000L});
    public static final BitSet FOLLOW_COMMA_in_array_literal1831 = new BitSet(new long[]{0x057FF00000004400L,0x0401E00000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_literal_in_array_literal1833 = new BitSet(new long[]{0x0000000000000000L,0x0A00000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_annotation_element1862 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_element1864 = new BitSet(new long[]{0x057FF00000004400L,0x0401E00000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_literal_in_annotation_element1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1888 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1890 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation1892 = new BitSet(new long[]{0x3866300000002000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_annotation_element_in_annotation1896 = new BitSet(new long[]{0x3866300000002000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1929 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation1931 = new BitSet(new long[]{0x3866300000000800L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_annotation_element_in_subannotation1933 = new BitSet(new long[]{0x3866300000000800L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1959 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1961 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ARROW_in_enum_literal1963 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_enum_literal1965 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_enum_literal1967 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1991 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1997 = new BitSet(new long[]{0x3866300000000000L,0x001A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_type_field_method_literal2004 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_type_field_method_literal2006 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_type_field_method_literal2027 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method2077 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_method2079 = new BitSet(new long[]{0x3866300000000000L,0x001A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_method_name_in_fully_qualified_method2081 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field2101 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_field2103 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_fully_qualified_field2105 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_fully_qualified_field2107 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label2127 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_label2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label_ref_or_offset2150 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_list2180 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_register_list2183 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_list2185 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range2215 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_register_range2218 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive2243 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive2245 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive2247 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive2251 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catch_directive2253 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive2257 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive2259 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive2295 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive2297 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive2301 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catchall_directive2303 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive2307 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive2309 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive2351 = new BitSet(new long[]{0x01000000200091F2L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive2355 = new BitSet(new long[]{0x00000000200091F2L});
    public static final BitSet FOLLOW_annotation_in_parameter_directive2363 = new BitSet(new long[]{0x00000000200091F2L});
    public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive2471 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_line_directive2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive2495 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_local_directive2497 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_local_directive2499 = new BitSet(new long[]{0x3866300000000000L,0x000A608F52BE9E6CL,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_local_directive2501 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_COLON_in_local_directive2503 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive2505 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_local_directive2508 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive2542 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_end_local_directive2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive2567 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_restart_local_directive2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive2634 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_instruction2732 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_instruction2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_instruction2778 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2780 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2782 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_instruction2809 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format12x_in_instruction2834 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2836 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2838 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_instruction2865 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction2890 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2892 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2894 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction2921 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2923 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2925 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction2939 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2941 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2943 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction2970 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2972 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2974 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21h_in_instruction3001 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3003 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3005 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_instruction3032 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3034 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3036 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_instruction3063 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3065 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3067 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_instruction3096 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3098 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3100 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3102 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3104 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction3133 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3135 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3137 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3139 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3141 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction3170 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3172 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3174 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3176 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3178 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction3192 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3194 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3196 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3198 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3200 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction3229 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3231 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3233 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3235 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3237 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_FIELD_OFFSET_in_instruction3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format22s_in_instruction3251 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3253 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3255 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3257 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3259 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_instruction3288 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3290 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3292 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3294 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3296 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_instruction3325 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3327 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3329 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_instruction3356 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3358 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3360 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3362 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3364 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_instruction3393 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_instruction3418 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3420 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3422 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format31i_in_instruction3448 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3450 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3452 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_instruction3479 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3481 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3483 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_instruction3514 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3516 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3518 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction3545 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3547 = new BitSet(new long[]{0x0800000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction3549 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3551 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3553 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction3580 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3582 = new BitSet(new long[]{0x0800000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction3584 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3586 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3588 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35s_METHOD_in_instruction3615 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3617 = new BitSet(new long[]{0x0800000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction3619 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3621 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3623 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction3637 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3639 = new BitSet(new long[]{0x0800000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction3641 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3643 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3645 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VTABLE_OFFSET_in_instruction3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction3659 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3661 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction3663 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3665 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3667 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction3694 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3696 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction3698 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3700 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3702 = new BitSet(new long[]{0x0000000000000000L,0x0001A00000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction3729 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction3731 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction3733 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction3735 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3737 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VTABLE_OFFSET_in_instruction3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_instruction3751 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction3753 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction3755 = new BitSet(new long[]{0x043FF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction3781 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction3790 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction3793 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction3878 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction3887 = new BitSet(new long[]{0x0000200000400000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction3897 = new BitSet(new long[]{0x0000200000400000L,0x0100000000000001L});
    public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction4023 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction4033 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ARROW_in_instruction4035 = new BitSet(new long[]{0x0000200000000000L,0x0100000000000001L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction4041 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction4050 = new BitSet(new long[]{0x0000000000000002L});

}