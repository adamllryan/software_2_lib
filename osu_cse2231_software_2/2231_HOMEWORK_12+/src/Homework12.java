import java.util.Iterator;

import org.w3c.dom.Node;

import components.binarytree.*;

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
     * Returns the size of the given {@code BinaryTree<T>}.
     * 
     * @param <T>
     *            the type of the {@code BinaryTree} node labels
     * @param t
     *            the {@code BinaryTree} whose size to return
     * @return the size of the given {@code BinaryTree}
     * @ensures size = |t|
     */
    public static <T> int size(BinaryTree<T> t) {
    	BinaryTree<T> left = t.newInstance(), right = t.newInstance();
    	//I feel like I'm doing this wrong; is there any similar isEmpty() method?
    	if (!left.equals(t)) {
    		int count = 0;
    		T root = t.disassemble(left, right);
	    	count=size(t);
	    	t.assemble(root, left, right);
	    	return count;
    	}
    	return 0;
    }
    public static <T> int size_iterative(BinaryTree<T> t) {
    	int count = 0;
    	Iterator<T> i = t.iterator();
    	while (i.hasNext()) {
    		i.next();
    		count++;
    	}
    	return count;
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
