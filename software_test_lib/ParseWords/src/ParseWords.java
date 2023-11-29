/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public interface ParseWords {
	/**
	 * @updates text
	 * 				removes the first word in the passage 
	 * @return
	 * 			the next word found, null if no word is found
	 */
	String pullNextWord();
	/**
	 * 
	 * @return
	 * 			true if the passage is empty, else false
	 */
	boolean isEmpty();
}
