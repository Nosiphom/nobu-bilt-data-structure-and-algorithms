package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringIntersectionTest {


    @Test
    public void test1() {
        assertEquals("abcd", StringIntersection.solution("abcd", "dcba"));
    }

    @Test
    public void test2() {
        assertEquals("ape", StringIntersection.solution("apple", "peach"));
    }

    @Test
    public void test3() {
        assertEquals("abc", StringIntersection.solution("aabbcc", "abc"));
    }

    @Test
    public void test4() {
        assertEquals("aaaa", StringIntersection.solution("aaaa", "aaaa"));
    }

    @Test
    public void test5() {
        assertEquals("abcdef", StringIntersection.solution("abcdef", "fedcba"));
    }

    @Test
    public void test6() {
        assertEquals("abcd", StringIntersection.solution("aabbccdd", "bcda"));
    }
    
    @Test
    public void test7() {
        assertEquals("python", StringIntersection.solution("python", "thonpy"));
    }
    
    @Test
    public void test8() {
        assertEquals("iervew", StringIntersection.solution("interview", "review"));
    }

    @Test
    public void test9() {
        assertEquals("", StringIntersection.solution("aaaaa", "b"));
    }
    
    @Test
    public void test10() {
        assertEquals("", StringIntersection.solution("abc", "def"));
    }
}
