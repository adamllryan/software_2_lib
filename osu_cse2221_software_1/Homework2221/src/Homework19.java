import components.simplereader.SimpleReader;
import components.set.*;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.queue.*;
import java.util.Comparator;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework19 implements Comparator<String> {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework19() {
    }
    
    /**
     * Generates the set of characters in the given {@code String} into the
     * given {@code Set}.
     * 
     * @param str
     *            the given {@code String}
     * @param charSet
     *            the {@code Set} to be replaced
     * @replaces charSet
     * @ensures charSet = entries(str)
     */
    private static void generateElements(String str, Set<Character> charSet) {
    	charSet.clear();
    	for (int i = 0; i<str.length(); i++) {
    		if (!charSet.contains(str.charAt(i)))
    			charSet.add(str.charAt(i));
    	}
    }
    
    /**
     * Returns the first "word" (maximal length string of characters not in
     * {@code separators}) or "separator string" (maximal length string of
     * characters in {@code separators}) in the given {@code text} starting at
     * the given {@code position}.
     * 
     * @param text
     *            the {@code String} from which to get the word or separator
     *            string
     * @param position
     *            the starting index
     * @param separators
     *            the {@code Set} of separator characters
     * @return the first word or separator string found in {@code text} starting
     *         at index {@code position}
     * @requires 0 <= position < |text|
     * @ensures <pre>
     * nextWordOrSeparator =
     *   text[position, position + |nextWordOrSeparator|)  and
     * if entries(text[position, position + 1)) intersection separators = {}
     * then
     *   entries(nextWordOrSeparator) intersection separators = {}  and
     *   (position + |nextWordOrSeparator| = |text|  or
     *    entries(text[position, position + |nextWordOrSeparator| + 1))
     *      intersection separators /= {})
     * else
     *   entries(nextWordOrSeparator) is subset of separators  and
     *   (position + |nextWordOrSeparator| = |text|  or
     *    entries(text[position, position + |nextWordOrSeparator| + 1))
     *      is not subset of separators)
     * </pre>
     */
    private static String nextWordOrSeparator(String text, int position, Set<Character> separators) {
    	text = text.substring(position);
    	int min = text.length();
    	
    	for (int i = position; i<min; i++ ) {
    		for (char c : separators) {
    			if (text.indexOf(c)>-1 || text.indexOf(c)<min)
    				min = text.indexOf(c);
    		}
    		return text.substring(0,min);
    	}
    	return text;
    }
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
    	Set<Character> s = new Set1L<>();
    	generateElements("bruhauau", s);
    	System.out.println(s);
    	Set<Character> sep = new Set1L<>();
    	sep.add(' ');
    	System.out.println(nextWordOrSeparator("hi my name is adam", 6, sep));
    }

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
