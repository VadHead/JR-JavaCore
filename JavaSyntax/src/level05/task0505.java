package level05;

import java.util.Scanner;

public class task0505 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//System.out.print("Enter number: ");
		int n = console.nextInt();
		int[] myArray = new int[n];
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				//System.out.print("Enter myArray[" + i + "]: ");
				myArray[i] = console.nextInt();
			}
		}
		if (n % 2 != 0) {
			for (int i = 0; i < myArray.length; i++) {
				System.out.println(myArray[i]);
			}
		}
		else {
			for (int i = myArray.length - 1; i >= 0; i--) {
				System.out.println(myArray[i]);
			}
		}
	}
}
