package nobubilt.codesignal.interview.array;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class KnightTournamentSubtractRightTest {

    private KnightTournamentSubtractRight app;

    @BeforeEach
    void setUp() {
        app = new KnightTournamentSubtractRight();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(3, app.tournament(Arrays.asList(100, 50, 30, 20)));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(70, 80, 60)));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(2, app.tournament(Arrays.asList(30, 20, 10, 40, 50)));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(60, 70)));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(50, 20, 30, 40)));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(90, 10, 30)));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(30, 100)));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(1, app.tournament(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(2, app.tournament(Arrays.asList(60, 40, 30, 20, 10)));
        });
    }

    @Test
    @Order(10)
    void test10() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals(0, app.tournament(Collections.singletonList(100)));
        });
    }
}
