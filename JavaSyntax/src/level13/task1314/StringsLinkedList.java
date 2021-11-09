package level13.task1314;

public class StringsLinkedList {
	private Node first;
	private Node last;
	
//	public StringsLinkedList(Node first, Node last) {
//		this.first = first;
//		this.last = last;
//	}
	
	public void add(String value) {
		if (first.next == null) {
			Node node = new Node();
			node.value = value;
			first.next = node;
		}
		if (last.prev == null) {
			last.prev = first.next;
			return;
		}
		
		Node node = new Node();
		node.value = value;
		
		Node lastNode = last.prev;
		lastNode.next = node;
		node.prev = lastNode;
		last.prev = node;
	}
	
	public String get(int index) {
		Node node = first.next;
		int i = 0;
		while (node != null) {
			if (index == i) {
				return node.value;
			}
			node = node.next;
			i++;
		}
		return null;
	}
	
	public static class Node {
		private Node prev;
		private String value;
		private Node next;
	}
}
