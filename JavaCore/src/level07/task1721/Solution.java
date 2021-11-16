package level07.task1721;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static List<String> allLines = new ArrayList<String>();
	public static List<String> forRemoveLines = new ArrayList<String>();
	
	public static void main(String[] args)
			throws CorruptedDataException {
		Scanner scanner = new Scanner(System.in);
		Path pathFirst = Paths.get(scanner.nextLine());
		Path pathSecond = Paths.get(scanner.nextLine());
		try {
			allLines.addAll(Files.readAllLines(pathFirst));
			forRemoveLines.addAll(Files.readAllLines(pathSecond));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(allLines);
		System.out.println(forRemoveLines);
		Solution solution = new Solution();
		
		solution.joinData();
		scanner.close();
		System.out.println(allLines);
		System.out.println(forRemoveLines);
		
	}
	
	public void joinData()
			throws CorruptedDataException {
		if (allLines.containsAll(forRemoveLines)) {
			allLines.removeAll(forRemoveLines);
		}
		else {
			allLines.clear();
			System.out.println(allLines);
			throw new CorruptedDataException();
		}
		
	}
	
}
