package nobubilt.codesignal.concurrency.doublechecked.deadlock;
/**
 * You've successfully run and modified a lock-free queue. Now it's time to write your 
 * own implementation from scratch. This exercise will reinforce your understanding of how 
 * atomic operations ensure thread safety.

Your task is to implement a lock-free stack using atomic variables and CAS (Compare-And-Swap)
 operations. The stack should support push() and pop() operations, ensuring that multiple 
 threads can safely push and pop elements concurrently without the use of locks.
 * 
 *
 */
public class LockFreeStackTest {
    public static void main(String[] args) throws InterruptedException {
        LockFreeStack<Integer> stack = new LockFreeStack<>();

        // TODO: Create a thread to push elements onto the stack.
        //       The thread should push integers from 0 to 9, with a slight delay between each push.
        Thread pushThread = new Thread(()->{
            for(int inx = 0; inx < 10; inx++)
            {
                try {
                    stack.push(inx);
                    System.out.println("Pushed: " + inx);
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        // TODO: Create a thread to pop elements from the stack.
        //       The thread should pop elements from the stack, with a slight delay between each pop.
        Thread popThread = new Thread(()->{
            for(int inx = 0; inx < 10; inx++)
            {
                try {
                    Integer poppedValue = stack.pop();
                    System.out.println("Popped: " + poppedValue);
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        // TODO: Start both threads and wait for them to finish.
        pushThread.start();
        popThread.start();
        
        pushThread.join();
        popThread.join();
    }
}
