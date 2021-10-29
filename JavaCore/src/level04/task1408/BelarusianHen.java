package level04.task1408;

public class BelarusianHen extends Hen {
	
	@Override
	String getDescription() {
		return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS,
				getCountOfEggsPerMonth());
	}
	
	@Override
	int getCountOfEggsPerMonth() {
		return 150;
	}
	
}
