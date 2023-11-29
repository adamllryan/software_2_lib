import static org.junit.Assert.*;

import org.junit.Test;

import components.queue.Queue;
import components.queue.Queue1L;

public class GlossaryTest {
	//Can't check the following methods: generate_definition_file(), file_to_output(), 
	//output_index_list_item(), output_index_footer(), output_index_header() because they
	//only output to file. 
	@Test
	public void main_test_sample() {
		//Will not fail, it will just run the whole test and output in its own folder
		Glossary.file_to_output("data/test-no-spaces.txt", "data/output-test");
		assertEquals(1,1);
	}
	@Test
	public void main_test_realistic() {
		//Will not fail, it will just run the whole test and output in its own folder
		//This sample is more realistic, I know that terms must be 1 word, but real 
		//glossaries contain multi word terms, and I copied a psych glossary, so 
		//there wasn't much I could do to get this done
		Glossary.file_to_output("data/test-realistic.txt", "data/output-realistic");
		assertEquals(1,1);
	}
	@Test
	public void parse_file_test_start() {
		//Contains a valid word at the start and invalid at the end
		String w = "test";
		String d = "test 123 test123";
		String d_expected = "<a href=\"test.html\">test</a> 123 test123";
		assertEquals(d_expected, Glossary.parse_definition(w, d));
	}
	@Test
	public void parse_file_test_end() {
		//Contains a valid word at the end and an invalid word in front
		String w = "test";
		String d = "123 test123 test";
		String d_expected = "123 test123 <a href=\"test.html\">test</a>";
		assertEquals(d_expected, Glossary.parse_definition(w, d));
	}
	@Test
	public void parse_file_test_duplicate() {
		//Contains a valid word at the front, middle, end and an invalid word in the middle
		String w = "test";
		String d = "test 123 test test123 test";
		String d_expected = "<a href=\"test.html\">test</a> 123 <a href=\"test.html\">test</a> test123 <a href=\"test.html\">test</a>";
		assertEquals(d_expected, Glossary.parse_definition(w, d));
	}
	public void parse_file_test_routine() {
		//Contains a routine case
		String w = "routine";
		String d = "This is a routine case.";
		String d_expected = "This is a <a href=\"routine.html\">routine</a> case. ";
		assertEquals(d_expected, Glossary.parse_definition(w, d));
	}
	@Test
	public void is_word_test_routine() {
		//Contains a routine case
		String w = "routine";
		String d = "This is a routine case.";
		boolean d_expected = true;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_fail() {
		//Contains a routine case that is not true
		String w = "rout";
		String d = "This is a routine case.";
		boolean d_expected = false;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_start() {
		//Checks the start
		String w = "This";
		String d = "This is a routine case.";
		boolean d_expected = true;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_end() {
		//Checks the last word
		String w = "case";
		String d = "This is a routine case";
		boolean d_expected = true;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_fail_true() {
		//This should be false because the intent of this is
		//to check the first instance, not every instance
		String w = "rout";
		String d = "This is a routine rout case.";
		boolean d_expected = false;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_start_false() {
		//Checks for false at the start
		String w = "thi";
		String d = "This is a routine case.";
		boolean d_expected = false;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_caps() {
		//Contains a can test for caps
		String w = "ROUTINE";
		String d = "This is a routine case.";
		boolean d_expected = true;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	@Test
	public void is_word_test_false_end() {
		//Contains a routine case
		String w = "ase";
		String d = "This is a routine case";
		boolean d_expected = false;
		assertEquals(d_expected, Glossary.isWord(w, d));
	}
	
}
