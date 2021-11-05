package LinkedListExmpl;

public class Entity {
	
	private String value;
	private Entity prev;
	private Entity next;
	
	public Entity(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Entity getPrev() {
		return prev;
	}
	
	public void setPrev(Entity prev) {
		this.prev = prev;
	}
	
	public Entity getNext() {
		return next;
	}
	
	public void setNext(Entity next) {
		this.next = next;
	}
	
}
