package level04.task1409;

public class Solution {
	
	public static void main(String[] args) {
		println(new WaterBridge());
		println(new SuspensionBridge());
	}
	
	public static void println(Bridge bridge) {
		
		System.out.println(bridge.getCarsCount());
	}
	
}
