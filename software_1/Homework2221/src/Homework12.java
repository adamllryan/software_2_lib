import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.*;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework12 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework12() {
    }
    
    /**
     * Returns the number of digits of {@code n}.
     * 
     * @param n
     *            {@code NaturalNumber} whose digits to count
     * @return the number of digits of {@code n}
     * @ensures numberOfDigits = [number of digits of n]
     */
    private static int numberOfDigits(NaturalNumber n) {
    	//NaturalNumber temp = n.newInstance();
    	NaturalNumber temp = new NaturalNumber2();
    	temp.copyFrom(n);
    	int i = 0;
    	if (!n.isZero()) {
    		i++;
    		temp.divideBy10();
    		i+=numberOfDigits(temp);
    	}
    	return i;
    }
    
    /**
     * Returns the sum of the digits of {@code n}.
     * 
     * @param n
     *            {@code NaturalNumber} whose digits to add
     * @return the sum of the digits of {@code n}
     * @ensures sumOfDigits = [sum of the digits of n]
     */
    private static int sumOfDigits(NaturalNumber n) {
    	NaturalNumber temp = new NaturalNumber2(n);
    	int i = 0;
    	if (!n.isZero()) {
    		i=temp.divideBy10();
    		i+=sumOfDigits(temp);
    	}
    	return i;
    }
    
    /**
     * Returns the sum of the digits of {@code n}.
     * 
     * @param n
     *            {@code NaturalNumber} whose digits to add
     * @return the sum of the digits of {@code n}
     * @ensures sumOfDigits = [sum of the digits of n]
     */
    private static NaturalNumber sumOfDigits2(NaturalNumber n) {
    	NaturalNumber temp = new NaturalNumber2(n);
    	
    	temp.copyFrom(n);
    	NaturalNumber i = new NaturalNumber2(temp.divideBy10());
    	if (!n.isZero()) {
    		
    		i.add(sumOfDigits2(temp));
    	}
    	return i;
    }
    
    /**
     * Divides {@code n} by 2.
     * 
     * @param n
     *            {@code NaturalNumber} to be divided
     * @updates n
     * @ensures 2 * n <= #n < 2 * (n + 1)
     */
	private static void divideBy2(NaturalNumber n) {
	        int digit1 = n.divideBy10(); //get 1st and 2nd digit
	        int digit2 = n.divideBy10();
	        if (n.isZero()) {//case if n is 0
	            int temp = (digit2*10+digit1)/2;
	            n.multiplyBy10(temp/10);
	            n.multiplyBy10(temp%10);
	        } else if (digit2%2 == 0) {//if even
	            n.multiplyBy10(digit2);
	            divideBy2(n);
	            n.multiplyBy10(digit1/2);//add half
	        } else {//if odd
	            n.multiplyBy10(digit2-1);//-1
	            divideBy2(n);//call again
	            n.multiplyBy10((10+digit1) / 2);//get half val
	        }
	    }
    /**
     * Checks whether a {@code String} is a palindrome.
     * 
     * @param s
     *            {@code String} to be checked
     * @return true if {@code s} is a palindrome, false otherwise
     * @ensures isPalindrome = (s = rev(s))
     */
    private static boolean isPalindrome(String s) {
    	if (s.length()>1) {
    		if (!isPalindrome(s.substring(1,s.length()-1)))
    			return false;
    		if (s.charAt(0)!=s.charAt(s.length()-1)) {
    			return false;
    		}
    	}
    	return true;
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
		 * NaturalNumber test = new NaturalNumber2(131);
		 * out.println(numberOfDigits(test)); out.println(sumOfDigits(test));
		 * out.println(sumOfDigits2(test)); divideBy2(test); out.println(test);
		 */
        NaturalNumber[] n = new NaturalNumber[55];
        for (int i=0;i<n.length;i++) {
        	n[i] = new NaturalNumber2(i);
        	out.print(n[i] + "/2=");
        	divideBy2(n[i]);
        	out.print(n[i] + "\n");
        }
        out.println(isPalindrome("aoeeoa"));
        
        
        
        in.close();
        out.close();
    }

}
