package nobubilt.codesignal.interview.recursion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class GenerateAllCombinationsPlusDiffOrderingTest {


    @Test
    public void test1() {
        assertEquals(Arrays.asList("a"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("a"));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("a", "ab", "b", "ba"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("ab"));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("a", "ab", "abc", "ac", "acb", "b", "ba", "bac", "bc", "bca", "c", "ca", "cab", "cb", "cba"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("abc"));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList("a", "ab", "abc", "abcd", "abd", "abdc", "ac", "acb", "acbd", "acd", "acdb", "ad", "adb", "adbc", "adc", "adcb",
                "b", "ba", "bac", "bacd", "bad", "badc", "bc", "bca", "bcad", "bcd", "bcda", "bd", "bda", "bdac", "bdc", "bdca",
                "c", "ca", "cab", "cabd", "cad", "cadb", "cb", "cba", "cbad", "cbd", "cbda", "cd", "cda", "cdab", "cdb", "cdba",
                "d", "da", "dab", "dabc", "dac", "dacb", "db", "dba", "dbac", "dbc", "dbca", "dc", "dca", "dcab", "dcb", "dcba"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("abcd"));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList("a", "ab", "abc", "abcd", "abcde", "abce", "abced", "abd", "abdc", "abdce", "abde", "abdec", "abe", "abec", "abecd",
                "abed", "abedc", "ac", "acb", "acbd", "acbde", "acbe", "acbed", "acd", "acdb", "acdbe", "acde", "acdeb", "ace", "aceb", "acebd",
                "aced", "acedb", "ad", "adb", "adbc", "adbce", "adbe", "adbec", "adc", "adcb", "adcbe", "adce", "adceb", "ade", "adeb", "adebc",
                "adec", "adecb", "ae", "aeb", "aebc", "aebcd", "aebd", "aebdc", "aec", "aecb", "aecbd", "aecd", "aecdb", "aed", "aedb", "aedbc",
                "aedc", "aedcb", "b", "ba", "bac", "bacd", "bacde", "bace", "baced", "bad", "badc", "badce", "bade", "badec", "bae", "baec", "baecd",
                "baed", "baedc", "bc", "bca", "bcad", "bcade", "bcae", "bcaed", "bcd", "bcda", "bcdae", "bcde", "bcdea", "bce", "bcea", "bcead",
                "bced", "bceda", "bd", "bda", "bdac", "bdace", "bdae", "bdaec", "bdc", "bdca", "bdcae", "bdce", "bdcea", "bde", "bdea", "bdeac",
                "bdec", "bdeca", "be", "bea", "beac", "beacd", "bead", "beadc", "bec", "beca", "becad", "becd", "becda", "bed", "beda", "bedac",
                "bedc", "bedca", "c", "ca", "cab", "cabd", "cabde", "cabe", "cabed", "cad", "cadb", "cadbe", "cade", "cadeb", "cae", "caeb", "caebd",
                "caed", "caedb", "cb", "cba", "cbad", "cbade", "cbae", "cbaed", "cbd", "cbda", "cbdae", "cbde", "cbdea", "cbe", "cbea", "cbead",
                "cbed", "cbeda", "cd", "cda", "cdab", "cdabe", "cdae", "cdaeb", "cdb", "cdba", "cdbae", "cdbe", "cdbea", "cde", "cdea", "cdeab",
                "cdeb", "cdeba", "ce", "cea", "ceab", "ceabd", "cead", "ceadb", "ceb", "ceba", "cebad", "cebd", "cebda", "ced", "ceda", "cedab",
                "cedb", "cedba", "d", "da", "dab", "dabc", "dabce", "dabe", "dabec", "dac", "dacb", "dacbe", "dace", "daceb", "dae", "daeb", "daebc",
                "daec", "daecb", "db", "dba", "dbac", "dbace", "dbae", "dbaec", "dbc", "dbca", "dbcae", "dbce", "dbcea", "dbe", "dbea", "dbeac",
                "dbec", "dbeca", "dc", "dca", "dcab", "dcabe", "dcae", "dcaeb", "dcb", "dcba", "dcbae", "dcbe", "dcbea", "dce", "dcea", "dceab",
                "dceb", "dceba", "de", "dea", "deab", "deabc", "deac", "deacb", "deb", "deba", "debac", "debc", "debca", "dec", "deca", "decab",
                "decb", "decba", "e", "ea", "eab", "eabc", "eabcd", "eabd", "eabdc", "eac", "eacb", "eacbd", "eacd", "eacdb", "ead", "eadb", "eadbc",
                "eadc", "eadcb", "eb", "eba", "ebac", "ebacd", "ebad", "ebadc", "ebc", "ebca", "ebcad", "ebcd", "ebcda", "ebd", "ebda", "ebdac",
                "ebdc", "ebdca", "ec", "eca", "ecab", "ecabd", "ecad", "ecadb", "ecb", "ecba", "ecbad", "ecbd", "ecbda", "ecd", "ecda", "ecdab",
                "ecdb", "ecdba", "ed", "eda", "edab", "edabc", "edac", "edacb", "edb", "edba", "edbac", "edbc", "edbca", "edc", "edca", "edcab",
                "edcb", "edcba"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("abcde"));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList("a", "aa"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("aa"));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList("a", "aa", "aab", "ab", "aba", "b", "ba", "baa"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("aab"));
    }

    @Test
    public void test8() {
        assertEquals(Arrays.asList("a", "aa", "aab", "ab", "aba", "b", "ba", "baa"), GenerateAllCombinationsPlusDiffOrdering.allCombinations("aba"));
    }
}
