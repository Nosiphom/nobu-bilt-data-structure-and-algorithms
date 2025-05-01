package nobubilt.codesignal.concurrency.collections.skiplist;

import java.util.List;

public class TrafficCongestionTrackerTest {

	   public static void main(String[] args) throws InterruptedException {
	        // TODO: Initialize the TrafficCongestionTracker
	        TrafficCongestionTracker tracker = new TrafficCongestionTracker();
	        // TODO: Create and start multiple threads simulating congestion updates from different sensors
	        Thread t1  = new Thread(()-> {
	            tracker.updateCongestion("Seasame Street", 1700.0);
	            tracker.updateCongestion("Main Street", 200.0);
	            tracker.updateCongestion("Third Street", 450.0);
	            tracker.updateCongestion("Living Street", 670.0);
	            tracker.updateCongestion("South Street", 300.0);
	        });
	           Thread t2  = new Thread(()-> {
	            tracker.updateCongestion("Flour Street", 100.0);
	            tracker.updateCongestion("Baker Street", 1000.0);
	            tracker.updateCongestion("Cheese Street", 350.0);
	            tracker.updateCongestion("Grater Street", 970.0);
	            tracker.updateCongestion("Raisin Street", 110.0);
	            tracker.updateCongestion("Seasame Street", 900.0);
	        });
	           Thread t3  = new Thread(()-> {
	            tracker.updateCongestion("Cloud Street", 400.0);
	            tracker.updateCongestion("Sun Street", 1100.0);
	            tracker.updateCongestion("Moon Street", 650.0);
	            tracker.updateCongestion("Earth Street", 970.0);

	        });
	        t1.start();
	        t2.start();
	        t3.start();
	        
	        t1.join();
	        t2.join();
	        t3.join();
	        // TODO: Wait for threads to finish
	        System.out.println("Top 5 congested streets: ");
	        List<String> result = tracker.getTopNCongestedStreets(5);
	        if(result != null)
	        {
	            result.forEach(rec -> System.out.println(rec));
	        }
	        // TODO: Print out the top N most congested streets
	    }
	}
