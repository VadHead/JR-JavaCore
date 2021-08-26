package level03;

import java.util.Scanner;

public class task0312 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String first = console.nextLine();
		String second = console.nextLine();
		if (first.equals(second))System.out.println("строки одинаковые");
		else System.out.println("строки разные");
	}
}
