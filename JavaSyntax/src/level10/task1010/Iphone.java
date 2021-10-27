package level10.task1010;
import java.util.Objects;
public class Iphone {
	private String model;
	private String color;
	private int price;
	
	public Iphone(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		Iphone iphone = (Iphone) object;
		if (!Objects.equals(this.color, iphone.color)) {
			return false;
		}
		else if (!Objects.equals(this.price, iphone.price)) {
			return false;
		}
		else if (!Objects.equals(this.model, iphone.model)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone("X", "Black", 999);
		Iphone iphone2 = new Iphone("X", "Black", 999);
		
		System.out.println(iphone1.equals(iphone2));
	}
}
