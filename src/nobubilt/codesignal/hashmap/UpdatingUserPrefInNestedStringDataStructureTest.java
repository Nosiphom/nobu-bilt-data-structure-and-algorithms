package nobubilt.codesignal.hashmap;

import java.time.Duration;
import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UpdatingUserPrefInNestedStringDataStructureTest {

	  private UpdatingUserPrefInNestedStringDataStructure app;

	  @BeforeEach
	  void setUp() {
	    app = new UpdatingUserPrefInNestedStringDataStructure();
	  }

	  @Test
	  @Order(1)
	  void test1() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String input = "User1:Age1=21;Location1=USA;Preferences1={Food1=Italian;Sport1=Fencing};User2:Age2=30;Location2=Canada;Preferences2={Music2=Jazz;Color2=Blue}";
	      int userIndex = 1;
	      String prefKey = "Sport1";
	      String newValue = "Hockey";
	      Map<String, Map<String, String>> expected_output = new HashMap<>();
	      expected_output.put("User1", Map.of("Age1", "21", "Location1", "USA", "Preferences1", "{Food1=Italian;Sport1=Hockey}"));
	      expected_output.put("User2", Map.of("Age2", "30", "Location2", "Canada", "Preferences2", "{Music2=Jazz;Color2=Blue}"));
	      Assertions.assertEquals(expected_output, app.updatePreference(input, userIndex, prefKey, newValue));
	    });
	  }

	  @Test
	  @Order(2)
	  void test2() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String input = "User1:Age1=21;Location1=USA;Preferences1={Food1=Italian;Sport1=Fencing};";
	      int userIndex = 1;
	      String prefKey = "Sport1";
	      String newValue = "Football";
	      Map<String, Map<String, String>> expected_output = new HashMap<>();
	      expected_output.put("User1", Map.of("Age1", "21", "Location1", "USA", "Preferences1", "{Food1=Italian;Sport1=Football}"));
	      Assertions.assertEquals(expected_output, app.updatePreference(input, userIndex, prefKey, newValue));
	    });
	  }

	  @Test
	  @Order(3)
	  void test3() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String input = "User1:Age1=45;Location1=UK;Preferences1={Food1=Asian;Sport1=Golf};User2:Age2=22;Location2=Africa;Preferences2={Music2=Reggae;Color2=Yellow}";
	      int userIndex = 2;
	      String prefKey = "Color2";
	      String newValue = "Purple";
	      Map<String, Map<String, String>> expected_output = new HashMap<>();
	      expected_output.put("User1", Map.of("Age1", "45", "Location1", "UK", "Preferences1", "{Food1=Asian;Sport1=Golf}"));
	      expected_output.put("User2", Map.of("Age2", "22", "Location2", "Africa", "Preferences2", "{Music2=Reggae;Color2=Purple}"));
	      Assertions.assertEquals(expected_output, app.updatePreference(input, userIndex, prefKey, newValue));
	    });
	  }

	  @Test
	  @Order(4)
	  void test4() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String input = "User1:Age1=65;Location1=Australia;Preferences1={Food1=Seafood;Sport1=Surfing};";
	      int userIndex = 1;
	      String prefKey = "Food1";
	      String newValue = "Thai";
	      Map<String, Map<String, String>> expected_output = new HashMap<>();
	      expected_output.put("User1", Map.of("Age1", "65", "Location1", "Australia", "Preferences1", "{Food1=Thai;Sport1=Surfing}"));
	      Assertions.assertEquals(expected_output, app.updatePreference(input, userIndex, prefKey, newValue));
	    });
	  }

	  @Test
	  @Order(5)
	  void test5() {
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
	      String input = "User1:Age1=30;Location1=Germany;Preferences1={Food1=Bavarian;Sport1=Football};User2:Age2=25;Location2=India;Preferences2={Music2=Classical;Color2=Violet}";
	      int userIndex = 2;
	      String prefKey = "Music2";
	      String newValue = "Pop";
	      Map<String, Map<String, String>> expected_output = new HashMap<>();
	      expected_output.put("User1", Map.of("Age1", "30", "Location1", "Germany", "Preferences1", "{Food1=Bavarian;Sport1=Football}"));
	      expected_output.put("User2", Map.of("Age2", "25", "Location2", "India", "Preferences2", "{Music2=Pop;Color2=Violet}"));
	      Assertions.assertEquals(expected_output, app.updatePreference(input, userIndex, prefKey, newValue));
	    });
	  }
}
