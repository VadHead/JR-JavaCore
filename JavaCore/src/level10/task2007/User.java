package level10.task2007;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private boolean isMale;
	private Country country;
	
	public User(String firstName, String lastName, Date birthDate, boolean isMale, Country country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.isMale = isMale;
		this.country = country;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public boolean isMale() {
		return isMale;
	}
	
	public void setMale(boolean male) {
		isMale = male;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return String.format("First Name: %-7s | LastName: %-10s | Birthday: %-31s | is Male?: %-5s | Country: %s", getFirstName(), getLastName(), getBirthDate(), isMale(), getCountry());
	}
	
	public enum Country {
		UKRAINE("Ukraine"),
		RUSSIA("Russia"),
		OTHER("Other");
		
		private String name;
		
		Country(String name) {
			this.name = name;
		}
		
		public String getDisplayName() {
			return this.name;
		}
	}
}
