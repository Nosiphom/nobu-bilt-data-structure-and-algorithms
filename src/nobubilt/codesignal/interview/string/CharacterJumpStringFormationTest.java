package nobubilt.codesignal.interview.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class CharacterJumpStringFormationTest {

	  private CharacterJumpStringFormation app;

	  @BeforeEach
	  void setUp() {
	    app = new CharacterJumpStringFormation();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("adgcfbe", app.repeatCharJump("abcdefg", 3));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("a", app.repeatCharJump("a", 1));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("av", app.repeatCharJump("av", 1));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("cxgdlvd", app.repeatCharJump("cgldxdv", 4));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("z", app.repeatCharJump("z", 1));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("aaa", app.repeatCharJump("aaa", 2));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("zupkfavqlgbwrmhcxsnidytoje", app.repeatCharJump("zyxwvutsrqponmlkjihgfedcba", 5));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("zkvgrcnyjufqbmxitepalwhsdo", app.repeatCharJump("zyxwvutsrqponmlkjihgfedcba", 15));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("abcdefghij", app.repeatCharJump("abcdefghij", 1));
	    });
	  }

	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("ajihgfedcb", app.repeatCharJump("abcdefghij", 9));
	    });
	  }
	}

