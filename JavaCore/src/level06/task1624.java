package level06;

public class task1624 {
	public static MyThread t = new MyThread();
	static String message = "inside main ";
	
	public static void main(String a[]) throws Exception {
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println(message + i);
			sleep();
		}
	}
	
	public static void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
	}
	
	static class MyThread extends Thread {
		String message = "inside MyThread ";
		
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(message + i);
				task1624.sleep();
			}
		}
	}
}
