package level05;

import java.util.Arrays;

public class task0519 {
	public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	public static int element = 8;
	
	public static void main(String[] args) {
		int[] sorted = Arrays.copyOf(array, array.length);
		Arrays.sort(sorted);
		int index = Arrays.binarySearch(sorted, element);
		boolean result = index >= 0;
		System.out.println(result);
	}
}
