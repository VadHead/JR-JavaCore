package level09;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class task1914 {
	public static TestString testString = new TestString();
	
	public static void main(String[] args) {
		PrintStream defaultStream = System.out;
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		PrintStream stream = new PrintStream(outStream);
		System.setOut(stream);
		testString.printSomething();
		System.setOut(defaultStream);
		String[] result = outStream.toString().split(" ");
		int first = Integer.parseInt(result[0]);
		int second = Integer.parseInt(result[2]);
		String sign = result[1];
		int res = 0;
		if (sign.equals("+")) {
			res = first + second;
		}
		else if (sign.equals("-")) {
			res = first - second;
		}
		else if (sign.equals("*")) {
			res = first * second;
		}
		System.out.printf("%d %s %d = %d", first, sign, second, res);
	}
	
	public static class TestString {
		public void printSomething() {
			System.out.println("3 - 6 = ");
		}
	}
}
