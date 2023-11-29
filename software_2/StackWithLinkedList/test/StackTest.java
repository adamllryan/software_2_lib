import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.stack.Stack;

/**
 * JUnit test fixture for {@code Stack<String>}'s constructor and kernel
 * methods.
 *
 * @author Put your name here
 *
 */
public abstract class StackTest {

    /**
     * Invokes the appropriate {@code Stack} constructor for the implementation
     * under test and returns the result.
     *
     * @return the new stack
     * @ensures constructorTest = <>
     */
    protected abstract Stack<String> constructorTest();

    /**
     * Invokes the appropriate {@code Stack} constructor for the reference
     * implementation and returns the result.
     *
     * @return the new stack
     * @ensures constructorRef = <>
     */
    protected abstract Stack<String> constructorRef();

    /**
     *
     * Creates and returns a {@code Stack<String>} of the implementation under
     * test type with the given entries.
     *
     * @param args
     *            the entries for the stack
     * @return the constructed stack
     * @ensures createFromArgsTest = [entries in args]
     */
    private Stack<String> createFromArgsTest(String... args) {
        Stack<String> stack = this.constructorTest();
        for (String s : args) {
            stack.push(s);
        }
        stack.flip();
        return stack;
    }

    /**
     *
     * Creates and returns a {@code Stack<String>} of the reference
     * implementation type with the given entries.
     *
     * @param args
     *            the entries for the stack
     * @return the constructed stack
     * @ensures createFromArgsRef = [entries in args]
     */
    private Stack<String> createFromArgsRef(String... args) {
        Stack<String> stack = this.constructorRef();
        for (String s : args) {
            stack.push(s);
        }
        stack.flip();
        return stack;
    }

    // TODO - add test cases for constructor, push, pop, and length
    
    @Test
    public void testPush() {
    	Stack<String> test = createFromArgsTest("1","2","3","4");
    	Stack<String> ref = createFromArgsRef("1","2","3","4");
    	test.push("5");
    	ref.push("5");
    	assertEquals(ref, test);
    }
    @Test
    public void testPushEmpty() {
    	Stack<String> test = createFromArgsTest();
    	Stack<String> ref = createFromArgsRef();
    	test.push("5");
    	ref.push("5");
    	assertEquals(ref, test);
    }
    @Test
    public void testPop() {
    	Stack<String> test = createFromArgsTest("1","2","3","4");
    	Stack<String> ref = createFromArgsRef("1","2","3","4");
    	assertEquals(test.pop(),ref.pop());
    	assertEquals(test.pop(),ref.pop());
    	assertEquals(ref, test);
    }
    @Test
    public void testPopToEmpty() {
    	Stack<String> test = createFromArgsTest("1","2");
    	Stack<String> ref = createFromArgsRef("1","2");
    	assertEquals(test.pop(),ref.pop());
    	assertEquals(test.pop(),ref.pop());
    	assertEquals(ref, test);
    }
    @Test
    public void testLengthEmpty() {
    	Stack<String> test = createFromArgsTest();
    	Stack<String> ref = createFromArgsRef();
    	assertEquals(ref.length(), test.length());
    }
    @Test
    public void testLength() {
    	Stack<String> test = createFromArgsTest("1","2","3","4");
    	Stack<String> ref = createFromArgsRef("1","2","3","4");
    	assertEquals(ref.length(), test.length());
    }
}
