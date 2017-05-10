package hw214;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ErrOut {
	public static void putErr(String str) {
		File file = new File("D:/errMessage.txt");
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file, true));) {
			bfw.write(str + "\r\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获得当前的系统时间
	 * 
	 * @return
	 */
	public static String gettime() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String result = simpleDateFormat.format(date);
		return result;
	}

}
