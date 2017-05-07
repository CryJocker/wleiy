package com.yztc.lin.homework;

public class Test2 {

	/**
	 * 初始化一个字符串“ABCDEFG”,然后分别在后面跟上自己的小写字母.
	 * 
	 * A(a)B(b)C(c)D(d)E(e)F(f)G(g)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tag = "ABCDEFG";

		StringBuilder sb = new StringBuilder(tag);

		for (int i = 0; i < tag.length(); i++) {
			char lower = (char) (tag.charAt(i) + 32);
			sb.insert(i * 4 + 1, "(" + lower + ")");
		}

		System.out.println(sb.toString());
	}

}
