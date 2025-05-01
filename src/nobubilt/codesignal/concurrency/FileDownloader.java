package nobubilt.codesignal.concurrency;

import java.util.Random;

public class FileDownloader implements Runnable {
    private final String fileName;
    private final Random rnd;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
        this.rnd = new Random();
    }
    
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
            System.out.println(Thread.currentThread().getName() + " is interrupted.");
        }
    }

    @Override
    public void run() {
        try {
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Starting download: " + fileName);
            }
            // TODO: Add a loop that simulates the download in steps, using sleep to indicate progress
            synchronized(this)
            {
                for(int inx = 0; inx <= 100; inx+=10)
                {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + " has progress " + inx + " % download of file " + fileName);
                }
            }
            // TODO: Synchronize the output of each progress step to prevent overlap
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
}
