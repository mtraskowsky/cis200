/* 
* Proj1.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>

* This program calculates and displays a user's overall grade percentage in a class based on 3 project scores, a midterm exam, and a final exam.
* This program also calculates and displays the number of pizzas that need to be ordered for a Computer Science Gaming Club party.
* The number of leftover pizza slices will also be displayed.
*/

import java.util.Scanner;	// Add import line here to use the Scanner class.

public class Proj1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner (System.in);	// Declare a Scanner object here to be used for input

        String input;
        double projScore1;                  // score for Project 1
        double projScore2;                  // score for Project 2
        double projScore3;                  // score for Project 3
        double midtermExam;                 // score for Midterm Exam
        double finalExam;                   // score for Final Exam
        double overallGrade;                // Overall grade 
        final double TOTAL_POINTS = 290;    // sets constant for total points available

        final int NUM_SLICES_XL_PIE = 20;           // sets constant for number of slices in XL pizza
        final int NUM_SLICES_PER_PERSON = 2;        // sets constant for number of slices per person
        double numPeople;                           // number of people at the CS Gaming Club meeting
        double numSlicesNeeded;                     // number of slices needed to feed everyone 2 slices at the meeting
        int numPizzasNeeded = 0;                    // number of pizzas needed to feed everyone 2 slices at the meeting
        double leftOverSlices = 0;                  // number of slices leftover after everyone eats 2 slices

        System.out.print("Enter in Project score #1 (0-30): ");     // user prompt
        input = s.nextLine();                                       // reads the input as a string

        projScore1 = Double.parseDouble(input);                     // converts string to double and stores in projScore1 variable
        
        System.out.print("Enter in Project score #2 (0-30): ");     // user prompt
        input = s.nextLine();                                       // reads the input as a string

        projScore2 = Double.parseDouble(input);                     // converts string to double and stores in projScore2 variable

        System.out.print("Enter in Project score #3 (0-30): ");     // user prompt
        input = s.nextLine();                                       // reads the input as a string

        projScore3 = Double.parseDouble(input);                     // converts string to double and stores in projScore3 variable

        System.out.print("\n" + "Enter the midterm exam score (0-100): ");  // user prompt
        input = s.nextLine();                                       // reads the input as a string

        midtermExam = Double.parseDouble(input);                    // converts string to double and stores in midtermExam variable

        System.out.print("Enter the final exam score (0-100): ");   // user prompt
        input = s.nextLine();                                       // reads the input as a string

        finalExam = Double.parseDouble(input);                      // converts string to double and stores in finalExam variable

        // calculates the final overall grade percentage out of total points available
        overallGrade = ((projScore1 + projScore2 + projScore3 + midtermExam + finalExam) / TOTAL_POINTS) * 100;

        System.out.printf("Overall grade percentage: %.2f%%\n", overallGrade);    // displays overall grade percentage

        System.out.println(" ");                                    // prints new line

/* 
* This is where the program will calculate and display the number of pizzas that need to be ordered 
* for a Computer Science Gaming Club party. Leftover pizza slices will also be calculated and shown. 
*/
        System.out.print("What is the number of people expected at the party? ");   // user prompt
        input = s.nextLine();                                       // reads the input as a string

        numPeople = Integer.parseInt(input);                        // converts string to integer and stores in numPeople variable

        // calculates number of pizzas needed based on number of people attending
        if (2 * numPeople > 20) {                                  
            numPizzasNeeded = 2;
        }

        if (2 * numPeople <= 20) {
            numPizzasNeeded = 1;
        }

        numSlicesNeeded = (2 * numPeople) / 20.0;
        if (numSlicesNeeded > 1) {
             numPizzasNeeded = 2;
        }

        // calculates number of slices that will be leftover after everyone eats 2 slices of pizza
        if (numPizzasNeeded == 2) {
            leftOverSlices = 40 - (2 * numPeople);
        }

        if (numPizzasNeeded == 1) {
            leftOverSlices = 20 - (2 * numPeople);
        }

        System.out.println(" ");                                    // prints new line

        String people = String.format("%.0f", numPeople);           // allows numPeople to be displayed without decimal values

        // displays the number of pizzas needed
        System.out.println("For " + people + " people, that would be " + numPizzasNeeded + " pizza(s) with each having 2 slices each.");

        String slices = String.format("%.0f", leftOverSlices);      // allows leftOverSlices to be displayed without decimal values

        // displays the number of leftover slices of pizza
        System.out.println("There would be " + slices + " slice(s) leftover");
        
    } // end main

} // end class Proj1
