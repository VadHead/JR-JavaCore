package leetcode;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		int[] indeces = new int[0];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					indeces = new int[] {i, j};
				}
			}
		}
		return indeces;
	}
	
}
