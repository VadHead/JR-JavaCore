package level05;

import java.net.Socket;
import java.util.Scanner;

public class task0506 {
	public static int[] array;
	
	public static void main(String[] args) throws Exception {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = console.nextInt();
		}
		int minimum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
			}
		}
		System.out.println(minimum);
	}
}
