package LinkedListExmpl;

public class Unit {
	
	private String value;
	private Unit prev;
	private Unit next;
	
	public Unit(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Unit getPrev() {
		return prev;
	}
	
	public void setPrev(Unit prev) {
		this.prev = prev;
	}
	
	public Unit getNext() {
		return next;
	}
	
	public void setNext(Unit next) {
		this.next = next;
	}
	
}
