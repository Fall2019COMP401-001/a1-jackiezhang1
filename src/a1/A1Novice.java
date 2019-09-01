package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		
		for (int a = 0; a < customers; a++) {
			String first = scan.next();
			String last = scan.next();
			
			int items = scan.nextInt();
			
			double total = 0;
			
			for (int b = 0; b < items; b++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				double cost = quantity * price;
				total = total + cost;
			}
			String total_string = String.format("%.2f", total);
			System.out.println(first.substring(0, 1) + ". " + last + ": " + total_string);
		}
			
	}
}

