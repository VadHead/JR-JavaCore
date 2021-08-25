package level03;

import java.util.Scanner;

public class task0308 {
	
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		if (x > 0 && y > 0) System.out.println("1");
		else if (x < 0 && y > 0) System.out.println("2");
		else if(x < 0 && y < 0) System.out.println("3");
		else System.out.println("4");
	}
}
