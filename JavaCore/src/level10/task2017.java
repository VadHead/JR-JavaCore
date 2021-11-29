package level10;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class task2017 {
	public A getOriginalObject(ObjectInputStream objectStream) {
		try {
			return (task2017.A) objectStream.readObject();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public class A implements Serializable {
	}
	
	public class B extends A {
		public B() {
			System.out.println("inside B");
		}
	}
	
	public static void main(String[] args) {
	
	}
}
