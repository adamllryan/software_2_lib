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
public final class CoinChange2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CoinChange2() {
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
        int[] coinVal = { 100, 50, 25, 10, 5, 1 };
        int[] vals = { 0, 0, 0, 0, 0, 0 };
        int money = in.nextInteger();
        for (int i = 0; i < 6; i++) {
            vals[i] = money / coinVal[i];
            money %= coinVal[i];

        }

        out.println("dollars: " + vals[0]);
        out.println("half dollars: " + vals[1]);
        out.println("quarters: " + vals[2]);
        out.println("dimes: " + vals[3]);
        out.println("nickels: " + vals[4]);
        out.println("pennies: " + vals[5]);

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
