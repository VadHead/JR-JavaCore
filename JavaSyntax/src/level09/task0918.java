package level09;

public class task0918 {
	public static void main(String[] args) {
		String string = "Учиться, учиться и еще раз учиться! ";
		
		System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
		System.out.println(replace(string, ", ", 16, 27));
	}
	
	public static StringBuilder addTo(String string, String[] strings) {
		StringBuilder result = new StringBuilder(string);
		for (int i = 0; i < strings.length; i++) {
			result.append(strings[i]);
		}
		return result;
	}
	
	public static StringBuilder replace(String string, String str, int start, int end) {
		StringBuilder result = new StringBuilder(string);
		return result.replace(start, end, str);
	}
}
