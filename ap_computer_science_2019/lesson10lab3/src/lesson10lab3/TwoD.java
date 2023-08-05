package lesson10lab3;
import java.util.*;
public class TwoD {
	
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		int[][] DD = new int[5][10];
		int inc = -1;
		while (inc < 1 || inc > 4) {
			System.out.print("Please input a number *1-4*: ");
			inc = re.nextInt();
			System.out.println();
		}
		
		for (int r = 0; r<5; r++) {
			for (int c = 0; c<10; c++) {
				DD[r][c] = (10 * inc * r)+ (inc * c);
			}
		}
		for (int r = 0; r<DD.length; r++) {
			
			for (int c = 0; c<DD[0].length; c++) {
				System.out.print(DD[r][c] + "\t");
			}
			System.out.println();
		}
		
		double [] average = {0,0,0,0,0};
		for (int r = 0; r<DD.length; r++) {
			for (int c = 0; c<DD[0].length; c++) {
				average[r] += DD[r][c];
			}
			average[r]/=10;
		}
		
		
		System.out.println("\nAverage[]: \n");
		for (int r = 0; r<DD.length; r++) {
			
				System.out.print(average[r] + "\t");
			
		}
		System.out.print("\n\nEnter an int to search: ");
		int s = re.nextInt();
		System.out.println("\nLooked for int " + s + " " + search(DD, s));
		re.close();
		
	}
	public static Point search(int[][] integer, int search) {
		Point point = new Point(-1, -1);
		for (int r = 0; r<integer.length; r++) {
			for (int c = 0; c<integer[0].length; c++) {
				if (search == integer[r][c]) point = new Point(r, c);
			}
		}
		
		return point;
	}
}