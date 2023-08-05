import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.utilities.Reporter;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;
import components.naturalnumber.*;

/**
 * Program to evaluate XMLTree expressions of {@code int}.
 * 
 * @author Put your name here
 * 
 */
public final class XMLTreeNNExpressionEvaluator {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private XMLTreeNNExpressionEvaluator() {
    }

    /**
     * Evaluate the given expression.
     * 
     * @param exp
     *            the {@code XMLTree} representing the expression
     * @return the value of the expression
     * @requires <pre>
     * [exp is a subtree of a well-formed XML arithmetic expression]  and
     *  [the label of the root of exp is not "expression"] and
     *  [attribute values of number tags are positive] and 
     *  [operation will result in a defined, positive evaluation]
     * </pre>
     * @ensures evaluate = [the value of the expression] and
     * 	evaluate != [negative or undefined]
     */
    private static NaturalNumber evaluate(XMLTree exp) {
    	assert exp != null : "Violation of: exp is not null";
        NaturalNumber one = null, two = null;
    	switch (exp.label()) { //get the root label
        case "number":
        	//numbers have to be positive or else the program will not generate, but I put this here anyways in case this is a user edited file 
    		components.utilities.Reporter.assertElseFatalError(exp.attributeValue("value").indexOf('-')==-1, "number value is less than zero");
        	return new NaturalNumber2(exp.attributeValue("value"));
        case "plus":
        	//no checks here because a positive plus positive will always be positive and defined
    		one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		one.add(two);
    		return one;
        case "times":
        	//no checks here because a positive times a positive will always be positive and defined, also a whole number
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		one.multiply(two);
    		return one;
        case "minus":
        	//will report fatal error if one<two, which will mean the result is negative
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));//what if you have the case 1-2+10? it technically should be 9 but there is no way that I can think of to avoid this
    		components.utilities.Reporter.assertElseFatalError(one.compareTo(two)>0, "(" + one + "-" + two + "): subtraction will result in a value less than zero");
    		one.subtract(two);
    		return one;
        case "divide": 
        	//reports if two is zero which will result in a divide by zero error, no negative check because a positive/positive is always positive or zero
        	one = evaluate(exp.child(0));
    		two = evaluate(exp.child(1));
    		components.utilities.Reporter.assertElseFatalError(!two.isZero(), "(" + one + "/" + two + "): division attempts to divide by zero");
    		one.divide(two);
    		return one;
        default: 
        	//report if tag name is invalid in case another operator is used like % and ^
    		components.utilities.Reporter.fatalErrorToConsole("one or more tags are improperly named");
        	return null; //unreachable but there for syntax
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