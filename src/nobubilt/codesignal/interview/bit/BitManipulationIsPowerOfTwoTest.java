package nobubilt.codesignal.interview.bit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BitManipulationIsPowerOfTwoTest {


    @Test
    public void test1() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(1));
    }

    @Test
    public void test2() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(2));
    }

    @Test
    public void test3() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(3));
    }

    @Test
    public void test4() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(4));
    }

    @Test
    public void test5() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(5));
    }

    @Test
    public void test6() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(6));
    }

    @Test
    public void test7() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(7));
    }

    @Test
    public void test8() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(8));
    }

    @Test
    public void test9() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(9));
    }

    @Test
    public void test10() {
        assertEquals(false, BitManipulationIsPowerOfTwo.solution(10));
    }

    @Test
    public void test11() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(16));
    }

    @Test
    public void test12() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(32));
    }

    @Test
    public void test13() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(64));
    }

    @Test
    public void test14() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(128));
    }

    @Test
    public void test15() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(256));
    }

    @Test
    public void test16() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(512));
    }

    @Test
    public void test17() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(1024));
    }

    @Test
    public void test18() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(2048));
    }

    @Test
    public void test19() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(4096));
    }

    @Test
    public void test20() {
        assertEquals(true, BitManipulationIsPowerOfTwo.solution(8192));
    }
}
