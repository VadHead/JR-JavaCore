package level18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task1822 {
	public static void main(String[] args) {
		var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);
		
		getPositiveNumbers(numbers).forEach(System.out::println);
	}
	
	public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
		return numbers.filter(i -> i > 0).collect(Collectors.toList());
	}
}
