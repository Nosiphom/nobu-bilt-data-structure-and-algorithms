package nobubilt.codesignal.concurrency;

public class TrafficLightControl {
/**
 * Great job learning about thread operations like start(), sleep(), and join()! Now, 
 * it's time to put all three methods together to create a simple traffic light simulation.

In this final task, you'll write a program that simulates a traffic light system using 
three threads: RedLightThread, GreenLightThread, and YellowLightThread. Each thread should 
represent a traffic light with a specific delay:

Red Light: Simulated by making the thread sleep for 5 seconds.
Green Light: Starts only after the red light finishes, then runs for 4 seconds.
Yellow Light: Starts after the green light finishes, running for 2 seconds.
The goal is to ensure that the traffic lights work in the correct sequence, simulating 
real-life traffic light behavior.
 *
 *Red Light ON
Red Light OFF
Green Light ON
Green Light OFF
Yellow Light ON
Yellow Light OFF
 *
 */
	

    public static void main(String[] args) throws InterruptedException {
        // TODO: Create threads for red, green, and yellow lights
           Thread redLightThread = new Thread(new RedLight("Red light"));
           Thread greenLightThread = new Thread(new GreenLight("Green light"));
           Thread yellowLightThread = new Thread(new YellowLight("Yellow light")); 
        // TODO: Start the light threads in correct order
           redLightThread.start();
           redLightThread.join();
           
           greenLightThread.start();
           greenLightThread.join();
           
           yellowLightThread.start();
           yellowLightThread.join();
        // TODO: Use join to make sure each thread finishes before starting the next one

    }
}
