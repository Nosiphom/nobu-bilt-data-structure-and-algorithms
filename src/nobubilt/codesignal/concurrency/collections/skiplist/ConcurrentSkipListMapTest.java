package nobubilt.codesignal.concurrency.collections.skiplist;

public class ConcurrentSkipListMapTest {

	public static void main(String[] args) throws InterruptedException {
		ConcurrentSkipListMapExample example = new ConcurrentSkipListMapExample();

        // TODO: Create and start a Thread (t1) to increment the count 
		//for "zebra", "apple", and "monkey" 1000 times
        Thread t1 = new Thread(()->{
            for(int inx  =0; inx < 1000; inx++)
            {
                example.incrementCount("zebra");
                example.incrementCount("apple");
                example.incrementCount("monkey");
            }
        });


        // TODO: Create and start a Thread (t2) to increment the count 
        //for "banana", "lion", and "elephant" 1000 times
             Thread t2 = new Thread(()->{
            for(int inx  =0; inx < 1000; inx++)
            {
                example.incrementCount("apple");
                example.incrementCount("lion");
                example.incrementCount("elephant");
            }
        });


        // TODO: Start both threads
        t1.start();
        t2.start();

        // TODO: Wait for both threads to finish
        t1.join();
        t2.join();

        // TODO: Display the contents of the map
        example.displayMap();
    }
	/**
	 * expected:
	 * apple: 1000
banana: 1000
elephant: 1000
lion: 1000
monkey: 1000
zebra: 1000
	 */
}
