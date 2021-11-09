package level06;

public class task1623 {
	static int count = 15;
	static volatile int createdThreadCount;
	
	public static void main(String[] args) {
		System.out.println(new GenerateThread());
	}
	
	public static class GenerateThread extends Thread {
		
		public GenerateThread() {
			super(String.valueOf(++createdThreadCount));
			start();
		}
		
		@Override
		public String toString() {
			return getName() + " created";
		}
		
		@Override
		public void run() {
			while (createdThreadCount < count){
				System.out.println(new GenerateThread());
			}
		}
		
	}
}
