package level18.task1803;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();
	
	public static void main(String[] args) {
		Collections.addAll(mentors,
				new JavaRushMentor("Джон Бобров"),
				new JavaRushMentor("Риша"),
				new JavaRushMentor("Эллеонора Керри"),
				new JavaRushMentor("Ханс Нудлс"),
				new JavaRushMentor("Ким"),
				new JavaRushMentor("Хулио Сиеста"),
				new JavaRushMentor("Диего"),
				new JavaRushMentor("Лага Билаабо")
		);
		
		Comparator<JavaRushMentor> comparator = (JavaRushMentor obj1, JavaRushMentor obj2) ->
		{
			return obj1.getName().length() - obj2.getName().length();
		};
	
		
		Collections.sort(mentors, comparator);
//		Collections.sort(mentors, (obj1,obj2) -> obj1.getName().length() - obj2.getName().length());
		
		for (JavaRushMentor mentor : mentors) {
			System.out.println(mentor);
		}
	}
}
