package level02;

public class task1218 {
	public static void main(String[] args) {
	
	}
	
	public interface CanFly {
		public void fly();
	}
	
	public interface CanMove {
		public void move();
	}
	
	public interface CanEat {
		public void eat();
	}
	
	public class Dog implements CanMove, CanEat{
		
		@Override
		public void move() {
			System.out.println("Топ Топ!");
		}
		
		@Override
		public void eat() {
			System.out.println("Мням Мням");
		}
		
	}
	
	public class Duck implements CanFly, CanEat, CanMove{
		
		@Override
		public void fly() {
			System.out.println("Взлетаю");
		}
		
		@Override
		public void move() {
			System.out.println("топ топ");
		}
		
		@Override
		public void eat() {
			System.out.println("Yamyyy");
		}
		
	}
	
	public class Car implements CanMove{
		
		@Override
		public void move() {
			System.out.println("Дыр дыр");
		}
		
	}
	
	public class Airplane implements CanFly, CanMove{
		
		@Override
		public void fly() {
			System.out.println("Взлетаем!");
		}
		
		@Override
		public void move() {
			System.out.println("Выезжаем!");
		}
		
	}
}
