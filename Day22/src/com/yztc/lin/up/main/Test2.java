package com.yztc.lin.up.main;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

/**
 * ByteArrayInputStream
 * 
 * @author linhuaming
 *
 */
public class Test2 {

	public static void main(String[] args) {

		byte[] buf = "123456789wertyuiasdfghj".getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);

		int read = bais.read();
		read = bais.read();

		System.out.println(read);
	}

}
