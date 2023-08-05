import components.sequence.Sequence;
import components.tree.Tree;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework21 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework21() {
    }

    /**
     * Returns the size of the given {@code Tree<T>}.
     * 
     * @param <T>
     *            the type of the {@code Tree} node labels
     * @param t
     *            the {@code Tree} whose size to return
     * @return the size of the given {@code Tree}
     * @ensures size = |t|
     */
    public static <T> int size(Tree<T> t) {
    	
    	int sum = 0;
    	Sequence<Tree<T>> children = t.newSequenceOfTree();
    	T root = t.disassemble(children);
    	if (children.length()>0)
    		for (Tree<T> item : children)
    			sum += size(item);
    	t.assemble(root, children);
    	return sum;
    }
    
    /**
     * Returns the height of the given {@code Tree<T>}.
     * 
     * @param <T>
     *            the type of the {@code Tree} node labels
     * @param t
     *            the {@code Tree} whose height to return
     * @return the height of the given {@code Tree}
     * @ensures height = ht(t)
     */
    public static <T> int height(Tree<T> t) {
    	
    	int height = 1;
    	Sequence<Tree<T>> children = t.newSequenceOfTree();
    	T root = t.disassemble(children);
    	if (children.length()>0)
    		
    		for (Tree<T> item : children) {
    			int subHeight = size(item);
    			if (height<subHeight)
    				height = subHeight;
    		}
    	else 
    		height = 0;
    	t.assemble(root, children);
    	return height;
    	
    }
    
    /**
     * Returns the largest integer in the given {@code Tree<Integer>}.
     * 
     * @param t
     *            the {@code Tree<Integer>} whose largest integer to return
     * @return the largest integer in the given {@code Tree<Integer>}
     * @requires |t| > 0
     * @ensures <pre>
     * max is in labels(t)  and
     * for all i: integer where (i is in labels(t)) (i <= max)
     * </pre>
     */
    public static int max(Tree<Integer> t) {
    	
    	
    	Sequence<Tree<Integer>> children = t.newSequenceOfTree();
    	int root = t.disassemble(children);
    	int max = root;
    	if (children.length()>0)
    		for (Tree<Integer> item : children) {
    			int subMax = size(item);
    			if (root<subMax)
    				max = subMax;
    		}
    	else 
    		max = 0;
    	t.assemble(root, children);
    	return max;
    	
    	
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
