package com.yztc.lin.homework;

public class Test3 {

	/**
	 * �����ַ������飺
	 * 
	 * String strings[]= {"string","starting","strong","street",
	 * "stir","studeng","soft","sting"}
	 * 
	 * Ҫ�󣺷ֱ�ͳ����st��ͷ���ַ����ж��ٸ�����ng��β���ַ����ж��ٸ�
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
		System.out.println("st��ͷ���ַ�����" + stStartNum + "������ng��β���ַ�����" + ngEndNum + "��");

	}

}
