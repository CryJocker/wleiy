package test;

import java.io.File;

import utils.FileUtils;

public class Test {

	/**
	 * ��D��ָ��һ���ļ��У�Ҫ���ļ����������ļ��к��ļ�(ͼƬ,�ĵ���)��
	 * ���ļ�������Ҳ��һЩ�ļ��к��ļ����Դ����ƣ����Զ�ż��㣩��Ȼ�󣬸��Ƹ��ļ����������ļ����ļ��е�
	 * E��ָ��Ŀ¼�� ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		File src = new File("D:/D1/D.txt");
		File dest = new File("E:/D1");
		fun(src, dest);
		System.out.println("������ϣ�");
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
			//file = D/java1202����Ŀ¼/100%����win10.txt;
			//dest = E/java1202����Ŀ¼
			//toFIle= dest +  file.getName;
			File toFile = new File(dest, file.getName());
			fun(file, toFile);
		}
	}
	
	
	

}
