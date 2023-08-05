import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * Sample JUnit test fixture for SequenceSmooth.
 * 
 * @author Put your name here
 * 
 */
public final class Homework3Test {

    /**
     * Constructs and returns a sequence of the integers provided as arguments.
     * 
     * @param args
     *            0 or more integer arguments
     * @return the sequence of the given arguments
     * @ensures createFromArgs= [the sequence of integers in args]
     */
    private Sequence<Integer> createFromArgs(Integer... args) {
        Sequence<Integer> s = new Sequence1L<Integer>();
        for (Integer x : args) {
            s.add(s.length(), x);
        }
        return s;
    }

    /**
     * Test smooth with s1 = <2, 4, 6> and s2 = <-5, 12>.
     */
    @Test
    public void test1() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(2, 4, 6);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(3,5);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }

    /**
     * Test smooth with s1 = <7> and s2 = <13, 17, 11>.
     */
    @Test
    public void test2() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(7);
        Sequence<Integer> expectedSeq1 = this.createFromArgs();
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }
    @Test
    public void test3() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(1,1,1,1,1,1);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(1,1,1,1,1);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }
    @Test
    public void test4() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(0,2,4,6,8,10,12,14,16,18,20,18,16,14,12,10,8,6,4,2,0);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(1,3,5,7,9,11,13,15,17,19,19,17,15,13,11,9,7,5,3,1);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }
    @Test
    public void test7() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(1073741825, 1073741825);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(1073741825);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }
    @Test
    public void test5() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(1073741825, -1073741825);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(0);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }
    @Test
    public void test6() {
        /*
         * Set up variables and call method under test
         */
        Sequence<Integer> seq1 = this.createFromArgs(-1073741823, 1073741824);
        Sequence<Integer> expectedSeq1 = this.createFromArgs(0);
        assertEquals(expectedSeq1, Homework3.smooth(seq1));
    }

}