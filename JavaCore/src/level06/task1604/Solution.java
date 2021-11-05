package level06.task1604;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new SpecialThread());
		thread.start();
		
		System.out.println("*****************");
		
		for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
			System.out.println(element);
		}
	}
	
	public static class SpecialThread implements Runnable {
		
		@Override
		public void run() {
			Stream.of(Thread.currentThread().getStackTrace()).forEach(System.out::println);
		}
		
	}
}
