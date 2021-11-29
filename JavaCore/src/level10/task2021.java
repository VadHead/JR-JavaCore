package level10;

import java.io.*;

public class task2021 implements Serializable {
	public static class SubSolution extends task2021 {
		private void writeObject(ObjectOutputStream out) throws IOException {
			throw new NotSerializableException();
		}
		
		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
			throw new NotSerializableException();
		}
	}
	
	public static void main(String[] args) {
	
	}
}
