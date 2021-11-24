package level08.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
			return String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
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
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
			while (fileReader.ready()) {
				Product product = getProduct(fileReader.readLine());
				products.add(product);
			}
		}
		if ("-d".equals(args[0])) {
			int id = Integer.parseInt(args[1]);
			products.removeIf(product -> product.id == id);
			try (FileWriter fileWriter = new FileWriter(fileName)) {
				fileWriter.flush();
				products.forEach(product -> {
					try {
						fileWriter.write(product.toString());
						fileWriter.write("\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}
		}
		else if ("-u".equals(args[0])) {
			int id = Integer.parseInt(args[1]);
			String name = args[2];
			if (name.length() > 30) {
				name = name.substring(0, 30);
			}
			String price = args[3];
			if (price.length() > 8) {
				price = price.substring(0, 8);
			}
			String quantity = args[4];
			if (quantity.length() > 4) {
				quantity = quantity.substring(0, 4);
			}
			for (Product p : products) {
				if (p.id == id) {
					p.productName = name;
					p.price = price;
					p.quantity = quantity;
				}
			}
			try (FileWriter fileWriter = new FileWriter(fileName)) {
				fileWriter.flush();
				products.forEach(product -> {
					try {
						fileWriter.write(product.toString());
						fileWriter.write("\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}
		}
	}
	
}
