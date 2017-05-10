package test502;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

	public static void main(String[] args) {
		Collection<String> str = new ArrayList<String>();
		
		str.add("wleiy001");
		str.add("wleiy002");
		str.add("wleiy003");
		str.add("wleiy004");
		str.add("wleiy005");
		System.out.println("str.size():"+str.size());
	//	System.out.println(str);
		String[] array = str.toArray(new String[]{});
		for (String string : array) {
			System.out.print(string+ "  ");
		
		
		
//		
//		Object[] array = str.toArray();
//		for (Object object : array) {
//			System.out.println((String)object);
		}
	}

	

}
