package utils;

import java.util.Scanner;

public class InputUtils {
	static Scanner sc = new Scanner(System.in);

	public static String inputString(String tip) {
		System.out.println(tip);
		return sc.next();
	}

	/**
	 * Ҫ������intֵ��
	 * 
	 * @param tip
	 * @param nums
	 *            ����ֻ������ ��Щintֵ
	 * @return
	 */
	public static int inputInt(String tip, int... nums) {
		while (true) {
			System.out.println(tip);
			boolean hasNextInt = sc.hasNextInt();
			if (!hasNextInt) {
				System.out.println("����Ĳ���intֵ");
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
			System.out.println("�����������������룡");
		}
	}

}
