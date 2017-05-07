package com.yztc.lin.homework;

import java.util.Random;

public class Test10 {

	static char cs[] = new char[] { 'a' };
	
	/**
	 * 现在需要100个随机验证码。每个验证码要求是：
	 * 
	 * 1. 每个验证码是四位 2. 验证码可以是数字和字母
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int start = 0;
		for (int i = start; i < 10; i++) {
			cs[start++] = (char) (48 + i);
		}
		for (int i = 0; i < 26; i++) {
			cs[start++] = (char) (65 + i);
		}
		for (int i = 0; i < 26; i++) {
			cs[start++] = (char) (97 + i);
		}

		// 97-122
		// 65-90
		// 48 - 57
		for (int i = 0; i < 100; i++) {
			String code = getCode();
			System.out.println(code);
		}

	}

	static Random r = new Random();

	public static String getCode() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append(cs[r.nextInt(62)]);
		}
		return sb.toString();
	}

	// public static String getCode() {
	// StringBuffer sb = new StringBuffer();
	// for (int i = 0; i < 4; i++) {
	// int nextInt = r.nextInt(62) + 48;
	// if (nextInt > 57 && nextInt < 65) {
	// nextInt += 8;
	// }
	// if (nextInt > 90&&nextInt<=115) {
	// nextInt += 7;
	// }
	// char c = (char) nextInt;
	// sb.append(c);
	// }
	// return sb.toString();
	// }

}
