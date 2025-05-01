package nobubilt.codesignal.concurrency;

public class RedLight implements Runnable
{
    private String threadName;
    public RedLight(String name)
    {
        this.threadName = name;
    }
    
    public void run()
    {
        try
        {
            System.out.println("Red Light ON");
            Thread.sleep(5000);
            System.out.println("Red Light OFF");
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted in " + threadName);
        }
    }
}


