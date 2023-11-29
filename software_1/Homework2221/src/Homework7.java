
public class Homework7 {
	
	public static void main(String[] args) {
		
		int[] a = {0,0,0};
		boolean isOrdered = true; 
		for (int i = 1; i<a.length; i++) {
			isOrdered = (a[i] >= a[i-1]) ? true : false;
		}
		System.out.println(isOrdered);
	}
}
