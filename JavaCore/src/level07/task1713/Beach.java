package level07.task1713;


import java.util.Comparator;

public class Beach implements Comparable<Beach> {
	
	private String name;      //название
	private float distance;   //расстояние
	private int quality;    //качество
	
	public Beach(String name, float distance, int quality) {
		this.name = name;
		this.distance = distance;
		this.quality = quality;
	}
	
	public synchronized String getName() {
		return name;
	}
	
	public synchronized void setName(String name) {
		this.name = name;
	}
	
	public synchronized float getDistance() {
		return distance;
	}
	
	public synchronized void setDistance(float distance) {
		this.distance = distance;
	}
	
	public synchronized int getQuality() {
		return quality;
	}
	
	public synchronized void setQuality(int quality) {
		this.quality = quality;
	}
	
	public static void main(String[] args) {
		Beach beach1 = new Beach("Luzanovka", 5, 9);
		Beach beach2 = new Beach("Otrada", 25, 10);
		
		System.out.println(beach1.compareTo(beach2));
	}
	
	
	@Override
	public synchronized int compareTo(Beach o) {
		int score1 = 0;
		int score2 = 0;
		float distDiff = distance - o.distance;
		if (distDiff < 0) {
			score1++;
		}
		else if (distDiff > 0) {
			score2++;
		}
		int q = quality - o.quality;
		if (q > 0) {
			score1++;
		}
		else if (q < 0) {
			score2++;
		}
			return score1 - score2;
	}
	
}
