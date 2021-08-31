package level04;

import java.util.Scanner;

public class task0408 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number, max = Integer.MIN_VALUE;
		while (console.hasNextInt()){
			number = console.nextInt();
			if ( number % 2 == 0 && number > max) max = number;
		}
		System.out.println(max);
	}
}
