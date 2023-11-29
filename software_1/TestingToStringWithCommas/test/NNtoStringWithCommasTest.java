import static org.junit.Assert.*;
import components.naturalnumber.*;

import org.junit.Test;

public class NNtoStringWithCommasTest {
	/**
	 * Calls the method under test.
	 * 
	 * @param n
	 *            the number to pass to the method under test
	 * @return the {@code String} returned by the method under test
	 * @ensures <pre>
	 * redirectToMethodUnderTest = [String returned by the method under test]
	 * </pre>
	 */
	private static String redirectToMethodUnderTest(NaturalNumber n) {
	    return NNtoStringWithCommas6.toStringWithCommas(n);
	}
	@Test
	public void testToString0() {//breaks 2, 3
	NaturalNumber n = new NaturalNumber2(0);
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "0");
	assertEquals(n,copy);
	}
	@Test
	public void testToString999() {
	NaturalNumber n = new NaturalNumber2(999);
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "999");
	assertEquals(n,copy);
	}
	@Test
	public void testToString1000() {//breaks 2, 4
	NaturalNumber n = new NaturalNumber2(1000);
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "1,000");
	assertEquals(n,copy);
	}
	@Test
	public void testToString1000000() {//breaks 2, 4, 
	NaturalNumber n = new NaturalNumber2(1000000);
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "1,000,000");
	assertEquals(n,copy);
	}
	@Test
	public void testToString1234567890() {//breaks 2, 5
	NaturalNumber n = new NaturalNumber2("1234567890");
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "1,234,567,890");
	assertEquals(n,copy);
	}
	@Test
	public void testToString00() { //breaks 4, 5
	NaturalNumber n = new NaturalNumber2("1001");
	NaturalNumber copy = new NaturalNumber2(n);
	System.out.print(copy);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "1,001");
	assertEquals(n,copy);
	}
	@Test
	public void testToString12345678901234567890() { //breaks 2, 5, 
	NaturalNumber n = new NaturalNumber2("12345678901234567890");
	NaturalNumber copy = new NaturalNumber2(n);
	String toString = redirectToMethodUnderTest(n);
	assertEquals(toString, "12,345,678,901,234,567,890");
	assertEquals(n,copy);
	}
	
}
