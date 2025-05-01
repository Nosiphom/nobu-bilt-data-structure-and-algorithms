package nobubilt.codesignal.interview.dp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DPclimbingStairsTest {

	  @Test
	    public void test1() {
	        assertEquals(1, DPclimbingStairs.totalWays(1));
	    }

	    @Test
	    public void test2() {
	        assertEquals(2, DPclimbingStairs.totalWays(2));
	    }

	    @Test
	    public void test3() {
	        assertEquals(3, DPclimbingStairs.totalWays(3));
	    }

	    @Test
	    public void test4() {
	        assertEquals(5, DPclimbingStairs.totalWays(4));
	    }

	    @Test
	    public void test5() {
	        assertEquals(8, DPclimbingStairs.totalWays(5));
	    }

	    @Test
	    public void test6() {
	        assertEquals(89, DPclimbingStairs.totalWays(10));
	    }

	    @Test
	    public void test7() {
	        assertEquals(10946, DPclimbingStairs.totalWays(20));
	    }

	    @Test
	    public void test8() {
	        assertEquals(121393, DPclimbingStairs.totalWays(25));
	    }

	    @Test
	    public void test9() {
	        assertEquals(2178309, DPclimbingStairs.totalWays(31));
	    }

	    @Test
	    public void test10() {
	        assertEquals(14930352, DPclimbingStairs.totalWays(35));
	    }
	}
