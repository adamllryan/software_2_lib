/*Adam Ryan
 *Moga 3
 *Chapter 3 Lab 1 Sphere Calculator 
 * 10 September 2019
 * */
import java.util.Scanner;
public class SphereCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double radius;
		final double PI = 3.141592653589793238426;
		System.out.print("\t'Sphere Info' \n\nEnter radius(inches):\t");
		radius = reader.nextDouble();
		double diameter = radius * 2;
		double surfaceArea = 4 * PI * radius * radius;
		double volume = (4. / 3.) * PI * radius * radius * radius;
		System.out.println("\nDiameter=\t\t" + diameter + "\nSurface Ares=\t\t" + surfaceArea + "\nVolume=\t\t\t" + 
		volume);
		reader.close();
	}

}
/*	'Sphere Info' 

Enter radius(inches):	1.5

Diameter=		3.0
Surface Ares=		28.274333882308138
Volume=			14.137166941154069
*/
