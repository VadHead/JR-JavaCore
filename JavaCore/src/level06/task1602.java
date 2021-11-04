package level06;

public class task1602 {
	public static void main(String[] args) {
		TestThread task = new TestThread();
		new Thread(task).start();
	}
	
	public static class TestThread extends Thread {
		
		static {
			System.out.println("it's a static block inside TestThread");
		}
		
		@Override
		public void run() {
			System.out.println("it's a run method");
		}
		
	}
	
}
