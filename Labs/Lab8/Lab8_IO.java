/** VIEW
 * This class handles all input and output for the
 * English-Spanish translator.
 *
 */
import java.util.*;


public class IO {
	private Scanner s;
	
	public IO() {
		s = new Scanner(System.in);
	}

	/**
	 * getWord prompts the user for an English word
	 *
	 * @return The English word entered by the user
	 */
	public String getWord() {
        System.out.print("Enter an English word (press enter to quit): ");
		String word = s.nextLine();
		System.out.println();
		return word;
	}

	/**
	 * printTranslation prints an English word and its Spanish translation
	 *
	 * @param english The English word
	 * @param spanish The Spanish word
	 */
	public void printTranslation(String english, String spanish) {
        System.out.println(english + ": " + spanish + "\n");
	}
} // end IO
