package level04;

import java.util.Scanner;

public class task0414 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String word = console.nextLine();
		int quantity = console.nextInt();
		int i = 0;
		do {
			System.out.println(word);
			if (quantity <= 0 || quantity >= 5) {
				break;
			}
			i++;
		} while (i < quantity);
	}
}
