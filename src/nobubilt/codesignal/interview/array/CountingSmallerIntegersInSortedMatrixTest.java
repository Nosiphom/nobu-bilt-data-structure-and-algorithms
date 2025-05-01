package nobubilt.codesignal.interview.array;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountingSmallerIntegersInSortedMatrixTest {

	  public void test1() {
	        int[][] matrix = {
	            {1, 2, 3, 4}, 
	            {2, 3, 4, 5}, 
	            {3, 4, 5, 6}, 
	            {4, 5, 6, 7}
	        };
	        int target = 5;
	        assertEquals(10, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test2() {
	        int[][] matrix = {{1}};
	        int target = 1;
	        assertEquals(0, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test3() {
	        int[][] matrix = {
	            {1, 2}, 
	            {2, 3}
	        };
	        int target = 2;
	        assertEquals(1, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test4() {
	        int[][] matrix = {
	            {-10, -5, 0, 5}, 
	            {0, 5, 10, 15}, 
	            {10, 15, 20, 25}, 
	            {20, 25, 30, 35}
	        };
	        int target = 5;
	        assertEquals(4, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test5() {
	        int[][] matrix = {
	            {1000000, 1000000}, 
	            {1000000, 1000000}
	        };
	        int target = 1000000;
	        assertEquals(0, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test6() {
	        int[][] matrix = {
	            {1, 2, 4, 8, 16}, 
	            {2, 4, 8, 16, 32}, 
	            {4, 8, 16, 32, 64}, 
	            {8, 16, 32, 64, 128}, 
	            {16, 32, 64, 128, 256}
	        };
	        int target = 100;
	        assertEquals(22, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test7() {
	        int[][] matrix = {
	            {2, 3, 5, 7}, 
	            {3, 5, 7, 11}, 
	            {5, 7, 11, 13}, 
	            {7, 11, 13, 17}
	        };
	        int target = 10;
	        assertEquals(10, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }

	    @Test
	    public void test8() {
	        int[][] matrix = {
	            {0, 10, 20, 30}, 
	            {10, 20, 30, 40}, 
	            {20, 30, 40, 50}, 
	            {30, 40, 50, 60}
	        };
	        int target = 25;
	        assertEquals(6, CountingSmallerIntegersInSortedMatrix.countLessThan(matrix, target));
	    }
	}
