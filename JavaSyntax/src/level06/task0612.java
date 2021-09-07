package level06;

public class task0612 {
	public static void main(String[] args) {
		int[] array = {15,64,9,51,42};
		printSqrt(array);
	}
	
	public static void printSqrt(int[] array) {
		String elementSqrtString = "Корень квадратный для числа ";
		for (int i = 0; i < array.length; i++) {
			int element = array[i];
			double elementSqrt = Math.sqrt(element);
			System.out.println(elementSqrtString + element + " равен " + elementSqrt);
		}
	}
}
