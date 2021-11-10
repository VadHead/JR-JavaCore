package LinkedListV2;

public class V2Example {
	
	public static void main(String[] args) {
		LinkedListV2 llv = new LinkedListV2();
		llv.addFirst("one");
		llv.addLast("two");
		llv.addLast("three");
		llv.addLast("four");
		llv.addLast("five");
		System.out.println(llv);

//		llv.addFirst("zero");
//		System.out.println(llv);

//		System.out.println(llv.getFirst().getValue());
//		System.out.println(llv.getLast().getValue());

//		System.out.println(llv.isExist("three"));
//		llv.remove("three");
//		System.out.println(llv.isExist("three"));
//		System.out.println(llv.isExist("five"));
//		System.out.println(llv.isExist("one"));
//		System.out.println(llv);

		System.out.println(llv.get("zero").getValue());
		System.out.println(llv.get("ten").getValue());
		System.out.println(llv.get("one").getValue());
		System.out.println(llv.get("three").getValue());
		System.out.println(llv.get("five").getValue());

//		llv.addLast("four");
//		System.out.println(llv);
//		llv.set("four","six");
//		System.out.println(llv);
//		llv.set("one","seven");
//		System.out.println(llv);
//		llv.set("four","eight");
//		System.out.println(llv);
	}
}
