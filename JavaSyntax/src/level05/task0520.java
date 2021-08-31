package level05;

public class task0520 {
	
	public static int result = 105;
	
	public static void main(String[] args) {
		byte correction = Byte.MAX_VALUE;
		for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
			correction *= fahrenheit;
			System.out.println(correction);
		}
	}
}
