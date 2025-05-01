package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.concurrent.ConcurrentHashMap;

public class StoreInventory {
	  private ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();

	    public void addItem(String item, int quantity) {
	        inventory.merge(item, quantity, Integer::sum);
	    }

	    public boolean removeItem(String item, int quantity) {
	        return inventory.computeIfPresent(item, (key, val) -> val - quantity > 0 ? val - quantity : null) != null;
	    }
}
