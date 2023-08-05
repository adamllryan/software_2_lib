package htmlprocessing;

import java.util.*;

public class methods {

    //a.)
    public static String findFirstTag(String text) {
        int start = text.indexOf('<');
        int end = text.indexOf('>') + 1;
        if (text.indexOf('<')>-1) {
            String str = text.substring(start, end);
            return str;
        } else {
            return null;
        }

    }
    public static String remove(String text, String str) {
        if (str.indexOf(text)>-1) {
            String start = str.substring(0, str.indexOf(text));
            String end = str.substring(str.indexOf(text) + text.length(), str.length());

            str = start + end;
        }
        return str;
    }
    public static String removeAllTags(String text) {
        int end = 0;
        while (end==0) {
            if (findFirstTag(text)!=null) {
                String first = findFirstTag(text);
                int second = text.indexOf("</" + first.substring(1,first.length()-1) + '>');
                if (first == null || second == -1) return "Error";
                text = remove(findFirstTag(text),text).trim();
                text = remove("</" + first.substring(1,first.length()-1) + '>',text).trim();
            } else {
                end = -1;
                return text;
            }
        }
        return text;
    }
}
/*This is the original:
Cap and gowns will be <i> distributed</i> by unit <i>principals</i> in the <b>auditorium<u> at Commencement</u>practice</b>.
This is the first tag:
<i>
This is the original with the first tag removed:
Cap and gowns will be  distributed</i> by unit <i>principals</i> in the <b>auditorium<u> at Commencement</u>practice</b>.
This is the original with all tags removed:
Cap and gowns will be  distributed by unit principals in the auditorium at Commencementpractice.
This is the original with all tags removed:
Error
*/