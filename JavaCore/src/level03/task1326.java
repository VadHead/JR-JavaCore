package level03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class task1326 {
	
	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Scanner fileScanner = new Scanner(new FileInputStream(scanner.nextLine()));
		ArrayList<Integer> intList = new ArrayList<>();
		while (fileScanner.hasNextInt()) {
			int number = fileScanner.nextInt();
			if (number % 2 == 0) {
				intList.add(number);
			}
		}
		intList.sort(Comparator.naturalOrder());
		intList.forEach(System.out::println);
		fileScanner.close();
		scanner.close();
	}
	
}
