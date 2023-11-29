import components.simplewriter.SimpleWriter;
import components.sequence.*;
import components.simplewriter.SimpleWriter1L;
import components.map.*;
/**
 * Simple HelloWorld program (clear of Checkstyle and FindBugs warnings).
 *
 * @author P. Bucci
 */
public final class Homework2 {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private Homework2() {
        // no code needed here
    }
    
    /**
     * No informal description here for obvious reasons...
     * 
     * @replaces s2
     * @requires |s1| >= 1
     * @ensures <pre>
     * |s2| = |s1| - 1  and
     *  for all i, j: integer, a, b: string of integer
     *      where (s1 = a * <i> * <j> * b)
     *    (there exists c, d: string of integer
     *       (|c| = |a|  and
     *        s2 = c * <(i+j)/2> * d))
     * </pre>
     */
    public static void smooth(Sequence<Integer> s1, Sequence<Integer> s2) {
    	assert s1.length()>0 : "Violation of: |s1| >= 1";
    	s2.clear();
    	for (int i = 0;i<s1.length()-1;i++)  
    		s2.add(i, (s1.entry(i)+s1.entry(i+1))/2);
    		
    	
    }
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        out.println("Hello World!");
        out.close();
    }

}
