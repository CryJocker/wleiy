package com.yztc.lin.homework;

public class Test6 {

	/**
	 * 如下字符串:
	 * 
	 * 01#张三#2002#李四#3003#王五#40。。。。。。，解析每个人分数多少。
	 * 
	 * 输出样式如下：
	 * 
	 * 01 张三 20
	 * 
	 * 02 李四 30
	 * 
	 * 03 王五 40
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tag = "01#张三#2002#李四#3003#王五#4004#小白#50";
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
