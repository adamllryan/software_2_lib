import static org.junit.Assert.*;

import org.junit.Test;

public class Homework4Test {

	
	@Test
	public void test1() {
		assertEquals(Homework4.average(Integer.MAX_VALUE, Integer.MAX_VALUE - 1), Integer.MAX_VALUE - 1);
	}
	@Test
	public void test2() {
		assertEquals(Homework4.average(Integer.MIN_VALUE, Integer.MIN_VALUE + 1), Integer.MIN_VALUE + 1);
	}
	@Test
	public void test3() {
		assertEquals(Homework4.average(Integer.MIN_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE);
	}
	@Test
	public void test4() {
		assertEquals(Homework4.average(Integer.MAX_VALUE, Integer.MAX_VALUE	), Integer.MAX_VALUE);
	}
	@Test
	public void test5() {
		assertEquals(Homework4.average(5, 8), 6);
	}
	@Test
	public void test6() {
		assertEquals(Homework4.average(-5, -8), -6);
	}
	@Test
	public void test7() {
		assertEquals(Homework4.average(11, -4), 3);
	}
	@Test
	public void test8() {
		assertEquals(Homework4.average(-3, 2), 0);
	}
	@Test
	public void test9() {
		assertEquals(Homework4.average(3, 5), 4);
	}
	@Test
	public void test10() {
		assertEquals(Homework4.average(-3, -5), -4);
	}
}
