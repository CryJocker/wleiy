package com.yztc.lin.homework;

public class Test2 {

	/**
	 * ��ʼ��һ���ַ�����ABCDEFG��,Ȼ��ֱ��ں�������Լ���Сд��ĸ.
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
