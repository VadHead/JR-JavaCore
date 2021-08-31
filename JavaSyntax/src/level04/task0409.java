package level04;

import java.util.Scanner;

public class task0409 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number, min = Integer.MAX_VALUE;
		while (console.hasNextInt()){
			number = console.nextInt();
			if (number < min) min = number;
		}
		System.out.println(min);
	}
}
