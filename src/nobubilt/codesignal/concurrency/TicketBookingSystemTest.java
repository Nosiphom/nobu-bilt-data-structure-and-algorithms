package nobubilt.codesignal.concurrency;

public class TicketBookingSystemTest {
	/**
	 * let's enhance a ticket booking system to ensure it is thread-safe.

Currently, multiple threads can reserve tickets simultaneously, which leads to 
double-booking issues. Your task is to:

Add synchronization to the ticket reservation method to prevent multiple threads 
from reserving tickets at the same time.
Ensure that ticket reservations are handled accurately without double-booking.
In the Main class, create multiple threads to simulate customers reserving tickets 
concurrently. Use start() to run the threads and join() to ensure the main thread 
waits for all reservation attempts to finish.

By adding the synchronized keyword and correctly managing the threads, you will 
make the booking system reliable and prevent any double bookings.
	 * @param args
	 * @throws InterruptedException
	 */
	 public static void main(String[] args) throws InterruptedException {
	        // TODO: Create a TicketBookingSystem instance
	        TicketBookingSystem bookingSystem = new TicketBookingSystem(); 
	        // TODO: Create multiple threads to simulate customers reserving tickets
	        // Example: Thread t1 = new Thread(() -> bookingSystem.reserveTicket("Customer 1"));
	        Thread t1 = new Thread(() -> bookingSystem.reserveTicket("Customer 1"));
	        Thread t2 = new Thread(() -> bookingSystem.reserveTicket("Customer 2"));
	        Thread t3 = new Thread(() -> bookingSystem.reserveTicket("Customer 3"));
	        // TODO: Start the threads to simulate the reservations
	        t1.start();
	        t2.start();
	        t3.start();
	        
	        t1.join();
	        t2.join();
	        t3.join();
	        // TODO: Join the threads to wait for all reservation attempts to complete
	        System.out.println("final number of remaining tickets " + bookingSystem.getAvailableTickets());
	        // TODO: Print the final number of remaining tickets
	    }
	}
