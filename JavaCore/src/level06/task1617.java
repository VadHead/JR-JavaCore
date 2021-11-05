package level06;


public class task1617 {
	public static volatile int numSeconds = 3;
	
	public static void main(String[] args) throws InterruptedException {
		RacingClock clock = new RacingClock();
		Thread.sleep(3500);
		clock.interrupt();
	}
	
	public static class RacingClock extends Thread {
		public RacingClock() {
			start();
		}
		
		public void run() {
			try {
				while (!Thread.currentThread().isInterrupted()) {
					System.out.print(numSeconds + " ");
					numSeconds--;
					Thread.sleep(1000);
					if (numSeconds < 0) {
						Thread.currentThread().interrupt();
					}
					else if (numSeconds == 0) {
						System.out.print("Марш!");
						stop();
					}
				}
			} catch (InterruptedException e) {
				System.out.print("Прервано!");
			}
			
		}
		
	}
	
}
