package lesson10lab1;

public class foreach {
	public static void main(String[] args) {
		int[] scores = {87,95,76,88};
		for (int score : scores) System.out.println(score + " ");
		int sum = 0;
		for (int j : scores) sum +=j;
		System.out.println("The sum is: " + sum);
		
		
		
	}
}
