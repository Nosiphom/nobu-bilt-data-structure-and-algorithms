package nobubilt.codesignal.concurrency.collections.copyonwrite;

public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
    	CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.addSubscriber("subscriber1");
        list.addSubscriber("subscriber2");
        
        // Sending newsletter to current subscribers
        list.sendNewsletter("Welcome to our newsletter!");
        
        // Adding a new subscriber after sending the newsletter
        list.addSubscriber("newSubscriber@example.com");
        
        /**
         * expected:
         * Sending message to subscriber1
Sending message to subscriber2
         */
    }
}
