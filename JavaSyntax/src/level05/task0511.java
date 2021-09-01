package level05;

import java.util.Scanner;

public class task0511 {
	public static int[][] multiArray;
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		int[] columns = new int[rows];
		if (rows > 0) {
			multiArray = new int[rows][];
			for (int i = 0; i < rows; i++) {
				columns[i] = console.nextInt();
			}
		}
		
		for (int i = 0; i < multiArray.length; i++) {
			multiArray[i] = new int[columns[i]];
		}
	}
}
