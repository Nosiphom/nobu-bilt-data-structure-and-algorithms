package nobubilt.codesignal.concurrency.jmm;

public class TemperatureMonitor {
    // TODO: Declare a volatile variable to store the latest temperature
    private volatile int temperature;
    // TODO: Implement a setTemperature method to update the latest temperature
    public void setTemperature(int temp)
    {
        this.temperature = temp;
    }
	// TODO: Implement a getLatestTemperature method to return the latest temperature
	public int getTemperature()
	{
	    return temperature;
	}
}
