package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
public class FindAndReplaceRecursivelyTest {

	 private FindAndReplaceRecursively app;

	    @BeforeEach
	    void setUp() {
	        app = new FindAndReplaceRecursively();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("hello friend", app.replaceSubstring("hello world", "world", "friend"));
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("i love coding", app.replaceSubstring("i love coding", "code", "craft"));
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("it is a gloomy day", app.replaceSubstring("it is a beautiful day", "beautiful", "gloomy"));
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("practice makes better", app.replaceSubstring("practice makes perfect", "perfect", "better"));
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("keep calm and code on", app.replaceSubstring("keep calm and carry on", "carry on", "code on"));
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("short text short text", app.replaceSubstring("long text long text", "long", "short"));
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals(" case", app.replaceSubstring("lower case", "lower", ""));
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("a quick brown fox skips over a lazy dog", app.replaceSubstring("a quick brown fox jumps over a lazy dog", "jumps", "skips"));
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("that is a test", app.replaceSubstring("this is a test", "this", "that"));
	        });
	    }

	    @Test
	    @Order(10)
	    void test10() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            Assertions.assertEquals("final test example", app.replaceSubstring("final test case", "case", "example"));
	        });
	    }
	}
