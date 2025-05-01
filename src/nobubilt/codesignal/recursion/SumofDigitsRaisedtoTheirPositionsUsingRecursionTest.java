package nobubilt.codesignal.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumofDigitsRaisedtoTheirPositionsUsingRecursionTest {


    @Test
    public void test1() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(36, solution.sumOfDigitsRaisedToPositions(253));
    }

    @Test
    public void test2() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(1, solution.sumOfDigitsRaisedToPositions(1));
    }

    @Test
    public void test3() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(1, solution.sumOfDigitsRaisedToPositions(1000));
    }

    @Test
    public void test4() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(36, solution.sumOfDigitsRaisedToPositions(325));
    }

    @Test
    public void test5() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(100, solution.sumOfDigitsRaisedToPositions(389));
    }

    @Test
    public void test6() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(6, solution.sumOfDigitsRaisedToPositions(121));
    }

    @Test
    public void test7() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(819, solution.sumOfDigitsRaisedToPositions(999));
    }

    @Test
    public void test8() {
        SumofDigitsRaisedtoTheirPositionsUsingRecursion solution = new SumofDigitsRaisedtoTheirPositionsUsingRecursion();
        assertEquals(7380, solution.sumOfDigitsRaisedToPositions(9999));
    }
}
