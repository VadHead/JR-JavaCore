package level03;

import java.util.Scanner;

public class task0302 {
	
	public static void main(String[] args) {
		String militaryCommissar = ", явитесь в военкомат";
		System.out.print("Enter your Name:");
		Scanner consoleName = new Scanner(System.in);
		String name = consoleName.nextLine();
		System.out.print("Enter your Age:");
		Scanner consoleAge = new Scanner(System.in);
		int age = consoleAge.nextInt();
		if (age >= 18 && age <= 28) {
			System.out.println(name + militaryCommissar);
		}
	}
}
