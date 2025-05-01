package nobubilt.codesignal.concurrency;

public class YellowLight implements Runnable
{
    private String threadName;
    public YellowLight(String name)
    {
        this.threadName = name;
    }
    
    public void run()
    {
        try
        {
            System.out.println("Yellow Light ON");
            Thread.sleep(2000);
            System.out.println("Yellow Light OFF");
        }
        catch(InterruptedException e)
        {
            System.out.println("interrupted in " + threadName);
        }
    }
}
