package nobubilt.codesignal.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LongestSequenceAfterRemovalTest {

    private LongestSequenceAfterRemoval app;

    @BeforeEach
    void setUp() {
        app = new LongestSequenceAfterRemoval();
    }

    @Test
    @Order(1)
    void test1() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "a";
            char[][] Q = { {'a', 'b'} };
            int[] expected_result = {0};

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }

    @Test
    @Order(2)
    void test2() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
            char[][] Q = new char[50][2];
            for (int i = 0; i < 50; i++) {
                Q[i] = new char[]{'a', 'b'};
            }
            int[] expected_result = new int[50];
            for (int i = 0; i < 50; i++) expected_result[i] = 0;

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }
    
    @Test
    @Order(3)
    void test3() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
            String S = "qbqfozzkjvalfojoobvprvstizehyxvumaulbsjdeofoyqmtmj";
            char[][] Q = {
                {'t', 'k'}, {'h', 'i'}, {'x', 'b'}, {'z', 'n'}, {'r', 'a'}, {'l', 'b'}, {'j', 't'}, {'i', 'n'},
                {'q', 'l'}, {'a', 'g'}, {'h', 'v'}, {'y', 'v'}, {'w', 'r'}, {'i', 'u'}, {'e', 'x'}, {'f', 'm'},
                {'e', 's'}, {'v', 'f'}, {'t', 'd'}, {'m', 'w'}, {'q', 'c'}, {'y', 'e'}, {'y', 'w'}, {'j', 'l'},
                {'n', 'w'}, {'l', 'j'}, {'r', 'b'}, {'z', 'y'}, {'i', 'l'}, {'c', 'l'}, {'z', 'd'}, {'k', 'z'},
                {'t', 'j'}, {'u', 'y'}, {'j', 'w'}, {'a', 'n'}, {'j', 'c'}, {'c', 't'}, {'i', 'a'}, {'i', 'n'},
                {'q', 'o'}, {'k', 'r'}, {'y', 'p'}, {'a', 'g'}, {'s', 'm'}, {'z', 's'}, {'m', 'k'}, {'a', 'i'},
                {'v', 'w'}, {'v', 's'}
            };
            int[] expected_result = {
                23, 24, 15, 24, 16, 17, 14, 25, 23, 22, 19, 13, 29, 24, 26, 19, 22, 11, 23, 32, 42, 26, 28, 20, 
                50, 20, 15, 18, 14, 23, 18, 24, 14, 28, 23, 22, 23, 23, 16, 25, 24, 29, 19, 22, 22, 15, 24, 16, 
                19, 12
            };

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }

    @Test
    @Order(4)
    void test4() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "abcdefghijk";
            char[][] Q = { {'z', 'x'} };
            int[] expected_result = {11};

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }

    @Test
    @Order(5)
    void test5() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "aaaaa";
            char[][] Q = { {'a', 'b'} };
            int[] expected_result = {0};

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }

    @Test
    @Order(6)
    void test6() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "abcdefg";
            char[][] Q = { {'a', 'b'}, {'c', 'd'}, {'e', 'f'} };
            int[] expected_result = {5, 3, 4};

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }

    @Test
    @Order(7)
    void test7() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
            String S = "";
            for (int i = 0; i < 38; i++) {
                S += "abcdefghijklmnopqrstuvwxyz";
            }
            S += "abcdef";
            char[][] Q = new char[100000][2];
            for (int i = 0; i < 100000; i++) {
                Q[i] = new char[]{'a', 'b'};
            }
            int[] expected_result = new int[100000];
            for (int i = 0; i < 100000; i++) expected_result[i] = 24;

            Assertions.assertArrayEquals(expected_result, app.solution(S, Q));
        });
    }
}
