package nobubilt.codesignal.concurrency;

import java.util.Random;

public class Downloader implements Runnable {
    private final String fileName;
    private final Random rnd;

    public Downloader(String fileName) {
        this.fileName = fileName;
        this.rnd = new Random();
    }
    /**
     * The run method implements the logic for simulating a file download. It uses a 
     * synchronized block to ensure that the start and completion messages for a download
     *  operation do not overlap with other threads' output, making the console output clear. 
     *  The Thread.sleep() call simulates the time taken to download a file, using a random
     *   duration to mimic real-world variability. In case of interruption, an appropriate 
     *   message is displayed to indicate that the download was interrupted.
     */
    @Override
    public void run() {
        try {
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Starting download: " + fileName);
            }
            pauseDownload();//Call the pauseDownload() method here to simulate network latency
            Thread.sleep(rnd.nextInt(100) + 100); // Simulate time taken to download
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Completed download: " + fileName);
            }
        } catch (InterruptedException e) {
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Download interrupted: " + fileName);
            }
        }
    }
    
    // TODO: Add a synchronized method called pauseDownload() that pauses the thread for 500ms
    public void pauseDownload()
    {
        try
        {
            synchronized(this)
            {
                Thread.sleep(500);
            }            
        }
        catch(InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName() + " is interrupted");
        }
    }
}