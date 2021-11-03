package level05.task1530;

public class Solution {
	
	public static void main(String[] args) {
		DrinkMaker tea = new TeaMaker();
		tea.makeDrink();
		DrinkMaker latte = new LatteMaker();
		latte.makeDrink();
	}
}
