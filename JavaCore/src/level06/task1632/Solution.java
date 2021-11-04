package level06.task1632;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static List<Thread> threads = new ArrayList<>(5);
	
	public static void main(String[] args) {
	}
	
	static {
		threads.add(new ThreadOne());
		threads.add(new ThreadTwo());
		threads.add(new ThreadThree());
		threads.add(new ThreadFour());
		threads.add(new ThreadFive());
	}
	
	public static class ThreadOne extends Thread {
		
		@Override
		public void run() {
			while (true) {
			}
		}
		
	}
	
	public static class ThreadTwo extends Thread {
		
		@Override
		public void run() {
			try {
				throw new InterruptedException();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
	public static class ThreadThree extends Thread {
		
		@Override
		public void run() {
			while (true) {
				System.out.println("Ура");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static class ThreadFour extends Thread implements Message {
		
		@Override
		public void showWarning() {
			if (this.isAlive()) {
				this.interrupt();
			}
		}
		
		@Override
		public void run() {
			while (!isInterrupted()) ;
		}
		
	}
	
	public static class ThreadFive extends Thread {
		
		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);
			int sum = 0;
			while (true) {
				String str = scanner.nextLine();
				if (str.equals("N")) {
					break;
				}
				sum += Integer.parseInt(str);
			}
			System.out.println(sum);
		}
		
	}
}
