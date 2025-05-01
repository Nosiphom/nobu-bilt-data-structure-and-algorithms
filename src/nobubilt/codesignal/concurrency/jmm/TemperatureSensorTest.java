package nobubilt.codesignal.concurrency.jmm;

import java.util.Random;
/**
 * Now it's time to enhance your understanding of volatile and visibility by working 
 * on a new program. In this task, you will complete a Temperature Monitor application 
 * that simulates multiple sensors taking temperature readings. You will:

Use a volatile variable to store the latest temperature value.
Ensure that all sensor threads have access to the most up-to-date temperature value.
Your goal is to finish implementing the TemperatureMonitor class and sensor threads. 
Each sensor will read the latest temperature and print it, demonstrating how volatile
 ensures visibility across threads.
 * 
 *
 */
public class TemperatureSensorTest {
	 public static void main(String[] args) throws InterruptedException {
	        // TODO: Create and start multiple threads representing temperature sensors
		 TemperatureMonitor temperatureMonitor = new TemperatureMonitor();
	        Thread t1 = new Thread(new TemperatureSensor(temperatureMonitor, "Alpha"));
	        Thread t2 = new Thread(new TemperatureSensor(temperatureMonitor, "Beta"));
	        Thread t3 = new Thread(new TemperatureSensor(temperatureMonitor, "Charlie"));
	        
	        t1.start();
	        t2.start();
	        t3.start();
	        Random random = new Random();
	        for (int i = 0; i < 10; i++) {
	            // TODO: Update the latest temperature using a method from TemperatureMonitor
	            temperatureMonitor.setTemperature(random.nextInt(100));
	            Thread.sleep(1000); // Simulate 1-second delay between temperature updates
	        }

	        // TODO: Join the sensor threads after the temperature readings are complete
	        t1.join();
	        t2.join();
	        t3.join();
	    }
}
