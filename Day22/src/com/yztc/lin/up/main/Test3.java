package com.yztc.lin.up.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * PrintWriter
 * 
 * PrintStream
 * @author linhuaming
 *
 */
public class Test3 {

	public static void main(String[] args) {
		
		File file = new File("print.txt");
		
		try {
//			new PrintWriter(new BufferedWriter(new FileWriter(file)));
			//基于 BufferedWriter 实现的。做了打印类型的封装
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)),true);
//			PrintStream ps = new PrintStream(file);
			
			pw.print(123);
			pw.print(99.99);
			pw.print(false);
			pw.print("writer");
				
			pw.println(123);
			pw.println(99.99);
			pw.println(false);
			pw.println("writer");
			
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
