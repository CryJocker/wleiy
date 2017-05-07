package com.yztc.lin.homework;

public class Test8 {

	/**
	 * 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转。
	 * 
	 * @例如: “To be or not to be"，将变成"oT eb ro ton ot eb"。
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
