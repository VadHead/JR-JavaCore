package level08;

import java.io.FileReader;
import java.io.IOException;


public class task1816 {
	
	public static void main(String[] args)
			throws IOException {
		FileReader fileReader = new FileReader(args[0]);
		char[] buffer = new char[1000];
		int charCounter = 0;
		while (fileReader.ready()) {
			fileReader.read(buffer);
			for (char c : buffer) {
				if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
					charCounter++;
				}
			}
			
		}
		fileReader.close();
		System.out.println(charCounter);
	}
	
}
