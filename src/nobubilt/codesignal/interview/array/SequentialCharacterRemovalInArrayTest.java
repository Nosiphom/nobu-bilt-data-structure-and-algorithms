package nobubilt.codesignal.interview.array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SequentialCharacterRemovalInArrayTest {
	private SequentialCharacterRemovalInArray app;

	  @BeforeEach
	  void setUp() {
	    app = new SequentialCharacterRemovalInArray();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("BCAAB");
	      List<Character> expected = Arrays.asList('B', 'A', 'A', 'B', 'C');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("AB");
	      List<Character> expected = Arrays.asList('A', 'B');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("A");
	      List<Character> expected = Arrays.asList('A');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("CBA");
	      List<Character> expected = Arrays.asList('B', 'A', 'C');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("AAA");
	      List<Character> expected = Arrays.asList('A', 'A', 'A');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("XYZ");
	      List<Character> expected = Arrays.asList('X', 'Y', 'Z');
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Character> result = app.solution("ABCDE");
	      List<Character> expected = Arrays.asList('A', 'C', 'B', 'D', 'E');
	      Assertions.assertEquals(expected, result);
	    });
	  }
	}

