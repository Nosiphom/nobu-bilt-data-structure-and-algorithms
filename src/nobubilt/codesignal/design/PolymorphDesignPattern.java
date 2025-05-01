package nobubilt.codesignal.design;

public class PolymorphDesignPattern {
	
	/**
	 * You have been tasked with enhancing the NotificationService class used to send notifications. 
	 * The current implementation supports only email notifications, and you need to extend this 
	 * functionality to include SMS and Push Notifications without breaking the existing usage of the class.

Your task is to extend the NotificationService, allowing it to send different types of notifications 
(Email, SMS, Push) based on the provided notification instance without altering the original 
sendNotification method's behavior (i.e., all previous sendNotification usages should keep
 working as before).

Ensure backward compatibility so that the existing system, which uses NotificationService for 
sending email notifications, continues to work without modifications.

Hint: Provided unit tests might reveal some code structure that is efficient here.
	 * 
	 */

	 public interface INotification {
	        public String notificationType();
	    }
	    
	    public class NotificationService {
	        public void sendNotification(String message, String recipient) {
	            // Simulates sending an email
	            System.out.println("Sending email to " + recipient + ": " + message);
	        }
	        
	        public void sendNotification(String message, String recipient, INotification notification) {
	            // Simulates sending an email
	            System.out.println("Sending " + notification.notificationType()+ " to " + recipient + ": " + message);
	        } 
	    }
	    public class EmailNotification implements INotification
	    {
	       public String notificationType()
	      {
	        return "email";
	      } 
	    }
	    
	    public class SMSNotification implements INotification{
	        
	      public String notificationType()
	      {
	        return "SMS";
	      }
	    }
	    
	    public class PushNotification implements INotification{
	         public String notificationType()
	      {
	        return "Push Notification";
	      }
	    }
}
