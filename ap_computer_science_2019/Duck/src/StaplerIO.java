/*Adam Ryan
 * Moga 3
 * Stplrio
 */

import java.util.Scanner;
public class StaplerIO {

	public static void main(String[] args) {
		int remainingStaples,maxStaples,remainingStaples2,maxStaples2;
		String color,color2,staple;
		Scanner reader = new Scanner(System.in);
		stapler stapler = new stapler();
		System.out.print("Enter Color: ");
		color = reader.nextLine();
		stapler.setColor(color);
		System.out.print("Enter Max Staples: ");
		maxStaples = reader.nextInt();
		stapler.setMaxStaples(maxStaples);
		System.out.print("Enter Current Staples: ");
		remainingStaples = reader.nextInt();
		stapler.setRemainingStaples(remainingStaples);
		staple = reader.nextLine();
		System.out.println("Would you like to add a second stapler? (Y/N)");
		staple = reader.nextLine();
		if (staple.equals("Y") || staple.equals("y")) {
			System.out.print("Enter Color: ");
			color2 = reader.nextLine();
			stapler.setColor(color2);
			System.out.print("Enter Max Staples: ");
			maxStaples2 = reader.nextInt();
			stapler.setMaxStaples2(maxStaples2);
			System.out.print("Enter Current Staples: ");
			remainingStaples2 = reader.nextInt();
			stapler.setRemainingStaples2(remainingStaples2);
			staple = reader.nextLine();
		}
		System.out.print("\n-------------------\nStapler Attributes: \n-------------------\n" + stapler);
		System.out.println("\nWould you like to staple? (Y/N)");
		boolean i=true;
		
		
		while (i) {
			staple = reader.nextLine();
			if (staple.equals("Y") || staple.equals("y") && stapler.getRemainingStaples() > 0) {
				stapler.staple();
				System.out.println("You have this many staples left: " + stapler.getRemainingStaples());
			} else if 
			(staple.equals("N") || staple.equals("n")) {
				i=true;
			} else if (stapler.getRemainingStaples() <= 0) {
				i=false;
				System.out.println("You have no more Staples");
			} else {
				System.out.println("Error Try Again");
			}
		}
		reader.close();
	}

}
/*Enter Color: red
Enter Max Staples: 5
Enter Current Staples: 5
Would you like to add a second stapler? (Y/N)
n

-------------------
Stapler Attributes: 
-------------------

Remaining Staples: 5
Max Staples: 5
Color: red
Would you like to staple? (Y/N)
y
You have this many staples left: 4
y
You have this many staples left: 3
y
You have this many staples left: 2
y
You have this many staples left: 1
y
You have this many staples left: 0
y
You have no more Staples
*/
/*
 Enter Color: red
Enter Max Staples: 256
Enter Current Staples: 32
Would you like to add a second stapler? (Y/N)
y
Enter Color: green
Enter Max Staples: 5
Enter Current Staples: 5

-------------------
Stapler Attributes: 
-------------------

Remaining Staples: 32
Max Staples: 256
Color: green
Would you like to staple? (Y/N)
y
You have this many staples left: 31
y
You have this many staples left: 30
y
You have this many staples left: 29
y
You have this many staples left: 28
y
yYou have this many staples left: 27

You have this many staples left: 26
y
You have this many staples left: 25
y
You have this many staples left: 24
y
You have this many staples left: 23
y
You have this many staples left: 22
y
yYou have this many staples left: 21

yYou have this many staples left: 20

You have this many staples left: 19
y
You have this many staples left: 18
y
You have this many staples left: 17
y
You have this many staples left: 16
y
yYou have this many staples left: 15

You have this many staples left: 14
y
You have this many staples left: 13
y
You have this many staples left: 12
y
You have this many staples left: 11
y
You have this many staples left: 10
y
You have this many staples left: 9
y
You have this many staples left: 8
y
You have this many staples left: 7
y
You have this many staples left: 6
y
yYou have this many staples left: 5

You have this many staples left: 4
y
You have this many staples left: 3
y
You have this many staples left: 2
y
You have this many staples left: 1
y
You have this many staples left: 0
y
You have no more Staples

 * */
