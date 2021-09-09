package level08;

import java.util.Random;

public class task0805 {
	private static final String CERTAIN = "Бесспорно";
	private static final String DEFINITELY = "Определённо да";
	private static final String MOST_LIKELY = "Вероятнее всего";
	private static final String OUTLOOK_GOOD = "Хорошие перспективы";
	private static final String ASK_AGAIN_LATER = "Спроси позже";
	private static final String TRY_AGAIN = "Попробуй снова";
	private static final String NO = "Мой ответ — нет";
	private static final String VERY_DOUBTFUL = "Весьма сомнительно";
	
	public static String getPrediction() {
		Random r = new Random();
		int number = r.nextInt(8);
		String phrase = null;
		if (number == 0) {
			phrase = CERTAIN;
		}
		else if (number == 1) {
			phrase = DEFINITELY;
		}
		else if (number == 2) {
			phrase = MOST_LIKELY;
		}
		else if (number == 3) {
			phrase = OUTLOOK_GOOD;
		}
		else if (number == 4) {
			phrase = ASK_AGAIN_LATER;
		}
		else if (number == 5) {
			phrase = TRY_AGAIN;
		}
		else if (number == 6) {
			phrase = NO;
		}
		else if (number == 7) {
			phrase = VERY_DOUBTFUL;
		}
		return phrase;
	}
	
	public static void main(String[] args) {
		System.out.println(getPrediction());
	}
}
