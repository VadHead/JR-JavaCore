package level08.task1813;

import java.io.*;

public class AmigoOutputStream extends FileOutputStream {
	
	private FileOutputStream fos;
	public static String fileName = "C:\\Users\\vadim.alekseyev\\IdeaProjects\\JR_Refresh\\JavaCore\\test.txt";
	
	public AmigoOutputStream(FileOutputStream fileOutputStream)
			throws FileNotFoundException {
		super(fileName);
		this.fos = fileOutputStream;
	}
	
	@Override
	public void flush()
			throws IOException {
		fos.flush();
	}
	
	@Override
	public void write(int b)
			throws IOException {
		fos.write(b);
	}
	
	@Override
	public void write(byte[] b)
			throws IOException {
		fos.write(b);
	}
	
	@Override
	public void write(byte[] b, int off, int len)
			throws IOException {
		fos.write(b, off, len);
	}
	
	@Override
	public void close()
			throws IOException {
		flush();
		write("JavaRush © All rights reserved.".getBytes());
		fos.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		new AmigoOutputStream(new FileOutputStream(fileName));
	}
}
