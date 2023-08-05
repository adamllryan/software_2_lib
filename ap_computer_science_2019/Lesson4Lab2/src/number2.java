/*Adam Ryan
 * Moga 3
 * #2
 */
import java.util.*;
public class number2 {
	public static void main(String[] args) {
		System.out.print("Enter positive integer: ");
		Scanner reader = new Scanner(System.in);
		
		int pos = reader.nextInt(), div=1;	
		if (pos > 0) {
		for (int i=1; i<pos; i++) {
				if ((pos%i) == 0 && (i != 1 && i != pos)) {
					System.out.println("A divisor is: " + i);
					div = i;
				}
			}
		if (div != 1) 
			System.out.println("\nnot prime");
		else
			System.out.println("\nprime");
		} else {
			System.out.println("Number is not above zero");
		}
		reader.close();
		
	}
	}
/*Enter positive integer: 144
A divisor is: 2
A divisor is: 3
A divisor is: 4
A divisor is: 6
A divisor is: 8
A divisor is: 9
A divisor is: 12
A divisor is: 16
A divisor is: 18
A divisor is: 24
A divisor is: 36
A divisor is: 48
A divisor is: 72

not prime
*/
/*Enter positive integer: 1061

prime
*/
