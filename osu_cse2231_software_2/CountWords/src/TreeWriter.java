import java.io.IOException;
/**
 * Put a short phrase describing the program here.
 *
 * @author Adam Ryan
 *
 */
public interface TreeWriter {
	
	/**
	 * Prints a string to file
	 * @param s
	 * 			string to be printed
	 * @throws IOException
	 * 
	 */
	void printTag(String s) throws IOException;
	/**
	 * Shifts "cursor" one to the left
	 */
    void shiftLeft();
    /**
     * Shifts "cursor" one to the right
     */
    void shiftRight();
    /**
     * Adds an opening and closing tag to the queue of items
     * Includes \< and \>, only include the name of the tag, no triangle brackets 
     * @param s
     * 			the string name of the tag to be added
     */			
    void addTag(String s);
    /**
     * Adds a string of text to the queue of items
     * @param s
     * 			the string to be added
     */	
    void addString(String s);
    /**
     * Closes the reader, should be used at the end
     * @throws IOException
     */
	void close() throws IOException;
	/**
	 * Prints whole queue of items to file
	 * @throws IOException
	 */
	void printAll() throws IOException;
	/**
	 * *
     * Adds an opening and closing tag to the queue of items
     * Includes \< and \>, only include the name of the tag, no triangle brackets 
     * Also includes an attribute name and attribute to include within the tag
     * @param s
     * 			the string name of the tag to be added
     * @param attributeName
     * 						the string name of the attribute
	 * @param attribute	
	 * 					the attribute value
	 */
	void addTag(String s, String attributeName, String attribute);
	/**
	 * Generates a tostring copy of what will be printed, with a cursor separator to show location
	 * @return the html file ready to print as a string, with dividers to for debugging
	 */
	String toString();
}
