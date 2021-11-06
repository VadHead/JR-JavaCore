package LinkedListExmpl;

public class VLinkedList {
	
	private Unit first;
	private Unit last;
	
	public static int getSize() {
		return size;
	}
	
	private static int size = 0;
	
	
	
	public void add(String value) {
		Unit unit = new Unit(value);
		if (first == null) {
			first = unit;
		}
		else if (last == null) {
			last = unit;
			last.setPrev(first);
			first.setNext(last);
		}
		else {
			last.setNext(unit);
			unit.setPrev(last);
			last = unit;
		}
		size++;
	}
	
	public void add(int index, String value) {
		Unit unit = new Unit(value);
		if (size <= 0) {
			add(unit.getValue());
		}
		else if (index == 0) {
			first.setPrev(unit);
			unit.setNext(first);
			first = unit;
			size ++;
		}
		else if (index >= size) {
			unit.setPrev(last);
			last.setNext(unit);
			last = unit;
			size++;
		}
		else {
			Unit prev = first;
			for (int i = 0; i <= index; i++) {
				prev = prev.getNext();
			}
			Unit next = prev.getNext();
			prev.setNext(unit);
			next.setPrev(unit);
			unit.setPrev(prev);
			unit.setNext(next);
			size++;
		}
	}
	
	public String get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		String result = "";
		Unit unit = first;
		for (int i = 0; i <= index; i++) {
			result = unit.getValue();
			unit = unit.getNext();
		}
		return result;
	}
	
	public void remove(int index) {
		if (size == 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else if (index == 0) {
			first = first.getNext();
			first.setPrev(null);
			size--;
		}
		else if (index == size - 1) {
			last = last.getPrev();
			last.setNext(null);
			size --;
		}
		else {
			Unit unit = first;
			for (int i = 1; i <= index; i++) {
				unit = unit.getNext();
			}
			Unit prev = unit.getPrev();
			Unit next = unit.getNext();
			prev.setNext(next);
			next.setPrev(prev);
			size--;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Unit unit = first;
		while (unit != null){
			sb.append(unit.getValue()).append(" | ");
			unit = unit.getNext();
		}
		return "| " + sb;
	}
	
}
