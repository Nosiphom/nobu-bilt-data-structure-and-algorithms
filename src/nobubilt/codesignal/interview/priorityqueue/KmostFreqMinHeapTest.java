package nobubilt.codesignal.interview.priorityqueue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.stream.IntStream;

public class KmostFreqMinHeapTest {


    @Test
    public void testCase1() {
        assertEquals(Arrays.asList(1, 2), KmostFreqMinHeap.solution(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(Arrays.asList(4, 1), KmostFreqMinHeap.solution(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, 2));
    }

    @Test
    public void testCase3() {
        assertEquals(Arrays.asList(1), KmostFreqMinHeap.solution(new int[]{1}, 1));
    }

    @Test
    public void testCase4() {
        assertEquals(Arrays.asList(2), KmostFreqMinHeap.solution(new int[]{1, 1, 2, 2, 2, 3}, 1));
    }

    @Test
    public void testCase5() {
        assertEquals(Arrays.asList(1, 2), KmostFreqMinHeap.solution(new int[]{1, 1, 2}, 2));
    }

    @Test
    public void testCase6() {
        assertEquals(Arrays.asList(-3, 2, -1), KmostFreqMinHeap.solution(new int[]{-1, -1, 2, 2, 2, 3, 3, -3, -3, -3, -3}, 3));
    }

    @Test
    public void testCase7() {
        assertEquals(Arrays.asList(IntStream.range(1, 1001).boxed().toArray(Integer[]::new)), KmostFreqMinHeap.solution(IntStream.range(1, 1001).toArray(), 1000));
    }

    @Test
    public void testCase8() {
        int[] input = new int[500];
        Arrays.fill(input, 1);
        input = Arrays.copyOf(input, 1000);
        Arrays.fill(input, 500, 1000, 2);
        assertEquals(Arrays.asList(1, 2), KmostFreqMinHeap.solution(input, 2));
    }

    @Test
    public void testCase9() {
        assertEquals(Arrays.asList(-2, -1, -3), KmostFreqMinHeap.solution(new int[]{-1, -2, -3, -4, -1, -2, -3, -2, -1}, 3));
    }

    @Test
    public void testCase10() {
        assertEquals(Arrays.asList(-1000, 1000), KmostFreqMinHeap.solution(new int[]{1000, -1000, 1000, -1000, 1000, -1000}, 2));
    }
}
