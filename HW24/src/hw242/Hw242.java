package hw242;

public class Hw242 {
	static int n;
	

	public static void main(String[] args) {
		for (int i = 0; i < n-1; i++) {
			new Thread(new MyRun(i)).start();;
		}

	}

}
