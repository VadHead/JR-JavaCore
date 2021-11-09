package LinkedListV2;

import LinkedListExmpl.Unit;

import java.util.NoSuchElementException;

public class LinkedListV2 {
	private Element first;
	
	private boolean firstExist(){
		return first != null;
	}
	
	public void addFirst(String value) {
		Element element = new Element(value);
		element.setNext(first);
		first = element;
	}
	
	public void addLast(String value) {
		if (!firstExist()) {
			addFirst(value);
		}
		else {
			Element element = first;
			while (element.getNext() != null) {
				element = element.getNext();
			}
			Element lastElement = new Element(value);
			element.setNext(lastElement);
			
		}
	}
	
	public Element get(String value) {
		if (firstExist()) {
			Element element = first;
			while (element.getNext() != null) {
				if (element.getValue().equals(value)) {
					return element;
				}
				element = element.getNext();
			}
		}
		throw new NoSuchElementException();
	}
	
	public Element getFirst() {
		if (firstExist()) {
			return first;
		}
		return null;
	}
	
	public Element getLast() {
		if (!firstExist()) {
			return null;
		}
		else {
			Element element = first;
			while (element.getNext() != null) {
				element = element.getNext();
			}
			return element;
		}
	}
	
	public boolean isExist(String value){
		if (!firstExist()) {
			return false;
		}
		else {
			boolean isExist = false;
			Element element = first;
			while (element.getNext() != null) {
				if (element.getValue().equals(value)) {
					isExist = true;
					break;
				}
				element = element.getNext();
			}
			return isExist;
		}
	}
	
	public void remove(String value) {
		if (!firstExist()) {
			return;
		} if (first.getValue().equals(value)) {
			first = first.getNext();
		}
		else {
			Element element = first;
			while (element.getNext() != null) {
				Element nextElement = element.getNext();
				if (nextElement.getValue().equals(value)) {
					element.setNext(nextElement.getNext());
					return;
				}
				element = element.getNext();
			}
			
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Element element = first;
		while (element != null) {
			sb.append(element.getValue()).append(" | ");
			//sb.append(element.getValue()).append(" > ").append(element.getNext()).append(" | ");
			element = element.getNext();
		}
		return "Linked Elements: [ " + sb.replace(sb.lastIndexOf("|"), sb.lastIndexOf("|") + 1, "]");
	}
	
}
