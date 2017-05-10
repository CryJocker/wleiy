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
	 * ����һ���ļ��������е�Сд��ĸת��Ϊ��д��Ȼ������ַ����з���
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
 * ���ַ�����str��д��ָ���ļ���file����׷�ӡ�
 * @param str
 * @param file
 */
	public static void putTo(String str, File file) {
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file));) {

			bfw.write(str);
			System.out.println("д�����~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
