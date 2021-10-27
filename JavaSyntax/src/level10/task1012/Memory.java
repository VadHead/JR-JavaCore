package level10.task1012;

import java.util.Arrays;
import java.util.Objects;

public class Memory {
	public static void main(String[] args) {
		String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
		executeDefragmentation(memory);
		System.out.println(Arrays.toString(memory));
	
	}
	
	public static void executeDefragmentation(String[] array) {
		String[] stringArray = new String[array.length];
		int y = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				stringArray[y] = array[i];
				y++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stringArray[i];
		}
	}
}
