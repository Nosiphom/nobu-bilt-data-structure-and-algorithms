package nobubilt.codesignal.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NumberOfWaysToFormThreeLetterCombosTest {
	 private NumberOfWaysToFormThreeLetterCombos app;

	  @BeforeEach
	  void setUp() {
	    app = new NumberOfWaysToFormThreeLetterCombos();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(0, app.solution("aaa"));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(122500, app.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(9450, app.solution("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(15600, app.solution("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(25, app.solution("aabcdefghijklmnopqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(3, app.solution("hderh"));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(87, app.solution("svdajtchimrdkvivelzy"));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1244, app.solution("totbsrsfqtqzwrrfxgzxzwetmbswenexhyxpdnru"));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(6441, app.solution("yuwyjsbiladquuarrdiujapugytmjecpmouriqmivpdxsjqlhbeozpnfiyeypplitzdgry"));
	    });
	  }

	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(18052, app.solution("oiqrmdsgofxhmofzjpzyrgmqdashjnxiqmwngjvyfibwsqdbcpbtzpqsthdddbiygoosnnvboupiqtxviebpegayoiargeztcqrr"));
	    });
	  }

	  @Test
	  @Order(11)
	  void test11() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(75, app.solution("jjjabcdefghiklmnopqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(12)
	  void test12() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(250, app.solution("lllllabcdefghijkmnopqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(13)
	  void test13() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals(1125, app.solution("ppppppppppabcdefghijklmnoqrstuvwxyz"));
	    });
	  }

	  @Test
	  @Order(14)
	  void test14() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String s = "a".repeat(50000) + "b".repeat(50000);
	      long expected_result = 124997500000000L; // 2 * (50000 choose 2) * 50000 = 2 * 50000 * 49999 / 2 * 50000
	      Assertions.assertEquals(expected_result, app.solution(s));
	    });
	  }

}
