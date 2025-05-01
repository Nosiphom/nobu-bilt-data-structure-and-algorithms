package nobubilt.codesignal.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NthPrimeNumberTest {


    @Test
    public void testCase1() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(2, solution.nthPrime(1));
    }

    @Test
    public void testCase2() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(5, solution.nthPrime(3));
    }

    @Test
    public void testCase3() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(13, solution.nthPrime(6));
    }

    @Test
    public void testCase4() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(29, solution.nthPrime(10));
    }

    @Test
    public void testCase5() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(71, solution.nthPrime(20));
    }

    @Test
    public void testCase6() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(229, solution.nthPrime(50));
    }

    @Test
    public void testCase7() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(349, solution.nthPrime(70));
    }

    @Test
    public void testCase8() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(541, solution.nthPrime(100));
    }

    @Test
    public void testCase9() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(3571, solution.nthPrime(500));
    }

    @Test
    public void testCase10() {
        NthPrimeNumber solution = new NthPrimeNumber();
        assertEquals(7919, solution.nthPrime(1000));
    }
}
