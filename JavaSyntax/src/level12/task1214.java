package level12;

import java.util.ArrayList;
import java.util.Arrays;

public class task1214 {
	
	public static ArrayList<String> programmingLanguages = new ArrayList<>(
			Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));
	
	public static void main(String[] args) {
		programmingLanguages.remove(programmingLanguages.indexOf("Pascal"));
		System.out.println(programmingLanguages.toString());
	}
	
}
