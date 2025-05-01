package nobubilt.codesignal.array;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MaxSumForRangeKTwoPointersTest {

	  private MaxSumForRangeKTwoPointers app;

	  @BeforeEach
	  void setUp() {
	    app = new MaxSumForRangeKTwoPointers();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{16, 1}, app.maximumSum(new int[]{1, 9, -1, -2, 7, 3, -1, 2, 4, -6}, 5));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{7, 2}, app.maximumSum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 5));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{6, 5}, app.maximumSum(new int[]{-2, -5, 6, -2, -3, 1, 5, -6}, 2));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{5, 4}, app.maximumSum(new int[]{1, 2, 3, 4, 5, -6}, 1));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{1, 0}, app.maximumSum(new int[]{1}, 1));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{0, 0}, app.maximumSum(new int[]{1, -1, 1, -1, 1, -1, 1, -1}, 2));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{700, 2}, app.maximumSum(new int[]{100, 200, 300, 400}, 2));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] largeArray = new int[100000];
	      for (int i = 0; i < 100000; ++i) {
	        largeArray[i] = i + 1;
	      }
	      int k = 50000;
	      long expectedSum = (50001L + 100000) * 50000 / 2;  // Sum of integers from 50001 to 100000
	      Assertions.assertArrayEquals(new int[]{(int) expectedSum, 50000}, app.maximumSum(largeArray, k));
	    });
	  }
}
