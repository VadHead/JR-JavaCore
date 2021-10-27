package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task1509 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			char[] chars = line.toCharArray();
			Set<Character> characters = new HashSet<>();
			for (char aChar : chars) {
				if (Character.isAlphabetic(aChar)) {
					characters.add(Character.toLowerCase(aChar));
				}
			}
			System.out.println(characters);
		} catch (Exception e) {
			System.out.println("Something went wrong : " + e);
		}
	}
}
