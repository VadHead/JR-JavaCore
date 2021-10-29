package level04.task1408;

public class UkrainianHen extends Hen {
	
	@Override
	String getDescription() {
		return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.UKRAINE,
				getCountOfEggsPerMonth());
	}
	
	@Override
	int getCountOfEggsPerMonth() {
		return 500;
	}
	
}
