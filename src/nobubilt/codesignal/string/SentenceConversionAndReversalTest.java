package nobubilt.codesignal.string;

import java.time.Duration;
import java.util.AbstractMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SentenceConversionAndReversalTest {

	  private SentenceConversionAndReversal app;

	  @BeforeEach
	  void setUp() {
	    app = new SentenceConversionAndReversal();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("Svool", app.solution("Hello"));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("ZYX", app.solution("ABC"));
	    });
	  }
	  
	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("zyx", app.solution("abc"));
	    });
	  }
	  
	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("DOG A quick brown FOX jumps over the lazy", app.solution("Z jfrxp yildm ULC qfnkh levi gsv ozab WLT"));
	    });
	  }
	  
	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("Avyiz", app.solution("Zebra"));
	    });
	  }
	  
	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("ovggvih XzkrgzO", app.solution("CapitaL letters"));
	    });
	  }
	  
	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("ovggvih olDvi", app.solution("loWer letters"));
	    });
	  }
	  
	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("ovggvih LKKLHRGV", app.solution("OPPOSITE letters"));
	    });
	  }
	  
	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("zdzb Zm zkkov z wzb pvvkh gsv wlxgli", 
	        app.solution("An apple a day keeps the doctor away"));
	    });
	  }
	  
	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("m n", app.solution("m n"));
	    });
	  }
	}

