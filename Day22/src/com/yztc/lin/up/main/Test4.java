package com.yztc.lin.up.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test4 {

	public static void main(String[] args) {
		// Student student = new Student("����", 18, 9999);
		File file = new File("student.obj");
		// try {
		// //���� ���������
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream(file));
		// //д��һ�����л���Ķ���
		// oos.writeObject(student);
		// oos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		/*** ��ȡ������ ***/
		try {
			// ���� ����������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			//��ȡ����
			Object object = ois.readObject();
			System.out.println(object);
			if (object instanceof Student) {
				Student stu = (Student) object;
				double money = stu.getMoney();
				System.out.println(money);
			}
			ois.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
