package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MoveUntilNegativeNumberGameTest {


	  private MoveUntilNegativeNumberGame app;

	  @BeforeEach
	  void setUp() {
	    app = new MoveUntilNegativeNumberGame();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{1, 2, 4, 4, -1, 8, 8, 8, -1, 4}, app.solution(new int[]{1, 2, 3, 2, -3, 5, 2, 7, -1, 4}));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{2, 2, -1, 5, 5, -1, 1, 5, 6}, app.solution(new int[]{3, 4, -1, 2, 5, -2, 1, 5, 6}));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{-1, 2, 3, 4, 5}, app.solution(new int[]{-1, 2, 3, 4, 5}));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{5, 5, 5, 5, 5, -1}, app.solution(new int[]{5, 4, 3, 2, 1, -1}));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{4, 4, 4, 4, -1, 2, 1}, app.solution(new int[]{7, 6, 5, 4, -1, 2, 1}));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 6, -1}, app.solution(new int[]{1, 1, 1, 1, 1, 1, -1}));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(new int[]{-1, 3, 3, -1, 6, 6, -1, 2}, app.solution(new int[]{-2, 3, 2, -4, 5, 1, -1, 2}));
	    });
	  }
	}

