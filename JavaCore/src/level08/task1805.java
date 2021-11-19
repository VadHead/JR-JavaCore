package level08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class task1805 {
	
	public static void main(String[] args)
			throws IOException {
		FileInputStream file = new FileInputStream(getFileName());
		HashSet<Integer> bytesSet = getUniqueBytesFromFile(file);
		file.close();
		ArrayList<Integer> result = new ArrayList<>(bytesSet);
		Collections.sort(result);
		result.forEach(s -> System.out.print(s + " "));
		file.close();
	}
	
	public static String getFileName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		return name;
	}
	
	public static HashSet<Integer> getUniqueBytesFromFile(FileInputStream fileInput)
			throws IOException {
		HashSet<Integer> bytesArrays = new HashSet<>();
		while (fileInput.available() > 0) {
			bytesArrays.add(fileInput.read());
		}
		fileInput.close();
		return bytesArrays;
	}
}
