/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework4 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework4() {
    }
    public static String padZeros(String s) {
    	while (s.length()<32)
    		s = "0" + s;
    	return s;
    	
    }
    /**
     * Returns the integer average of two given {@code int}s.
     * 
     * @param j
     *            the first of two integers to average
     * @param k
     *            the second of two integers to average
     * @return the integer average of j and k
     * @ensures average = (j+k)/2
     */
    public static int average(int j, int k) {
    	//divide both by 2 and if both are odd and positive add 1, if both are odd and negative add -1
    	return j/2 + k/2 + ((j%2==1&&k%2==1) ? 1:0 + ((j%2==-1&&k%2==-1) ? -1:0));
    }
    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Put your main program code here
         */
    }

}
