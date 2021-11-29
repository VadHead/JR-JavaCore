package level10;

import java.io.*;

public class task2011 {
	public static class Apartment implements Externalizable {
		
		private String address;
		private int year;
		
		/**
		 * Mandatory public no-arg constructor.
		 */
		public Apartment() {
			super();
		}
		
		public Apartment(String addr, int y) {
			address = addr;
			year = y;
		}
		
		@Override
		public void writeExternal(ObjectOutput out)
				throws IOException {
			out.writeObject(address);
			out.writeInt(year);
		}
		
		@Override
		public void readExternal(ObjectInput in)
				throws IOException, ClassNotFoundException {
			address = (String) in.readObject();
			year = in.readInt();
		}
		
		/**
		 * Prints out the fields used for testing!
		 */
		public String toString() {
			return ("Address: " + address + "\n" + "Year: " + year);
		}
	}
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		Apartment apt = new Apartment("Odessa", 117);
		FileOutputStream fos = new FileOutputStream("JavaCore/object.bin");
		ObjectOutputStream objOutStream = new ObjectOutputStream(fos);
		apt.writeExternal(objOutStream);
		
		objOutStream.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("JavaCore/object.bin");
		ObjectInputStream objInStream = new ObjectInputStream(fis);
		
		Apartment aptNew = new Apartment();
		aptNew.readExternal(objInStream);
		
		objInStream.close();
		fis.close();
		System.out.println(aptNew.address + " " + aptNew.year);
		
	}
	
}
