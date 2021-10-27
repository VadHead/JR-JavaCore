package level18;

import java.util.ArrayList;
import java.util.Collections;

public class task1807 {
	public static void main(String[] args) {
		var strings = new ArrayList<String>();
		Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");
		
		print(strings);
	}
	
	public static void print(ArrayList<String> strings) {
		//strings.forEach(string -> System.out.println(string));
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}
}
