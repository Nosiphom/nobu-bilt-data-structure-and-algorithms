package nobubilt.codesignal.interview.dp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfPerfectSquaresDPtest {

    @Test
    public void test1() {
        assertEquals(1, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(1));
    }
    
    @Test
    public void test2() {
        assertEquals(2, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(2));
    }
    
    @Test
    public void test3() {
        assertEquals(3, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(3));
    }
    
    @Test
    public void test4() {
        assertEquals(1, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(4));
    }
    
    @Test
    public void test5() {
        assertEquals(3, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(12));
    }
    
    @Test
    public void test6() {
        assertEquals(2, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(13));
    }
    
    @Test
    public void test7() {
        assertEquals(1, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(100));
    }
    
    @Test
    public void test8() {
        assertEquals(4, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(999));
    }
    
    @Test
    public void test9() {
        assertEquals(2, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(1000));
    }
    
    @Test
    public void test10() {
        assertEquals(4, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(9999));
    }
    
    @Test
    public void test11() {
        assertEquals(1, MinimumNumberOfPerfectSquaresDP.minNumOfSquares(10000));
    }

}
