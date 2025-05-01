package nobubilt.codesignal.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CheckingForContigousSubArrayTest {

	  @Test
	    public void test1() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}));
	    }

	    @Test
	    public void test2() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{1, -1, 3, -2, 3, 2, 5}, new int[]{3, 2}));
	    }

	    @Test
	    public void test3() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{-9, -8, -7, -6}, new int[]{-8, -7}));
	    }
	    
	    @Test
	    public void test4() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{1, 2, 2, 3, 2, 4, 5}, new int[]{2, 2, 3}));
	    }
	    
	    @Test
	    public void test5() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{5, 4, 3, 2, 1}, new int[]{3, 2, 1}));
	    }

	    @Test
	    public void test6() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{-1, -2, -3, -4, -5}, new int[]{-2, -3, -4}));
	    }
	    
	    @Test
	    public void test7() {
	        assertEquals(true, CheckingForContigousSubArray.solution(new int[]{-5, 9, -5}, new int[]{-5}));
	    }

	    @Test
	    public void test8() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 6}));
	    }

	    @Test
	    public void test9() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{1, -1, 3, -2, 3, 2, 5}, new int[]{2, 3}));
	    }

	    @Test
	    public void test10() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{-9, -8, -7, -6}, new int[]{-7, -7}));
	    }
	    
	    @Test
	    public void test11() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{1, 2, 2, 3, 2, 4, 5}, new int[]{2, 3, 3}));
	    }
	    
	    @Test
	    public void test12() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{5, 4, 3, 2, 1}, new int[]{1, 3, 2}));
	    }

	    @Test
	    public void test13() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{-1, -2, -3, -4, -5}, new int[]{-3, -2, -4}));
	    }
	    
	    @Test
	    public void test14() {
	        assertEquals(false, CheckingForContigousSubArray.solution(new int[]{-5, 9, -5}, new int[]{5}));
	    }
	}
