package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ThreeArrayHopingTraversalTest {
	   private ThreeArrayHopingTraversal app;

	    @BeforeEach
	    void setUp() {
	        app = new ThreeArrayHopingTraversal();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arrayA = {2, 1, 3, 0};
	            int[] arrayB = {1, 3, 2, 4};
	            int[] arrayC = {4, 2, 5, 1};
	            Assertions.assertEquals(7, app.solution(arrayA, arrayB, arrayC));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arrayA = {2, 0, 1};
	            int[] arrayB = {1, 3, 2};
	            int[] arrayC = {2, 0, 1};
	            Assertions.assertEquals(2, app.solution(arrayA, arrayB, arrayC));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arrayA = {1, 1, 0};
	            int[] arrayB = {2, 1, 3};
	            int[] arrayC = {2, 0, 1};
	            Assertions.assertEquals(1, app.solution(arrayA, arrayB, arrayC));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arrayA = {0, 2, 0};
	            int[] arrayB = {1, 1, 2};
	            int[] arrayC = {0, 1, 2};
	            Assertions.assertEquals(3, app.solution(arrayA, arrayB, arrayC));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] arrayA = {1, 1, 2, 0};
	            int[] arrayB = {2, 2, 1, 3};
	            int[] arrayC = {1, 2, 3, 4};
	            Assertions.assertEquals(5, app.solution(arrayA, arrayB, arrayC));
	        });
	    }
	}

