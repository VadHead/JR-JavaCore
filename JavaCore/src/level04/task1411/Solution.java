package level04.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Person person = null;
		String key = reader.readLine();
		
		while (key != null) {
			if (key.equals("user")) {
				doWork(new Person.User());
			}
			else if (key.equals("loser")) {
				doWork(new Person.Loser());
			}
			else if (key.equals("coder")) {
				doWork(new Person.Coder());
			}
			else if (key.equals("proger")) {
				doWork(new Person.Proger());
			}
			else {
				break;
			}
			key = reader.readLine();
		}
	}
	
	public static void doWork(Person person) {
		if (person instanceof Person.User) {
			((Person.User) person).live();
		}
		if (person instanceof Person.Loser) {
			((Person.Loser) person).doNothing();
		}
		if (person instanceof Person.Coder) {
			((Person.Coder) person).writeCode();
		}
		if (person instanceof Person.Proger) {
			((Person.Proger) person).enjoy();
		}
	}
	
}
