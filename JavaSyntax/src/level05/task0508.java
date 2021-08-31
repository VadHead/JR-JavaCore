package level05;

import java.util.Scanner;

public class task0508 {
	public static String[] strings;
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		strings = new String[6];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = console.nextLine();
		}
		for (int i = 0; i < strings.length; i++) {
			String word = strings[i];
			for (int j = i; j < strings.length; j++) {
				if (strings[j] != null) {
					if (strings[j].equals(word) && i != j) {
						strings[j] = null;
						strings[i] = null;
					}
				}
			}
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + ", ");
		}
	}
}
