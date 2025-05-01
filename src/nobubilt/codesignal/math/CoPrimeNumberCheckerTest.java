package nobubilt.codesignal.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoPrimeNumberCheckerTest {

    public void test1() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(15, 28));
    }

    @Test
    public void test2() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(12, 18));
    }

    @Test
    public void test3() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(1, 1));
    }

    @Test
    public void test4() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(35, 49));
    }

    @Test
    public void test5() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(8, 25));
    }

    @Test
    public void test6() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(10000, 9999));
    }

    @Test
    public void test7() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(6389, 3762));
    }
    
    @Test
    public void test8() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(4638, 4799));
    }

    @Test
    public void test9() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(5785, 9186));
    }

    @Test
    public void test10() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(true, solution.areCoprime(2167, 2183));
    }

    @Test
    public void test11() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(14, 49));
    }

    @Test
    public void test12() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(30, 45));
    }

    @Test
    public void test13() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(22, 77));
    }

    @Test
    public void test14() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(42, 56));
    }

    @Test
    public void test15() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(60, 90));
    }

    @Test
    public void test16() {
        CoPrimeNumberChecker solution = new CoPrimeNumberChecker();
        assertEquals(false, solution.areCoprime(17, 51));
    }
}
