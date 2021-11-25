package level09;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class task1913 {
	public static TestString testString = new TestString();
	
	public static void main(String[] args) {
		PrintStream defaultStream = System.out;
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		PrintStream stream = new PrintStream(outStream);
		System.setOut(stream);
		testString.printSomething();
		System.setOut(defaultStream);
		String result = outStream.toString();
		for (char c : result.toCharArray()) {
			if (c >= '0' && c <= '9') {
				System.out.print(c);
			}
		}
		
	}
	
	public static class TestString {
		
		public void printSomething() {
			System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
		}
	}
}
