package level13;

import java.util.HashSet;
import static java.util.Arrays.asList;

public class task1302 {
	public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
	
	public static void checkWords(String word) {
		String result = words.contains(word) ? "есть" : "нет";
		System.out.printf("Слов %s %s в множесве\n", word, result);
	}
	
	public static void main(String[] args) {
		checkWords("JavaScript");
		checkWords("Java");
	}
}
