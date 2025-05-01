package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShortestDistanceBetweenCommonWordsTest {

	  private ShortestDistanceBetweenCommonWords app;

	  @BeforeEach
	  void setUp() {
	    app = new ShortestDistanceBetweenCommonWords();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("dog", 2, "cat", 2), app.solution(List.of("dog", "cat", "bird", "cat", "dog", "elephant", "dog")));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("rain", 1), app.solution(List.of("rain", "rain", "go", "away")));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("foo", 2, "bar", 2), app.solution(List.of("foo", "bar", "foo", "bar", "foo")));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("a", 3, "b", 3, "c", 3), app.solution(List.of("a", "b", "c", "a", "b", "c", "a")));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("banana", 4, "apple", 3), app.solution(List.of("apple", "banana", "carrot", "apple", "eggplant", "banana", "apple")));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("x", 2, "y", 2, "z", 3), app.solution(List.of("x", "y", "z", "x", "y", "z", "x", "y", "x", "y")));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("python", 2, "java", 4), app.solution(List.of("python", "java", "csharp", "javascript", "python", "java", "python")));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        Assertions.assertEquals(Map.of("python", 1), app.solution(List.of("python", "python", "python", "python", "python")));
	    });
	  }

	  @Test
	  @Order(9)
	  void test9() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	        List<String> wordList = new ArrayList<>(Collections.nCopies(100_000 - 1, "word"));
	        wordList.add("anotherword");
	        Map<String, Integer> expectedOutput = Map.of("word", 1);
	        Assertions.assertEquals(expectedOutput, app.solution(wordList));
	    });
	  }
	  
	  @Test
	  @Order(10)
	  void test10() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(2000), () -> {
	        List<String> wordList = new ArrayList<>();
	        for (int first = 0; first < 17; ++first) {
	            for (int second = 0; second < 17; ++second) {
	                for (int third = 0; third < 17; ++third) {
	                    for (int fourth = 0; fourth < 17; ++fourth) {
	                        wordList.add(String.valueOf( (char) ("a".charAt(0) + first)) + String.valueOf( (char) ("a".charAt(0) + second)) + String.valueOf( (char) ("a".charAt(0) + third)) + String.valueOf( (char) ("a".charAt(0) + fourth)));
	                    }
	                }
	            }
	        }
	        Assertions.assertEquals(new HashMap<>(), app.solution(wordList));
	    });
	  }
}
