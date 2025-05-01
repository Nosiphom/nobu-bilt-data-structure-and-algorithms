package nobubilt.codesignal.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseStringRecursivelyTest {

	 @Test
	    public void test1() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("olleh", solution.reverseString("hello"));
	    }

	    @Test
	    public void test2() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("nohtyp", solution.reverseString("python"));
	    }

	    @Test
	    public void test3() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("noisrucer", solution.reverseString("recursion"));
	    }

	    @Test
	    public void test4() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("mhtirogla", solution.reverseString("algorithm"));
	    }

	    @Test
	    public void test5() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("A", solution.reverseString("A"));
	    }

	    @Test
	    public void test6() {
	        ReverseStringRecursively solution = new ReverseStringRecursively();
	        assertEquals("", solution.reverseString(""));
	    }
	}
