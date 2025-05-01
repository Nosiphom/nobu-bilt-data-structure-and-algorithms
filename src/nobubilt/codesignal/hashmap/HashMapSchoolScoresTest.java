package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HashMapSchoolScoresTest {
	
	private  HashMapSchoolScores app;

	  @BeforeEach
	    void setUp() {
	        app = new  HashMapSchoolScores();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 fail 09:00, 1 solve 10:00 50, 2 solve 11:00 60, 3 solve 12:00 70, 2 fail 13:00, 3 fail 14:00";
	            List<int[]> expected = Arrays.asList(new int[]{3, 70, 1, 1}, new int[]{2, 60, 1, 1}, new int[]{1, 50, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 1 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 solve 10:00 70, 2 solve 11:00 60, 3 solve 12:00 50, 2 fail 13:00, 2 solve 14:00 70";
	            List<int[]> expected = Arrays.asList(new int[]{2, 130, 2, 1}, new int[]{1, 70, 1, 0}, new int[]{3, 50, 1, 0});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 2 Failed at index " + i);
	            }  
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 solve 10:00 70, 1 fail 11:00, 3 solve 12:00 80, 2 fail 13:00, 3 fail 14:00";
	            List<int[]> expected = Arrays.asList(new int[]{3, 80, 1, 1}, new int[]{1, 70, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 3 Failed at index " + i);
	            }  
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "3 solve 10:00 70, 2 solve 11:00 80, 1 solve 12:00 90, 2 solve 13:00 100, 3 fail 14:00";
	            List<int[]> expected = Arrays.asList(new int[]{2, 180, 2, 0}, new int[]{1, 90, 1, 0}, new int[]{3, 70, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 4 Failed at index " + i);
	            } 
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 solve 10:00 60, 1 fail 11:00, 2 solve 12:00 70, 3 fail 13:00, 2 fail 14:00, 3 solve 15:00 80";
	            List<int[]> expected = Arrays.asList(new int[]{3, 80, 1, 1}, new int[]{2, 70, 1, 1}, new int[]{1, 60, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 5 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "2 solve 09:00 50, 2 fail 10:00, 1 solve 11:00 60, 1 fail 12:00, 3 solve 13:00 70";
	            List<int[]> expected = Arrays.asList(new int[]{3, 70, 1, 0}, new int[]{1, 60, 1, 1}, new int[]{2, 50, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 6 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(7)
	    void test7() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "2 fail 09:00, 1 solve 10:00 50, 3 solve 11:00 60, 1 fail 12:00, 3 fail 13:00, 2 solve 14:00 70";
	            List<int[]> expected = Arrays.asList(new int[]{2, 70, 1, 1}, new int[]{3, 60, 1, 1}, new int[]{1, 50, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 7 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(8)
	    void test8() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "2 fail 09:00, 3 solve 10:00 50, 2 solve 11:00 60, 1 fail 12:00, 3 fail 13:00, 3 solve 14:00 70";
	            List<int[]> expected = Arrays.asList(new int[]{3, 120, 2, 1}, new int[]{2, 60, 1, 1});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 8 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(9)
	    void test9() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 fail 09:00, 2 solve 10:00 50, 3 solve 11:00 70, 1 fail 12:00, 2 solve 13:00 60, 1 solve 14:00 80";
	            List<int[]> expected = Arrays.asList(new int[]{2, 110, 2, 0}, new int[]{1, 80, 1, 2}, new int[]{3, 70, 1, 0});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 9 Failed at index " + i);
	            }
	        });
	    }

	    @Test
	    @Order(10)
	    void test10() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String log = "1 fail 09:00, 2 fail 10:00, 3 solve 11:00 50";
	            List<int[]> expected = Arrays.asList(new int[]{3, 50, 1, 0});
	            List<int[]> result = app.analyzeCompetition(log);
	            for (int i = 0; i < expected.size(); i++){
	                Assertions.assertArrayEquals(expected.get(i), result.get(i), "Test 10 Failed at index " + i);
	            }
	        });
	    }
	}