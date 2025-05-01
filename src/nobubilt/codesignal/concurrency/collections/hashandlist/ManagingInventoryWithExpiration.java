package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/**
 * In this task, you'll integrate expiration handling using 
 * ConcurrentHashMap<String, LocalDate>. This map will store each item's 
 * expiration date. Your job is to modify the system to accommodate these dates.

To complete this task:

Set up a ConcurrentHashMap for expiration dates.
Update addItem() to include expiration dates.
Implement removeExpiredItems() to clean up outdated items.
Modify displayInventory() to show items with their expiration dates.
 * 
 *
 */
public class ManagingInventoryWithExpiration {
	   private ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();
	    // TODO: Declare a ConcurrentHashMap for storing expiration dates of items
	    private ConcurrentHashMap<String, LocalDate> expirationDateMap = new ConcurrentHashMap<>();

	    public void addItem(String item, int quantity, LocalDate date) {
	        inventory.merge(item, quantity, Integer::sum);
	        expirationDateMap.put(item, date);
	        // TODO: Add code to update the expiration date map whenever new stock is added
	    }

	    public void removeItem(String item, int quantity) {
	        inventory.computeIfPresent(item, (key, val) -> val - quantity > 0 ? val - quantity : null);
	        if(!inventory.containsKey(item))
	        {
	        	expirationDateMap.remove(item);
	        }
	        
	        // TODO: Remove expiration date if the item is no longer in inventory
	    }

	    public int getQuantity(String item) {
	        return inventory.getOrDefault(item, 0);
	    }

	    // TODO: Implement a method to remove expired items based on the current date
	    public void removeExpiredItem()
	    {
	        List<String> expiredKeys = new ArrayList<>();
	        for(String key : expirationDateMap.keySet())
	        {
	            if(expirationDateMap.get(key).isBefore(LocalDate.now()))
	            {
	                expiredKeys.add(key);
	            }
	        }
	        for(String expiredKey : expiredKeys)
	        {
	            expirationDateMap.remove(expiredKey);
	            inventory.remove(expiredKey);
	        }
	    }

	    public void displayInventory() {
	        inventory.forEach((item, quantity) -> {
	            // TODO: Print expiration date along with item and quantity
	            System.out.println("Item: " + item + " quantity: "+ quantity + " expiration date: " + expirationDateMap.get(item));
	        });
	    }
	
}
