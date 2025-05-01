package nobubilt.codesignal.interview.bit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatingBitDifferencesBetweenIntegersTest {


	   @Test
	    public void test12() {
	        assertEquals(3, CalculatingBitDifferencesBetweenIntegers.getBitDiff(2, 9));
	        System.out.println("2,9: " + CalculatingBitDifferencesBetweenIntegers.getBitDiff(2, 9));
	    }
    @Test
    public void test1() {
        assertEquals(1, CalculatingBitDifferencesBetweenIntegers.getBitDiff(14, 15));
    }

    @Test
    public void test2() {
        assertEquals(0, CalculatingBitDifferencesBetweenIntegers.getBitDiff(10, 10));
    }

    @Test
    public void test3() {
        assertEquals(0, CalculatingBitDifferencesBetweenIntegers.getBitDiff(0, 0));
    }

    @Test
    public void test4() {
        assertEquals(1, CalculatingBitDifferencesBetweenIntegers.getBitDiff(1, 0));
    }

    @Test
    public void test5() {
        assertEquals(1, CalculatingBitDifferencesBetweenIntegers.getBitDiff(0, 1));
    }

    @Test
    public void test6() {
        assertEquals(8, CalculatingBitDifferencesBetweenIntegers.getBitDiff(1234, 5678));
    }

    @Test
    public void test7() {
        assertEquals(2, CalculatingBitDifferencesBetweenIntegers.getBitDiff(7, 11));
    }

    @Test
    public void test8() {
        assertEquals(31, CalculatingBitDifferencesBetweenIntegers.getBitDiff((int) Math.pow(2, 30), (int) Math.pow(2, 30) - 1));
    }

    @Test
    public void test9() {
        assertEquals(31, CalculatingBitDifferencesBetweenIntegers.getBitDiff((int) Math.pow(2, 30) - 1, (int) Math.pow(2, 30)));
    }

    @Test
    public void test10() {
        assertEquals(2, CalculatingBitDifferencesBetweenIntegers.getBitDiff(1, (int) Math.pow(2, 30)));
    }

    @Test
    public void test11() {
        assertEquals(2, CalculatingBitDifferencesBetweenIntegers.getBitDiff((int) Math.pow(2, 30), 1));
    }
}
