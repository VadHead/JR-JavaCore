package LinkedListExmpl;

import java.util.NoSuchElementException;

public class VLinkedList {
	
	private Entity first;
	private Entity last;
	
	public void add(String value) {
		Entity entity = new Entity(value);
		if (first == null) {
			first = entity;
		}
		else if (last == null) {
			last = entity;
			last.setPrev(first);
			first.setNext(last);
		}
		else {
			last.setNext(entity);
			entity.setPrev(last);
			last = entity;
		}
	}
	
	public String get(int index) {
		if (index < 0 || first == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		String result = "";
		Entity entity = first;
		for (int i = 0; i <= index; i++) {
			try{
				result = entity.getValue();
			}catch (NullPointerException e){
				throw new ArrayIndexOutOfBoundsException();
			}
			entity = entity.getNext();
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Entity entity = first;
		while (entity != null){
			sb.append(entity.getValue()).append(" | ");
			entity = entity.getNext();
		}
		return "| " + sb;
	}
	
}
