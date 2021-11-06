import LinkedListExmpl.VLinkedList;

public class VLinkedTest {
	
	public static void main(String[] args) {
		VLinkedList vlist = new VLinkedList();
		vlist.add("first");
		vlist.add("second");
		vlist.add("third");
		vlist.add("fourth");
		
		vlist.add(5, "test");
		
		System.out.println(vlist.get(0));
		System.out.println(vlist.get(1));
		System.out.println(vlist.get(2));
//		System.out.println(vlist.get(-9));
		System.out.println(vlist);
	}
}
