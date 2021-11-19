package level08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class task1807 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		FileInputStream fileInput = new FileInputStream(scanner.nextLine());
		int count = 0;
		while (fileInput.available() > 0) {
			if (fileInput.read() == 44) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
		fileInput.close();
	}
}
