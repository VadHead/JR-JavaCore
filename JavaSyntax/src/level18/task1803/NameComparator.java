package level18.task1803;

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
	
	public int compare(JavaRushMentor obj1, JavaRushMentor obj2) {
		return obj1.getName().length() - obj2.getName().length();
	}
	
}
