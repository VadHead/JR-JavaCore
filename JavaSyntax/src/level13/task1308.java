package level13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task1308 {
	
	public static Integer min(ArrayList<Integer> list) {
		return Collections.min(list);
	}
	
	public static Integer max(ArrayList<Integer> list) {
		return Collections.max(list);
	}
	
	public static int frequency(ArrayList<Integer> list, Integer element) {
		return Collections.frequency(list, element);
	}
	
	public static int binarySearch(ArrayList<Integer> list, Integer key) {
		Collections.sort(list);
		return Collections.binarySearch(list, key);
	}
}
