package test502;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		File file = new File("D:/logo.png");
		File file2 = new File("C://logo.png");
		long l = file.length();
		long m = 0;
		try (InputStream fin = new FileInputStream(file); 
				OutputStream fout = new FileOutputStream(file2);) {

			byte[] b = new byte[1024];
			while (true) {
				int read = fin.read(b);
				m += 1024;
				if (m >= l / 2) {
					break;
				}
			
				fout.write(b, 0, read);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
