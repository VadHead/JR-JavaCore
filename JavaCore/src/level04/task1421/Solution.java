package level04.task1421;

public class Solution {
	
	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
		//Singleton single3 = new Singleton();
	}
}
