package level08;

import java.io.*;

public class task1826 {
	
	public static void main(String[] args)
			throws IOException {
		String modeParam = args[0];
		String fileInName;
		String fileOutName;
		if (modeParam.equals("-e")) {
			fileInName = args[1];
			fileOutName = args[2];
			FileInputStream fileInput = new FileInputStream(fileInName);
			FileOutputStream fileOut = new FileOutputStream(fileOutName);
			
			while (fileInput.available() > 0) {
				fileOut.write(fileInput.read() + 13);
			}
			fileInput.close();
			fileOut.close();
		}
		else if (modeParam.equals("-d")) {
			fileInName = args[1];
			fileOutName = args[2];
			FileInputStream fileInput = new FileInputStream(fileInName);
			FileOutputStream fileOut = new FileOutputStream(fileOutName);
			
			while (fileInput.available() > 0) {
				fileOut.write(fileInput.read() - 13);
			}
			fileInput.close();
			fileOut.close();
		}
	}
	
}
