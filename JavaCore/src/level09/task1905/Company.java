package level09.task1905;

public class Company implements Solution.Customer {
	private String companyName;
	private String countryName;
	
	public Company(String companyName, String countryName) {
		this.companyName = companyName;
		this.countryName = countryName;
	}
	
	@Override
	public String getCompanyName() {
		return companyName;
	}
	
	@Override
	public String getCountryName() {
		return countryName;
	}
	
}
