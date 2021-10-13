package level16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class task1604 {
	static Calendar birthDate = new GregorianCalendar(1990, Calendar.MARCH, 13);
	
	public static void main(String[] args) {
		System.out.println(getDayOfWeek(birthDate));
	}
	
	static String getDayOfWeek(Calendar calendar) {
		String day = "";
		switch (calendar.get(Calendar.DAY_OF_WEEK)){
			case 1: return "воскресенье";
			case 2: return "понедельник";
			case 3: return "вторник";
			case 4: return "среда";
			case 5: return "четверг";
			case 6: return "пятница";
			case 7: return "суббота";
		}
		return day;
	}
}
