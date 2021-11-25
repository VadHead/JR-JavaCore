package level09;

import java.io.*;

public class task1915 {
	public static TestString testString = new TestString();
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream out = new FileOutputStream(reader.readLine());
		PrintStream defaultStream = System.out;
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		PrintStream stream = new PrintStream(outStream);
		System.setOut(stream);
		testString.printSomething();
		System.setOut(defaultStream);
		String result = outStream.toString();
		System.out.println(result);
		out.write(outStream.toByteArray());
		
		reader.close();
		out.close();
	}
	
	public static class TestString {
		public void printSomething() {
			System.out.println("it's a text for testing");
		}
	}
}
