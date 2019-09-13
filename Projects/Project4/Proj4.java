/* 
* Proj4.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program reads 1s and 0s from a txt file and stores them into a 2D array. Each row and each column should have an even number of 1s.
* If the 1s count is odd, this means the image has been modified. The program will find errors in the rows and columns and print the rows 
* and columns in which the errors are located. If there is one error, the program will modify the bit that had been changed, and change it
* back to the correct integer. If one error or no errors are found, the program asks the user for 2 characters to use in place of the 0s
* and 1s, and will print out the corrected image with the characters chosen by the user. The program also asks the user if they would lke 
* to process another file, and will continue to run the program until the user chooses not to continue. 
*
*/

import java.util.*;
import java.io.*;

public class Proj4 {
    public static void main(String[] args) throws IOException { 

        String str = "smiley.txt";
        String str2 = "smileyErrors.txt";
        String str3 = "flower.txt";
        String str4 = "flowerNoErrors.txt";
        
        int errorRow = 0;
        int errorColumn = 0;
        int runProgram = 1;
        
// while loop to run entire program
while (runProgram == 1) {

        // user enters file
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of input file: ");
        String filename = in.nextLine();

        Scanner inFile = new Scanner(new File(filename));
        String size = inFile.nextLine(); 

        String rowsInText = size.substring(0, 2);
        int rows = Integer.parseInt(rowsInText);

        String columnsInText = size.substring(3,5);
        int columns = Integer.parseInt(columnsInText);
        
        // creating 2D array
        int [] [] rowsAndColumnsOfTextFile = new int [rows] [columns];

        // read past blank line in the txt file
        inFile.nextLine();

// Fill 2D array
// outer loop - i - row by row
// inner loop - j - char by char within a row
for (int i = 0; i < rows; i++) { // iterates through array row by row
    String row = inFile.nextLine();
    for (int j = 0; j < columns; j++) { // iterates through array, going through every column in each row
        rowsAndColumnsOfTextFile[i][j] = Integer.parseInt(Character.toString(row.charAt(j))); // char by char within a row
    } 
}
// Count number of 1s in each ROW to find parity bit errors
for (int i = 0; i < rows; i++) { // i represents rows, so i = 0 means first row
    int onesCountRow = 0; // sets onesCountRow to zero
        for (int j = 0; j < columns; j++) { // j = each char in line i
            
                int c = rowsAndColumnsOfTextFile[i][j];

                if (c == 1) { // counts the number of ones in each row
                    onesCountRow += 1;
                }  
        } 
        if (onesCountRow % 2 == 0) { // if number of 1s in row is evenly divisible by 2, parity bit should be 0
        } 
        else { // if number of 1s in row is NOT evenly divisible by 2, parity bit should be 1
            System.out.println("Off at ROW " + i);
            errorRow = i;
        }        
}
// Count number of 1s in each COLUMN to find parity bit errors
int errorCounter = 0;
for (int j = 0; j < columns; j++) { // j represents columns, so j = 0 means first column
    int onesCountCol = 0; // sets onesCountCol to zero
        for (int i = 0; i < rows; i++) {

                int c = rowsAndColumnsOfTextFile[i][j];

                if (c == 1) { // counts number of ones in each column
                    onesCountCol += 1;
                }
        }
        if (onesCountCol % 2 == 0) { // if number of 1s in each column is evenly divisible by 2,
        }
        else {
                System.out.println("Off at COL " + j);
                errorColumn = j;
                errorCounter += 1;
        } 
}

    for (int numErrors = 0; numErrors < 10; numErrors++) {
        if (errorCounter == 0) {
            System.out.println("Image has no errors.");
            break;
        }
        else if (errorCounter == 1) {
            System.out.println("Position (" + errorRow + ", " + errorColumn + ") was modified...correcting");
            break;
        }
        else if (errorCounter >= 2) {
            System.out.println("Multiple errors were detected. Image may be damaged.");
            break;
        }
    }

// While loop to change the incorrect bit
            if (errorCounter == 1) {
                if (rowsAndColumnsOfTextFile [errorRow][errorColumn] == 1) {
                    rowsAndColumnsOfTextFile [errorRow][errorColumn] = 0;
                }
                else if (rowsAndColumnsOfTextFile [errorRow][errorColumn] == 0) {
                    rowsAndColumnsOfTextFile [errorRow][errorColumn] = 1;
                }
                else {
                }
            }          
// if one error or no errors are found, ask user what they want to substitute for white (the 1s) and black (the 0s)            
    if (errorCounter == 0 || errorCounter == 1) {    
    System.out.println();
    System.out.print("What character would you like to use for white? ");
    String white = in.nextLine();
    char whiteChar = white.charAt(0);

    System.out.print("What character would you like to use for black? ");
    String black = in.nextLine();
    char blackChar = black.charAt(0);

// replace 1s and 0s with the characters from user input, and print out without printing the parity bit
for (int i = 0; i < (rows - 1); i++) { // (rows - 1) will not include the parity bit row
        for (int j = 0; j < (columns - 1); j++) { // (columns - 1) will not include the partiy bit column
           if (rowsAndColumnsOfTextFile[i][j] == 1) {
               System.out.print(whiteChar);
           }
           if (rowsAndColumnsOfTextFile[i][j] == 0) {
                System.out.print(blackChar);
            }
        }
     System.out.println();
}

} // end while loop for whole program, ask user whether they want to run program again

    System.out.print("Process another file? (Yes/No): ");
    String runProgramAgain = in.nextLine();

        if (runProgramAgain.toLowerCase().contains("yes")) {
        runProgram = 1; // while loop for entire program runs while (runProgram = 1) is true
        }
        else {
        runProgram = 0; // while loop for entire prgoram will not run when (runProgram = 0)
        }
    }
    } // end main
} // end class
