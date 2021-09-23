package level12;

public class task1206 {
	public static void main(String[] args) {
		String string = "Думаю, это будет новой фичей." +
				"Только не говорите никому, что она возникла случайно.";
		
		System.out.println("Количество цифр в строке : " + countDigits(string));
		System.out.println("Количество букв в строке : " + countLetters(string));
		System.out.println("Количество пробелов в строке : " + countSpaces(string));
	}
	
	public static int countDigits(String string) {
		char[] chArrays = string.toCharArray();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(chArrays[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static int countLetters(String string) {
		char[] chArrays = string.toCharArray();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(chArrays[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static int countSpaces(String string) {
		char[] chArrays = string.toCharArray();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isSpaceChar(chArrays[i])) {
				count++;
			}
		}
		return count;
	}
	
}
