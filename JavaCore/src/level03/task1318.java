package level03;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class task1318 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerFile = new Scanner(new File(scanner.nextLine()));
			while (scannerFile.hasNext()){
				System.out.println(scannerFile.nextLine());
			}
//		List<String> file = Files.readAllLines(Path.of(scanner.nextLine()));
//		file.forEach(System.out::println);
		scanner.close();
		scannerFile.close();
	}
}
