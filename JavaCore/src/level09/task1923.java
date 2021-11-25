package level09;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class task1923 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		FileReader fileReader = new FileReader(reader.readLine());
		FileWriter fileWriter = new FileWriter(reader.readLine());
		
		BufferedReader bfReader = new BufferedReader(fileReader);
		
		ArrayList<String> content = new ArrayList<>();
		
		while (bfReader.ready()){
			content.addAll(Arrays.asList(bfReader.readLine().trim().split(" ")));
		}
		
		for (String c:content) {
			if (c.matches(".*\\d.*")) fileWriter.write(c + " ");
		}
		
		reader.close();
		fileReader.close();
		fileWriter.close();
	}
}
