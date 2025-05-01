package nobubilt.codesignal.string;

import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IncreaseNumberOfWordsByRemovingPopularLetterTest {

    private IncreaseNumberOfWordsByRemovingPopularLetter app;

    @BeforeEach
    void setUp() {
        app = new IncreaseNumberOfWordsByRemovingPopularLetter();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('l', 2), app.solution("Hello, world!"));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('i', 3), app.solution("Life is like a box of chocolates"));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('.', 3), app.solution("1... 2... 3... Go!"));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('o', 4), app.solution("A quick brown fox jumps over the lazy dog."));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('n', 2), app.solution("Python is fun!"));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('o', 5), app.solution("To be, or not to be: that is the question."));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('i', 4), app.solution("Winners never quit and quitters never win."));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('e', 3), app.solution("May the force be with you."));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('t', 6), app.solution("In the end, it's not the years in your life that count. It's the life in your years."));
        });
    }

    @Test
    @Order(10)
    void test10() {
         Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(new AbstractMap.SimpleEntry<>('t', 4), app.solution("Whether you think you can or you think you can’t, you’re right."));
        });
    }
}
