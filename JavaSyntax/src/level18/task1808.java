package level18;

import java.util.ArrayList;
import java.util.Collections;

public class task1808 {
	public static void main(String[] args) {
		var strings = new ArrayList<String>();
		Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");
		
		print(strings);
	}
	
	public static void print(ArrayList<String> strings) {
		strings.forEach(System.out::println);
	}
}
