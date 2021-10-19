package level18;

import java.util.Optional;
import java.util.stream.Stream;

public class task1821 {
	public static void main(String[] args) {
		var tesla = Stream.of(
				new Car1("Model S", 94_490),
				new Car1("Model 3", 50_690),
				new Car1("Model X", 99_690),
				new Car1("Model Y", 65_000)
		);
		
		var bmw = Stream.of(
				new Car1("X5", 110_000),
				new Car1("X3", 54_000),
				new Car1("X1", 40_000),
				new Car1("X6", 125_000)
		);
		
		Optional<Car1> cheapestCar = getCheapestCar(tesla);
		cheapestCar.ifPresent(System.out::println);
		
		Optional<Car1> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
		cheaperCar.ifPresent(System.out::println);
	}
	
	public static Optional<Car1> getCheapestCar(Stream<Car1> cars) {
		return cars.min((c1, c2) -> c1.getPrice() - c2.getPrice());
	}
	
	public static Optional<Car1> getCheaperCar(Stream<Car1> cars, Car1 cheapestCar) {
		return cars.filter(c -> c.getPrice() < cheapestCar.getPrice()).findFirst();
	}
}

class Car1 {
	private String name;
	private Integer price;
	
	public Car1(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Автомобиль " + name + ", цена - " + price + " USD";
	}
}
