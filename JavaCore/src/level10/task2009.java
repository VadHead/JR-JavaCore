package level10;

import java.io.*;

public class task2009 {
	public static class ClassWithStatic implements Serializable {
		public static String staticString = "This is a static test string";
		public int i;
		public int j;
	}
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		ClassWithStatic cws = new ClassWithStatic();
		FileOutputStream fos = new FileOutputStream("JavaCore/object.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cws);
		
		FileInputStream fis = new FileInputStream("JavaCore/object.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		ClassWithStatic cwsNew = (ClassWithStatic) object;
		
	}
}
