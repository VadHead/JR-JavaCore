package level12;

import java.util.ArrayList;

public class task1209 {
	public static ArrayList<String> waitingEmployees = new ArrayList<>();
	public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
	
	public static void initEmployees() {
		waitingEmployees.add("Гвинно");
		waitingEmployees.add("Гунигерд");
		waitingEmployees.add("Боргелейф");
		waitingEmployees.add("Нифрод");
		waitingEmployees.add("Альбиуф");
		waitingEmployees.add("Иногрим");
		waitingEmployees.add("Фриле");
		System.out.println(waitingEmployees.toString());
		System.out.println(alreadyGotSalaryEmployees.toString());
	}
	
	public static void main(String[] args) {
		initEmployees();
	}
	
	public static void paySalary(String name) {
		if (!alreadyGotSalaryEmployees.contains(name) && waitingEmployees.contains(name)) {
			alreadyGotSalaryEmployees.add(name);
			waitingEmployees.set(waitingEmployees.indexOf(name), null);
		}
	}
	
}
