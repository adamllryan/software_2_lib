import java.io.*;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;


/**
 * Program to convert an XML RSS (version 2.0) feed from a given URL into the
 * corresponding HTML output file.
 * 
 * @author Put your name here
 * 
 */
public final class RSSReader {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private RSSReader() {
    }

    /**
     * Outputs the "opening" tags in the generated HTML file. These are the
     * expected elements generated by this method:
     * 
     * <html>
     * <head>
     * <title>the channel tag title as the page title</title>
     * </head>
     * <body>
     *  <h1>the page title inside a link to the <channel> link</h1>
     *  <p>the channel description</p>
     *  <table border="1">
     *   <tr>
     *    <th>Date</th>
     *    <th>Source</th>
     *    <th>News</th>
     *   </tr>
     * 
     * @param channel
     *            the channel element XMLTree
     * @param out
     *            the output stream
     * @updates out.content
     * @requires [the root of channel is a <channel> tag] and out.is_open
     * @ensures out.content = #out.content * [the HTML "opening" tags]
     */
    private static void outputHeader(XMLTree channel, SimpleWriter out) {
        assert channel != null : "Violation of: channel is not null";
        assert out != null : "Violation of: out is not null";
        assert channel.isTag() && channel.label().equals("channel") : ""
                + "Violation of: the label root of channel is a <channel> tag";
        assert out.isOpen() : "Violation of: out.is_open";
        out.print("<html>\n\t"//using lots of \t in here, looks messy but .html file looks good
        		+ "<head>\n\t\t"
        		+ "<title>");
        String title;// checks for title
        if (getChildElement(channel, "title") == -1) {
        	title = "Empty Title";
        } else {
        	title = channel.child(getChildElement(channel, "title")).child(0).label();
        } 
        out.print(title); 
        out.print("</title>\n\t"
        		+ "</head>\n\t<body>"
        		+ "\n\t\t"
        		+ "<h1><a href=\"");
        String link = channel.child(getChildElement(channel, "link")).child(0).label();
        out.print(link);//print the link
        out.print("\">");
        out.print(title);
        out.print("</a></h>\n\t\t"
        		+ "<p>");
        String description; //check for a description
        if (getChildElement(channel, "description") == -1) {
        description = "No description available";
        } else {
        description = channel.child(getChildElement(channel, "description")).child(0).label();
        }
        out.print(description);
        out.print("</p>\n\t\t"
        		+ "<table border=\"1\">\n\t\t\t"
        		+ "<tr>\n\t\t\t\t"
        		+ "<th>Date</th>"
        		+ "\n\t\t\t\t"
        		+ "<th>Source</th>\n\t\t\t\t"
        		+ "<th>News</th>\n\t\t\t"
        		+ "</tr>");
    }

    /**
     * Outputs the "closing" tags in the generated HTML file.  These are the
     * expected elements generated by this method:
     * 
     *  </table>
     * </body>
     * </html>
     * 
     * @param out
     *            the output stream
     * @updates out.contents
     * @requires out.is_open
     * @ensures out.content = #out.content * [the HTML "closing" tags]
     */
    private static void outputFooter(SimpleWriter out) {
        assert out != null : "Violation of: out is not null";
        assert out.isOpen() : "Violation of: out.is_open";
        out.print("\n\t\t"
        		+ "</table>\n\t"
        		+ "</body>\n"
        		+ "</html>");
    }

    /**
     * Finds the first occurrence of the given tag among the children of the
     * given {@code XMLTree} and return its index; returns -1 if not found.
     * 
     * @param xml
     *            the {@code XMLTree} to search
     * @param tag
     *            the tag to look for
     * @return the index of the first child of type tag of the {@code XMLTree}
     *         or -1 if not founda
     * @requires [the label of the root of xml is a tag]
     * @ensures <pre>
     * getChildElement =
     *  [the index of the first child of type tag of the {@code XMLTree} or
     *   -1 if not found]
     * </pre>
     */
    private static int getChildElement(XMLTree xml, String tag) {
        assert xml != null : "Violation of: xml is not null";
        assert tag != null : "Violation of: tag is not null";
        assert xml.isTag() : "Violation of: the label root of xml is a tag";
        int i = 0;
        int index = -1; //checks for index of a tag, outputs -1 if not there
        while (i<xml.numberOfChildren()) {
        	if (xml.child(i).label().equals(tag)) {
        		index = i;
        	}
        	i++; //forgetting this led to about 15 minutes of debug tracing just wanted to say
        }
        return index;
    }

    /**
     * Processes one news item and outputs one table row. The row contains three
     * elements: the publication date, the source, and the title (or
     * description) of the item.
     * 
     * @param item
     *            the news item
     * @param out
     *            the output stream
     * @updates out.content
     * @requires
     * [the label of the root of item is an <item> tag] and out.is_open
     * @ensures <pre>
     * out.content = #out.content *
     *   [an HTML table row with publication date, source, and title of news item]
     * </pre>
     */
    private static void processItem(XMLTree item, SimpleWriter out) {
        assert item != null : "Violation of: item is not null";
        assert out != null : "Violation of: out is not null";
        assert item.isTag() && item.label().equals("item") : ""
                + "Violation of: the label root of item is an <item> tag";
        assert out.isOpen() : "Violation of: out.is_open";
        out.print("\n\t\t\t<tr>\n\t\t\t\t<td>");
        String date; //check for the date
        if (getChildElement(item, "pubDate") == -1) {
            date = "No date available";
            } else {
            date = item.child(getChildElement(item, "pubDate")).child(0).label();
            }
        out.print(date);
        out.print("</td>\n\t\t\t\t<td>");
        
        String source = "No source available";
        String slink = "";
        //check for source
        if (getChildElement(item, "source") == -1) {
            out.print(source);
            out.print("</td>\n\t\t\t\t<td>");
            } else {
            if (item.child(getChildElement(item, "source")).numberOfChildren()>0) {
            	source = item.child(getChildElement(item, "source")).child(0).label();
            	slink = item.child(getChildElement(item, "source")).attributeValue("url");
            	out.print("<a href=\"");
                out.print(slink);
                out.print("\">");
            }
            out.print(source);
            out.print("</a></td>\n\t\t\t\t<td>");
            }
        
        
        String news = "No title available";
        String nlink = ""; 
        //check if there is a description, will be overwritten if there is a title
        if (getChildElement(item, "description") != -1) {
        	if (item.child(getChildElement(item, "description")).numberOfChildren()>0) {
        		news = item.child(getChildElement(item, "description")).child(0).label();
        	}
        }
        //independent check for title
        if (getChildElement(item, "title") != -1) {
        	if (item.child(getChildElement(item, "title")).numberOfChildren()>0) {
        		news = item.child(getChildElement(item, "title")).child(0).label();
        	}
        }
        //independent check for link to article
        if (getChildElement(item, "link") != -1) {
        	nlink = item.child(getChildElement(item, "link")).child(0).label();
        }
        //case for if link exists or not, omits the a href if there is no link
        if (nlink.equals("")) {
        	out.print(news);
            out.print("</td>\n\t\t\t"
            		+ "</tr>");
        } else {
        	out.print("<a href=\"");
        	out.print(nlink);
            out.print("\">");
            out.print(news);
            out.print("</a></td>\n\t\t\t"
            		+ "</tr>");
        }
        
    }

    
    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments; unused here
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        //get output directory from user
        out.println("Input an output file(include .html): ");
        SimpleWriter output = new SimpleWriter1L(in.nextLine());
        out.println("Input a link: ");
        String link = in.nextLine();
        XMLTree xml = new XMLTree1(link);
        XMLTree channel = xml.child(0);
        //makes sure that link is valid rss 2.0 as per instructions
        if (xml.isTag()) {
        	if (xml.label().equals("rss")) {
	        	if (xml.hasAttribute("version")) {
	        		if (xml.attributeValue("version").equals("2.0")) {
			        	//call to each method
				        outputHeader(channel, output); 
				        //calls once for every child item in channel
				        for (int i = 0; i<channel.numberOfChildren(); i++) {
				        	if (channel.child(i).label().equals("item")) {
				        		processItem(channel.child(i), output);
				        	} 
				        }
				        outputFooter(output);
	        		} else {
	        			out.println("rss is not v2.0");
	        		}
	        	} else {
	        		out.println("rss is missing version");
	        	}
        	} else {
        		out.println("link is not rss");
        	}
        } else {
        	out.print("root is not a tag");
        }
        in.close();
        out.close();
    }
}		