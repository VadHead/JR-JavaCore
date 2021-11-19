package level08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class task1802 {
	
	public static void main(String[] args) throws IOException {
		System.out.println(getMinimum(getFileName()));
	
	}
	
	public static String getFileName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		return name;
	}
	
	public static int getMinimum(String fileName) throws IOException {
		int min = Integer.MAX_VALUE;
		try {
			FileInputStream fileInput = new FileInputStream(fileName);
			while (fileInput.available() > 0) {
				int data = fileInput.read();
				if (data < min) {
					min = data;
				}
			}
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return min;
	}
	
}
