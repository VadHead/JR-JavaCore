package level09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1922 {
	
	public static List<String> words = new ArrayList<String>();
	
	static {
		words.add("файл");
		words.add("вид");
		words.add("В");
	}
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileReader fileReader = new FileReader(reader.readLine());
		BufferedReader bfReader = new BufferedReader(fileReader);
		
		ArrayList<String> content = new ArrayList<String>();
		int count = 0;
		while (bfReader.ready()) {
			content.addAll(Arrays.asList(bfReader.readLine().split(" ")));
			for (String w : words) {
				for (String c : content) {
					if (w.equals(c)) {
						count++;
					}
				}
			}
			if (count == 2) {
				content.forEach(s -> System.out.print(s + " "));
				System.out.println();
			}
			count = 0;
			content.clear();
		}
		bfReader.close();
		fileReader.close();
		reader.close();
	}
	
}
