package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Find3rdMinimumWithDeletionsTest {

	  private Find3rdMinimumWithDeletions app;

	  @BeforeEach
	  void setUp() {
	    app = new Find3rdMinimumWithDeletions();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("delete", 1),
	        Map.entry("find", 0),
	        Map.entry("delete", 2),
	        Map.entry("find", 0)
	      );
	      List<Integer> expected_result = Arrays.asList(4, 5);
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(1, 2);
	      List<Map.Entry<String, Integer>> queries = Collections.singletonList(Map.entry("find", 0));
	      List<Integer> expected_result = Collections.singletonList(-1);
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("delete", 1),
	        Map.entry("delete", 2),
	        Map.entry("find", 0)
	      );
	      List<Integer> expected_result = Collections.singletonList(5);
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("find", 0), 
	        Map.entry("find", 0), 
	        Map.entry("find", 0)
	      );
	      List<Integer> expected_result = Arrays.asList(3, 3, 3);
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("delete", 3),
	        Map.entry("find", 0),
	        Map.entry("find", 0),
	        Map.entry("find", 0),
	        Map.entry("find", 0),
	        Map.entry("delete", 4),
	        Map.entry("delete", 2),
	        Map.entry("delete", 2),
	        Map.entry("find", 0),
	        Map.entry("delete", 1)
	      );
	      List<Integer> expected_result = Arrays.asList(4, 4, 4, 4, 7);
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(
	        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
	        21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
	        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
	      );
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("find", 0), Map.entry("delete", 5), Map.entry("find", 0), Map.entry("delete", 3),
	        Map.entry("delete", 3), Map.entry("find", 0), Map.entry("delete", 3), Map.entry("find", 0),
	        Map.entry("delete", 4), Map.entry("delete", 5), Map.entry("find", 0), Map.entry("delete", 4),
	        Map.entry("delete", 2), Map.entry("delete", 5), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("delete", 4), Map.entry("find", 0), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("delete", 4), Map.entry("delete", 4), Map.entry("delete", 4), Map.entry("find", 0),
	        Map.entry("delete", 2), Map.entry("find", 0), Map.entry("delete", 1), Map.entry("find", 0),
	        Map.entry("delete", 2), Map.entry("delete", 3), Map.entry("find", 0), Map.entry("delete", 3),
	        Map.entry("delete", 2), Map.entry("delete", 4), Map.entry("find", 0), Map.entry("delete", 4),
	        Map.entry("find", 0), Map.entry("delete", 2), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("delete", 4), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 1),
	        Map.entry("find", 0), Map.entry("delete", 3), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("delete", 3), Map.entry("delete", 3)
	      );
	      List<Integer> expected_result = Arrays.asList(
	        3, 3, 6, 7, 7, 11, 11, 11, 11, 11, 11, 17, 18, 20, 22, 22, 25, 25, 25, 25, 27, 28, 28
	      );
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> data = Arrays.asList(
	        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
	        21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
	        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56,
	        57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
	        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92,
	        93, 94, 95, 96, 97, 98, 99, 100
	      );
	      List<Map.Entry<String, Integer>> queries = Arrays.asList(
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 1), Map.entry("find", 0),
	        Map.entry("delete", 1), Map.entry("delete", 3), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("delete", 1), Map.entry("delete", 1), Map.entry("delete", 3), Map.entry("find", 0),
	        Map.entry("delete", 1), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 5),
	        Map.entry("find", 0), Map.entry("delete", 3), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 4),
	        Map.entry("delete", 3), Map.entry("find", 0), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 3),
	        Map.entry("delete", 4), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 5),
	        Map.entry("delete", 5), Map.entry("find", 0), Map.entry("delete", 2), Map.entry("delete", 2),
	        Map.entry("find", 0), Map.entry("delete", 2), Map.entry("find", 0), Map.entry("delete", 4),
	        Map.entry("delete", 2), Map.entry("delete", 5), Map.entry("delete", 1), Map.entry("find", 0),
	        Map.entry("delete", 1), Map.entry("delete", 3), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 5), Map.entry("delete", 1),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 5), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 3), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("delete", 2), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 5), Map.entry("find", 0),
	        Map.entry("delete", 4), Map.entry("find", 0), Map.entry("delete", 2), Map.entry("find", 0),
	        Map.entry("delete", 5), Map.entry("find", 0), Map.entry("delete", 5), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 4), Map.entry("delete", 2),
	        Map.entry("find", 0), Map.entry("delete", 2), Map.entry("delete", 1), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("delete", 1), Map.entry("find", 0), Map.entry("find", 0),
	        Map.entry("find", 0), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 1),
	        Map.entry("delete", 5), Map.entry("find", 0), Map.entry("find", 0), Map.entry("delete", 4)
	      );
	      List<Integer> expected_result = Arrays.asList(
	        3, 3, 4, 6, 6, 9, 10, 10, 10, 11, 11, 11, 11, 11, 14, 14, 14, 14, 14, 14, 15, 15, 15, 20, 21, 
	        24, 27, 27, 27, 27, 28, 28, 28, 28, 28, 30, 30, 32, 32, 32, 32, 32, 32, 35, 35, 35, 35, 35, 39, 
	        41, 41, 42, 42, 42, 42, 42, 43, 43
	      );
	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
	      List<Integer> data = new ArrayList<>();
	      for (int i = 1; i <= 200000; ++i) {
	        data.add(i);
	      }

	      List<Map.Entry<String, Integer>> queries = new ArrayList<>();
	      for (int i = 0; i < 200000; ++i) {
	        if (i % 2 == 0) {
	          queries.add(Map.entry("delete", 1));
	        } else {
	          queries.add(Map.entry("find", 0));
	        }
	      }

	      List<Integer> expected_result = new ArrayList<>();
	      for (int i = 0; i < 200000 / 2; ++i) {
	        if (i + 3 < data.size()) {
	          expected_result.add(i + 4);
	        } else {
	          expected_result.add(-1);
	        }
	      }

	      Assertions.assertEquals(expected_result, app.solution(data, queries));
	    });
	  }
}
