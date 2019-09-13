/**
* MortgageApp.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* OPTIONAL EXTRA CREDIT INCLUDED
*
* <This class prompts the user to select different options for choosing mortgages. It offers
a promotional loan option, which comes with preset amounts for interest rate, number of years, 
and amount of the loan. The user can also choose to enter their own values, as a "unique loan"
and this class will make calls to the Mortgage class in order to determine payment amounts.
This class stores up to 10 mortgages in an array, and will allow the user to select a third
option (quit the program), which will then display all of the mortgages that were stored
in the program.> */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;

public class MortgageApp {
    
public static void main (String[] args) {

    Mortgage [] mortgage = new Mortgage[10];

    Scanner s = new Scanner (System.in);

    // for loop to run entire program
    for (int i = 0; i < 10; i++) {

        mortgage[i] = new Mortgage();

        System.out.println();
        System.out.println("Please choose from the following choices below:");
        System.out.println("\t1) Promotional Loan (preset loan amount, rate, term)");
        System.out.println("\t2) Unique Loan (enter in loan values)");
        System.out.println("\t3) Quit (Exit the program)");
        System.out.println();
        System.out.print("\tPlease enter your selection (1-3): ");

        // menuChoice loops until valid
        int menuChoice = Integer.parseInt(s.nextLine());
        boolean askAgain = !(menuChoice > 0 && menuChoice < 4);

        while (askAgain) {
            System.out.print("\t\tInvalid Choice. Please select 1, 2, or 3: ");
            menuChoice = Integer.parseInt(s.nextLine());
            askAgain = !(menuChoice > 0 && menuChoice < 4);
        } // end while

        switch (menuChoice) {
            case 1:
                // promotional loan
                mortgage[i] = new Mortgage(3.2, 20, 250000.0);

                // asks for customers last name
                System.out.println();
                System.out.print("Enter customer's Last Name Only: ");
                String storelastName = s.nextLine();
                mortgage[i].storeLastName(storelastName);

                System.out.println();
                System.out.println("PROMOTIONAL LOAN: " + mortgage[i].toString());
                break;
    
            case 2:
                // unique loan
                System.out.println();
                System.out.print("Enter customer's Last Name Only: ");
                storelastName = s.nextLine();
                System.out.println();

                mortgage[i].storeLoanAmount();
                double initialLoanAmout = mortgage[i].getLoanAmount();

                mortgage[i].storeInterestRate();
                double initialIntRate = mortgage[i].getIntRate();
                System.out.println();

                mortgage[i].storeTerm();
                int initialYears = mortgage[i].getYearsOfLoan();
                System.out.println();

                mortgage[i] = new Mortgage(initialIntRate, initialYears, initialLoanAmout);
                mortgage[i].storeLastName(storelastName);
                System.out.println();

                System.out.println("UNIQUE LOAN: " + mortgage[i].toString());
                break;

            case 3:
                System.out.println();
                System.out.println("PROGRAM COMPLETE");
                System.out.println("Contents of Array: ");
                for (int j = 0; j < i; j++) {
                        System.out.println(mortgage[j].toString());
                } // end for loop
                i = 11;
            default:
                break;
                
        } // end switch
    } // end for loop
} // end main
} // end MortgageApp class