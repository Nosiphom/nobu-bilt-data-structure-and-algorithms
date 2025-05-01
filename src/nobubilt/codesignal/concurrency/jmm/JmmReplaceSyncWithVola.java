package nobubilt.codesignal.concurrency.jmm;

public class JmmReplaceSyncWithVola {

	  private volatile int counter = 0;

	    public void incrementCounter() {
	        // TODO: Replace the synchronized block with the volatile keyword for counter
	            counter++;
	    }

	    public int getCounter() {
	        // TODO: Replace the synchronized block with the volatile keyword for counter
	            return counter;
	    }
}
