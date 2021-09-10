package level09;

import java.util.Locale;

public class task0908 {
	public static void main(String[] args) {
		String binaryNumber = "100111010000";
		System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
		String hexNumber = "9d0";
		System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
	}
	
	public static String toHex(String binaryNumber) {
		String hex = "";
		if (binaryNumber == null || binaryNumber.isEmpty() || Integer.parseInt(binaryNumber) != 0 || Integer.parseInt(binaryNumber) != 1) return hex;
		return hex;
	}
	
	public static String toBinary(String hexNumber) {
		String binary = "";
//		for (int i = 0; i < hexNumber.length() ; i++) {
//			char symbol = hexNumber.charAt();
//			if (symbol < 0  )
//		}
		return binary;
	}
}
