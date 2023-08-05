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
public final class ABCDGuesser1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ABCDGuesser1() {
    }

    /**
     *  * Repeatedly asks the user for a positive real number until the user
     * enters  * one. Returns the positive real number.  *  * @param in
     *  *            the input stream  * @param out  *            the output
     * stream  * @return a positive real number entered by the user  
     */
    private static double getPositiveDouble(SimpleReader in, SimpleWriter out) {
    	//checks if input is parse-able and then converts to double, then checks if valid
    	//then returns
    	double num = 0;
    	while (true) { //i know i shouldn't use break statements but its cleaner than using an index variable
        	out.println("Input a positive double: ");
        	String input = in.nextLine();
        	num = (FormatChecker.canParseDouble(input)) ? Double.parseDouble(input) : 0;
        	if (num > 0) {
        		break;
        	}
        }
        return num;
    }

    /**
     *  * Repeatedly asks the user for a positive real number not equal to 1.0
     *  * until the user enters one. Returns the positive real number.  *
     *  * @param in  *            the input stream  * @param out  *           
     * the output stream  * @return a positive real number not equal to 1.0
     * entered by the user  
     */
    private static double getPositiveDoubleNotOne(SimpleReader in, SimpleWriter out) {
    	
    	//checks if input is parse-able and then converts to double, then checks if valid
    	//then returns
    	double num = 0;
    	while (true) { //i know i shouldn't use break statements but its cleaner than using an index variable
        	out.println("Input a positive double(!=1): ");
        	String input = in.nextLine();
        	num = (FormatChecker.canParseDouble(input)) ? Double.parseDouble(input) : 0;
        	if (num > 0 && num != 1) {
        		break;
        	}
        }
        return num;
    }
    /**
     * @param guess the guess
     * @param real the actual value
     * @return error %
     * 
     */
    private static double getError(double guess, double real) {
    	return Math.abs(guess - real) / real;
    }
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        double[] abcd = {-5, -4, -3, -2, -1, -0.5, -1.0/3, -0.25, 0, 0.25, 1.0/3, 0.5, 1, 2, 3, 4, 5};
    	SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        //Prompt user for values
        out.print("Constant | ");
        double num = getPositiveDouble(in, out);
        out.print("Num1 | ");
        double fav1 = getPositiveDoubleNotOne(in, out);
        out.print("Num2 | ");
        double fav2 = getPositiveDoubleNotOne(in, out);
        out.print("Num3 | ");
        double fav3 = getPositiveDoubleNotOne(in, out);
        out.print("Num4 | ");
        double fav4 = getPositiveDoubleNotOne(in, out);
        //initial variables
        double[] bestGuess = new double[5];
        double e = 100;
        double approx = 0;
        //index contains a,b,c,d
        int[] index = {-1,-1,-1,-1};
        //while each value is under the length of the abcd array, also increments
        //setting index values to -1 resets the inner while for each loop
        //it essentially works like a more complicated for loop
        while (index[0]++<abcd.length-1) {
        	index[1] = -1;
        	while (index[1]++<abcd.length-1) {
        		index[2] = -1;
        		while (index[2]++<abcd.length-1) {
        			index[3] = -1;
        			while (index[3]++<abcd.length-1) {

        				//calculates w^ax^by^cz^d
        				approx = Math.pow(fav1, abcd[index[0]]) * 
        						Math.pow(fav2, abcd[index[1]]) * 
        						Math.pow(fav3, abcd[index[2]]) * 
        						Math.pow(fav4, abcd[index[3]]);
        				//calls getError which returns % error and updates 
        				//values if it is true
        				if (getError(approx, num) < e) {
        					bestGuess[0] = index[0];
        					bestGuess[1] = index[1];
        					bestGuess[2] = index[2];
        					bestGuess[3] = index[3];
        					bestGuess[4] = approx;
        					e = getError(approx, num);
        					//for loop only for testing
        					/*for (double i : bestGuess) {
        						out.print(i + " ");
        					}*/
        					out.println(" Error: " + e + "\n");
        					
        				}
        			}
        		}
        	}
        }
        //output for the end of the program
        out.println("Final: \n");
        out.println("A: " + bestGuess[0]);
        out.println("B: " + bestGuess[1]);
        out.println("C: " + bestGuess[2]);
        out.println("D: " + bestGuess[3]);
        out.println("Error: " + e * 100 + "%");
        out.println("Approximation: " + bestGuess[4]);
        out.println(fav1 + "^" + bestGuess[0] + " " + 
        		fav2 + "^" + bestGuess[1] + " " + 
        		fav3 + "^" + bestGuess[2] + " " + 
        		fav4 + "^" + bestGuess[3] + " " + 
        		" = " + bestGuess[4]
        
        		);
        
        
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
