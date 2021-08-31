package level04;

import java.util.Scanner;

public class task0410 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int min1 = console.nextInt();
		int min2 = console.nextInt();
		if (min1 > min2) {
			int temp = min1;
			min1 = min2;
			min2 = temp;
		}
		while (console.hasNextInt()) {
			int number = console.nextInt();
			if (min1 == min2) {
				if (min1 > number) {
					min1 = number;
				}
				else {
					min2 = number;
				}
			}
			else if (min1 > number) {
				min2 = min1;
				min1 = number;
			}
			else if (min2 > number && min1 < number) {
				min2 = number;
			}
			
		}
		System.out.println(min2);
	}
}
