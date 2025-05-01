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
public class ParsingUpdatingNestedKeyValDataTest {

	 private ParsingUpdatingNestedKeyValData app;

	    @BeforeEach
	    void setUp() {
	        app = new ParsingUpdatingNestedKeyValData();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Age=25,Name=John,Address=(Street=Main St;City=NY;Zip=10001),Email=john@gmail.com\n002,Age=30,Name=Jane,Address=(Street=2nd St;City=LA;Zip=90001),Email=jane@hotmail.com";
	            String userid = "001";
	            String key = "Email";
	            String newValue = "johndoe@gmail.com";
	            List<Map<String, Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Age", "25", "Name", "John", "Address", "(Street=Main St;City=NY;Zip=10001)", "Email", "johndoe@gmail.com")),
	                Map.of("002", Map.of("Age", "30", "Name", "Jane", "Address", "(Street=2nd St;City=LA;Zip=90001)", "Email", "jane@hotmail.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Age=25,Name=John,Email=john@gmail.com";
	            String userid = "001";
	            String key = "Age";
	            String newValue = "30";
	            List<Map<String, Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Age", "30", "Name", "John", "Email", "john@gmail.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Score=80,Subject=(Maths=85;English=75;History=90),Email=john@gmail.com";
	            String userid = "001";
	            String key = "Score";
	            String newValue = "85";
	            List<Map<String,  Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Score", "85", "Subject", "(Maths=85;English=75;History=90)", "Email", "john@gmail.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Name=John,Email=john@gmail.com\n002,Name=Jane,Email=jane@hotmail.com\n003,Name=Bob,Email=bob@gmail.com";
	            String userid = "003";
	            String key = "Email";
	            String newValue = "bob@yahoo.com";
	            List<Map<String, Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Name", "John", "Email", "john@gmail.com")),
	                Map.of("002", Map.of("Name", "Jane", "Email", "jane@hotmail.com")),
	                Map.of("003", Map.of("Name", "Bob", "Email", "bob@yahoo.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Name=John,Address=(Street=Main St;City=NY;Zip=10001),Email=john@gmail.com\n002,Name=Jane,Address=(Street=2nd St;City=LA;Zip=90001),Email=jane@hotmail.com";
	            String userid = "002";
	            String key = "Address";
	            String newValue = "(Street=3rd Ave;City=SF;Zip=94101)";
	            List<Map<String, Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Name", "John", "Address", "(Street=Main St;City=NY;Zip=10001)", "Email", "john@gmail.com")),
	                Map.of("002", Map.of("Name", "Jane", "Address", "(Street=3rd Ave;City=SF;Zip=94101)", "Email", "jane@hotmail.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(6)
	    void test6() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String data = "001,Name=John,Email=john@gmail.com";
	            String userid = "001";
	            String key = "Name";
	            String newValue = "Johnny";
	            List<Map<String, Map<String, String>>> result = ParsingUpdatingNestedKeyValData.solution(data, userid, key, newValue);
	            List<Map<String, Map<String, String>>> expected = List.of(
	                Map.of("001", Map.of("Name", "Johnny", "Email", "john@gmail.com"))
	            );
	            Assertions.assertEquals(expected, result);
	        });
	    }
	}
