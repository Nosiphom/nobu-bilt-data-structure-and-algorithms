package nobubilt.codesignal.matrix;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SpiralMatrixCharactersTest {

	private SpiralMatrixCharacters app;

	  @BeforeEach
	  void setUp() {
	    app = new SpiralMatrixCharacters();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    char[][] grid = {
	        {'a', 'b', 'c', 'd'},
	        {'e', 'f', 'g', 'h'},
	        {'i', 'j', 'k', 'l'}
	    };
	    int[] expected = {1, 9, 10};
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(expected, app.spiralTraverseAndVowels(grid));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    char[][] grid = {
	        {'o'}, {'r'}, {'a'}, {'l'}
	    };
	    int[] expected = {1, 3};
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(expected, app.spiralTraverseAndVowels(grid));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    char[][] grid = {
	        {'w', 'e', 's'},
	        {'i', 'i', 't'},
	        {'l', 'i', 'f'},
	        {'e', '.', '!'}
	    };
	    int[] expected = {2, 8, 10, 11, 12};
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(expected, app.spiralTraverseAndVowels(grid));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    char[][] grid = {
	        {'w'}, {'a'}, {'c'}, {'h'}, {'i'}, {'n'}, {'g'}
	    };
	    int[] expected = {2, 5};
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(expected, app.spiralTraverseAndVowels(grid));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    char[][] grid = { {'a'} };
	    int[] expected = {1};
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      Assertions.assertArrayEquals(expected, app.spiralTraverseAndVowels(grid));
	    });
	  }
	}

