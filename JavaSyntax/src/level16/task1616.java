package level16;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class task1616 {
	public static void main(String[] args) {
		TreeSet<String> sortedZones = getSortedZones();
		System.out.println(sortedZones.size());
		System.out.println(sortedZones.first());
		System.out.println(sortedZones.last());
		
		System.out.println(getBeijingDateTime());
	}
	
	static TreeSet<String> getSortedZones() {
		TreeSet<String> zonezSet = new TreeSet<>();
		zonezSet.addAll(ZoneId.getAvailableZoneIds());
		return zonezSet;
	}
	
	static ZonedDateTime getBeijingDateTime() {
		ZoneId zone = ZoneId.of("Asia/Shanghai");
		return ZonedDateTime.now(zone);
	}
}
