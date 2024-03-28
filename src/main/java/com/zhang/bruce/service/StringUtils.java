package com.zhang.bruce.service;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils
{
	public static final Pattern timeFormtPattern1 = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}");
	public static final Pattern timeFormtPattern2 = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}[0-9]{2}:[0-9]{2}:[0-9]{2}");

    public StringUtils()
    {
    }

    public static boolean isEmpty(String cs)
    {
    	return isBlank(cs);
    }

    public static boolean isNotEmpty(String cs)
    {
        return !isEmpty(cs);
    }

    public static boolean isBlank(String cs)
    {
        int strLen;
        if(cs == null)
            return true;
        cs = cs.trim();
        if((strLen = cs.length()) == 0)
            return true;
        for(int i = 0; i < strLen; i++)
            if(!Character.isWhitespace(cs.charAt(i)))
                return false;

        return true;
    }

    public static boolean isNotBlank(String cs)
    {
        return !isBlank(cs);
    }

    public static String trim(String str)
    {
        return str != null ? str.trim() : null;
    }

    public static String trimToNull(String str)
    {
        String ts = trim(str);
        return isEmpty(ts) ? null : ts;
    }

    public static String trimToEmpty(String str)
    {
        return str != null ? str.trim() : "";
    }

    public static String strip(String str)
    {
        return strip(str, null);
    }

    public static String stripToNull(String str)
    {
        if(str == null)
        {
            return null;
        } else
        {
            str = strip(str, null);
            return str.length() != 0 ? str : null;
        }
    }

    public static String stripToEmpty(String str)
    {
        return str != null ? strip(str, null) : "";
    }

    public static String strip(String str, String stripChars)
    {
        if(isEmpty(str))
        {
            return str;
        } else
        {
            str = stripStart(str, stripChars);
            return stripEnd(str, stripChars);
        }
    }

    public static String stripStart(String str, String stripChars)
    {
        int strLen;
        if(str == null || (strLen = str.length()) == 0)
            return str;
        int start = 0;
        if(stripChars == null)
        {
            for(; start != strLen && Character.isWhitespace(str.charAt(start)); start++);
        } else
        {
            if(stripChars.length() == 0)
                return str;
            for(; start != strLen && stripChars.indexOf(str.charAt(start)) != -1; start++);
        }
        return str.substring(start);
    }

    public static String stripEnd(String str, String stripChars)
    {
        int end;
        if(str == null || (end = str.length()) == 0)
            return str;
        if(stripChars == null)
        {
            for(; end != 0 && Character.isWhitespace(str.charAt(end - 1)); end--);
        } else
        {
            if(stripChars.length() == 0)
                return str;
            for(; end != 0 && stripChars.indexOf(str.charAt(end - 1)) != -1; end--);
        }
        return str.substring(0, end);
    }

    public static boolean equals(CharSequence cs1, CharSequence cs2)
    {
        return cs1 != null ? cs1.equals(cs2) : cs2 == null;
    }

    public static String toSBC(String input)
    {
        char c[] = input.toCharArray();
        for(int i = 0; i < c.length; i++)
            if(c[i] == ' ')
                c[i] = '\u3000';
            else
            if(c[i] < '\177')
                c[i] = (char)(c[i] + 65248);

        return new String(c);
    }

    public static String toDBC(String input)
    {
        char c[] = input.toCharArray();
        for(int i = 0; i < c.length; i++)
            if(c[i] == '\u3000')
                c[i] = ' ';
            else
            if(c[i] > '\uFF00' && c[i] < '\uFF5F')
                c[i] = (char)(c[i] - 65248);

        return new String(c);
    }

    public static String fillBitsWithPlaceholder(String placeholder, String str, int bitNum)
    {
        if(str == null)
            throw new IllegalArgumentException("str must not be null");
        if(placeholder == null || bitNum <= 0)
            return str;
        if(str.length() < bitNum)
        {
            StringBuffer buffer = new StringBuffer();
            for(int index = str.length(); index < bitNum; index++)
                buffer.append(placeholder);

            buffer.append(str);
            return buffer.toString();
        } else
        {
            return str;
        }
    }

    public static String spliceIntegerToString(Integer addend, Integer summand)
    {
        if(addend == null || summand == null)
            throw new IllegalArgumentException("addend and summand arguments must not be null");
        else
            return (new StringBuilder(String.valueOf(String.valueOf(addend)))).append(String.valueOf(summand)).toString();
    }

    public static String defaultIfNull(String str)
    {
        return str == null ? "" : str;
    }

    public static String rightPadWithBytes(String str, int size, char padChar, String encoding)
    {
        return padWithBytes(str, size, padChar, encoding, false);
    }

    public static String leftPadWithBytes(String str, int size, char padChar, String encoding)
    {
        return padWithBytes(str, size, padChar, encoding, true);
    }

    private static String padWithBytes(String str, int size, char padChar, String encoding, boolean isLeft)
    {
        if(str == null)
            return null;
        int strLen;
        try
        {
            strLen = str.getBytes(encoding).length;
        }
        catch(UnsupportedEncodingException e)
        {
            throw new RuntimeException((new StringBuilder("UnsupportedEncoding:")).append(encoding).toString(), e);
        }
        int pads = size - strLen;
        if(pads <= 0)
            return str;
        char padChars[] = new char[pads];
        for(int i = 0; i < padChars.length; i++)
            padChars[i] = padChar;

        if(isLeft)
            return (new StringBuilder(String.valueOf(new String(padChars)))).append(str).toString();
        else
            return (new StringBuilder(String.valueOf(str))).append(new String(padChars)).toString();
    }

    public static String getStringValueFromObj(Object obj){
		if(obj == null){
			return "";
		}
		return (String)obj;
	}

    public static String getStringValueFromString(String obj){
		if(obj == null || isEmpty(obj)){
			return "";
		}
		return obj;
	}

    public static String filterBlank(String param){
    	if(StringUtils.isBlank(param)){
    		return "";
    	}
    	Pattern p = Pattern.compile("\\s*|\t|\r|\n");
        Matcher m = p.matcher(param);
        String strNoBlank = m.replaceAll("");
        return strNoBlank;
    }

    /**
     * @Author pengfei.yang
     * @Description 替换字符串中所有的"空白"、"\t"、"\r"、"\n"字符，但是不包含"2019-09-26 12:00:00"这样的日期格式的字符串中的"空白"字符
     * @Date 2019/9/26 1:05 PM
     * @param
     * @return
     */
    public static String filterBlank2(String param){
        if(StringUtils.isBlank(param)){
            return "";
        }
        Pattern p = Pattern.compile("(?<!\\d{4}\\-\\d{1,2}\\-\\d{1,2})\\s+(?!\\d{2}\\:\\d{2}\\:\\d{2})|\t|\r|\n");
        Matcher m = p.matcher(param);
        String strNoBlank = m.replaceAll("");
        return strNoBlank;
    }

    /**
	 * 判断字符串是否为日期格式
	 * 	格式：yyyy-MM-dd HH:mm:ss
	 * @param val
	 * @return
	 */
	public static boolean isTimeFormat(String val){
		if(StringUtils.isBlank(val)){
			return false;
		}
		String str = val.trim();
		String[] vals = str.split(";");
		if(vals == null || vals.length==0){
			return false;
		}
		boolean result = true;
		for(String v : vals){
			String tmp = v.trim();
			if(StringUtils.isBlank(tmp)){
				continue;
			}
			Matcher m1 = timeFormtPattern1.matcher(tmp);
			Matcher m2 = timeFormtPattern2.matcher(tmp);
			if(!m1.matches()&&!m2.matches()){
				result = false;
				break;
			}
		}
		return result;
	}


	public static String valueTimeFormat(String str){
		String[] vals = str.split(";");
		StringBuilder sb = new StringBuilder();
		str = str.trim();
		String result = "";
		if(vals == null || vals.length==0){
			return "";
		}
		for(String val : vals){
			val = val.trim();
			if(StringUtils.isBlank(val)){
				continue;
			}
			String val1 = val.substring(0, 10).trim();
			String val2 = val.substring(10).trim();
			val = val1+" "+val2+";";
			sb.append(val);
		}
		result = sb.toString();
		if(result.length()>0){
			result = result.substring(0, result.length()-1);
		}
		return result;
	}

    public static void main(String args[])
    {
//        System.out.println((new StringBuilder(String.valueOf(padWithBytes("\u5317\u4EAC\u901A\u878D\u901A\u4FE1\u606F\u6280\u672F\u6709\u9650\u516C\u53F8\u6DF1\u5733\u5206\u516C\u53F8", 60, ' ', "GBK", true)))).append("|").toString());
//        System.out.println((new StringBuilder(String.valueOf(padWithBytes("\u5317\u4EAC\u901A\u878D\u901A\u4FE1\u606F\u6280\u672F\u6709\u9650\u516C\u53F8\u6DF1\u5733", 60, ' ', "GBK", true)))).append("|").toString());
    	String ss = "[ productId=NOCARDPAY	, production=YJZF,merchantNo=YB0100000078,requestId=test1000a3,sequenceId=880003,occurTime=2015-10-19 11:42:42,rmSequence=,paymentId=test003, goodsCode=60, bankCardType=DEBIT, bankId=CMBCHINA, useTool=API, userId=2003, merchantLevel=, userType=, bindCardId=, authLevel=, merchantBindWebSite=, refer=, bankCardName=, bankCardNo=6214830103334768, bankAccountNoArea=北京, idType=, idNo=, idnoArea=not found idcardarea, bankChannelId=, terminalIdentifyCode=, terminalType=, merchantIp=, merchantIpArea=, userIp=119.161.147.101, userIpArea=北京, merchantUserIp=, merchantUserIpArea=, userAgent=, serverId=, sessionId=, mac=, userPhone=13810580123, mobileArea=北京, firstPay=0, useChannel=, virtualTerminalId=, goodsInfo={'customerid':'10012435334','firstRecharge':'0','terminalid':'2a'}, toolsInfo=, shopman=, noshopman=,subProductId=,goodsName=]";
//		String ss1 = ss.replaceAll(" ", "");
    	String ss1 = filterBlank(ss);
		System.out.println(ss1);

    }

    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    private static final int PAD_LIMIT = 8192;
    private static final Pattern WHITESPACE_BLOCK = Pattern.compile("\\s+");
    private static boolean sunAvailable = false;
    private static Method sunDecomposeMethod = null;
    private static boolean java6Available = false;
    private static Method java6NormalizeMethod = null;
    private static Object java6NormalizerFormNFD = null;


}

