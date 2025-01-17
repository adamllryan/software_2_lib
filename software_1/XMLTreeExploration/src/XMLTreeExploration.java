import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;





/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class XMLTreeExploration {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private XMLTreeExploration() {
    }
    
    /**
     * Output information about the middle child of the given {@code XMLTree}.
     * 
     * @param xt
     *            the {@code XMLTree} whose middle child is to be printed
     * @param out
     *            the output stream
     * @updates out.content
     * @requires <pre>
     * [the label of the root of xt is a tag]  and
     * [xt has at least one child]  and  out.is_open
     * </pre>
     * @ensures <pre>
     * out.content = #out.content * [the label of the middle child
     *  of xt, whether the root of the middle child is a tag or text,
     *  and if it is a tag, the number of children of the middle child]
     * </pre>
     */
    private static void printMiddleNode(XMLTree xt, SimpleWriter out) {
    	
    	
    	out.println("\nMiddle Child is called " + xt.child(xt.numberOfChildren()/2).label());
    	out.print("Middle Child is a ");
    	out.println(xt.child(xt.numberOfChildren()/2).isTag() ? "tag" : "label");
    	if (xt.child(xt.numberOfChildren()/2).isTag()) {
    		out.println("Children are: ");
    		for (int i = 0; i<xt.numberOfChildren(); i++) {
    			out.println(xt.child(i).label());
    		}
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
        
        XMLTree xml =
        	    new XMLTree1("http://web.cse.ohio-state.edu/software/2221/web-sw1/" 
        	        + "extras/instructions/xmltree-model/columbus-weather.xml");
        
        
        out.print(xml.label() + " is a ");
        out.println((xml.isTag()) ? "tag" : "label");
        
        XMLTree results = xml.child(0);
        XMLTree channel = results.child(0);
        out.println(channel.label() + " has " + channel.numberOfChildren() + " children");
        XMLTree title = channel.child(1);
        XMLTree titleText = title.child(0);
        out.println(titleText.label());
        out.println(xml.child(0).child(0).child(1).child(0).label());
        
        XMLTree astronomy = channel.child(10);
        out.println("astronomy has attibute sunset: " + astronomy.hasAttribute("sunset"));
        out.println("astronomy has attibute midday: " + astronomy.hasAttribute("midday"));
        out.println("sunrise: " + astronomy.attributeValue("sunrise"));
        out.println("sunset: " + astronomy.attributeValue("sunset"));
        
        
        //out.print(xml.toString());
        xml.display();
        printMiddleNode(channel, out);
        
        
        
        
        
        
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
