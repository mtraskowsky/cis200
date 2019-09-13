/*
 * Lab6_Methods.java
 * Original Author: Dr. D. Lang
 * Modified by: (Maria Traskowsky)
 * Course: CIS 200
 * Lab Section: (Lab Section A / 2:30-4:20)

PURPOSE- This application will calculate the monthly and total payment on a loan,
given the interest rate, length, and amount of the loan.

Divide and Conquer using submodules!
    ...Divided into Input, Calculation, and Output submodules
*/

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class Lab6 {
 public static void main(String[ ] args) {

   double interestRate; 	// holds MONTHLY interest rate
   double loanAmount; 		// Amount of the Loan
   int years;         		// Length of the Loan
   double monthlyPayment; 	// Monthly Payment required

// -------------------- Get User-entered Input ------------------
   // call submodule defined below main
   interestRate = getInterest();
   loanAmount = getLoanAmount();
   years = getYears();

// ----------------------- Calculate the Payments ------------------
  // call method to calculate monthly payment, passing the loan amount,
  // interest rate, and how years of the loan as ARGUMENTS
  // Must pass in the correct order!
   monthlyPayment = calcMonthlyPayment(years, loanAmount, interestRate);

   // calculate the total amount to be paid on the loan
   double totalPaid = monthlyPayment * years * 12;

   // calculate the total interest to be paid on the loan
   double interestPaid = totalPaid - loanAmount;

// ----------------------- Display Results ------------------------------
   // call submodule defined below main ... pass needed info as ARGUMENTS
   displayOutput(monthlyPayment, totalPaid, interestPaid);

 } // end main method

// -------------------- Input Methods -----------------------------------

 // getInterest:Gets a YEARLY interest rate from the user,
 // converts and returns a monthly interest (double)
 public static double getInterest()
 {
    // Your code goes here ... use cut and paste as much as possible!
    int i = 0;
    double monthlyIntRate = 0;
while (i == 0) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter yearly interest rate (Ex 8.25): ");
    double yearlyIntRate = Double.parseDouble(s.nextLine());
    monthlyIntRate = yearlyIntRate / 12;

    if (yearlyIntRate < 3 || yearlyIntRate > 12) {
    i = 0;
    }
    else {
        i = 1;
    }
    }
    return monthlyIntRate;
 } // end getInterest()

 // getYears: Gets from the user and returns the term of the loan
 //       (number of years) as an int
 public static int getYears()
 {
 // Your code goes here ... use cut and paste as much as possible!
    int i = 0;
    int numYears = 0;
while (i == 0) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of years (as an integer): ");
    numYears = Integer.parseInt(s.nextLine());
    
    if (numYears < 1 || numYears > 50) {
        i = 0;
    }
    else {
        i = 1;
    }
    }
    return numYears;

 } // end getYears()

 // getLoanAmount:  Gets from the user and returns the loan amount (double)
 public static double getLoanAmount()
 {
 // Your code goes here ... use cut and paste as much as possible!
    int i = 0;
    double amount = 0;
while (i == 0) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter loan amount (Example 120000.95): ");
    amount = Double.parseDouble(s.nextLine());

    if (amount < 50000 || amount > 1000000) {
        i = 0;
    }
    else {
        i = 1;
    }
    }   
    return amount;


 } // end getLoanAmount

 // ----------------------- Calculate Monthly Payments ------------------
 // calcMonthlyPayment: Calculates and returns the monthly payment (double)
 // Requires passing in the loan amount, interest rate, and term of the loan
 // Reminder: parameter names do NOT need to match the argument names
 public static double calcMonthlyPayment(int term, double amount, double rate)
 {
 // Your code goes here ... use cut and paste as much as possible!
    rate = rate / 100;
    double num1 = rate * (Math.pow((1 + rate), (term * 12)));
    double num2 = Math.pow((1 + rate), (term * 12)) - 1;
    double monthlyPayment = amount * (num1 / num2);
    return monthlyPayment;
 } // end calcMonthlyPayment

 // ----------------------- Display Output ------------------------------
 // displayOutput: Displays the monthly payment, total interest paid and
 // the total amound paid on the loan. (Nothing is returned)
 // Requires passing in monthlyPayment, totalPaid, interestPaid
  public static void displayOutput(double monthlyPayment, double totalPaid, double interestPaid)
  {
 // Your code goes here ... use cut and paste as much as possible!
    DecimalFormat df = new DecimalFormat ("$#,###,###.00");

    System.out.println();
    System.out.println("The monthly payment is " + df.format (monthlyPayment));
    System.out.println("The total paid on the loan is " + df.format (totalPaid));
    System.out.println("The total interest paid on loan is " + df.format (interestPaid));

    
  } // end displayOutput

} // end class