import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Oddity {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Oddity() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static void myMethod() {
        /*
         * Put your code for myMethod here
         */
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    //Solutions: 
    //Set even/odd calc to remainder != 0
    //round the data maybe or check within a range with error
    //java overflow error? rebounds so maybe use a long
    //sent long value
    
    public static void main(String[] args) {
        
    	SimpleWriter out = new SimpleWriter1L();
        out.println(12345 + 5432l);
        out.close();
    }
   

}
