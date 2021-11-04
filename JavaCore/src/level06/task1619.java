package level06;

public class task1619 {
	
	private static boolean isCancel = false;
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new TestThread());
		t.start();
		Thread.sleep(3000);
		ourInterruptMethod();
	}
	
	public static void ourInterruptMethod() {
		isCancel = true;
	}
	
	public static class TestThread implements Runnable {
		public void run() {
			while (!isCancel) {
				try {
					System.out.println("he-he");
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
