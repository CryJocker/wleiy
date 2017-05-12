package hw242;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class MyRun implements Runnable {
	static File file;
	int i ;
	
	public MyRun(int i) {
		super();
		this.i = i;
	}



	public void run() {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mathod.getPoint(raf, i, Hw242.n);

	}

}
