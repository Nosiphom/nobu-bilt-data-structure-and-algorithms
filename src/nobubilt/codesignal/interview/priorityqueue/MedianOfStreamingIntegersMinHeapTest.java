package nobubilt.codesignal.interview.priorityqueue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MedianOfStreamingIntegersMinHeapTest {
	   @Test
	    public void test1() {
	        assertEquals(Arrays.asList(2.0, 1.5, 2.0, 3.5, 2.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(2, 1, 5, 6, 2)));
	    }

	    @Test
	    public void test2() {
	        assertEquals(Arrays.asList(5.0, 4.5, 4.0, 3.5, 3.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(5, 4, 3, 2, 1)));
	    }

	    @Test
	    public void test3() {
	        assertEquals(Arrays.asList(5.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(5)));
	    }

	    @Test
	    public void test4() {
	        assertEquals(Arrays.asList(1.0, 500.5), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(1, 1000)));
	    }

	    @Test
	    public void test5() {
	        assertEquals(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(0, 0, 0, 0, 0)));
	    }

	    @Test
	    public void test6() {
	        assertEquals(Arrays.asList(-1.0, -1.5, -2.0, -2.5, -3.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(-1, -2, -3, -4, -5)));
	    }

	    @Test
	    public void test7() {
	        assertEquals(Arrays.asList(-5.0, -4.5, -4.0, -3.5, -3.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(-5, -4, -3, -2, -1)));
	    }

	    @Test
	    public void test8() {
	        assertEquals(Arrays.asList(-5.0, -3.0, -1.0, -0.5, 0.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(-5, -1, 0, 1, 5)));
	    }

	    @Test
	    public void test9() {
	        assertEquals(Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0, 60.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(10, 30, 50, 70, 90, 110)));
	    }

	    @Test
	    public void test10() {
	        assertEquals(Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(10, 30, 50, 70, 90)));
	    }

	    @Test
	    public void test11() {
	        assertEquals(Arrays.asList(100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0), MedianOfStreamingIntegersMinHeap.findStreamMedian(Arrays.asList(100, 100, 100, 100, 100, 100, 100, 100, 100, 100)));
	    }
	
}
