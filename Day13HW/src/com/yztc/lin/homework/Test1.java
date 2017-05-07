package com.yztc.lin.homework;

import java.util.Arrays;

public class Test1 {

	/**
	 * ��֪�ַ�����"this is a test of java"
	 * 
	 * ��Ҫ��ִ�����²�����
	 * 
	 * (1) ͳ�Ƹ��ַ�������ĸs���ֵĴ���
	 * 
	 * (2) ȡ�����ַ���"test"
	 * 
	 * (3) �����ַ������Ƶ�һ���ַ�����Char[] str��.
	 * 
	 * (4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��
	 * 
	 * (5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String tag = "this is a test of java";

		/** (1) ͳ�Ƹ��ַ�������ĸs���ֵĴ��� **/
		int sNum = 0;
		for (int i = 0; i < tag.length(); i++) {
			if (tag.charAt(i) == 's') {
				sNum++;
			}
		}
		System.out.println("s���ֵĴ�����" + sNum);

		/** ȡ�����ַ���"test" **/
		String test = tag.substring(10, 14);
		System.out.println("ȡ�����ַ�����" + test);
		/** �����ַ������Ƶ�һ���ַ�����Char[] str��. */
		char[] charArray = tag.toCharArray();
		System.out.println(Arrays.toString(charArray));

		/** ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��. */
		String[] split = tag.split(" ");
		for (String s : split) {
			System.out.print(upperFirstChar(s) + " ");
		}
		System.out.println();
		/** �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��) */
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
