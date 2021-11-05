package level05.task1523;

public class Solution {
	private int sum;
	private String name;
	public static void main(String[] args) {
	
	}
	
	private Solution(int n) {
		this.sum = n;
	}
	
	protected Solution(String s) {
		this.name = s;
	}
	
	Solution(int n, String s) {
		this.sum = n;
		this.name = s;
	}
	
	public Solution() {
	}
	
}
