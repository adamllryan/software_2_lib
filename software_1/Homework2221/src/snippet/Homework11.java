package snippet;

public class Homework11 {
	/**
	 * Returns {@code n} to the power {@code p}.
	 * 
	 * @param n
	 *            the number to which we want to apply the power
	 * @param p
	 *            the power
	 * @return the number to the power
	 * @requires Integer.MIN_VALUE <= n ^ (p) <= Integer.MAX_VALUE and p >= 0
	 * @ensures power = n ^ (p)
	 */
	private static int power(int n, int p) {
		int temp = n;
		for (int i = 1; i<p; i++) {
			n*=temp;
		}
		return n;
	}
	/**
	 * Returns the {@code r}-th root of {@code n}.
	 * 
	 * @param n
	 *            the number to which we want to apply the root
	 * @param r
	 *            the root
	 * @return the root of the number
	 * @requires n >= 0 and r > 0
	 * @ensures root ^ (r) <= n < (root + 1) ^ (r)
	 */
	private static int root(int n, int r) {
		int lB = 0, uB = n, root = 0;
		int sent = 0;
		while (sent == 0) {
			root = (lB+uB)/2;
			if (power(root,r) < n) { //large numbers break here from int overflow
				lB = root;
			} else {
				uB = root;
			}
			if (power(root, r) <= n && n < power(root+1, r)) {
				sent = -1;
			}
			
		}
		return root;
	}
	public static void main(String[] args) {
		int n = 17;
		int r = 4;
		System.out.print(root(n,r));
		
		
		
	}

}
