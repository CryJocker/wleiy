package hw214;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw214 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��Int�������ݣ�");
		int i = 0;
		while (true) {
			try {
				i = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				String m = in.next();
				System.out.println("�����������������");
				String err = "Scanner�������ʹ���Ҫ������int��ȴ������\"" + m + "\"";
				ErrOut.putErr(ErrOut.gettime() + err);

			}
		}
		System.out.println("������ȷ�����������" + i);

		System.out.println("������һ���ַ���,�ҽ�����ת��ΪInt���ͣ�");
		String str = null;

		while (true) {
			try {
				str = in.next();
				int a = Integer.parseInt(str);
				System.out.println("ת��֮��õ���IntֵΪ:" + a);
				break;
			} catch (NumberFormatException e) {
				String err = "�ַ���ת��Intʧ��,���ܰ�" + str + "ת��ΪInt����";
				ErrOut.putErr(ErrOut.gettime() + err);
				System.out.println(err);
				System.out.println("���������룺");
			}
		}

	}

}
