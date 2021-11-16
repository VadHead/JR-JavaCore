package level07.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
	
	public static volatile List<Person> allPeople = new ArrayList<Person>();
	
	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
		allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
	}
	
	public static void main(String[] args)
			throws Exception {
		if (args == null || args.length < 1) {
			throw new RuntimeException();
		}
		switch (args[0]) {
			case "-c":
				synchronized (allPeople) {
					for (int i = 1; i < args.length; i += 3) {
						createPerson(args[i], args[i + 1], args[i + 2]);
					}
				}
				break;
			case "-i":
				synchronized (allPeople) {
					for (int i = 1; i < args.length; i++) {
						personInfo(Integer.parseInt(args[i]));
					}
				}
				break;
			case "-u":
				synchronized (allPeople) {
					for (int i = 1; i < args.length; i += 4) {
						updatePerson(Integer.parseInt(args[i]), args[i + 1], args[i + 2], args[i + 3]);
					}
				}
				break;
			case "-d":
				synchronized (allPeople) {
					for (int i = 1; i < args.length; i++) {
						deletePerson(Integer.parseInt(args[i]));
					}
				}
				break;
		}
		//allPeople.forEach(s -> System.out.printf("%s %s %s", s.getName(), s.getSex(), s.getBirthDate()));
		
	}
	
	static SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	static SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
	
	public static void createPerson(String name, String sex, String birthday) {
		Person person;
		Date bDate = new Date();
		try {
			bDate = formatIn.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (sex.equals("м")) {
			person = Person.createMale(name, bDate);
			allPeople.add(person);
			System.out.println(allPeople.indexOf(person));
		}
		else if (sex.equals("ж")) {
			person = Person.createFemale(name, bDate);
			allPeople.add(person);
			System.out.println(allPeople.indexOf(person));
		}
	}
	
	public static void personInfo(int id) {
		Person person = allPeople.get(id);
		String sex = "";
		String formattedDate = formatOut.format(person.getBirthDate());
		if (person.getSex() == Sex.MALE) {
			sex = "м";
		}
		else if (person.getSex() == Sex.FEMALE) {
			sex = "ж";
		}
		
		System.out.printf("%s %s %s", person.getName(), sex, formattedDate);
		System.out.println();
	}
	
	public static void updatePerson(int id, String name, String sex, String birthday) {
		Person person = allPeople.get(id);
		Date bDate = new Date();
		try {
			bDate = formatIn.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		person.setBirthDate(bDate);
		person.setName(name);
		if (sex.equals("м")) {
			person.setSex(Sex.MALE);
		}
		else if (sex.equals("ж")) {
			person.setSex(Sex.FEMALE);
		}
	}
	
	public static void deletePerson(int id) {
		Person person = allPeople.get(id);
		person.setSex(null);
		person.setName(null);
		person.setBirthDate(null);
	}
	
}
