package utils;

import java.util.Scanner;

public class InputUtils {
	static Scanner sc = new Scanner(System.in);

	public static String inputString(String tip) {
		System.out.println(tip);
		return sc.next();
	}

	/**
	 * 要求输入int值。
	 * 
	 * @param tip
	 * @param nums
	 *            限制只能输入 哪些int值
	 * @return
	 */
	public static int inputInt(String tip, int... nums) {
		while (true) {
			System.out.println(tip);
			boolean hasNextInt = sc.hasNextInt();
			if (!hasNextInt) {
				System.out.println("输入的不是int值");
				sc.next();
				continue;
			}
			int nextInt = sc.nextInt();
			if (nums.length == 0) {
				return nextInt;
			}
			for (int i : nums) {
				if (nextInt == i) {
					return nextInt;
				}
			}
			System.out.println("输入有误！请重新输入！");
		}
	}

}
