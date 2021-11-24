package level08.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public static class Product {
		
		private int id;
		private String productName;
		private String price;
		private String quantity;
		
		public Product(int id, String productName, String price, String quantity) {
			this.id = id;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}
		
		@Override
		public String toString() {
			return String.format("%-8d%-30s%-8s%-4s ", id, productName, price, quantity);
		}
		
	}
	
	public static Product getProduct(String string) {
		String id = string.substring(0, 8).trim();
		String productName = string.substring(8, 38).trim();
		String price = string.substring(38, 46).trim();
		String quantity = string.substring(46, 50).trim();
		return new Product(Integer.parseInt(id), productName, price, quantity);
	}
	
	public static void main(String[] args)
			throws IOException {
		if (args.length <= 0) {
			return;
		}
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		
		ArrayList<Product> products = new ArrayList<>();
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
			while (fileReader.ready()) {
				Product product = getProduct(fileReader.readLine());
				products.add(product);
			}
		}
		
		if ("-c".equals(args[0])) {
			int id = 0;
			for (Product product : products) {
				if (product.id > id) {
					id = product.id;
				}
			}
			String name = args[1];
			if (name.length() > 30) {
				name = name.substring(0, 30);
			}
			String price = args[2];
			if (price.length() > 8) {
				price = price.substring(0, 8);
			}
			String quantity = args[3];
			if (quantity.length() > 4) {
				quantity = quantity.substring(0, 4);
			}
			Product product = new Product(++id, name, price, quantity);
			try (FileWriter fileWriter = new FileWriter(fileName, true)) {
				fileWriter.write("\n");
				fileWriter.write(product.toString());
			}
		}
	}
	
}
