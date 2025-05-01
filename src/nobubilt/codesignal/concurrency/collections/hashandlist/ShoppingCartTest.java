package nobubilt.codesignal.concurrency.collections.hashandlist;

/**
 * Your task is to implement it in a way that supports multiple users (threads) adding items concurrently. Ensure that when an item is added to the cart, it is also removed from the inventory and that carts are updated without conflicts.
 * 
 *
 */
public class ShoppingCartTest {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Set up InventorySystem and initialize a few items
    	StoreInventory inventorySystem = new StoreInventory();
        inventorySystem.addItem("Milk", 50);
        inventorySystem.addItem("Books", 20);
        inventorySystem.addItem("Eggs", 70);
        inventorySystem.addItem("Bread", 40);
        inventorySystem.addItem("Cheese", 85);
        // TODO: Create multiple ShoppingCart instances for different threads/users
        ShoppingCart customerJim = new ShoppingCart(inventorySystem);
        ShoppingCart customerAmy = new ShoppingCart(inventorySystem);
        ShoppingCart customerLincoln = new ShoppingCart(inventorySystem);
        ShoppingCart customerMark = new ShoppingCart(inventorySystem);

        // TODO: Implement and start threads to simulate adding items to cart concurrently
        Thread customerJimThread = new Thread(()-> {
            customerJim.addToCart("Milk", 2);
            customerJim.addToCart("Eggs", 12);
            customerJim.addToCart("Bread", 4);
        });
        
           Thread customerAmyThread = new Thread(()-> {
            customerAmy.addToCart("Cheese", 2);
            customerAmy.addToCart("Eggs", 4);
            customerAmy.addToCart("Bread", 2);
        });
        
           Thread customerLincolnThread = new Thread(()-> {
            customerLincoln.addToCart("Books", 2);
            customerLincoln.addToCart("Bread", 12);
            customerLincoln.addToCart("Cheese", 4);
        });
        
           Thread customerMarkThread = new Thread(()-> {
            customerMark.addToCart("Milk", 3);
            customerMark.addToCart("Eggs", 8);
            customerMark.addToCart("Books", 3);
        });
        
         
           
        customerJimThread.start();
        customerAmyThread.start();
        customerLincolnThread.start();
        customerMarkThread.start();
      
       
        
        
        customerJimThread.join();
        customerAmyThread.join();
        customerLincolnThread.join();
        customerMarkThread.join();
      
        System.out.println("**********  END   *******************");
        System.out.println("Jim's shopping cart");
        customerJim.displayCart();
        System.out.println();
        System.out.println("Amy's shopping cart");
        customerAmy.displayCart();
        System.out.println();
        System.out.println("Lincoln's shopping cart");
        customerLincoln.displayCart();
        System.out.println();
        System.out.println("Mark's shopping cart");
        customerMark.displayCart();
        // TODO: Ensure threads join and then display the content of each user's cart
    }
}

