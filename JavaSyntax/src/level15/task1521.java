package level15;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Scanner;

public class task1521 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		URL url = new URL(line);
		InputStream input = url.openStream();
		byte[] buffer = input.readAllBytes();
		Files.write(Files.createTempFile(null, null), buffer);
	}
}
