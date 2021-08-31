package level04;

import java.util.Scanner;

public class task0417 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int windSpeed = console.nextInt();
		double speed = windSpeed * 3.6;
		System.out.println(Math.round(speed));
	}
}
