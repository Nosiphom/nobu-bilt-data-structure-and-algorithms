package nobubilt.codesignal.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CircularShiftWithoutBuiltInMethodsTest {

	  @Test
	    public void testCase1() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(4, 5, 1, 2, 3), solution.shiftListElements(Arrays.asList(1, 2, 3, 4, 5), 2));
	    }

	    @Test
	    public void testCase2() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(2, 3, 4, 5, 1), solution.shiftListElements(Arrays.asList(1, 2, 3, 4, 5), -1));
	    }

	    @Test
	    public void testCase3() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(32, -4, 7, 8, 20, -3, 23), solution.shiftListElements(Arrays.asList(8, 20, -3, 23, 32, -4, 7), 3));
	    }

	    @Test
	    public void testCase4() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(-3), solution.shiftListElements(Arrays.asList(-3), 100));
	    }

	    @Test
	    public void testCase5() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(123, 53, 23, 123, -432, 3, 2, 12), solution.shiftListElements(Arrays.asList(3, 2, 12, 123, 53, 23, 123, -432), 5));
	    }

	    @Test
	    public void testCase6() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(1, 2, 3, 4, 5), solution.shiftListElements(Arrays.asList(1, 2, 3, 4, 5), 0));
	    }

	    @Test
	    public void testCase7() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(1, 1, 1, 1, 1, 1), solution.shiftListElements(Arrays.asList(1, 1, 1, 1, 1, 1), 2));
	    }

	    @Test
	    public void testCase8() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), solution.shiftListElements(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1000));
	    }

	    @Test
	    public void testCase9() {
	        CircularShiftWithoutBuiltInMethods solution = new CircularShiftWithoutBuiltInMethods();
	        assertEquals(Arrays.asList(-1000, -999, -998, -997, -996), solution.shiftListElements(Arrays.asList(-1000, -999, -998, -997, -996), -1000));
	    }
	}
