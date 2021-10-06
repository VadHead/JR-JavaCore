package level15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class task1520 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Path sourceDirectory = Path.of(scanner.nextLine());
		Path targetDirectory = Path.of(scanner.nextLine());
		try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
			for (Path path : files) {
				if (Files.isRegularFile(path)) {
					System.out.println(path);
					System.out.println(targetDirectory);
					Files.move(path, targetDirectory.resolve(path.getFileName()));
				}
			}
		}
	}
}