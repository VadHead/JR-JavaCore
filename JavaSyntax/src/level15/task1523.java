package level15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class task1523 {
	
	public static void main(String[] args)
			throws IOException {
		URL url = new URL("http://httpbin.org/post");
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		try (OutputStream output = connection.getOutputStream()) {
			output.write(1);
		}
		try (InputStream input = connection.getInputStream()) {
			byte[] buffer = input.readAllBytes();
			String response = new String(buffer);
			System.out.println(response);
		}
		
	}
	
}
