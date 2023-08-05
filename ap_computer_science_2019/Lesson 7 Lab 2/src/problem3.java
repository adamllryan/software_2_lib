/*Adam Ryan
 * Moga 3
 * 12 December 2019
 * Problem 3
 */
import java.util.*;
public class problem3 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Input name: ");
		String n = r.nextLine();
		n = convertName(n);
		System.out.println(n);
		seperateNames(n);
	}
private static String convertName(String nm) {
		
		String firstName = nm.trim();
		firstName = firstName.substring(0, firstName.indexOf(" "));
		System.out.println("First name: " + firstName + "\n");
		String lastName = nm.substring(nm.indexOf(firstName)+firstName.length()).trim();
		String str = lastName + ", " + firstName;
		return str;
	}
	private static void seperateNames(String nm) {
		String lastName = nm.substring(0, nm.indexOf(", "));
		String firstName = nm.substring(nm.indexOf(" ")).trim();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
}
/*Input name: 
Martha       Smith     
First name: Martha

Smith, Martha
First Name: Martha
Last Name: Smith*/