package level11;

public class task1122 {
	public static int salary;
	
	public static void add(int increase) {
		task1122.salary += increase;
	}
	public static void main(String[] args) {
		add(100500);
		System.out.println(salary);
	}
}
