package level05;

import java.util.Scanner;

public class task0507 {
	
	public static int[] array;
	
	public static void main(String[] args) throws Exception {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = console.nextInt();
		}
		int maximum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		System.out.println(maximum);
	}
}
