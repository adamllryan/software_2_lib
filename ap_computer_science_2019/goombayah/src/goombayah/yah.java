package goombayah;
/*Adam Ryan
 * Moga 3
 * Distance calc
 * 
 * 
 * 
 * 
 * 
*/
 
import java.util.*;

public class yah {
	public static void main(String[] args) {
		System.out.println(Math.round(1.49));
		System.out.println(Math.round(1.50));
		System.out.println(Math.round(-1.49));
		System.out.println(Math.round(-1.50));
		System.out.println(Math.ceil(1.49));
		System.out.println(Math.ceil(1.50));
		System.out.println(Math.ceil(-1.49));
		System.out.println(Math.ceil(-1.50));
		System.out.println(Math.floor(1.49));
		System.out.println(Math.floor(1.50));
		System.out.println(Math.floor(-1.49));
		System.out.println(Math.floor(-1.50));
		System.out.println("PI= " + Math.PI);
		System.out.println((double)2/8);
		System.out.println(1/(int)4.0);
		System.out.println(Math.abs(-4));
		System.out.println(Math.abs(-6.55));
		System.out.println(Math.pow(2, 5));
		Random g = new Random();
		System.out.println(g.nextInt(10));
		System.out.println(g.nextInt(10) + 1);
		System.out.println(g.nextInt(10) + 5);
		System.out.println(g.nextDouble());
		System.out.println(g.nextDouble()*6);
		Scanner reader = new Scanner(System.in);
		System.out.println("Input X1: ");
		double x1 = reader.nextDouble();
		System.out.println("Input Y1: ");
		double y1 = reader.nextDouble();
		System.out.println("Input X2: ");
		double x2 = reader.nextDouble();
		System.out.println("Input Y2: ");
		double y2 = reader.nextDouble();
		System.out.println("The distance is: " + Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
	}
}
