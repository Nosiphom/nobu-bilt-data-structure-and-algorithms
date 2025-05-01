package nobubilt.codesignal.string;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
public class FindReverseAndReplaceTest {
	 private FindReverseAndReplace app;

	  @BeforeEach
	  void setUp() {
	    app = new FindReverseAndReplace();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("this is a simple example.", "the name is bond. james bond.", "remove every single e");
	      List<String> words = Arrays.asList("simple", "bond", "e");
	      List<String> expected = Arrays.asList("this is a elpmis example.", "the name is dnob. james dnob.", "remove every single e");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("hello world!", "i am here", "python is love");
	      List<String> words = Arrays.asList("world", "here", "love");
	      List<String> expected = Arrays.asList("hello dlrow!", "i am ereh", "python is evol");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("i am not a robot", "you are not alone", "we are all together");
	      List<String> words = Arrays.asList("am", "are", "are");
	      List<String> expected = Arrays.asList("i ma not a robot", "you era not alone", "we era all together");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("apple", "ball", "cat");
	      List<String> words = Arrays.asList("a", "b", "c");
	      List<String> expected = Arrays.asList("apple", "ball", "cat");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("this is a test", "", "", "one more");
	      List<String> words = Arrays.asList("test", "a", "b", "one");
	      List<String> expected = Arrays.asList("this is a tset", "", "", "eno more");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(6)
	  void test6() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("lower case sentence", "upper case Sentence", "another Sentence here", "final Sentence yay");
	      List<String> words = Arrays.asList("sentence", "sentence", "sentence", "sentence");
	      List<String> expected = Arrays.asList("lower case ecnetnes", "upper case Ecnetnes", "another Ecnetnes here", "final Ecnetnes yay");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(7)
	  void test7() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("this is a very very long sentence just to check the maximum limit of the sentence. see if it can handle the maximum characters or not.", "can it handle", "it or not", "let's see.");
	      List<String> words = Arrays.asList("very", "handle", "it", "see");
	      List<String> expected = Arrays.asList("this is a yrev yrev long sentence just to check the maximum limit of the sentence. see if it can handle the maximum characters or not.", "can it eldnah", "ti or not", "let's ees.");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }

	  @Test
	  @Order(8)
	  void test8() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      List<String> sentences = Arrays.asList("just a string", "with some words", "and nothing else");
	      List<String> words = Arrays.asList("just", "some", "nothing");
	      List<String> expected = Arrays.asList("tsuj a string", "with emos words", "and gnihton else");
	      Assertions.assertEquals(expected, app.solution(sentences, words));
	    });
	  }
	}

