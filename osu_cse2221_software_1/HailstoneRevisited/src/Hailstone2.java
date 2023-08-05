import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.naturalnumber.*;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Hailstone2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Hailstone2() {
    }

    /**
     * Generates and outputs the Hailstone series starting with the given
     * {@code NaturalNumber}.
     * 
     * @param n
     *            the starting natural number
     * @param out
     *            the output stream
     * @updates out.content
     * @requires n > 0 and out.is_open
     * @ensures out.content = #out.content * [the Hailstone series starting with n]
     */
    private static void generateSeries(NaturalNumber n, SimpleWriter out) {
    	NaturalNumber temp = new NaturalNumber2(n);
    	int count = 0;
    	while (n.compareTo(new NaturalNumber1L(1)) > 0) {
             if (temp.divide(new NaturalNumber2(2)).compareTo(new NaturalNumber2(0)) == 0) {
                 n.divide(new NaturalNumber2(2));
             } else {
                 n.multiply(new NaturalNumber2(3));
                 n.add(new NaturalNumber2(1));
             }
             count++;
             temp.copyFrom(n);
             out.println(n);
         }
    	out.println("Length: " + count);
    	
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
        out.println("Input integer: ");
        NaturalNumber num = new NaturalNumber1L(in.nextLine());
        generateSeries(num, out);
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
