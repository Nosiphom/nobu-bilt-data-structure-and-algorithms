package nobubilt.codesignal.concurrency.doublechecked.deadlock;

public class Intersection {
	private final Object northSouthLock = new Object();
    private final Object eastWestLock = new Object();
/**
 * When the method is invoked, it acquires the northSouthLock, which guarantees that no other 
 * vehicle traveling North-South can enter the intersection until the current vehicle has 
 * crossed and released the lock. This is a critical step to ensure that only one vehicle 
 * crosses at a time in a specific direction, which helps prevent collisions. 
This approach isolates the two directions, so a vehicle crossing North-South does not interfere 
with one crossing East-West. The separate locks mean that there is no waiting between directions, 
helping to prevent the classic deadlock scenario where threads (or, in this case, vehicles) 
are waiting on each other to release a lock.
This topic is significant in the realm of concurrent programming and real-world applications 
like transportation systems. Understanding and implementing traffic control systems such as 
this one highlights the importance of:

Smooth Operation: Ensures that traffic flows smoothly without any blockages, a critical aspect
 of traffic management.
Deadlock Prevention: By controlling access to shared resources efficiently, we prevent deadlocks, 
ensuring system reliability.
Concurrency Skills: Enhances your ability to manage concurrent tasks, a valuable skill in the 
software development of complex systems.
Traffic control is one of many examples where smooth and efficient management of concurrent 
tasks is necessary. Mastering these skills will broaden your capability to design and implement
 systems that need to handle simultaneous operations without running into conflicts or resource blocks.
 */
    public void crossNorthSouth(String vehicle) throws InterruptedException {
        synchronized (northSouthLock) {
            System.out.println(vehicle + " is crossing North-South");
            Thread.sleep(100);
            System.out.println(vehicle + " has crossed North-South");
        }
    }

    public void crossEastWest(String vehicle) throws InterruptedException {
        synchronized (eastWestLock) {
            System.out.println(vehicle + " is crossing East-West");
            Thread.sleep(100);
            System.out.println(vehicle + " has crossed East-West");
        }
    }
}

