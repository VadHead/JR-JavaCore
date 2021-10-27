package level15;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class task1506 {
	
	public static void main(String[] args)
			
			throws IOException {
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
			for (String str : list) {
				char[] chars = str.toCharArray();
				for (char c : chars) {
					if (c != '.' || c != ' ' || c != ',') {
						System.out.print(c);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
