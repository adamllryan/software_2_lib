/*
 * Adam Ryan
 * Moga 3
 * 29 Aug 2019
 * Momentum Calculator
 */
import java.util.Scanner;
public class MomentumCalc {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);//create scanner
		double numMass = 0;
		double numVelocity = 0;
			System.out.print("Enter Mass in kg: ");
			numMass = reader.nextDouble();//prompt
			System.out.print("Enter Velocity in m/s: ");
			numVelocity = reader.nextDouble();//prompt
			System.out.print("The Momentum is : " + numMass * numVelocity + "kg*m, \nand the kinetic energy is: " + (numMass * numVelocity * numVelocity) / 2 + "km/s^2");//does math
			
		reader.close();//close scanner
	}
}
/*Enter Mass in kg: 10.3
Enter Velocity in m/s: 5.25
The Momentum is : 54.075kg*m, 
and the kinetic energy is: 141.946875km/s^2
*/
