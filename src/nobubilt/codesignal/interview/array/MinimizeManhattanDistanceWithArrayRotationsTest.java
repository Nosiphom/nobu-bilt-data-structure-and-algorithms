package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class MinimizeManhattanDistanceWithArrayRotationsTest {

    
    private MinimizeManhattanDistanceWithArrayRotations app;

    @BeforeEach
    void setUp() {
        app = new MinimizeManhattanDistanceWithArrayRotations();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {5, 4, 3, 2, 1};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{3, 4, 5, 1, 2});
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1, 2};
            int[] array2 = {2, 1};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{2, 1});
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {1, 2, 3, 4, 5};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1, 2, 3};
            int[] array2 = {2, 3, 1};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{2, 3, 1});
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1};
            int[] array2 = {1};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{1});
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] array2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            int[] result = MinimizeManhattanDistanceWithArrayRotations.solution(array1, array2);
            Assertions.assertArrayEquals(result, new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        });
    }
}
