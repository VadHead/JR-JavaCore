package level04;

import java.util.Scanner;

public class task0416 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int colaQuantity = console.nextInt();
		int personalQuantity = console.nextInt();
		double colaResult = 1.0 * colaQuantity / personalQuantity;
		System.out.println(colaResult);
	}
}
