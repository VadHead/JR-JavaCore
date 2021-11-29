package level10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2006 {
	public static class Human implements Serializable {
		public String name;
		public List<String> assets = new ArrayList<>();
		
		public Human() {
		}
		
		public Human(String name, String... assets) {
			this.name = name;
			if (assets != null) {
				this.assets.addAll(Arrays.asList(assets));
			}
		}
	}
	
	public static void main(String[] args)
			throws IOException {
		Human human = new Human();
		FileOutputStream fos = new FileOutputStream("JavaCore/object.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(human);
		fos.close();
		oos.close();
		
		
	}
}
