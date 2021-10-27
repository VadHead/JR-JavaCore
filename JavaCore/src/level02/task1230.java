package level02;

public class task1230 {
	public static void main(String[] args) {
		Integer i = 5;
		int x = transformValue(i);
		
		System.out.println(x);
	}
	
	public static int transformValue(int i) {
		return i * i;
	}
	
	public static int transformValue(Integer x){
		return x + x;
	}
}
