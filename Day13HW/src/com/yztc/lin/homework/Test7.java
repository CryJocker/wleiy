package com.yztc.lin.homework;

public class Test7 {

	/**
	 * дһ���������ж�һ���ַ����Ƿ�Գơ����磺 abcba����һ���Գ��ַ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tag = "1234567890987654331";
		System.out.println(duiCheng(tag));
	}

	public static boolean duiCheng(String str) {
		if (str == null) {
			return false;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			char fore = str.charAt(i);
			char back = str.charAt(str.length() - 1 - i);
			if (fore != back) {
				return false;
			}
		}
		return true;
	}

}
