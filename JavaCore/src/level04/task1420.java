package level04;

import java.util.Scanner;

public class task1420 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int min = Math.min(first, second);
		int divider = 0;
		for (int i = 1; i <= min; i++) {
			if (first % i == 0 && second % i == 0) {
				divider = i;
			}
		}
		System.out.println(divider);
		scanner.close();
	}
}
