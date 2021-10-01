package level14;

public class task1416 {
	public static void main(String[] args) {
		try {
			dangerousMethod();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	static void dangerousMethod() throws Exception {
		throw new Exception("Mu-ha-ha!");
	}
}
