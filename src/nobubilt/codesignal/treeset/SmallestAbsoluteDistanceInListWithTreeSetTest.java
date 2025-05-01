package nobubilt.codesignal.treeset;

import java.time.Duration;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SmallestAbsoluteDistanceInListWithTreeSetTest {

	private SmallestAbsoluteDistanceInListWithTreeSet app;

	  @BeforeEach
	  void setUp() {
	    app = new SmallestAbsoluteDistanceInListWithTreeSet();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 4, 2), app.solution(Arrays.asList(1, 5, 3)));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 1, 1, 1, 1, 1, 1, 1, 1, 1), app.solution(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), app.solution(Arrays.asList(
	          1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50)
	      ));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), app.solution(Arrays.asList(
	          50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
	      ));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 120, 47, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), app.solution(Arrays.asList(
	          -25, 95, 48, 94, -23, 14, 21, 16, 56, -37, -20, -35, -66, 24, 59, 100, -64, -46, 43, -60, 81, -97, 12, 18, -59)
	      ));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 93, 11, 11, 11, 10, 9, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), app.solution(Arrays.asList(
	          80, -13, 69, 0, -49, 90, 99, 64, -47, -18, -93, 51, 59, -79, 53, 21, -32, 15, 63, 98, 73, -38, -94, 80, -3, 88, -66, -68, 31, -89, 46, -94, -57, -92, -20)
	      ));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 12, 12, 12, 12, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), app.solution(Arrays.asList(
	          -84, -96, -69, 34, 68, 28, -5, 61, 92, 59, -18, 43, -31, 5, 97, -79, 11, -25, -38, -58, -87, 100, -97, 99, 85, 32, 37, 45, 49, -54, 7, -3, -74, 66, 21, 70, -26, 95, 26, 50, 42, -86, -83, 77, 25, -44, 10, -17, 91, -29)
	      ));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), app.solution(Arrays.asList(
	          100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100)
	      ));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), app.solution(Arrays.asList(
	          -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)
	      ));
	    });
	  }

	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1), app.solution(Arrays.asList(1)));
	    });
	  }

	  @Test
	  @Order(11)
	  void test11() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Arrays.asList(-1, 1), app.solution(Arrays.asList(1, 2)));
	    });
	  }

	  @Test
	  @Order(12)
	  void test12() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
	      List<Integer> queries = new ArrayList<>();
	      List<Integer> expectedResult = new ArrayList<>();
	      queries.add(-1000000);
	      expectedResult.add(-1);
	      int i = 1000;
	      while (queries.get(queries.size() - 1) + i < 1000000) {
	        queries.add(queries.get(queries.size() - 1) + i);
	        expectedResult.add(i);
	        i = Math.max(i - 1, 20);
	      }
	      Assertions.assertEquals(expectedResult, app.solution(queries));
	    });
	  }
}
