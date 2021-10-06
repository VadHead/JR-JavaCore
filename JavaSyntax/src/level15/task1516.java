package level15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task1516 {
	
	private static final String THIS_IS_FILE = " - это файл";
	private static final String THIS_IS_DIR = " - это директория";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Path path = Path.of(scanner.nextLine());
		while (isDirOrFile(path)) {
			if (isRegularFile(path)) {
				System.out.println(path + THIS_IS_FILE);
			}
			else if (isDirectory(path)) {
				System.out.println(path + THIS_IS_DIR);
			}
			path = Path.of(scanner.nextLine());
		}
		
	}
	
	public static boolean isRegularFile(Path p) {
		return Files.isRegularFile(p);
	}
	
	public static boolean isDirectory(Path p) {
		return Files.isDirectory(p);
	}
	
	public static boolean isDirOrFile(Path p) {
		return Files.isDirectory(p) || Files.isRegularFile(p);
	}
	
}
