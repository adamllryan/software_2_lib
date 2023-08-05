/*Adam Ryan
 * Moga 3
 * Registrar
 */

import java.util.Scanner;
public class Registrar {

	public static void main(String[] args) {
		String firstName, lastName, campusPhone;
		int classYear;
		
		Scanner reader = new Scanner(System.in);
		Freshman freshman = new Freshman();
		
		System.out.print("Enter your First Name: ");
		firstName  = reader.nextLine();
		freshman.setFirstName(firstName);
		
		System.out.print("Enter your Last Name: ");
		lastName = reader.nextLine();
		freshman.setLastName(lastName);
		
		System.out.print("Enter your Phone: ");
		campusPhone = reader.nextLine();
		freshman.setCampusPhone(campusPhone);
		
		System.out.print("Enter your Grad year: ");
		classYear = reader.nextInt();
		freshman.setClassYear(classYear);
		
		reader.close();
		
		System.out.print(freshman);
	}

}
/*Enter your First Name: Adam
Enter your Last Name: Ryan
Enter your Phone: 12367215
Enter your Grad year: 2021
Ryan, Adam. 
PhoneData: 12367215
Year: 2021*/