package level04.task1408;

public class Solution {
	public static void main(String[] args) {
		Hen hen = HenFactory.getHen(Country.BELARUS);
		System.out.println(hen.getCountOfEggsPerMonth());
		System.out.println(hen.getDescription());
	}
	
	static class HenFactory {
		
		static Hen getHen(String country) {
			Hen hen = null;
			if ("Ukraine".equals(country)) {
				hen = new UkrainianHen();
			}
			else if ("Russia".equals(country)) {
				hen = new RussianHen();
			}
			else if ("Moldova".equals(country)) {
				hen = new MoldovanHen();
			}
			else if ("Belarus".equals(country)) {
				hen = new BelarusianHen();
			}
			return hen;
		}
	}
}
