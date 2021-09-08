package level08;

import java.util.Scanner;

public class task0803 {
	public static void main(String[] args) {
		int[] intArray = getArrayOfTenElements();
		System.out.println(min(intArray));
	}
	
	public static int min(int[] ints) {
		int min = ints[0];
		for (int anInt : ints) {
			min = Math.min(anInt, min);
		}
		return min;
	}
	
	public static int[] getArrayOfTenElements() {
		Scanner console = new Scanner(System.in);
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = console.nextInt();
		}
		return intArray;
	}
}
