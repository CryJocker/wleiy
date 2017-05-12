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
		byte[] byteArray = baos.toByteArray();// 得到内存流的数据
		System.out.println(baos.toString());
	}
	
	
	
	/**
	 * 读取一个文件的所有byte字节
	 * 
	 * @param file
	 * @return
	 */
	public byte[] getFileBytes(File file){
		
		return null;
	}
	
	
	
	
	
	
	
	
	
}
