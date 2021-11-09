package LinkedListExmpl;

import LinkedListExmpl.*;

import java.util.LinkedList;
import java.util.List;

public class VLinkedTest {
	
	public static void main(String[] args) {
		VLinkedList vlist = new VLinkedList();
		vlist.add("first");
		vlist.add("second");
		vlist.add("third");
		vlist.add("fourth");
		
//		vlist.add(89, "test");
		vlist.remove(3);
//		System.out.println(vlist.get(0));
//		System.out.println(vlist.get(1));
//		System.out.println(vlist.get(3));
//		System.out.println(vlist.get(-9));
		System.out.println(vlist);
		System.out.println(VLinkedList.getSize());
	}
}
