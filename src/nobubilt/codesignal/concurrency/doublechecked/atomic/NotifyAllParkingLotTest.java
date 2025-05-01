package nobubilt.codesignal.concurrency.doublechecked.atomic;

public class NotifyAllParkingLotTest {
/**
 * Simulate a parking lot coordination system where cars can either enter or exit. 
 * Create a ParkingLot class with synchronized methods to manage parking spots. The 
 * enterParkingLot() method should allow a car to park only if there's a spot available, 
 * and the exitParkingLot() method should free up a spot and notify waiting cars.

In the Main class, create threads for multiple cars trying to park or leave, ensuring 
that cars wait for available spots when the parking lot is full, and leave once they 
are done. Ensure that the cars' entry and exit are properly synchronized using 
wait() and notify().
 * @param args
 * @throws InterruptedException
 */
	  public static void main(String[] args) throws InterruptedException {
		  NotifyAllParkingLot parkingLot = new NotifyAllParkingLot(3);

	        // TODO: Create a runnable for cars trying to enter the parking lot.
	        // The runnable should attempt to park a car by invoking the 'enterParkingLot'
		  // method and then simulate the car staying parked by pausing the thread.
	        // Following this, the runnable should invoke 'exitParkingLot' to make the car leave.
	        Thread t1 = new Thread(()-> {
	            try
	            {
	                parkingLot.enterParkingLot("1");
	            }catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }

	        });
	        Thread t2 = new Thread(()-> {
	            try
	            {
	            parkingLot.exitParkingLot("1");                
	            }
	            catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	        });
	              Thread t3 = new Thread(()-> {
	            try
	            {
	                parkingLot.enterParkingLot("2");
	            }catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }

	        });
	        Thread t4 = new Thread(()-> {
	            try
	            {
	            parkingLot.exitParkingLot("2");                
	            }
	            catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	        });
	            Thread t5 = new Thread(()-> {
	            try
	            {
	                parkingLot.enterParkingLot("3");
	            }catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }

	        });
	        Thread t6 = new Thread(()-> {
	            try
	            {
	            parkingLot.exitParkingLot("3");                
	            }
	            catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	        });
	         Thread t7 = new Thread(()-> {
	            try
	            {
	                parkingLot.enterParkingLot("4");
	            }catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }

	        });
	        Thread t8 = new Thread(()-> {
	            try
	            {
	            parkingLot.exitParkingLot("4");                
	            }
	            catch(InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	        });
	        // TODO: Start threads for multiple cars entering and exiting the parking lot.
	        // Each thread should be given a unique name representing the car it simulates (e.g., "Car 1").
	            t1.start();
	           
	            t3.start();
	            t5.start();
	            t7.start();
	            Thread.sleep(2000);
	             t2.start();
	            t4.start();
	            t6.start();
	            t8.start();
	        // TODO: Use join() to ensure all car threads complete before the program ends.
	        // This guarantees the main program waits for all car activities to finish before exiting.
	         t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	            t6.join();
	            t7.join();
	            t8.join();
	            
	    }
	}
