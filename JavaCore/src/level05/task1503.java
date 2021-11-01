package level05;

import static level05.task1503.Constants.*;

public class task1503 {
	public static void main(String[] args) {
		new task1503.LuxuriousCar().printlnDesire();
		new task1503.CheapCar().printlnDesire();
		new task1503.Ferrari().printlnDesire();
		new task1503.Lanos().printlnDesire();
	}
	
	public static class LuxuriousCar {
		private void printlnDesire() {
			System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
		}
	}
	
	public static class CheapCar {
		private void printlnDesire() {
			System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
		}
	}
	
	public static class Ferrari extends LuxuriousCar {
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
		}
	}
	
	public static class Lanos extends CheapCar{
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
		}
	}
	
	public static class Constants {
		public static String WANT_STRING = "Я хочу ездить на ";
		public static String LUXURIOUS_CAR = "роскошной машине";
		public static String CHEAP_CAR = "дешевой машине";
		public static String FERRARI_NAME = "Феррари";
		public static String LANOS_NAME = "Ланосе";
	}
}
