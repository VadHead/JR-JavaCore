package level16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
		printCollection(dateMap.entrySet());
		
		Set<LocalDateTime> dateSet = convert(dateMap);
		printCollection(dateSet);
	}
	
	static Set<LocalDateTime> convert(Map<LocalDate,List<LocalTime>> sourceMap) {
		Set<LocalDateTime> dateSet = new HashSet<>();
		for (Map.Entry<LocalDate, List<LocalTime>> entry: sourceMap.entrySet()) {
			for (LocalTime time: entry.getValue()) {
				dateSet.add(LocalDateTime.of(entry.getKey(),time));
			}
		}
		return dateSet;
	}
	
	static void printCollection(Collection<?> collection) {
		System.out.println("-----------------------------------------------------");
		collection.forEach(System.out::println);
	}
}
