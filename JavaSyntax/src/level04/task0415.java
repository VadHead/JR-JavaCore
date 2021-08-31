package level04;

import java.util.Scanner;

public class task0415 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int radius = console.nextInt();
		double PI = 3.14;
		if (radius > 0) {
			double S = PI * radius * radius;
			System.out.println((int) S);
		}
	}
}
