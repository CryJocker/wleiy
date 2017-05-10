package test502;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("wleiy1");
		hashSet.add("wleiy2");
		hashSet.add("wleiy3");
		hashSet.add("wleiy4");
		hashSet.add("wleiy5");
		hashSet.add("wleiy6");
		
		Iterator<String> iterator = hashSet.iterator();
		Iterator<String> iterator1 = hashSet.iterator();
		System.out.println(iterator.next());
		
		while(iterator1.hasNext()){
			if("wleiy5".equals(iterator1.next()))
				iterator1.remove();
			else
				System.out.print(iterator1.next()+" ");
			
		}
		
		
		
	}

}
