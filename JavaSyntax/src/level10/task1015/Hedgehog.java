package level10.task1015;

public class Hedgehog {
	public void eat(Apple apple) {
		System.out.println("Яблоко было съедено!");
	}
	
	public static void main(String[] args) {
		new Hedgehog().eat(new Apple());
	}
	
	public static class Apple {
	}
}
