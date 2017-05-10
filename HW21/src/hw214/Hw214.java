package hw214;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw214 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个Int类型数据：");
		int i = 0;
		while (true) {
			try {
				i = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				String m = in.next();
				System.out.println("输入错误，请重新输入");
				String err = "Scanner输入类型错误，要求输入int，却输入了\"" + m + "\"";
				ErrOut.putErr(ErrOut.gettime() + err);

			}
		}
		System.out.println("输入正确，您输入的是" + i);

		System.out.println("请输入一个字符串,我将把他转换为Int类型：");
		String str = null;

		while (true) {
			try {
				str = in.next();
				int a = Integer.parseInt(str);
				System.out.println("转换之后得到的Int值为:" + a);
				break;
			} catch (NumberFormatException e) {
				String err = "字符串转换Int失败,不能把" + str + "转换为Int类型";
				ErrOut.putErr(ErrOut.gettime() + err);
				System.out.println(err);
				System.out.println("请重新输入：");
			}
		}

	}

}
