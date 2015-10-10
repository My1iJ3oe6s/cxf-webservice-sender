package com.sp.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

public class StringUtil extends StringUtils {

	public static boolean isNullOrEmpty(String str) {
		return isEmpty(str);
	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return equals
	 */
	public static boolean isEquals(String s1, String s2) {
		if (s1 == null && s2 == null)
			return true;
		if (s1 == null || s2 == null)
			return false;
		return s1.equals(s2);
	}

	/**
	 * parses the specified string as a signed decimal integer value
	 * 
	 * @param str
	 *            input string representation of an integer value.
	 * @return boolean true: each character is integer false: other
	 */
	public static boolean isInteger(String str) {
		if (isBlank(str))
			return false;
		try {
			Integer.parseInt(str.trim());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * parses the specified string as a signed decimal long value
	 * 
	 * @param str
	 *            input string representation of an integer value.
	 * @return boolean true: each character is long integer false: other
	 */
	public static boolean isLong(String str) {
		if (isBlank(str))
			return false;
		try {
			Long.parseLong(str.trim());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * parses the specified string as a signed boolean value
	 * 
	 * @param str
	 *            input string
	 * @return boolean true: str = true / TRUE (Ignore upper case or low case)
	 *         false: other
	 */
	public static boolean isBoolean(String str) {
		if (isBlank(str))
			return false;
		try {
			Boolean.parseBoolean(str.trim());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * checks the specified string as a double value
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isDouble(String str) {
		if (isBlank(str))
			return false;
		try {
			Double.parseDouble(str.trim());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * checks the specified string as a Date value
	 * 
	 * @param str
	 *            the input string
	 * @return boolean str为时间型返回true，否则返回false
	 */
	public static boolean isDate(String str) {
		if (isBlank(str))
			return false;
		try {
			java.sql.Date.valueOf(str.trim());
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * checks the string arrays is all long values
	 * 
	 * @param str
	 *            the input string array
	 * @return boolean str为长整型数组返回true，否则返回false
	 */
	public static boolean isLongs(String str[]) {
		for (int i = 0; i < str.length; i++) {
			if (!isLong(str[i]))
				return false;
		}
		return true;
	}

	/**
	 * 检查字符串数组str是否为整型数组
	 * 
	 * @param str
	 *            要检查的字符串
	 * @return boolean str为整型数组返回true，否则返回false
	 */
	public static boolean isIntegers(String str[]) {
		for (int i = 0; i < str.length; i++)
			if (!isInteger(str[i]))
				return false;
		return true;
	}

	/**
	 * 检查字符串数组str是否为布尔型数组
	 * 
	 * @param str
	 *            要检查的字符串
	 * @return boolean str为布尔型数组返回true，否则返回false
	 */
	public static boolean isBooleans(String str[]) {
		for (int i = 0; i < str.length; i++)
			if (!isBoolean(str[i]))
				return false;
		return true;
	}

	/**
	 * 检查字符串str是否为时间
	 * 
	 * @param str
	 *            要检查的字符串
	 * @return str为时间型返回true，否则返回false
	 */
	public static boolean isTimestamp(String str) {
		if (isBlank(str))
			return false;
		try {
			java.sql.Date.valueOf(str.trim());
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	/**
	 * 检查字符串str是否为(yyyy-MM-dd HH:mm:ss)模式的时间
	 * 
	 * @param str
	 *            要检查的字符串
	 * @return str为时间型返回true，否则返回false
	 */
	public static boolean isFullTimestamp(String str) {
		if (isBlank(str))
			return false;
		try {
			SimpleDateFormat format = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			Date date = format.parse(str.trim());
			return date != null;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * 将字符串转换成长整型
	 * 
	 * @param str
	 * @return
	 */
	public static Long stringToLong(String str) {
		return new Long(str);
	}

	/**
	 * 将字符串转换成整型
	 * 
	 * @param str
	 * @return
	 */
	public static Integer stringToInteger(String str) {
		return new Integer(str);
	}

	/**
	 * 将字符串转换成布尔型
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean stringToBoolean(String str) {
		return new Boolean(str);
	}

	/**
	 * 将字符串转换成浮点型
	 * 
	 * @param str
	 * @return
	 */
	public static Double stringToDouble(String str) {
		return new Double(str);
	}

	/**
	 * 将字符数组转换为长整型数组
	 * 
	 * @param str
	 *            字符数组
	 * @return Long[] 长整型数组
	 */
	public static Long[] stringsToLongs(String str[]) {
		Long lon[] = new Long[str.length];
		for (int i = 0; i < lon.length; i++)
			lon[i] = new Long(str[i]);
		return lon;
	}

	/**
	 * 将字符数组转换为整型数组
	 * 
	 * @param str
	 *            字符数组
	 * @return Integer[] 整型数组
	 */
	public static Integer[] stringsToIntegers(String str[]) {
		Integer array[] = new Integer[str.length];
		for (int i = 0; i < array.length; i++)
			array[i] = new Integer(str[i]);
		return array;
	}

	/**
	 * 将字符数组转换为布尔型数组
	 * 
	 * @param str
	 *            字符数组
	 * @return Boolean[] 布尔型数组
	 */
	public static Boolean[] stringsToBooleans(String str[]) {
		Boolean array[] = new Boolean[str.length];
		for (int i = 0; i < array.length; i++)
			array[i] = new Boolean(str[i]);
		return array;
	}

	/**
	 * 将字符数组转换为浮点型数组
	 * 
	 * @param str
	 *            字符数组
	 * @return double[] 浮点型数组
	 */
	public static double[] stringsToDoubles(String str[]) {
		double array[] = new double[str.length];
		for (int i = 0; i < array.length; i++)
			array[i] = Double.parseDouble(str[i]);
		return array;
	}

	/**
	 * 得到数字格式化后的字符串
	 * 
	 * @param number
	 *            Number类型
	 * @param minFractionDigits
	 *            小数最小位数
	 * @param maxFractionDigits
	 *            小数最大位数
	 * @return String 格式化后的字符串
	 */
	public static String formatNumber(Number number, int minFractionDigits,
			int maxFractionDigits) {
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(minFractionDigits);
		format.setMaximumFractionDigits(maxFractionDigits);
		return format.format(number);
	}

	/**
	 * 替换指定的字符串数组为一个字符串数组<br>
	 * 速度比String.replaceAll快3倍左右，比apache-common StringUtils.replace快2倍左右
	 * 
	 * @param text
	 * @param replaceStrs
	 * @param newStrs
	 * @return
	 */
	public static String replaceAllArray(String text, String[] replaceStrs,
			String[] newStrs) {
		if (text.length() == 0)
			return text;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < replaceStrs.length; i++) {
			String replaceStr = replaceStrs[i];
			int index = text.indexOf(replaceStr);
			if (index >= 0) {
				String afterStr = null;
				if (index > 0) {
					String beforeStr = text.substring(0, index);
					afterStr = text.substring(index + replaceStr.length());
					str.append(replaceAllArray(beforeStr, replaceStrs, newStrs));
				} else
					afterStr = text.substring(replaceStr.length());
				str.append(newStrs[i]);
				str.append(replaceAllArray(afterStr, replaceStrs, newStrs));
				break;
			}
		}
		if (str.length() == 0)
			return text;
		return str.toString();
	}

	/**
	 * 解码HTML(将&gt;,&lt;,&quot;,&amp;转换成>,<,",& )
	 * 
	 * @param html
	 * @return
	 */
	public static String decodeHTML(String html) {
		if (isBlank(html))
			return EMPTY;
		String[] replaceStr = { "&amp;", "&lt;", "&gt;", "&quot;" };
		String[] newStr = { "&", "<", ">", "\"" };
		return replaceAllArray(html, replaceStr, newStr);
	}

	/**
	 * 编码HTML(将>,<,",&
	 * 转换成&gt;,&lt;,&quot;,&amp;)(高效率，来自FreeMarker模板源码，比replaceAll速度快很多)
	 * 
	 * @param html
	 * @return
	 */
	public static String encodeHTML(String html) {
		if (isBlank(html))
			return EMPTY;
		int ln = html.length();
		char c;
		StringBuffer b;
		for (int i = 0; i < ln; i++) {
			c = html.charAt(i);
			// 获取第一个匹配的字符后，进入匹配后的代码段。否则单纯循环
			if (c == '<' || c == '>' || c == '&' || c == '"') {
				b = new StringBuffer(html.substring(0, i));
				switch (c) {
				case '<':
					b.append("&lt;");
					break;
				case '>':
					b.append("&gt;");
					break;
				case '&':
					b.append("&amp;");
					break;
				case '"':
					b.append("&quot;");
					break;
				}
				i++;
				int next = i;
				while (i < ln) {
					c = html.charAt(i);
					if (c == '<' || c == '>' || c == '&' || c == '"') {
						b.append(html.substring(next, i));
						switch (c) {
						case '<':
							b.append("&lt;");
							break;
						case '>':
							b.append("&gt;");
							break;
						case '&':
							b.append("&amp;");
							break;
						case '"':
							b.append("&quot;");
							break;
						}
						next = i + 1;
					}
					i++;
				}
				if (next < ln)
					b.append(html.substring(next));
				html = b.toString();
				break;
			}
		}
		return html;
	}

	/**
	 * MD5加密
	 * 
	 * @param plainText
	 *            要加密的字符串
	 * @return 加密后的字符串
	 */
	public static String Md5(String plainText) {
		StringBuffer buf = new StringBuffer(EMPTY);
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i = 0;
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buf.toString();
	}

	/**
	 * MD5加密(32)
	 * 
	 * @param plainText
	 *            要加密的字符串
	 * @return
	 */
	public final static String MD5(String plainText) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = plainText.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 对分隔符分隔的字符串进行trim处理，如 1 | 2 -> 1|2
	 * 
	 * @param str
	 * @param delimiter
	 * @return
	 */
	public static String trimSeparator(String str, String delimiter) {
		String[] array = split(str, delimiter);
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for (String s : array) {
			if (isNotBlank(s)) {
				if (!first) {
					sb.append(delimiter);
				}
				sb.append(trim(s));
				if (first)
					first = false;
			}
		}
		return sb.toString();
	}

	/**
	 * 把某字符串默认按照 ISO8859_1 读取成字节流后，再按照UTF-8编码方式变成UTF-8字符串
	 * 
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encodeUTF8(String str)
			throws UnsupportedEncodingException {
		return encodeUTF8(str, "ISO8859_1");
	}

	public static String encodeUTF8(String str, String charsetName)
			throws UnsupportedEncodingException {
		return new String(str.getBytes(charsetName), "UTF-8");
	}

	public static void main(String[] args) {
		System.out.println(formatNumber(100, 2, 3));
		System.out.println(encodeHTML("ddfd<a>dfdsf&fgh'fdsf'fsd</a>"));
		System.out.println("abc".substring(0, 0));
		System.out.println(Md5("aa"));
		System.out
				.println(MD5("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
		System.out.println(formatNumber(100, 1, 2));
		System.out.println(stringToLong("100"));
		System.out.println(stringToDouble("100.23"));
		System.out.println(88.10);
		System.out.println(trimSeparator("1 |x|    2", "|"));
	}

	public static int boolToInt(boolean flog) {
		return flog ? 1 : 0;
	}

	public static String Left(String input, int length) {
		int inputLength = input.length();
		if (length <= 0)
			return input;
		if (length >= inputLength)
			return input;

		return input.substring(0, length);
	}

	public static String Right(String input, int length) {
		int inputLength = input.length();
		if (length <= 0)
			return input;
		if (length >= inputLength)
			return input;

		return input.substring(inputLength - length, inputLength);
	}

	/**
	 * 将String转换为List<String>
	 * 
	 * @param str
	 * @return
	 */
	public static List<String> strToList(String str) {
		if (StringUtils.isEmpty(str)) {
			return null;
		} else {
			List<String> list = Arrays.asList(str.split(","));
			List<String> result = null;
			for (String s : list) {
				if (result == null) {
					result = new ArrayList<String>();
				}
				result.add(StringUtils.trim(s));
			}
			return result;
		}
	}

	/**
	 * 首字母大写
	 * 
	 * @param str
	 * @return
	 */
	public static String upperFirst(String str) {
		if (StringUtils.isEmpty(str)) {
			return null;
		} else {
			if (str.length() >= 2) {
				String firstLetter = str.substring(0, 1).toUpperCase();
				str = firstLetter + str.substring(1);
			} else {
				str = str.toUpperCase();
			}
		}
		return str;
	}

	public static String base64encoded(String src) {
		if (src != null) {
			try {
				return Base64.encodeBase64String(src.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}
	
	public static String base64encoded(byte[] src) {
		if (src != null) {
			try {
				return Base64.encodeBase64String(src);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}
	public static byte[] base64decoded(String src) {
		if (src != null) {
			return Base64.decodeBase64(src);
		}
		return null;
	}
}
