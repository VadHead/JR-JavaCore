package level18;

import java.util.stream.Stream;

public class task1816 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");
		
		toUpperCase(stream).forEach(System.out::println);
	}
	
	public static Stream<String> toUpperCase(Stream<String> strings) {
		return strings.map(String::toUpperCase);
	}
}
