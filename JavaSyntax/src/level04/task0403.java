package level04;

import java.util.Scanner;

public class task0403 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String number = console.nextLine();
		int i = 0;
		int sum = 0;
		while (!number.equals("ENTER")) {
			sum += Integer.parseInt(number);
			number = console.nextLine();
		}
		System.out.println(sum);
	}
	
}
