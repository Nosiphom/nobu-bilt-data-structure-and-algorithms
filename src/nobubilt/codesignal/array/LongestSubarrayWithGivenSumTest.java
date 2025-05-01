package nobubilt.codesignal.array;
import java.util.Arrays;
import java.util.List;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LongestSubarrayWithGivenSumTest {

	  private LongestSubarrayWithGivenSum app;

	  @BeforeEach
	  void setUp() {
	    app = new LongestSubarrayWithGivenSum();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
	      int k = 5;
	      List<Integer> expected = Arrays.asList(2, 3);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1, 2, 3, 7);
	      int k = 6;
	      List<Integer> expected = Arrays.asList(1, 2, 3);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(10, 2, 7, 1, 3, 4, 10);
	      int k = 10;
	      List<Integer> expected = Arrays.asList(2, 7, 1);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
	      int k = 15;
	      List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1, 1000, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1);
	      int k = 10;
	      List<Integer> expected = Arrays.asList(1, 1, 1, 2, 1, 1, 1, 1, 1);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1000, 2000, 3000, 4000, 5000);
	      int k = 7000;
	      List<Integer> expected = Arrays.asList(3000, 4000);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(1, 3, 3, 3, 1, 4, 4, 1);
	      int k = 7;
	      List<Integer> expected = Arrays.asList(1, 3, 3);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = Arrays.asList(5, 1, 1, 5, 1, 1, 1);
	      int k = 5;
	      List<Integer> expected = Arrays.asList(5);
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
	  
	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> array = new java.util.ArrayList<>(java.util.Collections.nCopies(500000, 1));
	      int k = 500;
	      List<Integer> expected = new java.util.ArrayList<>(java.util.Collections.nCopies(500, 1));
	      Assertions.assertEquals(expected, app.getLongestSubarray(array, k));
	    });
	  }
}
