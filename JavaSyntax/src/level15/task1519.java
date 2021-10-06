package level15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task1519 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		Path sourceDirectory = Path.of(scanner.nextLine());
		Path targetDirectory = Path.of(scanner.nextLine());
		try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
			for (Path path : files) {
				if (Files.isRegularFile(path)) {
					Files.copy(path, targetDirectory.resolve(path.getFileName()));
				}
			}
		}
	}
	
}
