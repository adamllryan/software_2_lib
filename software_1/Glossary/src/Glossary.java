import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.queue.*;
/**
 * A program that outputs an HTML glossary from an input file
 * @author Adam Ryan
 *
 */
public final class Glossary {

    private Glossary() {
    }
    /**
     * Outputs the header of the index.html file
     * Includes html, head, body, title, h1 and the beginning of the unlinked list tags
     * 
     * @param o
     * 			must be a valid SimpleWriter that is linked to the output index file
     * 
     */
    public static void output_index_header(SimpleWriter o) {
    	o.print("<html>\n"
    			+ "<head>\n"
    			+ "<body>"
    			+ "<title>Glossary</title>\n"
    			+ "</head>\n"
    			+ "<h1>Glossary</h1>\n"
    			+ "<ul>\n");
    }
    /**
     * Outputs the footer of the index.html file
     * Includes html, body, and the end of the unlinked list tags
     * 
     * @param o
     * 			must be a valid SimpleWriter that is linked to the output index file
     * 
     */
    public static void output_index_footer(SimpleWriter o) {
    	o.print("</ul>\n"
    			+ "</body>\n"
    			+ "</html>\n");
    }
    /**
     * Outputs a single index list item given a SimpleWriter o with destination 
     * file and the word to output
     * 
     * @param word
     * 				a word to be hyperlinked and printed, must be properly capitalized	
     * @param o
     * 			must be a valid SimpleWriter that is linked to the output html file
     * 
     **/
    public static void output_index_list_item(String word, SimpleWriter o) {
    	o.print("<li><a href=\"");
		o.print(word + ".html");
		o.print("\">" + word + "</li>\n");
    }
    /**
     * Helper method used only for testing if the first instance of w is contained in p
     * and is a whole word
     * @param w
     * 			word to be checked, must be found within the String p
     * @param p
     * 			paragraph that must contain w within
     * @return
     * 			true if w is a valid word in p else false
     */				
    //Helper method used only for testing if the first instance of w is contained in p
    //and is a whole word
    public static boolean isWord(String w, String p) {
    	String word = w.toLowerCase();
    	String paragraph = p.toLowerCase();
    	char[] separators = {' ', ',', '.', '\\', '\n'};
	    //checks if first instance of word is at beginning, middle, or end
		if (paragraph.indexOf(word)==0) {
    		//if word is at beginning
			String temp = paragraph.substring(0, word.length()+1);
    		for (int i = 0; i<separators.length; i++) {
    			if (temp.charAt(temp.length()-1)==separators[i]) 
    				return true;
    		}
    	} else if (paragraph.indexOf(word)+word.length()>=paragraph.length()) {
    		//if word is at end
    		String temp = paragraph.substring(paragraph.indexOf(word)-1);
    		for (int i = 0; i<separators.length; i++) 
    			if (temp.charAt(0)==separators[i]) 
    				return true;
    	} else {
    		//if word is in middle
	    	String temp = paragraph.substring(paragraph.indexOf(word)-1, paragraph.indexOf(word)+word.length()+1);
	    	for (int i = 0; i<separators.length; i++) 
	    		for (int j = 0; j<separators.length; j++)	
	    			if (temp.charAt(0)== separators[i]&& temp.charAt(temp.length()-1)==separators[j])
	    				return true;
    	}
    	return false;
    }
    /**
     * When called, attempts to find and replace each instance of word in definition with 
     * a hyperlinked version of word
     * @param word
     * 				word to be parsed in String definition, must be a glossary term
     * @param definition
     * 				String definition that will be parsed to link recurrences of word
     * @return
     * 			definition updated to link glossary terms in definitions to the terms
     */			
    public static String parse_definition(String word, String definition) {
    	//check first, cut off up until that, take remaining part and repeat
    	String temp = "";
    	String word_lower = "";
    	String def_lower = "";
    	//while an instance of the word in remaining definition is found
    	while (def_lower.indexOf(word_lower)!=-1)  {
    		//lowercase for reading
    		word_lower = word.toLowerCase();
        	def_lower = definition.toLowerCase();
        	//checks if word is a whole word and then trims the definition, checks if it is invalid then trims, or if not found
	    	if (def_lower.indexOf(word_lower)!=-1 && isWord(word, definition)) {
	    		int word_start = def_lower.indexOf(word_lower);
				int word_end = def_lower.indexOf(word_lower)+word.length();
				temp += definition.substring(0,word_start) + "<a href=\"" + word + ".html\">" + definition.substring(word_start, word_end) + "</a>";
				definition = definition.substring(word_end);
	    	} else if (def_lower.indexOf(word_lower)!=-1) {
				int word_end = def_lower.indexOf(word_lower)+word.length();
				temp += definition.substring(0,word_end);
				definition = definition.substring(word_end);
	    	} else {
	    		return temp + definition;
	    		
	    	}
    	}
    	
    	return temp;
    }
    
    /**
     * Creates all definition .html files when given a two queues of same length, uses the word as the file name
     * @param out
     * 				The directory that the definition file will be outputted to
     * @param k
     * 			A String queue that contains a list of glossary words
     * @param p
     * 			A String queue that contains a list of glossary definitions
     * @requires 
     * 			k.length()=p.length()
     * 			
     */
    public static void generate_definition_file(String out, Queue<String>k, Queue<String>p) {
    	Queue<String> temp = k.newInstance();
    	//Collect a list of all terms to search for terms in definitions
    	for (String i : k) {
    		temp.enqueue(i);
    	}
    	//Create files for each term
    	while (k.length()>0) {
	    	String word = k.dequeue();
	    	String definition = p.dequeue();
	    	//for each word in definition, if found then parse in the hyperlink
	    	for (String i : temp) {
	    		 if (definition.toLowerCase().indexOf(i.toLowerCase())!=-1)
	    			definition = parse_definition(i, definition);
	    	
	    	}
    		SimpleWriter e = new SimpleWriter1L(out +"/" + word + ".html");
			e.print("<html>\n"
					+ "<head>\n"
					+ "<title>" + word + "</title>\n"
					+ "</head>"
					+ "<body>"
					+ "<p style=\"color:red;\"><b>" + word + "</b></p>\n"
					+ "<p>" + definition + "</p>\n"
					+ "</body>\n"
					+ "</html>");
			e.close();
    	}
    }
    /**
     * Takes a directory and parses words and definitions from file.
     * Words and definitions are outputted in a definition file for
     * each word, and an index file is generated that contains a hyperlink
     * of each word inside. 
     * 
     * @param dir
     *            the directory of the source file
     *            
     * @requires dir 
     * 				 is a valid directory that can be reached
     * @requires out
     * 				 is a valid directory that can be reached
     * 
     */
    public static void file_to_output(String dir, String out) {
    	SimpleReader r = new SimpleReader1L(dir);
    	SimpleWriter o = new SimpleWriter1L(out + "/index.html");
    	output_index_header(o);
    	Queue<String> k = new Queue1L<>();
        Queue<String> p = new Queue1L<>();
    	//if not at end of file
        while (!r.atEOS()) {
    		String index = r.nextLine();
        	String definition = "", temp = r.nextLine();    	
        	//while temp is not empty and r has lines left
        	while (!temp.equals("") && !r.atEOS()) {
        		//add line and get next line
        		definition+=temp;
        		temp = r.nextLine();
        		//if while will continue add a newline for formatting
        		if (!temp.equals(""))
        			definition+="\n";
        		//if loop will not run again add the final line
        		if (r.atEOS())
        			definition+=temp;
        	}
        	//prints individual list item
        	if (index != "" && definition != "") {
	        	output_index_list_item(index, o);
	        	k.enqueue(index);
	        	p.enqueue(definition);
        	}
        }
    	output_index_footer(o); //print footer for index file
    	//creates definition files with word and definition
    	generate_definition_file(out, k, p);
    	o.close();
    	r.close();
    }
    
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter1L o = new SimpleWriter1L();
    	SimpleReader in = new SimpleReader1L();
        //get the input directory, test case is in data/data.txt
        o.print("Directory of input file + name(e.g. data/test-no-spaces.txt): ");
        String input = in.nextLine();
        o.print("Directory of output files(e.g. data/output-test): ");
        String output = in.nextLine();
        //call the method that will create the index file and subfiles for definitions
        file_to_output(input, output);
        in.close();
        o.close();
    }

}
