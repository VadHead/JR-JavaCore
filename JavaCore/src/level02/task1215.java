package level02;

public class task1215 {
	
	public static class Solution {
		
		public static void main(String[] args) {
		
		}
		
		public abstract class Pet {
			
			public abstract String getName();
			
			public abstract Pet getChild();
			
		}
		
		public class Cat extends Pet {
			
			public String getName() {
				return "Tom";
			}
			
			@Override
			public Pet getChild() {
				return new Cat();
			}
			
		}
		
		public class Dog extends Pet{
			
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
