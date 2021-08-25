package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task0301 {
	
	public static void main(String[] args)
			throws IOException {
		String cold = "на улице холодно";
		String warm = "на улице тепло";
		Scanner console = new Scanner(System.in);
		int temperature = console.nextInt();
		if (temperature < 0) {
			System.out.println(cold);
		}
		else {
			System.out.println(warm);
		}
	}
	
}
