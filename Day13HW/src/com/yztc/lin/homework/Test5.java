package com.yztc.lin.homework;

public class Test5 {

	/**
	 * �û�����һ���ַ��� String
	 * str=��123dsgfadsgjlafdjhladDWAdlfgjalDSFADSFDASnhsdaf!@$%@#45324rdsf��
	 * ͳ���ַ�����д��ĸ,Сд��ĸ,���֣������ַ��ĸ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "123dsgfadsgjlafdjhladDWAdlfgjalDSFADSFDASnhsdaf!@$%@#45324rdsf";
		int numberNum = 0;
		int lowerNum = 0;
		int upperNum = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
//			if (charAt >= 'a' && charAt <= 'z') {
//				lowerNum++;
//			} else if (charAt >= 'A' && charAt <= 'Z') {
//				upperNum++;
//			} else if (charAt >= '0' && charAt <= '9') {
//				numberNum++;
//			}
			
			String s = charAt+"";
			
			if (s.matches("[a-z]")) {
				lowerNum++;
			}else if (s.matches("[A-Z]")) {
				upperNum++;
			}else if (s.matches("[\\d]")) {
				numberNum++;
			}
			
		}
		
		System.out.println("�ַ�����д��ĸ" + upperNum + ",Сд��ĸ" + lowerNum + ",����" + numberNum + "�������ַ��ĸ���"
				+ (str.length() - upperNum - lowerNum - numberNum) + "��");

	}

}
