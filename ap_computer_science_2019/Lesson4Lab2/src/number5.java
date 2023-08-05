import java.io.*; 
import java.util.Scanner;
public class number5 {
	public static void main(String[] args) {
		int exp=2, base=1; 
		try {
			File file = new File("number5.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				base=reader.nextInt();
				exp=reader.nextInt();
				if (base >= 1 && base <=20) {
					if (exp >= 2 && exp <= 15) {
					System.out.println("\n\nThe base is " + base);
					System.out.println("The exponent is " + exp);
					System.out.print("Answers are: ");
					for (int j=0; j<=exp; j++) {
						System.out.print(Math.pow(base, j) + ", ");
						
					}
					} else {
						System.out.print("\n\nExponent " + exp + " must be between 2 and 15");
					}
				} else {
					System.out.print("\n\nBase " + base + " must be between 1 and 20");
				}
			  } 
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		
		
		
	}
}
/*

The base is 2
The exponent is 8
Answers are: 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 

The base is 3
The exponent is 5
Answers are: 1.0, 3.0, 9.0, 27.0, 81.0, 243.0, 

Exponent 18 must be between 2 and 15

The base is 10
The exponent is 4
Answers are: 1.0, 10.0, 100.0, 1000.0, 10000.0, 

Exponent 16 must be between 2 and 15
*/