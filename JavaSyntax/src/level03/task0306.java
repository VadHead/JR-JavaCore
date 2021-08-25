package level03;

import java.util.Scanner;

public class task0306 {
	private static final String TRIANGLE_EXISTS = "треугольник существует";
	private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
	
	public static void main(String[] args) {
		int firstSide = new Scanner(System.in).nextInt();
		int secondSide = new Scanner(System.in).nextInt();
		int thirdSide = new Scanner(System.in).nextInt();
		if (firstSide < (secondSide + thirdSide) && secondSide < (firstSide + thirdSide) && thirdSide < (firstSide
				+ secondSide)) {
			System.out.println(TRIANGLE_EXISTS);
		}
		else System.out.println(TRIANGLE_NOT_EXISTS);
	}
}
