package level17.task1715;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static List<MusicalInstrument> orchestra = new ArrayList<>();
	
	public static void main(String[] args) {
		createKeyboardOrchestra();
		createStringedOrchestra();
		playOrchestra();
	}
	
	public static void createKeyboardOrchestra() {
		orchestra.add((MusicalInstrument) new Organ());
		orchestra.add((MusicalInstrument) new Piano());
		orchestra.add((MusicalInstrument) new Piano());
		orchestra.add((MusicalInstrument) new Piano());
	}
	
	public static void createStringedOrchestra() {
		orchestra.add((MusicalInstrument) new Violin());
		orchestra.add((MusicalInstrument) new Violin());
		orchestra.add((MusicalInstrument) new Guitar());
	}
	
	public static void playOrchestra() {
		for (MusicalInstrument instrument:orchestra) {
			instrument.play();
		}
	}
}
