package level09.task1905;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static Map<String,String> countries = new HashMap<String,String>();
	
	static {
		countries.put("UA", "Ukraine");
		countries.put("RU", "Russia");
		countries.put("CA", "Canada");
	}
	
	public static void main(String[] args) {
		User user = new User("Ivanov, Ivan", "+380(50)123-4567");
		Company company = new Company("JavaRush Ltd.", "Ukraine");
		DataAdapter dataAdapter = new DataAdapter(company, user);
		System.out.printf("Company name: %s | Country Code: %s | First Name: %s | Last Name: %s | Dial line: %s",
				dataAdapter.getCompany(), dataAdapter.getCountryCode(), dataAdapter.getContactFirstName(),
				dataAdapter.getContactLastName(), dataAdapter.getDialString());
	}
	
	public static class DataAdapter implements RowItem {
		
		private Customer customer;
		private Contact contact;
		
		public DataAdapter(Customer customer, Contact contact) {
			this.contact = contact;
			this.customer = customer;
		}
		
		@Override
		public String getCountryCode() {
			for (Map.Entry<String,String> entry : countries.entrySet()) {
				if (entry.getValue().equals(customer.getCountryName())) {
					return entry.getKey();
				}
			}
			return null;
		}
		
		@Override
		public String getCompany() {
			return customer.getCompanyName();
		}
		
		@Override
		public String getContactFirstName() {
			return contact.getName().substring(contact.getName().indexOf(" ") + 1);
		}
		
		@Override
		public String getContactLastName() {
			return contact.getName().substring(0, contact.getName().indexOf(","));
		}
		
		@Override
		public String getDialString() {
			return String.format("callto://+%s", contact.getPhoneNumber().replaceAll("\\D", ""));
		}
		
	}
	
	public static interface RowItem {
		
		String getCountryCode();        //For example: UA
		
		String getCompany();            //For example: JavaRush Ltd.
		
		String getContactFirstName();   //For example: Ivan
		
		String getContactLastName();    //For example: Ivanov
		
		String getDialString();         //For example: callto://+380501234567
		
	}
	
	public static interface Customer {
		
		String getCompanyName();        //For example: JavaRush Ltd.
		
		String getCountryName();        //For example: Ukraine
		
	}
	
	public static interface Contact {
		
		String getName();               //For example: Ivanov, Ivan
		
		String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
		
	}
	
}

