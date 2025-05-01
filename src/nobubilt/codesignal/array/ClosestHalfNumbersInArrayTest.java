package nobubilt.codesignal.array;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClosestHalfNumbersInArrayTest {
	 private ClosestHalfNumbersInArray app;

	    @BeforeEach
	    void setUp() {
	        app = new ClosestHalfNumbersInArray();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {4, 12, 3, 9, 6, 1, 5, 8, 37, 25, 100};
	            int[] Y = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 112, 113, 114, 115, 116};
	            int[] expected = {70, 40, 20, 100, 100, 100, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {1, 5, 3, 4, 2};
	            int[] Y = {1, 2, 3, 4, 5};
	            int[] expected = {1, 1, 1, 5, 5};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {10, 24, 30, 40, 50};
	            int[] Y = {18, 19, 20, 21, 22};
	            int[] expected = {18, 18, 18, 18, 18};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {91, 85, 75, 60, 120, 150, 125};
	            int[] Y = {24, 48, 150, 210, 76, 98, 45, 97, 77, 107};
	            int[] expected = {210, 210, 150, 24, 210, 210, 210, 210, 210, 210};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {1, 2, 3, 4, 5};
	            int[] Y = {6, 7, 8, 9, 10};
	            int[] expected = {8, 8, 9, 9, 10};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {100, 200, 130, 170, 160, 180};
	            int[] Y = {1000, 2000, 500, 3000, 1500, 3500};
	            int[] expected = {2000, 2000, 2000, 2000, 2000, 2000};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] X = {24, 43, 77, 89, 23, 456, 778, 123, 55, 33};
	            int[] Y = {140, 230, 340, 450, 250, 289, 49, 364, 221, 145, 340, 456, 445, 456, 567};
	            int[] expected = {340, 364, 364, 364, 364, 364, 140, 364, 364, 340, 364, 364, 364, 364, 364};
	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
	            int[] X = new int[50000];
	            for (int i = 0; i < 50000; i++) {
	                X[i] = i + 1;
	            }
	            int[] Y = new int[50000];
	            for (int i = 0; i < 50000; i++) {
	                Y[i] = 50000 + i;
	            }

	            int[] expected = new int[50000];
	            for (int i = 0; i < 50000; i++) {
	                int closestHalfIndex = Y[i] / 2 - 1;
	                expected[i] = Y[closestHalfIndex];
	            }

	            Assertions.assertArrayEquals(expected, app.solution(X, Y));
	        });
	    }
}
