package nobubilt.codesignal.interview.bit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindThePositionOfTheLoneSetBitTest {


    @Test
    public void test1() {
        assertEquals(5, FindThePositionOfTheLoneSetBit.findLoneSetBit(16));
    }

    @Test
    public void test2() {
        assertEquals(-1, FindThePositionOfTheLoneSetBit.findLoneSetBit(13));
    }

    @Test
    public void test3() {
        assertEquals(-1, FindThePositionOfTheLoneSetBit.findLoneSetBit(0));
    }

    @Test
    public void test4() {
        assertEquals(4, FindThePositionOfTheLoneSetBit.findLoneSetBit(8));
    }

    @Test
    public void test5() {
        assertEquals(2, FindThePositionOfTheLoneSetBit.findLoneSetBit(2));
    }

    @Test
    public void test6() {
        assertEquals(1, FindThePositionOfTheLoneSetBit.findLoneSetBit(1));
    }

    @Test
    public void test7() {
        assertEquals(7, FindThePositionOfTheLoneSetBit.findLoneSetBit(64));
    }

    @Test
    public void test8() {
        assertEquals(11, FindThePositionOfTheLoneSetBit.findLoneSetBit(1024));
    }

    @Test
    public void test9() {
        assertEquals(-1, FindThePositionOfTheLoneSetBit.findLoneSetBit(15));
    }

    @Test
    public void test10() {
        assertEquals(10, FindThePositionOfTheLoneSetBit.findLoneSetBit(512));
    }
}
