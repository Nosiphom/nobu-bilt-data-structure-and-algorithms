package nobubilt.codesignal.array;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumOfNumbersInRangeTest {
	 private SumOfNumbersInRange app;

	  @BeforeEach
	  void setUp() {
	    app = new SumOfNumbersInRange();
	  }

	  @Test
	  @Order(1)
	  void testSumNumbers_SmallValues() {
	    List<int[]> queries = Arrays.asList(
	        new int[]{3, 5},
	        new int[]{1, 5},
	        new int[]{5, 1},
	        new int[]{1, 1},
	        new int[]{500, 500},
	        new int[]{1, 500},
	        new int[]{123, 321}
	    );
	    List<Long> expected = Arrays.asList(12L,15L, 15L, 1L, 500L, 125250L, 44178L);
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(expected, app.sumNumbers(queries));
	    });
	  }

	  @Test
	  @Order(2)
	  void testSumNumbers_OnlyTwoNumbers() {
	    List<int[]> queries = Arrays.asList(
	        new int[]{1, 2},
	        new int[]{2, 3},
	        new int[]{3, 4},
	        new int[]{4, 5},
	        new int[]{5, 6}
	    );
	    List<Long> expected = Arrays.asList(3L, 5L, 7L, 9L, 11L);
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(expected, app.sumNumbers(queries));
	    });
	  }

	  @Test
	  @Order(3)
	  void testSumNumbers_LargerAndMixedOrder() {
	    List<int[]> queries = Arrays.asList(
	        new int[]{1000000, 2000000},
	        new int[]{2000000, 3000000},
	        new int[]{3000000, 4000000},
	        new int[]{500000, 1500000},
	        new int[]{2500000, 1000000},
	        new int[]{1, 1000000000}
	    );

	    List<Long> expected = Arrays.asList(
	        1500001500000L,
	        2500002500000L,
	        3500003500000L,
	        1000001000000L,
	        2625001750000L,
	        500000000500000000L
	    );
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(expected, app.sumNumbers(queries));
	    });
	  }

	  @Test
	  @Order(4)
	  void testSumNumbers_RepeatedValueRanges() {
	    List<int[]> queries = new ArrayList<>();
	    for (int i = 0; i < 100000; i++) {
	      queries.add(new int[]{1000, 2000000});
	    }
	    List<Long> expected = new ArrayList<>();
	    for (int i = 0; i < 100000; i++) {
	      expected.add(2000000500500L);
	    }
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(expected, app.sumNumbers(queries));
	    });
	  }

	  @Test
	  @Order(5)
	  void testSumNumbers_AscendingAndDescendingRanges() {
	    List<int[]> queries = Arrays.asList(
	        new int[]{1, 1000000},
	        new int[]{1000000, 1},
	        new int[]{500000, 1500000},
	        new int[]{1500000, 500000},
	        new int[]{1, 1},
	        new int[]{1000000000, 1000000000}
	    );

	    List<Long> expected = Arrays.asList(
	        500000500000L,
	        500000500000L,
	        1000001000000L,
	        1000001000000L,
	        1L,
	        1000000000L
	    );
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(expected, app.sumNumbers(queries));
	    });
	  }
}
