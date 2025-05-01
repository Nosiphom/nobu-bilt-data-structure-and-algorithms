package nobubilt.codesignal.interview.array;
import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class OptimalPathThroughDungeonJumpingGameTest {

	 private OptimalPathThroughDungeonJumpingGame app;

	  @BeforeEach
	  void setUp() {
	    app = new OptimalPathThroughDungeonJumpingGame();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1, app.solution(Arrays.asList(0, -1, 1, 0, -1), 3));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(2, app.solution(Arrays.asList(1, 0, -1, 1, 0), 5));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(10, app.solution(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 10));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1, app.solution(Arrays.asList(-3, -4, -2, -7, 8, -10, -3), 14));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(5, app.solution(Arrays.asList(1, 2, 3, 4, 5), 20));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1, app.solution(Arrays.asList(100, 0, 0, 0, -10, 0, 0), 110));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1, app.solution(Arrays.asList(0, -2, -4, -6, -8), 10));
	    });
	  }
	}

