package level13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class task1304 {
	public static void printList(ArrayList<String> words) {
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	public static void printHashSet(HashSet<String> words) {
		for (String word : words) {
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
		ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
		HashSet<String> wordsHashSet = new HashSet<>(wordsList);
		printList(wordsList);
		System.out.println("__________________________________");
		printHashSet(wordsHashSet);
	}
}
