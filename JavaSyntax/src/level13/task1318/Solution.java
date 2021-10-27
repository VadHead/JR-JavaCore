package level13.task1318;

public class Solution {
	public static void main(String[] args) {
		System.out.println(getNextMonth(Month.JANUARY));
		System.out.println(getNextMonth(Month.DECEMBER));
	}
	
	public static Month getNextMonth(Month month) {
		int index = month.ordinal();
		if (index == 11) {
			return Month.values()[0];
		}
		return Month.values()[index + 1];
	}
}
