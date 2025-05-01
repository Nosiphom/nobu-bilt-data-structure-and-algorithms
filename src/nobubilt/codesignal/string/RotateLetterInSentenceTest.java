package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class RotateLetterInSentenceTest {
	  private RotateLetterInSentence app;

	    @BeforeEach
	    void setUp() {
	        app = new RotateLetterInSentence();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("cab 312 fde igh", app.solution("abc 123 def ghi"));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("tba", app.solution("bat"));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("rraceCa", app.solution("raceCar"));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("6mAnGo66 iTaCo123", app.solution("mAnGo666 TaCo123i"));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("b_a Y77 8UwF8", app.solution("_ab 77Y UwF88"));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("dSingleWor", app.solution("SingleWord"));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("jabcdefghi", app.solution("abcdefghij"));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("ZZzZzZz 0123456789 SzYxWvUt", app.solution("ZzZzZzZ 1234567890 zYxWvUtS"));
	        });
	    }
	}
