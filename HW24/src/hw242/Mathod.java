package hw242;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Mathod {

	/**
	 * @ �õ���ǰ�α��λ�ã�ͨ���α�λ���ж϶�ȡ�ļ���λ�á� ���α궨λ�����ζ�ȡ�����
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
 *    ��ʼ�����ݣ�ѭ����д
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
			//**д�ķ���******************/
			//*******************************
			
			
			
		}
	}

}
