package com.yztc.lin.homework;

public class Test3 {

	/**
	 * 给定字符串数组：
	 * 
	 * String strings[]= {"string","starting","strong","street",
	 * "stir","studeng","soft","sting"}
	 * 
	 * 要求：分别统计以st开头的字符串有多少个，以ng结尾的字符串有多少个
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String strings[] = { "string", "starting", "strong", "street", "stir", "studeng", "soft", "sting" };

		int stStartNum = 0;
		int ngEndNum = 0;
		for (String s : strings) {

			boolean startsWith = s.startsWith("st");
			boolean endsWith = s.endsWith("ng");
			if (startsWith) {
				stStartNum++;
			}
			if (endsWith) {
				ngEndNum++;
			}

		}
		System.out.println("st开头的字符串有" + stStartNum + "个，以ng结尾的字符串有" + ngEndNum + "个");

	}

}
