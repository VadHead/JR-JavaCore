package level05;

import java.util.HashMap;
import java.util.Map;

public class task1514 {
	public static Map<Double, String> labels = new HashMap<Double, String>();
	
	static {
		labels.put(2.0D, "First");
		labels.put(32.254, "Second");
		labels.put(2.034545D, "Third");
		labels.put(542.0D, "Fourth");
		labels.put(2.2340D, "Fives");
	}
	
	public static void main(String[] args) {
		System.out.println(labels);
	}
}
