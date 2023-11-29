import components.naturalnumber.*;
public class Homework9 {
	private static void swap3(NaturalNumber n1, NaturalNumber n2) {
		NaturalNumber tmp = n1;
	    n1 = n2;
	    n2 = tmp;
	}
	private static void test3(NaturalNumber n) {
		n.increment();
	}
	public static void main(String[] args) {
		NaturalNumber x = new NaturalNumber2(41), y = new NaturalNumber2(78);
		swap3(x, y);
		//System.out.print(x + " " +  y);
		NaturalNumber m = new NaturalNumber2(143);
		NaturalNumber k = new NaturalNumber2(70);
		String b = "bruh";
		String g = "g";
		NaturalNumber num1 = new NaturalNumber2(17);
		test3(num1);
		System.out.println(num1);
		m.transferFrom(k);
		//System.out.print(m +" "+ k);
	}
}
