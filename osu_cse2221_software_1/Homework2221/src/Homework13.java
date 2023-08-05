import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.naturalnumber.*;
import components.xmltree.*;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework13 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework13() {
    }
    
    /**
     * Returns the product of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to multiply
     * @return the product of the digits of {@code n}
     * @clears n
     * @ensures productOfDigits1 = [product of the digits of n]
     */
	 private static NaturalNumber productOfDigits1(NaturalNumber n) {
    	NaturalNumber product = null;
	    if (!n.isZero()) {
	    	int i = n.divideBy10();
	    	product = productOfDigits1(n);
	    	product.multiply(new NaturalNumber2(i));
	    	return product;
    	} else {
    		return new NaturalNumber2(1);
    	}
    }
    
    /**
     * Returns the product of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to multiply
     * @return the product of the digits of {@code n}
     * @ensures productOfDigits2 = [product of the digits of n]
     */
    private static NaturalNumber productOfDigits2(NaturalNumber n) {
    	NaturalNumber temp = new NaturalNumber2(n);
    	NaturalNumber product = null;
	    if (!temp.isZero()) {
	    	int i = temp.divideBy10();
	    	product = productOfDigits1(temp);
	    	product.multiply(new NaturalNumber2(i));
	    	return product;
    	} else {
    		return new NaturalNumber2(1);
    	}
    }
    
    /**
     * Reports the value of {@code n} as an {@code int}, when {@code n} is
     * small enough.
     * 
     * @param n
     *            the given {@code NaturalNumber}
     * @return the value
     * @requires n <= Integer.MAX_VALUE
     * @ensures toInt = n
     */
    private static int toInt(NaturalNumber n) {
    	NaturalNumber temp = new NaturalNumber2(n);
	    if (temp.isZero()) {
	    	return -1;
	    } else {
	    	
	    	int i = temp.divideBy10();
	    	int value = toInt(temp);
	    	if (value!=-1) {
	    		value = value * 10 + i;
	    	} else {
	    		value = i;
	    	}
	    	return value;
	    }
    }
    
    /**
     * Reports whether the given tag appears in the given {@code XMLTree}.
     * 
     * @param xml
     *            the {@code XMLTree}
     * @param tag
     *            the tag name
     * @return true if the given tag appears in the given {@code XMLTree},
     *         false otherwise
     * @ensures <pre>
     * findTag =
     *    [true if the given tag appears in the given {@code XMLTree}, false otherwise]
     * </pre>
     */
    private static boolean findTag(XMLTree xml, String tag) {
    	
    	for (int i=0; i<xml.numberOfChildren();i++) {
			if (findTag(xml.child(i),tag)) return true;
			boolean temp = xml.label().equals(tag);
			if (temp==true) return true;
		}
    	return false;
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
         * Initialize an array of NaturalNumbers with values 1 through 5.
         */
        NaturalNumber[] array = new NaturalNumber[5];
        NaturalNumber count = new NaturalNumber2(1);
        for (int i = 0; i < array.length; i++) {
            array[i] = new NaturalNumber2(count);
            count.increment();
            out.print(array[i] + " ");
        }
        out.println('\n');
        NaturalNumber temp = new NaturalNumber2(123456789);
        out.println(productOfDigits1(temp));
        out.println(temp);
        NaturalNumber temp2 = new NaturalNumber2(123456789);
        out.println(productOfDigits2(temp2));
        out.println(temp2);
        NaturalNumber temp3 = new NaturalNumber2(3023450);
        out.println(toInt(temp3));
        XMLTree xml = new XMLTree2("https://www.w3schools.com/php/links.xml");
        out.println(findTag(xml, "title"));
        
        
        
        
        
        
        
        
        
        
        
        
        in.close();
        out.close();
    }

}
