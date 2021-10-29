package level04.task1408;

public abstract class Hen implements Country {
	
	String getDescription() {
		return "Я - курица.";
	}
	
	abstract int getCountOfEggsPerMonth();
	
}
