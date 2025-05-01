package nobubilt.codesignal.interview.string;
import java.time.Duration;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class AlphabeticTransformationAndMultiplicationTest {


	  private AlphabeticTransformationAndMultiplication app;

	  @BeforeEach
	  void setUp() {
	    app = new AlphabeticTransformationAndMultiplication();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('a', 120, 'b', 121, 'c', 122), app.solution("abc"));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('d', 97, 'e', 98, 'f', 99), app.solution("def"));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('x', 117, 'y', 118, 'z', 119), app.solution("xyz"));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('a', 240, 'b', 121, 'c', 366), app.solution("aabccc"));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('a', 120, 'b', 121, 'c', 122, 'd', 97, 'e', 98, 'f', 99, 'g', 100, 'h', 101, 'i', 102, 'j', 103), app.solution("abcdefghij"));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('z', 1190), app.solution("zzzzzzzzzz"));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('a', 3600, 'b', 3630, 'c', 3660), app.solution("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(Map.of('a', 240, 'x', 234, 'y', 118, 'z', 238), app.solution("xyzaaxz"));
	    });
	  }
	}
