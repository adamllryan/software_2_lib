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
public final class Newton1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton1() {
    }

    /**
     * Computes estimate of square root of x to within relative error 0.01%.
     *
     * @param x
     *            positive number to compute square root of
     * @return estimate of square root
     */
    private static double sqrt(double x) {
        //error bounds for exiting while
        final double e = 0.0001;
        //inital guess
        double r = x;
        //initial absolute value
        double abs = r * r - x;
        //while loop will iterate until guess error is less than e^2
        while (abs / x > e * e) {
            //refine guess
            r = (r + x / r) / 2;
            //get the absolute value of r*r-x using conditional :? operator
            //eclipse says avoid these but they are much cleaner, should I use them?
            abs = (r * r - x > 0) ? (r * r - x) : -(r * r - x);
        }
        //return the guess as double
        return r;
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
        int t = 0;
        while (t == 0) {
            out.print("Input a double: ");
            //print the sqrt guess of the next inputted value
            out.println(sqrt(in.nextDouble()));
            out.println("Calculate another(y/n)? ");
            //ask if user wants to continue, end if user says anything besides y
            t = (in.nextLine().equals("y")) ? 0 : -1;
        }
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
