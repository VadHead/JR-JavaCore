package level10;

public class task2023 {
	public static void main(String[] s) {
		A a = new C();
		a.method2();
	}
	
	public static class A {
		private void method1() {
			System.out.println("A class, method1");
		}
		
		public void method2() {
			System.out.println("A class, method2");
			method1();
		}
	}
	
	public static class B extends A {
		public void method1() {
			super.method2();
			System.out.println("B class, method1");
		}
		
		public void method2() {
			System.out.println("B class, method2");
		}
	}
	
	public static class C extends B {
		public void method1() {
			System.out.println("C class, method1");
		}
		
		public void method2() {
			System.out.println("C class, method2");
			super.method2();     //+
		}
	}
}
