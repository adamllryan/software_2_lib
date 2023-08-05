import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.utilities.Reporter;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

/**
 * Program to evaluate XMLTree expressions of {@code int}.
 * 
 * @author Put your name here
 * 
 */
public final class XMLTreeIntExpressionEvaluator {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private XMLTreeIntExpressionEvaluator() {
    }

    /**
     * Evaluate the given expression.
     * 
     * @param exp
     *            the {@code XMLTree} representing the expression
     * @return the value of the expression
     * @requires <pre>
     * [exp is a subtree of a well-formed XML arithmetic expression]  and
     *  [the label of the root of exp is not "expression"]
     * </pre>
     * @ensures evaluate = [the value of the expression]
     */
    private static int evaluate(XMLTree exp) {
        assert exp != null : "Violation of: exp is not null";
        int one, two;
        switch (exp.label()) {
        case "number": //pull value from number tag
        	String val = exp.attributeValue("value");
        	return Integer.parseInt(val);
        case "plus": //add two values
    		one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		return one+two;
        case "times": //multiply two values
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		return one*two;
        case "minus": // subtract two values
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		return one-two;
        case "divide": // divide two values
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		//instructions says no checks are required but this one should at least be here, should also be one that prevents overflow
    		components.utilities.Reporter.assertElseFatalError(two!=0, "division attempts to divide by zero");
    		return one/two;
        default: 
        	return 0;
        }
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

        out.print("Enter the name of an expression XML file: ");
        String file = in.nextLine();
        while (!file.equals("")) {
            XMLTree exp = new XMLTree1(file);
            out.println(evaluate(exp.child(0)));
            out.print("Enter the name of an expression XML file: ");
            file = in.nextLine();
        }

        in.close();
        out.close();
    }

}