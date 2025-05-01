package nobubilt.codesignal.concurrency.doublechecked.atomic;

public class NotifyAllParkingLot {
	  // TODO: Declare a variable to track available parking spots. This 
	//should be an integer initialized in the constructor.
    private int counter;

    // TODO: Implement the constructor with an integer parameter to 
    //initialize the number of available spots.
    public NotifyAllParkingLot(int size)
    {
        this.counter = size;
    }
    public synchronized void  enterParkingLot(String id) throws InterruptedException
    {
        if(counter == 0)
        {
            System.out.println(id + " is waiting for a parking spot...");
            wait();
        }
        --counter;
       System.out.println(id + " has parked. Available spots: " + counter); 
    }
    
    public synchronized void exitParkingLot(String id) throws InterruptedException
    {
        ++counter; 
        System.out.println(id + " has left. Available spots: " + counter);
        notifyAll();  
    }
    /**
    // TODO: Write the synchronized method 'enterParkingLot' which accepts a 
     * String parameter for the car's identifier.
    // If there are no available spots, the method should invoke wait() and 
     * print "<car> is waiting for a parking spot...".
    // When a spot becomes available, decrement the available spots and 
     * print "<car> has parked. Available spots: <number>".

    // TODO: Write the synchronized method 'exitParkingLot' which accepts a 
     * String parameter for the car's identifier.
    // This method should increment the available spots, print "<car> has left.
     *  Available spots: <number>", and then notify waiting cars.
	*/
}
