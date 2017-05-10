package test17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();		
		map.put(1, "第一个");      //向map中添加key-value对。
		map.put(2, "第二个");
		map.put(3, "第三个");
		Set<Integer> set = map.keySet();    //keySet()方法，得到map所有key的Set集。
		System.out.println("对应的key-value对为：");
		for (Integer integer : set) {        //foreach遍历。
			System.out.print(integer);
			System.out.println("\t"+map.get(integer));      //通过key得到对应key的value。
		}
		System.out.println();
		System.out.println("增加和覆盖之后：");
		map.put(1, "覆盖了第一个");     //向map中添加key-value对，因为key已经存在，故覆盖了对应key的value值。
		map.put(4, "增加的第四个");     ////向map中添加新的key-value对。
		for (Integer integer : set) {
			System.out.print(integer);
			System.out.println("\t"+map.get(integer));
		}
	}
}
