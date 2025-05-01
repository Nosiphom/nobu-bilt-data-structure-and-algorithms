package nobubilt.codesignal.interview.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class RecursionWordGeneratorTest {

    @Test
    public void test1() {
        List<String> expected = Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"abc", "def", "ghi"}));
    }

    @Test
    public void test2() {
        List<String> expected = Arrays.asList("gik", "gil", "gjk", "gjl", "hik", "hil", "hjk", "hjl");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"gh", "ij", "kl"}));
    }

    @Test
    public void test3() {
        List<String> expected = Arrays.asList("prt", "pru", "pst", "psu", "qrt", "qru", "qst", "qsu");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"pq", "rs", "tu"}));
    }

    @Test
    public void test4() {
        List<String> expected = Arrays.asList("vxz", "vx_", "vyz", "vy_", "wxz", "wx_", "wyz", "wy_");
        Collections.sort(expected);
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"vw", "xy", "z_"}));
    }

    @Test
    public void test5() {
        List<String> expected = Arrays.asList("357", "358", "367", "368", "457", "458", "467", "468");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"34", "56", "78"}));
    }

    @Test
    public void test6() {
        List<String> expected = Arrays.asList("1357", "1358", "1367", "1368", "1457", "1458", "1467", "1468", "2357", "2358", "2367", "2368", "2457", "2458", "2467", "2468");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"12", "34", "56", "78"}));
    }

    @Test
    public void test7() {
        List<String> expected = Arrays.asList("ab");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"a", "b"}));
    }
    
    @Test
    public void test8() {
        List<String> expected = Arrays.asList("prtv", "prtw", "pruv", "pruw", "pstv", "pstw", "psuv", "psuw", "qrtv", "qrtw", "qruv", "qruw", "qstv", "qstw", "qsuv", "qsuw");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"pq", "rs", "tu", "vw"}));
    }

    @Test
    public void test9() {
        List<String> expected = Arrays.asList("_&^*%");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"_", "&", "^", "*", "%"}));
    }

    // Additional tests to ensure robust verification
    @Test
    public void test10() {
        List<String> expected = Arrays.asList("abcde");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"a", "b", "c", "d", "e"}));
    }

    @Test
    public void test11() {
        List<String> expected = Arrays.asList("fghijk");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"f", "g", "h", "i", "j", "k"}));
    }

    @Test
    public void test12() {
        List<String> expected = Arrays.asList("lmnop");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"l", "m", "n", "o", "p"}));
    }

    @Test
    public void test13() {
        List<String> expected = Arrays.asList("z");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"z"}));
    }

    @Test
    public void test14() {
        List<String> expected = Arrays.asList("abcd");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"a", "b", "c", "d"}));
    }

    @Test
    public void test15() {
        List<String> expected = Arrays.asList("123");
        assertEquals(expected, RecursionWordGenerator.solution(new String[]{"1", "2", "3"}));
    }
}
