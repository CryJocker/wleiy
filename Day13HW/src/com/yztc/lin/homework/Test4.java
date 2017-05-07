package com.yztc.lin.homework;

import java.util.Arrays;

public class Test4 {

	/**
	 * 已知字符串String s = "ljf55dfal12sdjflkas88djfa43a899";
	 * 要求：把字符串中的所有数字存入int型数组中。并对数组进行排序。(55算是一个数字)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tag = "ljf55dfal12sdjflkas88djfa43a899";
		String[] split = tag.split("[a-z]{1,}");
		System.out.println(Arrays.toString(split));
		if (split != null && split.length > 0) {
			int len = split.length;
			if ("".equals(split[0])) {
				int nums[] = new int[len - 1];
				for (int i = 1; i < split.length; i++) {

					int num = Integer.parseInt(split[i]);

					nums[i - 1] = num;
				}
				Arrays.sort(nums);
				System.out.println(Arrays.toString(nums));
			} else {

			}

		}

	}

}
