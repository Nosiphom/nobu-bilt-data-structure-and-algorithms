package nobubilt.codesignal.design;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;
public class OverloadingDataProcessor {


	/**
	 * Task 1: Enhancing a Complex Data Processing Function with Method Overloading
Let's say that initially, we have a complex data processing class designed to operate on a list 
of HashMaps, applying a transformation that converts all string values within the HashMaps to 
upper case. Here's the initial version:
	 * @param items
	 */
	public class DataProcessor {
		//og version
//	    void processData(List<Map<String, Object>> items) {
//	        List<Map<String, Object>> processedItems = new ArrayList<>();
//	        for (Map<String, Object> item : items) {
//	            Map<String, Object> processedItem = new HashMap<>();
//	            for (Map.Entry<String, Object> entry : item.entrySet()) {
//	                if (entry.getValue() instanceof String) {
//	                    processedItem.put(entry.getKey(), ((String) entry.getValue()).toUpperCase());
//	                } else {
//	                    processedItem.put(entry.getKey(), entry.getValue());
//	                }
//	            }
//	            processedItems.add(processedItem);
//	        }
//	        for (int i = 0; i < Math.min(3, processedItems.size()); i++) {
//	            System.out.println("Processed Item: " + processedItems.get(i));
//	        }
//	    }
//	
	
	/**
	 * We intend to expand this functionality, adding capabilities to filter the items based on a 
	 * condition and to allow for custom transformations. The aim is to retain backward compatibility 
	 * while introducing these enhancements. Here's the updated approach using method overloading:
	 * 
	 */
	
	    void processData(List<Map<String, Object>> items) {
	        processData(items, item -> true, null);
	    }

	    void processData(List<Map<String, Object>> items, Function<Map<String, Object>, Map<String, Object>> transform) {
	        processData(items, item -> true, transform);
	    }

	    void processData(List<Map<String, Object>> items, Predicate<Map<String, Object>> condition, Function<Map<String, Object>, Map<String, Object>> transform) {
	        List<Map<String, Object>> processedItems = new ArrayList<>();
	        for (Map<String, Object> item : items) {
	            if (condition.test(item)) {  // Apply condition to filter items
	                Map<String, Object> processedItem;
	                if (transform != null) {
	                    processedItem = transform.apply(item);  // Apply custom transformation if provided
	                } else {
	                    // Default transformation: Convert string values to uppercase
	                    processedItem = new HashMap<>();
	                    for (Map.Entry<String, Object> entry : item.entrySet()) {
	                        if (entry.getValue() instanceof String) {
	                            processedItem.put(entry.getKey(), ((String) entry.getValue()).toUpperCase());
	                        } else {
	                            processedItem.put(entry.getKey(), entry.getValue());
	                        }
	                    }
	                }
	                processedItems.add(processedItem);
	            }
	        }
	        for (int i = 0; i < Math.min(3, processedItems.size()); i++) {
	            System.out.println("Processed Item: " + processedItems.get(i));
	        }
	    }
	}

	
	
//Usage examples:
	    public static void main(String[] args) {
	        List<Map<String, Object>> data = new ArrayList<>();
	        Map<String, Object> item1 = new HashMap<>();
	        item1.put("name", "apple");
	        item1.put("quantity", 10);
	        data.add(item1);
	        Map<String, Object> item2 = new HashMap<>();
	        item2.put("name", "orange");
	        item2.put("quantity", 5);
	        data.add(item2);

	       DataProcessor processor = new DataProcessor();

	        // Default behavior - convert string values to uppercase
	        processor.processData(data);

	        // Custom filter - select items with a quantity greater than 5
	        processor.processData(data, item -> (Integer) item.get("quantity") > 5, null);

	        // Custom transformation - convert names to uppercase and multiply the quantity by 2
	        processor.processData(data, item -> {
	            Map<String, Object> transformed = new HashMap<>();
	            for (Map.Entry<String, Object> entry : item.entrySet()) {
	                if (entry.getKey().equals("name")) {
	                    transformed.put(entry.getKey(), ((String) entry.getValue()).toUpperCase());
	                } else {
	                    transformed.put(entry.getKey(), (Integer) entry.getValue() * 2);
	                }
	            }
	            return transformed;
	        });
	    }
	    
	    /**
	     * In this evolved version, we've introduced method overloading with additional parameters: 
	     * Predicate<Map<String, Object>> condition to filter the input list based on a given condition, 
	     * and Function<Map<String, Object>, Map<String, Object>> transform for custom transformations of 
	     * the filtered items. The default behavior processes all items, converting string values to 
	     * uppercase, which ensures that the original functionality's behavior is maintained for existing
	     *  code paths. This robust enhancement strategy facilitates adding new features to a function 
	     *  with significant complexity while preserving backward compatibility, showcasing an advanced 
	     *  application of evolving software capabilities responsively and responsibly.
	     */
	
}
