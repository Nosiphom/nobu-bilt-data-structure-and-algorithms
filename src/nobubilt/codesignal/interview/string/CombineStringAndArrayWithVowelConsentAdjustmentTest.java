package nobubilt.codesignal.interview.string;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class CombineStringAndArrayWithVowelConsentAdjustmentTest {


	  private CombineStringAndArrayWithVowelConsentAdjustment app;

	  @BeforeEach
	  void setUp() {
	    app = new CombineStringAndArrayWithVowelConsentAdjustment();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> inputArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -5, -9, 27);
	      String expectedOutput = "iyenqmi 8 9 10 11 12 -5 -9 27";
	      Assertions.assertEquals(expectedOutput, app.solution("example", inputArray));
	    });
	  }
	  
	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> inputArray = Arrays.asList(10, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
	      String expectedOutput = "eis 22 23 24 25 26 27 28 29 30";
	      Assertions.assertEquals(expectedOutput, app.solution("aerobics", inputArray));
	    });
	  }
	  
	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<Integer> inputArray = Arrays.asList(1, 1, 1, 1, 1);
	      String expectedOutput = "bbbbb ";
	      Assertions.assertEquals(expectedOutput, app.solution("zzzzzzzzzz", inputArray));
	    });
	  }
	}
