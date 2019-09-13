/**
* Mortgage.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* OPTIONAL EXTRA CREDIT INCLUDED
*
* <This class creates mortgage objects, stores values for interest rate, years, and amounts
of loans, and calculates monthly payments and total payments for mortgages. This class also
creates a personal account number for each mortgage, and displays the account number along
with the monthly and total payments.> */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math; 

public class Mortgage {
    private double intRate;
    private int yearsOfLoan;
    private double loanAmount;
    private String accountNum;
    private String lastName;
    private double monthPayment;
    private double totalPayment;

    private Scanner s = new Scanner(System.in);

// ----------------- MORTGAGE CONSTRUCTORS -----------------------
    /** Mortgage
    * a no argument constuctor which sets values to -1 *
    */
    public Mortgage() {
        intRate = -1;
        yearsOfLoan = -1;
        loanAmount = -1;
    } // end Mortgage()

    /** Mortgage
    * Mortgage is a multi-argument constrcutor whichsets the values for 
    * interest rate, years, and principal amount of a mortgage object *
    * @param rate interest rate
    * @param years years of loan
    * @param principal amount of loan
    */ 
    public Mortgage(double rate, int years, double principal) {
        intRate = rate;
        yearsOfLoan = years;
        loanAmount = principal;
    } // end Mortgage()


// ----------------- AMOUNT OF LOAN -----------------------
    /** storeLoanAmount
    * Read-in from user, validate, and store the amount of the loan *
    */
    public void storeLoanAmount() {
        int i = 0;
        System.out.print("Enter the amount of the loan (Ex:75000): ");
        while (i == 0) {
            //loanAmount = Double.parseDouble(s.nextLine()); // non Extra credit code
            String newloanAmount1 = s.nextLine(); // Extra credit
            String newloanAmount2 = newloanAmount1.replaceAll("[^-?0-9]+", ""); // Extra credit
            loanAmount = Double.parseDouble(newloanAmount2); // Extra credit
            if (loanAmount <= 74999 || loanAmount >= 1000001) {
                System.out.println("\tValid Loan Amounts are $75000-$1000000");
                System.out.print("\tPlease re-enter loan amount: ");
                i = 0; 
            } // end if 
            else {
                i = 1;
            } // end else
        } // end while
    } // end storeLoanAmount()   
    
    /**  getLoanAmount
    * returns amount of loan *
    * @return amount of the loan 
    */
    public double getLoanAmount() {
        return loanAmount;
    } // end getLoanAmount()


// ----------------- LENGTH OF LOAN -----------------------
    /** storeTerm
    * Read-in from user, validate, and store the term of the loan *
    */
    public void storeTerm() {
        int i = 0;
        System.out.print("Enter number of years for the loan: ");
        while (i == 0) {
            //yearsOfLoan = Integer.parseInt(s.nextLine()); // non Extra credit code

            String newloanTerm1 = s.nextLine(); // Extra credit
            String newloanTerm2 = newloanTerm1.replaceAll("[^-?0-9]+", ""); // Extra credit
            yearsOfLoan = Integer.parseInt(newloanTerm2); // Extra credit

            if (yearsOfLoan <= 9 || yearsOfLoan >= 41) {
                System.out.println("\tValid Loan Terms are 10-40");
                System.out.print("\tPlease re-enter valid number of years: ");
                i = 0;
            } // end if
            else {
                i = 1;
            } // end else
        } // end while
    } // end storeTerm()

    /** getYearsOfLoan
    * returns years of loan *
    * @return years of the loan 
    */
    public int getYearsOfLoan() {
        return yearsOfLoan;
    } // end getYearsOfLoan()


// -----------------INTEREST RATE-----------------------
    /** storeInterestRate
    * Read-in from user, validate, and store the yearly interest rate of the loan *
    */
    public void storeInterestRate(){
        int i = 0;
        System.out.print("Enter yearly interest rate (Ex: 8.25): ");
        while (i == 0) {
            //intRate = Double.parseDouble(s.nextLine());
            String newIntRate1 = s.nextLine(); // Extra credit
            String newIntRate2 = newIntRate1.replaceAll("[^0-9.]+", ""); // Extra credit
            intRate = Double.parseDouble(newIntRate2); // Extra credit
            if (intRate < 2.0 || intRate > 7.0) {
                System.out.println("\tValid Interest Rates are 2% - 7%");
                System.out.print("\tPlease re-enter valid yearly interest rate (Ex: 8.25): ");
                i = 0;
            } // end if
            else {
                i = 1;
            } // end else
        } // end while
    } // end storeInterestRate

    /** getIntRate
    * returns interest rate of loan *
    * @return interest rate of the loan 
    */
    public double getIntRate() {
        return intRate;
    } // end getIntRate()


// ----------------- MONTHLY PAYMENT -----------------------
    /** calcMonthlyPayment
    * Calculate and return the monthly payment for the loan *
    * @return monthly payment for a mortgage 
    */
    private double calcMonthlyPayment(){
        double inMethodIntRate = intRate / 100; // takes int rate from user input and divides by 100
        double monthlyIntRate = inMethodIntRate / 12; // takes the (UI int rate / 100) and divides it by 12, this equals monthly int rate
        double num1 = monthlyIntRate * (Math.pow((1 + monthlyIntRate), (yearsOfLoan * 12)));
        double num2 = Math.pow((1 + monthlyIntRate), (yearsOfLoan * 12)) - 1;
        double monthlyPayment = loanAmount * (num1 / num2);
        return monthlyPayment;
    } // end calcMonthlyPayment()


// ----------------- TOTAL PAYMENT -----------------------
    /** calcTotalPayment
    * Calculate and return the total payment for the loan *
    * @param monthlyPayment monthly payment for a mortgage
    * @return total payment for a mortgage 
    */
    private double calcTotalPayment(double monthlyPayment) {
        double totalPayment = monthPayment * yearsOfLoan * 12;
        return totalPayment;
    } // end calcTotalPayment()


// ----------------- DISPLAY -----------------------
    /** toString
    * Display formatted output *
    * @return string including values for account number, monthly payment, and total payment
    */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat ("$#,###,###.00");

        monthPayment = calcMonthlyPayment();
        sb.append("\nAccount number: " + accountNum);
        sb.append("\nThe monthly payment is: " + df.format (monthPayment));
        sb.append("\nThe total payment is: " + df.format (calcTotalPayment(monthPayment)));
        sb.append("\n");
    
        return sb.toString();
    } // end toString()


// ----------------- LAST NAME -----------------------
    /** storeLastName
    * Read-in from user and store the last name of the customer *
    * @param storelastName last name of the customer
    */
    public void storeLastName(String storelastName){
        lastName = storelastName;
        // get account num and store along with lastName
        accountNum = getAccountNum(randomNum(), lastName);
    } // end storeLastName()

    /** getLastName
    * returns last name of the customer *
    * @return last name of the customer
    */
    public String getLastName() {
        return lastName;
    } // end getLastName()

    
// ----------------- ACCOUNT NUMBER -----------------------
    /** randomNum
    * creates a random number between 100 and 10000 *
    * @return random number between 100 and 10000
    */
    public int randomNum() {
        int min = 101;
        int max = 10000;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum;
    } // end randomNum() 
    
    /** getAccountNum
    * creates an account number with first 4 characters of customer's last name and a random number*
    * @param randomNum random number
    * @param lastName last name of the customer
    * @return account number
    */
    public String getAccountNum(int randomNum, String lastName) { // use in toString
        accountNum = lastName.substring(0,4) + randomNum;
        return accountNum;
    } // end getAccountNum() 
} // end Mortgage class