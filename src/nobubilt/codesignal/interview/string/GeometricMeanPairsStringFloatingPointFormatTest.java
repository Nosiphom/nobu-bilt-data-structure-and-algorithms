package nobubilt.codesignal.interview.string;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class GeometricMeanPairsStringFloatingPointFormatTest {
	private GeometricMeanPairsStringFloatingPointFormat app;

	  @BeforeEach
	  void setUp() {
	    app = new GeometricMeanPairsStringFloatingPointFormat();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(1, 2, 3, 4, 5));
	      List<String> expected = Arrays.asList(
	        "1 2.24", 
	        "2 2.83", 
	        "3 3.00", 
	        "4 2.83", 
	        "5 2.24"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(3, 2, 1, 0, 1, 2, 3));
	      List<String> expected = Arrays.asList(
	        "3 3.00", 
	        "2 2.00", 
	        "1 1.00", 
	        "0 0.00", 
	        "1 1.00", 
	        "2 2.00", 
	        "3 3.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(100, 100));
	      List<String> expected = Arrays.asList(
	        "100 100.00", 
	        "100 100.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(12, 45, 67, 34, 89, 56));
	      List<String> expected = Arrays.asList(
	        "12 25.92", 
	        "45 63.29", 
	        "67 47.73", 
	        "34 47.73", 
	        "89 63.29", 
	        "56 25.92"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(3, 2, 1, 0, 0, 1, 2, 3));
	      List<String> expected = Arrays.asList(
	        "3 3.00", 
	        "2 2.00", 
	        "1 1.00", 
	        "0 0.00", 
	        "0 0.00", 
	        "1 1.00", 
	        "2 2.00", 
	        "3 3.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(0, 0, 0, 0, 0));
	      List<String> expected = Arrays.asList(
	        "0 0.00", 
	        "0 0.00", 
	        "0 0.00", 
	        "0 0.00", 
	        "0 0.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(0));
	      List<String> expected = Arrays.asList(
	        "0 0.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> result = app.solution(Arrays.asList(1));
	      List<String> expected = Arrays.asList(
	        "1 1.00"
	      );
	      Assertions.assertEquals(expected, result);
	    });
	  }
	}
