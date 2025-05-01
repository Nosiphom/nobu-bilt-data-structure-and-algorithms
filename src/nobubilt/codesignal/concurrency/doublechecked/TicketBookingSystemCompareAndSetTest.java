package nobubilt.codesignal.concurrency.doublechecked;
/**
 * You've done a fantastic job learning about atomic variables and lock-free programming!
 *  Now it's time to put that knowledge into action by writing a Ticket Booking System 
 *  that ensures thread safety when multiple users book tickets concurrently.

In this task, you will:

Implement a TicketBookingSystem class to manage ticket availability.
Use an AtomicInteger to keep track of the number of tickets available.
Create multiple threads representing users trying to book tickets.
Ensure that tickets are booked correctly and no overbooking occurs.

 * 
 *
 */
public class TicketBookingSystemCompareAndSetTest {

	   public static void main(String[] args) throws InterruptedException {
	        // TODO: Create an instance of TicketBookingSystem with an initial number of tickets
		   TicketBookingSystemCompareAndSet bookingSystem = 
				   new TicketBookingSystemCompareAndSet(5);
	        // TODO: Create multiple threads representing users trying to book tickets
	            Thread t1 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            Thread t2 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            Thread t3 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            Thread t4 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            Thread t5 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            Thread t6 = new Thread(()-> {
	                bookingSystem.bookTicket();
	            });
	            
	            t1.start();
	            t2.start();
	            t3.start();
	            t4.start();
	            t5.start();
	            t6.start();
	            
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	            t6.join();
	        // TODO: Start the threads and wait for them to finish using join()
	    }
	}
