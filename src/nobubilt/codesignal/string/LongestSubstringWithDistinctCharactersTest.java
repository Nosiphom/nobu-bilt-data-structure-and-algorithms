package nobubilt.codesignal.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LongestSubstringWithDistinctCharactersTest {


    private LongestSubstringWithDistinctCharacters app;

    @BeforeEach
    void setUp() {
        app = new LongestSubstringWithDistinctCharacters();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(4, app.solution("acaabcc", 2));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(7, app.solution("aaaaaaa", 1));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(12, app.solution("abcabcabcabc", 3));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(2, app.solution("abcabcabcabc", 2));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.solution("AaAaAa", 1));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(10, app.solution("1234567890", 10));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(0, app.solution("", 1));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(12, app.solution("abcabcabcabc", 4));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
            Assertions.assertEquals(100000, app.solution("1".repeat(50000) + "2".repeat(50000), 2));
        });
    }
}
