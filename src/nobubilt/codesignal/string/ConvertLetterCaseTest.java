package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
public class ConvertLetterCaseTest {
	public class SolutionTest {

		  private ConvertLetterCase app;

		  @BeforeEach
		  void setUp() {
		    app = new ConvertLetterCase();
		  }

		  @Test
		  @Order(1)
		  void test1() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("Hello World", app.solution("hello world"));
		    });
		  }

		  @Test
		  @Order(2)
		  void test2() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("Hello World", app.solution("HELLO WORLD"));
		    });
		  }

		  @Test
		  @Order(3)
		  void test3() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("123 Hello", app.solution("123 hello"));
		    });
		  }

		  @Test
		  @Order(4)
		  void test4() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("_underscore", app.solution("_underscore"));
		    });
		  }

		  @Test
		  @Order(5)
		  void test5() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("First Second Third Fourth Fifth Sixth Seventh Eights Ninth Tenth", app.solution("first second third fourth fifth sixth seventh eights ninth tenth"));
		    });
		  }

		  @Test
		  @Order(6)
		  void test6() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("Single", app.solution("single"));
		    });
		  }

		  @Test
		  @Order(7)
		  void test7() {
		    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		      Assertions.assertEquals("Hello Neat Pythonistas_123", app.solution("Hello neat pythonistas_123"));
		    });
		  }

		  @Test
		  @Order(8)
		  void test8() {
		      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		        Assertions.assertEquals("Some Random _text", app.solution("SoME rAndoM _TeXT"));
		    });
		  }

		  @Test
		  @Order(9)
		  void test9() {
		      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		        Assertions.assertEquals("Caps Lock Is On", app.solution("CAPS lock IS on"));
		    });
		  }

		  @Test
		  @Order(10)
		  void test10() {
		      Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
		        Assertions.assertEquals("Mixed Case Sample", app.solution("mIxEd CaSe sample"));
		    });
		  }
		}
}
