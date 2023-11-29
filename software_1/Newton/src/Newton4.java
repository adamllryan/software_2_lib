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
public final class Newton4 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton4() {
    }

    /**
     * Computes estimate of square root of x to within relative error specified
     * by user.
     *
     * @param e
     *            the error that r must be less than
     *
     * @param x
     *            positive number to compute square root of
     * @return estimate of square root
     */
    private static double sqrt(double x, double e) {
        //not sure if this is how you wanted this implemented, it's an edge case though
        //so it shouldn't matter too much anyways
        if (x == 0) {
            return 0;
        }
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
            abs = ((r * r - x) > 0) ? (r * r - x) : -(r * r - x);
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
        //ask user for the degree of error
        out.println("Choose degree of error: ");
        double e = in.nextDouble();
        int t = 0;
        double num = 0;
        while (t == 0) {
            out.print("Input a double(negative to quit): ");
            num = in.nextDouble();
            if (num >= 0) {
                //calculate sqrt with num and degree of error
                out.println(sqrt(num, e));

            } else {
                //end if num <=0
                t = -1;
            }

        }
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
