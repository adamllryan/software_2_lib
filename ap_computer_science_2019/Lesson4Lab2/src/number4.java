import java.util.*;
public class number4 {
	public static void main(String[] args) {
		int exp=2, base=1; 
		Scanner reader = new Scanner(System.in);
		int i=0;
		while (i==0) {
			System.out.println("Please enter an integer 1-20: ");
			base = reader.nextInt();
			if (base >= 1 && base <=20) {
				i++;
			}
			}
		i=0;
		while (i==0) {
			System.out.println("Please enter an integer 2-15: ");
			exp = reader.nextInt();
			if (exp >= 2 && exp <=15) {
				i++;
			}
		}
		System.out.println("The base is " + base);
		System.out.println("The exponent is " + exp);
		System.out.print("Answers are: ");
		for (int j=0; j<=exp; j++) {
			System.out.print(Math.pow(base, j) + ", ");
			
		}
		reader.close();
	}
}
/*
 * Please enter an integer 1-20: 
5
Please enter an integer 2-15: 
5
The base is 5
The exponent is 5
Answers are: 1.0, 5.0, 25.0, 125.0, 625.0, 3125.0, 
 */

