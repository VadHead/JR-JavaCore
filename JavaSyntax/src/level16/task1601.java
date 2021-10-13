package level16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task1601 {
	static Date birthDate = new Date(90, 2, 13);
	
	public static void main(String[] args) {
		System.out.println(getDayOfWeek(birthDate));
	}
	
	static String getDayOfWeek(Date date) {
		String result = "";
		int dayNumber = date.getDay();
		switch (dayNumber) {
			case 0:
				return "понедельник";
			case 1:
				return "вторник";
			case 2:
				return "среда";
			case 3:
				return "четверг";
			case 4:
				return "пятница";
			case 5:
				return "суббота";
			case 6:
				return "воскресенье";
		}
		return result;
	}
	
}
