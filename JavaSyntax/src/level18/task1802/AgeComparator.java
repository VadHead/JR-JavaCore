package level18.task1802;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
	
	public int compare(Student obj1, Student obj2) {
		return obj2.getAge() - obj1.getAge();
	}
	
}
