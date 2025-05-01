package nobubilt.codesignal.design;
import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class DesignDimensionalGamePathTest {

	  private DesignDimensionalGamePath app;

	  @BeforeEach
	  void setUp() {
	    app = new DesignDimensionalGamePath();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] result = app.evaluatePath(new int[] {2, 1, -3, 4});
	      Assertions.assertArrayEquals(new int[] {2, 1}, result);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] result = app.evaluatePath(new int[] {0});
	      Assertions.assertArrayEquals(new int[] {0, 0}, result);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] result = app.evaluatePath(new int[] {3, 4, 1, 1, -3, 1});
	      Assertions.assertArrayEquals(new int[] {4, 5}, result);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] result = app.evaluatePath(new int[] {3, -3});
	      Assertions.assertArrayEquals(new int[] {0, 0}, result);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] result = app.evaluatePath(new int[] {3, 2, -1, 2, 2, -1, 4});
	      Assertions.assertArrayEquals(new int[] {1, 7}, result);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] input = new int[500];
	      Arrays.fill(input, 1); // Correctly populate the input array
	      int[] res = app.evaluatePath(input);
	      Assertions.assertArrayEquals(new int[] {0, 998}, res);
	    });
	  }
	}

