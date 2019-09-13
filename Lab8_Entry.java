/** MODEL
 * This class represents a single entry in an English-Spanish
 * dictionary.  It contains an English word and its Spanish translation.
 *
 */

public class Entry {
	private String engl;
	private String span;

	/**
	 * Entry sets up a single English-Spanish entry
	 *
	 * @param english An English word
	 * @param spanish The Spanish translation
	 */
	public Entry(String e, String s) {
        engl = e;
        span = s;
	}

	/**
	 * returns this entry's English word
	 *
	 * @return This entry's English word
	 */
	public String getEnglish() {
        return engl;
	}

	/**
	 * returns this entry's Spanish word
	 *
	 * @return This entry's Spanish word
	 */
	public String getSpanish() {
        return span;
	}
} // end Entry