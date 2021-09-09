package level08;

public class task0813 {
	public static void main(String[] args) {
		System.out.println(getPowerOfTwo(4));
	}
	
	public static int getPowerOfTwo(int power) {
		return 2 << power - 1;
	}
}
