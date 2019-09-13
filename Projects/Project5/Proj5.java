/* 
* Proj5.java
* <Maria Traskowsky / Lab Section A / 2:30-4:20>
*
* This program reads in a filename from the user, which has to be a valid test file. If the test file entered by the user
* is not a valid file name, the program will loop until a valid file is entered. 
*
* The program evaluates all lines in the test file to determine if they are palindromes. The result of the palindrome
* check are displayed, and the lines which ARE palindromes are written to a new txt file called "Results.txt".
* 
* Stats for each test file are also written to the file named "Results.txt".
*
* The program creates a new test file, determines which lines are palindromes, displays the results, and writes the 
* palindromes to the "Results.txt" file. 
*
* The program also displays the original line from the file, and what the reverse of that line is. 
* 
*/

import java.util.*;
import javafx.scene.shape.Line;
import java.io.*;
import java.io.File;

public class Proj5 {
    public static void main(String[] args) throws IOException {


    String filename = getFileInfo();

    String[] arrayOfStrings = readFile(filename);

    displayResults(arrayOfStrings);

    saveLine(arrayOfStrings);

    saveResults(arrayOfStrings);

    newTestFile();

    reverseString(arrayOfStrings);
    } // end main



    // ----------------------- getFileInfo ------------------
    /** Method 1: getFileInfo
    * Description: getFileInfo reads in name of file and validates file existence (otherwise loops until valid) *
    * @return filename is the name of the file that the user inputs */

    public static String getFileInfo() throws IOException {
        //user enters filename
        int i = 0;
        String filename = "b";
        
    while (i == 0) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the name of the file: ");
        filename = s.nextLine();
        
        File f = new File(filename);
        
        if (f.exists() == true) {
            System.out.println();
            System.out.println(filename + " is a valid file.");
            i = 1;
        } 
        else if (f.exists() == false) {
            System.out.println();
            System.out.println(filename + " is NOT a valid file. Please try another file name.");
        }
    } // end while
        return filename;
    } // end getFileInfo method



    // ----------------------- readFile  ------------------
    /** Method 2: readFile
    * Description: reads in info from file into an array of strings *
    * @param filename: this is the name of the file that was the return value from the getFileInfo() method
    * @return arrayOfStrings is the array filled with each line of the test file */

    public static String[] readFile(String filename) throws IOException {
        int i = 0;
        String arrayOfStrings [] = new String[50];
        Scanner inFile = new Scanner(new File(filename));
        while (inFile.hasNext()) {
                String line = inFile.nextLine();
                //System.out.println(line);
                arrayOfStrings[i] = line;
                i++;
        } // end while
        return arrayOfStrings;
    } // end readFile method


    
    // ----------------------- isPalindrome ------------------
    /** Method 3: isPalindrome
    * Description: Boolean method which returns true if a passed in String is a palindrome, else returns false. *
    * @param line is the value for each string in the array created by the readFile method
    * @return isPalindrome is true for palindromes, and false for non-palindromes */

    public static Boolean isPalindrome(String line) {
        Boolean isPalindrome = true;
        //      System.out.println(arrayOfStrings[i]);
        String original = line;

        // removes spaces from each line of array
        String originalWithoutSpaces = line.replaceAll("\\s+", "");
        //      System.out.println(originalWithoutSpaces);

        // removes all other chars from each line of array
        String originalWithoutChars = originalWithoutSpaces.replaceAll("[^a-zA-Z]", "");
        //      System.out.println(originalWithoutChars);

        // converts each line to lowercase
        String allLowerCaseNoCharsNoSpaces = originalWithoutChars.toLowerCase();
        //System.out.println(allLowerCaseNoCharsNoSpaces);

        int lengthOfString = allLowerCaseNoCharsNoSpaces.length();
        //System.out.println(allLowerCaseNoCharsNoSpaces.charAt(i));

        int palindrome = 0;
        for (int m = 0; m < (lengthOfString / 2); m++) {
            if (allLowerCaseNoCharsNoSpaces.charAt(m) == allLowerCaseNoCharsNoSpaces.charAt(lengthOfString - 1 - m)) {
                palindrome = 1;       
            }
            else {
                palindrome = 0;
                break;
            } 
        
        } // end for 

        if (palindrome > 0) {
            System.out.println();
            isPalindrome = true;
        } // end if 
        else if (palindrome == 0) {
            System.out.println();
            isPalindrome = false;
        } // end else if 

    return isPalindrome;
} // end isPalindrome method



    // ----------------------- displaysResults ------------------
    /** Method 4: displayResults
    * Description: Displays whether a palindrome "IS a palindrome" or "is NOT a palindrome" *
    * @param arrayOfStrings is the array filled with each line of the test file, created by the readFile method
    * @return nothing is being returned in this method */

    public static void displayResults(String[] arrayOfStrings) {
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i] == null) {
                continue;
            } // end if
            if (isPalindrome(arrayOfStrings[i])) {
                System.out.println(arrayOfStrings[i] + " IS a palindrome.");
            }
            else {
            System.out.println(arrayOfStrings[i] + " is NOT a palindrome.");

            }
        } // end for
    } // end displayResults

    
     
    // ----------------------- saveLine ------------------
    /** Method 5: saveLine 
    * Description: creates and writes individual strings to the Results.txt file IF they are found to be valid palindromes *
    * @param arrayOfStrings is the array filled with each line of the test file, created by the readFile method
    * @return nothing is being returned in this method */

    public static void saveLine(String[] arrayOfStrings) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("Results.txt"));

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i] == null) {
                continue;
            }
            if (isPalindrome(arrayOfStrings[i])) {
                // if it is a palidrome, write to file
                pw.println(arrayOfStrings[i]);
            } // end if 
        } // end for
        pw.close(); // closes file

    } // end saveLine method



    // ----------------------- saveResults ------------------
    /** Method 6: saveResults
    * Description: writes final summary stats (3 lines) to the Results.txt file *
    * @param arrayOfStrings is the array filled with each line of the test file, created by the readFile method
    * @return nothing is being returned in this method */

    public static void saveResults (String[] arrayOfStrings) throws IOException {
        // writing to the file created in saveLine method. "true" here means to append to an existing file
        PrintWriter pw = new PrintWriter(new FileWriter("Results.txt", true));
        pw.println();
        int totalCharsInputFile = 0;
        int lineCount = 0;
        int wordCountPerLine = 0;
        int totalWordsInputFile = 0;
        int averageWordsPerLine = 0;

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i] == null) {
                continue;
            }
            String line = arrayOfStrings[i];
            if (line == null) {
                wordCountPerLine = 0;
            }
            else {
                String [] wordsInEachLine = line.split("\\s+");
                wordCountPerLine = wordsInEachLine.length;
            }

            int numCharsEachLine = line.length();
            totalCharsInputFile += numCharsEachLine;

            lineCount += 1;

            totalWordsInputFile += wordCountPerLine;
            averageWordsPerLine = totalWordsInputFile / lineCount;
        
        } // end for 

        // prints values to "Results.txt"
            pw.println();
            pw.println("Input file contained a total of " + totalCharsInputFile + " characters.");
            pw.println("Input file contained a total of " + lineCount + " lines.");
            pw.println("Input file contained an average of " + averageWordsPerLine + " word(s) per line.");
            pw.close();

    } // end saveResults method



    // ----------------------- newTestFile ------------------
    /** Method 7: newTestFile
    * Description: creates new testfile with longer palindromes to further test the program *
    * @return nothing is being returned in this method */

    public static void newTestFile() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("Testfile3.txt"));
        // longer examples of palindromes written to a new test file
        pw.println("Eva, Can I stab Bats In A Cave?");
        pw.println("Mr. Owl Ate My Metal Worm.");
        pw.println("Red rum, sir, is murder!");
        pw.println("This is a long sentence, but it is not a palindrome.");
        pw.println("Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era.");
        pw.println("Yo, banana boy!");
        pw.println("supercalifragilisticexpialidocious.");

        pw.close();

    } // end newTestFile method



    // ----------------------- reverseString ------------------
    /** Method 8: reverseString
    * Description: displays the original line from the test file, and what the reverse of that is *
    * @param arrayOfStrings is the array filled with each line of the test file, created by the readFile method
    * @return nothing is being returned in this method */

    public static void reverseString(String[] arrayOfStrings) {
        for (int i = 0; i < arrayOfStrings.length; i++) { 
            if (arrayOfStrings[i] == null) {
                continue;
            } // end if
            String line = arrayOfStrings[i];
            String stringReversed = "";

            for (int j = line.length() - 1; j >= 0; j--) {
                stringReversed += line.charAt(j);
            } // end for 

            System.out.println("The original line from the test file is " + line + " and the reverse of that is " + stringReversed);
            System.out.println();
        } // end for loop
    } // end reverseString method
} // end class 
