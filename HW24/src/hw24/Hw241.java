package hw24;

public class Hw241 {
	static Object o1 = new Object();
	static Object o2 = new Object();

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Run1());
		Thread thread2 = new Thread(new Run2());
		thread.start();
		thread2.start();
		
	}

}
