import components.stack.*;
import components.simplewriter.*;
import java.io.IOException;

/**
 * A quick implementation for TreeWriter
 *
 * @author Adam Ryan
 *
 */
public class TreeWriter1L implements TreeWriter {
	/**
	 * Buffered Writer that will print to file
	 */
	private SimpleWriter w;
	/**
	 * Constructor that will accept and set file location
	 * @param out
	 * 				file out location
	 * @throws IOException
	 */
	public TreeWriter1L(String out) throws IOException {
		this.w = new SimpleWriter1L(out);
	}
	
	/**
	 * The start and end stacks that will hold the items for the program, 
	 * the divide in between start and end is representative of the cursor
	 */
	private Stack<String> end= new Stack1L<String>();
	private Stack<String> start = new Stack1L<String>();
	
	/**
	 * Contracts for overrides are found in interfaces
	 */
	
	@Override
	public void close() throws IOException {
		w.close();
	}
	
	@Override
	public void printTag(String s) throws IOException {
		w.print(s);
	}
	
	@Override
	public void shiftLeft() {
		if (start.length()>0) {
			end.push(start.pop());
		}
	}
	
	@Override
	public void shiftRight() {
		if (end.length()>0)
			start.push(end.pop());
	}
	@Override
	public void addTag(String s) {
		start.push("<" + s + ">");
		end.push("</" + s + ">");
	}
	@Override
	public void addTag(String s, String attributeName, String attribute) {
		start.push("<" + s + " " + attributeName + "=\"" + attribute + "\">");
		end.push("</" + s + ">");
	}
	@Override
	public void addString(String s) {
		start.push(s);
	}
	@Override
    public void printAll() throws IOException {
		int len = start.length()-1;
		/**
		 * shift all start items onto end
		 */
		while (start.length()>0) {
			end.push(start.pop());
		}
		/**
		 * iterate through and print all items
		 */
		for (String s : end) {
			w.print(s + "\n");
		}
		/**
		 * restores
		 */
		for (int i = 0;i<len;i++) {
			start.push(end.pop());
			
		}
    }
	@Override
	public String toString() {
		int len = start.length()-1;
		String rtn = "";
		/**
		 * shift all start items onto end
		 */
		while (start.length()>0) {
			end.push(start.pop());
		}
		/**
		 * iterate through and return all as a string
		 */
		for (String s : end) {
			rtn+=(s + "\n");
		}
		/**
		 * return items back
		 */
		for (int i = 0;i<len;i++) {
			start.push(end.pop());
		}
		
		return rtn;
	}
	/**
	 * Same as shiftRight(), just renamed for less confusion
	 */
    public void closeOneTag() {
    	this.shiftRight();
    }
    /**
	 * Same as shiftLeft(), just renamed for less confusion
	 */
    public void reopenATag() {
    	this.shiftLeft();
    }
}
