package test;

import java.io.File;

import utils.FileUtils;

public class Test {

	/**
	 * 在D盘指定一个文件夹（要求文件下面有子文件夹和文件(图片,文档等)，
	 * 子文件夹里面也放一些文件夹和文件，以此类推，可以多放几层）。然后，复制该文件夹下所有文件和文件夹到
	 * E盘指定目录下 。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		File src = new File("D:/D1/D.txt");
		File dest = new File("E:/D1");
		fun(src, dest);
		System.out.println("拷贝完毕！");
	}
	
	
	public static void fun(File src,File dest){
		if (src.isFile()) {
			//cotpy
			FileUtils.copy(src, dest);
			return;
		}
		dest.mkdirs();
		File[] listFiles = src.listFiles();
		for (File file : listFiles) {
			//file = D/java1202共享目录/100%激活win10.txt;
			//dest = E/java1202共享目录
			//toFIle= dest +  file.getName;
			File toFile = new File(dest, file.getName());
			fun(file, toFile);
		}
	}
	
	
	

}
