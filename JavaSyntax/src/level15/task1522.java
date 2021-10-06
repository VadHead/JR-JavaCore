package level15;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class task1522 {
	
	public static void main(String[] args)
			throws IOException {
		URL url = new URL("https://www.ringcentral.com/services/GeoPoint.servlet");
		//URLConnection connection = url.openConnection();
		
		try (InputStream input = url.openStream()) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(input));
			while (bf.ready()) {
				System.out.println(bf.readLine());
			}
		}
	}
	
}
