package nobubilt.codesignal.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindingFibonacciRecursivelyTest {

    @Test
    public void test1() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(0, solution.fibonacci(0));
    }

    @Test
    public void test2() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(1, solution.fibonacci(1));
    }

    @Test
    public void test3() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(1, solution.fibonacci(2));
    }

    @Test
    public void test4() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(55, solution.fibonacci(10));
    }

    @Test
    public void test5() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(6765, solution.fibonacci(20));
    }

    @Test
    public void test6() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(832040, solution.fibonacci(30));
    }

    @Test
    public void test7() {
        FindingFibonacciRecursively solution = new FindingFibonacciRecursively();
        assertEquals(12586269025L, solution.fibonacci(50));
    }
}