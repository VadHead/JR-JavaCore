package level15;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class task1514 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		Path path1 = Path.of(str1);
		Path path2 = Path.of(str2);
		
		try {
			System.out.println(path2.relativize(path1));
		} catch (Exception e) {
			try {
				System.out.println(path1.relativize(path2));
			} catch (Exception ignore) {
			
			}
		}
		
	}
	
}
