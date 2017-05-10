package hw211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Streamtool {

	
	
	/**
	 * 读入一个文件，将其中的小写字母转换为大写，然后存入字符串中返回
	 * 
	 * @param file
	 * @return
	 */
	public static String getin(File file) {
		try (BufferedReader bfr = new BufferedReader(new FileReader(file));) {
			char[] ch = new char[20];
			String str = "";
			while (true) {
				int read = bfr.read(ch);
				if (read == -1) {
					break;
				}
				str += new String(ch).substring(0, read).toUpperCase();
			}
			return str;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
/**
 * 将字符串（str）写入指定文件（file）不追加。
 * @param str
 * @param file
 */
	public static void putTo(String str, File file) {
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file));) {

			bfw.write(str);
			System.out.println("写入完毕~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
