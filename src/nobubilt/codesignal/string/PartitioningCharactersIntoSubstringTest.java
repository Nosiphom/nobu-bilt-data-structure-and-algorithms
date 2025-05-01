package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PartitioningCharactersIntoSubstringTest {


    private PartitioningCharactersIntoSubstring app;

    @BeforeEach
    void setUp() {
        app = new PartitioningCharactersIntoSubstring();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("abacbc");
            Assertions.assertEquals(Arrays.asList(6), result);
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("a");
            Assertions.assertEquals(Arrays.asList(1), result);
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("abc");
            Assertions.assertEquals(Arrays.asList(1, 1, 1), result);
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("aaabbbccc");
            Assertions.assertEquals(Arrays.asList(3, 3, 3), result);
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("zabacbcz");
            Assertions.assertEquals(Arrays.asList(8), result);
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("abcabcabc");
            Assertions.assertEquals(Arrays.asList(9), result);
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("abacdcd");
            Assertions.assertEquals(Arrays.asList(3, 4), result);
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            List<Integer> result = app.solution("feepplkpadaasdr");
            Assertions.assertEquals(Arrays.asList(1, 2, 5, 6, 1), result);
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
            String bigInput = new String(new char[1000000]).replace('\0', 'a');
            List<Integer> result = app.solution(bigInput);
            Assertions.assertEquals(Arrays.asList(1000000), result);
        });
    }
}
