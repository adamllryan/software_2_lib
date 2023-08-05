/*
 Adam Ryan
 Moga 3
 3-2 Lab Problem 1
 */
import java.util.Scanner;

public class Terminal_IO {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String name;
		int age;
		double weight;
		
		System.out.print("Enter your age (an integer): ");
		age = reader.nextInt();
		System.out.print("Enter your weight (a double): ");
		weight = reader.nextDouble();
		reader.nextLine();//consumes the newline character
		System.out.print("Enter your name (a string): ");
		name = reader.nextLine();
		System.out.println("Greetings "  + name + ". You are " + + age + " years old and you weigh " + weight + " pounds.");
	reader.close();
	}
}
/*Enter your age (an integer): 5
Enter your weight (a double): 10
Enter your name (a string): yes
Greetings yes. You are 5 years old and you weigh 10.0 pounds.*/