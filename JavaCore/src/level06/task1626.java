package level06;

public class task1626 {
	public static int number = 5;
	
	public static void main(String[] args) {
		new Thread(new CountdownRunnable(), "Уменьшаем").start();
		new Thread(new CountUpRunnable(), "Увеличиваем").start();
	}
	
	public static class CountUpRunnable implements Runnable {
		
		private int countIndexUp;
		
		public void run() {
			try {
				while (true) {
					countIndexUp++;
					System.out.println(toString());
					Thread.sleep(500);
					if (countIndexUp == task1626.number) {
						return;
					}
				}
			} catch (InterruptedException e) {
			}
		}
		
		public String toString() {
			return Thread.currentThread().getName() + ": " + countIndexUp;
		}
	}
	
	public static class CountdownRunnable implements Runnable {
		private int countIndexDown = task1626.number;
		
		public void run() {
			try {
				while (true) {
					System.out.println(toString());
					countIndexDown -= 1;
					if (countIndexDown == 0) return;
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
			}
		}
		
		public String toString() {
			return Thread.currentThread().getName() + ": " + countIndexDown;
		}
	}
}
