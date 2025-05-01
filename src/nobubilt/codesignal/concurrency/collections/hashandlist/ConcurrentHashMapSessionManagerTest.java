package nobubilt.codesignal.concurrency.collections.hashandlist;

public class ConcurrentHashMapSessionManagerTest {

	  public static void main(String[] args) throws InterruptedException {
		  ConcurrentHashMapSessionManager sessionManager = 
				  new ConcurrentHashMapSessionManager();

	        // Thread to create and update sessions
	        Thread t1 = new Thread(() -> {
	            // TODO: Create a session for user1 and update the session data
	            sessionManager.createSession("user1","starting session one");
	            sessionManager.updateSession("user1","running session one");

	          });

	        // Thread to create another session and remove one
	        Thread t2 = new Thread(() -> {
	            // TODO: Create a session for user2 and remove the session for user1
	            sessionManager.createSession("user2","starting session two ");
	            sessionManager.removeSession("user1");
	        });

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        // TODO: Print the session details for user2 and the total count of active sessions
	        
	        System.out.println("Session details: " + sessionManager.getSession("user2"));
	        System.out.println("total count of active sessions: " + sessionManager.getActiveSessionCount());
	    }
	}