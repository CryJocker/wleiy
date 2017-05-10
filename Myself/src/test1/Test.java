package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File file = new File("D:/1.txt");
		File file2 = new File("D:/2.txt");
		try (FileWriter out = new FileWriter(file2);
				FileReader in = new FileReader(file);) {
			char[] m = new char[20];
			
			while(true){
				int read = in.read(m);
				if(read==-1){
					break;
				}
				String string = new String(m).toUpperCase();
				m = string.toCharArray();
				out.write(m,0,read);
				System.out.println(new String(m));
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
//	public String readin(File file){
//		try(FileReader in = new FileReader(file);) {
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
	
	
	
	
	
	
}
