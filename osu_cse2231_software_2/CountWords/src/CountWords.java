import java.io.IOException;
import components.simplereader.*;
import components.map.*;

/**
 * Takes an input file and counts each word, then outputs those words + word count to an html file
 *
 * @author Adam Ryan
 *
 */
public final class CountWords {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CountWords() {
    }
    /**
     * Map containing each found word and the number of occurrences
     */
    private static Map<String, Integer> words = new Map1L<String, Integer>();
    /**
     * prints the all the tags in the html file up to the opening for the table
     * @param t
     * 			TreeWriter object that will add the tags to its internal tag queue
     */	
    public static void printTopHalf(TreeWriter t, String out) {
    	/**
    	 * calling .addTag(string) creates opening and closing tags for the passed string, and
    	 * it is overloaded so that you can pass attributes into the tag if necessary. It does
    	 * provide <, >, />, and other formatting, but in this case it is okay because we will need that
    	 * because > is not the same as />. calling .addString(string) is similar to .addTag() but it does
    	 * not format anything, it just inserts the raw string once, whereas .addTag() formats and adds twice. 
    	 * Shift right essentially closes one set of tags, and closeOneTag() does the exact same. 
    	 * 
    	 * NOTE: I made these because we have been doing a lot of html printing and I wasn't really a fan of
    	 * hard coding these, and I believe the instructions say that we are allowed to use our own work for
    	 * these projects
    	 */
    	t.addTag("html");
		t.addTag("head");
		t.addTag("title");
		t.addString("test");
		t.shiftRight();
		t.addTag("body");
		t.addTag("h2");
		t.addString("Words Counted in " + out);
		t.shiftRight();//closeOneTag();
		t.addString("<hr>");
		t.addTag("table", "border", "1");
		t.addTag("tbody");
		t.addTag("tr");
		t.addTag("th");
		t.addString("Words");
		t.shiftRight();
		t.addTag("th");
		t.addString("Counts");
		t.shiftRight();
		t.shiftRight();
    }
    /**
     * Prints the word and count in a new table row
     * @param t
     * 			TreeWriter object that will add the tags to its internal tag queue
     * @param word
     * 				the string word to be printed
     * @param count
     * 				the integer count to be printed
     */
    public static void printOneRow(TreeWriter t, String word, int count) {
    	t.addTag("tr");
		t.addTag("th");
		t.addString(word);
		t.shiftRight();
		t.addTag("th");
		t.addString(Integer.toString(count));
		t.shiftRight();
		t.shiftRight();
    }
    /**
     * Tells the TreeWriter object to print everything to file
     * @param t
     * 			TreeWriter object that will print file to output
     * @throws IOException
     */
    public static void printCloser(TreeWriter t) throws IOException {
    	/**
    	 * .printAll(); just consolidates all the elements into one string
    	 * and then prints it to the specified file
    	 */
    	t.printAll();
    }
    /**
     * 
     * populates the words map with every word and occurrence found
     * @requires
     * 			|s|>0
     * @param s
     * 			string passage to be parsed
     */
    public static void getAllWords(String s) {
    	/**
    	 * I also made a quick paragraph parser because we have had to do this
    	 * for a few projects now. 
    	 * 
    	 * This method basically just runs while parser is not empty and keeps
    	 * pulling words until all words have been found. 
    	 * 
    	 * We don't have to worry about getting separators because ParseWords1L handles that, 
    	 * but if there are no more words found, null is returned. 
    	 * 
    	 * In the example, words are not flattened so for some entries, such as The and the, 
    	 * words with capitalization are not consolidated. Mine flattens first; I just thought
    	 * that was a better idea. 
    	 */
    	ParseWords parser = new ParseWords1L(s);
    	while (!parser.isEmpty()) {
    		String word = parser.pullNextWord();
    		if (word!=null) {
    			word = word.toLowerCase();
    			/**
    			 * Basically just adds a new word if not found, else increments
    			 * value by 1
    			 */
    			
    			if (words.hasKey(word)) {
    				words.replaceValue(word, words.value(word)+1);
    			} else {
    				words.add(word, 1);
    			}
    		}
    	}
    	//Quick toString() to see output
    	//System.out.println(words.toString());
    }
    
    /**
     * prints each word-count pair alphabetically to file
     * @clears
     * 			words
     * @param t
     * 			treeWriter that will print to file
     */
    public static void printAlphabetizedWords(TreeWriter t) {
    	/**
    	 * Part of the instructions were to print alphabetically, so I had to manually do that
    	 * when printing because map does not hold key pairs in any order that I know of. 
    	 * This pretty much just prints the "first" pair and removes it from the words map. 
    	 * Loops until words is empty, finds pairs by using compareTo, basically selection sort
    	 */
    	while (words.size()>0) { //while not empty
    	Map.Pair<String, Integer> pair = words.removeAny();
    	String smallest = pair.key(); //remove and replace to get a "random" name
    	words.add(pair.key(), pair.value());
    	for (Map.Pair<String, Integer> item : words) {
    		if (item.key().compareTo(smallest)<0) {
    			smallest = item.key();//iterate through all and find the smallest
    		}
    	}
    	//permanently remove the smallest item, tell it to print
    	Map.Pair<String, Integer> smallestItem = words.remove(smallest);
		printOneRow(t, smallestItem.key(), smallestItem.value());
    	}
    }
    
    
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        /**
         * Get input/output files
         */
    	SimpleReader r = new SimpleReader1L();
    	System.out.println("Enter an input file: ");
    	String input = r.nextLine();//in.txt
    	System.out.println("Enter an output file: ");
    	String output = r.nextLine();//out.txt
    	r.close();
    	/**
    	 * Read file
    	 */
    	String text = "";
    	SimpleReader textReader = new SimpleReader1L(input);
    	while (!textReader.atEOS()) {
    		text += textReader.nextLine() + '\n';
    	}
    	textReader.close();
    	/**
    	 * Parse and insert occurrences in map
    	 */
    	getAllWords(text);
    	
    	/**
    	 * Write to file
    	 */
    	TreeWriter t = new TreeWriter1L(output);
        printTopHalf(t, output);
        printAlphabetizedWords(t);
		printCloser(t);
		//System.out.println(t.toString());
		
		
		
		t.close();
    }

}
