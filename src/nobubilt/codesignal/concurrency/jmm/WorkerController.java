package nobubilt.codesignal.concurrency.jmm;

public class WorkerController {
	 // TODO: Add a volatile boolean variable named shouldStop to signal the worker to stop.
    private volatile boolean shouldStop;
    // TODO: Add setter (setShouldStop) and getter (getShouldStop) methods for shouldStop.
    public void setShouldStop(boolean flag)
    {
        this.shouldStop = flag;
    }
    public boolean getShouldStop()
    {
        return shouldStop;
    }

}
