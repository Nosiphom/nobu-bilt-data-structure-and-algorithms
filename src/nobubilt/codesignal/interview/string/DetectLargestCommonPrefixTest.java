package nobubilt.codesignal.interview.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DetectLargestCommonPrefixTest {


    @Test
    public void test1() {
        assertEquals("tra", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"tractor", "traffic", "transmit"}));
    }

    @Test
    public void test2() {
        assertEquals("inte", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"interview", "internal", "integrity"}));
    }

    @Test
    public void test3() {
        assertEquals("fl", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void test4() {
        assertEquals("", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
    
    @Test
    public void test5() {
        assertEquals("class", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"class", "classic", "classification"}));
    }
    
    @Test
    public void test6() {
        assertEquals("sun", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"sun", "sunny", "sunday"}));
    }
    
    @Test
    public void test7() {
        assertEquals("py", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"python", "pythonic", "py"}));
    }
    
    @Test
    public void test8() {
        assertEquals("bea", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"beam", "bean", "beard"}));
    }
    
    @Test
    public void test9() {
        assertEquals("", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"run", "rune", "array"}));
    }
    
    @Test
    public void test10() {
        assertEquals("box", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"boxing", "box", "boxes"}));
    }
    
    @Test
    public void test11() {
        assertEquals("ba", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"base", "ball", "bat"}));
    }
    
    @Test
    public void test12() {
        assertEquals("jump", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"jump", "jumper", "jumpy"}));
    }
    
    @Test
    public void test13() {
        assertEquals("love", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"lovely", "loveless", "love"}));
    }
    
    @Test
    public void test14() {
        assertEquals("dar", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"dark", "darkness", "dart"}));
    }
    
    @Test
    public void test15() {
        assertEquals("fire", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"fire", "firefly", "firefox"}));
    }
    
    @Test
    public void test16() {
        assertEquals("pre", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"prefix", "preview", "prelude"}));
    }
    
    @Test
    public void test17() {
        assertEquals("post", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"postscript", "postman", "post"}));
    }
    
    @Test
    public void test18() {
        assertEquals("gam", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"gaming", "gamer", "game"}));
    }
    
    @Test
    public void test19() {
        assertEquals("jelly", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"jelly", "jellyfish", "jellybean"}));
    }
    
    @Test
    public void test20() {
        assertEquals("qu", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"queen", "query", "quadratic"}));
    }
    
    @Test
    public void test21() {
        assertEquals("class", DetectLargestCommonPrefix.largestCommonPrefix(new String[]{"class", "class", "class"}));
    }

}
