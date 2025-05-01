package nobubilt.codesignal.concurrency.collections.copyonwrite;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/**
 * A CopyOnWriteArraySet works similarly to a CopyOnWriteArrayList, except 
 * it ensures no duplicate elements are stored in the collection. It's ideal 
 * when you need to store unique elements while maintaining thread safety, 
 * making it a great fit for scenarios like managing a unique set of subscribers.
 * 
 *
 */
public class CopyOnWriteArraySet {

  private Set<String> subscribers = new CopyOnWriteArraySet<>();
    
    public void addSubscriber(String subscriber) {
        subscribers.add(subscriber);
    }

    public void sendNewsletter(String message) {
        for (String subscriber : subscribers) {
            System.out.println("Sending message to " + subscriber);
        }
    }
    

    // TODO: Add a method to safely add multiple subscribers at once
    public void addSubscribers(String[] arr)
    {
       subscribers.addAll(Arrays.stream(arr).toList());
    }
    
 // TODO: Safely remove subscribers whose name starts with 'J' after iteration completes
    public void removeSubscribersWithNameStartingWithJ() {
 // TODO: Collect subscribers whose name starts with 'J' in a temporary collection
 // TODO: Remove the collected subscribers from the original list after iteration
        List<String> markedForRemoval = new CopyOnWriteArrayList<>();
        for(String phrase : subscribers)
        {
            if(phrase.startsWith("J"))
            {
                markedForRemoval.add(phrase);
            }
        }
        subscribers.removeAll(markedForRemoval);
    }

    public Set<String> getSubscribers() {
        return subscribers;
    }
    
    List<String> logList = new CopyOnWriteArrayList<>();
    // TODO: Implement method to add a log entry
    public void addLog(String log)
    {
        logList.add(log);
    }
    // TODO: Implement method to retrieve all logs
    public List<String> getLogList()
    {
        return logList;
    }
    // TODO: Implement method to clear all logs
    public void clearLogs()
    {
        logList.removeAll(logList);
    }
}

