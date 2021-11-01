package level05;

public class task1505 {
	public interface HasWeight {
		int getWeight();
	}
	
	public interface HasHeight {
		int getHeight();
	}
	
	public static class Human implements HasWeight, HasHeight {
		@Override
		public int getWeight() {
			return 82;
		}
		
		@Override
		public int getHeight() {
			return 180;
		}
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		System.out.println(human.getWeight());
		System.out.println(human.getHeight());
	}
}
