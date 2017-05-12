package hw24;

public class Run1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			synchronized (Hw241.o1) {

				System.out.println("Run1拿到了o1锁，需要在拿到o2锁...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Hw241.o2) {
					System.out.println("Run1拿到了o2锁");
				}

			}
		}

	}

}
