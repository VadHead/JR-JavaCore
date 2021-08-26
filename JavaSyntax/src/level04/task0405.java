package level04;

public class task0405 {
	
	public static void main(String[] args) {
		String letter = "Б";
		int r = 0;
		while (r < 10) {
			int c = 0;
			while (c < 20) {
				if (r == 0 || r == 9 )System.out.print(letter);
				else if (c == 0 || c == 19) System.out.print(letter);
				else System.out.print(" ");
				c++;
			}
			System.out.println();
					r++;
		}
	}
}
