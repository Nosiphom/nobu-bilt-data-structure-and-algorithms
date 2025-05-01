package nobubilt.codesignal.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParsingAndUpdatingNestedJsonNestedHashMapTest {
	   private ParsingAndUpdatingNestedJsonNestedHashMap app;

	    @BeforeEach
	    void setUp() {
	        app = new ParsingAndUpdatingNestedJsonNestedHashMap();
	    }

	    @Test
	    @Order(1)
	    void test1() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String jsonString = "{\"key1\": \"value1\", \"key2\": {\"key3\": \"value3\", \"key4\": \"value4\"}, \"key5\": \"value5\"}";
	            String newValue = "newValue";
	            Map<String, Map<String, String>> result = app.solution(jsonString, newValue);

	            Map<String, Map<String, String>> expected = new HashMap<>() {{
	                put("key1", new HashMap<>() {{
	                    put("value1", "");
	                }});
	                put("key2", new HashMap<>() {{
	                    put("key3", "value3");
	                    put("key4", "newValue");
	                }});
	                put("key5", new HashMap<>() {{
	                    put("value5", "");
	                }});
	            }};

	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(2)
	    void test2() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String jsonString = "{\"key1\": \"value1\", \"key2\": {\"key3\": \"value3\", \"key4\": \"value4\"}}";
	            String newValue = "testValue";
	            Map<String, Map<String, String>> result = app.solution(jsonString, newValue);

	            Map<String, Map<String, String>> expected = new HashMap<>() {{
	                put("key1", new HashMap<>() {{
	                    put("value1", "");
	                }});
	                put("key2", new HashMap<>() {{
	                    put("key3", "value3");
	                    put("key4", "testValue");
	                }});
	            }};

	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(3)
	    void test3() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String jsonString = "{\"key4\": \"value4\"}";
	            String newValue = "newValue";
	            Map<String, Map<String, String>> result = app.solution(jsonString, newValue);

	            Map<String, Map<String, String>> expected = new HashMap<>() {{
	                put("key4", new HashMap<>() {{
	                    put("newValue", "");
	                }});
	            }};

	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(4)
	    void test4() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String jsonString = "{\"key1\": {\"key2\": \"value3\"}, \"key4\": \"value4\"}";
	            String newValue = "deepValue";
	            Map<String, Map<String, String>> result = app.solution(jsonString, newValue);

	            Map<String, Map<String, String>> expected = new HashMap<>() {{
	                put("key1", new HashMap<>() {{
	                    put("key2", "value3");
	                }});
	                put("key4", new HashMap<>() {{
	                    put("deepValue", "");
	                }});
	            }};

	            Assertions.assertEquals(expected, result);
	        });
	    }

	    @Test
	    @Order(5)
	    void test5() {
	        Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	            String jsonString = "{\"key1\": {\"key3\": \"value3\", \"key4\": \"value4\"}, \"key2\": \"value2\"}";
	            String newValue = "topLevelValue";
	            Map<String, Map<String, String>> result = app.solution(jsonString, newValue);

	            Map<String, Map<String, String>> expected = new HashMap<>() {{
	                put("key1", new HashMap<>() {{
	                    put("key3", "value3");
	                    put("key4", "topLevelValue");
	                }});
	                put("key2", new HashMap<>() {{
	                    put("value2", "");
	                }});
	            }};

	            Assertions.assertEquals(expected, result);
	        });
	    }
	}