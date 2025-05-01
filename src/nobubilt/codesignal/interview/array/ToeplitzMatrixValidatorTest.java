package nobubilt.codesignal.interview.array;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ToeplitzMatrixValidatorTest {

    @Test
    public void testCase1() {
        int[][] matrix = {{6, 7, 8}, {4, 6, 7}, {1, 4, 6}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(false, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1, 7}, {5, 1}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase4() {
        int[][] matrix = {{9}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase5() {
        int[][] matrix = {{1, 5, 9}, {6, 1, 5}, {11, 6, 1}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase6() {
        int[][] matrix = {{1, 2, 1}, {0, 1, 2}, {3, 0, 1}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase7() {
        int[][] matrix = {{-4, -9, -4}, {-3, -4, -9}, {-2, -3, -4}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase8() {
        int[][] matrix = {{1, 2, 1}, {2, 1, 2}, {3, 2, 1}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase9() {
        int[][] matrix = {{3, 3, 3}, {3, 1, 3}, {3, 3, 3}};
        assertEquals(false, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase10() {
        int[][] matrix = {{4, 4, 4, 4}, {1, 4, 4, 4}, {4, 1, 4, 4}, {4, 4, 0, 4}};
        assertEquals(false, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase11() {
        int[][] matrix = {{5, 5}, {5, 4}};
        assertEquals(false, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase12() {
        int[][] matrix = {{10, 9}, {8, 10}};
        assertEquals(true, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }

    @Test
    public void testCase13() {
        int[][] matrix = {{7, 7, 7}, {7, 7, 0}, {7, 0, 7}};
        assertEquals(false, ToeplitzMatrixValidator.isToeplitzMatrix(matrix));
    }
}
