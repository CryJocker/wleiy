package com.yztc.lin.homework;

public class Test8 {

	/**
	 * ��дһ�����򣬽������һ���ı��еĸ������ʵ���ĸ˳��ת��
	 * 
	 * @����: ��To be or not to be"�������"oT eb ro ton ot eb"��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "To be or not to be";
		System.out.println(str);
		String[] split = str.split(" ");
		for (String s : split) {

			System.out.print(reverseStr(s) + " ");

		}

	}

	public static String reverseStr(String s) {
		if (s == null) {
			return "";
		}
		return new StringBuilder(s).reverse().toString();
	}

}
