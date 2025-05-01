package nobubilt.codesignal.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class MoveDigitsAroundTest {

    private MoveDigitsAround app;

    @BeforeEach
    void setUp() {
        app = new MoveDigitsAround();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("I have a2pples and o5ranges and g3rapefruits.", app.solution("I have 2 apples and 5! oranges and 3 grapefruits."));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("f4oxes are chasing r1abbit.", app.solution("4 foxes are chasing 1 rabbit."));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("Let's meet at a7t the clock tower.", app.solution("Let's meet at 7 at the clock tower."));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("There are w8onders of the world.", app.solution("There are 8 wonders of the world."));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("I will bring b6ottles of water and p4ackets of chips.", app.solution("I will bring 6 bottles of water and 4 packets of chips."));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("It is a d9ay journey to the mountains.", app.solution("It is a 9 day journey to the mountains."));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("She has lived in c4ities and c2ountries.", app.solution("She has lived in 4 cities and 2 countries."));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("He walked m5iles to school every day.", app.solution("He walked 5 miles to school every day."));
        });
    }

    @Test
    @Order(9)
    void test9() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("The city has g6ates.", app.solution("The city has 6 gates."));
        });
    }

    @Test
    @Order(10)
    void test10() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            Assertions.assertEquals("There are b3ooks on the table.", app.solution("There are 3 books on the table."));
        });
    }

}
