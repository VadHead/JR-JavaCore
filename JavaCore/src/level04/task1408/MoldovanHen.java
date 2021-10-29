package level04.task1408;

public class MoldovanHen extends Hen {
	
	@Override
	String getDescription() {
		return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.MOLDOVA,
				getCountOfEggsPerMonth());
	}
	
	@Override
	int getCountOfEggsPerMonth() {
		return 100;
	}
	
}
