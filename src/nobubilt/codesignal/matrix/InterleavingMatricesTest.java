package nobubilt.codesignal.matrix;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InterleavingMatricesTest {
	   private InterleavingMatrices app;

	    @BeforeEach
	    void setUp() {
	        app = new InterleavingMatrices();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[][] matrixA = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
	            int[][] matrixB = {{-11, -12, -13}, {-14, -15, -16}, {-17, -18, -19}};
	            int[][] submatrixCoords = {{2, 3, 2, 3}, {1, 2, 1, 2}};
	            int[][] expected = {{6, -11, 7, -12}, {10, -14, 11, -15}};
	            Assertions.assertArrayEquals(expected, app.interleaveMatrices(matrixA, matrixB, submatrixCoords));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[][] matrixA = {{1, -2}, {-1, 2}};
	            int[][] matrixB = {{-1, 2}, {1, -2}};
	            int[][] submatrixCoords = {{1, 2, 1, 2}, {1, 2, 1, 2}};
	            int[][] expected = {{1, -1, -2, 2}, {-1, 1, 2, -2}};
	            Assertions.assertArrayEquals(expected, app.interleaveMatrices(matrixA, matrixB, submatrixCoords));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[][] matrixA = {{1}, {2}};
	            int[][] matrixB = {{-1}, {-2}};
	            int[][] submatrixCoords = {{1, 1, 1, 1}, {1, 1, 1, 1}};
	            int[][] expected = {{1, -1}};
	            Assertions.assertArrayEquals(expected, app.interleaveMatrices(matrixA, matrixB, submatrixCoords));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[][] matrixA = {{0, 0, 0}};
	            int[][] matrixB = {{1, 1, 1}};
	            int[][] submatrixCoords = {{1, 1, 1, 1}, {1, 1, 1, 1}};
	            int[][] expected = {{0, 1}};
	            Assertions.assertArrayEquals(expected, app.interleaveMatrices(matrixA, matrixB, submatrixCoords));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[][] matrixA = {{89, -34, 23}, {1, -3, 0}};
	            int[][] matrixB = {{-12, -8, 2}, {7, -6, 10}};
	            int[][] submatrixCoords = {{2, 2, 1, 3}, {1, 1, 1, 3}};
	            int[][] expected = {{1, -12, -3, -8, 0, 2}};
	            Assertions.assertArrayEquals(expected, app.interleaveMatrices(matrixA, matrixB, submatrixCoords));
	        });
	    }
}

