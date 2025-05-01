package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
public class TypographicalSwapInStringsTest {
	 private TypographicalSwapInStrings app;

	  @BeforeEach
	  void setUp() {
	    app = new TypographicalSwapInStrings();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(1, app.spotSwaps("hello", "hlelo"));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(-1, app.spotSwaps("abcdef", "abcfed"));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(2, app.spotSwaps("goodbye", "godobye"));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(-1, app.spotSwaps("firsttest", "firtestst"));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(2, app.spotSwaps("pythonista", "pyhtonista"));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(1, app.spotSwaps("qwertyuiop", "qewrtyuiop"));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(-1, app.spotSwaps("hellothereworld", "helotlehreworld"));
	    });
	  }
	}

