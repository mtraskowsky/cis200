/*
* Lab3.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program takes exam scores from the user and calculates and displaysthe number of scores entered,
* the highest and lowest scores, and the average. This program does this for each section that the user inputs. 
*/

import java.util.*;

public class Lab3 {

	public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       char keepGoing = 'y';
       double sum = 0;
       double num = 1;
       int count = 0;
       double max = 0;
       double min = 100;
       double classAverage = 0;
       char sectionLetter;

while (keepGoing == 'y') {

    System.out.print("Please enter your section letter: ");
    sectionLetter = scan.nextLine().charAt(0);

        sum = 0;
        num = 1;
        count = 0;
        max = 0;
        min = 100;
        classAverage = 0;
        
       while (num >= 0 && num <101) {
         System.out.print("Enter in exam scores between 0 and 100 (Enter neg # to stop): ");
         num = Double.parseDouble(scan.nextLine());
         if (num >= 0) {
         sum += num; }
         // to find number of scores entered
         if (num >= 0)  {
         count++; }
         // to find highest score
         if (num > max) {
           max = num; }
        // to find lowest score
         if (num < min && num >= 0) {
          min = num; }

        classAverage = sum / count;

       } 
       System.out.println();
       System.out.println("Section letter: " + sectionLetter);
       System.out.println();
       System.out.println("The number of scores entered for section " + sectionLetter + ": " + count);
       System.out.println("The highest score for section "  + sectionLetter + ": " + max);
       System.out.println("The lowest score for section "  + sectionLetter + ": "  + min);
       System.out.printf("The class average is: %.2f", classAverage);

       System.out.println();

        System.out.print("\nContinue? (y/n): ");
          keepGoing = scan.nextLine().charAt(0);
          num = 0;

      }






  } // end main
} // end class
