package level15;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class task1512 {
	
	public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	public static PrintStream stream = new PrintStream(outputStream);
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		printSomething(scanner.nextLine());
		String result = outputStream.toString();
		char[] chars = result.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			char temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		result = String.valueOf(chars);
		outputStream.reset();
		printSomething(result);
		System.out.println(outputStream);
	}
	
	public static void printSomething(String str) {
		stream.print(str);
	}
	
}
