package nobubilt.codesignal.interview.array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ArrayHopping1BasedIndexTest {
	 private ArrayHopping1BasedIndex app;

	  @BeforeEach
	  void setUp() {
	    app = new ArrayHopping1BasedIndex();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {1, 3, 2, 5, 4};
	      int[] arrayB = {5, 4, 3, 2, 1};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{1, 4, 3, 2, 5}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {1, 1, 1, 1, 1};
	      int[] arrayB = {1, 2, 3, 4, 5};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{1}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {2, 3, 4, 5, 1};
	      int[] arrayB = {5, 4, 3, 2, 1};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{2, 5}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {1, 5, 2, 4, 3};
	      int[] arrayB = {1, 2, 3, 4, 5};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{1}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {4, 3, 2, 1, 5};
	      int[] arrayB = {5, 4, 3, 2, 1};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{4, 3, 2, 1, 5}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {5, 4, 3, 2, 1};
	      int[] arrayB = {1, 2, 3, 4, 5};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{5, 1}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {5, 1, 2, 3, 4};
	      int[] arrayB = {5, 4, 3, 2, 1};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{5}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {1, 2, 3, 4, 5};
	      int[] arrayB = {1, 2, 3, 4, 5};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{1}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {3, 2, 1, 5, 4};
	      int[] arrayB = {5, 4, 3, 2, 1};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{3, 1, 4, 2, 5}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }

	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      int[] arrayA = {2, 3, 4, 1, 5};
	      int[] arrayB = {1, 2, 3, 4, 5};
	      List<Integer> expectedOutput = Arrays.stream(new int[]{2, 3, 4, 1}).boxed().collect(Collectors.toList());
	      Assertions.assertEquals(expectedOutput, app.solution(arrayA, arrayB));
	    });
	  }
	}

