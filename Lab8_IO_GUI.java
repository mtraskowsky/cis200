/** VIEW
 * This class handles all input and output for the
 * English-Spanish translator.
 *
 */
import javax.swing.JOptionPane; 
import java.util.*;


public class IO_GUI {
	//private Scanner s;
	private String s;
	public IO_GUI() {
		//s = new Scanner(System.in);
	}

	/**
	 * getWord prompts the user for an English word
	 *
	 * @return The English word entered by the user
	 */
	public String getWord() {
        //System.out.print("Enter an English word (press enter to quit): ");
        String GUIword = JOptionPane.showInputDialog("Enter an English word (press enter to quit): ");
		//String word = s.nextLine();
        //System.out.println();
        //newWord = JOptionPane.showInputDialog("Enter an English word (press enter to quit): ");
		return GUIword;
	}

	/**
	 * printTranslation prints an English word and its Spanish translation
	 *
	 * @param english The English word
	 * @param spanish The Spanish word
	 */
	public void printTranslation(String english, String spanish) {
        //System.out.println(english + ": " + spanish + "\n");
        JOptionPane.showMessageDialog(null, english + ": " + spanish + "\n");
	}
} // end IO