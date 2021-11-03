package level05;

public class task1518 {
	
	public static Cat cat;
	
	public static void main(String[] args) {
	
	}
	
	static {
		cat = new Cat();
		cat.name = "Tom";
		System.out.println(cat.name);
	}
	
	public static class Cat {
		
		public String name;
		
	}
	
}

