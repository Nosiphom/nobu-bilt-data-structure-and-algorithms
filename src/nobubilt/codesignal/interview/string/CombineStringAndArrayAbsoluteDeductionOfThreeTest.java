package nobubilt.codesignal.interview.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class CombineStringAndArrayAbsoluteDeductionOfThreeTest {


    private CombineStringAndArrayAbsoluteDeductionOfThree app;

    @BeforeEach
    void setUp() {
        app = new CombineStringAndArrayAbsoluteDeductionOfThree();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {5, 10, 15, 20, 25};
            String string = "hello world";
            String expectedOutput = "ifm 20 25";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {-5, -10, -15, -20, -25};
            String string = "python is fun";
            String expectedOutput = "qz -15 -20 -25";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {10, 20, -10, -20, 30};
            String string = "coding mastery";
            String expectedOutput = "dp -10 -20 30";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {11, 23, 32, -65, -33};
            String string = "buffalo buffalo buffalo";
            String expectedOutput = "cv 32 -65 -33";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {40, -20, -10, -1, 1};
            String string = "race car";
            String expectedOutput = " 40 -20 -10 -1 1";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
            String string = "the quick brown fox jumps over the lazy dog";
            String expectedOutput = "uif rv 17 19 23 29";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = 100;
            }
            String string = "longer string with all lowercase letters to test the condition when array sum exceeds threshold";
            String expectedOutput = " 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100 100";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }

    @Test
    @Order(8)
    void test8() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            int[] array = {50, -25, 75, -80};
            String string = "some mixed cases and even numbers!123";
            String expectedOutput = " 50 -25 75 -80";
            Assertions.assertEquals(expectedOutput, app.solution(array, string));
        });
    }
}
