package nobubilt.codesignal.interview.hashmap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

public class HashSetCountingPairsWithGivenDiffTest {
    @Test
    public void test1() {
        assertEquals(3, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{1, 5, 3, 4, 2}, 2));
    }

    @Test
    public void test2() {
        assertEquals(5, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{3, 4, 5, 6, 7, 8}, 1));
    }

    @Test
    public void test3() {
        assertEquals(2, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void test4() {
        assertEquals(3, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{-1, 0, 1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void test5() {
        assertEquals(42, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{1, 1, 1, 1, 1, 1, 1}, 0));
    }

    @Test
    public void test6() {
        assertEquals(5, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{1, 2, 3, 4, 2, 3, 2}, 2));
    }

    @Test
    public void test7() {
        assertEquals(2, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{2, 3, 6, 7, 8, 9}, 4));
    }

    @Test
    public void test8() {
        assertEquals(10, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{4, 5, 5, 5, 7, 7, 8, 9, 9}, 0));
    }

    @Test
    public void test9() {
        assertEquals(0, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{2}, 1));
    }

    @Test
    public void test10() {
        assertEquals(4, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(new int[]{-1000, -998, -997, -998, -1000}, 2));
    }

    @Test
    public void test11() {
        assertEquals(999000, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.generate(() -> 1000).limit(1000).toArray(), 0));
    }

    @Test
    public void test12() {
        assertEquals(999000, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.generate(() -> -1000).limit(1000).toArray(), 0));
    }

    @Test
    public void test13() {
        assertEquals(999, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.rangeClosed(1, 1000).toArray(), 1));
    }

    @Test
    public void test14() {
        assertEquals(0, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.rangeClosed(1, 1000).toArray(), 1000));
    }

    @Test
    public void test15() {
        assertEquals(500, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.range(-500, 500).toArray(), 500));
    }

    @Test
    public void test16() {
        assertEquals(999, HashSetCountingPairsWithGivenDiff.countPairsWithDiffK(IntStream.iterate(-1000, i -> i + 2).limit(1000).toArray(), 2));
    }
}
