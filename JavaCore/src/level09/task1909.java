package level09;

import java.io.*;

public class task1909 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bReader = new BufferedReader(new FileReader(reader.readLine()));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(reader.readLine()));
		
		StringBuilder sb = new StringBuilder();
		
		while (bReader.ready()) {
			sb.append(bReader.readLine().trim().replaceAll("\\.", "!"));
		}
		bWriter.write(sb.toString());
		
		reader.close();
		bReader.close();
		bWriter.close();
	}
}
