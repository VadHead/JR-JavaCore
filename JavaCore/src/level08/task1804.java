package level08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task1804 {
	
	public static void main(String[] args)
			throws IOException {
		
		FileInputStream fileInput = new FileInputStream(getFileName());
		int[] byteCount = new int[256];
		while (fileInput.available() > 0) {
			byteCount[fileInput.read()] += 1;
		}
		fileInput.close();
		
		int minCount = Integer.MAX_VALUE;
		for (int count : byteCount) {
			if (count < minCount && count > 0) {
				minCount = count;
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < byteCount.length; i++) {
			if (byteCount[i] == minCount) {
				result.add(i);
			}
		}
		result.forEach(s -> System.out.print(s + " "));
		
	}
	
	public static String getFileName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		return name;
	}
	
}
