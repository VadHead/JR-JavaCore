package level15;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class task1505 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
		     var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
		     var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
		) {
			byte[] buffer = new byte[1024];
			while (inputStream.available() > 0) {
				int read = inputStream.read();
				outputStream.write(buffer, 0, read);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong : " + e);
		}
	}
}
