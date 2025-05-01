package nobubilt.codesignal.matrix;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SubmatrixSwapInMatrixTest {

	  private SubmatrixSwapInMatrix app;

	  @BeforeEach
	  void setUp() {
	    app = new SubmatrixSwapInMatrix();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {{1, 2, 3, 4, 5},
	                        {6, 7, 8, 9, 10},
	                        {11, 12, 13, 14, 15},
	                        {16, 17, 18, 19, 20},
	                        {21, 22, 23, 24, 25}};
	      int[] coord_S1 = {0, 2, 0, 2};
	      int[] coord_S2 = {3, 5, 0, 2};
	      int[][] expected = {{16, 17, 3, 4, 5},
	                          {21, 22, 8, 9, 10},
	                          {11, 12, 13, 14, 15},
	                          {1, 2, 18, 19, 20},
	                          {6, 7, 23, 24, 25}};
	      app.submatrixSwap(matrix, coord_S1, coord_S2);
	      Assertions.assertArrayEquals(expected, matrix);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {{1, 2, 3, 4, 5},
	                        {6, 7, 8, 9, 10},
	                        {11, 12, 13, 14, 15},
	                        {16, 17, 18, 19, 20},
	                        {21, 22, 23, 24, 25}};
	      int[] coord_S1 = {0, 1, 0, 1};
	      int[] coord_S2 = {1, 2, 1, 2};
	      int[][] expected = {{7, 2, 3, 4, 5},
	                          {6, 1, 8, 9, 10},
	                          {11, 12, 13, 14, 15},
	                          {16, 17, 18, 19, 20},
	                          {21, 22, 23, 24, 25}};
	      app.submatrixSwap(matrix, coord_S1, coord_S2);
	      Assertions.assertArrayEquals(expected, matrix);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {{1, 2},
	                        {3, 4}};
	      int[] coord_S1 = {0, 1, 0, 1};
	      int[] coord_S2 = {1, 2, 1, 2};
	      int[][] expected = {{4, 2},
	                          {3, 1}};
	      app.submatrixSwap(matrix, coord_S1, coord_S2);
	      Assertions.assertArrayEquals(expected, matrix);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {{1, 2, 3},
	                        {4, 5, 6},
	                        {7, 8, 9},
	                        {10, 11, 12}};
	      int[] coord_S1 = {0, 2, 0, 2};
	      int[] coord_S2 = {2, 4, 1, 3};
	      int[][] expected = {{8, 9, 3},
	                          {11, 12, 6},
	                          {7, 1, 2},
	                          {10, 4, 5}};
	      app.submatrixSwap(matrix, coord_S1, coord_S2);
	      Assertions.assertArrayEquals(expected, matrix);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrix = {{10, 11, 12, 13, 14},
	                        {15, 16, 17, 18, 19}};
	      int[] coord_S1 = {0, 1, 0, 2};
	      int[] coord_S2 = {1, 2, 2, 4};
	      int[][] expected = {{17, 18, 12, 13, 14},
	                          {15, 16, 10, 11, 19}};
	      app.submatrixSwap(matrix, coord_S1, coord_S2);
	      Assertions.assertArrayEquals(expected, matrix);
	    });
	  }
}
