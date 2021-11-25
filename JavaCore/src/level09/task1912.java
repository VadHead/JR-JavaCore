package level09;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class task1912 {
	public static TestString testString = new TestString();
	
	public static void main(String[] args) {
		PrintStream defaultStream = System.out;
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		PrintStream stream = new PrintStream(outStream);
		System.setOut(stream);
		testString.printSomething();
		System.setOut(defaultStream);
		String result = outStream.toString().replaceAll("te", "??");
		System.out.println(result);
		
	}
	
	public static class TestString {
		public void printSomething() {
			System.out.println("it's a text for testing");
		}
	}
}
