package level06.task0610;

public class Person {
	
	public static void main(String[] args) {
	
	}
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	protected String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	public String getFullName(){
		return firstName + " " + lastName;
	}
}

