package testprogram;

public class number3 {
	public static int sum(int i, int j) {
		int sum=0;
		if (i<j) {
		while (i<=j) {
			sum+=i;
			i++;
		}  
		} else {
		while (j<=i) {
			sum+=j;
			j++;
		}
		}
		return sum;
		}
}
