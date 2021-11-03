package level05.task1525;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<String> lines = new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println(lines);
	}
	
	static {
		Path path = Paths.get(Statics.FILE_NAME);
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
