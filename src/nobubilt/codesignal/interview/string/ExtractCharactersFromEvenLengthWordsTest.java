package nobubilt.codesignal.interview.string;
import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ExtractCharactersFromEvenLengthWordsTest {
    private ExtractCharactersFromEvenLengthWords app;

    @BeforeEach
    void setUp() {
        app = new ExtractCharactersFromEvenLengthWords();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("hleel", app.solution("Python is a high-level programming language.", 'n'));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("ceec.", app.solution("Practice makes perfect.", 'f'));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("ced", app.solution("Mastering Advanced Looping and Implementation.", 'l'));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("llssis", app.solution("I will pass this test!", 'w'));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("", app.solution("Participate in exciting challenges.", 'a'));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("e.", app.solution("The quick brown fox jumps over the lazy dog.", 'f'));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("isencess", app.solution("This sentence is a test sentence.", 't'));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("issngingthtsfctersds.", app.solution("This is a long string with lots of characters and words.", 'v'));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("ence", app.solution("Another sentence to test the function.", 'o'));
        });
    }

    @Test
    @Order(10)
    void test10() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("eiae.", app.solution("Some additional variety in test cases.", 'k'));
        });
    }

}
