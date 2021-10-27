package level13;

public class task1322 {
	public static void main(String[] args) {
		System.out.println(getShapeNameByCountOfCorners(3));
		System.out.println(getShapeNameByCountOfCorners(5));
		System.out.println(getShapeNameByCountOfCorners(1));
	}
	
	public static String getShapeNameByCountOfCorners(int countOfCorner) {
		String shape;
		switch (countOfCorner) {
			case 3:
				shape = "Треугольник";
				break;
			case 4:
				shape = "Четырехугольник";
				break;
			case 5:
				shape = "Пятиугольник";
				break;
			case 6:
				shape = "Шестиугольник";
				break;
			case 7:
				shape = "Семиугольник";
				break;
			case 8:
				shape = "Восьмиугольник";
				break;
			default:
				shape = "Другая форма";
		}
		return shape;
	}
}
