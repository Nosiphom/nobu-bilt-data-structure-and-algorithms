package nobubilt.codesignal.interview.dp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumStepsToTransform0toNdpTest {


    @Test
    public void test_case_1() {
        assertEquals(1, MinimumStepsToTransform0toNdp.minSteps(1));
    }

    @Test
    public void test_case_2() {
        assertEquals(2, MinimumStepsToTransform0toNdp.minSteps(2));
    }

    @Test
    public void test_case_3() {
        assertEquals(3, MinimumStepsToTransform0toNdp.minSteps(3));
    }

    @Test
    public void test_case_4() {
        assertEquals(3, MinimumStepsToTransform0toNdp.minSteps(4));
    }

    @Test
    public void test_case_5() {
        assertEquals(4, MinimumStepsToTransform0toNdp.minSteps(5));
    }

    @Test
    public void test_case_6() {
        assertEquals(5, MinimumStepsToTransform0toNdp.minSteps(10));
    }

    @Test
    public void test_case_7() {
        assertEquals(7, MinimumStepsToTransform0toNdp.minSteps(15));
    }

    @Test
    public void test_case_8() {
        assertEquals(6, MinimumStepsToTransform0toNdp.minSteps(20));
    }

    @Test
    public void test_case_9() {
        assertEquals(8, MinimumStepsToTransform0toNdp.minSteps(50));
    }

    @Test
    public void test_case_10() {
        assertEquals(9, MinimumStepsToTransform0toNdp.minSteps(100));
    }

    @Test
    public void test_case_11() {
        assertEquals(10, MinimumStepsToTransform0toNdp.minSteps(200));
    }

    @Test
    public void test_case_12() {
        assertEquals(14, MinimumStepsToTransform0toNdp.minSteps(500));
    }

    @Test
    public void test_case_13() {
        assertEquals(15, MinimumStepsToTransform0toNdp.minSteps(1000));
    }

    @Test
    public void test_case_14() {
        assertEquals(6, MinimumStepsToTransform0toNdp.minSteps(17));
    }

    @Test
    public void test_case_15() {
        assertEquals(11, MinimumStepsToTransform0toNdp.minSteps(321));
    }

    @Test
    public void test_case_16() {
        assertEquals(15, MinimumStepsToTransform0toNdp.minSteps(888));
    }
}