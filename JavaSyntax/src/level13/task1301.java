package level13;

import java.util.Collections;
import java.util.HashSet;

public class task1301 {
	public static void main(String[] args) {
		String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
		for (int i = 0; i < args.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("___________________________________");
		
		HashSet<String> hashSet = arrayToHashSet(array);
		for(String s : hashSet) {
			System.out.println(s);
		}
	}
	
	public static HashSet<String> arrayToHashSet(String[] strings) {
		HashSet<String> hashString = new HashSet<>();
		Collections.addAll(hashString, strings);
		return hashString;
	}
}
