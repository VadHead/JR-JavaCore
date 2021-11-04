package level06;

public class task1618 {
	public static void main(String[] args) throws InterruptedException {
		TestThread thread = new TestThread();
		thread.start();
		thread.interrupt();
	}
	
	public static class TestThread extends Thread {
		
		@Override
		public void run() {
			super.run();
		}
		
	}
}
