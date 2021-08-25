package level03;

import java.util.Scanner;

public class task0307 {
	
	public static void main(String[] args) {
		int age = new Scanner(System.in).nextInt();
		boolean isOld = age > 60;
		if(age < 20 || isOld) System.out.println("можно не работать");
	}
}
