package nobubilt.codesignal.interview.array;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BoardGameProgressQuantificationTest {
	 private BoardGameProgressQuantification app;

	    @BeforeEach
	    void setUp() {
	        app = new BoardGameProgressQuantification();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertArrayEquals(new int[]{3, -1, 3, 1, 2, 2, 1}, app.solution(new int[]{5, 3, 2, 6, 2, 1, 7}, 3));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertArrayEquals(new int[]{-1, -1, -1, -1, -1, -1, 1, -1, 1}, app.solution(new int[]{2, 4, 2, 1, 3, 2, 8, 4, 7}, 4));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertArrayEquals(new int[]{-1, -1, -1, -1, -1}, app.solution(new int[]{1, 1, 1, 1, 1}, 1));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertArrayEquals(new int[]{1, 2, 1, -1, 1, -1, 1}, app.solution(new int[]{8, 1, 6, 2, 4, 7, 3}, 7));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertArrayEquals(new int[]{1, 1, 1, 1, 1, -1}, app.solution(new int[]{10, 9, 8, 7, 6, 5}, 5));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] largeVector = new int[500];
	            for (int i = 0; i < 500; ++i) {
	                largeVector[i] = 10;
	            }
	            int[] largeOutput = new int[500];
	            for (int i = 0; i < 500; ++i) {
	                largeOutput[i] = 50 - i / 10;
	            }
	            Assertions.assertArrayEquals(largeOutput, app.solution(largeVector, 1));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] largeVector = new int[500];
	            for (int i = 0; i < 500; ++i) {
	                largeVector[i] = 1;
	            }
	            int[] largeOutput = new int[500];
	            for (int i = 0; i < 500; ++i) {
	                largeOutput[i] = -1;
	            }
	            Assertions.assertArrayEquals(largeOutput, app.solution(largeVector, 1));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] sequence = new int[10];
	            for (int i = 0; i < 10; ++i) {
	                sequence[i] = i + 1;
	            }
	            int[] repeatedSequence = new int[20];
	            for (int i = 0; i < 2; ++i) {
	                System.arraycopy(sequence, 0, repeatedSequence, i * 10, 10);
	            }
	            int[] output = new int[]{5, 4, 5, 3, -1, 4, 3, 2, 2, -1, 4, 3, 2, 2, -1, 1, 1, 1, 1, -1};
	            Assertions.assertArrayEquals(output, app.solution(repeatedSequence, 10));
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] sequence = new int[10];
	            for (int i = 0; i < 10; ++i) {
	                sequence[i] = i + 1;
	            }
	            int[] repeatedSequence = new int[20];
	            for (int i = 0; i < 2; i++) {
	                System.arraycopy(sequence, 0, repeatedSequence, i * 10, 10);
	            }
	            int[] output = new int[]{-1, 4, 5, 3, 3, 4, 3, 2, 2, 2, -1, 3, 2, 2, 2, 1, 1, 1, 1, 1};
	            Assertions.assertArrayEquals(output, app.solution(repeatedSequence, 1));
	        });
	    }

	    @Test
	    @Order(10)
	    void test10() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            int[] descendingSequence = new int[10];
	            for (int i = 0; i < 10; ++i) {
	                descendingSequence[i] = 10 - i;
	            }
	            int[] repeatedSequence = new int[500];
	            for (int i = 0; i < 50; ++i) {
	                System.arraycopy(descendingSequence, 0, repeatedSequence, i * 10, 10);
	            }
	            int[] output = new int[500];
	            for (int i = 0; i < 500; ++i) {
	                output[i] = i % 10 != 5 ? 50 - i / 10 : -1;
	            }
	            Assertions.assertArrayEquals(output, app.solution(repeatedSequence, 5));
	        });
	    }
	}

