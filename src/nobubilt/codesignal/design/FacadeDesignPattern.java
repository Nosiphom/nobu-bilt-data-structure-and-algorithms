package nobubilt.codesignal.design;

public class FacadeDesignPattern {

	public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder();
    }
	/**
	 * The Facade pattern provides a simplified interface to a complex subsystem.
	 * The Facade pattern simplifies complex processes by providing a higher-level interface. 
	 * Consider an online shopping application. When a user places an order, it triggers many operations. 
	 * By using the Facade pattern, we can create an OrderFacade class to simplify these operations:
	 * 
	 * This allows the underlying subsystems to evolve independently (e.g., changing the payment
	 *  process or delivery options) without necessitating changes to the client code, thereby 
	 *  preserving the interface's constancy over time. In addition, it makes the code more decoupled,
	 *   allowing all order steps to be updated independently.
	 * 
	 *
	 */


	
}
// Define subsystems
class Order {
    public void create() {
        System.out.println("Order Created");
    }
}

class Product {
    public void checkAvailability() {
        System.out.println("Product Availability Checked");
    }
}

class Payment {
    public void processPayment() {
        System.out.println("Payment Processed");
    }
}

class Delivery {
    public void arrangeDelivery() {
        System.out.println("Delivery Arranged");
    }
}

// Facade class
class OrderFacade {
    private Order order;
    private Product product;
    private Payment payment;
    private Delivery delivery;

    public OrderFacade() {
        this.order = new Order();
        this.product = new Product();
        this.payment = new Payment();
        this.delivery = new Delivery();
    }

    public void placeOrder() {
        order.create();
        product.checkAvailability();
        payment.processPayment();
        delivery.arrangeDelivery();
    }
}
