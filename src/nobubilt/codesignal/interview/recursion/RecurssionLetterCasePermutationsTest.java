package nobubilt.codesignal.interview.recursion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class RecurssionLetterCasePermutationsTest {


    @Test
    public void test1() {
        List<String> expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("a1b2"));
    }

    @Test
    public void test2() {
        List<String> expected = Arrays.asList("3y4", "3Y4");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("3y4"));
    }
    
    @Test
    public void test3() {
        List<String> expected = Arrays.asList("5z", "5Z");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("5Z"));
    }

    @Test
    public void test4() {
        List<String> expected = Arrays.asList("pp", "pP", "Pp", "PP");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("Pp"));
    }

    @Test
    public void test5() {
        List<String> expected = Arrays.asList("zz", "zZ", "Zz", "ZZ");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("zz"));
    }

    @Test
    public void test6() {
        List<String> expected = Arrays.asList("a", "A");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("A"));
    }

    @Test
    public void test7() {
        List<String> expected = Arrays.asList("bcd", "bcD", "bCd", "bCD", "Bcd", "BcD", "BCd", "BCD");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("BCd"));
    }

    @Test
    public void test8() {
        List<String> expected = Arrays.asList("1eg1", "1eG1", "1Eg1", "1EG1");
        assertEquals(expected, RecurssionLetterCasePermutations.solution("1eg1"));
    }

    @Test
    public void test9() {
        List<String> expected = arraysOfStrings(
            "tuip9", "tuiP9", "tuIp9", "tuIP9", "tUip9", "tUiP9", "tUIp9", "tUIP9",
            "Tuip9", "TuiP9", "TuIp9", "TuIP9", "TUip9", "TUiP9", "TUIp9", "TUIP9"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("tUIp9"));
    }

    @Test
    public void test10() {
        List<String> expected = arraysOfStrings(
            "op2n4c", "op2n4C", "op2N4c", "op2N4C", "oP2n4c", "oP2n4C", "oP2N4c", "oP2N4C",
            "Op2n4c", "Op2n4C", "Op2N4c", "Op2N4C", "OP2n4c", "OP2n4C", "OP2N4c", "OP2N4C"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("oP2N4c"));
    }

    @Test
    public void test11() {
        List<String> expected = arraysOfStrings(
            "k7l8s6j", "k7l8s6J", "k7l8S6j", "k7l8S6J", "k7L8s6j", "k7L8s6J", "k7L8S6j", "k7L8S6J",
            "K7l8s6j", "K7l8s6J", "K7l8S6j", "K7l8S6J", "K7L8s6j", "K7L8s6J", "K7L8S6j", "K7L8S6J"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("K7L8S6j"));
    }

    @Test
    public void test12() {
        List<String> expected = arraysOfStrings(
            "n5m7j9", "n5m7J9", "n5M7j9", "n5M7J9", "N5m7j9", "N5m7J9", "N5M7j9", "N5M7J9"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("N5m7J9"));
    }

    @Test
    public void test13() {
        List<String> expected = arraysOfStrings(
            "x2yz5", "x2yZ5", "x2Yz5", "x2YZ5", "X2yz5", "X2yZ5", "X2Yz5", "X2YZ5"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("X2Yz5"));
    }

    @Test
    public void test14() {
        List<String> expected = arraysOfStrings(
            "qw3e5r", "qw3e5R", "qw3E5r", "qw3E5R", "qW3e5r", "qW3e5R", "qW3E5r", "qW3E5R",
            "Qw3e5r", "Qw3e5R", "Qw3E5r", "Qw3E5R", "QW3e5r", "QW3e5R", "QW3E5r", "QW3E5R"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("qW3E5r"));
    }

    @Test
    public void test15() {
        List<String> expected = arraysOfStrings(
            "t6y7u8", "t6y7U8", "t6Y7u8", "t6Y7U8", "T6y7u8", "T6y7U8", "T6Y7u8", "T6Y7U8"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("T6y7U8"));
    }

    @Test
    public void test16() {
        List<String> expected = arraysOfStrings(
            "i4o6u8", "i4o6U8", "i4O6u8", "i4O6U8", "I4o6u8", "I4o6U8", "I4O6u8", "I4O6U8"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("i4O6U8"));
    }

    @Test
    public void test17() {
        List<String> expected = arraysOfStrings(
            "f5g7h9", "f5g7H9", "f5G7h9", "f5G7H9", "F5g7h9", "F5g7H9", "F5G7h9", "F5G7H9"
        );
        assertEquals(expected, RecurssionLetterCasePermutations.solution("F5g7H9"));
    }

    private List<String> arraysOfStrings(String... elems) {
        return Arrays.asList(elems);
    }
}
