package nobubilt.codesignal.string;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class CalculateFutureDatesByAddingDaysTest {
	 private CalculateFutureDatesByAddingDays app;

	  @BeforeEach
	  void setUp() {
	    app = new CalculateFutureDatesByAddingDays();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2000-01-01", app.addDays("1999-01-01", 365));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2000-12-31", app.addDays("2000-01-01", 365));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2001-01-01", app.addDays("2000-01-01", 366));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2002-01-01", app.addDays("2001-12-31", 1));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2001-01-01", app.addDays("2000-12-31", 1));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2008-01-01", app.addDays("2004-01-01", 1461));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2036-11-22", app.addDays("1899-12-31", 50000));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertEquals("2236-11-23", app.addDays("2099-12-31", 50000));
	    });
	  }
	}

