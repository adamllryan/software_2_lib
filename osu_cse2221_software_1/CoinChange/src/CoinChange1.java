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
public final class CoinChange1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private CoinChange1() {
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
        int money = in.nextInteger();
        int dollars, half, quarters, dimes, nickels, pennies;
        dollars = money / 100;
        money %= 100;
        half = money / 50;
        money %= 50;
        quarters = money / 25;
        money %= 25;
        dimes = money / 10;
        money %= 10;
        nickels = money / 5;
        money %= 5;
        pennies = money / 1;
        out.println("dollars: " + dollars);
        out.println("half dollars: " + half);
        out.println("quarters: " + quarters);
        out.println("dimes: " + dimes);
        out.println("nickels: " + nickels);
        out.println("pennies: " + pennies);

        out.println(money);

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
