package nobubilt.codesignal.matrix;
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
public class ZigzagNegativePositionsOppositeDirectionTest {

	 private ZigzagNegativePositionsOppositeDirection app;

	  @BeforeEach
	  void setUp() {
	    app = new ZigzagNegativePositionsOppositeDirection();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {1, -2, 3, -4},
	        {5, -6, 7, 8},
	        {-9, 10, -11, 12}
	      };
	      List<int[]> expected = Arrays.asList(
	        new int[] {1, 2}, 
	        new int[] {3, 1}, 
	        new int[] {2, 2}, 
	        new int[] {1, 4}, 
	        new int[] {3, 3}
	      );
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 1 failed!");
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {0, 0},
	        {0, 0},
	        {0, 0}
	      };
	      List<int[]> expected = Arrays.asList();
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 2 failed!");
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {-89}
	      };
	      List<int[]> expected = Arrays.asList(
	        new int[] {1, 1}
	      );
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 3 failed!");
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {1, -1},
	        {-1, 1}
	      };
	      List<int[]> expected = Arrays.asList(
	        new int[] {1, 2}, 
	        new int[] {2, 1}
	      );
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 4 failed!");
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {0, -1, 0},
	        {-1, 2, -1},
	        {0, -1, 0}
	      };
	      List<int[]> expected = Arrays.asList(
	        new int[] {1, 2},
	        new int[] {2, 1},
	        new int[] {2, 3},
	        new int[] {3, 2}
	      );
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 5 failed!");
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {
	        {-10, 20, -30, 40, -50},
	        {60, -70, 80, -90, 100}
	      };
	      List<int[]> expected = Arrays.asList(
	        new int[] {1, 1},
	        new int[] {2, 2},
	        new int[] {1, 3},
	        new int[] {2, 4},
	        new int[] {1, 5}
	      );
	      Assertions.assertEquals(expected.size(), app.solution(matrix).size(), "Test case 6 failed!");
	    });
	  }
	}
