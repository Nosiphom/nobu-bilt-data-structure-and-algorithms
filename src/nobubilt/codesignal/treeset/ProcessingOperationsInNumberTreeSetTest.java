package nobubilt.codesignal.treeset;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProcessingOperationsInNumberTreeSetTest {

    private ProcessingOperationsInNumberTreeSet app;

    @BeforeEach
    void setUp() {
        app = new ProcessingOperationsInNumberTreeSet();
    }

    @Test
    @Order(1)
    void test1() {
        int[][] operations = {{2}, {0, -31}, {1, -31}, {0, 49}, {1, 49}};
        Integer[] expected = {-1, 1, 0, 1, 0};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(2)
    void test2() {
        int[][] operations = {{2}, {2}, {2}, {0, -89}, {0, -94}};
        Integer[] expected = {-1, -1, -1, 1, 2};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(3)
    void test3() {
        int[][] operations = {{0, -67}, {2}, {2}, {1, -67}, {0, -7}, {0, 90}, {1, -7}, {0, 64}, {2}, {1, 90}, {0, 99}, {1, 99}, {2}, {2}, {0, 36}, {2}, {2}, {2}, {0, 100}, {1, 36}, {1, 100}, {1, 64}, {0, -36}, {1, -36}, {2}, {0, -42}, {0, 53}, {2}, {1, 53}, {0, 90}, {1, -42}, {2}, {2}, {0, -79}, {1, 90}, {2}, {2}, {0, -45}, {1, -79}, {1, -45}, {2}, {0, 11}, {2}, {1, 11}, {2}, {0, 88}, {1, 88}, {2}, {2}, {2}};
        Integer[] expected = {1, -67, -67, 0, 1, 2, 1, 2, 90, 1, 2, 1, 64, 64, 2, 64, 64, 64, 3, 2, 1, 0, 1, 0, -1, 1, 2, 53, 1, 2, 1, 90, 90, 2, 1, -79, -79, 2, 1, 0, -1, 1, 11, 0, -1, 1, 0, -1, -1, -1};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(4)
    void test4() {
        int[][] operations = {{0, -15}, {0, -95}, {2}, {0, -32}, {0, -53}, {2}, {0, -94}, {1, -32}, {0, 24}, {1, -95}, {0, -41}, {1, -94}, {0, 21}, {1, -53}, {2}, {0, -26}, {0, 38}, {2}, {0, -84}, {0, 87}, {0, 9}, {2}, {2}, {2}, {2}, {2}, {2}, {0, -5}, {0, -87}, {1, -84}, {2}, {1, -15}, {1, 21}, {2}, {0, -98}, {0, 82}, {0, -22}, {2}, {1, 87}, {1, -41}, {2}, {1, 24}, {1, -5}, {1, -98}, {0, 86}, {2}, {0, -32}, {0, -97}, {2}, {2}, {2}, {0, -43}, {0, 61}, {2}, {2}, {2}, {2}, {1, -97}, {0, 91}, {1, -32}, {2}, {0, 31}, {0, 60}, {0, 33}, {1, 33}, {2}, {1, -26}, {2}, {0, -3}, {2}, {1, 38}, {1, -87}, {2}, {2}, {1, -22}, {2}, {0, -82}, {0, -73}, {1, -82}, {0, 2}, {1, -3}, {1, -73}, {1, 60}, {2}, {1, 61}, {1, 2}, {0, 56}, {0, -26}, {1, 9}, {2}, {0, 69}, {1, 82}, {0, -22}, {2}, {1, -43}, {0, -55}, {2}, {0, 53}, {1, 86}, {0, -47}};
        Integer[] expected = {1, 2, -15, 3, 4, -15, 5, 4, 5, 4, 5, 4, 5, 4, 24, 5, 6, 38, 7, 8, 9, 87, 87, 87, 87, 87, 87, 10, 11, 10, 87, 9, 8, 87, 9, 10, 11, 87, 10, 9, 82, 8, 7, 6, 7, 86, 8, 9, 86, 86, 86, 10, 11, 86, 86, 86, 86, 10, 11, 10, 91, 11, 12, 13, 12, 91, 11, 91, 12, 91, 11, 10, 91, 91, 9, 91, 10, 11, 10, 11, 10, 9, 8, 91, 7, 6, 7, 8, 7, 91, 8, 7, 8, 91, 7, 8, 91, 9, 8, 9};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(5)
    void test5() {
        int[][] operations = {{0, 23}, {0, 37}, {1, 37}, {2}, {2}};
        Integer[] expected = {1, 2, 1, 23, 23};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(6)
    void test6() {
        int[][] operations = {{2}, {2}, {0, 35}, {2}, {1, 35}};
        Integer[] expected = {-1, -1, 1, 35, 0};
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
            int[][] operations = new int[75000][2];
            int index = 0;
            // Adding 25000 numbers sequentially (0 operation)
            for (int i = 1; i <= 25000; ++i) {
                operations[index++] = new int[]{0, i};
            }

            // Removing half of them (1 operation)
            for (int i = 1; i <= 12500; ++i) {
                operations[index++] = new int[]{1, i};
            }

            // Adding some numbers back to the set
            for (int i = 12501; i <= 25000; ++i) {
                operations[index++] = new int[]{0, i};
            }

            // Finding the max in the set, repeated 25000 times (2 operation)
            for (int i = 0; i < 25000; ++i) {
                operations[index++] = new int[]{2};
            }

            Integer[] expected = new Integer[75000];

            // Expected results for the 0 operations (add)
            for (int i = 1, j = 0; i <= 25000; ++i, ++j) {
                expected[j] = i;
            }

            // Expected results for the 1 operations (remove)
            for (int i = 25000, j = 25000; i > 12500; --i, ++j) {
                expected[j] = i - 1;
            }

            // Expected results for the next 0 operations (add again)
            for (int i = 12501, j = 37500; i <= 25000; ++i, ++j) {
                expected[j] = 12500;
            }

            // Since no changes happen during max finds, the max remains 25000
            int max_value = 25000;
            for (int i = 0; i < 25000; ++i) {
                expected[50000 + i] = max_value;
            }

            Assertions.assertArrayEquals(expected, app.solution(operations).toArray());
        });
    }
}
