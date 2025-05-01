package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.time.LocalDate;

public class ManagingInventoryWithExpirationTest {

    public static void main(String[] args) throws InterruptedException {
    	ManagingInventoryWithExpiration inventory = new ManagingInventoryWithExpiration();

        Thread t1 = new Thread(() -> {
            inventory.addItem("Apple", 50 , LocalDate.of(2024, 9, 23));
            inventory.addItem("Banana", 30 , LocalDate.of(2025, 3, 20));
        });

        Thread t2 = new Thread(() -> {
            inventory.removeItem("Apple", 20);
            inventory.addItem("Orange", 40 , LocalDate.of(2025,1,22));
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Inventory before removing expired items:");
        inventory.displayInventory();

        // TODO: Call the method to remove expired items and display the inventory again
        inventory.removeExpiredItem();
        System.out.println("Inventory after removing expired items:");
        inventory.displayInventory();
    }       
}
