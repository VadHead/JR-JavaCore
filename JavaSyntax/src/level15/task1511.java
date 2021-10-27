package level15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task1511 {
	
	public static void main(String[] args) {
		char[] chars = args[0].toCharArray();
		try (Scanner scanner = new Scanner(System.in)) {
			BufferedWriter bfw = Files.newBufferedWriter(Path.of(scanner.nextLine()));
			bfw.write(chars);
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}
	}
	
}
