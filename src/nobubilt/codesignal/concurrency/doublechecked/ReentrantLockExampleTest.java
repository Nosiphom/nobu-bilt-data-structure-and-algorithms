package nobubilt.codesignal.concurrency.doublechecked;

public class ReentrantLockExampleTest {

	public static void main(String[] args)
	{
		ReentrantLockExample example = new ReentrantLockExample();
		Thread t1 = new Thread(example::methodOne);
		Thread t2 = new Thread(example::methodTwo);
		
		t1.start();
		t2.start();
	}
}
