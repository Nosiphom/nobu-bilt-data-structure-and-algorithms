package nobubilt.codesignal.array;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OptimizeArrayReplaceTest {

    private OptimizeArrayReplace app;

    @BeforeEach
    void setUp() {
        app = new OptimizeArrayReplace();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {10, 20, 30, 40, 50};
            long[] B = {7, 5, 1, 2, 4};
            long[] expectedOutput = {20, 50, 40, 30, 20};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }
    
    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {-3, -2, -1};
            long[] B = {-1, -2, -4};
            long[] expectedOutput = {-2, -3, -2};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {2, 0, 3};
            long[] B = {5, 10, 7};
            long[] expectedOutput = {3, 3, 2};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {-1000, 1000, 800, 0, 550};
            long[] B = {-800, 801, 0, -550, 1000};
            long[] expectedOutput = {0, 550, 0, -1000, 1000};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {5, 8, 0, 12, -17};
            long[] B = {9, 2, 4, -100, 8};
            long[] expectedOutput = {-17, 0, 8, 8, 5};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = {-1, 3, 7, 0, 2};
            long[] B = {4, 5, 7, 10, 1};
            long[] expectedOutput = {3, -1, 3, 7, -1};
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            long[] A = new long[100000];
            for (int i = 0; i < 100000; i++) {
                A[i] = i + 1;
            }
            long[] B = new long[100000];
            for (int i = 0; i < 100000; i++) {
                B[i] = (100000L - i) * (100000L - i);
            }
            long[] expectedOutput = new long[100000];
            for (int i = 0; i < 99999; i++) {
                expectedOutput[i] = i + 2;
            }
            expectedOutput[99999] = 99999;
            long[] actualOutput = app.optimizedReplace(A, B);
            Assertions.assertArrayEquals(expectedOutput, actualOutput);
        });
    }
}