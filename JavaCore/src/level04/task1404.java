package level04;

import java.util.Scanner;

public class task1404 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		while (!name.equals("")) {
			Cat cat = CatFactory.getCatByKey(name);
			System.out.println(cat.toString());
			name = scanner.nextLine();
		}
		scanner.close();
		
	}
	
	static class CatFactory {
		static Cat getCatByKey(String key) {
			Cat cat;
			switch (key) {
				case "vaska":
					cat = new MaleCat("Василий");
					break;
				case "murka":
					cat = new FemaleCat("Мурочка");
					break;
				case "kiska":
					cat = new FemaleCat("Кисюлька");
					break;
				default:
					cat = new Cat(key);
					break;
			}
			return cat;
		}
	}
	
	static class Cat {
		private String name;
		
		protected Cat(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public String toString() {
			return "Я уличный кот " + getName();
		}
	}
	
	static class MaleCat extends Cat {
		MaleCat(String name) {
			super(name);
		}
		
		public String toString() {
			return "Я - солидный кошак по имени " + getName();
		}
	}
	
	static class FemaleCat extends Cat {
		FemaleCat(String name) {
			super(name);
		}
		
		public String toString() {
			return "Я - милая кошечка по имени " + getName();
		}
	}
}
