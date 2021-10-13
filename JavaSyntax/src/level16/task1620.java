package level16;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class task1620 {
	static ZonedDateTime zonedDateTime = ZonedDateTime.now();
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
		System.out.println(dtf.format(zonedDateTime));
	}
}
