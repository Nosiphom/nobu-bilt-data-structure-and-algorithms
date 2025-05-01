package nobubilt.codesignal.concurrency.collections.copyonwrite;

public class CopyOnWriteArraySetTest {
	 public static void main(String[] args) {
		 CopyOnWriteArraySet list = new CopyOnWriteArraySet();
	        list.addSubscriber("subscriber1");
	        list.addSubscriber("subscriber1"); // Duplicate check should prevent this
	        list.addSubscriber("subscriber2");
	        
	        // TODO: Add multiple subscribers including a duplicate
	        String[] subscribers = {"subscriber3","subscriber1","subscriber4",
	        		"subscriber5","subscriber2","subscriber1", "subscriber6"};
	        list.addSubscribers(subscribers);

	      
	        list.sendNewsletter("Welcome to our newsletter!");
	        
	        list.addSubscriber("John");
	        list.addSubscriber("Jane");
	        list.addSubscriber("Mark");

	        // TODO: Print the list of subscribers before removal
	        list.getSubscribers().forEach(rec -> System.out.println( rec));
	        // TODO: Safely remove subscribers whose name starts with 'J'
	        list.removeSubscribersWithNameStartingWithJ();
	        // TODO: Print the list of subscribers after removal to verify success
	        System.out.println();
	        System.out.println("list of subscribers after removal:");
	          list.getSubscribers().forEach(rec -> System.out.println( rec));
	          System.out.println();
	          System.out.println();
	          CopyOnWriteArraySet logSystem = new CopyOnWriteArraySet();
	 
	          // TODO: Simulate adding a few log entries
	          logSystem.addLog(""+ System.currentTimeMillis() + ".log1");
	          logSystem.addLog(""+ System.currentTimeMillis() + ".log2");
	          logSystem.addLog(""+ System.currentTimeMillis() + ".log3");
	          logSystem.addLog(""+ System.currentTimeMillis() + ".log4");
	          logSystem.addLog(""+ System.currentTimeMillis() + ".log5");
	          // TODO: Retrieve and print all log entries
	          logSystem.getLogList().forEach(rec -> System.out.println(rec));
	          // TODO: Clear the logs and confirm they have been cleared
	          logSystem.clearLogs();
	          
	          System.out.println("Log size " + logSystem.getLogList().size());
	      }
	 
}
