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
		StringBuilder sb = new StringBuilder(binaryNumber);
		if (sb.length() < 4){
			for (int i = sb.length(); i < 4; i++) {
				sb.append("0");
			}
			sb = sb.reverse();
		}
		return null;
	}
	
	public static String toBinary(String hexNumber) {
		
		return null;
	}
}
