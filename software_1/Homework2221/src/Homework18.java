import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.queue.*;
import java.util.Comparator;
/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework18 implements Comparator<String> {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework18() {
    }
    
    /**
    * Removes and returns the minimum value from {@code q} according to the
    * ordering provided by the {@code compare} method from {@code order}.
    * 
    * @param q
    *            the queue
    * @param order
    *            ordering by which to compare entries
    * @return the minimum value from {@code q}
    * @updates q
    * @requires <pre>
    * q /= empty_string  and
    *  [the relation computed by order.compare is a total preorder]
    * </pre>
    * @ensures <pre>
    * perms(q * <removeMin>, #q)  and
    *  for all x: string of character
    *      where (x is in entries (q))
    *    ([relation computed by order.compare method](removeMin, x))
    * </pre>
    */
   private static String removeMin(Queue<String> q, Comparator<String> order) {
	   int size = q.length(); 
	   String min =  q.dequeue();
	   q.enqueue(min);
	   for (int i = 1; i<size; i++) {
		   String temp = q.dequeue();
		   if (order.compare(min, temp)<0) min = temp; 
		   q.enqueue(temp);
	   }
	return min;   
   }

   /**
    * Sorts {@code q} according to the ordering provided by the {@code compare}
    * method from {@code order}.
    * 
    * @param q
    *            the queue
    * @param order
    *            ordering by which to sort
    * @updates q
    * @requires [the relation computed by order.compare is a total preorder]
    * @ensures q = [#q ordered by the relation computed by order.compare]
    */
   public static void sort(Queue<String> q, Comparator<String> order) {
	   Queue<String> temp = new Queue2<String>();
	   while (q.length()>0) {
		   temp.enqueue(removeMin(q, order));
	   }
	   q.transferFrom(temp);
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
        Queue<String> s = new Queue2<String>();
        s.enqueue("a");
        s.enqueue("b");
        s.enqueue("c");
        s.enqueue("d");
        in.close();
        out.close();
    }

	@Override
	public int compare(String o1, String o2) {
		if (o1 == o2)
			return 0;
		if (o1==null)
			return -1;
		if (o2==null)
			return 1;
		return o1.compareTo(o2);
	}
	

}
