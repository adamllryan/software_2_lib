import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
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
	private BufferedWriter w;
	/**
	 * Constructor that will accept and set file location
	 * @param out
	 * 				file out location
	 * @throws IOException
	 */
	public TreeWriter1L(String out) throws IOException {
		this.w = new BufferedWriter(new FileWriter(out));
	}
	
	/**
	 * The start and end stacks that will hold the items for the program, 
	 * the divide in between start and end is representative of the cursor
	 */
	private Stack<String> end= new Stack<String>();
	private Stack<String> start = new Stack<String>();
	
	/**
	 * Constants
	 */
	
	@Override
	public void close() throws IOException {
		w.close();
	}
	
	@Override
	public void printTag(String s) throws IOException {
		w.write(s);
	}
	
	@Override
	public void shiftLeft() {
		if (start.size()>0) {
			end.push(start.pop());
		}
	}
	
	@Override
	public void shiftRight() {
		if (end.size()>0)
			start.push(end.pop());
	}
	@Override
	public void addTag(String s) {
		start.add("<" + s + ">");
		end.add("</" + s + ">");
	}
	@Override
	public void addTag(String s, String attributeName, String attribute) {
		start.add("<" + s + " " + attributeName + "=\"" + attribute + "\">");
		end.add("</" + s + ">");
	}
	@Override
	public void addString(String s) {
		start.add(s);
	}
	@Override
    public void printAll() throws IOException {
		for (String s : start) {
			w.write(s + "\n");
		}
		for (int i = end.size()-1; i>=0; i--) {
			w.write(end.elementAt(i) + "\n");
		}
    }
	@Override
	public String toString() {
		String rtn = "----------------------------------------------\n";
		for (String s : start) {
			rtn+=s + "\n";
		}
		rtn+="\n----CURSOR HERE----\n\n";
		for (int i = end.size()-1; i>=0; i--) {
			rtn+=end.elementAt(i) + "\n";
		}
		rtn+="----------------------------------------------\n";
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
