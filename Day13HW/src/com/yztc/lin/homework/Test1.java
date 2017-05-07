package com.yztc.lin.homework;

import java.util.Arrays;

public class Test1 {

	/**
	 * 已知字符串："this is a test of java"
	 * 
	 * 按要求执行以下操作：
	 * 
	 * (1) 统计该字符串中字母s出现的次数
	 * 
	 * (2) 取出子字符串"test"
	 * 
	 * (3) 将本字符串复制到一个字符数组Char[] str中.
	 * 
	 * (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
	 * 
	 * (5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String tag = "this is a test of java";

		/** (1) 统计该字符串中字母s出现的次数 **/
		int sNum = 0;
		for (int i = 0; i < tag.length(); i++) {
			if (tag.charAt(i) == 's') {
				sNum++;
			}
		}
		System.out.println("s出现的次数：" + sNum);

		/** 取出子字符串"test" **/
		String test = tag.substring(10, 14);
		System.out.println("取出的字符串：" + test);
		/** 将本字符串复制到一个字符数组Char[] str中. */
		char[] charArray = tag.toCharArray();
		System.out.println(Arrays.toString(charArray));

		/** 将字符串中每个单词的第一个字母变成大写， 输出到控制台。. */
		String[] split = tag.split(" ");
		for (String s : split) {
			System.out.print(upperFirstChar(s) + " ");
		}
		System.out.println();
		/** 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现) */
		for (int i = tag.length() - 1; i >= 0; i--) {
			System.out.print(tag.charAt(i));
		}
		System.out.println();
		String result = new StringBuilder(tag).reverse().toString();
		System.out.println(result);

	}

	public static String upperFirstChar(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		String charAt = s.charAt(0) + "";
		String upperCase = charAt.toUpperCase();
		StringBuilder sb = new StringBuilder(s);
		return sb.replace(0, 1, upperCase).toString();
	}

}
