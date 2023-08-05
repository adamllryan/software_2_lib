import components.naturalnumber.*;
public class Homework10 {
	/**
	 * Swaps the two given {@code NaturalNumber}s.
	 * 
	 * @param n1
	 *            the first {@code NaturalNumber}
	 * @param n2
	 *            the second {@code NaturalNumber}
	 * @updates n1
	 * @updates n2
	 * @ensures n1 = #n2 and n2 = #n1
	 */
	private static void swapNN(NaturalNumber n1, NaturalNumber n2) {
		NaturalNumber temp = new NaturalNumber2();
		temp.transferFrom(n1);
		n1.transferFrom(n2);
		n2.transferFrom(temp);
	}
	/**
	 * Squares a given {@code NaturalNumber}.
	 * 
	 * @param n
	 *            the number to square
	 * @updates n
	 * @ensures n = #n * #n
	 */
	private static void square(NaturalNumber n) {
		NaturalNumber temp = new NaturalNumber2();
		temp.copyFrom(n);
		n.multiply(temp);
	}
	public static void main(String[] args) {
		NaturalNumber one = new NaturalNumber2("1");
		NaturalNumber two = new NaturalNumber2("2");
		NaturalNumber three = new NaturalNumber2("3");
		swapNN(one, two);
		square(three);
		System.out.println(one + " " + two + " " + three);
	}
}
