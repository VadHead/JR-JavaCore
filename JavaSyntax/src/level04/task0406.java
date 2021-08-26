package level04;

import java.util.Scanner;

public class task0406 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String word;
		while (true){
			word = console.nextLine();
			if (word.equals("enough")) break;
			System.out.println(word);
		}
	}
}
