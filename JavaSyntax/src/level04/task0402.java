package level04;

import java.util.Scanner;

public class task0402 {
	
	public static void main(String[] args) {
		String text = " любит меня.";
		String name = new Scanner(System.in).nextLine();
		int i = 0;
		while (i < 10) {
			System.out.println(name + text);
			i++;
		}
	}
}
