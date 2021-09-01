package level02;

import java.util.Locale;
import java.util.Scanner;

public class task0214 {
	
	public static void main(String[] args) {
		Scanner consoleRead = new Scanner(System.in);
		String lineOne = consoleRead.nextLine();
		String lineTwo = consoleRead.nextLine();
		String lineThree = consoleRead.nextLine();
		
		System.out.println(lineThree);
		System.out.println(lineTwo.toUpperCase());
		System.out.println(lineOne.toLowerCase());
	}
}
