package hw24;

public class Run2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (Hw241.o2) {

				System.out.println("Run2�õ���o2������Ҫ���õ�o1��...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Hw241.o1) {
					System.out.println("Run2�õ���o1��");
				}

			}
		}

	}

}
