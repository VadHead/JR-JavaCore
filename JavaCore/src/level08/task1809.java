package level08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task1809 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		try (FileInputStream fileInput = new FileInputStream(scanner.nextLine());
		     FileOutputStream fileOutput = new FileOutputStream(scanner.nextLine())) {
			ArrayList<Integer> bytes = new ArrayList<>();
			while (fileInput.available() > 0) {
				bytes.add(fileInput.read());
			}
			Collections.reverse(bytes);
			for (int b : bytes) {
				fileOutput.write(b);
			}
		}
		
	}
}
