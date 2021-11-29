package level10.task2022;

import java.io.*;

public class Solution implements Serializable, AutoCloseable {
	private transient FileOutputStream stream;
	private String fileName;
	
	public Solution(String fileName) throws FileNotFoundException {
		this.stream = new FileOutputStream(fileName);
		this.fileName = fileName;
	}
	
	public void writeObject(String string) throws IOException {
		stream.write(string.getBytes());
		stream.write("\n".getBytes());
		stream.flush();
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		this.stream = new FileOutputStream(fileName, true);
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing everything!");
		stream.close();
	}
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		
		FileOutputStream fileOutput = new FileOutputStream("JavaCore/object.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fileOutput);
			Solution solution = new Solution("JavaCore/object_1.bin");
			solution.writeObject("Test text");
			oos.writeObject(solution);
		
		FileInputStream fiStream = new FileInputStream("JavaCore/object.bin");
		ObjectInputStream objectStream = new ObjectInputStream(fiStream);
		
		Solution loadedObject = (Solution) objectStream.readObject();
		loadedObject.writeObject("Test text 2");
	}
}
