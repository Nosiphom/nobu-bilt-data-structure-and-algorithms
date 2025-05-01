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
public class MatrixBoundaryLayeredConcatTest {


	  private MatrixBoundaryLayeredConcat app;

	  @BeforeEach
	  void setUp() {
	    app = new MatrixBoundaryLayeredConcat();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrixA = {{1}};
	      int[][] matrixB = {{-1}};
	      int n = 1;
	      List<Integer> expectedOutput = Arrays.asList(1, -1);
	      Assertions.assertEquals(expectedOutput, app.matrixBoundaryConcatenation(matrixA, matrixB, n));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrixA = {{1, 2}, {3, 4}};
	      int[][] matrixB = {{5, 6}, {7, 8}};
	      int n = 1;
	      List<Integer> expectedOutput = Arrays.asList(1, 2, 4, 3, 5, 6, 8, 7);
	      Assertions.assertEquals(expectedOutput, app.matrixBoundaryConcatenation(matrixA, matrixB, n));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	      int[][] matrixB = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
	      int n = 2;
	      List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5, 10, 11, 12, 15, 18, 17, 16, 13, 14);
	      Assertions.assertEquals(expectedOutput, app.matrixBoundaryConcatenation(matrixA, matrixB, n));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrixA = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
	      int[][] matrixB = {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}, {23, 24, 25, 26}};
	      int n = 2;
	      List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10, 11, 12, 13, 14, 18, 22, 26, 25, 24, 23, 19, 15, 16, 17, 21, 20);
	      Assertions.assertEquals(expectedOutput, app.matrixBoundaryConcatenation(matrixA, matrixB, n));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[][] matrixA = {
	        {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, 
	        {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}
	      };
	      int[][] matrixB = {
	        {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, 
	        {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}
	      };
	      int n = 3;
	      List<Integer> expectedOutput = Arrays.asList(
	        1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13, 
	        26, 27, 28, 29, 30, 35, 40, 45, 50, 49, 48, 47, 46, 41, 36, 31, 32, 33, 34, 39, 44, 43, 42, 37, 38
	      );
	      Assertions.assertEquals(expectedOutput, app.matrixBoundaryConcatenation(matrixA, matrixB, n));
	    });
	  }
	}