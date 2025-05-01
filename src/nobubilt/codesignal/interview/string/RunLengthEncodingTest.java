package nobubilt.codesignal.interview.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class RunLengthEncodingTest {
	  private RunLengthEncoding app;

	  @BeforeEach
	  void setUp() {
	    app = new RunLengthEncoding();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("aa1ab2ba3ca1", app.solution("aaababbababaca"));
	      Assertions.assertEquals("ab1ca1bc1ab1ca1bc1ab1c1", app.solution("abcabcabcabcabc"));
	      Assertions.assertEquals("ab1", app.solution("ab"));
	      Assertions.assertEquals("cc1dd1aa1ee1ff1", app.solution("ccddaaeeff"));
	      Assertions.assertEquals("ee1ff1gg1", app.solution("eeffgg"));
	    });
	  }
}
