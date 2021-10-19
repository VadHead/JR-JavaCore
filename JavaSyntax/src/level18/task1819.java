package level18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class task1819 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		Collections.addAll(strings, "first", "second", null, "fourth", "fifth");
		
		printList(strings);
	}
	
	public static void printList(List<String> list) {
		String text = "Этот элемент равен null";
		list.forEach(l -> System.out.println(Optional.ofNullable(l).orElse(text)));
	}
}
