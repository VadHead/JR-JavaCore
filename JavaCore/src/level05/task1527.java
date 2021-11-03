package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class task1527 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String url = reader.readLine();
		url = url.substring(url.indexOf("?") + 1);
		List<String> params = Arrays.asList(url.split("&"));
		for (String s : params) {
			if (s.contains("=")) {
				System.out.print(" " + s.substring(0, s.indexOf("=")));
			}
			else {
				System.out.print(" " + s);
			}
			
		}
		System.out.println();
		for (String s : params) {
			if (s.contains("=")) {
				String name = s.substring(0, s.indexOf("="));
				if (name.equals("obj")) {
					String value = s.substring(s.indexOf("=") + 1);
					try {
						alert(Double.parseDouble(value));
					} catch (Exception e) {
						alert(value);
					}
				}
			}
		}
	}
	
	public static void alert(double value) {
		System.out.println("double: " + value);
	}
	
	public static void alert(String value) {
		System.out.println("String: " + value);
	}
	
}

