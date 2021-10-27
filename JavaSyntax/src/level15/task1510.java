package level15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class task1510 {
	public static void main(String[] args) throws IOException {
		byte[] bytes = args[0].getBytes();
		try (Scanner scanner = new Scanner(System.in)) {
			Files.write(Paths.get(scanner.nextLine()), bytes);
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}
	}
}
