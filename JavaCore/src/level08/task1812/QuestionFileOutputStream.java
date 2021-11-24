package level08.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
	
	private AmigoOutputStream amigoStream;
	
	public QuestionFileOutputStream(AmigoOutputStream amigoStream) {
		this.amigoStream = amigoStream;
	}
	
	@Override
	public void flush()
			throws IOException {
		amigoStream.flush();
	}
	
	@Override
	public void write(int b)
			throws IOException {
		amigoStream.write(b);
	}
	
	@Override
	public void write(byte[] b)
			throws IOException {
		amigoStream.write(b);
	}
	
	@Override
	public void write(byte[] b, int off, int len)
			throws IOException {
		amigoStream.write(b, off, len);
	}
	
	@Override
	public void close()
			throws IOException {
		System.out.println("Вы действительно хотите закрыть поток? Д/Н");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String response = reader.readLine();
		if (response.equals("Д")) {
			amigoStream.close();
		}
		
	}
	
}
