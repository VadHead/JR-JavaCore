package level14;

import java.util.ArrayList;
import java.util.List;

public class task1415 {
	private final List<String> storage = new ArrayList<>();
	
	public void push(String s) {
		storage.add(0, s);
	}
	
	public String pop() {
		String element =storage.get(0);
		storage.remove(0);
		return element;
	}
	
	public String peek() {
		return storage.get(0);
	}
	
	public boolean empty() {
		return storage.isEmpty();
	}
	
	public int search(String s) {
		return storage.indexOf(s);
	}
}
