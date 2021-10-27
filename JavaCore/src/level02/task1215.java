package level02;

public class task1215 {
	
	public class Solution {
		
		public static void main(String[] args) {
		
		}
		
		public static abstract class Pet {
			
			public abstract String getName();
			
			public abstract Pet getChild();
			
		}
		
		public static class Cat extends Pet {
			
			public String getName() {
				return "Tom";
			}
			
			@Override
			public Pet getChild() {
				return new Cat();
			}
			
		}
		
		public static class Dog extends Pet{
			
			@Override
			public String getName() {
				return "Butch";
			}
			
			@Override
			public Pet getChild() {
				return new Dog();
			}
			
		}
		
	}
	
}
