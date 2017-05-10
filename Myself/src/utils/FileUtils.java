package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

	/**
	 * ÎÄ¼þµÄ¿½±´
	 * 
	 * @param src
	 * @param dest
	 */
	public static void copy(File src, File dest) {

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));) {
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeText2File(File file, String content) {
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));) {
			bos.write(content.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = bis.read(b)) != -1) {
				sb.append(new String(b, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
