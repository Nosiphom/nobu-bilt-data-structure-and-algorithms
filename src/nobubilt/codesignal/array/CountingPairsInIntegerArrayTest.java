package nobubilt.codesignal.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CountingPairsInIntegerArrayTest {

	 private CountingPairsInIntegerArray app;

	    @BeforeEach
	    void setUp() {
	        app = new CountingPairsInIntegerArray();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {1, 1, 2, 3, 2};
	            Assertions.assertEquals(2, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {-29, 91, 92, 40, 71, 89, -75, 61, 68, -27, -73, -95, 19, 3, 63, 79, 76, -18, 22, -38, -86, -44, -56, -67, 77, 64, -84, 71, 62, 21, 68, -80, 66, -6, 81, 92, 14, 13, -2, 72, 7, 60, 15, 9, -66, 55, 16, -37, 50, 1, -31, 8, 17, 84, 6, 55, 64, -45, 4, -2, 14, 59, -68, 27, 93, -3, -12, -71, 45, -6, -36, 92, -26, 44, 44, 30, 45, -48, -62, 63, -1, 92, -30, -91, -44, -73, 6, 28, -75, 67, -6, 34, 33, 56, 44, -70, -18, -68, -96, 76};
	            Assertions.assertEquals(27, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100];
	            for (int i = 0; i < 100; i++) arr[i] = i;
	            Assertions.assertEquals(0, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100];
	            for (int i = 0; i < 100; i++) arr[i] = 5;
	            Assertions.assertEquals(4950, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100];
	            for (int i = 0; i < 50; i++) {
	                arr[i*2] = 100;
	                arr[i*2 + 1] = -100;
	            }
	            Assertions.assertEquals(2450, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {4, 8, 10, 6, 8, 6, 10, 6, 10, 6, 4, 10, 10, 6, 4, 6, 6, 4, 6, 6, 6, 10, 8, 4, 10, 4, 10, 2, 2, 2, 6, 4, 6, 4, 6, 10, 8, 8, 4, 10, 10, 4, 10, 10, 8, 8, 2, 8, 6, 8, 10, 8, 2, 10, 2, 6, 10, 10, 8, 10, 4, 8, 2, 10, 2, 6, 6, 2, 6, 4, 6, 6, 8, 4, 10, 2, 4, 4, 2, 8, 8, 4, 6, 10, 2, 2, 6, 10, 10, 8, 6, 8, 2, 6, 4, 2, 10, 2, 10, 4};
	            Assertions.assertEquals(985, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100];
	            for (int i = 0; i < 50; i++) {
	                arr[i] = 0; // Populate the first 50 elements with 0
	                arr[i + 50] = 1; // Populate the next 50 elements with 1
	            }
	            Assertions.assertEquals(2450, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
	            Assertions.assertEquals(1, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100];
	            for (int i = 0; i < 100; i++) arr[i] = 0;
	            Assertions.assertEquals(4950, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(10)
	    void test10() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	            Assertions.assertEquals(5, app.solution(arr));
	        });
	    }

	    @Test
	    @Order(11)
	    void test11() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arr = new int[100000];
	            for (int i = 0; i < 50; i++) {
	                for (int j = 0; j < 2000; j++) {
	                    arr[i * 2000 + j] = i;
	                }
	            }
	            int expected_result = 2000 * (2000 - 1) / 2 * 50;
	            Assertions.assertEquals(expected_result, app.solution(arr));
	        });
	    }
	}
