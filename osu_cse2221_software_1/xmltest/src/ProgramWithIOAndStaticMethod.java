import components.simplereader.SimpleReader;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class ProgramWithIOAndStaticMethod {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ProgramWithIOAndStaticMethod() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static void myMethod() {
    	XMLTree menu = new XMLTree1("C:/Users/Adam/Downloads/xml.xml");
    	System.out.println(menu.isTag());
    	System.out.println(menu.label());
    	System.out.println(menu.numberOfChildren());
    	System.out.println(menu.hasAttribute("calories"));
    	System.out.println(menu.child(1));
    	System.out.println(menu.child(1).isTag());
		System.out.println(menu.child(1).label());
		System.out.println(menu.child(1).numberOfChildren());
		System.out.println(menu.child(1).hasAttribute("calories"));
		System.out.println(menu.child(1).attributeValue("calories"));
		System.out.println(menu.child(1).child(0).isTag());
		System.out.println(menu.child(1).child(0).child(0).isTag());
		System.out.println(menu.child(1).child(0).child(0).label());

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
         * Put your main program code here; it may call myMethod as shown
         */
        myMethod();
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
