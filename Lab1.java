/* 
Lab1.java
<Maria Traskowsky / Lab Section A / 2:30-4:20>

This program calculates and displays a purchase order amount.
*/

import java.util.Scanner;	// Add import line here to use the Scanner class.

public class Lab1 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);	// Declare a Scanner object here to be used for input
		
		String input;	// read in user input as a string
		double price;	// price of purchase item
		int qty;		// number of items purchased
		double tax;		// tax rate
		double taxTotal;// tax rate plus total purchase amount
		
		System.out.print("Price of purchase item: ");	// user prompt
		input = s.nextLine();	// read input here as a string
		
		price = Double.parseDouble(input);	// convert string to double and store in price variable
		
		System.out.print("Quantity: ");					// user prompt
		input = s.nextLine();	// read input here as a string
		
		qty = Integer.parseInt(input);	// convert string to integer and store in qty variable
		
		System.out.print("Please enter a tax rate as a decimal value: ");	// user prompt
		input = s.nextLine();	// read input here as a string
		
		tax = Double.parseDouble(input);	// convert string to double and store in tax variable
		
		// displays the final amount
		System.out.println("Total purchase order = $" + price * qty);
		
		// display the final amount w/2 decimals using printf
		System.out.printf("Total purchase order = $%.2f\n", price * qty);
		
		// display the final amount w.2 decimals using String.format
		String output = String.format("Total purchase order = $%.2f\n", price * qty);
		System.out.printf(output);
		
		// calculates total tax for the item purchases
		taxTotal = (price * qty) * tax; 

		// display tax amount 
		System.out.printf("Tax amount = $%.2f\n", taxTotal);
		
		// display the final amount with tax included
		System.out.printf("Total purchase order with tax = $%.2f\n", (price * qty) + taxTotal); 
		
		
	} // end main	
} // end class Lab1