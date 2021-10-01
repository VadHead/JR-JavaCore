package level14.task1410;
import java.nio.file.FileSystemException;
import java.io.FileNotFoundException;

public class task1410 {
	public static void main(String[] args) {
		copyFile("book.txt", "book_final_copy.txt");
		copyFile("book_final_copy.txt", "book_last_copy.txt");
	}
	
	static void copyFile(String sourceFile, String destinationFile) {
		try {
			FileUtils.readFile(sourceFile);
			FileUtils.writeFile(destinationFile);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		//напишите тут ваш код
	}
}
