package nobubilt.codesignal.concurrency.doublechecked;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketBookingSystemCompareAndSet {

	  private AtomicInteger availableTickets;

	    // TODO: Implement the constructor to initialize the AtomicInteger with the initial 
	  //number of tickets passed as a parameter
	    public TicketBookingSystemCompareAndSet(int ticketNum)
	    {
	        this.availableTickets = new AtomicInteger(ticketNum);
	    }

	    public void bookTicket()
	    {
	        int currentTickets = availableTickets.get();
	        if(currentTickets == 0)
	        {
	            return;
	        }
	        boolean success = availableTickets.compareAndSet(currentTickets, --currentTickets);
	        if(success)
	        {
	            System.out.println("successful booking and the remaining number of tickets " 
	           + availableTickets.get());
	        }
	        else
	        {
	            System.out.println("unsuccessful booking if no tickets are available ");
	        }
	    }
	    // TODO: Implement the bookTicket() method
	    // - Retrieve the current number of available tickets using get()
	    // - Check if tickets are available and exit if no tickets are left
	    // - Use compareAndSet to safely decrement the ticket count while ensuring no other 
	    // thread has modified it
	    // - Print a message indicating the successful booking and the remaining number of tickets
	    // - Print a message indicating unsuccessful booking if no tickets are available
	}
