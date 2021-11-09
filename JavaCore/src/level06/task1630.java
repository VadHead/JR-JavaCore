package level06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class task1630 {
	
	public static String firstFileName;
	public static String secondFileName;
	
	static {
		try (Scanner scanner = new Scanner(System.in)) {
			firstFileName = scanner.nextLine();
			secondFileName = scanner.nextLine();
		}
	}
	
	public static void main(String[] args)
			throws InterruptedException {
		systemOutPrintln(firstFileName);
		systemOutPrintln(secondFileName);
	}
	
	public static void systemOutPrintln(String fileName)
			throws InterruptedException {
		ReadFileInterface f = new ReadFileThread();
		f.setFileName(fileName);
		f.start();
		f.join();
		System.out.println(f.getFileContent());
	}
	
	public interface ReadFileInterface {
		
		void setFileName(String fullFileName);
		
		String getFileContent();
		
		void join()
				throws InterruptedException;
		
		void start();
		
	}
	
	public static class ReadFileThread extends Thread implements ReadFileInterface {
		
		private String fileContent = "";
		private String fullFileName;
		
		@Override
		public void run() {
			StringBuilder fileContent = new StringBuilder();
			List<String> fileLine;
			Path path = Paths.get(fullFileName);
			try {
				fileLine = Files.readAllLines(path);
				fileLine.forEach(l -> fileContent.append(l).append(" "));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.fileContent = fileContent.toString();
		}
		
		@Override
		public String getFileContent() {
			return fileContent;
		}
		
		@Override
		public void setFileName(String fullFileName) {
			this.fullFileName = fullFileName;
		}
		
	}
	
}
