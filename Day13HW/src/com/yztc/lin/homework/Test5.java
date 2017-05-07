package com.yztc.lin.homework;

public class Test5 {

	/**
	 * 用户输入一个字符串 String
	 * str=”123dsgfadsgjlafdjhladDWAdlfgjalDSFADSFDASnhsdaf!@$%@#45324rdsf”
	 * 统计字符串大写字母,小写字母,数字，其他字符的个数。
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
		
		System.out.println("字符串大写字母" + upperNum + ",小写字母" + lowerNum + ",数字" + numberNum + "，其他字符的个数"
				+ (str.length() - upperNum - lowerNum - numberNum) + "。");

	}

}
