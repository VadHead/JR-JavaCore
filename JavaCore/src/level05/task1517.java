package level05;

public class task1517 {
	public static int A = 0;
	
	static {
		if (true) new RuntimeException("");
	}
	
	public static int B = 5;
	
	public static void main(String[] args) {
		System.out.println(B);
	}
}
