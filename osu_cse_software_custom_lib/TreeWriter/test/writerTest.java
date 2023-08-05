import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class writerTest {

	@Test
	public void test() throws IOException {
		TreeWriter h = new TreeWriter1L("test.html");
		h.addTag("html");
		h.addTag("head");
		h.addTag("title");
		h.addString("test");
		h.shiftRight();
		h.addTag("body");
		h.addTag("h2");
		h.addString("Words Counted in data/gettysburg.txt");
		h.shiftRight();//closeOneTag();
		h.addString("<hr>");
		h.addTag("table", "border", "1");
		h.addTag("tbody");
		h.addTag("tr");
		h.addTag("th");
		h.addString("Words");
		h.shiftRight();
		h.addTag("th");
		h.addString("Counts");
		h.shiftRight();
		h.shiftRight();
		for (int i = 0; i<10; i++) {
			h.addTag("tr");
			h.addTag("th");
			h.addString("word");
			h.shiftRight();
			h.addTag("th");
			h.addString(Integer.toString(i));
			h.shiftRight();
			h.shiftRight();
		}
		
		System.out.println(h.toString());
		
		
		h.printAll();
		h.close();
		assertEquals(1,1);
	}

}
