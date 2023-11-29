import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.queue.*;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework17 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework17() {
    }
    
   
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Reverses ("flips") {@code this}.
     * 
     * @updates s
     * @ensures s = rev(#s)
     */
    public static void flip(Queue<String> s) {
    	String i = s.dequeue();
    	if (s.length()>0)
    		s.flip();
    	s.enqueue(i);
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
         * Put your main program code here
         */
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
