package level03;

import java.util.Scanner;

public class task0311 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double a = console.nextDouble();
		double b = console.nextDouble();
		if (Math.abs(a - b) < 0.000001) System.out.println("числа равны");
		else System.out.println("числа не равны");
	}
}
