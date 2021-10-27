package level13.task1316;

public class Solution {
	
	public static void main(String[] args) {
		JavarushQuest[] quest = JavarushQuest.values();
		for (JavarushQuest q : quest) {
			System.out.println(q.ordinal());
		}
	}
}
