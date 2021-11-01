package level04.task1421;

public class Singleton {
	
	private static final Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	private Singleton() {
	}
	
}
