import LinkedListV2.LinkedListV2;

import java.util.LinkedList;

public class V2Example {
	
	public static void main(String[] args) {
		LinkedListV2<String > llv = new LinkedListV2();
		llv.addFirst("one");
		llv.addLast("two");
		llv.addLast("three");
		llv.addLast("four");
		llv.addLast("five");
		System.out.println(llv);

//		llv.addFirst("zero");
//		System.out.println(llv);
//
//		System.out.println(llv.getFirst());
//		System.out.println(llv.getLast());
//
		llv.addLast("four");
//		System.out.println(llv);
		System.out.println(llv.firstIndexOf("four"));
		System.out.println(llv.lastIndexOf("four"));
		System.out.println(llv.getFirst());
		System.out.println(llv.getLast());
//		System.out.println(llv.getValueOf(2));
//		llv.set(4, null);
//		System.out.println(llv.removeFirst());
//		System.out.println(llv);
//		System.out.println(llv);
//		System.out.println(llv);
	}
}
