package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestCommonSuffixPostFixInStringTest {


    @Test
    public void test1() {
        assertEquals("arking", LongestCommonSuffixPostFixInString.solution(new String[]{"barking", "parking", "starking"}));
    }

    @Test
    public void test2() {
        assertEquals("ower", LongestCommonSuffixPostFixInString.solution(new String[]{"flower", "tower", "power"}));
    }

    @Test
    public void test3() {
        assertEquals("a", LongestCommonSuffixPostFixInString.solution(new String[]{"alpha", "beta", "gamma"}));
    }

    @Test
    public void test4() {
        assertEquals("acer", LongestCommonSuffixPostFixInString.solution(new String[]{"racer", "placer", "effacer"}));
    }

    @Test
    public void test5() {
        assertEquals("ello", LongestCommonSuffixPostFixInString.solution(new String[]{"hello", "jello"}));
    }

    @Test
    public void test6() {
        assertEquals("word", LongestCommonSuffixPostFixInString.solution(new String[]{"word"}));
    }

    @Test
    public void test7() {
        assertEquals("apple", LongestCommonSuffixPostFixInString.solution(new String[]{"apple", "grapple", "pineapple"}));
    }

    @Test
    public void test8() {
        assertEquals("a", LongestCommonSuffixPostFixInString.solution(new String[]{"a", "aa", "aaa"}));
    }

    @Test
    public void test9() {
        assertEquals("", LongestCommonSuffixPostFixInString.solution(new String[]{"ab", "abc", "abcd"}));
    }

    @Test
    public void test10() {
        assertEquals("", LongestCommonSuffixPostFixInString.solution(new String[]{}));
    }

    @Test
    public void test11() {
        assertEquals("duction", LongestCommonSuffixPostFixInString.solution(new String[]{"introduction", "reduction", "production", "seduction"}));
    }

    @Test
    public void test12() {
        assertEquals("ation", LongestCommonSuffixPostFixInString.solution(new String[]{"communication", "station", "vacation", "nation"}));
    }

    @Test
    public void test13() {
        assertEquals("oon", LongestCommonSuffixPostFixInString.solution(new String[]{"spoon", "moon", "balloon", "cartoon", "raccoon"}));
    }

    @Test
    public void test14() {
        assertEquals("dabra", LongestCommonSuffixPostFixInString.solution(new String[]{"abracadabra", "dabra", "califragilisticexpialidociousdabra"}));
    }

    @Test
    public void test15() {
        assertEquals("mation", LongestCommonSuffixPostFixInString.solution(new String[]{"transformation", "information", "formation", "automation"}));
    }

    @Test
    public void test16() {
        assertEquals("eater", LongestCommonSuffixPostFixInString.solution(new String[]{"repeater", "defeater", "heater", "seater", "eater"}));
    }

    @Test
    public void test17() {
        assertEquals("ility", LongestCommonSuffixPostFixInString.solution(new String[]{"intelligibility", "responsibility", "agility", "ability"}));
    }

    @Test
    public void test18() {
        assertEquals("ization", LongestCommonSuffixPostFixInString.solution(new String[]{"synchronization", "organization", "localization", "realization"}));
    }

    @Test
    public void test19() {
        assertEquals("plication", LongestCommonSuffixPostFixInString.solution(new String[]{"complication", "application", "implication", "replication", "duplication"}));
    }

    @Test
    public void test20() {
        assertEquals("anding", LongestCommonSuffixPostFixInString.solution(new String[]{"understanding", "withstanding", "demanding", "commanding", "handing"}));
    }
}
