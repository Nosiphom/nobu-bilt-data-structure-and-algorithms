package nobubilt.codesignal.interview.dp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoinChangeWaysDPtest {
    @Test
    public void test1() {
        assertEquals(11, CoinChangeWaysDP.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test2() {
        assertEquals(0, CoinChangeWaysDP.coinChange(new int[]{2}, 3));
    }

    @Test
    public void test3() {
        assertEquals(1, CoinChangeWaysDP.coinChange(new int[]{1}, 0));
    }

    @Test
    public void test4() {
        assertEquals(14, CoinChangeWaysDP.coinChange(new int[]{7, 2, 3}, 28));
    }

    @Test
    public void test5() {
        assertEquals(3, CoinChangeWaysDP.coinChange(new int[]{5, 10}, 20));
    }
        
    @Test
    public void test6() {
        assertEquals(1, CoinChangeWaysDP.coinChange(new int[]{}, 0));
    }

    @Test
    public void test7() {
        assertEquals(121, CoinChangeWaysDP.coinChange(new int[]{1, 4, 3}, 50));
    }

    @Test
    public void test8() {
        assertEquals(1024, CoinChangeWaysDP.coinChange(new int[]{9, 6, 5, 4, 2}, 73));
    }

    @Test
    public void test9() {
        assertEquals(1, CoinChangeWaysDP.coinChange(new int[]{98, 70, 15}, 175));
    }

    @Test
    public void test10() {
        assertEquals(4, CoinChangeWaysDP.coinChange(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void test11() {
        assertEquals(946, CoinChangeWaysDP.coinChange(new int[]{10, 25, 50, 100}, 1000));
    }

    @Test
    public void test12() {
        assertEquals(2501, CoinChangeWaysDP.coinChange(new int[]{1, 2}, 5000));
    }

    @Test
    public void test13() {
        assertEquals(0, CoinChangeWaysDP.coinChange(new int[]{19, 23, 58, 73}, 97));
    }
        
    @Test
    public void test14() {
        assertEquals(4, CoinChangeWaysDP.coinChange(new int[]{53, 250, 21, 45}, 453));
    }
        
    @Test
    public void test15() {
        assertEquals(21, CoinChangeWaysDP.coinChange(new int[]{199, 50, 78, 12}, 987));
    }
        
    @Test
    public void test16() {
        assertEquals(0, CoinChangeWaysDP.coinChange(new int[]{275, 198, 435, 11}, 895));
    }
        
    @Test
    public void test17() {
        assertEquals(6422, CoinChangeWaysDP.coinChange(new int[]{81, 67, 29, 14}, 4300));
    }

    @Test
    public void test18() {
        assertEquals(16, CoinChangeWaysDP.coinChange(new int[]{512, 272, 344, 62}, 4510));
    }

    @Test
    public void test19() {
        assertEquals(0, CoinChangeWaysDP.coinChange(new int[]{725, 410, 982, 630}, 3685));
    }

    @Test
    public void test20() {
        assertEquals(13, CoinChangeWaysDP.coinChange(new int[]{500, 1000, 2000, 5000}, 5000));
    }  
}
