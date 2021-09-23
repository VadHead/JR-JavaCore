package level12;

public class task1201 {
	
	public static void main(String[] args) {
		byte byteValue = 1;
		short shortValue = 10;
		int intValue = 999;
		long longValue = 999999999;
		
		float floatValue = 1.2f;
		double doubleValue = 1.002;
		
		char charValue = 'A';
		boolean booleanValue = true;
		
		Byte byteValueBox = Byte.valueOf(byteValue);
		Short shortValueBox = Short.valueOf(shortValue);
		Integer integerValueBox = Integer.valueOf(intValue);
		Long longValueBox = Long.valueOf(longValue);
		
		Float floatValueBox = Float.valueOf(floatValue);
		Double doubleValueBox = Double.valueOf(doubleValue);
		
		Character characterValueBox = Character.valueOf(charValue);
		Boolean booleanValueBox = Boolean.valueOf(booleanValue);
		
	}
}
