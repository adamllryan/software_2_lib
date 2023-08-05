/*Adam Ryan
 * Moga 3
 * #3
 */
import java.util.*;
public class number3 {
	public static void main(String[] args) {
		int it=0, input;
		double pi=0;
		boolean toggle = true;
		Scanner reader = new Scanner(System.in);
		for (int i=0; i<3;i++) {
			System.out.println("Print number of iterations: ");
			input = reader.nextInt();
			it=0;
			pi=0;
			toggle = true;
			while (it <= input-1) {
				if (toggle) {
					pi += (double)1 / (1+2*it);
					toggle = false;
				
				} else {
					pi -= (double)1 / (1+2*it);
					toggle = true;
				}
				it++;
			}
			System.out.println("Pi is about: " + 4*pi);
		}
		reader.close();
	}
}
/*Print number of iterations: 
128
Pi is about: 3.13378027278999
Print number of iterations: 
129
Pi is about: 3.1493444751246202
Print number of iterations: 
130
Pi is about: 3.133900459680605
*/