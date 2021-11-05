package level05.task1529;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
	}
	
	static {
		reset();
	}
	
	public static CanFly result;
	
	public static void reset() {
		Scanner scanner = new Scanner(System.in);
		String aircraft = scanner.nextLine();
		if (aircraft.equals("helicopter")) result = new Helicopter();
		else if (aircraft.equals("plane")) {
			int passengersQuantity = scanner.nextInt();
			result = new Plane(passengersQuantity);
		}
		scanner.close();
	}
}
