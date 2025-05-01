package nobubilt.codesignal.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class UniquePrimeFactorsTest {


    @Test
    public void test1() {
        assertEquals(Arrays.asList(3, 5), new UniquePrimeFactors().getPrimeFactors(45));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(2), new UniquePrimeFactors().getPrimeFactors(2));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(2, 5), new UniquePrimeFactors().getPrimeFactors(1000000));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(37), new UniquePrimeFactors().getPrimeFactors(37));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(2, 7), new UniquePrimeFactors().getPrimeFactors(56));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(1223), new UniquePrimeFactors().getPrimeFactors(1223));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(59, 97), new UniquePrimeFactors().getPrimeFactors(5723));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList(391939), new UniquePrimeFactors().getPrimeFactors(391939));
    }

    @Test
    public void test9() {
        assertEquals(Arrays.asList(2, 3, 5), new UniquePrimeFactors().getPrimeFactors(60));
    }

    @Test
    public void test10() {
        assertEquals(Arrays.asList(2, 3), new UniquePrimeFactors().getPrimeFactors(18));
    }

    @Test
    public void test11() {
        assertEquals(Arrays.asList(2, 3, 7), new UniquePrimeFactors().getPrimeFactors(84));
    }

    @Test
    public void test12() {
        assertEquals(Arrays.asList(101), new UniquePrimeFactors().getPrimeFactors(101));
    }

    @Test
    public void test13() {
        assertEquals(Arrays.asList(2, 3), new UniquePrimeFactors().getPrimeFactors(144));
    }

    @Test
    public void test14() {
        assertEquals(Arrays.asList(2, 3, 5, 7), new UniquePrimeFactors().getPrimeFactors(210));
    }

    @Test
    public void test15() {
        assertEquals(Arrays.asList(2), new UniquePrimeFactors().getPrimeFactors(65536));
    }

    @Test
    public void test16() {
        assertEquals(Arrays.asList(999983), new UniquePrimeFactors().getPrimeFactors(999983));
    }

    @Test
    public void test17() {
        assertEquals(Arrays.asList(2, 17), new UniquePrimeFactors().getPrimeFactors(8912896));
    }

    @Test
    public void test18() {
        assertEquals(Arrays.asList(3, 5, 7, 11, 13), new UniquePrimeFactors().getPrimeFactors(15015));
    }

    @Test
    public void test19() {
        assertEquals(Arrays.asList(2, 3, 643), new UniquePrimeFactors().getPrimeFactors(123456));
    }

    @Test
    public void test20() {
        assertEquals(Arrays.asList(2, 3, 97, 1697), new UniquePrimeFactors().getPrimeFactors(987654));
    }
    
    @Test
    public void test21() {
        assertEquals(Arrays.asList(2,5), new UniquePrimeFactors().getPrimeFactors(10));
    }
}
