/*Adam Ryan
 * Moga 3
 * 12 December 2019
 * Problem 4
 */
import java.util.*;
public class prolem4 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Input first: ");
		String first = r.nextLine();
		System.out.println("Input second: ");
		String second = r.nextLine();
		System.out.println(aS(first, second));	
		
		
		
		
		

	}
	public static String aS(String s1, String s2) {
		String sv1 = s1;
		String sv2 = s2;
		String str = "";
		sv1 = sv1.trim();
		sv2 = sv2.trim();
		if (sv1.compareTo(sv2) > 0) {
			str = sv2 + " " + sv1;
		} else {str = sv1 + " " + sv2;}
		
		return str;
	}
}
/*Input first: 
happy
Input second: 
birthday
birthday happy
*/