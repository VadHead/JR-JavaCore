package level06;

public class task0609 {
	
	public static void main(String[] args) {
		System.out.println(ninthDegree(2));
	
	}
	
	public static long cube(long number) {
		return (long) Math.pow(number, 3);
	}
	
	public static long ninthDegree(long n) {
		return cube(cube(n));
	}
}
