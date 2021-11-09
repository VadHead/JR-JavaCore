package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1629 {
	public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws InterruptedException {
		Read3Strings t1 = new Read3Strings();
		Read3Strings t2 = new Read3Strings();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		t1.printResult();
		t2.printResult();
	}
	
	public static class Read3Strings extends Thread {
		
		StringBuilder sb = new StringBuilder();
		
		@Override
		public void run() {
			try {
				for (int i = 0; i < 3; i++) {
					this.sb.append(reader.readLine()).append(" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void printResult() {
			System.out.println(sb.toString());
		}
		
	}
}
