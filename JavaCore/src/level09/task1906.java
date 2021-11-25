package level09;

import java.io.*;

public class task1906 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileIn = reader.readLine();
		String fileOut = reader.readLine();
		
		FileReader fileReader = new FileReader(fileIn);
		FileWriter fileWriter = new FileWriter(fileOut);
		int count = 1;
		while (fileReader.ready()) {
			if (count % 2 == 0) {
				fileWriter.write(fileReader.read());
			}
			else {
				fileReader.read();
			}
			count++;
		}
		fileReader.close();
		fileWriter.close();
		reader.close();
		
	}
	
}
