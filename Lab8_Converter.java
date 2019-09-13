/** MODEL
 * This class holds all words in the English-Spanish dictionary.
 * Includes Method to perform the translation
 */

import java.util.*;
import java.io.*;

public class Converter {
	private Entry [ ] dictionary;

	/**
	 * Converter loads the English-Spanish dictionary
	 *
	 */
	public Converter(String filename) throws IOException {
		try
		{
			
// Initially, hardcode the file name for testing
// Once program is working, get the name of the input file 
// as a command-line argument (should be in args[0])		
			Scanner inFile = new Scanner(new File(filename));

// Declare dictionary to be size read-in from the file
            int size = Integer.parseInt(inFile.nextLine());
            dictionary = new Entry[size];
// Loop through a lines in the file 		
			for (int i = 0; i < dictionary.length; i++) {
				String line = inFile.nextLine();
			
			//break line into the English section and the Spanish section
			//the two pieces are separated by a "\t" character
			// -- use split or StringTokenizer
                String partsOfText[] = line.split("\t");
                String e = partsOfText[0];
                String s = partsOfText[1];

			
			//create a new Entry object with the English and Spanish parts,
			//and store it at spot i in the dictionary array
                dictionary[i] = new Entry(e, s);


			} // end for

		  inFile.close();
		} // end try  
		catch (IOException e)
		{	System.out.println("Error in reading file.");
			System.exit(1);
		} // end catch
   
	} // end Converter 

	/**
	 * translate returns the Spanish translation
	 * of english
	 *
	 * @param english The english word to translate
	 * @return The spanish translation, or a message that it couldn't be found
	 */
	public String translate(String english) {
        String input = "Good-bye! Thanks for using the translator)";
        String notInDict = "Word not in dictionary";
        String output = "";
// STUDENTS DO THIS
    // Use a loop to cheCk if the English word is in the dictionary
    // If it is, return the Spanish Equivalent
    // If not, return message "Word not in dictionary"
    // If user just hits 'enter' for English word, return message
	//	"Good-bye! Thanks for using the translator"           
    for (int j = 0; j < dictionary.length; j++) {
        
        if (dictionary[j].getEnglish().equals(english)) {
            output = dictionary[j].getSpanish();
            break;
        }
        if (english.equals("")) {
            output = input;
            break;
        }
        else {
            output = notInDict;
        }
    }
    return output;
	} // end translate
} // end Converter class