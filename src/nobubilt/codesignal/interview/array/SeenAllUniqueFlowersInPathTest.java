package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SeenAllUniqueFlowersInPathTest {
	  private SeenAllUniqueFlowersInPath app;

	    @BeforeEach
	    void setUp() {
	        app = new SeenAllUniqueFlowersInPath();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(2, app.largestStep(new int[]{3, 1, 2, 1, 3, 2, 1}, 0, 1));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(1, app.largestStep(new int[]{1, 2, 3, 4, 5, 9, 2, 1, 3, 8, 2, 7, 1, 6}, 13, -1));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(1, app.largestStep(new int[]{1, 2, 3, 4, 5}, 0, 1));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(1, app.largestStep(new int[]{1}, 0, 1));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(-1, app.largestStep(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 0, -1));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(1, app.largestStep(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 9, -1));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(1, app.largestStep(new int[]{1, 2, 2, 4, 5, 5}, 0, 1));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(4, app.largestStep(new int[]{1, 1, 1, 1, 2, 1}, 0, 1));
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(-1, app.largestStep(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0, -1));
	        });
	    }

	    @Test
	    @Order(10)
	    void test10() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(-1, app.largestStep(new int[]{1, 5, 2, 5, 3, 5, 4, 5}, 3, -1));
	        });
	    }
	}

