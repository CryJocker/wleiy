package com.yztc.lin.homework;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test9 {

	/**
	 * ��дһ����ȡ�ַ����ĺ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ���������Ҫ��֤���ֲ����ذ����(��GBK���봦��)
	 * 
	 * ��"��ABC"��4 Ӧ�ý�Ϊ"��AB"
	 * 
	 * @����"��ABC��DEF"��6��Ӧ�����Ϊ"��ABC"������"��ABC+���İ��"��
	 * 
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "��A����DEF";

		fun(str, 6);

	}

	public static void fun(String str, int byteNum) throws UnsupportedEncodingException {
		byte[] bytes = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes));
		int k = 0;
		for (int i = 0; i < byteNum; i++) {
			if (bytes[i] < 0) {
				k++;
			}
		}
		if (k % 2 == 0) {
			System.out.println(new String(bytes, 0, byteNum));
		} else {
			System.out.println(new String(bytes, 0, byteNum - 1));
		}

	}

}
