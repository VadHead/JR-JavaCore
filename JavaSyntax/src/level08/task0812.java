package level08;

public class task0812 {
	private int x;
	private int y;
	
	public static void main(String[] args) {
		task0812 z = new task0812(56,2);
		z.swap();
		System.out.println(z.toString());
	}
	
	public task0812(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("x=%d, y=%d", x, y);
	}
	
	public void swap() {
		x ^=y;
		y ^=x;
		x ^= y;
	}
}
