package level13;

import java.util.HashMap;

public class task1309 {
	
	public static HashMap<String,Double> grades = new HashMap<>();
	
	public static void main(String[] args) {
		addStudents();
		System.out.println(grades);
	}
	
	public static void addStudents() {
		for (int i = 0; i < 5; i++) {
			grades.put("Студент№ " + i + 1, (double) (i * 10 / (i + 1) * 3));
		}
	}
	
}
