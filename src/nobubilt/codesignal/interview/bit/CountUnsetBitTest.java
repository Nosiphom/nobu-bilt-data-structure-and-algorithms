package nobubilt.codesignal.interview.bit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountUnsetBitTest {

	   @Test
	    public void test1() {
	        int input = 9;
	        int expectedOutput = 30;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test2() {
	        int input = 1;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test3() {
	        int input = 16;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test4() {
	        int input = 0;
	        int expectedOutput = 32;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test5() {
	        int input = 15;
	        int expectedOutput = 28;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test6() {
	        int input = 32;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test7() {
	        int input = 31;
	        int expectedOutput = 27;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test8() {
	        int input = 1024;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test9() {
	        int input = 1000000;
	        int expectedOutput = 25;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test10() {
	        int input = 1073741823;
	        int expectedOutput = 2;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test11() {
	        int input = 1073741824;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test12() {
	        int input = 536870911;
	        int expectedOutput = 3;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }

	    @Test
	    public void test13() {
	        int input = 536870912;
	        int expectedOutput = 31;
	        assertEquals(expectedOutput, CountUnsetBit.countUnsetBits(input));
	    }
	}
