package level04.task1414;

import java.util.Scanner;

import static level04.task1414.Solution.MovieFactory.getMovie;

/*
MovieFactory
*/

public class Solution {
	
	public static void main(String[] args)
			throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputKey;
		while ((inputKey = scanner.nextLine()) != null) {
			Movie movie = MovieFactory.getMovie(inputKey);
			if (movie == null) {
				break;
			}
			System.out.println(movie.getClass().getSimpleName());
		}
		
	}
	
	static class MovieFactory {
		
		static Movie getMovie(String key) {
			Movie movie = null;
			
			if ("soapOpera".equals(key)) {
				movie = new SoapOpera();
			}
			else if ("cartoon".equals(key)) {
				movie = new Cartoon();
			}
			else if ("thriller".equals(key)) {
				movie = new Thriller();
			}
			return movie;
		}
		
	}
	
	static abstract class Movie {
	}
	
	static class SoapOpera extends Movie {
	}
	
	static class Cartoon extends Movie {
	}
	
	static class Thriller extends Movie {
	}
	
}