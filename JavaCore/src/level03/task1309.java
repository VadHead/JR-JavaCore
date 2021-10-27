package level03;

public class task1309 {
	
	public static void main(String[] args) {
	
	}
	
	interface CanMove{
		Double speed();
	}
	
	interface CanFly extends CanMove{
		Double speed(CanFly i);
	}
}
