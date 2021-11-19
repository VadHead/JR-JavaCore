package level08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class task1810 {
	
	public static void main(String[] args)
			throws DownloadException, IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try (FileInputStream fileInput = new FileInputStream(scanner.nextLine())) {
				while (fileInput.available() < 1000) {
					
					throw new DownloadException();
				}
				
			}
		}
	}
	
	public static class DownloadException extends Exception {
	
	}
}
