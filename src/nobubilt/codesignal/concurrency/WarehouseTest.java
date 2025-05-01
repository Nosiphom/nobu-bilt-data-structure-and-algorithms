package nobubilt.codesignal.concurrency;

public class WarehouseTest {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Thread to add items
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                warehouse.addItem(10);
            }
        });

        // Thread to update inventory
        Thread t2 = new Thread(() -> {
            warehouse.updateInventory(5, 20);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final item count: " + warehouse.getItemCount());
        System.out.println("Final total value: " + warehouse.getTotalValue());
    }
}
