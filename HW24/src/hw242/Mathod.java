package hw242;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Mathod {

	/**
	 * @ 得到当前游标的位置，通过游标位置判断读取文件的位置。 将游标定位到本次读取的起点
	 * @param raf
	 * @param n
	 */
	public static void getPoint(RandomAccessFile raf, int i, int n) {

		long length = 0L;
		try {
			length = raf.length();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			raf.seek(length * (i / n));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
/**
 *    开始读数据，循环读写
 * @param raf
 * @param l
 * @param n
 */
	public void readFrom(RandomAccessFile raf, long l, int n) {
		int sum = 0;
		byte[] b = new byte[2048];
		while (sum <= l / n) {
			if (sum < (l / n - 2048)) {
				try {
					raf.read(b, 0, b.length);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					raf.read(b, 0, (int)(l/n - sum));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			sum += b.length;
			
			//*******************************
			//**写的方法******************/
			//*******************************
			
			
			
		}
	}

}
