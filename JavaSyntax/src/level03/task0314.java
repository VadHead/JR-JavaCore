package level03;

import java.util.Scanner;

public class task0314 {
	public static String secret = "AmIGo";
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String password = console.nextLine();
		String access = password.equalsIgnoreCase(secret)?"доступ разрешен":"доступ запрещен";
		System.out.println(access);
	}
}
