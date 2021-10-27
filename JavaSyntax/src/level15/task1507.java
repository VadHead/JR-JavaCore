package level15;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class task1507 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
			int i = 0;
			for (String str : list) {
				if (i % 2 == 0) {
					System.out.println(str);
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
