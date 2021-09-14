package level09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class task0915 {
	public static void main(String[] args) {
		String packagePath = "java.util.stream";
		String[] tokens = getTokens(packagePath, "\\.");
		System.out.println(Arrays.toString(tokens));
	}
	
	public static String[] getTokens(String query, String delimiter) {
		String[] tokens = new String[6];
		StringTokenizer token = new StringTokenizer(query, delimiter);
		int i = 0;
		while (token.hasMoreTokens()){
			tokens[i] = token.nextToken();
			i++;
		}
//		for (int i = 0; i < tokens.length; i++) {
//			if (token.hasMoreTokens()) tokens[i] = token.nextToken();
//		}
		return tokens;
	}
}
