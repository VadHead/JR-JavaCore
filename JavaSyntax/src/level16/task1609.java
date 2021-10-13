package level16;

import java.time.LocalDate;

public class task1609 {
	public static void main(String[] args) {
		LocalDate jubilee40Years = LocalDate.of(2010, 3, 13);
		
		LocalDate jubilee30Years = jubilee40Years.minusYears(10);
		
		System.out.println(Math.abs(jubilee30Years.getYear()));
	}
}
