package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class task1531 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(reader.readLine());
		reader.close();
		
		System.out.println(factorial(input));
	}
	
	public static String factorial(int n) {
		BigDecimal factorial = new BigDecimal(1);
		if (n < 0) {
			return "0";
		}
		else if (n == 0) {
			return "1";
		}
		else {
			for (int i = 1; i <= n; i++) {
				factorial = factorial.multiply(new BigDecimal(i));
			}
		}
		return String.valueOf(factorial);
	}
	
}
