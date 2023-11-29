import static org.junit.Assert.*;
import components.set.*;
import org.junit.Test;

public class StringReassemblyTest {

	@Test
	public void combinationTest_no_overlap() {
		String one = "abc";
		String two = "def";
		String expected = "abcdef";
		assertEquals(expected, StringReassembly.combination(one, two, 0));
	}
	@Test
	public void combinationTest_max_overlap() {
		String one = "abc";
		String two = "abc";
		String expected = "abc";
		String actual = StringReassembly.combination(one, two, 3);
		assertEquals(expected, actual);
	}
	@Test
	public void combinationTest_some_overlap() {
		//tests some overlap and differently sized strings
		String one = "abcdefg";
		String two = "defghijk";
		String expected = "abcdefghijk";
		String actual = StringReassembly.combination(one, two, 4);
		assertEquals(expected, actual);
	}
	@Test
	public void addToSetTest_add_substring() {
		String str = "a";
		Set<String> one = new Set1L<>();
		one.add("abc");
		one.add("def");
		Set<String> expected = new Set1L<>();
		expected.add("abc");
		expected.add("def");
		StringReassembly.addToSetAvoidingSubstrings(one, str);
		assertEquals(one, expected);
	}
	@Test
	public void addToSetTest_add_routine() {
		String str = "ghi";
		Set<String> one = new Set1L<>();
		one.add("abc");
		one.add("def");
		Set<String> expected = new Set1L<>();
		expected.add("abc");
		expected.add("def");
		expected.add("ghi");
		StringReassembly.addToSetAvoidingSubstrings(one, str);
		assertEquals(one, expected);
	}
	@Test
	public void addToSetTest_add_where_set_contains_substring_of_str() {
		String str = "abcdefghijklmnopqrstuvwxyz";
		Set<String> one = new Set1L<>();
		one.add("abc");
		one.add("def");
		one.add("ghijklmnopqrstuv");
		Set<String> expected = new Set1L<>();
		expected.add("abcdefghijklmnopqrstuvwxyz");
		StringReassembly.addToSetAvoidingSubstrings(one, str);
		assertEquals(one, expected);
	}
	@Test
	public void addToSetTest_add_duplicate() {
		String str = "ghi";
		Set<String> one = new Set1L<>();
		one.add("abc");
		one.add("def");
		one.add("ghi");
		Set<String> expected = new Set1L<>();
		expected.add("abc");
		expected.add("def");
		expected.add("ghi");
		StringReassembly.addToSetAvoidingSubstrings(one, str);
		assertEquals(one, expected);
	}
}
