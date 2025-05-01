package nobubilt.codesignal.concurrency;

public class GreenLight implements Runnable
{
    private String threadName;
    public GreenLight(String name)
    {
        this.threadName = name;
    }
    
    public void run()
    {
        try
        {
            System.out.println("Green Light ON");
            Thread.sleep(4000);
            System.out.println("Green Light OFF");
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted in " + threadName);
        }
        
    }
}
