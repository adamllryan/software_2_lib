import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.utilities.FormatChecker;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Hailstone5 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Hailstone5() {
    }
    
    /**
     * Repeatedly asks the user for a positive integer until the user enters
     * one. Returns the positive integer.
     * 
     * @param in
     *            the input stream
     * @param out
     *            the output stream
     * @return a positive integer entered by the user
     */
    private static int getPositiveInteger(SimpleReader in, SimpleWriter out) {
    	String input = "";
    	int index = 0, num = -1;
    	while (index == 0) {
    		out.println("Input an integer(>0): ");
    		input = in.nextLine();
    		if (FormatChecker.canParseInt(input)) {
    			num = Integer.parseInt(input);
    		}
    		index = (num>0) ? -1 : 0;
    		
    	}
    	return num;
    }
    
    
    /**
     * Generates and outputs the Hailstone series starting with the given
     * integer.
     *
     * @param n
     *            the starting integer
     * @param out
     *            the output stream
     */
    private static void generateSeries(int n, SimpleWriter out) {
        int max = n;
        int len = 0;
        out.print(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            out.print(", " + n);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            len++;
            if (max < n) {
                max = n;
            }
        }
        out.print(", length: " + len);
        out.print(", max: " + max);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        
        int input = getPositiveInteger(in, out);

        generateSeries(input, out);
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
