package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
public class LetterToNumConversionTest {

    private LetterToNumConversion app;

    @BeforeEach
    void setUp() {
        app = new LetterToNumConversion();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("a-b-c-d-e", app.solution("1-2-3-4-5"));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("1-2-3", app.solution("a-b-c"));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("a-1-c-3-e", app.solution("1-a-3-c-5"));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("26-25-24-23-22", app.solution("z-y-x-w-v"));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("1-z-2-y-3-x", app.solution("a-26-b-25-c-24"));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("m-i-n-o", app.solution("13-9-14-15"));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("l-a-r-i-a", app.solution("12-1-18-9-1"));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("s-o-l-u-t-i-o-n", app.solution("19-15-12-21-20-9-15-14"));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("1-2-3-a-b-c-24-25-26-x-y-z", app.solution("a-b-c-1-2-3-x-y-z-24-25-26"));
        });
    }

    @Test
    @Order(10)
    void test10() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("p-i-t-h-o-n-c-h-a-r-m-a", app.solution("16-9-20-8-15-14-3-8-1-18-13-1"));
        });
    }
}
