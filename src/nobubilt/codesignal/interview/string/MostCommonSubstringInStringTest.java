package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MostCommonSubstringInStringTest {


    @Test
    public void test1() {
        assertEquals("anaba", MostCommonSubstringInString.findMostCommonSubstring("bananabananaba", 5));
    }

    @Test
    public void test2() {
        assertEquals(".aa", MostCommonSubstringInString.findMostCommonSubstring("a.b.aa.ab.", 3));
    }

    @Test
    public void test3() {
        assertEquals("ab", MostCommonSubstringInString.findMostCommonSubstring("abcabcabc", 2));
    }

    @Test
    public void test4() {
        assertEquals("r", MostCommonSubstringInString.findMostCommonSubstring("zyxwvutsr", 1));
    }

    @Test
    public void test5() {
        assertEquals("demiol", MostCommonSubstringInString.findMostCommonSubstring("epidemiology", 6));
    }
   
    @Test
    public void test6() {
        assertEquals("abcd", MostCommonSubstringInString.findMostCommonSubstring("abcdabcdabcdabcdabcd", 4));
    }
    
    @Test
    public void test7() {
        assertEquals("lol", MostCommonSubstringInString.findMostCommonSubstring("lololololo", 3));
    }

    @Test
    public void test8() {
        assertEquals("a", MostCommonSubstringInString.findMostCommonSubstring("a", 1));
    }

    @Test
    public void test9() {
        assertEquals("a", MostCommonSubstringInString.findMostCommonSubstring("aa", 1));
    }

    @Test
    public void test10() {
        assertEquals("a", MostCommonSubstringInString.findMostCommonSubstring("abcdefgh", 1));
    }

    @Test
    public void test11() {
        assertEquals("abcdefgh", MostCommonSubstringInString.findMostCommonSubstring("abcdefgh", 8));
    }
        
    @Test
    public void test12() {
        assertEquals("xy", MostCommonSubstringInString.findMostCommonSubstring("xyzzyx", 2));
    }

    @Test
    public void test13() {
        assertEquals("abcd", MostCommonSubstringInString.findMostCommonSubstring("abcd", 4));
    }

    @Test
    public void test14() {
        assertEquals("a", MostCommonSubstringInString.findMostCommonSubstring("aaa", 1));
    }

    @Test
    public void test15() {
        assertEquals("ace", MostCommonSubstringInString.findMostCommonSubstring("racecar", 3));
    }

    @Test
    public void test16() {
        assertEquals("aaa", MostCommonSubstringInString.findMostCommonSubstring("aaabbb", 3));
    }

}
