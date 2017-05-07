package com.yztc.lin.homework;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test9 {

	/**
	 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个。(用GBK编码处理)
	 * 
	 * 如"我ABC"和4 应该截为"我AB"
	 * 
	 * @输入"我ABC汉DEF"和6，应该输出为"我ABC"而不是"我ABC+汉的半个"。
	 * 
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "我A汉汉DEF";

		fun(str, 6);

	}

	public static void fun(String str, int byteNum) throws UnsupportedEncodingException {
		byte[] bytes = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes));
		int k = 0;
		for (int i = 0; i < byteNum; i++) {
			if (bytes[i] < 0) {
				k++;
			}
		}
		if (k % 2 == 0) {
			System.out.println(new String(bytes, 0, byteNum));
		} else {
			System.out.println(new String(bytes, 0, byteNum - 1));
		}

	}

}
