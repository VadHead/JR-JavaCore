package level10.task2007;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
	public static class JavaRush implements Serializable {
		public List<User> users = new ArrayList<>();
	}
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		JavaRush jr = new JavaRush();
		User newUser1 = new User("Vadim", "Alekseyev", new Date(1990,03,13), true, User.Country.UKRAINE);
		User newUser2 = new User("Tolya", "Polyak", new Date(1983,02,20), true, User.Country.OTHER);
		User newUser3 = new User("Yana", "Alekseyeva", new Date(1993,02,03), false, User.Country.UKRAINE);
		jr.users.add(newUser1);
		jr.users.add(newUser2);
		jr.users.add(newUser3);
		jr.users.forEach(System.out::println);
		
		FileOutputStream fos = new FileOutputStream("JavaCore/object.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(jr);
		
		FileInputStream fis = new FileInputStream("JavaCore/object.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		JavaRush extractJR = (JavaRush) object;
		System.out.println();
		extractJR.users.forEach(System.out::println);
		fis.close();
		ois.close();
		fos.close();
		oos.close();
		
	}
}
