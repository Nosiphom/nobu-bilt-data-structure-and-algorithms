package nobubilt.codesignal.concurrency.collections.hashandlist;

import java.util.concurrent.ConcurrentHashMap;

public class ShoppingCart {
    // TODO: Declare a ConcurrentHashMap to act as the user's shopping cart
    // TODO: Declare a reference to the InventorySystem
    private ConcurrentHashMap<String, Integer> shoppingCart = new ConcurrentHashMap<>();
    private StoreInventory inventorySystem;
    // TODO: Implement a constructor that initializes the ShoppingCart with a reference to the InventorySystem
    public ShoppingCart(StoreInventory inventory)
    {
        this.inventorySystem = inventory;
    }
    public void addToCart(String item, int quantity) {
        // TODO: Implement logic to add items to the cart. Ensure that items are removed from the inventory   
        if(inventorySystem.removeItem(item, quantity))
        {
              shoppingCart.merge(item, quantity, Integer::sum);
        }
    }

    public void displayCart() {
        // TODO: Implement logic to display current items in the cart
        shoppingCart.forEach((key, val)-> System.out.println("Item: " + key + "  quantity: " + val));
    }
}
