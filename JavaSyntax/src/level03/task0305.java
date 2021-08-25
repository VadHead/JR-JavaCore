package level03;

import java.util.Scanner;

public class task0305 {
	
	public static void main(String[] args) {
		Scanner consoleFirst = new Scanner(System.in);
		int first = consoleFirst.nextInt();
		Scanner consoleSecond = new Scanner(System.in);
		int second = consoleSecond.nextInt();
		Scanner consoleThird = new Scanner(System.in);
		int third = consoleThird.nextInt();
		
		if (first == second && second == third) System.out.println(first + " " + second + " " + third);
			else if (first == third) System.out.println(first + " " + third);
				else if (first == second) System.out.println(first + " " + second);
					else if (second == third)System.out.println(second + " " + third);
	}
}
