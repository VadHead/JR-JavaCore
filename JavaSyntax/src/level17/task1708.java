package level17;

public class task1708 {
	
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public static int min(int a, int b, int c, int d) {
		return Math.min(Math.min(a, b), Math.min(c, d));
	}
	
	public static int min(int a, int b, int c, int d, int e) {
		return Math.min((Math.min(Math.min(a, b), Math.min(c, d))), e);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
	
	public static int max(int a, int b, int c, int d) {
		return Math.max(Math.max(a, b), Math.max(c, d));
	}
	
	public static int max(int a, int b, int c, int d, int e) {
		return Math.max((Math.max(Math.max(a, b), Math.max(c, d))), e);
	}
	
}
