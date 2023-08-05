import java.util.*;
public class test {
	public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	int s=0,n = r.nextInt();
	for (int i=0;i<n;i++) {
		if (n>1000000) {s+=i;
		}
	}
	System.out.println(s);
	}
	
}
