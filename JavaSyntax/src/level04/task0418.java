package level04;

import java.util.Scanner;

public class task0418 {
	
	public static void main(String[] args) {
		double glass = 0.5;
		Scanner console = new Scanner(System.in);
		boolean isOptimist = console.nextBoolean();
		if (isOptimist) {
			System.out.println((int) Math.ceil(glass));
		}
		else {
			System.out.println((int) Math.floor(glass));
		}
	}
}
