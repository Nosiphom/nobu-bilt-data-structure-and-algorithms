package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FindFKdivisor3smallestElementTest {

	  private FindFKdivisor3smallestElement app;

	  @BeforeEach
	  void setUp() {
	    app = new FindFKdivisor3smallestElement();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> numbers = Arrays.asList(0);
	      List<Integer> expected_result = Arrays.asList(0);
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> numbers = Arrays.asList(33, 11, 44, 22, 55);
	      List<Integer> expected_result = Arrays.asList(33, 11, 33, 22, 22);
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	      List<Integer> expected_result = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 4, 4);
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> numbers = Arrays.asList(0, 84, 42, 22, 4, -28, 37, -15, 80, -54, -91, 41, 30, -90, 29, 100, 70, -89, 71, 12, -10, -67, 91, 11, 67, -29, -36, 24, 45, 33, 49, -9, -50, 77, -43, 20, -26, 25, -18, 39, 10, 66, -13, -51, -46, -95, 63, 65, 9, -8);
	      List<Integer> expected_result = Arrays.asList(0, 0, 42, 22, 4, 4, 4, 0, 4, 0, -15, 0, 0, -15, 0, 0, 0, 0, 0, 0, 0, -10, -10, 0, 0, -10, -10, -10, -10, 0, 0, -9, -9, -9, -10, -9, -10, -10, -10, -10, -10, -9, -10, -13, -13, -15, -15, -13, -13, -13);
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> numbers = Arrays.asList(-21, -79, -32, 44, 4, -8, -88, 92, 9, -72, -18, -40, 18, 52, -44, 5, -97, -10, 6, 24, -38, -50, 10, 21, -41, 60, -58, 65, -33, -60, -57, -89, 43, -52, 17, 71, 22, 19, 25, -100, 50, -37, 48, -16, 14, -35, 49, -43, 80, 83, 89, -65, -5, 26, -87, -3, -85, -36, -19, 100, -48, 97, -24, -69, -26, -25, -4, -66, -98, 7, -75, -13, -1, 11, -73, 15, 91, 1, -12, -31, 57, -62, 90, -91, 66, 31, -54, 58, -9, 84, 59, -96, -94, -39, 56, -61, 53, 78, -28, 62);
	      List<Integer> expected_result = Arrays.asList(-21, -79, -32, -32, -32, -21, -32, -32, -21, -32, -32, -32, -32, -32, -32, -32, -40, -32, -32, -32, -32, -38, -38, -32, -38, -38, -38, -38, -38, -38, -40, -41, -40, -41, -41, -40, -40, -40, -38, -40, -40, -38, -38, -38, -37, -37, -37, -37, -37, -37, -35, -37, -37, -35, -37, -37, -37, -37, -37, -36, -37, -37, -36, -37, -37, -36, -36, -37, -37, -37, -38, -37, -37, -37, -37, -37, -37, -36, -36, -36, -35, -36, -36, -36, -36, -36, -36, -36, -36, -35, -35, -36, -36, -37, -37, -37, -37, -37, -36, -36);
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
	      List<Integer> numbers = new java.util.ArrayList<>();
	      for (int i = 1; i <= 100000; i++) numbers.add(i);
	      List<Integer> expected_result = new java.util.ArrayList<>();
	      for (int i = 1; i <= 100000; i++) {
	        expected_result.add(numbers.get(i / 3));
	      }
	      List<Integer> result = app.solution(numbers);
	      Assertions.assertEquals(expected_result, result);
	    });
	  }
}
