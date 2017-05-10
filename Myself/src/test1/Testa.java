package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public final class Testa {

	public static void main(String[] args) {
		File file = new File("D:/1.txt");
		File file2 = new File("D:/3.txt");
		try {
			FileInputStream fin = new FileInputStream(file);
			InputStreamReader wis = new InputStreamReader(fin);
			FileOutputStream fos = new FileOutputStream(file2);
			OutputStreamWriter wos = new OutputStreamWriter(fos);
			char[] cbuf = new char[1024];
			int read = wis.read(cbuf);
			
			wos.write(cbuf, 0, read);
			wis.close();
			wos.flush();
			wos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
