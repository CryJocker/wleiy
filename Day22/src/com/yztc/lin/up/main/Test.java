package com.yztc.lin.up.main;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;

public class Test {

	public static void main(String[] args) {

		String content = "pqidfkasldkfoiu091209ulsksadfl8oiufasdlkhfalsdjflk";
		byte[] bytes = content.getBytes();
		
		

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// baos.write(bytes, 0, bytes.length);
		// baos.write(bytes);
		for (int i = 0; i < bytes.length; i++) {
			baos.write(bytes[i]);
		}
		byte[] byteArray = baos.toByteArray();// �õ��ڴ���������
		System.out.println(baos.toString());
	}
	
	
	
	/**
	 * ��ȡһ���ļ�������byte�ֽ�
	 * 
	 * @param file
	 * @return
	 */
	public byte[] getFileBytes(File file){
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
