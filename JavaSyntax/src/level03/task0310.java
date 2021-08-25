package level03;

import java.util.Scanner;

public class task0310 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 5) System.out.println("число меньше 5");
		else if (number > 5) System.out.println("число больше 5");
		else System.out.println("число равно 5");
	}
}
