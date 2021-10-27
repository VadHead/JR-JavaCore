package level03;

import java.io.*;
import java.util.Scanner;

public class task1319 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		String filePath = scanner.nextLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		String string = scanner.nextLine();
		do {
			bw.write(string);
			bw.newLine();
			if (string.equals("exit")) {
				break;
			}
			string = scanner.nextLine();
			
		} while (true);
		bw.close();
		scanner.close();
	}
	
}
