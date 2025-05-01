package nobubilt.codesignal.math;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class CountingConsecutiveEqualDigitsTest {


	  private CountingConsecutiveEqualDigits app;

	  @BeforeEach
	  void setUp() {
	    app = new CountingConsecutiveEqualDigits();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(2, app.solution(113224));
	      Assertions.assertEquals(6, app.solution(33333888));
	      Assertions.assertEquals(0, app.solution(13579));
	      Assertions.assertEquals(0, app.solution(345672));
	      Assertions.assertEquals(5, app.solution(22333555));
	      Assertions.assertEquals(4, app.solution(100000));
	      Assertions.assertEquals(0, app.solution(10));
	      Assertions.assertEquals(1, app.solution(98876));
	      Assertions.assertEquals(3, app.solution(4444));
	      Assertions.assertEquals(0, app.solution(1));
	    });
	  }
	}
