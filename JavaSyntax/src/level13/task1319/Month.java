package level13.task1319;

import javax.management.StandardEmitterMBean;

public enum Month {
	JANUARY,
	FEBRUARY,
	MARCH,
	APRIL,
	MAY,
	JUNE,
	JULY,
	AUGUST,
	SEPTEMBER,
	OCTOBER,
	NOVEMBER,
	DECEMBER;
	
	public static Month[] getWinterMonths() {
		Month[] winterMonths = new Month[] {JANUARY, FEBRUARY, DECEMBER};
		return winterMonths;
	}
	
	public static Month[] getSpringMonths() {
		Month[] springMonths = new Month[] {MARCH, APRIL, MAY};
		return springMonths;
	}
	
	public static Month[] getSummerMonths() {
		Month[] summerMonths = new Month[] {JUNE, JULY, AUGUST};
		return summerMonths;
	}
	
	public static Month[] getAutumnMonths() {
		Month[] autumnMonth = new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
		return autumnMonth;
	}
	
}
