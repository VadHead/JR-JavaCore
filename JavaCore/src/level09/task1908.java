package level09;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class task1908 {
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bReader = new BufferedReader(new FileReader(reader.readLine()));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(reader.readLine()));
		List<String> list = new ArrayList<>();
		
		while (bReader.ready()) {
			list.addAll(Arrays.stream(bReader.readLine().trim().split("\\s")).filter(s -> s.matches("\\d*"))
					.collect(Collectors.toList()));
		}
	
		for (String str : list) {
			bWriter.write(str + " ");
		}
		reader.close();
		bReader.close();
		bWriter.close();
	}
	
}
