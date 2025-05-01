package nobubilt.codesignal.interview.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class SpecialCharacterOrderReversalTest {

	 private SpecialCharacterOrderReversal app;

	  @BeforeEach
	  void setUp() {
	    app = new SpecialCharacterOrderReversal();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("edcab", app.specialOrder("abcde"));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("fedabc", app.specialOrder("abcdef"));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	          Assertions.assertEquals("a", app.specialOrder("a"));
	      });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	          Assertions.assertEquals("nopqrstzyxwvu", app.specialOrder("zyxwvutsrqpon"));
	      });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	          Assertions.assertEquals("abcdabcd", app.specialOrder("abcddcba"));
	      });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	          Assertions.assertEquals("dcbazyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzab", 
	          app.specialOrder("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd"));
	      });
	  }
	}
