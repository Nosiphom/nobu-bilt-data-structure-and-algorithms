package nobubilt.codesignal.array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MaxCumulativeSumQueryTest {
	  private MaxCumulativeSumQuery app;

	  @BeforeEach
	  void setUp() {
	    app = new MaxCumulativeSumQuery();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
	      List<int[]> queries = Arrays.asList(
	              new int[]{0, 3},
	              new int[]{1, 2},
	              new int[]{3, 4},
	              new int[]{0, 2},
	              new int[]{2, 4}
	      );
	      List<Integer> expected = Arrays.asList(6, 1, 4, 2, 7);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {-1, -2, -3, -4, -5};
	      List<int[]> queries = Arrays.asList(
	              new int[]{0, 1},
	              new int[]{1, 2},
	              new int[]{2, 3},
	              new int[]{3, 4}
	      );
	      List<Integer> expected = Arrays.asList(-1, -2, -3, -4);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {1, 2, 3, 4, 5};
	      List<int[]> queries = Arrays.asList(
	              new int[]{0, 1},
	              new int[]{1, 2},
	              new int[]{2, 3},
	              new int[]{3, 4}
	      );
	      List<Integer> expected = Arrays.asList(3, 5, 7, 9);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {-90, 78, -53, 1, -69, -48, -61, 54, -6, -82, -43, -81, 3, 67, -14, -24, -96, 42, -72, 29};
	      List<int[]> queries = Arrays.asList(
	              new int[]{6, 12},
	              new int[]{4, 11},
	              new int[]{7, 14},
	              new int[]{4, 17},
	              new int[]{12, 15}
	      );
	      List<Integer> expected = Arrays.asList(-7, -69, 54, -69, 70);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {-72, 29, -35, -88, -95, 69, -93, -16, 52, -40, -52, -2, -6, -28, 24, 41, 71, 62, 70, 23, 3, -72, 7, -15, 24, 42, -13, -64, 3, 65, 44, -43, 97, 53, -46, 73, -87, 7, 6, -38, -72, -16, -5, -20, -1, 49, -96, -68, -22, 82};
	      List<int[]> queries = Arrays.asList(
	              new int[]{30, 42},
	              new int[]{42, 45},
	              new int[]{11, 26},
	              new int[]{26, 32},
	              new int[]{10, 34},
	              new int[]{27, 48},
	              new int[]{4, 22}
	      );
	      List<Integer> expected = Arrays.asList(178, 23, 258, 89, 334, 182, 83);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {100};
	      List<int[]> queries = Arrays.asList(new int[]{0, 0});
	      List<Integer> expected = Arrays.asList(100);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arr = {-25, 92, 61, -82, 88, 80, -49, -43, 39, -30, -22, -77, -24, 11, -80, 22, 62, -57, 72, 3, -75, -80, 58, -44, -33, -14, -32, -54, 49, -29, 82, 51, 97, -25, 88, 84, 31, 79, -11, -79, 62, -21, -43, -93, -62, -6, 25, -16, 13, -51, 29, -85, -14, 37, 49, -87, -45, 28, -97, 84, -47, 79, 100, 63, -80, 99, -33, -10, 63, 93, -46, 100, -78, 28, -37, 89, -44, -74, -43, 40, 39, -97, 24, -81, -2, 73, 62, -52, -89, 51, -99, 43, -66, 28, -38, -95, 84, 31, 11, -7};
	      List<int[]> queries = Arrays.asList(
	              new int[]{22, 90},
	              new int[]{61, 92},
	              new int[]{14, 78},
	              new int[]{27, 95},
	              new int[]{84, 94},
	              new int[]{82, 94},
	              new int[]{60, 79},
	              new int[]{10, 76},
	              new int[]{5, 72},
	              new int[]{26, 78}
	      );
	      List<Integer> expected = Arrays.asList(388, 430, 255, 453, 133, 76, 383, 143, 140, 421);
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(20000), () -> {
	      int[] arr = new int[1000];
	      for (int i = 0; i < 1000; i++) {
	        arr[i] = i + 1;
	      }
	      List<int[]> queries = new ArrayList<>();
	      List<Integer> expected = new ArrayList<>();
	      for (int i = 0; i < 1000; i++) {
	        for (int j = i; j < 1000; j++) {
	          queries.add(new int[]{i, j});
	          expected.add((i + j + 2) * (j - i + 1) / 2);
	        }
	      }
	      Assertions.assertEquals(expected, app.solution(arr, queries));
	    });
	  }
}
