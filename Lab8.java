/** CONTROLLER
 * This program is an English-Spanish translator.
 *
 * @author <Your Name>
 * @version Lab 8
 */
import java.util.*;
import java.io.*;

public class Lab8 {
	/**
	 * main handles the control flow for the program
	 *
	 * @param args Should hold the dictionary filename
	 */
	public static void main(String[] args) throws IOException {
        String nameOfFile = "";
        nameOfFile = args[0];

//Part 1 - create an IO object
    IO io = new IO();

//For Part 2 - comment out above and create an IO_GUI object
    //IO_GUI io = new IO_GUI();

//Create a Converter object 
    Converter converter = new Converter(nameOfFile);
	//while the user doesn't just press Enter
		String englishWord;
		do
		{

		//get an English word from the user (call the getWord method in IO)
        englishWord = io.getWord();
		
		//get the Spanish translation for the word (call the translate method in Converter)
            String spanishWord = converter.translate(englishWord);
		
		//print the translation (call the printTranslation method in IO)
            io.printTranslation(englishWord, spanishWord);
		
		}while(englishWord.length() != 0);
	} // end main
} // end class