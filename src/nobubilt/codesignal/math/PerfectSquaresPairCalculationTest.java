package nobubilt.codesignal.math;
import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PerfectSquaresPairCalculationTest {

    private PerfectSquaresPairCalculation app;

    @BeforeEach
    void setUp() {
        app = new PerfectSquaresPairCalculation();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {2, 3, 16}, new int[] {1, 9, 10});
            Assertions.assertEquals(2, result.size());
            Assertions.assertArrayEquals(new int[] {3, 1}, result.get(0));
            Assertions.assertArrayEquals(new int[] {16, 9}, result.get(1));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {0}, new int[] {0});
            Assertions.assertEquals(1, result.size());
            Assertions.assertArrayEquals(new int[] {0, 0}, result.get(0));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {4, 13, 23}, new int[] {-4, -3, -24});
            Assertions.assertEquals(3, result.size());
            Assertions.assertArrayEquals(new int[] {4, -4}, result.get(0));
            Assertions.assertArrayEquals(new int[] {4, -3}, result.get(1));
            Assertions.assertArrayEquals(new int[] {13, -4}, result.get(2));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {0, 1, 2, -100, 100}, new int[] {-100, 100, 30, 0, -1, -2, -3});
            Assertions.assertEquals(9, result.size());
            Assertions.assertArrayEquals(new int[] {0, 100}, result.get(0));
            Assertions.assertArrayEquals(new int[] {0, 0}, result.get(1));
            Assertions.assertArrayEquals(new int[] {1, 0}, result.get(2));
            Assertions.assertArrayEquals(new int[] {1, -1}, result.get(3));
            Assertions.assertArrayEquals(new int[] {2, -1}, result.get(4));
            Assertions.assertArrayEquals(new int[] {2, -2}, result.get(5));
            Assertions.assertArrayEquals(new int[] {-100, 100}, result.get(6));
            Assertions.assertArrayEquals(new int[] {100, -100}, result.get(7));
            Assertions.assertArrayEquals(new int[] {100, 0}, result.get(8));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {100, 75, 36, 9, -25, -64, -100}, new int[] {-1, 1, 24, 0, -1, -24});
            Assertions.assertEquals(3, result.size());
            Assertions.assertArrayEquals(new int[] {100, 0}, result.get(0));
            Assertions.assertArrayEquals(new int[] {36, 0}, result.get(1));
            Assertions.assertArrayEquals(new int[] {9, 0}, result.get(2));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {}, new int[] {1, 2, 3, 4});
            Assertions.assertEquals(0, result.size());
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {1, 2, 3, 4}, new int[] {});
            Assertions.assertEquals(0, result.size());
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<int[]> result = app.findPerfectSquarePairs(new int[] {}, new int[] {});
            Assertions.assertEquals(0, result.size());
        });
    }
}
