package nobubilt.codesignal.array;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PairsumTest {
	 private Pairsum app;

	    @BeforeEach
	    void setUp() {
	        app = new Pairsum();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {1, 2, 3, 4, 9, 10};
	            int target = 13;
	            int[] expected = {4, 9};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[500];
	            for (int i = 0; i < 500; ++i) arr[i] = i + 1;
	            int target = 629;
	            int[] expected = {314, 315};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {50, -50};
	            int target = 100;
	            int[] expected = {};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {0, 0, 0, 0, 0};
	            int target = 0;
	            int[] expected = {0, 0};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {-100, -50, 0, 50, 100};
	            int target = -150;
	            int[] expected = {-100, -50};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {-66, 45, 95, -84, -35, -70, 26, 94, 15, 20, 66, -3, -47, -76, 24, -93, -1, 10, 55, 95, 96, -100, 78, 14, -32, 84, -42, 51, -74, -19, -93, -95, -94, 66, 38, -98, -3, 75, -45, 8, 85, -93, 35, -44, 95, 12, 26, 41, -41, -12, -41, 73, -44, 94, 17, -26, -95, 6, 42, 64, -75, -53, 61, 85, -25, -70, 90, -15, 84, 82, 28, 8, 29, 71, -52, -23, -28, 50, 27, 29, 0, 50, -92, 22, -38, 90, 3, 6, 70, -56, -7, 40, 79, 98, 72, 88, -5, -78, 12, 69};
	            int target = -10;
	            int[] expected = {66, -76};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[500];
	            for (int i = 0; i < 500; ++i) arr[i] = 100;
	            int target = 200;
	            int[] expected = {100, 100};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[500];
	            for (int i = 0; i < 500; ++i) arr[i] = -100;
	            int target = -200;
	            int[] expected = {-100, -100};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
	            int[] arr = new int[1000000];
	            for (int i = 0; i < 1000000; ++i) arr[i] = i;
	            int target = 1215634;
	            int[] expected = {607816, 607818};
	            Assertions.assertArrayEquals(expected, app.solution(arr, target));
	        });
	    }
}
