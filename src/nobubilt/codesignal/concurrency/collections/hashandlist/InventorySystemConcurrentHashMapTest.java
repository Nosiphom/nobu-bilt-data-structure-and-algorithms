package nobubilt.codesignal.concurrency.collections.hashandlist;

public class InventorySystemConcurrentHashMapTest {
	 public static void main(String[] args) throws InterruptedException {
		 InventorySystemConcurrentHashMap inventory 
		 = new InventorySystemConcurrentHashMap();

	        Thread t1 = new Thread(() -> {
	            inventory.addItem("Apple", 50);
	            inventory.addItem("Banana", 30);
	            inventory.addItem("Milk", 10);
	            inventory.addItem("Eggs", 5);
	        });

	        Thread t2 = new Thread(() -> {
	            inventory.removeItem("Apple", 20);
	            inventory.addItem("Orange", 60);
	            inventory.addItem("Banana", 10);
	       // TODO: In this thread, apply a discount to an item
	            inventory.applyDiscount("Orange", 50);
	            inventory.removeItem("Milk", 8);
// TODO: Ensure that the reorderItem method is tested with different thresholds and quantities
	            
	            inventory.reorderItem("Eggs", 2, 4);
	            inventory.reorderItem("Milk", 6, 4);

	        });
	        
	    
	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        inventory.displayInventory();
	    }
	
}
