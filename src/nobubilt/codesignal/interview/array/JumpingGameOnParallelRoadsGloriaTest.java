package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class JumpingGameOnParallelRoadsGloriaTest {

	  private JumpingGameOnParallelRoadsGloria app;

	  @BeforeEach
	  void setUp() {
	    app = new JumpingGameOnParallelRoadsGloria();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] roadA = {1, 0, 2};
	      int[] roadB = {2, 0, 1};
	      int[] expected = {2, 4, 4};
	      Assertions.assertArrayEquals(expected, app.calculateJumpDistances(roadA, roadB));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] roadA = {0, 0, 0, 0, 0};
	      int[] roadB = {0, 0, 1, 2, 3};
	      int[] expected = {2, 3, 3, 3, 3};
	      Assertions.assertArrayEquals(expected, app.calculateJumpDistances(roadA, roadB));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] roadA = {1, 2, 3, 0};
	      int[] roadB = {2, 3, 0, 1};
	      int[] expected = {8, 8, 8, 8};
	      Assertions.assertArrayEquals(expected, app.calculateJumpDistances(roadA, roadB));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] roadA = {2, 2, 2, 2};
	      int[] roadB = {3, 2, 1, 0};
	      int[] expected = {3, 2, 3, 3};
	      Assertions.assertArrayEquals(expected, app.calculateJumpDistances(roadA, roadB));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] roadA = {1, 2, 1};
	      int[] roadB = {0, 2, 1};
	      int[] expected = {3, 2, 2};
	      Assertions.assertArrayEquals(expected, app.calculateJumpDistances(roadA, roadB));
	    });
	  }
}
