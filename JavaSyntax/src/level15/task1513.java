package level15;

import java.nio.file.Path;
import java.util.Scanner;

public class task1513 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Path path = Path.of(str);
		System.out.println(path.getRoot());
	}
}
