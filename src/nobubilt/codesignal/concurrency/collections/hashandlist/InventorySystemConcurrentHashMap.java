package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.concurrent.ConcurrentHashMap;
/**
 *  Using ConcurrentHashMap provides several benefits:

Enhances performance: Avoids the bottleneck caused by locks and reduces contention between threads.
Ensures consistency: Allows atomic updates that maintain data integrity across multiple threads.
Real-world scenarios: Commonly used in multi-user applications or online stores where concurrent 
data access is necessary.
 * 
 *
 */
public class InventorySystemConcurrentHashMap {

	 private ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();
/**
 * The addItem() method uses the merge function to ensure atomic updates. 
 * This method either adds a new item to the inventory or updates an existing 
 * one by adding the given quantity. The operation is thread-safe, which means 
 * multiple threads can modify the inventory concurrently without causing conflicts.
 * @param item
 * @param quantity
 */
	    public void addItem(String item, int quantity) {
	        inventory.merge(item, quantity, Integer::sum);
	    }
/**
 * The removeItem() method uses computeIfPresent() to safely decrease the quantity 
 * of an item. If an item's quantity drops to zero, it’s automatically removed from 
 * the inventory. This approach prevents negative quantities and keeps the system 
 * clean and error-free, even when multiple threads interact with the inventory at once.
 * @param item
 * @param quantity
 */
	    public void removeItem(String item, int quantity) {
	        inventory.computeIfPresent(item, (key, val) -> val - quantity > 0 ? val - quantity : null);
	    }
/**
 * The getQuantity() method provides a way to retrieve the current quantity of a specific item. 
 * It uses getOrDefault() to ensure that the method returns 0 if the item doesn’t exist in the 
 * inventory. This ensures that no null values are returned, maintaining robustness when used 
 * in a multi-threaded environment.
 * @param item
 * @return
 */
	    public int getQuantity(String item) {
	        return inventory.getOrDefault(item, 0);
	    }
/**
 * The displayInventory() method uses forEach() to safely iterate through all items 
 * in the inventory, printing their names and quantities. This method provides a consistent 
 * and up-to-date view of the inventory across multiple threads.
 */
	    public void displayInventory() {
	        inventory.forEach((key, value) -> System.out.println(key + ": " + value));
	    }
	    
// TODO: Add a method to apply a discount as a percentage to an item's quantity in the inventory
	    public void applyDiscount(String item, int percentange)
	    {
	        int currentQuantity = inventory.getOrDefault(item, 0);
	        System.out.println("item: " + item + " currentQuantity: " + 
	        currentQuantity + " percentange: "+ percentange );
	        if(currentQuantity > 0)
	        {
	            inventory.computeIfPresent(item, 
	            		(key, val)-> val > 0 ? val - (int)(val * (percentange/100.0)) : 0);
	        }
	    }
	    
// TODO: Implement a method called reorderItem that triggers an automatic re-order when 
//stock falls below a threshold
// TODO: Use the compute() method to update the quantity of the item in a thread-safe manner
// TODO: Print a message when the reorder happens and update the item's stock
	    public void reorderItem(String item, int threshold, int fixedAmount)
	    {
	        inventory.compute(item, (key, val)-> val <= threshold ? val += fixedAmount : val);
	        System.out.println("Reorder occurred for item: " + item + " now quantity :" 
	        + inventory.getOrDefault(item, 0));
	    }

	}
