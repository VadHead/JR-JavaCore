package LinkedListExmpl;

public class VLinkedList {
	
	private Unit first;
	private Unit last;
	
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
	}
	
	public void add(int index, String value) {
		Unit unit = new Unit(value);
		if (first == null && index >= 0) {
			this.add(value);
		}
		else if (index == 0) {
			unit.setNext(first);
			first.setPrev(unit);
			first = unit;
		}
		else {
			Unit prev = first;
			Unit next = first.getNext();
			for (int i = 1; i < index; i++) {
				prev = prev.getNext();
				next = next.getNext();
			}
			if (next == null) {
				add(value);
			}
			else if (prev.getNext() == next) {
				prev.setNext(unit);
				unit.setPrev(prev);
				unit.setNext(next);
				next.setPrev(unit);
			}
			else {
				System.out.println("Houston! We have a problem!");
			}
		}
		
	}
	
	public String get(int index) {
		if (index < 0 || first == null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		String result = "";
		Unit unit = first;
		for (int i = 0; i <= index; i++) {
			try{
				result = unit.getValue();
			}catch (NullPointerException e){
				throw new ArrayIndexOutOfBoundsException();
			}
			unit = unit.getNext();
		}
		return result;
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
