package level09.task1904;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args)
			throws IOException {
		Path path = Paths.get("JavaCore\\src\\level09\\task1904\\test.txt");
		PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(path));
		Person person = personScannerAdapter.read();
		System.out.println(person.toString());
	}
	
	public static class PersonScannerAdapter implements PersonScanner{
		private final Scanner fileScanner;
		
		public PersonScannerAdapter(Scanner fileScanner) {
			this.fileScanner = fileScanner;
		}
		
		@Override
		public Person read()
				throws IOException {
			String fileRow = fileScanner.nextLine();
			String[] person = fileRow.split(" ");;
			String birth = String.format("%s %s %s", person[3], person[4], person[5]);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
			LocalDate birthDateTime = LocalDate.parse(birth, formatter);
			Date convBirthDateTime = Date.from(birthDateTime.atStartOfDay()
					.atZone(ZoneId.systemDefault())
					.toInstant());
			return new Person(person[1], person[2], person[0], convBirthDateTime);
		}
		
		@Override
		public void close()
				throws IOException {
			fileScanner.close();
		}
		
	}
	
}
