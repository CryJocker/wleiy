package com.yztc.lin.homework;

public class Test6 {

	/**
	 * �����ַ���:
	 * 
	 * 01#����#2002#����#3003#����#40������������������ÿ���˷������١�
	 * 
	 * �����ʽ���£�
	 * 
	 * 01 ���� 20
	 * 
	 * 02 ���� 30
	 * 
	 * 03 ���� 40
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tag = "01#����#2002#����#3003#����#4004#С��#50";
		StringBuilder sb = new StringBuilder(tag);
		for (int i = 0; i < sb.length(); i += 8) {
			String substring = sb.substring(i, i + 8);
			String[] split = substring.split("#");
			for (String y : split) {
				System.out.print(y + " ");
			}
			System.out.println();

		}

	}

}
