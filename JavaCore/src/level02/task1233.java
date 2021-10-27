package level02;

import java.util.Arrays;
import java.util.stream.Stream;

public class task1233 {
	public static void main(String[] args) throws Exception {
		int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
		
		Pair<Integer, Integer> result = getMinimumAndIndex(data);
		
		System.out.println("The minimum is " + result.x);
		System.out.println("The index of the minimum element is " + result.y);
	}
	
	public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
		if (array == null || array.length == 0) {
			return new Pair<Integer,Integer>(null, null);
		}
		
		int min = Arrays.stream(array).sorted().findFirst().getAsInt();
		int index = (int) Arrays.stream(array).takeWhile(x -> x != min).count();

		return new Pair<Integer,Integer>(min, index);
	}
	
	
	public static class Pair<X, Y> {
		public X x;
		public Y y;
		
		public Pair(X x, Y y) {
			this.x = x;
			this.y = y;
		}
	}
}
