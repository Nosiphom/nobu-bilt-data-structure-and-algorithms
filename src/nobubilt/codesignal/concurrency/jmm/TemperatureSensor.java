package nobubilt.codesignal.concurrency.jmm;

public class TemperatureSensor implements Runnable {
    
    private TemperatureMonitor temperatureMonitor;
    private String threadName;
    public TemperatureSensor(TemperatureMonitor monitor, String name)
    {
        this.temperatureMonitor = monitor;
        this.threadName = name;
    }
    @Override
    public void run() {
        while (true) {
            // TODO: Print the current temperature using a method from TemperatureMonitor
           System.out.println(threadName  + " has current temperature " + temperatureMonitor.getTemperature());
            try {
                Thread.sleep(500); // Simulate reading delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}