/* 
* Lab2.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program calculates overall GPA earned when taking 3 classes in a semester. 
*
*/

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		String class1CreditHours;   // declares string for the number of credit hours in Class 1
		String class2CreditHours;   // declares string for the number of credit hours in Class 2
		String class3CreditHours;   // declares string for the number of credit hours in Class 3

		double overallGPA;          // declares double for GPA since GPA is a decimal value
		int hours1;                 // expresses credit hours as an integer value
		int hours2;                 // expresses credit hours as an integer value
		int hours3;                 // expresses credit hours as an integer value

		double totalCreditHours;    // total credit hours taken by the user
		char gradeReceived;         // grade received by the user
		final int A = 4;            // an A grade is worth 4 points, constant
		final int B = 3;            // a B grade is worth 3 points, constant
        final int C = 2;            // a C grade is worth 2 points, constant
        final int D = 1;            // a D grade is worth 1 point, constant
		final int F = 0;            // an F grade is worth 0 points, constant
		
		int letterPoints1 = 0;      // gpa points for class1
		int letterPoints2 = 0;      // gpa points for class2
		int letterPoints3 = 0;      // gpa points for class3

		
		// for class1, asks credit hours worth and grade received
		System.out.print("Class 1 was worth how many credit hours?: ");
		class1CreditHours = s.nextLine(); // reads user input 
		hours1 = Integer.parseInt(class1CreditHours);
        
        // asks the user what grade was receieved for class 1
		System.out.print("Grade received in Class 1?: ");
		gradeReceived = s.nextLine().charAt(0); // reads user input
		
		if (gradeReceived == 'A') {
			letterPoints1 = 4;
		}
		else if (gradeReceived == 'a') {
			letterPoints1 = 4;
		}
		else if (gradeReceived == 'B') {
			letterPoints1 = 3;
		}
		else if (gradeReceived == 'b') {
			letterPoints1 = 3;
		}
		else if (gradeReceived == 'C') {
			letterPoints1 = 2;
		}
		else if (gradeReceived == 'c') {
			letterPoints1 = 2;
		}
		else if (gradeReceived == 'D') {
			letterPoints1 = 1;
		}
		else if (gradeReceived == 'd') {
			letterPoints1 = 1;
		}
		else if (gradeReceived == 'F') {
			letterPoints1 = 0;
		}
		else if (gradeReceived == 'f') {
			letterPoints1 = 0;
		}
		else { // if non of the accepted values (A, B, C, D, or, F) prints Invalid Grade

			System.out.println("Invalid Grade");
			System.exit(0);
		}
		
		// for class2, asks credit hours worth and grade received
		System.out.print("Class 2 was worth how many credit hours?: ");
		class2CreditHours = s.nextLine(); // reads user input 
		hours2 = Integer.parseInt(class2CreditHours);
                
        // asks the user what grade was receieved for class 2
		System.out.print("Grade received in Class 2?: ");
		gradeReceived = s.nextLine().charAt(0); // reads user input
				
		if (gradeReceived == 'A') {
			letterPoints2 = 4;
		}
		else if (gradeReceived == 'a') {
			letterPoints2 = 4;
		}
		else if (gradeReceived == 'B') {
			letterPoints2 = 3;
		}
		else if (gradeReceived == 'b') {				
			letterPoints2 = 3;
		}
		else if (gradeReceived == 'C') {
			letterPoints2 = 2;
		}
		else if (gradeReceived == 'c') {
			letterPoints2 = 2;
		}
		else if (gradeReceived == 'D') {
			letterPoints2 = 1;
		}
		else if (gradeReceived == 'd') {
			letterPoints2 = 1;
		}
		else if (gradeReceived == 'F') {
			letterPoints2 = 0;
		}
		else if (gradeReceived == 'f') {
			letterPoints2 = 0;
		}		
		else { // if non of the accepted values (A, B, C, D, or, F) prints Invalid Grade
			System.out.println("Invalid Grade");
			System.exit(0);
		}
		
        // for class3, asks credit hours worth and grade received
		System.out.print("Class 3 was worth how many credit hours?: ");
		class3CreditHours = s.nextLine(); // reads user input 
		hours3 = Integer.parseInt(class3CreditHours);
        
        // asks the user what grade was receieved for class 3
		System.out.print("Grade received in Class 3?: ");
		gradeReceived = s.nextLine().charAt(0); // reads user input
				
		if (gradeReceived == 'A') {
			letterPoints3 = 4;
		}
		else if (gradeReceived == 'a') {
			letterPoints3 = 4;
		}
		else if (gradeReceived == 'B') {
			letterPoints3 = 3;
		}
		else if (gradeReceived == 'b') {
			letterPoints3 = 3;
		}
		else if (gradeReceived == 'C') {
			letterPoints3 = 2;
		}
		else if (gradeReceived == 'c') {
			letterPoints3 = 2;
		}
		else if (gradeReceived == 'D') {
			letterPoints3 = 1;
		}
		else if (gradeReceived == 'd') {
			letterPoints3 = 1;
		}
		else if (gradeReceived == 'F') {
			letterPoints3 = 0;
		}
		else if (gradeReceived == 'f') {
			letterPoints3 = 0;
		}
		else { // if non of the accepted values (A, B, C, D, or, F) prints Invalid Grade
			System.out.println("Invalid Grade");
			System.exit(0);
		}
		// calculate GPA
		overallGPA = (hours1 * letterPoints1) + (hours2 * letterPoints2) + (hours3 * letterPoints3);
		
		// calculates total credit hours 
		totalCreditHours = (hours1 + hours2 + hours3);
		
		// prints overall GPA
		System.out.printf("Overall GPA earned is: %.2f", overallGPA / totalCreditHours);
		
	} // end main

} // end class
