package level09;

public class task0916 {
	public static void main(String[] args) {
		System.out.println(format("Амиго", 5000));
	}
	
	public static String format(String name, int salary) {
//		String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
		return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
	}
}
