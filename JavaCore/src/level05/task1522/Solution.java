package level05.task1522;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println(thePlanet.getClass().getSimpleName());
	}
	
	public static Planet thePlanet;
	
	static {
		readKeyFromConsoleAndInitPlanet();
	}
	
	public static void readKeyFromConsoleAndInitPlanet() {
		Scanner scanner = new Scanner(System.in);
		String planetName = scanner.nextLine();
		switch (planetName) {
			case Planet.EARTH:
				thePlanet = Earth.getInstance(); break;
			case Planet.SUN:
				thePlanet = Sun.getInstance(); break;
			case Planet.MOON:
				thePlanet = Moon.getInstance(); break;
			default:
				thePlanet = null;
		}
	}
}
