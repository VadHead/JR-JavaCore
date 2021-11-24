package level09.task1905;

public class User implements Solution.Contact {
	private String name;
	private  String phoneNumber;
	
	public User(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
