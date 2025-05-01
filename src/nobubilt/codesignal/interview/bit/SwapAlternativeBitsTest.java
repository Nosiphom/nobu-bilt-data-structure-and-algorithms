package nobubilt.codesignal.interview.bit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SwapAlternativeBitsTest {


    @Test
    public void test1() {
        assertEquals(43, SwapAlternativeBits.swapBits(23));
    }

    @Test
    public void test2() {
        assertEquals(2, SwapAlternativeBits.swapBits(1));
    }

    @Test
    public void test3() {
        assertEquals(1, SwapAlternativeBits.swapBits(2));
    }

    @Test
    public void test4() {
        assertEquals(152, SwapAlternativeBits.swapBits(100));
    }

    @Test
    public void test5() {
        assertEquals(980, SwapAlternativeBits.swapBits(1000));
    }

    @Test
    public void test6() {
        assertEquals(1023, SwapAlternativeBits.swapBits(1023));
    }

    @Test
    public void test7() {
        assertEquals(2048, SwapAlternativeBits.swapBits(1024));
    }

    @Test
    public void test8() {
        assertEquals(1024, SwapAlternativeBits.swapBits(2048));
    }

    @Test
    public void test9() {
        assertEquals(810, SwapAlternativeBits.swapBits(789));
    }

    @Test
    public void test10() {
        assertEquals(987, SwapAlternativeBits.swapBits(999));
    }

    @Test
    public void test11() {
        assertEquals(760, SwapAlternativeBits.swapBits(500));
    }

    @Test
    public void test12() {
        assertEquals(764, SwapAlternativeBits.swapBits(508));
    }

    @Test
    public void test13() {
        assertEquals(767, SwapAlternativeBits.swapBits(511));
    }

    @Test
    public void test14() {
        assertEquals(64, SwapAlternativeBits.swapBits(128));
    }

    @Test
    public void test15() {
        assertEquals(512, SwapAlternativeBits.swapBits(256));
    }

    @Test
    public void test16() {
        assertEquals(2050, SwapAlternativeBits.swapBits(1025));
    }

    @Test
    public void test17() {
        assertEquals(3071, SwapAlternativeBits.swapBits(2047));
    }

    @Test
    public void test18() {
        assertEquals(4095, SwapAlternativeBits.swapBits(4095));
    }

    @Test
    public void test19() {
        assertEquals(12287, SwapAlternativeBits.swapBits(8191));
    }

    @Test
    public void test20() {
        assertEquals(16383, SwapAlternativeBits.swapBits(16383));
    }
}
