package level08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task1808 {
	
	public static void main(String[] args)
			throws IOException {
		Scanner scanner = new Scanner(System.in);
		String fileNameFirst = scanner.nextLine();
		String fileNameSecond = scanner.nextLine();
		String fileNameThird = scanner.nextLine();
		
		FileInputStream fileInputStream = new FileInputStream(fileNameFirst);
		FileOutputStream fileOutputFirst = new FileOutputStream(fileNameSecond);
		FileOutputStream fileOutputSecond = new FileOutputStream(fileNameThird);
		
		ArrayList<Integer> bytes = new ArrayList<>();
		while(fileInputStream.available() > 0){
			bytes.add(fileInputStream.read());
		}
		
		if (bytes.size() % 2 != 0) {
			for (int i = 0; i < bytes.size(); i++) {
				if (i < bytes.size() / 2 + 1) {
					fileOutputFirst.write(bytes.get(i));
				}
				else if (i >= bytes.size() / 2 + 1) {
					fileOutputSecond.write(bytes.get(i));
				}
			}
		}
		else {
			for (int i = 0; i < bytes.size() / 2; i++) {
				fileOutputFirst.write(bytes.get(i));
			}
			for (int i = bytes.size() / 2; i < bytes.size(); i++) {
				fileOutputSecond.write(bytes.get(i));
			}
		}
		fileOutputSecond.close();
		fileInputStream.close();
		fileOutputFirst.close();
		
	}
}
