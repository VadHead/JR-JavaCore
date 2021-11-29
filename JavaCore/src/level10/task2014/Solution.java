package level10.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution implements Serializable {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		Solution savedObject = new Solution(22);
		
		FileOutputStream fos = new FileOutputStream("JavaCore/object.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(savedObject);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("JavaCore/object.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Solution loadedObject = (Solution) object;
		ois.close();
		fis.close();
		
		System.out.println(loadedObject.string);
		System.out.println(new Solution(4));
	}
	
	private transient final String pattern = "dd MMMM yyyy, EEEE";
	private transient Date currentDate;
	private transient int temperature;
	String string;
	
	public Solution(int temperature) {
		this.currentDate = new Date();
		this.temperature = temperature;
		
		string = "Today is %s, and the current temperature is %s C";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		this.string = String.format(string, format.format(currentDate), temperature);
	}
	
	@Override
	public String toString() {
		return this.string;
	}
}
