package nobubilt.codesignal.interview.string;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class AlphabeticTransformationAndSubtractionOccurrenceTest {


	  private AlphabeticTransformationAndSubtractionOccurrence app;

	  @BeforeEach
	  void setUp() {
	    app = new AlphabeticTransformationAndSubtractionOccurrence();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(47, 48, 49, 70, 99, 105, 109);
	      Assertions.assertEquals(expected, app.solution("Hello, 123!"));
	    });
	  }
	  
	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(77, 97, 98, 99, 101, 102, 106, 106, 107, 109, 110, 111, 114, 114, 115, 117, 118, 118);
	      Assertions.assertEquals(expected, app.solution("Once upon a time, in a galaxy far, far away..."));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(85, 95, 97, 100, 100, 103, 105, 107, 108, 112, 112, 113, 114, 116, 121);
	      Assertions.assertEquals(expected, app.solution("When in the course of human events..."));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(82, 96, 97, 97, 98, 100, 101, 101, 103, 104, 105, 106, 106, 107, 108, 110, 111, 111, 113, 114, 114, 116, 117, 118, 119, 120, 121);
	      Assertions.assertEquals(expected, app.solution("The quick brown fox jumps over the lazy dog."));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121);
	      Assertions.assertEquals(expected, app.solution("1234567890 abcdefghijklmnopqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89);
	      Assertions.assertEquals(expected, app.solution("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(96, 97, 98, 99, 100, 121);
	      Assertions.assertEquals(expected, app.solution("fedcba"));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(82, 99, 102, 102, 111, 113, 121);
	      Assertions.assertEquals(expected, app.solution("This is a test."));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> expected = Arrays.asList(47, 48, 49, 82, 99, 113, 114);
	      Assertions.assertEquals(expected, app.solution("Test 123"));
	    });
	  }
	}
