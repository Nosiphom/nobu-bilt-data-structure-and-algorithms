package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HashMapLibraryBookTest {

	  private HashMapLibraryBook app;

	  @BeforeEach
	  void setUp() {
	    app = new HashMapLibraryBook();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 09:00, 2 borrow 10:00, 1 return 12:00, 3 borrow 13:00, 2 return 15:00, 3 return 16:00");
	      Assertions.assertEquals(List.of("2 05:00"), result);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 09:00, 2 borrow 10:00, 1 return 16:00, 3 borrow 13:00, 2 return 15:00, 3 return 16:00");
	      Assertions.assertEquals(List.of("1 07:00"), result);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 05:00, 1 return 18:00, 2 borrow 08:00, 2 return 17:00");
	      Assertions.assertEquals(List.of("1 13:00"), result);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 06:00, 2 borrow 07:00, 3 borrow 08:00, 1 return 12:00, 2 return 13:00, 3 return 14:00");
	      Assertions.assertEquals(List.of(
	          "1 06:00",
	          "2 06:00",
	          "3 06:00"
	      ), result);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 09:00, 1 return 09:01, 2 borrow 09:02, 2 return 09:03");
	      Assertions.assertEquals(List.of(
	          "1 00:01",
	          "2 00:01"
	      ), result);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 12:00, 1 return 18:00, 2 borrow 06:00, 2 return 12:00, 3 borrow 00:00, 3 return 06:00");
	      Assertions.assertEquals(List.of(
	          "1 06:00",
	          "2 06:00",
	          "3 06:00"
	      ), result);
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 01:00, 1 return 04:00, 2 borrow 02:00, 2 return 05:00");
	      Assertions.assertEquals(List.of(
	          "1 03:00",
	          "2 03:00"
	      ), result);
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution("1 borrow 01:00, 1 return 02:00, 2 borrow 03:00, 2 return 05:00, 1 borrow 06:00, 1 return 10:00");
	      Assertions.assertEquals(List.of("1 05:00"), result);
	    });
	  }
	}
