package level05;

import java.io.IOException;
import java.util.Scanner;

public class task1519 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		while (!word.equals("exit")) {
			try {
				if (word.contains(".")) {
					print(Double.valueOf(word));
				}
				else {
					int i = Integer.parseInt(word);
					if (i < 128 && i > 0) {
						print((short) i);
					}
					else {
						print(i);
					}
				}
			} catch (Exception e) {
				print(word);
			}
			word = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	public static void print(Double value) {
		System.out.println("Это тип Double, значение " + value);
	}
	
	public static void print(String value) {
		System.out.println("Это тип String, значение " + value);
	}
	
	public static void print(short value) {
		System.out.println("Это тип short, значение " + value);
	}
	
	public static void print(Integer value) {
		System.out.println("Это тип Integer, значение " + value);
	}
}
