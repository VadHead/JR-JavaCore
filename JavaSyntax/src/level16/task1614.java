package level16;

import java.time.Instant;

public class task1614 {
	public static void main(String[] args) {
		System.out.println(getMaxFromMilliseconds());
		System.out.println(getMaxFromSeconds());
		System.out.println(getMaxFromSecondsAndNanos());
	}
	
	static Instant getMaxFromMilliseconds() {
		return Instant.ofEpochMilli(Long.MAX_VALUE);
	}
	
	static Instant getMaxFromSeconds() {
		return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
	}
	
	static Instant getMaxFromSecondsAndNanos() {
		return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
	}
}
