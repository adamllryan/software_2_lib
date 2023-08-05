import components.simplewriter.SimpleWriter;
import components.sequence.*;
import components.simplewriter.SimpleWriter1L;
import components.map.*;

public final class Homework3 {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private Homework3() {
        // no code needed here
    }
    
    /**
     * No informal description here for obvious reasons...
     * 
     * @returns s2
     * 				the smoothed sequence
     * @requires |s1| >= 1 
     * @ensures <pre>
     * |s2| = |s1| - 1  and
     *  for all i, j: integer, a, b: string of integer
     *      where (s1 = a * <i> * <j> * b)
     *    (there exists c, d: string of integer
     *       (|c| = |a|  and
     *        s2 = c * <(i+j)/2> * d))
     * </pre>
     */
    public static Sequence<Integer> smooth(Sequence<Integer> s1) {
    	assert s1.length()>0 : "Violation of: |s1| >= 1";
    	
    	/*
    	Sequence<Integer> s2 = new Sequence1L<Integer>();
    	for (int i = 0;i<s1.length()-1;i++)  
    		s2.add(i, (int)(((long)s1.entry(i)+(long)s1.entry(i+1))/2L));
    	System.out.print(s2.toString());
    	return s2;
    	*/
    	
    	
    	if (s1.length()==1) {
    		return new Sequence1L<Integer>();
    	} else {
    		long i = (long)s1.remove(0);
    		long i2 = (long)s1.entry(0);
    		Sequence<Integer> s2 = smooth(s1);
    		s2.add(0, (int)((i+i2)/2L));
    		s1.add(0, (int)i);
    		return s2;
    	}
    	
    	
    }
    

}
