package level09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task1907 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bf = new BufferedReader(fileReader);
		long count = 0;
		while(bf.ready()){
			count += Arrays.stream(bf.readLine().split("\\p{P}|\\s")).filter(s -> s.equals("world")).count();
		}
		
		System.out.println(count);
		
		reader.close();
		fileReader.close();
		bf.close();
	}
}
