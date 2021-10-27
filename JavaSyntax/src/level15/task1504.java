package level15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class task1504 {
	
	public static void main(String[] args)
			throws Exception {
		try (Scanner scanner = new Scanner(System.in); InputStream fileInputStream = Files.newInputStream(
				Paths.get(scanner.nextLine())); OutputStream fileOutputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))){
			byte[] byteInput = fileInputStream.readAllBytes();
			byte[] byteOutput = new byte[byteInput.length];
			for (int i = 0; i < byteInput.length; i += 2) {
				if (i < byteInput.length - 1) {
					byteOutput[i] = byteInput[i + 1];
					byteOutput[i + 1] = byteInput[i];
				}
				else {
					byteOutput[i] = byteInput[i];
				}
				fileOutputStream.write(byteOutput);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
