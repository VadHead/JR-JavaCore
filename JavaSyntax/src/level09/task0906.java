package level09;

public class task0906 {
	public static void main(String[] args) {
		int decimalNumber = Integer.MAX_VALUE;
		System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
		String binaryNumber = "1111111111111111111111111111111";
		System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
	}
	
	public static String toBinary(int decimalNumber) {
		String binary = "";
		if (decimalNumber <= 0) {
			return binary;
		}
		while (decimalNumber != 0) {
			binary += decimalNumber % 2;
			decimalNumber /= 2;
		}
		return binary;
	}
	
	public static int toDecimal(String binaryNumber) {
		int decimal = 0;
		if (binaryNumber.isEmpty()) {
			return decimal;
		}
		for (int i = 0; i < binaryNumber.length(); i++) {
			int index = binaryNumber.length() - i - 1;
			int value = Character.getNumericValue(binaryNumber.charAt(index));
			decimal += value * Math.pow(2, i);
		}
		return decimal;
	}
}
